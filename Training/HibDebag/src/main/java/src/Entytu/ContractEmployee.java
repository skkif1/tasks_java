package src.Entytu;

import javax.persistence.*;

@Entity
@Table(name = "contract_employee")
@PrimaryKeyJoinColumn(name = "user_id")
public class ContractEmployee extends Emplyee {

    private String test;
    private Taskmaster master;

    public ContractEmployee() {

    }

    @Column(name = "test")
    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

}