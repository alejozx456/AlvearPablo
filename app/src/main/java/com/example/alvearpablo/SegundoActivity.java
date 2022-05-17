package com.example.alvearpablo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {

    private EditText nombre;
    private TextView apellido;
    private TextView exponente;
    private TextView factorial;
    private EditText base;
    private Button botonAtras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        nombre=findViewById(R.id.editTextNombreSegundoActivity);
        apellido=findViewById(R.id.ApellidoSegundo);

        base=findViewById(R.id.editTextBaseSegundoActivity);
        exponente=findViewById(R.id.textViewExponenteSegundo);
        factorial=findViewById(R.id.factorialSegundo);
        botonAtras=findViewById(R.id.buttonAtrasSegundoActivity);




        nombre.setEnabled(false);
        base.setEnabled(false);

        if(!nombre.getText().toString().equals("")){
            botonAtras.setEnabled(true);
        }

        String nombre2 = getIntent().getStringExtra("nombreTercerA");
        nombre.setText(nombre2);

        String base2=getIntent().getStringExtra("baseTercerA");
        base.setText(base2);

        String exponente2=getIntent().getStringExtra("exponenteTercerA");
        exponente.setText(exponente2);

        String apellido2=getIntent().getStringExtra("apellidoTercerA");
        apellido.setText(apellido2);

        String factorial2=getIntent().getStringExtra("factorialTercerA");
        factorial.setText(factorial2);




    }

    public void siguiente2(View view){
        Intent intent=new Intent(this,TercerActivity.class);

        startActivity(intent);
    }
    public void volver(View view){
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("nombreVolver",nombre.getText().toString());
        intent.putExtra("apellidoVolver",apellido.getText().toString());
        intent.putExtra("baseVolver",base.getText().toString());
        intent.putExtra("exponenteVolver",exponente.getText().toString());
        intent.putExtra("factorialVolver",factorial.getText().toString());
        startActivity(intent);
    }
}