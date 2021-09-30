package br.com.itb.aula01trocajanelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Criar o objeto java correspondente ao botão da tela
        //findviewByid() criará o vinculo entre eles
        Button botao = findViewById(R.id.btnTrocarJanela);
        //Adicionar método de acionamento do botão por clique
        botao.setOnClickListener(view -> {
            //Chamada da janela activity_main2.xml
            Intent it = new Intent(getBaseContext(),MainActivity2.class);
            //Inicio do ciclo de vida da atividade Main2activity
            startActivity(it);
        });

    }
}