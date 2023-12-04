package devandroid.pauloa.folhadepagamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Holarite extends AppCompatActivity {
    private EditText editTextSalarioBruto;
    private EditText editTextDescontos;
    private Button buttonCalcular;
    private TextView textViewSalarioLiquido;
    private TextView editViewBeneficios;
    private EditText textnome;
    private Button voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holarite);

        voltar = findViewById(R.id.voltar);

        voltar.setOnClickListener(View ->{
            startActivities(new Intent[]{new Intent(this, menu.class)});
        });

        editTextSalarioBruto = findViewById(R.id.editTextSalarioBruto);
        editTextDescontos = findViewById(R.id.editTextDescontos);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        textViewSalarioLiquido = findViewById(R.id.textViewSalarioLiquido);
        editViewBeneficios = findViewById(R.id.editTextBeneficios);
        textnome = findViewById(R.id.editTextFuncionario);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularSalarioLiquido();
            }
        });
    }

    private void calcularSalarioLiquido() {
        double salarioBruto = Double.parseDouble(editTextSalarioBruto.getText().toString());
        double descontos = Double.parseDouble(editTextDescontos.getText().toString());
        double beneficios = Double.parseDouble(editViewBeneficios.getText().toString());

        double salarioLiquido = salarioBruto - descontos + beneficios;

        textViewSalarioLiquido.setText("Salário Líquido: R$ " + salarioLiquido);
    }
}