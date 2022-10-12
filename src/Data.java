import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Data {

    private final String login;
    private final String password;
    private final String confirmPassword;

    public Data(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    static boolean checkData(Data data) throws WrongLoginException, WrongPasswordException {

        String regex = "^[a-zA-Z0-9_]{1,20}$";
        if (!data.login.isBlank() && data.login.matches(regex)) {
            System.out.println("login is correct");
        } else {
            throw  new WrongLoginException("login is incorrect");
        }

        String regex1 = "^[a-zA-Z0-9_]{1,20}$";
        if (!data.password.isBlank() && data.password.matches(regex1) && data.password.equals(data.confirmPassword)) {
            System.out.println("password is correct");
        } else {
            throw new WrongPasswordException("password is incorrect");
        }
        return false;
    }
}
