package com.example.kyungwonyi.stacksalesshop;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class qna_wall extends Fragment {


    write_qna write_qna = new write_qna();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup qna_wall, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.qna_wall, qna_wall, false);



        Button writewallBtn = (Button) rootView.findViewById(R.id.writewallBtn);


        writewallBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.mainscreen_container, write_qna).commit();
            }

        });


        return rootView;
    }
}
