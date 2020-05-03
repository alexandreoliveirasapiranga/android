package com.example.idadedecachorro;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = (EditText) findViewById(R.id.caixaTextoId);
        botaoIdade = (Button) findViewById(R.id.botaoIdadeid);
        resultadoIdade = (TextView) findViewById(R.id.resultadoIdadeid);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Recuperar o que foi de digitado
                String textoDigitado = caixaTexto.getText().toString();

                if(textoDigitado.isEmpty()){
                    resultadoIdade.setText("Nenhum número digitado");
                }
                else {
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int valorResultadoFinal = valorDigitado * 7;
                    resultadoIdade.setText("A idade do cachoro em anos humano é : " + valorResultadoFinal + " anos");

                }

            }
        });

    }
}
