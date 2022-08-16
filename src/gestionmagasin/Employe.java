/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmagasin;

/**
 *
 * @author Mohamed
 */
public class Employe {

    protected int id;
    protected String nom, adresse;
    protected float nbr_heure;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public float getNbr_heure() {
        return nbr_heure;
    }

    public void setNbr_heure(float nbr_heure) {
        this.nbr_heure = nbr_heure;
    }
    
    public Employe(){
        
    }
    public Employe(int id , String nom , String adresse ,float nbr_heure ){
        this.id=id;
        this.adresse=adresse;
        this.nom=nom;
        this.nbr_heure=nbr_heure;
    }
    
    @Override
    public String toString(){
        return "l'employer  id "+this.id+" nom "+this.nom+" adress "+this.adresse+" nombre d'heure "+this.nbr_heure;
    }
    
    @Override
    public boolean equals(Object ob){
       if (ob== null)
            return false;
       if (ob instanceof Employe){
           final Employe e = (Employe)ob;
           if((this.id==e.id)&&(this.nom.equals(e.nom)))
               return true ;
       } 
     return false;
    }
    
}
