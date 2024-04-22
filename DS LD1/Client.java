import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            RemoteInterface remoteObject = (RemoteInterface) Naming.lookup("//localhost/Server");
            remoteObject.sendMessage("Hello from client!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
