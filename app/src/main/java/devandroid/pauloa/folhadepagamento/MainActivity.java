package devandroid.pauloa.folhadepagamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrar= findViewById(R.id.menu);

        entrar.setOnClickListener(View ->{
            startActivities(new Intent[]{new Intent(this, menu.class)});
        });


    }
}