package org.example.presentation;

import org.example.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationAvecAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configAnnotations.xml");
        Imetier metier = context.getBean(Imetier.class);
        double resultat = metier.claclul();
        System.out.println(resultat);

    }
}
