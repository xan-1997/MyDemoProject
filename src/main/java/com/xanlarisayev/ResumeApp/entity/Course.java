package com.xanlarisayev.ResumeApp.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Course {
    private int id;
    private int idProfile;
    private String name;
    private String school;
    private Date finishDate;
    private Profile profileByIdProfile;

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
    @Column(name = "id_profile")
    public int getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(int idProfile) {
        this.idProfile = idProfile;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "school")
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Basic
    @Column(name = "finish_date")
    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (id != course.id) return false;
        if (idProfile != course.idProfile) return false;
        if (name != null ? !name.equals(course.name) : course.name != null) return false;
        if (school != null ? !school.equals(course.school) : course.school != null) return false;
        if (finishDate != null ? !finishDate.equals(course.finishDate) : course.finishDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idProfile;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (school != null ? school.hashCode() : 0);
        result = 31 * result + (finishDate != null ? finishDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_profile", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Profile getProfileByIdProfile() {
        return profileByIdProfile;
    }

    public void setProfileByIdProfile(Profile profileByIdProfile) {
        this.profileByIdProfile = profileByIdProfile;
    }
}
