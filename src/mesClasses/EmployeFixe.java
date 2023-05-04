/*La classe EmployeFixe est une sous-classe de la classe abstraite Employe et représente un employé ayant un salaire fixe. Elle définit un attribut privé salaire qui représente le salaire fixe de l'employé et qui est initialisé à 5000 dans la déclaration de l'attribut.

La classe EmployeFixe définit également une méthode publique setSalaire qui permet de modifier le salaire de l'employé, ainsi qu'une méthode publique getSalaire qui permet d'obtenir le salaire de l'employé.

La classe EmployeFixe redéfinit la méthode publique afficher de la classe Employe pour afficher les informations de l'employé en fonction de son salaire fixe, de ses avantages, de ses déductions et de son nombre de jours de congé pris. La méthode calcule le salaire total de l'employé en fonction de ces informations, puis affiche le titre de civilité, le nom, le prénom et le salaire total de l'employé.

En résumé, la classe EmployeFixe permet de représenter un employé ayant un salaire fixe et de calculer son salaire total en prenant en compte ses avantages et ses déductions.*/
// Définition du package dans lequel se trouve la classe
package mesClasses;

public class EmployeFixe extends Employe { // Définition d'une classe EmployeFixe qui hérite de la classe Employe
	private float salaire = 5000; // attribut privé représentant le salaire fixe de l'employé initialisé à 5000

	public void setSalaire(float salaire) { // méthode publique permettant de modifier le salaire de l'employé
	    this.salaire = salaire; // affectation de la valeur passée en paramètre à l'attribut salaire de l'employé
	}

	public float getSalaire() { // méthode publique permettant d'obtenir le salaire de l'employé
	    return this.salaire; // renvoie la valeur de l'attribut salaire de l'employé
	}

	public void afficher() { // méthode publique affichant les informations de l'employé
	    String titre = "Monsieur"; // déclaration et initialisation d'une variable locale titre avec la valeur "Monsieur"
	    if (getSexe() == 'F') { // si l'employé est une femme
	        titre = "Madame"; // alors la variable titre prend la valeur "Madame"
	    }
	    double salaireTotal = getNbrEnfant() * 200 + getBonus() - (getDeductions() + getDaysOff() * 166.6) + this.salaire; // calcul du salaire total de l'employé en fonction de ses avantages, ses déductions et son salaire fixe
	    System.out.println(titre + " " + getNom() + " " + getPrenom() + " a un salaire ce mois de : " + salaireTotal + " MAD"); // affichage des informations de l'employé avec le titre, le nom, le prénom et le salaire total de l'employé
	}

}