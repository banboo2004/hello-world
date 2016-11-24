package com.example.danny.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.danny.myapplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send_message(View view){
//        Toast.makeText(this, "hahahahahahah", Toast.LENGTH_SHORT).show();
        Intent m_intent = new Intent(this,DisplayMessageActivity.class);
        EditText ed = (EditText)findViewById(R.id.ed_id);
        String m_str = ed.getText().toString();
        m_intent.putExtra(EXTRA_MESSAGE,m_str);
        startActivity(m_intent);
    }
}
