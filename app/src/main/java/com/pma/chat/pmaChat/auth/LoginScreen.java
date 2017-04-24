package com.pma.chat.pmaChat.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pma.chat.pmaChat.R;

/**
 * Created by Bojan on 4/23/2017.
 */

public class LoginScreen extends Activity{

    EditText username;
    EditText password;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        btnSignUp = (Button)findViewById(R.id.signupBtn);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),SignupScreen.class);
                startActivity(i);
            }
        });

    }
}