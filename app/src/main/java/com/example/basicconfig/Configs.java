package com.example.basicconfig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Configs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configs);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tview = (TextView) view;
                String textoEscolhido = tview.getText().toString();
                Bundle pacote = new Bundle();
                pacote.putString("escolhido", textoEscolhido);
                Intent intent = new Intent(getApplicationContext(), Conquistas.class);
                intent.putExtras(pacote);
                startActivity(intent);
            }

        };
        ListView listView = findViewById(R.id.conquistas);
        listView.setOnItemClickListener(itemClickListener);
    }

    public void cadastrarButton(View v){
        Intent intent  = new Intent(this, Cadastro.class);
        startActivity(intent);
    }

}
