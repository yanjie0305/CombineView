package com.example.timeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.timeview.view.TimeView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private ArrayList<Info> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        initData();
        lv.setAdapter(new MyAdapter());
    }

    private void initData() {
        dataList = new ArrayList<>();
        dataList.add(new Info("我是标题1","10.18","我是描述1"));
        dataList.add(new Info("我是标题2","10.19","我是描述2"));
        dataList.add(new Info("我是标题3","10.20","我是描述3"));
        dataList.add(new Info("我是标题4","10.21","我是描述4"));
        dataList.add(new Info("我是标题5","10.22","我是描述5"));
        dataList.add(new Info("我是标题6","10.30","我是描述6"));
        dataList.add(new Info("我是标题7","10.23","我是描述7"));
        dataList.add(new Info("我是标题8","10.24","我是描述8"));
        dataList.add(new Info("我是标题9","10.25","我是描述9"));
        dataList.add(new Info("我是标题10","10.26","我是描述10"));
        dataList.add(new Info("我是标题11","10.27","我是描述11"));
        dataList.add(new Info("我是标题12","10.28","我是描述12"));
        dataList.add(new Info("我是标题13","10.29","我是描述13"));
        dataList.add(new Info("我是标题14","10.17","我是描述14"));
        dataList.add(new Info("我是标题15","10.16","我是描述15"));

    }
    class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return dataList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = View.inflate(MainActivity.this, R.layout.item, null);
            TextView tv_time = (TextView) view.findViewById(R.id.tv_time);
            TextView tv_title = (TextView) view.findViewById(R.id.tv_title);
            TimeView timeView = (TimeView) view.findViewById(R.id.timeView);
            tv_title.setText(dataList.get(position).getTitle());
            tv_time.setText(dataList.get(position).getDes());
            timeView.setText(dataList.get(position).getTime());
            return view;
        }
    }
}
