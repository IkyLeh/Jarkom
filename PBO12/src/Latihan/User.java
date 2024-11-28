package Latihan;

public class User {
    protected String id;
    protected String phone;
    protected String username;
    protected String password;

    public User() {}

    public User(String id, String phone, String username, String password) {
        this.id = id;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) {
        return this.username != null && this.password != null
                && this.username.equals(username) && this.password.equals(password);
    }

    public boolean login1(String phone, String password) {
        return this.phone != null && this.password != null
                && this.phone.equals(phone) && this.password.equals(password);
    }

    public void setId(String id) { this.id = id; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }

    public String getId() { return id; }
    public String getPhone() { return phone; }
    public String getUsername() { return username; }
}

class Mahasiswa extends User {
    private Dosen dosenWali;
    private String kelas;

    public Mahasiswa() {}

    public Mahasiswa(String id, String phone, String username, String password) {
        super(id, phone, username, password);
    }

    public void setDosenWali(Dosen dosenWali) { this.dosenWali = dosenWali; }
    public void setKelas(String kelas) { this.kelas = kelas; }

    public Dosen getDosenWali() { return dosenWali; }
    public String getKelas() { return kelas; }
}

class Dosen extends User {
    private String pangkat;
    private String golongan;
    private String key;

    public Dosen() {}

    public Dosen(String id, String phone, String username, String password, String key) {
        super(id, phone, username, password);
        this.key = key;
    }

    public boolean login2(String username, String password, String key) {
        return this.username != null && this.password != null && this.key != null
                && this.username.equals(username) && this.password.equals(password) && this.key.equals(key);
    }

    public void setPangkat(String pangkat) { this.pangkat = pangkat; }
    public void setGolongan(String golongan) { this.golongan = golongan; }
    public void setKey(String key) { this.key = key; }

    public String getPangkat() { return pangkat; }
    public String getGolongan() { return golongan; }
}
