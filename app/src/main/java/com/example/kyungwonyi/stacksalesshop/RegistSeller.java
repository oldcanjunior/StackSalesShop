package com.example.kyungwonyi.stacksalesshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegistSeller extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist_seller);

        setTitle("");

        Button registCon = (Button) findViewById(R.id.registCon);
        Button cancelBtn = (Button) findViewById(R.id.cancelBtn);


        registCon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistLaw.class);
                startActivity(intent);
                Toast toast = Toast.makeText(RegistSeller.this,"개인정보 취급 동의서", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }

        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginregistMain.class);
                startActivity(intent);
                Toast toast = Toast.makeText(RegistSeller.this,"취소되었습니다", Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }

        });

    }


}
