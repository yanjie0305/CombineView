package com.example.combineview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.combineview.R;

/**
 * Created by ${郭艳杰} on 2017/1/9.
 */

public class CombineView extends FrameLayout implements View.OnClickListener {

    private TextView tv_text;
    private CheckBox cb_check;
    private String text;
    private boolean ischecked;

    public CombineView(Context context) {
        super(context);
        init();
    }

    public CombineView(Context context, AttributeSet attrs) {
        super(context, attrs);
       text = attrs.getAttributeValue("http://schemas.android.com/apk/res-auto","text");
        ischecked = attrs.getAttributeBooleanValue("http://schemas.android.com/apk/res-auto","ischecked",false);
        init();
    }

    public CombineView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        View view = View.inflate(getContext(), R.layout.combine_layout, null);
        this.addView(view);
        tv_text = (TextView) view.findViewById(R.id.tv_text);
        cb_check = (CheckBox) view.findViewById(R.id.cb_check);

        tv_text.setText(text);
        cb_check.setChecked(ischecked);
        this.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        cb_check.setChecked(!cb_check.isChecked());
    }
    public boolean isChecked(){
        return cb_check.isChecked();
    }
    public void setText(String text){
      tv_text.setText(text);
    }
}
