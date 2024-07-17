public class Mahasiswa {
    private String nomorPendaftaran;
    private String nama;
    private String jurusan;
    private String email;

    public Mahasiswa(String nomorPendaftaran, String nama, String jurusan, String email) {
        this.nomorPendaftaran = nomorPendaftaran;
        this.nama = nama;
        this.jurusan = jurusan;
        this.email = email;
    }

    public String getNomorPendaftaran() {
        return nomorPendaftaran;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getEmail() {
        return email;
    }
}
