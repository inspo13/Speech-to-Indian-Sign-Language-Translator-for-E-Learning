package com.appcodewithprachi.speech2isl;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button login;
    EditText et;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = findViewById(R.id.submit);
        et = findViewById(R.id.name);
        login = (Button) findViewById(R.id.submit);

        sp = getSharedPreferences("login",MODE_PRIVATE);

        if(sp.getBoolean("logged",false)){
            goToTabbedActivity();
        }

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTabbedActivity();
                sp.edit().putBoolean("logged",true).apply();

            }
        });

    }

    public void goToTabbedActivity(){
        Intent i = new Intent(this,TabbedActivity.class);
        startActivity(i);
        finish();
    }

}
