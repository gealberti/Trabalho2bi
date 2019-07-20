package com.example.basicconfig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
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
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, conqst);
        ListView listView = findViewById(R.id.asconquistas);
        listView.setAdapter(adapter);

        if(conqst.equals("Primeiros passos")) {
            Toast.makeText(
                    getApplicationContext(),
                    "Sua primeira conquista!",
                    Toast.LENGTH_SHORT).show();
        }else if(conqst.equals("Iniciante")) {
            Toast.makeText(
                    getApplicationContext(),
                    "Cumpriu as primeiras 2 missões!",
                    Toast.LENGTH_SHORT).show();
        }else if(conqst.equals("Curioso")) {
            Toast.makeText(
                    getApplicationContext(),
                    "Conseguiu achar o item escondido!",
                    Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(
                    getApplicationContext(),
                    "Achou mais de 10 itens em uma missão!",
                    Toast.LENGTH_SHORT).show();
        }
        }
    }


