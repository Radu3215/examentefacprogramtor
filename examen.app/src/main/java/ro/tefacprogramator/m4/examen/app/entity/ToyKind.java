package ro.tefacprogramator.m4.examen.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "ToyKind")
public class ToyKind {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ToyKindID")
    private int idCategory;

    @Column(name = "ToyKindName")
    private String toyKindName;

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getToyKindName() {
        return toyKindName;
    }

    public void setToyKindName(String toyKindName) {
        this.toyKindName = toyKindName;
    }

    
}
