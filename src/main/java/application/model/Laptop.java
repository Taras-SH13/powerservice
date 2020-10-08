package application.model;

import javax.persistence.*;


@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    // это полное название ноутбука.
    private String fullName;
    // это производитель.
    private String vendor;
    // это серия ноутбука.
    private String series;
    //это модель ноутбука.
    private String laptopsModel;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getLaptopsModel() {
        return laptopsModel;
    }

    public void setLaptopsModel(String laptopsModel) {
        this.laptopsModel = laptopsModel;
    }

    public Laptop() {
    }

    public Laptop(String fullName, String vendor, String series, String laptopsModel) {
        this.fullName = fullName;
        this.vendor = vendor;
        this.series = series;
        this.laptopsModel = laptopsModel;
    }
}
