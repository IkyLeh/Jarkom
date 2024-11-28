package Latihan;

public class TestLogin {
    public static void main(String[] args) {
        Mahasiswa fadilah = new Mahasiswa();
        fadilah.setUsername("fadilah");
        fadilah.setPassword("123456");
        fadilah.setPhone("08383501388");

        boolean result = fadilah.login1("08383501388", "123456");
        if (result) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }

        Dosen fahrul = new Dosen();
        fahrul.setUsername("fahrul");
        fahrul.setPassword("123456");
        fahrul.setKey("19990129");

        result = fahrul.login2("fahrul", "123456", "19990129");
        if (result) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }
    }
}
