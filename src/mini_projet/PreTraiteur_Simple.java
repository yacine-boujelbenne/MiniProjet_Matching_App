package mini_projet;

import java.util.List;

public class PreTraiteur_Simple extends PreTraiteur {
    private String texte;

    public PreTraiteur_Simple(String texte) {
        this.texte = texte;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    @Override
    List<noms> pretraiter(List<noms> nom) {
        System.out.println("Pretraitement simple du texte : " + texte);
        return nom;
    }

}
