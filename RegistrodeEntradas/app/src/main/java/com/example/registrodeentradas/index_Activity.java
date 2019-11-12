package com.example.registrodeentradas;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class index_Activity extends AppCompatActivity {

    private ImageButton boton1,boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_);

        getSupportActionBar().setTitle("Menu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        boton1 = (ImageButton) findViewById(R.id.imb_stock);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Entrada();

            }
        });

        boton2 = (ImageButton)findViewById(R.id.imb_imput);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Producto();
            }
        });




    }
    //funcion de icono de entradas de inventario
    public void Entrada (){
        Intent entrada = new Intent(this, MainActivity.class);
        startActivity(entrada);
    }
    //funcion de registrar productos
    public void Producto () {
        Intent producto = new Intent(this, RegistrarProducto.class);
        startActivity(producto);
    }
}
