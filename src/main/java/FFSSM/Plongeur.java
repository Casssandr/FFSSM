package FFSSM;

import java.time.LocalDate;
import java.util.ArrayList;

public class Plongeur extends Personne {
	private int niveau;
    private GroupeSanguin sang;
    private ArrayList<Licence> lesLicences;

    public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance, int niveau, GroupeSanguin sang){
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.niveau = niveau;
        this.sang = sang;
        this.lesLicences = new ArrayList<Licence>();
    }

    public void ajouteLicence(String num, LocalDate deliv, Club c){
        lesLicences.add(new Licence(this, num, deliv, c));
    }

    public Licence derniereLicence()throws Exception{
        if (lesLicences.isEmpty()){
            throw new Exception("Il n'existe pas de licence pour ce plongeur");
        }
        int dern = lesLicences.size();
        return lesLicences.get(dern-1);
    }
}
