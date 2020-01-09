package com.example.shortcuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Shortcut:長按快速捷徑 & 桌面捷徑

        // 1.新增xml檔 shortcuts
        // 2. Manifest:
        //        <meta-data
        //            android:name="android.app.shortcuts"
        //            android:resource="@xml/shortcuts" />

    }
}
