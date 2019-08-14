package com.projeto.fluxok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class NovaMensagemActivity extends AppCompatActivity   implements
        View.OnClickListener {

    private Button limparButton, enviarButton, sairButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_mensagem);

        limparButton = findViewById(R.id.LimparButton);
        limparButton.setOnClickListener(this);
        enviarButton = findViewById(R.id.EnviarButton);
        enviarButton.setOnClickListener(this);
        sairButton = findViewById(R.id.SairButton);
        sairButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view == limparButton) {

        }

        if (view == enviarButton) {

        }

        if (view == sairButton) {
            Intent intent = new Intent(this, MensagensActivity.class);
            startActivity(intent);
        }


    }

}
