// Définition du package dans lequel se trouve la classe

package mesClasses;
/*  La ligne de code importe la classe Scanner du package java.util, ce qui permet d'utiliser la classe Scanner dans le reste du code. La classe Scanner permet de lire les entrées de l'utilisateur à partir de la console ou d'autres flux d'entrée, tels que des fichiers.*/
import java.util.Scanner;

public class Main {
// Définition de la méthode main qui sera exécutée au lancement du programme
public static void main(String[] args) {
	
	// Affichage d'un message de bienvenue et de demande de saisie de type d'employé
	System.out.print("------BONJOUR------ \n\n Merci d'entrer le type d'employé \n\n ");
	System.out.println("-1- Employe Fixe -2- Employe Commission -3- Employe Horaire  ");
	
	// Création d'un objet Scanner pour récupérer les entrées utilisateur
	Scanner scanner= new Scanner(System.in);
    
	// Déclaration et initialisation d'une variable x pour stocker le choix de l'utilisateur
    int x;
    x=scanner.nextInt();
    
    // Vérification de la validité du choix de l'utilisateur (doit être compris entre 1 et 3)
    while(x>3 || x<=0) {
    	System.out.println("!! erreur veuillez resaisir !!\n-1- Employe Fixe -2- Employe Commission -3- Employe Horaire  ");
        x=scanner.nextInt();
    }
    
    // Exécution du code en fonction du choix de l'utilisateur (switch/case)
    switch(x) {
    
    // Cas de l'employé fixe
    case 1 :
    	
    	// Création d'un nouvel objet EmployeFixe
    	EmployeFixe A2=new EmployeFixe();
    	
        // Demande et récupération du nom de l'employé
        System.out.print("Nom de l'employé : ");
        A2.setNom(scanner.next());
        
        // Demande et récupération du prénom de l'employé
        System.out.print("Prénom de l'employé : ");
        A2.setPrenom(scanner.next());
        
        // Demande et récupération du sexe de l'employé
        System.out.print("Sexe de l'employé (H ou F) : ");
        A2.setSexe(scanner.next().charAt(0));
        
        // Demande et récupération du nombre d'enfants de l'employé
        System.out.print("Donner le nombre d'enfants : ");
        A2.setNbrEnfant(scanner.nextInt());
        
        // Demande et récupération du bonus de l'employé
		System.out.print("Bonus : ");
		A2.setBonus(scanner.nextFloat());
		
		// Demande et récupération des déductions de l'employé
		System.out.print("Deductions : ");
		A2.setDeductions(scanner.nextFloat());
		
		// Appel de la méthode afficher() pour afficher les informations de l'employé fixe
		A2.afficher();
		break;
    
    // Cas de l'employé commission
    case 2 :
    	
    	// Création d'un nouvel objet EmployeCommission
    	EmployeCommission A1=new EmployeCommission();
        
    	// Demande et récupération du nom de l'employé
        System.out.print("Nom de l'employé : ");
        A1.setNom(scanner.next());
        
        // Demande et récupération du prénom de l'employé
  System.out.print("Prénom de l'employé : ");
	        A1.setPrenom(scanner.next());
            System.out.print("Sexe de l'employé (H ou F) : ");
            A1.setSexe(scanner.next().charAt(0));
	        System.out.print("Donner le nombre d'enfants : ");
	        A1.setNbrEnfant(scanner.nextInt());
	        System.out.print("Commission : ");
			A1.setCommission(scanner.nextFloat());
	        System.out.print("Ventes pour ce mois : ");
			A1.setVentes(scanner.nextInt());
			System.out.print("Bonus : ");
			A1.setBonus(scanner.nextFloat());
			System.out.print("Deductions : ");
			A1.setDeductions(scanner.nextFloat());
			A1.afficher();
			break;
        case 3 :

        	    	// Création d'un objet EmployeHoraire
        	    	EmployeHoraire A3=new EmployeHoraire();
        	    	
        	    	// Saisie des informations de l'employé
        	System.out.print("Nom de l'employé : ");
        		        A3.setNom(scanner.next());
        	            System.out.print("Prénom de l'employé : ");
        		        A3.setPrenom(scanner.next());
        	            System.out.print("Sexe de l'employé (H ou F) : ");
        	            A3.setSexe(scanner.next().charAt(0));
        		        System.out.print("Donner le nombre d'enfants : ");
        		        A3.setNbrEnfant(scanner.nextInt());
        		        System.out.print("Heures prestées : ");
        				A3.setHeuresPrestees(scanner.nextInt());
        		        System.out.print("Taux horaire : ");
        				A3.setTauxHoraire(scanner.nextFloat());
        				System.out.print("Bonus : ");
        				A3.setBonus(scanner.nextFloat());
        				System.out.print("Deductions : ");
        				A3.setDeductions(scanner.nextFloat());
        				// Affichage des informations de l'employé
        				A3.afficher();
        				break;
        	        }
        		    scanner.close();

        		}
        	}
        		//merci pour votre attention 
