package com.example.gasolinaoualcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private EditText precoAlcool;
        private EditText precoGasolina;
        private Button botaoVerificar;
        private TextView textoResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.precoAlcoolid);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaid);
        botaoVerificar = (Button) findViewById(R.id.botaVerificarid);
        textoResultado = (TextView) findViewById(R.id.textoRersultadoid);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoPrecoalcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();
                Double valorAlcool = Double.parseDouble(textoPrecoalcool);
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                Double resultado = valorAlcool / valorGasolina;

                if (resultado >= 0.7){
                    textoResultado.setText("É melhor usar alcool");

                }else{
                    textoResultado.setText("É melhor usar gasolina");

                }


            }
        });
    }
}
