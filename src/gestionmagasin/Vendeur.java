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
public class Vendeur extends Employe{
    private float taux_de_vente ;

    public float getTaux_de_vente() {
        return taux_de_vente;
    }

    public void setTaux_de_vente(float taux_de_vente) {
        this.taux_de_vente = taux_de_vente;
    }
    
    public Vendeur(int id ,String nom ,String adresse , float nbr,float t){
       super(id, nom, adresse, nbr);
       this.taux_de_vente=t;
        
    }
    
    @Override
    public String toString(){
        return super.toString()+" taux de vente "+this.taux_de_vente;
    
    
    }
    
}
