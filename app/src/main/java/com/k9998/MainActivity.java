package com.k9998;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("123");
        Log.d("lhc", "sdk_int " + Build.VERSION.SDK_INT);
        TabHost tabHost = findViewById(android.R.id.tabhost);
        tabHost.setup();
        TabHost.TabContentFactory tabContentFactory = new TabHost.TabContentFactory() {
            @Override
            public View createTabContent(String tag) {
                TextView textView = new TextView(MainActivity.this);
                textView.setText(tag);
                return textView;
            }
        };
        tabHost.addTab(tabHost.newTabSpec("123").setIndicator("123").setContent(tabContentFactory));
        tabHost.addTab(tabHost.newTabSpec("456").setIndicator("456").setContent(tabContentFactory));
        tabHost.addTab(tabHost.newTabSpec("789").setIndicator("789").setContent(tabContentFactory));
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                Log.d("lhc", "tabId " + tabId);
            }
        });
    }

    public void showDialog(View view) {
        new AlertDialog.Builder(this)
                .setTitle("标题")
                .setMessage("内容")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setNeutralButton("过一会", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).show();
    }

}