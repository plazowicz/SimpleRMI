import java.rmi.*;

public interface IRemoteListener extends Remote {

    public void register(String nick) throws RemoteException;

}