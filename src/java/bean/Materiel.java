/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author HP
 */
@Entity
public class Materiel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String nom;

    @ManyToOne
    private Model model;
    @OneToMany(mappedBy = "materiel")
    private List<MarcheMateriel> marcheMateriels;
    @ManyToOne
    private Etat etat;
    @OneToMany(mappedBy = "materiel")
    private List<HistoriqueMateriel> historiqueMateriels;

    @ManyToOne
    private EnPanne enPanne;

    public Materiel() {
    }

    public Materiel(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public List<MarcheMateriel> getMarcheMateriels() {
        return marcheMateriels;
    }

    public void setMarcheMateriels(List<MarcheMateriel> marcheMateriels) {
        this.marcheMateriels = marcheMateriels;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public List<HistoriqueMateriel> getHistoriqueMateriels() {
        return historiqueMateriels;
    }

    public void setHistoriqueMateriels(List<HistoriqueMateriel> historiqueMateriels) {
        this.historiqueMateriels = historiqueMateriels;
    }

    public EnPanne getEnPanne() {
        return enPanne;
    }

    public void setEnPanne(EnPanne enPanne) {
        this.enPanne = enPanne;
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
        if (!(object instanceof Materiel)) {
            return false;
        }
        Materiel other = (Materiel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Materiel[ id=" + id + " ]";
    }

}
