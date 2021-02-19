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
import javax.persistence.Table;	
import java.util.Date;	
import javax.persistence.Id;	

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

    private int genre_id;	

    private int documenttype_id;	

    private int author_id;	

    private int publisher_id;	

    @Column(name="datereleased")	
    private Date datereleased;	
    @Column(name="conditionstatement")	
    private String conditionstatement;	
    @Column(name="catalogcode")	
    private String catalogcode;	


    private Catalogrecord(){	
    }	


}