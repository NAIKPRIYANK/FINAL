import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements RemoteInterface {

    protected Server() throws RemoteException {
        super();
    }

    @Override
    public void sendMessage(String message) throws RemoteException {
        System.out.println("Message received from client: " + message);
        // Implement server logic here
    }

    public static void main(String[] args) {
        try {
            java.rmi.registry.LocateRegistry.createRegistry(2000);
            Server server = new Server();
            java.rmi.Naming.rebind("//localhost/Server", server);
            System.out.println("Server started...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
