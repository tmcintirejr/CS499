import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Utility class for interacting with the SQLite database.
 */
public class DatabaseUtility {

    private static final String DB_URL = "jdbc:sqlite:animals.db";

    /**
     * Establishes a connection to the SQLite database.
     * @return Connection object
     * @throws SQLException if connection fails
     */
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    /**
     * Creates the Animals table if it does not already exist.
     */
    public static void createTables() {
        String sql = "CREATE TABLE IF NOT EXISTS Animals (" +
                "id TEXT PRIMARY KEY," +
                "name TEXT," +
                "family TEXT," +
                "species TEXT," +
                "gender TEXT," +
                "age TEXT," +
                "weight TEXT," +
                "acquisitionDate TEXT," +
                "acquisitionLocation TEXT," +
                "trainingStatus TEXT," +
                "reserved INTEGER," +
                "inServiceCountry TEXT," +
                "animalType TEXT," +
                "kingdomSpecificField TEXT" +
                ");";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Animals table created or already exists.");
        } catch (SQLException e) {
            System.out.println("Error creating Animals table: " + e.getMessage());
        }
    }

    /**
     * Inserts a new animal into the database.
     * @param animal RescueAnimal object to insert
     * @param kingdomSpecificField Kingdom-specific field (Tail Length, Wing Span, etc.)
     */
    public static void insertAnimal(RescueAnimal animal, String kingdomSpecificField) {
        String sql = "INSERT INTO Animals (id, name, family, species, gender, age, weight, acquisitionDate, " +
                "acquisitionLocation, trainingStatus, reserved, inServiceCountry, animalType, kingdomSpecificField) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, animal.getId());
            pstmt.setString(2, animal.getName());
            pstmt.setString(3, animal.getFamily());
            pstmt.setString(4, animal.getSpecies());
            pstmt.setString(5, animal.getGender());
            pstmt.setString(6, animal.getAge());
            pstmt.setString(7, animal.getWeight());
            pstmt.setString(8, animal.getAcquisitionDate());
            pstmt.setString(9, animal.getAcquisitionLocation());
            pstmt.setString(10, animal.getTrainingStatus());
            pstmt.setInt(11, animal.getReserved() ? 1 : 0);
            pstmt.setString(12, animal.getInServiceCountry());
            pstmt.setString(13, animal.getAnimalType());
            pstmt.setString(14, kingdomSpecificField);

            pstmt.executeUpdate();
            System.out.println("Animal [" + animal.getId() + "] inserted into database.");
        } catch (SQLException e) {
            System.out.println("Error inserting animal: " + e.getMessage());
        }
    }

    /**
     * Updates the reservation status of an animal by ID.
     * @param id Animal ID
     * @param reserved New reservation status
     */
    public static void updateReservation(String id, boolean reserved) {
        String sql = "UPDATE Animals SET reserved = ? WHERE id = ?;";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, reserved ? 1 : 0);
            pstmt.setString(2, id);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Reservation status updated for animal [" + id + "].");
            } else {
                System.out.println("Animal with ID [" + id + "] not found in database.");
            }

        } catch (SQLException e) {
            System.out.println("Error updating reservation: " + e.getMessage());
        }
    }
}
