package com.berkantyurtseven.workingwithsecondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    protected EditText editText;
    String userName ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        userName = "";

    }
    public void ChangeScreen (View view){
        userName = editText.getText().toString();

        Intent intent = new Intent(MainActivity.this, Activity2.class);

        intent.putExtra("userInput", userName);

        startActivity(intent);


    }
}