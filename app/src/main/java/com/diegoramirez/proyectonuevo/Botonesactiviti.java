package com.diegoramirez.proyectonuevo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by usuario on 13/01/2018.
 */

public class Botonesactiviti extends AppCompatActivity {

    TextView tvText;
    Button btnRegister;
    Button btnFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvText=findViewById(R.id.tv_text);
        btnRegister=findViewById(R.id.btn_register);
        btnFacebook=findViewById(R.id.btn_facebook);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvText.setText("NUEVO REGISTRO");



            }
        });

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvText.setText("INGRESO CON FACEBOOK");
            }
        });
    }

}
