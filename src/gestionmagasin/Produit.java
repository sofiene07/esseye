....com. /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmagasin;

/**
 *
 * @author Mohamed
 */
public class Produit {

    private int id;
    private String libelle, marque;
    private float prix;
//Q1

    Produit() {
    }
//Q2

    Produit(int id, String libelle, String marque) {
        // le produit a comme id id passer en parametre 
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }

    Produit(int id, String lib, String marque, float prix) {
        this.id = id;
        this.libelle = lib;
        this.marque = marque;
        if (prix > 0) {
            this.prix = prix;
        }
    }
//Q3

    void afficher() {
        System.out.println("----le produit est {");

        System.out.println(this.id);
        System.out.println(this.libelle);
        System.out.println(this.marque);
        System.out.println(this.prix);
        System.out.println("}-----");
    }

    public void setPrix(float prix) {

        if (prix > 0) {
            this.prix = prix;
        }
    }

    public float getPrix() {
        return this.prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public boolean comparer (Produit p){
      return (this.id==p.id) &&(this.libelle==p.libelle)&&(this.prix==p.prix);
//        if ((this.id==p.id) &&(this.libelle==p.libelle)&&(this.prix==p.prix) )
//            return true ;
//        return false ;
  }
    
    
    public String toString() {
        return "l'id" + this.id + "le libelle" + this.libelle + "la marque " + this.marque + "prix" + this.prix;
    }
}
