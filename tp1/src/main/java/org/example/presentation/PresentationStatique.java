package org.example.presentation;

import org.example.dao.DaoImpl;
import org.example.metier.MetierImpl;

public class PresentationStatique {
    public static void main(String[] args) {
        DaoImpl daoiml=new DaoImpl();
        MetierImpl metier=new MetierImpl();
        metier.setIdao(daoiml);
        double resultat= metier.claclul();
        System.out.println(resultat);
    }
}
