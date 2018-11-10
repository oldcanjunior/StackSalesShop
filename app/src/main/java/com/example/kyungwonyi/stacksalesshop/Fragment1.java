package com.example.kyungwonyi.stacksalesshop;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class Fragment1 extends Fragment {

    private GridView itemGridView1;
    private ArrayAdapter<String> adapter;
    private static String[] itemdata={"맥북에어", "삼성슬림","엘지가벼워","중고노트북"};

//    public static Fragment1 newInstance;
//    {
//        Fragment1 fragement1 = new Fragement1();
//
//        return fragment1;
//    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup mainscreen_container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment1, mainscreen_container, false);

        GridView itemGridView1 = (GridView) rootView.findViewById(R.id.itemGridView1);


//        itemGridView1.setAdapter(itemdata);
//        itemGridView1.setAdapter(new ArrayAdapter<String> (getActivity(),android.R.layout.mainshopitem));

        return rootView;
    }

}
