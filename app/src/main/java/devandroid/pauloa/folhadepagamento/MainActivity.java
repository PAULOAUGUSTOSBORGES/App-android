package devandroid.pauloa.folhadepagamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button entrar;//Variavel para instanciar o botão entrar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//chamando o xml do layout

        entrar= findViewById(R.id.menu);//colocando o botão menu na variavel entrar

        entrar.setOnClickListener(View ->{//codigo para ao clicar no botao entrar ele chame a tela menu.class
            startActivities(new Intent[]{new Intent(this, menu.class)});
        });


    }
}