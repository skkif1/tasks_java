package src.Entytu;

import javax.persistence.*;


@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
public class Emplyee {

    private Integer userId;
    private String name;
    private String lastName;
    private Integer age;

    public Emplyee() {
    }

    public Emplyee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }


    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
