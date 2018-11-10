package com.example.kyungwonyi.stacksalesshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegistLaw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist_law);

        setTitle("");


        Button agreeBtn = (Button) findViewById(R.id.agreeBtn);
        Button button7 = (Button) findViewById(R.id.button7);


        agreeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginregistMain.class);
                startActivity(intent);
                Toast toast = Toast.makeText(RegistLaw.this,"회원가입 신청이 완료되었습니다", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }

        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginregistMain.class);
                startActivity(intent);
                Toast toast = Toast.makeText(RegistLaw.this,"취소 되었습니다", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }

        });


    }


}