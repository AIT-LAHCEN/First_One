package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static  final String TAG = MainActivity.class.getSimpleName();

    //Exercice1 & 3

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG,"La methode onCreate");

        //Button button = this.findViewById(R.id.Boutton);
       // button.setOnClickListener(new View.OnClickListener() {
          //  @Override
           // public void onClick(View v) {
           //     myClick(v);
           // }
        //} );

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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==100){
            if(resultCode==2000){
                EditText edit = this.findViewById(R.id.Edit);
                edit.setText(""+data.getExtras().getString("Val"));
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    //Exercice1

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"La methode onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"La methode onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"La methode onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"La methode onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"La methode onPause");
    }

    //Exercice4

    public void deuxiemeMessage(View view){
        EditText editText = findViewById(R.id.Nom);
        String Nom = editText.getText().toString();
        Intent intent = new Intent(this,Activity2.class);
        intent.putExtra("NameValue",Nom);
        startActivity(intent);
    }
}
