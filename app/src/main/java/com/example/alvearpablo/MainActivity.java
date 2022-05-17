package com.example.alvearpablo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private EditText apellido;
    private EditText base;
    private EditText exponente;
    private EditText factorial;
    private EditText potencia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=findViewById(R.id.editTextNombrePrimerActivity);
        apellido=findViewById(R.id.editTextApellidoPrimerActivity);
        base=findViewById(R.id.editTextBasePrimerActivity);
        exponente=findViewById(R.id.editTextExponentePrimerActivity);
        factorial=findViewById(R.id.edittTextFactorialPrimerActivity);
        potencia=findViewById(R.id.editTextPotenciaPrimerActivity);

        nombre.setEnabled(false);
        apellido.setEnabled(false);
        base.setEnabled(false);
        exponente.setEnabled(false);
        factorial.setEnabled(false);
        potencia.setEnabled(false);

        String nombre2 = getIntent().getStringExtra("nombreTercerA");
        nombre.setText(nombre2);

        String apellido2 = getIntent().getStringExtra("apellidoTercerA");
        apellido.setText(apellido2);

        String base2 = getIntent().getStringExtra("baseTercerA");
        base.setText(base2);

        String exponente2 = getIntent().getStringExtra("exponenteTercerA");
        exponente.setText(exponente2);


    }
    public void siguiente(View view){
        Intent intent=new Intent(this,SegundoActivity.class);
        startActivity(intent);
    }
}