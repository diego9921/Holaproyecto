package com.diegoramirez.proyectonuevo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView tvText;
    Button btnRegister;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvText=findViewById(R.id.tv_text);
        btnRegister=findViewById(R.id.btn_register);


        btnRegister.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        tvText.setText("REGISTER");




    }
}
