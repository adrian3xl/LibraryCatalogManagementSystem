/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;
import Domain.Person;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *
 * @author Adrian
 */

@Entity
@Table(name="customer")
public class Customer extends Person {

    @Column(name="phonenumber")
    private String phonenumber;
      @Column(name="address")
    private String address;
      @Column(name="customercode")
    private String customercode;

       private Set<Catalogloanrecord> Catalogloanrecords;
      
        @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    public Set<Catalogloanrecord> getCatalogloanrecords() {
        return Catalogloanrecords;
    }
      
    public Customer(int id, String fname, String lname, String address, String customercode, String phonenumber ) {
        this.customercode = customercode;
        this.setFname(fname);
        this.setLname(lname);
        this.phonenumber=phonenumber;
        this.address=address;
        this.setId(id);

    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCustomercode(String customercode) {
        this.customercode = customercode;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public String getCustomercode() {
        return customercode;
    }

    public Customer(){

}
  @Override
    public String toString() {
        return "{" + super.toString() + "Customer{phonenumber=" + phonenumber + ", address=" + address + ", customercode=" + customercode + '}';
    }


}