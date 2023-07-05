package DAL;

import dto.RegistrationDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Registration {

static Connection conn = DatabaseConnection.getConnection();

    public static void saveRegistration(RegistrationDTO registrationDTO) {
        try {
            String query = "INSERT INTO registrationss (first_name, last_name, email, phone_number, address, date_of_birth, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, registrationDTO.getFirstName());
            statement.setString(2, registrationDTO.getLastName());
            statement.setString(3, registrationDTO.getEmail());
            statement.setString(4, registrationDTO.getPhoneNumber());
            statement.setString(5, registrationDTO.getAddress());
            statement.setDate(6, java.sql.Date.valueOf(registrationDTO.getDateOfBirth()));
            statement.setString(7, registrationDTO.getPassword());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("An error occurred while saving the registration details.", e);
        }
    }

    public static List<RegistrationDTO> getAllRegistrations() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
