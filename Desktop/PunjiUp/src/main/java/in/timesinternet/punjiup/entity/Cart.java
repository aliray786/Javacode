package in.timesinternet.punjiup.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*@Entity
public class Cart {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Integer cartId;
    @CreationTimestamp
    Date createdAt;
    @UpdateTimestamp
    Date updatedAt;
    @OneToOne
    Customer customer;
    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
    List<Transaction>transactionList=new ArrayList<>();
    void addTransaction(Transaction transaction)
    {
        transactionList.add(transaction);
        transaction.setCart(this);
    }

}
*/