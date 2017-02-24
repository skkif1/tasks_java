package Entyti;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "money_acounts")
public class MoneyAcount {

    long id;
    private  List<Deposite> deposits;

    public MoneyAcount() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @OneToMany(mappedBy = "acountId", cascade = CascadeType.ALL)
    public List<Deposite> getDeposits() {
        return deposits;
    }


    public void setDeposits(List<Deposite> deposits) {
        this.deposits = deposits;
    }


}
