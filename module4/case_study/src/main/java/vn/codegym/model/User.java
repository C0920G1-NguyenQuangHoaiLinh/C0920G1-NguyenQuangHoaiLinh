package vn.codegym.model;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name = "USER_PK", columnNames = "User_Name")})
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id",nullable = false)
    private Long id;

    @Column(name = "user_name",length = 36,nullable = false)
    private String userName;

    @Column(length = 128,nullable = false)
    private String password;

    @Column(name = "enabled",length = 1,nullable = false)
    private boolean isEnabled;

    public User() {
    }

    public User(Long id, String userName, String password, boolean isEnabled) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.isEnabled = isEnabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
