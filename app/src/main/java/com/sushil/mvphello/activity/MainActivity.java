package com.sushil.mvphello.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.sushil.mvphello.R;
import com.sushil.mvphello.model.PrasenterImpl;
import com.sushil.mvphello.prasenter.LoginPrasenter;
import com.sushil.mvphello.view.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView {


    EditText etUserName, etPassword;
    TextView tvLogin;

    LoginPrasenter mLoginPrasenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        etUserName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etUserPassword);
        tvLogin = findViewById(R.id.txtLogin);


        mLoginPrasenter = new PrasenterImpl(MainActivity.this);


        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = etUserName.getText().toString();
                String passwrod = etPassword.getText().toString();
                mLoginPrasenter.performLogin(userName, passwrod);


            }
        });

    }


    @Override
    public void loginValidations() {


        Toast.makeText(getApplicationContext(), "Please enter user name and password", Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(getApplicationContext(), "Login success", Toast.LENGTH_LONG).show();

    }

    @Override
    public void loginError() {

        Toast.makeText(getApplicationContext(), "Login faild", Toast.LENGTH_LONG).show();

    }
}
