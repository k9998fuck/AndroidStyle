package com.k9998;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
    }

    public void showDialog(View view){
        new AlertDialog.Builder(this)
                .setTitle("setTitle").setMessage("setMessage").setPositiveButton("确定", new DialogInterface.OnClickListener() {
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
//        Dialog dialog = new Dialog(this);
//        dialog.setTitle(R.string.app_name);
//        TextView textView = new TextView(this);textView.setText("123");
//        dialog.setContentView(textView);
//        dialog.show();
    }

}