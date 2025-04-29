package mini_projet;

import java.util.ArrayList;
import java.util.List;

public class MoteurDeMatching {
	void main() {
		Recuperateur_text recuperateur = new Recuperateur_text();
		PreTraiteur_Simple preTraiteur;
		for (int i = 0; i < 10; i++) {
			noms p = recuperateur.recuperer();
			preTraiteur = new PreTraiteur_Simple(p.getNom());

		}

	}

}
