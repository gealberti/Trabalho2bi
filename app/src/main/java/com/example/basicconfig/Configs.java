package com.example.basicconfig;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Switch;
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

    MediaPlayer mp;

    public void tocarMusica(View view){
        Switch musica = (Switch) view;
        boolean isOn = musica.isChecked();
        if(isOn){
            mp = MediaPlayer.create(Configs.this, R.raw.megadrive);
            mp.start();
        }else{mp.pause();}
    }

    public void cadastrarButton(View v){
        Intent intent  = new Intent(this, Cadastro.class);
        startActivity(intent);
    }

    public void verificarPessoa(View view) {
        CheckBox robo = (CheckBox) view;
        boolean checked = robo.isChecked();
        if (checked) {
            Toast.makeText(
                    getApplicationContext(),
                    "Será?",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void voltar(View v){
        Intent intent  = new Intent(this, MainActivity.class);
        Configs.this.finish();
        startActivity(intent);

    }
}
