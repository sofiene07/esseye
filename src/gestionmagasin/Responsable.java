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
public class Responsable extends Employe{
    
    private float prime ;

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }
    
    public Responsable(int id ,String nom ,String adresse , float nbr,float prime){
        super(id, nom, adresse, nbr);
      this.prime=prime;  
    }
    
}
