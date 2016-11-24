/*
 * Copyright (c) 2016.
 * 此应用仅用于测试与玩耍
 * 涛哥版权所有
 * TAO MAN CO.,LTD.ALL RIGHTS RESERVED
 *
 */

package com.example.danny.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textview = new TextView(this);
        textview.setTextSize(50);
        textview.setText(message);
        setContentView(textview);
    }
}
