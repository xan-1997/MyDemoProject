package com.xanlarisayev.ResumeApp.entity;

import javax.persistence.*;

@Entity
public class Hobby {
    private int id;
    private int idProfile;
    private String name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hobby hobby = (Hobby) o;

        if (id != hobby.id) return false;
        if (idProfile != hobby.idProfile) return false;
        if (name != null ? !name.equals(hobby.name) : hobby.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idProfile;
        result = 31 * result + (name != null ? name.hashCode() : 0);
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
