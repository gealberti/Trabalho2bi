package com.example.basicconfig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Conquistas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conquistas);
        Intent intent = getIntent();
        Bundle pacote = intent.getExtras();
        String oEscolhido = pacote.getString("escolhido");
        ArrayList<String> conqst = new ArrayList<>();
            conqst.add("Primeiros Passos");
            conqst.add("Iniciante");
            conqst.add("Curioso");
            conqst.add("Esperto");
            conqst.add("Voltar as configuracoes");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, conqst);
        ListView listView = findViewById(R.id.asconquistas);
        listView.setAdapter(adapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view;
                String textoEscolhido = textView.getText().toString();
                if(textoEscolhido.equals("Voltar as configuracoes")){
                Bundle pacote = new Bundle();
                pacote.putString("escolhido", textoEscolhido);
                Intent intent = new Intent(getBaseContext(), Configs.class);
                intent.putExtras(pacote);
                startActivity(intent);}
                else if(textoEscolhido.equals("Primeiros Passos")){
                    Toast.makeText(
                            getApplicationContext(),
                            "Sua primeira conquista!",
                            Toast.LENGTH_SHORT).show();
                }  else if(textoEscolhido.equals("Iniciante")){
                    Toast.makeText(
                            getApplicationContext(),
                            "Realizou as primeiras duas missoes",
                            Toast.LENGTH_SHORT).show();
                }  else if(textoEscolhido.equals("Curioso")){
                    Toast.makeText(
                            getApplicationContext(),
                            "Encontrou mais de 10 pistas numa missao",
                            Toast.LENGTH_SHORT).show();
                }  else if(textoEscolhido.equals("Esperto")){
                    Toast.makeText(
                            getApplicationContext(),
                            "Terminou a missão em menos de 20seg",
                            Toast.LENGTH_SHORT).show();
                }
            }
        };


        ListView listViewDaTela = findViewById(R.id.asconquistas);
        listViewDaTela.setOnItemClickListener(itemClickListener);


    }
    }