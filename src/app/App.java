package app;

import java.util.List;
import java.util.Scanner;
import dao.DishesDao;
import dao.RestaurantsDao;
import dao.UsersDao;
import entity.Dishes;
import entity.Restaurants;
import entity.Users;

public class App {
	private Scanner scan = new Scanner(System.in);
	private UsersDao userDao = new UsersDao();
	private RestaurantsDao restaDao = new RestaurantsDao();
	private DishesDao dishDao = new DishesDao();

	public static void main(String[] args) {
		new App().runMenu();	
	}

	private void runMenu() {
		boolean end = false;
		while(!end) {
			printMenu();
			
			try {
				int selection = readIntInput("Input a selection");
				
				switch(selection) {
				case 1:
					readUsers();
					break;
				case 2:
					createUsers();
					break;
				case 3:
					updateUsers();
					break;
				case 4:
					deleteUsers();
					break;
				case 5:
					readResta();
					break;
				case 6:
					createResta();
					break;
				case 7:
					updateResta();
					break;
				case 8:
					deleteResta();
					break;
				case 9:
					readDishes();
					break;
				case 10:
					createDishes();
					break;
				case 11:
					updateDishes();
					break;
				case 12:
					deleteDishes();
					break;
				case 99:
					System.out.println("Goodbye!");
					end = true;
					break;
				default:
					System.out.println("Input is not valid.");
					System.out.println("***");
					break;
				}
			}
			catch(Exception e) {
				System.out.println("Caught exception" + e.toString());
				end = true;
			}
		}		
	}

	private String readStringInput(String string) {
		System.out.println();
		System.out.println(string + ": ");
		return scan.nextLine();
	}

	private int readIntInput(String string) {
		try {
			System.out.println();
			System.out.println(string + ": ");
			return Integer.parseInt(scan.nextLine());
		} catch(Exception e) {
			System.out.println("An error occured: " + e.toString());
			return 99;
		}
	}
	
	private double readDoubleInput(String string) {
		try {
			System.out.println();
			System.out.println(string + ": ");
			return Double.parseDouble(scan.nextLine());
		} catch(Exception e) {
			System.out.println("An error occured: " + e.toString());
			return 99;
		}
	}

	private void deleteDishes() {
		System.out.println("****");
		System.out.println("You selected delete dishes");
		int dishId = readIntInput("Enter dish ID: ");
		
		DishesDao.deleteDish(dishId);
		System.out.println();
		
	}

	private void updateDishes() {
		System.out.println("***");
		System.out.println("You selected update dishes");
		int dishId = readIntInput("Enter Dish ID: ");
		String dishName = readStringInput("Enter name: ");
		String orderDate = readStringInput ("Enter Date Ordered: ");
		String dishComment = readStringInput ("Enter a Comment: ");
		double dishPrice = readDoubleInput ("Enter the Dish Price: ");
		int dishScore = readIntInput("Enter a Dish Score");
		
		DishesDao.updateDish(dishId, dishName, orderDate, 
			dishComment, dishPrice, dishScore);
		System.out.println("Dish has been updated");
		
	}


	private void createDishes() {
		System.out.println("***");
		System.out.println("You selected add a dish");
		int dishId = readIntInput("Enter Dish ID: ");
		String dishName = readStringInput("Enter name: ");
		String orderDate = readStringInput ("Enter Date Ordered: ");
		String dishComment = readStringInput ("Enter a Comment: ");
		double dishPrice = readDoubleInput ("Enter the Dish Price: ");
		int dishScore = readIntInput("Enter a Dish Score (0-9)");
		
		DishesDao.createDish(dishId, dishName, orderDate, 
			dishComment, dishPrice, dishScore);
		System.out.println("Dish has been added");
		
	}

	private void readDishes() {
		System.out.println("You selected List Dishes...");
		List<Dishes> dishes = DishesDao.findDishes();
		
		System.out.println("***");
		System.out.println("Here are the dishes: ");
		
		if(dishes.isEmpty()) {
			System.out.println("There is no data!");
		} else {
			for(Dishes dish : dishes) {
				System.out.println(dish.getDishId() + " Name: " + dish.getDishName() + " Price: " +
			dish.getDishPrice() + " Ordered: " + dish.getOrderDate() + " Score: " + 
						dish.getDishScore() + " Comment: " + dish.getDishComment()); 
			}
		}
		
	}

	private void deleteResta() {
		System.out.println("****");
		System.out.println("You selected delete dishes");
		int restaId = readIntInput("Enter Restaurant ID: ");
		
		RestaurantsDao.deleteResta(restaId);
		System.out.println();
		
	}

	private void updateResta() {
		System.out.println("***");
		System.out.println("You selected update restaurants");
		int restaId = readIntInput("Enter Restaurant ID: ");
		String restaName = readStringInput("Enter Restaurant name: ");
		String restaCity = readStringInput ("Enter City: ");
		String visitDate = readStringInput ("Enter Date Visited: ");
		int restaScore = readIntInput("Enter a Restaurant Score (0-9)");
		
		RestaurantsDao.updateResta(restaId, restaName, restaCity, 
			visitDate, restaScore);
		System.out.println("Restaurant has been updated");
		
	}

	private void createResta() {
		System.out.println("***");
		System.out.println("You selected add restaurants");
		int restaId = readIntInput("Enter Restaurant ID: ");
		String restaName = readStringInput("Enter Restaurant name: ");
		String restaCity = readStringInput ("Enter City: ");
		String visitDate = readStringInput ("Enter Date Visited: ");
		int restaScore = readIntInput("Enter a Restaurant Score (0-9)");
		
		RestaurantsDao.createResta(restaId, restaName, restaCity, 
			visitDate, restaScore);
		System.out.println("Restaurant has been added");
		
	}

	private void readResta() {
		System.out.println("You selected List Restaurants...");
		List<Restaurants> resta = RestaurantsDao.findRestas();
		
		System.out.println("***");
		System.out.println("Here are the Restaurants: ");
		
		if(resta.isEmpty()) {
			System.out.println("There is no data!");
		} else {
			for(Restaurants resta : restas) {
				System.out.println(resta.getRestaId() + " Name: " + resta.getRestaName() + " City: " +
			resta.getRestaCity() + " Date Visited: " + resta.getVisitDate() + " Score: " + 
						resta.getRestaScore()); 
			}
		}
	}

	private void deleteUsers() {
		System.out.println("****");
		System.out.println("You selected delete user");
		int userId = readIntInput("Enter User ID: ");
		
		UsersDao.deleteUser(userId);
		System.out.println();
		
	}

	private void updateUsers() {
		System.out.println("***");
		System.out.println("You selected update users");
		int userId = readIntInput("Enter User ID: ");
		String firstName = readStringInput("Enter first name: ");
		String lastName = readStringInput("Enter last name: ");
		String email = readStringInput ("Enter email: ");
		String userName = readStringInput ("Enter user name: ");
		String userBio = readStringInput("Enter Bio: ");
		String password = readStringInput("Enter password: ");
		
		UsersDao.updateUser(userId, firstName, lastName, email, userName,  
			userBio, password);
		System.out.println("user has been updated");
		
	}

	private void createUsers() {
		System.out.println("***");
		System.out.println("You selected add a user");
		int userId = readIntInput("Enter User ID: ");
		String firstName = readStringInput("Enter first name: ");
		String lastName = readStringInput("Enter last name: ");
		String email = readStringInput ("Enter email: ");
		String userName = readStringInput ("Enter user name: ");
		String userBio = readStringInput("Enter Bio: ");
		String password = readStringInput("Enter password: ");
		
		UsersDao.createUser(userId, firstName, lastName, email, userName,  
			userBio, password);
		System.out.println("user has been added");

		
	}

	private void readUsers() {
		System.out.println("You selected List Restaurants...");
		List<Users> user = UsersDao.findUsers();
		
		System.out.println("***");
		System.out.println("Here are the Users: ");
		
		if(user.isEmpty()) {
			System.out.println("There is no data!");
		} else {
			for(Users user : users) {
				System.out.println(user.getUserId() + " first name: " + user.getFirstName() + " last name: " +
			user.getLastName() + " email: " + user.getEmail() + " username: " + 
					user.getUserName() + " bio: " + user.getUserBio() + " password: " + user.getPassword()); 
			}
		}

	}

	private void printMenu() {
		System.out.println("**What would you like to access?**");
		System.out.println("**1: List All Users");
		System.out.println("**2: Add a User");
		System.out.println("**3: Modify User Info");
		System.out.println("**4: Delete User Info");
		System.out.println("**5: List All Restaurants");
		System.out.println("**6: Add a Restaurant");
		System.out.println("**7: Modify Restaurant Info");
		System.out.println("**8: Delete Restaurant Info");
		System.out.println("**9: List All Dishes");
		System.out.println("*10: Add a Dish");
		System.out.println("*11: Modify Dish Info");
		System.out.println("*12: Delete Dish Info");
		System.out.println("*99: Exit the application");	
	}

}
