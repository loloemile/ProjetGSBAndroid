package com.example.projetgsbandroid.metier;

import java.io.Serializable;

public class Remboursement implements Serializable {
    
    private String id;
    private String prenom;
    private String nom;
    private double nbKm;
    private double nbRepas;
    private double montantKm;
    private double montantRepas;
    private double montantTotal;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getNbKm() {
        return nbKm;
    }

    public void setNbKm(double nbKm) {
        this.nbKm = nbKm;
    }

    public double getNbRepas() {
        return nbRepas;
    }

    public void setNbRepas(double nbRepas) {
        this.nbRepas = nbRepas;
    }

    public double getMontantKm() {
        return montantKm;
    }

    public void setMontantKm(double montantKm) {
        this.montantKm = montantKm;
    }

    public double getMontantRepas() {
        return montantRepas;
    }

    public void setMontantRepas(double montantRepas) {
        this.montantRepas = montantRepas;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }
    
    public Remboursement (String id, String prenom, String nom, double nbKm, double nbRepas){
        this.id = id;
        this.prenom= prenom;
        this.nom= nom;
        this.nbKm= nbKm;
        this.nbRepas= nbRepas;
    }
    
    public void CalculerRemboursements(){
        montantKm= 0.4* nbKm;
        montantRepas= 8*nbRepas;
        setMontantTotal(montantKm = montantRepas);
    }
    
}
