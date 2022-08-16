/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

import gestionmagasin.Caissier;
import gestionmagasin.Employe;
import gestionmagasin.Produit;
import gestionmagasin.Responsable;
import gestionmagasin.Vendeur;

/**
 *
 * @author Mohamed
 */
public class Magasin {

    private int id;
    private final int CAPA_MAX = 50;
    private final int CAPA_MAX_EMP = 20;
    private String adresse;
    private int capa_p;
    private int capa_e;
    private Produit[] produits;
    private Employe[] employes;

    public Magasin() {
        this.produits = new Produit[CAPA_MAX];
        this.employes = new Employe[CAPA_MAX_EMP];
    }

    public Magasin(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
        this.produits = new Produit[CAPA_MAX];
        this.employes = new Employe[CAPA_MAX_EMP];

    }

    public void ajouter(Employe p) {
        if (capa_e < CAPA_MAX_EMP) {
            this.employes[capa_e] = p;
            capa_e++;
        } else {
            System.out.println("le tableu est plient");
        }
    }

    public void ajouter(Produit p) {
        if (capa_p < CAPA_MAX) {
            if (!this.rechercher(p)) {
                this.produits[capa_p] = p;
                capa_p++;
            } else {
                System.out.println("le produit existe déja !!! ");
            }
        } else {
            System.out.println("le tableu est plient");
        }
    }

    public void afficherMagasin() {
        String str = "le Magasin   " + this.id + "  l'adresse    " + this.adresse + "les produit :[\n";
        for (int i = 0; i < capa_p; i++) {
            str += "   " + produits[i].getLibelle() + ", " + produits[i].getPrix() + "\n";
        }

        System.out.println(str + "]");
    }

    public boolean comparer(Produit p1, Produit p2) {
        return (p1.getLibelle() == p2.getLibelle()) && (p1.getId() == p2.getId()) && (p1.getPrix() == p2.getPrix());
    }

    public boolean rechercher(Produit p) {

        for (int i = 0; i < this.capa_p; i++) {
            if (this.comparer(this.produits[i], p)) //if (this.produits[i].comparer(p))
            {
                return true;
            }
        }
        return false;
    }

    public boolean supprimer(Produit p) {
        int index = -1;

        for (int i = 0; i < capa_p; i++) {
            if (this.comparer(this.produits[i], p)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            if (index == 49) {
                this.produits[index] = null;
                return true;
            }
            for (int i = index; i < this.produits.length; i++) {
                this.produits[i] = this.produits[i + 1];
            }
            capa_p--;
            return true;
        }

        return false;
    }

    public Magasin comparerMagasin(Magasin m) {
        if (this.capa_p == m.capa_p) {
            System.out.println("les deux magasin sont egaux");
            return m;
        } else if (this.capa_p > m.capa_p) {
            return this;
        } else {
            return m;
        }
    }

    public void afficherSalaire() {
        for (int i = 0; i < this.capa_e; i++) {
            if (this.employes[i] instanceof Responsable) {
                float salaire = 0;
                final Responsable r = (Responsable) this.employes[i];
                if (r.getNbr_heure() <= 160) {
                    salaire = 160 * 10 + r.getPrime();
                }
                if (r.getNbr_heure() > 160) {
                    salaire = 160 * 10;
                    float diff = r.getNbr_heure() - 160;
                    salaire += diff * 12;
                    salaire += r.getPrime();

                }
                System.out.println("le Responsable " + r.getNom());
                System.out.println(salaire);

            }
            if (this.employes[i] instanceof Caissier) {
                float salaire = 0;
                final Caissier r = (Caissier) this.employes[i];
                if (r.getNbr_heure() <= 180) {
                    salaire = 180 * 5;
                }
                if (r.getNbr_heure() > 180) {
                    salaire = 180 * 5;
                    float diff = r.getNbr_heure() - 180;
                    salaire += diff * 5.75f;

                }
                System.out.println("le Caissier " + r.getNom());
                System.out.println(salaire);
            }
            if (this.employes[i] instanceof Vendeur) {
                float salaire = 450;
                final Vendeur v = (Vendeur) this.employes[i];
                salaire += (450 * v.getTaux_de_vente()) / 100;

                System.out.println("le Vendeur " + v.getNom());
                System.out.println(salaire);
            }

        }

    }

    
    public void afficherPrime (){
        for (int i=0 ;i<capa_e;i++){
            
             if (this.employes[i] instanceof Responsable){
                 System.out.println("le Responsable "+((Responsable)employes[i]).getPrime());
             }
        }
    }
    
    public void nbrEmployer(){
     int nbrR=0;
     int nbrC =0;
     int nbrV=0;
        for (int i = 0; i < this.capa_e; i++) {
            if (this.employes[i] instanceof Responsable) {
           nbrR++;
            }
                if (this.employes[i] instanceof Caissier) {
             nbrC++;
                }
                 if (this.employes[i] instanceof Vendeur) {
         nbrV++;
                 
                 }
         
    }
        System.out.println("le nbr Responsable "+nbrR);
        System.out.println("le nbr Caissier "+nbrC);
        System.out.println("le nbr Vendeur "+nbrV);
    }
    
    
    
    @Override
    public String toString() {
        String str = "le Magasin   " + this.id + "  l'adresse    " + this.adresse + "les produit :[\n";
        for (int i = 0; i < capa_p; i++) {
            str += "   " + produits[i].getLibelle() + ", " + produits[i].getPrix() + "\n";
        }
        for (int i = 0; i < capa_e; i++) {
            str += "  " + employes[i].toString();
        }

        return str;
    }

}
