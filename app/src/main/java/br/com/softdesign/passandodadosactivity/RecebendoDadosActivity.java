package br.com.softdesign.passandodadosactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RecebendoDadosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebendo_dados);
        TextView nomeRecebendo = findViewById(R.id.activity_recebe_dados_nome);
        TextView idadeRecebendo = findViewById(R.id.activity_recebe_dados_idade);
        TextView resposta = findViewById(R.id.activity_recebe_dados_resposta);
        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        String idade = dados.getString("idade");
        nomeRecebendo.setText(nome);
        idadeRecebendo.setText(idade);
        int idadeConvertida = Integer.parseInt(idade);
        if (idadeConvertida < 20) {
            resposta.setText("Você esta ficando adulto");
        } else if (idadeConvertida >= 20 && idadeConvertida < 30) {
            resposta.setText("Você já é adulto");
        } else if (idadeConvertida >= 30) {
            resposta.setText("Você esta ficando velho");
        }
    }
}