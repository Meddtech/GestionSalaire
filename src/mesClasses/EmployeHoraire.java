/*
 * La classe "EmployeHoraire" hérite de la classe abstraite "Employe" et représente un employé payé à l'heure. Elle possède deux attributs privés, "taux_horaire" qui représente le taux horaire de l'employé et "heures_prestees" qui représente le nombre d'heures prestées par l'employé. Elle définit des setters et des getters pour ces deux attributs.

La classe "EmployeHoraire" possède également une méthode "afficher" qui calcule le salaire total de l'employé en fonction de ses heures prestées, son taux horaire, le nombre de ses enfants, son bonus et ses déductions. Cette méthode utilise la méthode "getSexe" de la classe "Employe" pour déterminer le titre de l'employé en fonction de son sexe. Elle affiche ensuite les informations de l'employé en utilisant la méthode "println" de la classe "System.out".
 */
// Définition du package dans lequel se trouve la classe
package mesClasses;

public class EmployeHoraire extends Employe {
	// Définition de deux attributs privés de la classe "EmployeHoraire"
	private float taux_horaire;
	private int heures_prestees;

	// Définition d'un setter pour l'attribut "taux_horaire"
	public void setTauxHoraire(float taux_horaire) {
	    this.taux_horaire = taux_horaire;
	}

	// Définition d'un getter pour l'attribut "taux_horaire"
	public float getTauxHoraire() {
	    return this.taux_horaire;
	}

	// Définition d'un setter pour l'attribut "heures_prestees"
	public void setHeuresPrestees(int heures_prestees) {
	    this.heures_prestees = heures_prestees;
	}

	// Définition d'un getter pour l'attribut "heures_prestees"
	public int getHeuresPrestees() {
	    return this.heures_prestees;
	}

	// Définition d'une méthode "afficher" pour afficher les informations de l'employé horaire
	public void afficher() {
	    // Initialisation de la variable "titre" en fonction du sexe de l'employé
	    String titre = "Monsieur";
	    if (getSexe() == 'F') {
	        titre = "Madame";
	    }
	    // Calcul du salaire total de l'employé en fonction de ses heures prestées, son taux horaire, le nombre de ses enfants, son bonus et ses déductions
	    double salaireTotal = this.taux_horaire * this.heures_prestees + getNbrEnfant() * 200 + getBonus() - getDeductions();
	    // Affichage des informations de l'employé
	    System.out.println(titre + " " + getNom() + " " + getPrenom() + " a un salaire ce mois de : " + salaireTotal + " MAD");
	}
}