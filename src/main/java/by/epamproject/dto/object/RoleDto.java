package by.epamproject.dto.object;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class RoleDto implements Serializable {

    @Expose
    private int id;
    @Expose
    private String name;

    public RoleDto() {
    }

    public RoleDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RoleDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
