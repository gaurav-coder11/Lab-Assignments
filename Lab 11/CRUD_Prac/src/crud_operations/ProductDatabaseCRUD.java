package crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductDatabaseCRUD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 // Load the MySQL JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "root")) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Choose an operation:");
                System.out.println("1. Create product");
                System.out.println("2. Read product");
                System.out.println("3. Update product");
                System.out.println("4. Delete product");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        createProduct(connection, scanner);
                        break;
                    case 2:
                        readProduct(connection, scanner);
                        break;
                    case 3:
                        updateProduct(connection, scanner);
                        break;
                    case 4:
                        deleteProduct(connection, scanner);
                        break;
                    case 5:
                        System.out.println("Exiting the program.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create a new product
    private static void createProduct(Connection connection, Scanner scanner) throws SQLException {
    	System.out.print("Enter product ID: ");
    	int id = scanner.nextInt();
        System.out.print("Enter product name: ");
        String name = scanner.next();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        
        // SQL query to insert a new product into the database
        String insertQuery = "INSERT INTO products (id,name, price) VALUES (?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
        	preparedStatement.setInt(1, id);
        	preparedStatement.setString(2, name);
            preparedStatement.setDouble(3, price);
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Product created successfully.");
            } else {
                System.out.println("Failed to create the product.");
            }
        }
    }

    // Read a product
    private static void readProduct(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        // SQL query to retrieve product details by ID
        String selectQuery = "SELECT * FROM products WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
            preparedStatement.setInt(1, productId);
            ResultSet resultSet =  preparedStatement.executeQuery();
            if (resultSet.next()) {
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                System.out.println("Product ID: " + productId);
                System.out.println("Product Name: " + name);
                System.out.println("Product Price: " + price);
            } else {
                System.out.println("Product not found.");
            }
        }
    }

    // Update a product
    private static void updateProduct(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter product ID to update: ");
        int productId = scanner.nextInt();
        System.out.print("Enter new product name: ");
        String newName = scanner.next();
        System.out.print("Enter new product price: ");
        double newPrice = scanner.nextDouble();
        // SQL query to update a product
        String updateQuery = "UPDATE products SET name = ?, price = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, newName);
            preparedStatement.setDouble(2, newPrice);
            preparedStatement.setInt(3, productId);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Product updated successfully.");
            } else {
                System.out.println("Failed to update the product.");
            }
        }
    }

    // Delete a product
    private static void deleteProduct(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter product ID to delete: ");
        int productId = scanner.nextInt();
        // SQL query to delete a product by ID
        String deleteQuery = "DELETE FROM products WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, productId);
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Product deleted successfully.");
            } else {
                System.out.println("Failed to delete the product.");
            }
        }
    }
}