package com.xanlarisayev.ResumeApp.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Practic {
    private int id;
    private int idProfile;
    private String position;
    private String company;
    private Date beginDate;
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
    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "begin_date")
    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
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

        Practic practic = (Practic) o;

        if (id != practic.id) return false;
        if (idProfile != practic.idProfile) return false;
        if (position != null ? !position.equals(practic.position) : practic.position != null) return false;
        if (company != null ? !company.equals(practic.company) : practic.company != null) return false;
        if (beginDate != null ? !beginDate.equals(practic.beginDate) : practic.beginDate != null) return false;
        if (finishDate != null ? !finishDate.equals(practic.finishDate) : practic.finishDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idProfile;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (beginDate != null ? beginDate.hashCode() : 0);
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
