import java.rmi.*;
import java.rmi.server.*;

public class RemoteListener extends UnicastRemoteObject implements IRemoteListener {

    public RemoteListener() throws RemoteException {

    }

    public void register(String nick) throws RemoteException {
        System.out.println("User "+nick+" has already registered");
    }

}