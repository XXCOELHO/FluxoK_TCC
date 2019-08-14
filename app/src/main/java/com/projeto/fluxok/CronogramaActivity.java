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

public class CronogramaActivity extends AppCompatActivity implements View.
        OnClickListener {

    private Button inicioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cronograma);

        inicioButton = findViewById(R.id.InicioButton);
        inicioButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == inicioButton) {
            telaFluxo();
            //   mensagem.setText("Olá " + caixaTextoNome.getText() + ". Bem vindo!");
        }

    }
    public void telaFluxo() {
        Intent intent = new Intent(this, FluxoActivity.class);
        startActivity(intent);
    }
}