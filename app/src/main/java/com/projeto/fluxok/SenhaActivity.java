package com.projeto.fluxok;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class SenhaActivity extends AppCompatActivity implements View.
        OnClickListener {

    private Button confirmarButton, cancelarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senha);

        cancelarButton = findViewById(R.id.CancelarButton);
        cancelarButton.setOnClickListener(this);

        confirmarButton = findViewById(R.id.ConfirmarButton);
        confirmarButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

       if (view == cancelarButton) {
            funcaoCancelar();
        }

        if (view == confirmarButton) {
            projetos();
        }
    }

    public void funcaoCancelar() {

        finish();
    }

    public void projetos (){
        Intent intent = new Intent(this, ProjetosActivity.class);
        startActivity(intent);
    }


}