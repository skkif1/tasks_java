package src.Entytu;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "head_user")
@PrimaryKeyJoinColumn(name = "user_id")
public class Taskmaster extends Emplyee {


    private String department;
    private Set<ContractEmployee> subornates;

    public Taskmaster() {
    }


    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
