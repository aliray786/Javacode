package in.timesinternet.punjiup.entity;

import in.timesinternet.punjiup.entity.enumaration.transactionStatus;
import in.timesinternet.punjiup.entity.enumaration.transactionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer transactionId;
    @Column(nullable = false)
    private Date executeDate = new Date();
    @Column(nullable = false)
    private Double totalShares;
    @Column(nullable = false)
    private Double nav;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private transactionType transactionType;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private transactionStatus transactionStatus;
    @Column(nullable = false)
    private Double amount;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Customer customer;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private FundDetails fundDetails;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
}
