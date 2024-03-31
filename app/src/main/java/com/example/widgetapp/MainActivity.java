package com.example.widgetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    EditText editText;
    Button btn;
    TextView counterText;
    Button btnDeac;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.buttonID);
        btn = findViewById(R.id.btn);
        counterText = findViewById(R.id.counterText);
        btnDeac = findViewById(R.id.btnDeacrese);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String name  = editText.getText().toString();
                 Toast.makeText(MainActivity.this, "Hellooo " + name, Toast.LENGTH_LONG).show();
             }
         });
//        counter /
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              counterText.setText(" " + IncreaseCounter());
            }
        });
        btnDeac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterText.setText(" " +DeascreseCounter());
            }
        });
    }
    public int IncreaseCounter(){
       return ++counter;
    }
    public int DeascreseCounter(){
        return --counter;
    }
}