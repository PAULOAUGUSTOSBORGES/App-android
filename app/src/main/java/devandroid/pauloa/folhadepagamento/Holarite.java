package devandroid.pauloa.folhadepagamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Holarite extends AppCompatActivity {
    private EditText editTextSalarioBruto;//Variavel para instanciar o editor de text editTextSalarioBruto
    private EditText editTextDescontos;//Variavel para instanciar o editor de text editTextDescontos
    private Button buttonCalcular;//Variavel para instanciar o buttonCalcular
    private TextView textViewSalarioLiquido;//Variavel para instanciar o textoView textViewSalarioLiquido
    private TextView editViewBeneficios;//Variavel para instanciar o textoView editViewBeneficios
    private EditText textnome;//Variavel para instanciar o editor de text textnome
    private Button voltar;//Variavel para instanciar o botão voltar
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holarite);//chamando o xml do layout

        voltar = findViewById(R.id.voltar);//colocando o botão voltar na variavel voltar

        voltar.setOnClickListener(View ->{//codigo para ao clicar no botao voltar ele chame a tela menu.class
            startActivities(new Intent[]{new Intent(this, menu.class)});
        });

        editTextSalarioBruto = findViewById(R.id.editTextSalarioBruto);
        editTextDescontos = findViewById(R.id.editTextDescontos);
        buttonCalcular = findViewById(R.id.buttonCalcular);//colocando o botão buttonCalcular na variavel buttonCalcular
        textViewSalarioLiquido = findViewById(R.id.textViewSalarioLiquido);
        editViewBeneficios = findViewById(R.id.editTextBeneficios);
        textnome = findViewById(R.id.editTextFuncionario);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {//codigo para ao clicar no botao vai chamar a classe calcularSalarioLiquido
            @Override
            public void onClick(View view) {
                calcularSalarioLiquido();
            }
        });
    }

    private void calcularSalarioLiquido() {//codigo para calcular as variaveis salarioBruto - descontos + beneficios e jogar em uma variavel salarioLiquido
        double salarioBruto = Double.parseDouble(editTextSalarioBruto.getText().toString());
        double descontos = Double.parseDouble(editTextDescontos.getText().toString());
        double beneficios = Double.parseDouble(editViewBeneficios.getText().toString());

        double salarioLiquido = salarioBruto - descontos + beneficios;

        textViewSalarioLiquido.setText("Salário Líquido: R$ " + salarioLiquido);
    }
}