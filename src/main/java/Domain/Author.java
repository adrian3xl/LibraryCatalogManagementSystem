/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
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
    
    public Author(int id, String fname, String lname, String authorcode) {
        this.authorcode = authorcode;
        this.setFname(fname);
        this.setLname(lname);
        this.setId(id);
       
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
