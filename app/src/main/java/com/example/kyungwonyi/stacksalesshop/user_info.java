package com.example.kyungwonyi.stacksalesshop;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class user_info extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup user_info, @Nullable Bundle savedInstanceState) {
        final ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.user_info, user_info, false);


        Button edit1 = (Button) rootView.findViewById(R.id.edit1);
        Button edit2 = (Button) rootView.findViewById(R.id.edit2);
        Button edit3 = (Button) rootView.findViewById(R.id.edit3);
        Button edit4 = (Button) rootView.findViewById(R.id.edit4);

        edit1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getContext(),"비밀번호가 변경되었습니다", Toast.LENGTH_SHORT);
                toast.show();


            }

        });

        edit2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getContext(),"주소가 변경되었습니다", Toast.LENGTH_SHORT);
                toast.show();
            }

        });

        edit3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast toast = Toast.makeText(getContext(),"전화번호가 변경되었습니다", Toast.LENGTH_SHORT);
                toast.show();

            }

        });

        edit4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                                            //getActivity(),getContext()
                Toast toast = Toast.makeText(getActivity(),"이메일이 변경되었습니다", Toast.LENGTH_SHORT);
                toast.show();

            }

        });

        return rootView;
    }
}
