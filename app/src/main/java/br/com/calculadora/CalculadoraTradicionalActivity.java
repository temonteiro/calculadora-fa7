package br.com.calculadora;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Thalita Monteiro on 16/11/2016.
 */
public class CalculadoraTradicionalActivity extends AppCompatActivity {

    //Campos do layout
    EditText num1, num2, result;
    Button btSomar, btSubtrair, btDividir, btMultiplicar;

    //Vars da classe para o calculo
    double n1, n2, resultado;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_tradicional);

        //Pegando os valores do usuário
        num1    = (EditText) findViewById(R.id.num1);
        num2    = (EditText) findViewById(R.id.num2);
        result  = (EditText) findViewById(R.id.result);

        btSomar       = (Button)   findViewById(R.id.btSomar);
        btSubtrair    = (Button)   findViewById(R.id.btSubtrair);
        btDividir     = (Button)   findViewById(R.id.btDividir);
        btMultiplicar = (Button)   findViewById(R.id.btMultiplicar);

        //BOTÃO SOMAR
        btSomar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1+n2;

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

        //BOTÃO SUBTRAIR
        btSubtrair.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1-n2;

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

        //BOTÃO DIVIDIR
        btDividir.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1/n2;

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

        //BOTÃO MULTIPLICAR
        btMultiplicar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1*n2;

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

    }
}
