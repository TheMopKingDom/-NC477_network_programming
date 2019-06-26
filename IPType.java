import java.net.*;
public class IPType {
    public static void main(String args[]) {
        String[] test = new String[6];
        test[0] = "www.v6.facebook.com";//ipv6.google.com
        test[1] = "facebook.com";
        test[2] = "2a00:1450:400e:80c::200e";
        test[3] = "172.217.20.110";
        test[4] = "ipv6.google.com";
        test[5] = "google.com";
        int p = 0;
        try {
            for(int i = 0;i<6;i++) {
                p = i;
                InetAddress address = InetAddress.getByName(test[i]);
                if (address instanceof Inet4Address) {
                    System.out.println(test[i]+ " Use IPv4");
                } else if (address instanceof Inet6Address) {
                    System.out.println(test[i]+ " Use IPv6");
                }
            }
            } catch(UnknownHostException e){
                System.out.println(test[p]+ " address was a machine name like a DNS name, and couldn't be found");
            }
    }
}