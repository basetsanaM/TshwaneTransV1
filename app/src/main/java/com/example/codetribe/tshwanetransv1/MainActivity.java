package com.example.codetribe.tshwanetransv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mEmailField;
    private EditText mPasswordField;

    private Button mLoginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEmailField=(EditText) findViewById(R.id.emailField);
        mPasswordField=(EditText) findViewById(R.id.passwordField);

        mLoginButton=(Button) findViewById(R.id.loginBtn);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}
