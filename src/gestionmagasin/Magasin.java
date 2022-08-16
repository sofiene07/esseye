/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmagasin;

/**
 *
 * @author soufi
 */
public class Magasin {
   private int id,capacite;
   private String adress;
   private final int CAPA_MAX=50;
   private Produit [] Produits;
   
 public  Magasin(){
         Produits = new Produit[CAPA_MAX];

   }
   
  public Magasin(int id,String adress){ 
    this.id=id;
    this.adress=adress;
    Produits = new Produit[CAPA_MAX];
}
  public void AjouterProduit(Produit p){
      if(capacite < CAPA_MAX){
      this.Produits[capacite]=p;
      capacite++;
      }
      else{
          System.out.println("le tableau est saturé");
      }
  }
  public void AfficheMagasin(){
      String str="le magasin"+this.id+"l'adresse"+this.adress+"les produit:[ \n";
      for(int i=0;i<capacite;i++)
      {str+=Produits[i].libelle+", "+Produits[i].prix;           
              }
   System.out.println(str+"]");
  }
}
