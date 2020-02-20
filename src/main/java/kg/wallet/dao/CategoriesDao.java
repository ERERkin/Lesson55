package kg.wallet.dao;

import kg.wallet.model.Category;
import kg.wallet.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoriesDao {
    public boolean addCategories(Category category) throws SQLException {
        String SQL = "insert into categories(name, user_id, category_id, is_active, create_date)\n" +
                " VALUES (?,?,?,?,?);";
        try (Connection connection = DB.connect();
             PreparedStatement statement = connection.prepareStatement(SQL);) {
            statement.setString(1, category.getName());
            statement.setInt(2, category.getUserId());
            statement.setInt(2, category.getCategoryId());
            statement.setBoolean(4, category.isActive());
            statement.setDate(5,category.getCreatedDate());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
