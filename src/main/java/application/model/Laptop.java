package application.model;

import java.util.Set;

public class Laptop {

    private Integer id;
    // это полное название ноутбука.
    private String fullName;
    // это производитель.
    private String vendor;
    // это серия ноутбука.
    private String series;
    //это модель ноутбука.
    private String model;
    // список подходящих блоков питания.
    private Set<Adapter>adaptersList;

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Set<Adapter> getAdaptersList() {
        return adaptersList;
    }

    public void setAdaptersList(Set<Adapter> adaptersList) {
        this.adaptersList = adaptersList;
    }

    public Laptop() {
    }
}
