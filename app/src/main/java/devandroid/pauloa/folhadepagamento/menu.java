package devandroid.pauloa.folhadepagamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class menu extends AppCompatActivity {
    private Button assistenteDeHoras;
    private Button EmissorDeHolarites;
    private Button suporte;
    private Button voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        assistenteDeHoras = findViewById(R.id.AssistenteDeHoras);
        EmissorDeHolarites = findViewById(R.id.EmissorDeHolarites);
        suporte = findViewById(R.id.suporte);
        voltar = findViewById(R.id.voltar);


        assistenteDeHoras.setOnClickListener(View ->{
            startActivities(new Intent[]{new Intent(this, AssistenteDeHoras.class)});
        });

        EmissorDeHolarites.setOnClickListener(View ->{
            startActivities(new Intent[]{new Intent(this, Holarite.class)});
        });

        suporte.setOnClickListener(View ->{
            startActivities(new Intent[]{new Intent(this, suporte.class)});
        });
        voltar.setOnClickListener(View ->{
            startActivities(new Intent[]{new Intent(this, MainActivity.class)});
        });
    }
}