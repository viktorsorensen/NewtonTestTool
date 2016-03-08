// HIBERNATE USER TABLE

/**
 * Created by Viktor on 2016-03-08.
 */
import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enum getCategory() {
        return category;
    }

    public void setCategory(Enum category) {
        this.category = category;
    }

    @Id @GeneratedValue
    @Column(name = "uId")
    private int uId;

    @Column(name = "name")
    private String name;

    @Column(name = "pwd")
    private String pwd;

    @Column(name = "email")
    private String email;

    @Column(name = "category")
    private Enum category;

    public User() {}
    
    }
