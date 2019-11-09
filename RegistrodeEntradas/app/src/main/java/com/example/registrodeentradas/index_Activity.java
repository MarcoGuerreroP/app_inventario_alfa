package com.example.registrodeentradas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class index_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_);

    }
    //funcion de icono de entradas de inventario
    public void Imput (View view){
        Intent imput = new Intent(this, MainActivity.class);
        startActivity(imput);
    }
    //funcion de registrar productos
    public void Producto (View view) {
        Intent producto = new Intent(this, MainActivity.class);
        startActivity(producto);
    }
}
