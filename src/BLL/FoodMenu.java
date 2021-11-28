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
@Table(name = "FoodMenu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FoodMenu.findAll", query = "SELECT f FROM FoodMenu f")
    , @NamedQuery(name = "FoodMenu.findById", query = "SELECT f FROM FoodMenu f WHERE f.id = :id")
    , @NamedQuery(name = "FoodMenu.findByFoodName", query = "SELECT f FROM FoodMenu f WHERE f.foodName = :foodName")
    , @NamedQuery(name = "FoodMenu.findByPrice", query = "SELECT f FROM FoodMenu f WHERE f.price = :price")})
public class FoodMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(generator="invseq") 
    @SequenceGenerator(name="invseq",sequenceName="inv_seq", allocationSize=1)
    private Integer id;
    @Column(name = "FoodName")
    private String foodName;
    @Column(name = "Price")
    private String price;

    public FoodMenu() {
    }

    public FoodMenu(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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
        if (!(object instanceof FoodMenu)) {
            return false;
        }
        FoodMenu other = (FoodMenu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.FoodMenu[ id=" + id + " ]";
    }
    
}
