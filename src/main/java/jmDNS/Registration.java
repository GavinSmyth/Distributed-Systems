package jmDNS;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class Registration{


public static void main(String[] args) throws InterruptedException {

        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "example", 50055, "path=index.html");
            jmdns.registerService(serviceInfo);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}