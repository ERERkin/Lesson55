package kg.wallet.dao;

import kg.wallet.model.User;

import java.sql.*;
import java.time.LocalTime;
import java.util.ArrayList;

import static java.time.LocalDateTime.now;


public class UserDao {
    public boolean addUser(User user) throws SQLException {
        String SQL = "insert into users(name, password, create_date) values (?,?,?)";
        try (Connection connection = DB.connect();
             PreparedStatement statement = connection.prepareStatement(SQL);) {
            statement.setString(1, user.getName());
            statement.setString(2,user.getPassword());
            statement.setTimestamp(3, Timestamp.valueOf(now()));
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateUser(User user) throws SQLException {
        String SQL = "update users set name = ?, password = ? where id = ?;";
        try (Connection connection = DB.connect();
             PreparedStatement statement = connection.prepareStatement(SQL);) {
            statement.setString(1, user.getName());
            statement.setString(2,user.getPassword());
            statement.setInt(3, user.getId());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteUser(User user) throws SQLException {
        String SQL = "delete from users where id = ?;";
        try (Connection connection = DB.connect();
             PreparedStatement statement = connection.prepareStatement(SQL);) {
            statement.setInt(1, user.getId());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<User> getUsers(){
        ArrayList<User> arrayList = new ArrayList<>();
        String SQL = "select * from users";
        try (Connection connection = DB.connect();
             PreparedStatement statement = connection.prepareStatement(SQL);) {
            try(ResultSet rs = statement.executeQuery()) {
                while (rs.next()){
                    arrayList.add(new User(rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("password"),
                            rs.getDate("create_date")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public User getUser(int id){
        User user = null;
        String SQL = "select * from users where id = ?";
        try (Connection connection = DB.connect();
             PreparedStatement statement = connection.prepareStatement(SQL);) {
            try(ResultSet rs = statement.executeQuery()) {
                rs.next();
                user = new User(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("password"),
                        rs.getDate("create_date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
