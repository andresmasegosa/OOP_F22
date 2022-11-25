package session11.solutions.c_exercise_decorator_pattern_solution.apis;

public class DataEncryptor {
    public String encryptData(String data) {
        System.out.println("Encrypting data");
        return data+"_encrypted";
    }
}
