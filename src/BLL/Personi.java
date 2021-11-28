/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "Personi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personi.findAll", query = "SELECT p FROM Personi p")
    , @NamedQuery(name = "Personi.findById", query = "SELECT p FROM Personi p WHERE p.id = :id")
    , @NamedQuery(name = "Personi.findByEmri", query = "SELECT p FROM Personi p WHERE p.emri = :emri")
    , @NamedQuery(name = "Personi.findByMbiemri", query = "SELECT p FROM Personi p WHERE p.mbiemri = :mbiemri")
    , @NamedQuery(name = "Personi.findByDataLindjes", query = "SELECT p FROM Personi p WHERE p.dataLindjes = :dataLindjes")
    , @NamedQuery(name = "Personi.findByTel", query = "SELECT p FROM Personi p WHERE p.tel = :tel")
    , @NamedQuery(name = "Personi.findByAddress", query = "SELECT p FROM Personi p WHERE p.address = :address")
    , @NamedQuery(name = "Personi.findByCheckIn", query = "SELECT p FROM Personi p WHERE p.checkIn = :checkIn")
    , @NamedQuery(name = "Personi.findByCheckOut", query = "SELECT p FROM Personi p WHERE p.checkOut = :checkOut")})
public class Personi implements Serializable {

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
    @Column(name = "DataLindjes")
    @Temporal(TemporalType.DATE)
    private Date dataLindjes;
    @Basic(optional = false)
    @Column(name = "Tel")
    private String tel;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "CheckIn")
    @Temporal(TemporalType.DATE)
    private Date checkIn;
    @Basic(optional = false)
    @Column(name = "CheckOut")
    @Temporal(TemporalType.DATE)
    private Date checkOut;
    @JoinColumn(name = "RoomID", referencedColumnName = "ID")
    @ManyToOne
    private Room roomID;

    public Personi() {
    }

    public Personi(Integer id) {
        this.id = id;
    }

    public Personi(Integer id, String emri, String mbiemri, Date dataLindjes, String tel, String address, Date checkIn, Date checkOut) {
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.dataLindjes = dataLindjes;
        this.tel = tel;
        this.address = address;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
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

    public Date getDataLindjes() {
        return dataLindjes;
    }

    public void setDataLindjes(Date dataLindjes) {
        this.dataLindjes = dataLindjes;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Room getRoomID() {
        return roomID;
    }

    public void setRoomID(Room roomID) {
        this.roomID = roomID;
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
        if (!(object instanceof Personi)) {
            return false;
        }
        Personi other = (Personi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Personi[ id=" + id + " ]";
    }
    
}
