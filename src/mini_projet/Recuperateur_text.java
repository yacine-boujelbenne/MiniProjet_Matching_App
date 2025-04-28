package mini_projet;

public class Recuperateur_text implements Recuperateur {
    private String texte;

    public Recuperateur_text(String texte) {
        this.texte = texte;
    }

    @Override
    public String recuperer() {
        return texte;
    }

}
