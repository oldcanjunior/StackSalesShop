package com.example.kyungwonyi.stacksalesshop;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class announceitemView extends LinearLayout {

    TextView textView29;
    TextView textView30;

    public announceitemView(Context context) {
        super(context);

        init(context);

    }

    public announceitemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.announce_item, this, true);


        textView29 = (TextView) findViewById(R.id.textView29);
        textView30 = (TextView) findViewById(R.id.textView30);
    }

    public void setTitle(String title) {
        textView29.setText(title);

    }

    public void setContent(String content) {
        textView30.setText(content);
    }



}
