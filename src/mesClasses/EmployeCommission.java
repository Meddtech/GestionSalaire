/**

Cette classe représente un employé ayant un salaire composé d'une partie fixe et d'une partie variable basée sur
une commission et le nombre de ventes effectuées.
Elle hérite de la classe EmployeFixe.
*/
package mesClasses;
public class EmployeCommission extends EmployeFixe {
private float commission; // la commission de l'employé
private int ventes; // le nombre de ventes effectuées par l'employé
/**
 * Méthode pour définir la commission de l'employé.
 * @param commission la commission de l'employé.
 */
public void setCommission(float commission) {
    this.commission = commission;
}

/**
 * Méthode pour obtenir la commission de l'employé.
 * @return la commission de l'employé.
 */
public float getCommission() {
    return this.commission;
}

/**
 * Méthode pour définir le nombre de ventes effectuées par l'employé.
 * @param ventes le nombre de ventes effectuées par l'employé.
 */
public void setVentes(int ventes) {
    this.ventes = ventes;
}

/**
 * Méthode pour obtenir le nombre de ventes effectuées par l'employé.
 * @return le nombre de ventes effectuées par l'employé.
 */
public int getVentes() {
    return this.ventes;
}

/**
 * Méthode pour afficher les informations de l'employé avec le salaire total calculé en fonction de la commission
 * et du nombre de ventes effectuées.
 */
public void afficher() {
    String titre = "Monsieur";
    if (getSexe() == 'F') {
        titre = "Madame";
    }

    double salaireTotal = getSalaire() + this.commission * this.ventes + getNbrEnfant() * 200 + getBonus() - getDeductions();
    System.out.println(titre + " " + getNom() + " " + getPrenom() + " a un salaire ce mois de : " + salaireTotal + " MAD");
}
}




