public class SecureLogin {

    public static boolean login(String username, String password) {
        return username.equals("admin") && password.equals("123");
    }
}
