package com.senegal.etatCivil;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.senegal.models.EtatCivil;

 

public class EtatCivilService {
	 
	public static  List getEtatsCivils(){
		
		EntityManagerFactory emf = null;
        EntityManager em = null;
        List EtatsCivils = null;
        
        try {
        	
        	emf = Persistence.createEntityManagerFactory("etatcivil");
        	em = emf.createEntityManager();
            EntityTransaction trans =em.getTransaction();
            trans.begin();
          
            Query query = em.createQuery("select EtatCivilId,localite,departement,region from EtatCivil");
    	    EtatsCivils = query.getResultList();
            
    	    

    		
        }finally {
            if ( em != null ) em.close();
            if ( emf != null ) emf.close();
        }
        
		return EtatsCivils;
		
	};
	
	public static boolean addEtatCivil(String localite, String departement, String region) {
		
		EntityManagerFactory emf = null;
        EntityManager em = null;
        
        try {
        	
        	emf = Persistence.createEntityManagerFactory("etatcivil");
        	em = emf.createEntityManager();
            EntityTransaction trans =em.getTransaction();
            trans.begin();
            
            EtatCivil ec = new EtatCivil(localite,departement,region);
            em.persist(ec);
            
    		trans.commit();
    		
    		
        }finally {
            if ( em != null ) em.close();
            if ( emf != null ) emf.close();
        }
		return false;
		
	};

}
