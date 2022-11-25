package session11.solutions.c_exercise_decorator_pattern_solution;

import session11.solutions.c_exercise_decorator_pattern_solution.apis.DataEncryptor;

public class EncryptorDecorator implements SendDataService {
    SendDataService sendDataService;
    DataEncryptor dataEncryptor;


    public EncryptorDecorator(SendDataService sendDataService, DataEncryptor dataEncryptor) {
        this.sendDataService = sendDataService;
        this.dataEncryptor = dataEncryptor;
    }

    @Override
    public void sendData(String data) {
        data = this.dataEncryptor.encryptData(data);
        sendDataService.sendData(data);
    }
}
