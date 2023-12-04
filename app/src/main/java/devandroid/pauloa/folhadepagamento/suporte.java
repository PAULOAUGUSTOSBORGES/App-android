package devandroid.pauloa.folhadepagamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class suporte extends AppCompatActivity {
    private Button voltar;//Variavel para instanciar o botão voltar
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suporte);//chamando o xml do layout

        voltar = findViewById(R.id.voltar);//colocando o botão voltar na variavel voltar

        voltar.setOnClickListener(View ->{//codigo para ao clicar no botao voltar ele chame a tela menu.class
            startActivities(new Intent[]{new Intent(this, menu.class)});
        });
    }
}