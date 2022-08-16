/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
branche
 */
package gestionmagasin;

import tn.tuniprob.gestionmagasin.Magasin;

/**
 *
 * @author Mohamed
 */
public class GestionMagasin {

/** modification
    /**

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1
        Produit p1 = new Produit();
        //Q2
        Produit p2 = new Produit(1021, "Lait", "delice");
        Produit p3 = new Produit(25110, "Yaourt", "Vitalait");

        Produit p4 = new Produit(2510, "Yaourt", "Vitalait");
        Magasin aziza = new Magasin(1, "El kef");
        
        aziza.ajouter(p4);
        aziza.ajouter(p3);
        aziza.ajouter(p2);
        aziza.ajouter(p4);
        aziza.ajouter(new Produit(2, "felfel", "7arr", 3.2f));
        
        
        aziza.ajouter(new Vendeur(1, "mahdi", "ba7tha centre ", 360, 40));
        aziza.ajouter(new Responsable(2, "mehdi", "dele3a", 100, 20));
        aziza.ajouter(new Caissier(3, "mohamed ", "fil classe", 500, 99));
        
        aziza.ajouter(new Responsable(2, "mehdi 1", "dele3a", 180, 100));
        aziza.ajouter(new Caissier(3, "mohamed 2", "fil classe", 180, 99));
        
        aziza.ajouter(new Responsable(2, "mehdi 3", "dele3a", 160, 30));
        aziza.ajouter(new Caissier(3, "mohamed 3", "fil classe", 170, 99));
        
        aziza.ajouter(new Responsable(2, "mehdi 4", "dele3a", 200, 700));
        aziza.ajouter(new Responsable(2, "mehdi 4", "dele3a", 200, 700));
        aziza.ajouter(new Caissier(3, "mohamed 4", "fil classe", 200, 99));
 
        Employe e =new Responsable(2, "Mehdi ", "dele3a", 200, 700);
        Employe e1 =new Responsable(2, "Mehdi", "dele3a", 200, 700);
        System.out.println(e.equals(e1));
       //aziza.afficherSalaire();
//       aziza.afficherPrime();
//       aziza.nbrEmployer();
//        aziza.afficherMagasin();
//        System.out.println("////////**********\\\\\\\\\\");
//        System.out.println( aziza.comparer(p3, p2));
//       
//        System.out.println( p3.comparer(p4));
//        System.out.println(aziza.toString()); 
//        
//        
        
        
        
        
        
        
//        //Q3
////        p1.afficher();
////        p2.afficher();
////        p3.afficher();
////        p4.afficher();
//        
//        //Q4
//        System.out.println("************ Q4");
//        p2.prix=0.7f;
//      //  p2.afficher();
//
//        p3.prix =1.236f;
//        
//        //p3.afficher();
//   
//        System.out.println( p3.toString());
//    
//    
    }
    

}
