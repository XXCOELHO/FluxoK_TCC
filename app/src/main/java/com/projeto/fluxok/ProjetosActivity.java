package com.projeto.fluxok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProjetosActivity extends AppCompatActivity implements
        View.OnClickListener {

    private Button sairButton, mensagensButton, novoButton;
    TextView projeto1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projetos);

        sairButton = findViewById(R.id.SairButton);
        sairButton.setOnClickListener(this);

        mensagensButton = findViewById(R.id.MensagensButton);
        mensagensButton.setOnClickListener(this);

        novoButton = findViewById(R.id.NovoButton);
        novoButton.setOnClickListener(this);

        projeto1 = (TextView)findViewById(R.id.Projeto1);
        projeto1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view == sairButton) {
            cancelar();
        }

        if (view == mensagensButton) {
            Intent intent = new Intent(this, MensagensActivity.class);
            startActivity(intent);
        }

        if (view == projeto1) {
            Intent intent = new Intent(this, FluxoActivity.class);
            startActivity(intent);
        }

        if (view == novoButton) {
            Intent intent = new Intent(this, BriefingActivity.class);
            startActivity(intent);
        }

    }

    public void cancelar() {


        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}
