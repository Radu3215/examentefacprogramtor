package ro.tefacprogramator.m4.examen.app.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Toy")
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ToyID")
    private int toyId;

    @Column(name = "Description")
    private String description;
    
    @Column(name = "Price")
    private double price;

    @Column(name = "ToyKindID")
    private int toyKindId;

    @Column(name = "CategoryID")
    private int categoryId;

    public int getToyId() {
        return toyId;
    }

    public void setToyId(int toyId) {
        this.toyId = toyId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getToyKindId() {
        return toyKindId;
    }

    public void setToyKindId(int toyKindId) {
        this.toyKindId = toyKindId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    
}
