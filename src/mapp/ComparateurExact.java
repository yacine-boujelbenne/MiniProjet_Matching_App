package mapp;

public class ComparateurExact implements Comparateur {
    @Override
    public double comparer(String nom1, String nom2) {
        return nom1.equals(nom2) ? 1.0 : 0.0;
    }
}
