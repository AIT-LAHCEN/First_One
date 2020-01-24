package com.example.tp1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity {

    //Exercice3

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        //Récupérer la donnée par la sous-activité
        if(this.getIntent().getExtras()!=null){
            EditText edit = this.findViewById(R.id.textView2);
            String s =this.getIntent().getExtras().getString("madonne");
            edit.setText(s);
        }

        //La donnée à envoyer par la sous-activité
        Intent data = new Intent();
        data.putExtra("Val","Bonjour");

        //Activité ayant le code 2000 retourne data
        this.setResult(2000,data);
    }

}
