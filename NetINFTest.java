import java.net.*;
import java.util.*;

public class NetINFTest {
    public static void main(String args[]) throws SocketException {
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netint : Collections.list(nets)) displayInterfaceInformation(netint);
  }
    static void displayInterfaceInformation(NetworkInterface netint) throws SocketException {
        System.out.println("Display name: "+netint.getDisplayName());
  	    System.out.println("Name: "+ netint.getName());
        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
       	System.out.println("InetAddress: "+inetAddress);
     }
        System.out.println("");
   }
}