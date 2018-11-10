package com.example.kyungwonyi.stacksalesshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegistMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist_main);

        setTitle("");


        Button userRegistBtn = (Button) findViewById(R.id.userRegistBtn);
        Button sellerRegistBtn = (Button) findViewById(R.id.sellerRegistBtn);

        userRegistBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistUser.class);
                startActivity(intent);
                Toast toast = Toast.makeText(RegistMain.this,"일반 유저로 회원가입 합니다", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }

        });

        sellerRegistBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistSeller.class);
                startActivity(intent);
                Toast toast = Toast.makeText(RegistMain.this,"판매자로 회원가입 합니다", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }

        });

    }


}
