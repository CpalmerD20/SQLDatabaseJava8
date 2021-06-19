package app;

import java.util.Scanner;

public class App {
	private Scanner scan = new Scanner(System.in);
//	private UserDao userDao = new UserDao();
//	private RestaDao restaDao = new RestaDao();
//	private DishDao dishDao = new Dishdao();

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

	private void deleteDishes() {
		// TODO Auto-generated method stub
		
	}

	private void updateDishes() {
		// TODO Auto-generated method stub
		
	}

	private void createDishes() {
		// TODO Auto-generated method stub
		
	}

	private void readDishes() {
		System.out.println("Listing Dishes...");
		
	}

	private void deleteResta() {
		// TODO Auto-generated method stub
		
	}

	private void updateResta() {
		// TODO Auto-generated method stub
		
	}

	private void createResta() {
		// TODO Auto-generated method stub
		
	}

	private void readResta() {
		System.out.println("Listing Restaurants...");
		
	}

	private void deleteUsers() {
		// TODO Auto-generated method stub
		
	}

	private void updateUsers() {
		// TODO Auto-generated method stub
		
	}

	private void createUsers() {
		System.out.println("You selected add a user");
		String add = readStringInput("Enter")
		
	}

	private void readUsers() {
		System.out.println("Listing Users...");
		List<Users> users = userDao.findAllUsers();

		System.out.println();
		System.out.println("User List: ");
		
		if(users.isEmpty()) {
			System.out.println("No Users");
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
