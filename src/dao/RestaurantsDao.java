package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import entity.Restaurants;

public class RestaurantsDao {

	public static List<Restaurants> findRestas() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void updateResta(int restaId, String restaName, String restaCity, String visitDate, int restaScore) {
		// TODO Auto-generated method stub
		
	}

	public static void deleteResta(int restaId) {
		try(Connection connection = DbConnection.getConnection()) {
			String sql = "DELETE FROM Restaurant WHERE resta_id = ?";
			try(PreparedStatement statement = connection.prepareStatement(sql)){
				statement.setInt(1, restaId);
				statement.executeUpdate();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

	public static void createResta(String restaName, String restaCity, String visitDate, int restaScore) {
		String sql = "INSERT INTO restaurant (resta_name, resta_city, visit_date, resta_score) VALUES (?, ?, ?, ?)";
		try(Connection connection = DbConnection.getConnection()) {
			try(PreparedStatement statement = connection.prepareStatement(sql)) {
				statement.setString(1, restaName);
				statement.setString(2, restaCity);
				statement.setString(3, visitDate);
				statement.setDouble(4, restaScore);
				statement.executeUpdate();
			}
		} catch (SQLException e ) {
			throw new RuntimeException(e);
		}
		
	}

}
