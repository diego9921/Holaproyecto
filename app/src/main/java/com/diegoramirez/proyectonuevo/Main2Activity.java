package com.diegoramirez.proyectonuevo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {


    String vacio;
    @BindView(R.id.tv_vacio)
    TextView tvVacio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiti2);
        ButterKnife.bind(this);
        vacio = getIntent().getExtras().getString("nombre");
        tvVacio.setText(vacio);
    }
}
