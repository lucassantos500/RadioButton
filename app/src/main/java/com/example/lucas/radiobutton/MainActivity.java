package com.example.lucas.radiobutton;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

    private RadioGroup radio;
    private RadioButton radioButtonEscolhido;
    private Button botaoEscolher;
    private TextView textoExibiçao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio = (RadioGroup) findViewById(R.id.radioGroup_id);
        botaoEscolher = (Button) findViewById(R.id.BotaoEscolher_id);
        textoExibiçao = (TextView) findViewById(R.id.Imprimir_id);

        botaoEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idRadioButtonEscolhido;
                idRadioButtonEscolhido = radio.getCheckedRadioButtonId();
                if(idRadioButtonEscolhido > 0){
                    radioButtonEscolhido = (RadioButton) findViewById(idRadioButtonEscolhido);
                    textoExibiçao.setText(radioButtonEscolhido.getText());
                }else{
                    textoExibiçao.setText("Escolha algo!");
                }
            }
        });

    }
}
