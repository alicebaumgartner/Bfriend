package com.bzz.bFriend.classes;

import com.bzz.bFriend.enums.Status;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String aboutMe;
    private LocalDateTime created;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "area_id", foreignKey = @ForeignKey(name = "Area_ID_FK"))
    private Area area;

    private String street;
    private String houseNumber;
    private boolean admin;
    private Status userStatus;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "question_id", foreignKey = @ForeignKey(name = "SecurityQuestion_ID_FK"))
    private SecurityQuestion securityQuestion;
    private String answer;

    public User() {

    }

    public User(String username, String password, String aboutMe, LocalDateTime created, Area area, String street, String houseNumber, boolean admin, Status userStatus, SecurityQuestion securityQuestion, String answer) {
        super();
        this.username = username;
        this.password = password;
        this.aboutMe = aboutMe;
        this.created = created;
        this.area = area;
        this.street = street;
        this.houseNumber = houseNumber;
        this.admin = admin;
        this.userStatus = userStatus;
        this.securityQuestion = securityQuestion;
        this.answer = answer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Status getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Status userStatus) {
        this.userStatus = userStatus;
    }

    public SecurityQuestion getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(SecurityQuestion securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", aboutMe="
                + aboutMe + ", created=" + created + ", area=" + area + ", street=" + street + ", houseNumber=" + houseNumber + ", admin=" + admin + ", userStatus=" + userStatus + ", securityQuestion=" + securityQuestion + ", answer=" + answer + "]";
    }
}
