package devandroid.pauloa.folhadepagamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class suporte extends AppCompatActivity {
    private Button voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suporte);

        voltar = findViewById(R.id.voltar);

        voltar.setOnClickListener(View ->{
            startActivities(new Intent[]{new Intent(this, menu.class)});
        });
    }
}