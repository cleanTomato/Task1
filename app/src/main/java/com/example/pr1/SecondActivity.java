package com.example.pr1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast toast = Toast.makeText(getApplicationContext(), "Activity_Second", Toast.LENGTH_LONG);
        toast.show();
        TextView textView = findViewById(R.id.text_id);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("transport_message"));
    }
}
