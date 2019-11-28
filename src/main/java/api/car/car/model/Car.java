package api.car.car.model;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class Car {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String brand;
    private String model;

    @Column(unique=true)
    private String imat;

    private String color;
    private Integer prixBase;
    private Integer prixKm;
    private Integer chevauxFiscaux;

    public Car (){}

    public Car(String model, String brand, Integer id,String imat, String color, Integer prixBase, Integer prixKm, Integer chevauxFiscaux) {
        this.model = model;
        this.brand = brand;
        this.id = id;
        this.imat = imat;
        this.color = color;
        this.prixBase = prixBase;
        this.prixKm = prixKm;
        this.chevauxFiscaux = chevauxFiscaux;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getImat() {
        return imat;
    }

    public void setImat(String imat) {
        this.imat = imat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrixBase() {
        return prixBase;
    }

    public void setPrixBase(Integer prixBase) {
        this.prixBase = prixBase;
    }

    public Integer getPrixKm() {
        return prixKm;
    }

    public void setPrixKm(Integer prixKm) {
        this.prixKm = prixKm;
    }

    public Integer getChevauxFiscaux() {
        return chevauxFiscaux;
    }

    public void setChevauxFiscaux(Integer chevauxFiscaux) {
        this.chevauxFiscaux = chevauxFiscaux;
    }
}