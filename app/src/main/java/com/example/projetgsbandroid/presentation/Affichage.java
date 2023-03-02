package com.example.projetgsbandroid.presentation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.projetgsbandroid.metier.Remboursement;

import com.example.projetgsbandroid.R;

public class Affichage extends AppCompatActivity implements View.OnClickListener {

    private Remboursement monRemboursement;
    private Button btnRetour;
    private Button btnMenu;
    private TextView txtId;
    private TextView txtNbKm;
    private TextView txtNbRepas;
    private TextView txtTotal;
    private Double nbKm;
    private Double nbRepas;
    private Double montantTotal;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.affichage);
        btnRetour= (Button) findViewById(R.id.retour);
        btnMenu= (Button)  findViewById(R.id.menu);
        btnRetour.setOnClickListener(this);
        btnMenu.setOnClickListener(this);
    }

    @Override
    protected  void onStart(){
        super.onStart();
        monRemboursement= (Remboursement) getIntent().getSerializableExtra("monRemboursement");
        txtId= (TextView) findViewById(R.id.id);
        txtNbKm= (TextView) findViewById(R.id.km);
        txtNbRepas= (TextView) findViewById(R.id.repas);
        txtTotal= (TextView) findViewById(R.id.total);

        txtId.setText(monRemboursement.getId());
        nbKm= monRemboursement.getMontantKm();
        nbRepas= monRemboursement.getMontantRepas();
        montantTotal=monRemboursement.getMontantTotal();

        txtNbKm.setText(NbKm.toString());

    }


    @Override
    public void onClick(View view) {

    }
}
