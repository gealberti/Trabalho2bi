package com.example.basicconfig;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void entrarConfig(View v){
        Intent intent  = new Intent(this, Configs.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Tem certeza que quer sair?");
        builder.setMessage("Seu processo não será salvo");
        DialogInterface.OnClickListener opcao =  new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        };
        builder.setPositiveButton("Sim :(", opcao);
        builder.setNegativeButton("Não",opcao);
        builder.create().show();
        return;
    }

}
