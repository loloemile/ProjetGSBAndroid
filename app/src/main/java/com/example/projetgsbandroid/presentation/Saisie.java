package com.example.projetgsbandroid.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import com.example.projetgsbandroid.R;
import com.example.projetgsbandroid.metier.Remboursement;


public class Saisie extends AppCompatActivity implements View.OnClickListener {
    private Remboursement unRemboursement;
    private Button btnCalculer;
    private Button btnMenu;
    private EditText txtId;
    private EditText txtPrenom;
    private EditText txtNom;
    private EditText txtNbKm;
    private EditText txtNbRepas;
    private double nbKm;
    private double nbRepas;
    
    @Override
    protected void onCreate(Bundle savedIstanceState){
        super.onCreate(savedIstanceState);
        setContentView(R.layout.saisie);
        btnCalculer= (Button) findViewById(R.id.calculer);
        btnMenu=(Button) findViewById(R.id.menu);
        btnCalculer.setOnClickListener(this);
        btnMenu.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if(v==btnCalculer){
            txtId= (EditText) findViewById(R.id.id);
            txtPrenom=(EditText) findViewById(R.id.prenom);
            txtNom = (EditText) findViewById(R.id.nom);
            txtNbKm= (EditText) findViewById(R.id.nbKm);
            txtNbRepas= (EditText) findViewById(R.id.nbRepas);
            
            nbKm=Double.parseDouble(txtNbKm.getText().toString()):
            nbRepas = Double.parseDouble(txtNbRepas.getText().toString());
            
            unRemboursement= new Remboursement(txtId.getText().toString(), txtPrenom.getText().toString(), txtNom.getText().toString(), nbKm, nbRepas);
            unRemboursement.CalculerRemboursements();
            
            Intent intent=new Intent(Saisie.this, Affichage.class);
            intent.putExtra("monRemboursement", unRemboursement);
            startActivity(intent);
        } else if (v==btnMenu){
            Intent intent= new Intent(Saisie.this, MainA);
            startActivity(intent);
        }
    }
    
}
