package com.example.kyungwonyi.stacksalesshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginregistMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginregist_main);

        setTitle("");

        Button loginBtn = (Button) findViewById(R.id.loginBtn);
        Button registBtn = (Button) findViewById(R.id.registBtn);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                Toast toast = Toast.makeText(LoginregistMain.this, "로그인을 실패하였습니다.", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }

        });

        registBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistMain.class);
                startActivity(intent);
                Toast toast = Toast.makeText(LoginregistMain.this, "회원가입을 시작합니다.", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }

        });

    }
}
