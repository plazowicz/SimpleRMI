import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        if( args.length != 3 ) {
            System.out.println("Usage: java <IP> <PORT> <NICK>");
            System.exit(-1);
        }
        try {
            String url = "rmi://"+args[0]+":"+args[1]+"/Remote";
            System.out.println(url);
            IRemoteListener listener = (IRemoteListener) Naming.lookup(url);
            listener.register(args[2]);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}