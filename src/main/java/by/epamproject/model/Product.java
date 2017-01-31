package by.epamproject.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

    @Id
    @Column(name = "ID_PRODUCT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty
    @Column(name = "NAME_PRODUCT", length = 56, nullable = false)
    private String nameProduct;

    @NotEmpty
    @Column(name = "DESCRIPTION", length = 80, nullable = false)
    private String description;

    @NotEmpty
    @Column(name = "NAME_IMAGE", length = 80, nullable = false)
    private String nameImage;

    @NotEmpty
    @Column(name = "SERVER_NAME_IMAGE", length = 80, nullable = false)
    private String serverNameImage;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (!nameProduct.equals(product.nameProduct)) return false;
        if (!description.equals(product.description)) return false;
        if (!nameImage.equals(product.nameImage)) return false;
        return serverNameImage.equals(product.serverNameImage);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nameProduct.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + nameImage.hashCode();
        result = 31 * result + serverNameImage.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", description='" + description + '\'' +
                ", nameImage='" + nameImage + '\'' +
                ", serverNameImage='" + serverNameImage + '\'' +
                '}';
    }
}


