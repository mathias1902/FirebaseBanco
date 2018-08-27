package com.example.opet.firebasebanco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private ProgressBar pbSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pbSalvar = findViewById(R.id.pbSalvar);
    }

    public void salvarCarro(View view){
        Carro c = new Carro("Audi","A4",2018);

        FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
        DatabaseReference mRef = mDatabase.getReference("carros");

        pbSalvar.setVisibility(ProgressBar.VISIBLE);

        mRef.setValue(c);

        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Toast.makeText(MainActivity.this, "Carro salvo!", Toast.LENGTH_SHORT).show();
                pbSalvar.setVisibility(ProgressBar.GONE);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(MainActivity.this, "Erro ao salvar.", Toast.LENGTH_SHORT).show();
                pbSalvar.setVisibility(ProgressBar.GONE);
            }
        });
    }

    public void telaLogin(View view){

        Intent intent = new Intent(this, TelaLogin.class);
        startActivity(intent);
    }

}
