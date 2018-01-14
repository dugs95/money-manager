package com.example.d0g00js.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button signUp, logIn, cancel;
    EditText userId, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            logIn = (Button) findViewById(R.id.login);
            signUp = (Button) findViewById(R.id.cancel);
            userId = (EditText) findViewById(R.id.userId);
            password = (EditText) findViewById(R.id.password);
            cancel = (Button) findViewById(R.id.signup);
            signUp.setOnClickListener(clickListener);
            logIn.setOnClickListener(clickListener);
            cancel.setOnClickListener(clickListener);
        } catch (Exception e) {
            // do something
        }

    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String userInput=userId.getText().toString();
            String passwordInput = password.getText().toString();
            switch (v.getId()) {
                case R.id.login:
                    // search userInput and passwordInput in Db if matches move to the next page
                    //If not then display message that the user details are incorrect or not a user so try signing up
                    break;
                case R.id.signup:
                    // store the input in the db and move to take next details
                    break;
                case R.id.cancel:
                    finish();
                    break;
                default:
                    //
            }
        }

    };
}

