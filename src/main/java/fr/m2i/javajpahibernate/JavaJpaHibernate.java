package fr.m2i.javajpahibernate;

import fr.m2i.javajpahibernate.helper.SessionHelper;
import javax.persistence.EntityManager;

public class JavaJpaHibernate {

    public static void main(String[] args) {

        EntityManager entityManager = SessionHelper.getEntityManager();

        System.out.println("Nos traitements avec l'entity manager...");

        entityManager.close();
    }
}
