package mini_projet;

import java.util.List;

public class PreTraiteur_Simple implements PreTraiteur {
    private String texte;

    public PreTraiteur_Simple(String texte) {
        this.texte = texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    @Override
    public List<noms> pretraiter(List<noms> nom) {
        return nom;
    }

}
