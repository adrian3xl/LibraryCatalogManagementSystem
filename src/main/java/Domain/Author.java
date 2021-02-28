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
@Table(name="author")
public class Author extends Person{
  
    
    @Column(name="authorcode")
    private String authorcode;
    
    private Set<Catalogrecord> Catalogrecords;
    
    public Author(int id, String fname, String lname, String authorcode) {
        this.authorcode = authorcode;
        this.setFname(fname);
        this.setLname(lname);
        this.setId(id);
       
    }
    
    
     @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    public Set<Catalogrecord> getCatalogrecords() {
        return Catalogrecords;
    }
    

    public void setAuthorCode(String authorcode) {
        this.authorcode = authorcode;
    }


    public String getAuthorCode() {
        return authorcode;
    }

   
    
    

    public Author()
    {
        
    }

    
    
    @Override
    public String toString() {
        return "{" + super.toString() + "Author{authorcode=" + authorcode + '}';
    }
    
    
}
