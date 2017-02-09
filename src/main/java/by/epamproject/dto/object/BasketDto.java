package by.epamproject.dto.object;


import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class BasketDto implements Serializable {

    @Expose
    private int id;
    @Expose
    private int userId;
    @Expose
    private int productId;

    public BasketDto() {
    }

    public BasketDto(int id, int userId, int productId) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "BasketDto{" +
                "id=" + id +
                ", userId=" + userId +
                ", productId=" + productId +
                '}';
    }
}
