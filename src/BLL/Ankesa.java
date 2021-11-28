/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "Ankesa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ankesa.findAll", query = "SELECT a FROM Ankesa a")
    , @NamedQuery(name = "Ankesa.findById", query = "SELECT a FROM Ankesa a WHERE a.id = :id")
    , @NamedQuery(name = "Ankesa.findByAnkesa", query = "SELECT a FROM Ankesa a WHERE a.ankesa = :ankesa")})
public class Ankesa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    
    @GeneratedValue(generator="invseq") 
    @SequenceGenerator(name="invseq",sequenceName="inv_seq", allocationSize=1)
    
    private Integer id;
    @Column(name = "Ankesa")
    private String ankesa;

    public Ankesa() {
    }

    public Ankesa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnkesa() {
        return ankesa;
    }

    public void setAnkesa(String ankesa) {
        this.ankesa = ankesa;
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
        if (!(object instanceof Ankesa)) {
            return false;
        }
        Ankesa other = (Ankesa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
       return "BLL.Ankesa[ id=" + id + " ]";
    }
    
}
