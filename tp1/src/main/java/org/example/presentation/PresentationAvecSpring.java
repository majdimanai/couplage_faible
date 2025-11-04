package org.example.presentation;

import org.example.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationAvecSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Imetier metier = (Imetier) context.getBean("metier");
        double resultat=metier.claclul();
        System.out.println(resultat);


    }
}
