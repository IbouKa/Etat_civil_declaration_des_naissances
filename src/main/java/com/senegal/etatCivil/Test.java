package com.senegal.etatCivil;

import com.senegal.models.EtatCivil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EtatCivilService.addEtatCivil("Ngoye","Diourbel","Diourbel") ;
		 
		
		for (Object nom : EtatCivilService.getEtatsCivils()) {
	        System.out.println("nom = "+nom);
	      }
	   
	}

}
