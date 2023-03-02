package com.example.projetgsbandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import com.example.projetgsbandroid.presentation.Saisie;
import com.example.projetgsbandroid.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnStart;
    private Button btnQuitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart= (Button)findViewById(R.id.start);
        btnQuitter=(Button)findViewById(R.id.quitter);
        btnStart.setOnClickListener(this);
        btnQuitter.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v==btnStart){
            Intent intent= new Intent(MainActivity.this, Saisie.class);
            startActivity(intent);
        }else if (v==btnQuitter){
            finish();
        }
    }
}