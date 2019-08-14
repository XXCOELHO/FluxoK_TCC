package com.projeto.fluxok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MensagensActivity extends AppCompatActivity  implements
        View.OnClickListener {

    private Button escreverButton, inicioButton;
    TextView t20 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagens);

        escreverButton = findViewById(R.id.EscreverButton);
        escreverButton.setOnClickListener(this);
        inicioButton = findViewById(R.id.InicioButton);
        inicioButton.setOnClickListener(this);

        t20 = (TextView)findViewById(R.id.TextView20);
        t20.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view == escreverButton) {
            Intent intent = new Intent(this, NovaMensagemActivity.class);
            startActivity(intent);
        }

        if (view == inicioButton) {
            Intent intent = new Intent(this, ProjetosActivity.class);
            startActivity(intent);
        }

        if (view == t20) {
            Intent intent = new Intent(this, MensagemActivity.class);
            startActivity(intent);
        }


    }
}
