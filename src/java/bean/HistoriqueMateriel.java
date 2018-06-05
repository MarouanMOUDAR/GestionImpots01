/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author HP
 */
@Entity
public class HistoriqueMateriel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebutAffect;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFinAffect;

    @ManyToOne
    private Materiel materiel;

    public HistoriqueMateriel() {
    }

    public HistoriqueMateriel(Long id) {
        this.id = id;
    }

    public Date getDateDebutAffect() {
        return dateDebutAffect;
    }

    public void setDateDebutAffect(Date dateDebutAffect) {
        this.dateDebutAffect = dateDebutAffect;
    }

    public Date getDateFinAffect() {
        return dateFinAffect;
    }

    public void setDateFinAffect(Date dateFinAffect) {
        this.dateFinAffect = dateFinAffect;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoriqueMateriel)) {
            return false;
        }
        HistoriqueMateriel other = (HistoriqueMateriel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.HistoriqueMateriel[ id=" + id + " ]";
    }

}
