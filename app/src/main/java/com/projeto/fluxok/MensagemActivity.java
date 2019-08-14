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
import android.widget.TextView;


public class MensagemActivity extends AppCompatActivity implements
        View.OnClickListener {

    private Button responderButton, apagarButton, sairButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem);

        responderButton = findViewById(R.id.ResponderButton);
        responderButton.setOnClickListener(this);
        apagarButton = findViewById(R.id.ApagarButton);
        apagarButton.setOnClickListener(this);
        sairButton = findViewById(R.id.SairButton);
        sairButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view == responderButton) {
            Intent intent = new Intent(this, NovaMensagemActivity.class);
            startActivity(intent);
        }

        if (view == apagarButton) {

        }

        if (view == sairButton) {
           finish();
        }


    }
}
