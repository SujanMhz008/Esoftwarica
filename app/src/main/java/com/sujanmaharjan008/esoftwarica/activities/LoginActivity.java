package com.sujanmaharjan008.esoftwarica.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sujanmaharjan008.esoftwarica.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtUsername, edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(edtUsername.getText().toString())){
            edtUsername.setError("Enter your username");
            return;
        }
        else if(TextUtils.isEmpty(edtPassword.getText().toString())){
            edtPassword.setError("Enter your password");
            return;
        }
        if(edtUsername.getText().toString().equals("Sujan") && edtPassword.getText().toString().equals("12345")){
//            Toast.makeText(this, "KEKW", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, DashBoardActivity.class);
            startActivity(intent);
            Toast.makeText(this, "Welcome, " + edtUsername.getText().toString(), Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Login credentials incorrect", Toast.LENGTH_LONG).show();
        }

    }
}
