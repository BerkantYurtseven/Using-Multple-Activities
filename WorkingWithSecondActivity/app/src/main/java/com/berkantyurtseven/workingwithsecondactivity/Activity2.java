package com.berkantyurtseven.workingwithsecondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        textView2 = findViewById(R.id.textView2);

        Intent intent = getIntent();
        String UserName = intent.getStringExtra("userInput");
        textView2.setText(UserName);
    }
    public void BackToHome (View view){
        Intent intent = new Intent(Activity2.this,MainActivity.class);
        startActivity(intent);
    }
}