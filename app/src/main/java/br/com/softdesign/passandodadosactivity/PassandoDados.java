package br.com.softdesign.passandodadosactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.Instant;

public class PassandoDados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pssar_dados);
        Button botaoPassaDados = findViewById(R.id.activity_passa_dados_botao);
        botaoPassaDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText nome = findViewById(R.id.activity_passa_dados_nome);
                EditText idade = findViewById(R.id.activity_passa_dados_idade);
                Intent intent = new Intent(PassandoDados.this, RecebendoDadosActivity.class);
                intent.putExtra("nome", nome.getText().toString());
                intent.putExtra("idade", idade.getText().toString());
                startActivity( intent );
            }
        });
    }
}