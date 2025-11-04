package org.example.presentation;

import org.example.dao.DaoImpl;
import org.example.metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PresentationDynamique {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner sc=new Scanner(new File("/media/majdi/Nouveau nom/tp1/src/main/resources/config.txt"));
        String daoClassName = sc.nextLine();
        Class daoClass=Class.forName(daoClassName);
        DaoImpl daoimpl=(DaoImpl) daoClass.newInstance();


        String metierClassName=sc.nextLine();
        Class metierClass =Class.forName(metierClassName);
        MetierImpl metier=(MetierImpl) metierClass.newInstance();
        metier.setIdao(daoimpl);
        double resultat=  metier.claclul();
        System.out.println(resultat);
    }
}
