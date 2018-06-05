/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author HP
 */
@Entity
public class Marche implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateMarche;
    private String nom;

    @OneToMany(mappedBy = "marche")
    private List<MarcheMateriel> marcheMateriels;
    @OneToMany(mappedBy = "marche")
    private List<MarcheModel> marcheModels;

    public Marche() {
    }

    public Marche(String id) {
        this.id = id;
    }

    public Date getDateMarche() {
        return dateMarche;
    }

    public void setDateMarche(Date dateMarche) {
        this.dateMarche = dateMarche;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<MarcheMateriel> getMarcheMateriels() {
        return marcheMateriels;
    }

    public void setMarcheMateriels(List<MarcheMateriel> marcheMateriels) {
        this.marcheMateriels = marcheMateriels;
    }

    public List<MarcheModel> getMarcheModels() {
        return marcheModels;
    }

    public void setMarcheModels(List<MarcheModel> marcheModels) {
        this.marcheModels = marcheModels;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        if (!(object instanceof Marche)) {
            return false;
        }
        Marche other = (Marche) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Marche[ id=" + id + " ]";
    }

}
