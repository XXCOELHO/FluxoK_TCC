package com.projeto.fluxok;

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

public class MainActivity extends AppCompatActivity implements View.
        OnClickListener {

    private EditText caixaTextoNome;
    private Button botaoNovoUsuario;
    private TextView mensagem;

    //botões da tela inicial
    private Button NovoUsuarioMainButton, OkMainButton, SairMainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mensagem = findViewById(R.id.mensagem);


        //botões da tela inicial
        NovoUsuarioMainButton = findViewById(R.id.NovoUsuarioMain);
        NovoUsuarioMainButton.setOnClickListener(this);
        OkMainButton = findViewById(R.id.OkMain);
        OkMainButton.setOnClickListener(this);
        SairMainButton = findViewById(R.id.SairMain);
        SairMainButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == NovoUsuarioMainButton){
            cadastroUsuario();
            //   mensagem.setText("Olá " + caixaTextoNome.getText() + ". Bem vindo!");
        }

        if(view == SairMainButton){
           finalizarApp();
            //   mensagem.setText("Olá " + caixaTextoNome.getText() + ". Bem vindo!");
        }

        if(view == OkMainButton){
            cadastrarSenha();
            //   mensagem.setText("Olá " + caixaTextoNome.getText() + ". Bem vindo!");
        }
    }

    public void cadastroUsuario (){
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }

    public void finalizarApp (){

        finish();
        //Intent intent = new Intent(this, CronogramaActivity.class);
       // startActivity(intent);
        /*Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        this.finish();*/
    }

    public void cadastrarSenha (){
        Intent intent = new Intent(this, SenhaActivity.class);
        startActivity(intent);
    }
}