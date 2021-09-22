package com.xanlarisayev.ResumeApp.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "Profile")
public class Profile {
    private int id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String phone;
    private String email;
    private String country;
    private String city;
    private String objective;
    private String summary;
    private String info;
    private String password;
    private String github;
    private String linkedin;
    private String facebook;

    private List<Course> coursesById;
    private List<Education> educationsById;
    private List<Hobby> hobbiesById;
    private List<Language> languagesById;
    private List<Practic> practicsById;
    private List<Skill> skillsById;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "birth_day")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "objective")
    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    @Basic
    @Column(name = "summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "info")
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "github")
    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    @Basic
    @Column(name = "linkedin")
    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    @Basic
    @Column(name = "facebook")
    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Profile profile = (Profile) o;

        if (id != profile.id) return false;
        if (firstName != null ? !firstName.equals(profile.firstName) : profile.firstName != null) return false;
        if (lastName != null ? !lastName.equals(profile.lastName) : profile.lastName != null) return false;
        if (birthday != null ? !birthday.equals(profile.birthday) : profile.birthday != null) return false;
        if (phone != null ? !phone.equals(profile.phone) : profile.phone != null) return false;
        if (email != null ? !email.equals(profile.email) : profile.email != null) return false;
        if (country != null ? !country.equals(profile.country) : profile.country != null) return false;
        if (city != null ? !city.equals(profile.city) : profile.city != null) return false;
        if (objective != null ? !objective.equals(profile.objective) : profile.objective != null) return false;
        if (summary != null ? !summary.equals(profile.summary) : profile.summary != null) return false;
        if (info != null ? !info.equals(profile.info) : profile.info != null) return false;
        if (password != null ? !password.equals(profile.password) : profile.password != null) return false;
        if (github != null ? !github.equals(profile.github) : profile.github != null) return false;
        if (linkedin != null ? !linkedin.equals(profile.linkedin) : profile.linkedin != null) return false;
        if (facebook != null ? !facebook.equals(profile.facebook) : profile.facebook != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (objective != null ? objective.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (info != null ? info.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (github != null ? github.hashCode() : 0);
        result = 31 * result + (linkedin != null ? linkedin.hashCode() : 0);
        result = 31 * result + (facebook != null ? facebook.hashCode() : 0);
        return result;
    }


    @OneToMany(mappedBy = "profileByIdProfile")
    public List<Course> getCoursesById() {
        return coursesById;
    }

    public void setCoursesById(List<Course> coursesById) {
        this.coursesById = coursesById;
    }

    @OneToMany(mappedBy = "profileByIdProfile")
    public List<Education> getEducationsById() {
        return educationsById;
    }

    public void setEducationsById(List<Education> educationsById) {
        this.educationsById = educationsById;
    }

    @OneToMany(mappedBy = "profileByIdProfile")
    public List<Hobby> getHobbiesById() {
        return hobbiesById;
    }

    public void setHobbiesById(List<Hobby> hobbiesById) {
        this.hobbiesById = hobbiesById;
    }

    @OneToMany(mappedBy = "profileByIdProfile")
    public List<Language> getLanguagesById() {
        return languagesById;
    }

    public void setLanguagesById(List<Language> languagesById) {
        this.languagesById = languagesById;
    }

    @OneToMany(mappedBy = "profileByIdProfile")
    public List<Practic> getPracticsById() {
        return practicsById;
    }

    public void setPracticsById(List<Practic> practicsById) {
        this.practicsById = practicsById;
    }

    @OneToMany(mappedBy = "profileByIdProfile")
    public List<Skill> getSkillsById() {
        return skillsById;
    }

    public void setSkillsById(List<Skill> skillsById) {
        this.skillsById = skillsById;
    }
}
