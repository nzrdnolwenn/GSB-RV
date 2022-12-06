package fr.gsb.gsbrvdr;

import java.util.Comparator;

public class ComparateurCoefNotoriete implements Comparator<Praticien> {
    @Override
    public int compare(Praticien o1, Praticien o2) {

        if (o1.getCoefNotoriete() == o2.getCoefNotoriete()){
            return 0;
        }
        else if (o1.getCoefNotoriete() > o2.getCoefNotoriete()){
            return 1;
        }
        else {
            return -1;
        }
    }
}