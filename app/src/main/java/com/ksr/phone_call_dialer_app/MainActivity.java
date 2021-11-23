package com.ksr.phone_call_dialer_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textNumber;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnStar,btn0,btnHash,btnCall;
    ImageButton btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClear = findViewById(R.id.btnClear);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnStar = findViewById(R.id.btnStar);
        btn0 = findViewById(R.id.btn0);
        btnHash = findViewById(R.id.btnHash);
        btnCall = findViewById(R.id.btnCall);


    }
}