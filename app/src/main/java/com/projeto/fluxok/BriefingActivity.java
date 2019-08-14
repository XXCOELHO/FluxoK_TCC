package com.projeto.fluxok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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



public class BriefingActivity extends AppCompatActivity implements
        View.OnClickListener {

    private Button limparButton, salvarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_briefing);

        limparButton = findViewById(R.id.LimparButton);
        limparButton.setOnClickListener(this);
        salvarButton = findViewById(R.id.SalvarButton);
        salvarButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view == limparButton) {

        }

        if (view == salvarButton) {
            Intent intent = new Intent(this, ProjetosActivity.class);
            startActivity(intent);
        }
}}
