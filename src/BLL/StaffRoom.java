/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "StaffRoom")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StaffRoom.findAll", query = "SELECT s FROM StaffRoom s")
    , @NamedQuery(name = "StaffRoom.findById", query = "SELECT s FROM StaffRoom s WHERE s.id = :id")
    , @NamedQuery(name = "StaffRoom.findByStaffRoomNumber", query = "SELECT s FROM StaffRoom s WHERE s.staffRoomNumber = :staffRoomNumber")
    , @NamedQuery(name = "StaffRoom.findByStaffRoomDescription", query = "SELECT s FROM StaffRoom s WHERE s.staffRoomDescription = :staffRoomDescription")})
public class StaffRoom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(generator="invseq") 
    @SequenceGenerator(name="invseq",sequenceName="inv_seq", allocationSize=1)
    private Integer id;
    @Column(name = "StaffRoomNumber")
    private String staffRoomNumber;
    @Column(name = "StaffRoomDescription")
    private String staffRoomDescription;
    @OneToMany(mappedBy = "staffRoomID")
    private Collection<Stafi> stafiCollection;

    public StaffRoom() {
    }

    public StaffRoom(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaffRoomNumber() {
        return staffRoomNumber;
    }

    public void setStaffRoomNumber(String staffRoomNumber) {
        this.staffRoomNumber = staffRoomNumber;
    }

    public String getStaffRoomDescription() {
        return staffRoomDescription;
    }

    public void setStaffRoomDescription(String staffRoomDescription) {
        this.staffRoomDescription = staffRoomDescription;
    }

    @XmlTransient
    public Collection<Stafi> getStafiCollection() {
        return stafiCollection;
    }

    public void setStafiCollection(Collection<Stafi> stafiCollection) {
        this.stafiCollection = stafiCollection;
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
        if (!(object instanceof StaffRoom)) {
            return false;
        }
        StaffRoom other = (StaffRoom) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
       return "Dhoma numer " + id ;
    }
}
