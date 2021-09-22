package com.xanlarisayev.ResumeApp.entity;

import javax.persistence.*;

@Entity
public class Skill {
    private int id;
    private int idProfile;
    private String category;
    private String value;
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
    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Skill skill = (Skill) o;

        if (id != skill.id) return false;
        if (idProfile != skill.idProfile) return false;
        if (category != null ? !category.equals(skill.category) : skill.category != null) return false;
        if (value != null ? !value.equals(skill.value) : skill.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idProfile;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
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

    @Override
    public String toString() {
        return idProfile+" "+category+" "+value+"\n";
    }
}
