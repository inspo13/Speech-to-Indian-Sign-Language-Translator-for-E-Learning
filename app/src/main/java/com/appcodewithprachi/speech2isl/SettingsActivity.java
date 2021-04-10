package com.appcodewithprachi.speech2isl;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity/*<Logout>*/ extends AppCompatActivity {
    /*GoogleSignInClient mGoogleSignInClient;
    Button Logout;

    private void signOut() {
        mGoogleSignInClient.signOut()
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(SettingsActivity.this,"Signed Out Successfully!",Toast.LENGTH_LONG).show();
                        finish();

                    }
                });*/
    //}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        /*Logout = findViewById(R.id.logoutbutton);
        Logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    // ...
                    case R.id.logoutbutton:
                        signOut();
                        break;
                    // ...
                }
            }

        });
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

    }*/
    }
}
