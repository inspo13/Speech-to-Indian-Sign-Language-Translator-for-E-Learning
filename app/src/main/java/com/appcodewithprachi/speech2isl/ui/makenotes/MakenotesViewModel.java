package com.appcodewithprachi.speech2isl.ui.makenotes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MakenotesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MakenotesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Make your notes here.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}