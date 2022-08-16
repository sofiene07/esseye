0/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 modification
*/

package gestionmagasin;

/**
 *
 * @author Mohamed
 */
public class Caissier extends Employe{
    private int num_caisse;

    public int getNum_caisse() {
        return num_caisse;
    }

    public void setNum_caisse(int num_caisse) {
        this.num_caisse = num_caisse;
    }
    
    public Caissier(int id ,String nom ,String adresse , float nbr,int num_caisse){
        super(id, nom, adresse, nbr);
    this.num_caisse=num_caisse;
    
    }
}
