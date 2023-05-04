/*La classe "Employe" est une classe abstraite qui représente un employé générique. Elle possède plusieurs attributs privés tels que le nom, le prénom, le nombre d'enfants, le bonus, le montant des déductions, le nombre de jours de congé et le sexe de l'employé.

La classe contient également des méthodes d'accès et de modification pour chacun de ces attributs, ainsi qu'une méthode abstraite "afficher()" qui sera implémentée dans les classes filles. Les méthodes d'accès (getters) permettent de récupérer les valeurs des attributs tandis que les méthodes de modification (setters) permettent de modifier les valeurs des attributs.

Le fait que la classe "Employe" soit abstraite signifie qu'elle ne peut pas être instanciée directement, mais doit être étendue par d'autres classes qui hériteront de ses attributs et méthodes. Les classes filles devront implémenter la méthode abstraite "afficher()" selon leur propre logique.*/
// Définition du package dans lequel se trouve la classe
package mesClasses;

// Déclaration de la classe abstraite Employe
public abstract class Employe {

    // Déclaration des attributs privés de la classe
    private String nom;            // nom de l'employé
    private String prenom;         // prénom de l'employé
    private int nbrEnfant;         // nombre d'enfants de l'employé
    private double bonus;          // bonus de l'employé
    private double deductions;     // montant des déductions pour l'employé
    private int daysOff;           // nombre de jours de congé de l'employé
    private char sexe;             // sexe de l'employé

    // Définition d'une méthode abstraite qui sera implémentée dans les classes filles
    public abstract void afficher();

    // Définition des méthodes d'accès (getters) et de modification (setters) pour chaque attribut

    // méthode pour accéder au sexe de l'employé
    public char getSexe() {
		return sexe;
	}

	// méthode pour modifier le sexe de l'employé
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

    // méthode pour accéder au nombre de jours de congé de l'employé
    public int getDaysOff() {
        return daysOff;
    }

    // méthode pour modifier le nombre de jours de congé de l'employé
    public void setDaysOff(int daysOff) {
        this.daysOff = daysOff;
    }

    // méthode pour accéder au bonus de l'employé
    public double getBonus() {
        return bonus;
    }

    // méthode pour modifier le bonus de l'employé
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // méthode pour accéder au montant des déductions pour l'employé
    public double getDeductions() {
        return deductions;
    }

    // méthode pour modifier le montant des déductions pour l'employé
    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    // méthode pour accéder au nombre d'enfants de l'employé
    public int getNbrEnfant() {
        return nbrEnfant;
    }

    // méthode pour modifier le nombre d'enfants de l'employé
    public void setNbrEnfant(int nbrEnfant) {
        this.nbrEnfant = nbrEnfant;
    }

    // méthode pour accéder au prénom de l'employé
    public String getPrenom() {
        return prenom;
    }

    // méthode pour modifier le prénom de l'employé
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // méthode pour modifier le nom de l'employé
    public void setNom(String nom) {
        this.nom = nom;
    }

    // méthode pour accéder au nom de l'employé
    public String getNom() {
    	return this.nom;
    	}
   }