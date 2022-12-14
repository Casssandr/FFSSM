/**
 * @(#) Plongee.java
 */
package FFSSM;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Plongee {

	public Site lieu;

	public Moniteur chefDePalanquee;

	public LocalDate date;

	public int profondeur;

	public int duree;

	private ArrayList<Plongeur> lesPlongeurs;

	public Plongee(Site lieu, Moniteur chefDePalanquee, LocalDate date, int profondeur, int duree) {
		this.lieu = lieu;
		this.chefDePalanquee = chefDePalanquee;
		this.date = date;
		this.profondeur = profondeur;
		this.duree = duree;
	}

	public ArrayList<Plongeur> getPlongeurs(){return lesPlongeurs;}

	public void ajouteParticipant(Plongeur participant) {
		// TODO: Implémenter cette méthode
		//throw new UnsupportedOperationException("Pas encore implémenté");
		lesPlongeurs.add(participant);
	}

	public LocalDate getDate() {
		return date;
	}

	/**
	 * Détermine si la plongée est conforme. 
	 * Une plongée est conforme si tous les plongeurs de la palanquée ont une
	 * licence valide à la date de la plongée
	 * @return vrai si la plongée est conforme
	 */
	public boolean estConforme() throws Exception {
		// TODO: Implémenter cette méthode
		//throw new UnsupportedOperationException("Pas encore implémenté");
		if (lesPlongeurs.isEmpty()){
			throw new Exception("Il n'y a aucune plongeur pour cette palongée");
		}
		boolean bool = true;
		for (Plongeur p : lesPlongeurs){
			if (!(p.derniereLicence().estValide(this.date))){
				bool = false;
			}
		}
		return bool;
	}

}
