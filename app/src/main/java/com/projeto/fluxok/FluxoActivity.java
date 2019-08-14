package com.projeto.fluxok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.support.v4.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FluxoActivity extends AppCompatActivity implements View.
        OnClickListener {

    private Button editar1Button, cronogramaButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fluxo);

        editar1Button = findViewById(R.id.Editar1Button);
        editar1Button.setOnClickListener(this);

    cronogramaButton = findViewById(R.id.CronogramaButton);
        cronogramaButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == editar1Button) {
            telaEtapa();

        }

        if (view == cronogramaButton) {
            telaCronograma();

        }

    }
        public void voltar() {
finish();
        }

        public void telaCronograma() {
            Intent intent = new Intent(this, CronogramaActivity.class);
            startActivity(intent);
        }

    public void telaEtapa() {
        Intent intent = new Intent(this, EtapaActivity.class);
        startActivity(intent);
    }


}