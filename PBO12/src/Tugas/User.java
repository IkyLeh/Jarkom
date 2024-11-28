public class User {
    private String id;
    private String phone;
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login1(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public boolean login2(String phone, String password) {
        return this.phone.equals(phone) && this.password.equals(password);
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

class Mahasiswa extends User {
    private Dosen dosenWali;
    private String kelas;

    public Mahasiswa() {
    }

    public Mahasiswa(String username, String password) {
        super(username, password);
    }
}

class Dosen extends User {
    private String pangkat;
    private String golongan;
    private String key;

    public Dosen() {
    }

    public Dosen(String username, String password) {
        super(username, password);
    }

    public boolean login3(String username, String password) {
        return super.login1(username, password);
    }

    public boolean login4(String username, String password, String key) {
        return super.login1(username, password) && this.key.equals(key);
    }

    public boolean login5(String phone, String password) {
        return super.login2(phone, password);
    }

    public boolean login6(String phone, String password, String key) {
        return super.login2(phone, password) && this.key.equals(key);
    }

    public void setKey(String key) {
        this.key = key;
    }
}

class TestLogin {
    public static void main(String[] args) {
        Mahasiswa fadilah = new Mahasiswa("fadilah", "123456");
        fadilah.setPhone("083853501388");

        boolean result = fadilah.login2("083853501388", "123456");
        if (result) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }

        Dosen fahrul = new Dosen("fahrul", "123456");
        fahrul.setKey("19990129");

        result = fahrul.login4("fahrul", "123456", "19990129");
        if (result) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }
    }
}