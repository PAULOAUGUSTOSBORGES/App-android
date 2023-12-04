package devandroid.pauloa.folhadepagamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class menu extends AppCompatActivity {
    private Button assistenteDeHoras;//Variavel para instanciar o botão assistentedehoras
    private Button EmissorDeHolarites;//Variavel para instanciar o botao EmissorDeHolarites
    private Button suporte;//Variavel para instanciar o botao suporte
    private Button voltar;//Variavel para instanciar o botao voltar
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);//chamando o xml do layout

        assistenteDeHoras = findViewById(R.id.AssistenteDeHoras);//colocando o botão assistenteDeHoras na variavel assistenteDeHoras
        EmissorDeHolarites = findViewById(R.id.EmissorDeHolarites);//colocando o botão EmissorDeHolarites na variavel EmissorDeHolarites
        suporte = findViewById(R.id.suporte);//colocando o botão suporte na variavel suporte
        voltar = findViewById(R.id.voltar);//colocando o botão voltar na variavel voltar


        assistenteDeHoras.setOnClickListener(View ->{//codigo para ao clicar no botao assistenteDeHoras ele chame a tela assistenteDeHoras.class
            startActivities(new Intent[]{new Intent(this, AssistenteDeHoras.class)});
        });

        EmissorDeHolarites.setOnClickListener(View ->{//codigo para ao clicar no botao  EmissorDeHolarites ele chame a tela  EmissorDeHolarites.class
            startActivities(new Intent[]{new Intent(this, Holarite.class)});
        });

        suporte.setOnClickListener(View ->{//codigo para ao clicar no botao  suporte ele chame a tela  suporte.class
            startActivities(new Intent[]{new Intent(this, suporte.class)});
        });
        voltar.setOnClickListener(View ->{//codigo para ao clicar no botao voltar ele chame a tela menu.class
            startActivities(new Intent[]{new Intent(this, MainActivity.class)});
        });
    }
}