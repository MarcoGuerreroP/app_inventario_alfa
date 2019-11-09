package com.example.registrodeentradas;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrarProducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_producto);
    }

    public void Menu2(View view) {
        Intent menu2 = new Intent(this, index_Activity.class);
        startActivity(menu2);
    }

}
