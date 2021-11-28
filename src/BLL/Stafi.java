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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Stafi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stafi.findAll", query = "SELECT s FROM Stafi s")
    , @NamedQuery(name = "Stafi.findById", query = "SELECT s FROM Stafi s WHERE s.id = :id")
    , @NamedQuery(name = "Stafi.findByEmri", query = "SELECT s FROM Stafi s WHERE s.emri = :emri")
    , @NamedQuery(name = "Stafi.findByMbiemri", query = "SELECT s FROM Stafi s WHERE s.mbiemri = :mbiemri")
    , @NamedQuery(name = "Stafi.findByTel", query = "SELECT s FROM Stafi s WHERE s.tel = :tel")
    , @NamedQuery(name = "Stafi.findByLlojiPunes", query = "SELECT s FROM Stafi s WHERE s.llojiPunes = :llojiPunes")})
public class Stafi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(generator="invseq") 
    @SequenceGenerator(name="invseq",sequenceName="inv_seq", allocationSize=1)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Emri")
    private String emri;
    @Basic(optional = false)
    @Column(name = "Mbiemri")
    private String mbiemri;
    @Basic(optional = false)
    @Column(name = "Tel")
    private int tel;
    @Basic(optional = false)
    @Column(name = "LlojiPunes")
    private String llojiPunes;
    @JoinColumn(name = "StaffRoomID", referencedColumnName = "ID")
    @ManyToOne
    private StaffRoom staffRoomID;

    public Stafi() {
    }

    public Stafi(Integer id) {
        this.id = id;
    }

    public Stafi(Integer id, String emri, String mbiemri, int tel, String llojiPunes) {
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.tel = tel;
        this.llojiPunes = llojiPunes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getLlojiPunes() {
        return llojiPunes;
    }

    public void setLlojiPunes(String llojiPunes) {
        this.llojiPunes = llojiPunes;
    }

    public StaffRoom getStaffRoomID() {
        return staffRoomID;
    }

    public void setStaffRoomID(StaffRoom staffRoomID) {
        this.staffRoomID = staffRoomID;
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
        if (!(object instanceof Stafi)) {
            return false;
        }
        Stafi other = (Stafi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Stafi[ id=" + id + " ]";
    }
    
}
