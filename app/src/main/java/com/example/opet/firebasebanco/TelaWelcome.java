package com.example.opet.firebasebanco;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by opet on 27/08/2018.
 */

public class TelaWelcome extends AppCompatActivity {

    private EditText nome;
    private EditText dataNascimento;
    private Spinner spinnerGrad;
    private EditText idioma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_tela);

        nome = findViewById(R.id.nome);
        dataNascimento = findViewById(R.id.dataNascimento);
        spinnerGrad = findViewById(R.id.spinnerGrad);
        idioma = findViewById(R.id.idioma);
    }
}
