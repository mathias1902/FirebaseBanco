package com.example.opet.firebasebanco;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by opet on 27/08/2018.
 */

public class TelaLogin extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private EditText email;
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_tela);

        mAuth = FirebaseAuth.getInstance();
        email = findViewById(R.id.email);
        senha = findViewById(R.id.senha);
    }

    public void logar (View view){

        String sEmail = email.getText().toString();
        String sSenha = senha.getText().toString();

        mAuth.signInWithEmailAndPassword(sEmail, sSenha)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(TelaLogin.this, "Sucesso", Toast.LENGTH_SHORT).show();

                            Intent telaWelcome = new Intent(TelaLogin.this, TelaWelcome.class);
                            startActivity(telaWelcome);
                        }
                        else{
                            Toast.makeText(TelaLogin.this, "Falha", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
