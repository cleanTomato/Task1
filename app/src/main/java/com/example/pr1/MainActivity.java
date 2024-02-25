package com.example.pr1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(), "Activity_Main", Toast.LENGTH_LONG);
        toast.show();
    }

    public void Button_Listener(View obj){
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editText = findViewById(R.id.edit_text_1);
        String message = editText.getText().toString();
        intent.putExtra("transport_message", message);
        startActivity(intent);
    }

}