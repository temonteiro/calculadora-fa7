package br.com.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaInicialActivity extends AppCompatActivity {

    Button tradicional;
    Button cientifica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        tradicional = (Button) findViewById(R.id.btTradicional);
        cientifica = (Button) findViewById(R.id.btCientifica);

        tradicional.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent tradicionalIntent = new Intent(TelaInicialActivity.this, CalculadoraTradicionalActivity.class);
                        startActivity(tradicionalIntent);
                    }
                }
        );

        cientifica.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent cientificaIntent = new Intent(TelaInicialActivity.this, CalculadoraCientificaActivity.class);
                        startActivity(cientificaIntent);
                    }
                }
        );
    }
}
