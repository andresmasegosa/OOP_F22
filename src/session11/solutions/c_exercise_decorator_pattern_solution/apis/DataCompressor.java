package session11.solutions.c_exercise_decorator_pattern_solution.apis;

public class DataCompressor {
    public String compressData(String data) {
        System.out.println("Compressing data");
        return data+"_compressed";
    }
}
