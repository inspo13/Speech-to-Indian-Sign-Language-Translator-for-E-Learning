package com.appcodewithprachi.speech2isl;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import static android.app.Activity.RESULT_OK;


public class ConverterrFragment extends Fragment {
    //ImageButton speechButton;
    EditText speechText;
    private static final int RECOGNIZER_RESULT = 1;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ConverterrFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ConverterrFragment.
     */

    public static ConverterrFragment newInstance(String param1, String param2) {
        ConverterrFragment fragment = new ConverterrFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    //@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                        Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_converterr, container, false);
        final VideoView signlangvideo = root.findViewById(R.id.signlanguageview);
        signlangvideo.setMediaController(new MediaController(getContext()));
        Uri video = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + R.raw.onetoninesignlangvideo);
        signlangvideo.setVideoURI(video);
        //signlangvideo.start();
        // Inflate the layout for this fragment

        ImageButton speechButton = (ImageButton) root.findViewById(R.id.imageButtonspeech);
        EditText speechText = (EditText) root.findViewById(R.id.text);
        speechButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent speechIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                speechIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                speechIntent.putExtra(RecognizerIntent.EXTRA_PROMPT,"Speech to ISL");
                startActivityForResult(speechIntent, RECOGNIZER_RESULT);
            }

        });
        return root;
    }
    // from here the text will be transfered to a deep learning model which translate text to Indian sign language
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == RECOGNIZER_RESULT && resultCode == RESULT_OK) {
            ArrayList<String> matches = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            speechText.setText(matches.get(0).toString());
        }
        super.onActivityResult(requestCode, resultCode, data);
    }


}
