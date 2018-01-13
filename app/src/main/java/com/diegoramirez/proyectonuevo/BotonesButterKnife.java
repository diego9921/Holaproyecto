package com.diegoramirez.proyectonuevo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by usuario on 13/01/2018.
 */

public class BotonesButterKnife extends AppCompatActivity {

    @BindView(R.id.image)
    ImageView image;
    @BindView(R.id.et_ingress)
    EditText etIngress;
    @BindView(R.id.et_pass)
    EditText etPass;
    @BindView(R.id.btn_ingresa)
    Button btnIngresa;
    @BindView(R.id.btn_facebook)
    Button btnFacebook;
    @BindView(R.id.tv_text)
    TextView tvText;
    @BindView(R.id.btn_register)
    Button btnRegister;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.btn_ingresa, R.id.btn_facebook, R.id.btn_register})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_ingresa:
                tvText.setText("Ingresasteeeeeeee");
                break;
            case R.id.btn_facebook:
                tvText.setText("No dispone de conexion");
                break;
            case R.id.btn_register:
                tvText.setText("Registrado");
                break;
        }
    }
}
