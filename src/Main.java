

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        Data checkDataInput = new Data("_Qwerty_123_", "123qwe_", "123qwe_");
        Data.checkData(checkDataInput);
    }
}
