package com.example.kyungwonyi.stacksalesshop;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class write_qna extends Fragment {


    qna_wall qna_wall = new qna_wall();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup write_qna, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.write_qna, write_qna, false);


        Button writecancelBtn = (Button) rootView.findViewById(R.id.writecancelBtn);
        Button writedoneBtn = (Button) rootView.findViewById(R.id.writedoneBtn);


        //글 작성 완료 버튼
        writedoneBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.mainscreen_container, qna_wall).commit();
            }

        });


        //글 작성 취소 버튼
        writecancelBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.mainscreen_container, qna_wall).commit();
            }

        });


        return rootView;
    }
}
