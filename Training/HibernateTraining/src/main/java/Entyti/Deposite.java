package Entyti;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "DEPOSITS")
public class Deposite {


    private Long id;
    private BigDecimal sum;
    private LocalDate startDate;
    private LocalDate expirationDate;
    private Integer proccent;
    private MoneyAcount acountId;


    public Deposite() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "sum")
    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }
    @Column(name = "expiration_date")
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
    @Column(name = "start_date")
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Column(name = "proccent")
    public Integer getProccent() {
        return proccent;
    }

    public void setProccent(Integer proccent) {
        this.proccent = proccent;
    }

    @ManyToOne
    public MoneyAcount getAcountId() {
        return acountId;
    }

    public void setAcountId (MoneyAcount acountId) {
        this.acountId = acountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Deposite)) return false;

        Deposite deposite = (Deposite) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(id, deposite.id)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
                .append(id)
                .toHashCode();
    }
}
