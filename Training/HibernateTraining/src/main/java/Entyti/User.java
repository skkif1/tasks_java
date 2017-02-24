package Entyti;



import javax.persistence.*;


@Entity
@Table(name = "user")
public class User {


    private Long id;
    private String name;
    private String lastName;
    private String phone;
    private String email;
    private MoneyAcount acount;



    public User() {
    }

    public User(String name, String lastName, String phone, String email, MoneyAcount acount) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.acount = acount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NAME", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "EMAIL", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "LASTNAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "PHONE", nullable = false)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @OneToOne(cascade = CascadeType.ALL)
    public MoneyAcount getAcount() {
        return acount;
    }

    public void setAcount(MoneyAcount acount) {
        this.acount = acount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof User)) return false;

        User user = (User) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(id, user.id)
                .append(name, user.name)
                .append(lastName, user.lastName)
                .append(phone, user.phone)
                .append(email, user.email)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
                .append(id)
                .append(name)
                .append(lastName)
                .append(phone)
                .append(email)
                .toHashCode();
    }
}
