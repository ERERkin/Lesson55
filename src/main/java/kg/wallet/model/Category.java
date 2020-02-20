package kg.wallet.model;


import java.sql.Date;

public class Category {
    private int id;
    private String name;
    private int userId;
    private int categoryId;
    private boolean isActive;
    private Date createdDate;

    public Category(int id, String name, int userId, int categoryId, boolean isActive, Date createdDate) {
        this.id = id;
        this.name = name;
        this.userId = userId;
        this.categoryId = categoryId;
        this.isActive = isActive;
        this.createdDate = createdDate;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
