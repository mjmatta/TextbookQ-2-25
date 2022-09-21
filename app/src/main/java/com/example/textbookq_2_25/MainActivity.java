package com.example.textbookq_2_25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText pass1, pass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        pass1 = findViewById(R.id.pass1);
        pass2 = findViewById(R.id.pass2);
    }

    public void click(View view) {
        if(pass1.getText().toString().equals(pass2.getText().toString())) {
            textView.setText("THANK YOU");
        } else {
            textView.setText("PASSWORDS MUST MATCH");
        }
    }
}