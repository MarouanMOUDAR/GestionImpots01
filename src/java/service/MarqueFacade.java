/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Marque;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HP
 */
@Stateless
public class MarqueFacade extends AbstractFacade<Marque> {

    @PersistenceContext(unitName = "GestionImpots01PU")
    private EntityManager em;

    public void add(Marque marque, List<Marque> marques) {
        marques.add(clone(marque));
    }

    public Marque clone(Marque marque) {
        Marque myCLone = new Marque();
        myCLone.setNom(marque.getNom());

        return myCLone;
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MarqueFacade() {
        super(Marque.class);
    }

}
