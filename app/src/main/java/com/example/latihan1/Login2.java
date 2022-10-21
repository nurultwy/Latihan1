package com.example.latihan1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login2 extends AppCompatActivity {
    EditText txtUsername, txtPassword;
    Button btnLogin;
    TextView tvDaftar;
    String username = "12345";
    String password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvDaftar = findViewById(R.id.tvDaftar);

        btnLogin.setOnClickListener(view -> {
            String user = txtUsername.getText().toString();
            String pass = txtPassword.getText().toString();

            if((user.equals(username)) && (pass.equals(password))){
                Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            } else{
                Toast.makeText(this, "Login Gagal", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
