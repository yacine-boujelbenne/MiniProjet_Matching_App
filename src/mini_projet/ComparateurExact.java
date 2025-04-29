package mini_projet;

public class ComparateurExact {
    public boolean comparer(noms n1, noms n2) {
        if (n1 == null || n2 == null) {
            return false;
        }
        if (n1.equals(n2)) {
            return true;
        }
        return false;
    }

}
