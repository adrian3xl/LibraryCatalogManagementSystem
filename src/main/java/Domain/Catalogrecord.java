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
import java.util.Date;		
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**	
 *	
 * @author Adrian	
 */	

@Entity	
@Table(name="catalogrecord")	
public class Catalogrecord {	


    @Id	
    @Column(name="title")
     private String title;
    private int id;
    
    private Set<Catalogloanrecord> Catalogloanrecords; 
    
    
   	
    
    @Column(name="datereleased")	
    private Date datereleased;	
    
    @Column(name="conditionstatement")	
    private String conditionstatement;	
    
    @Column(name="catalogcode")	
    private String catalogcode;	

     private Genre genre;
    private Documenttype documenttype;
     private Author author;
     private Publisher publisher;
    
     
     @OneToMany(mappedBy = "catalogrecord", cascade = CascadeType.ALL)
    public Set<Catalogloanrecord> getCatalogloanrecords() {
        return Catalogloanrecords;
    }
    public Catalogrecord(){	
    }	

public Catalogrecord(String title, Date datereleased,String conditionstatement,String catalogcode,Genre genre,Documenttype documenttype,Author author,Publisher publisher){
    this.title=title;
    this.author=author;
    this.publisher=publisher;
    this.genre=genre;
    this.documenttype=documenttype;
    this.datereleased=datereleased;
    this.conditionstatement=conditionstatement;

    }
@Id
    @Column(name = "id")
    @GeneratedValue
    public long getId() {
        return id;
    }
    
    @ManyToOne
    @JoinColumn(name = "author_id")
    public Author getAuthor() {
        return author;
    }
 
    @ManyToOne
    @JoinColumn(name = "genre_id")
    public Genre getGenre() {
        return genre;
    }

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    public Publisher getPublisher() {
        return publisher;
    }
    
    @ManyToOne
    @JoinColumn(name = "documenttype_id")
    public Documenttype getDocumenttype() {
        return documenttype;
    }
    
    public  String getTitle() {	
        return title;	
    }	
    
    public  Date getDatereleased() {	
        return datereleased;	
    }	
    
     public  String getConditionstatement() {	
        return conditionstatement;	
    }	

    public String getCatalogcode() {
        return catalogcode;
    }
    
     
   public void setTitle(String title) {	
        this.title = title;	
    }	 
       
         public void setDatereleased(Date datereleased) {	
        this.datereleased = datereleased;	
    }	 
      
     public void setConditionstatement(String conditionstatement) {	
        this.conditionstatement = conditionstatement;	
    }	 
       
     public void setId(int id) {
        this.id = id;
    }

    public void setCatalogcode(String catalogcode) {
        this.catalogcode = catalogcode;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setDocumenttype(Documenttype documenttype) {
        this.documenttype = documenttype;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    
     
}