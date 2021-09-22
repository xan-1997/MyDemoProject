package com.xanlarisayev.ResumeApp.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Education {
    private int id;
    private int idProfile;
    private Date beginYear;
    private Date finishYear;
    private String university;
    private String faculty;
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
    @Column(name = "begin_year")
    public Date getBeginYear() {
        return beginYear;
    }

    public void setBeginYear(Date beginYear) {
        this.beginYear = beginYear;
    }

    @Basic
    @Column(name = "finish_year")
    public Date getFinishYear() {
        return finishYear;
    }

    public void setFinishYear(Date finishYear) {
        this.finishYear = finishYear;
    }

    @Basic
    @Column(name = "university")
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Basic
    @Column(name = "faculty")
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Education education = (Education) o;

        if (id != education.id) return false;
        if (idProfile != education.idProfile) return false;
        if (beginYear != education.beginYear) return false;
        if (finishYear != null ? !finishYear.equals(education.finishYear) : education.finishYear != null) return false;
        if (university != null ? !university.equals(education.university) : education.university != null) return false;
        if (faculty != null ? !faculty.equals(education.faculty) : education.faculty != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idProfile;
        result = 31 * result + (finishYear != null ? finishYear.hashCode() : 0);
        result = 31 * result + (university != null ? university.hashCode() : 0);
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
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
