package session11.solutions.c_exercise_decorator_pattern_solution;


import session11.solutions.c_exercise_decorator_pattern_solution.apis.DataCompressor;
import session11.solutions.c_exercise_decorator_pattern_solution.apis.DataEncryptor;

public class Demo {
    public static void main(String[] args) {
        SendDataService sendDataService = new SendDataServiceBasic("http://128.1.1.1");
        sendDataService = new CompressorDecorator(sendDataService,new DataCompressor());
        sendDataService = new EncryptorDecorator(sendDataService,new DataEncryptor());



        sendDataService.sendData("Hello");
        System.out.println();


    }
}
