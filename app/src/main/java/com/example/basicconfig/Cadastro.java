package com.example.basicconfig;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
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

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O) {
            NotificationChannel channel =
                    new NotificationChannel("verificaEmail" ,"Verificação" ,
                            NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager nm = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
            nm.createNotificationChannel(channel);}


        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"verificaEmail");
        builder.setSmallIcon(R.drawable.email);
        builder.setContentTitle("Verificação de email");
        builder.setContentText("Olá! Uma mensagem de verificação foi enviada para o seu email.");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManager nm = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(3566, builder.build());
    }
}
