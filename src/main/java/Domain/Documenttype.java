/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;
import java.io.Serializable;	
import javax.persistence.Column;	
import javax.persistence.Entity;	
//import com.mycompany.librarycatalogmanagementsystem.*;	
import java.util.Set;	
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *
 * @author Adrian
 */

@Entity	
@Table(name="documenttype")
public class Documenttype implements Serializable {
  
      @Id	
    @Column(name="name")
       private int id;
    private String name;	

      private Set<Catalogrecord> Catalogrecords;
      
    public Documenttype( String name) {	
        this.name=name;
  
    }	

    @Id
    @Column(name = "id")
    @GeneratedValue
    public long getId() {
        return id;
    }

    
      @OneToMany(mappedBy = "documenttype", cascade = CascadeType.ALL)
    public Set<Catalogrecord> getCatalogrecords() {
        return Catalogrecords;
    }
    

    public Documenttype(){	
    }	

    public void setName(String name) {	
        this.name = name;	
    }	

    public String getName() {	
        return name;	
    }	

    public void setId(int id) {
        this.id = id;
    }
    
    

   @Override	
    public String toString() {	
        return "Documenttype{" + "name=" + name + '}';	
    }	
}