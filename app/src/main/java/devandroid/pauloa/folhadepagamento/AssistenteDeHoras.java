package devandroid.pauloa.folhadepagamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import devandroid.pauloa.folhadepagamento.R;

public class AssistenteDeHoras extends AppCompatActivity {
    private Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assistente_de_horas);

        voltar = findViewById(R.id.voltar);

        voltar.setOnClickListener(View ->{
            startActivities(new Intent[]{new Intent(this, menu.class)});
        });

    }
}