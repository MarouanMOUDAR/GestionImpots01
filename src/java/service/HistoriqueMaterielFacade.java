/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.HistoriqueMateriel;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HP
 */
@Stateless
public class HistoriqueMaterielFacade extends AbstractFacade<HistoriqueMateriel> {

    @PersistenceContext(unitName = "GestionImpots01PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HistoriqueMaterielFacade() {
        super(HistoriqueMateriel.class);
    }
    
}
