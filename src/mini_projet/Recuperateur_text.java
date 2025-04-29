package mini_projet;

import java.util.ArrayList;
import java.util.List;

public class Recuperateur_text implements Recuperateur {
    List<noms> text = new ArrayList<noms>();

    @Override
    public noms recuperer() {
        noms nom = text.getLast();
        text.removeLast();
        return nom;
    }

}
