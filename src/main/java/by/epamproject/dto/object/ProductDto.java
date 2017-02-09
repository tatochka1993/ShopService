package by.epamproject.dto.object;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class ProductDto implements Serializable {

    @Expose
    private int id;
    @Expose
    private String nameProduct;
    @Expose
    private String description;
    @Expose
    private String nameImage;
    @Expose
    private String serverNameImage;
    @Expose
    private double price;

    public ProductDto() {
    }

    public ProductDto(int id, String nameProduct, String description, String nameImage, String serverNameImage) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.description = description;
        this.nameImage = nameImage;
        this.serverNameImage = serverNameImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNameImage() {
        return nameImage;
    }

    public void setNameImage(String nameImage) {
        this.nameImage = nameImage;
    }

    public String getServerNameImage() {
        return serverNameImage;
    }

    public void setServerNameImage(String serverNameImage) {
        this.serverNameImage = serverNameImage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", description='" + description + '\'' +
                ", nameImage='" + nameImage + '\'' +
                ", serverNameImage='" + serverNameImage + '\'' +
                ", price=" + price +
                '}';
    }
}
