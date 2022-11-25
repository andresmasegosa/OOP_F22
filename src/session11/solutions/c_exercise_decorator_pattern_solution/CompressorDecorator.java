package session11.solutions.c_exercise_decorator_pattern_solution;

import session11.solutions.c_exercise_decorator_pattern_solution.apis.DataCompressor;

public class CompressorDecorator implements SendDataService {
    SendDataService sendDataService;
    DataCompressor compressor;


    public CompressorDecorator(SendDataService sendDataService, DataCompressor compressor) {
        this.sendDataService = sendDataService;
        this.compressor = compressor;
    }

    @Override
    public void sendData(String data) {
        data = this.compressor.compressData(data);
        sendDataService.sendData(data);
    }
}
