/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;
import Domain.Person;
import java.io.Serializable;	
import javax.persistence.Column;	
import javax.persistence.Entity;	
import com.mycompany.librarycatalogmanagementsystem.*;	
import java.util.Set;	
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Adrian Bailey
 */

@Entity
@Table(name="publisher")
public class Publisher extends Person{
  
    
    @Column(name="publishercode")
    private String publishercode;
    
    private Set<Catalogrecord> Catalogrecords;
    
    public Publisher(int id, String fname, String lname, String publishercode) {
        this.publishercode = publishercode;
        this.setFname(fname);
        this.setLname(lname);
        this.setId(id);
       
    }

    public void setPublisherCode(String publishercode) {
        this.publishercode = publishercode;
    }

    @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL)
    public Set<Catalogrecord> getCatalogrecords() {
        return Catalogrecords;
    }
    

    
    
    public String getPublisherCode() {
        return publishercode;
    }


    public Publisher()
    {
        
    }

    
    
    @Override
    public String toString() {
        return "{" + super.toString() + "Publisher{publishercode=" + publishercode + '}';
    }
    
    
}
