package com.example.tp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class Activity1 extends Activity {

    EditText edit = this.findViewById(R.id.Edit);
    Button button = this.findViewById(R.id.Boutton);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        //La donnée à envoyer par la sous-activité
        Intent data =new Intent();
        data.putExtra("Val","Bonjour");

        //Activité ayant le code 2000 retourne data
        this.setResult(2000,data);

        super.onCreate(savedInstanceState);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myClick(v);
            }
        } );

        //Récupérer la donnée par la sous-activité
        if(this.getIntent().getExtras()!=null){
            String s =this.getIntent().getExtras().getString("madonne");
            edit.setText(s);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==100){
            if(resultCode==2000){
                edit.setText(""+data.getExtras().getString("Val"));
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void myClick(View v){

        //Création de l'intention
        Intent intent = new Intent(this,MainActivity.class);

        //Envoyer une donnée à la sous activité
        intent.putExtra("madonne","Hi");

        //Démarrer la sous-activité
        //this.startActivity(intent);
        this.startActivityForResult(intent,100);
    }
}
