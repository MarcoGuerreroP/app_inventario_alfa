package com.example.registrodeentradas;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity {

    EditText barcode;
    ImageButton lector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barcode = (EditText) findViewById(R.id.edt_cod);
        lector = (ImageButton) findViewById(R.id.btimg_cam);

        //ACCION PARA EL BOTON DE ESCANER
        lector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escaner();
            }
        });
    }
    //Regresar al menu principal
    public void Menu(View view){
        Intent menu = new Intent(this, index_Activity.class);
        startActivity(menu);
    }

    /**
     *ESTA ES LA FUNCION DE CLICK PARA EL LECTOR DE CODIGO DE BARRAS
     */

    public void escaner() {
        IntentIntegrator intent = new IntentIntegrator(this);
        intent.setDesiredBarcodeFormats(IntentIntegrator.PRODUCT_CODE_TYPES);

        intent.setPrompt("Escanear Codigo");
        intent.setCameraId(0);
        intent.setBeepEnabled(false);
        intent.setBarcodeImageEnabled(false);
        intent.initiateScan();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);

        if (result != null) {

            if (result.getContents() == null) {
                Toast.makeText(this, "Cacelaste el escaneo", Toast.LENGTH_LONG).show();

            } else {
                barcode.setText(result.getContents().toString());
            }

        } else {
                    super.onActivityResult(requestCode, resultCode, data);
        }
    }

    /**
     * AQUI TERMINA EL METODO DE CODIGO DE BARRAS
     */




}


