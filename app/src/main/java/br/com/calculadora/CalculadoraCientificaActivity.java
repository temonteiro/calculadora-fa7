package br.com.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Thalita Monteiro on 16/11/2016.
 */

public class CalculadoraCientificaActivity extends AppCompatActivity {

    //Campos do layout
    EditText num1, num2, result;
    Button btExponencial, btLogaritmo, btRaiz, btSeno, btCosseno, btTangente;

    //Vars da classe para o calculo
    double n1, n2, resultado;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_cientifica);

        //Pegando os valores do usuário
        num1    = (EditText) findViewById(R.id.num1);
        num2    = (EditText) findViewById(R.id.num2);
        result  = (EditText) findViewById(R.id.result);

        btExponencial   = (Button)   findViewById(R.id.btExponencial);
        btLogaritmo     = (Button)   findViewById(R.id.btLogaritmo);
        btRaiz          = (Button)   findViewById(R.id.btRaiz);
        btSeno          = (Button)   findViewById(R.id.btSeno);
        btCosseno       = (Button)   findViewById(R.id.btCosseno);
        btTangente      = (Button)   findViewById(R.id.btTangente);

        //BOTÃO SOMAR
        btExponencial.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());

                resultado = Math.pow(n1,n2);

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

        //BOTÃO SUBTRAIR
        btLogaritmo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());

                resultado = Math.log(n1);

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

        //BOTÃO DIVIDIR
        btRaiz.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());

                resultado = Math.sqrt(n1);

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

        //BOTÃO MULTIPLICAR
        btSeno.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                double rad = (Math.PI/180) * n1;

                resultado = Math.sin(rad);

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

        btCosseno.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                double rad = (Math.PI/180) * n1;

                resultado = Math.cos(rad);

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

        btTangente.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                double rad = (Math.PI/180) * n1;

                resultado = Math.tan(rad);

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });
    }
}
