package com.example.alvearpablo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TercerActivity extends AppCompatActivity {

    private EditText nombre;
    private  EditText apellido;
    private  EditText base;
    private  EditText exponente;
    private  EditText factorial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);

        nombre=findViewById(R.id.nombreTercero);
        apellido=findViewById(R.id.ApellidoTercero);
        base=findViewById(R.id.baseTercero);
        exponente=findViewById(R.id.exponenteTercero);
        factorial=findViewById(R.id.factorialTercero);
    }
    public void volverTercerA(View view){
        Intent intent=new Intent(this,SegundoActivity.class);
        intent.putExtra("nombreTercerA",nombre.getText().toString());
        intent.putExtra("apellidoTercerA",apellido.getText().toString());
        intent.putExtra("baseTercerA",base.getText().toString());
        intent.putExtra("exponenteTercerA",exponente.getText().toString());
        intent.putExtra("factorialTercerA",factorial.getText().toString());
        startActivity(intent);
    }
}