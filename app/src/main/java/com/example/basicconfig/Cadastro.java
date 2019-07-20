package com.example.basicconfig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void voltarConfig(View v){
        Intent intent  = new Intent(this, Configs.class);
        startActivity(intent);

        Toast.makeText(
                getApplicationContext(),
                "Cadastrado efetuado com sucesso!",
                Toast.LENGTH_SHORT).show();
    }


}
