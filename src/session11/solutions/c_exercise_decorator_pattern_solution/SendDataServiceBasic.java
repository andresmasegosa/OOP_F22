package session11.solutions.c_exercise_decorator_pattern_solution;

public class SendDataServiceBasic implements SendDataService {
    String fileName;

    public SendDataServiceBasic(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void sendData(String data){
        System.out.println("Sending Data: "+data);
    }

}
