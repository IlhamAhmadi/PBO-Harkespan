import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database {
    private final String url = "jdbc:mysql://localhost:3306/uaspbo";
    private final String user = "root";
    private final String password = "yourpassword";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public void saveMahasiswa(Mahasiswa mahasiswa) {
        String sql = "INSERT INTO mahasiswa(nomor_pendaftaran, nama, jurusan, email) VALUES(?, ?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, mahasiswa.getNomorPendaftaran());
            pstmt.setString(2, mahasiswa.getNama());
            pstmt.setString(3, mahasiswa.getJurusan());
            pstmt.setString(4, mahasiswa.getEmail());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
