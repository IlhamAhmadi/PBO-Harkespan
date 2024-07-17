import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextField nomorPendaftaranField;
    private JTextField namaField;
    private JTextField jurusanField;
    private JTextField emailField;
    private Database db;

    public MainFrame() {
        db = new Database();
        setTitle("Pendaftaran Mahasiswa");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2));

        JLabel nomorPendaftaranLabel = new JLabel("Nomor Pendaftaran:");
        nomorPendaftaranField = new JTextField();

        JLabel namaLabel = new JLabel("Nama:");
        namaField = new JTextField();

        JLabel jurusanLabel = new JLabel("Jurusan:");
        jurusanField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        JButton submitButton = new JButton("Daftar");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                daftarMahasiswa();
            }
        });

        add(nomorPendaftaranLabel);
        add(nomorPendaftaranField);
        add(namaLabel);
        add(namaField);
        add(jurusanLabel);
        add(jurusanField);
        add(emailLabel);
        add(emailField);
        add(new JLabel()); // Empty cell
        add(submitButton);
    }

    private void daftarMahasiswa() {
        String nomorPendaftaran = nomorPendaftaranField.getText();
        String nama = namaField.getText();
        String jurusan = jurusanField.getText();
        String email = emailField.getText();

        Mahasiswa mahasiswa = new Mahasiswa(nomorPendaftaran, nama, jurusan, email);
        db.saveMahasiswa(mahasiswa);

        JOptionPane.showMessageDialog(this, "Mahasiswa berhasil didaftarkan!");
        clearFields();
    }

    private void clearFields() {
        nomorPendaftaranField.setText("");
        namaField.setText("");
        jurusanField.setText("");
        emailField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}
