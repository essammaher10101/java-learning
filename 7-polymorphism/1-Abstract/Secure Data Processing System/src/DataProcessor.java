@FunctionalInterface
public interface DataProcessor {

    public String proccess(String data);

    public default String printLog(String message){
        System.out.println("[LOG] Processing data: " + message);
        return message;
    }
}
