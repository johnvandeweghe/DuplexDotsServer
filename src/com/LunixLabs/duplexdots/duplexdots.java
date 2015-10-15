package com.LunixLabs.duplexdots;

import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class duplexdots {
    public static void main(String[] args){
        Server server = new Server(new InetSocketAddress("127.0.0.1", 8080));
        server.start();
        System.out.println("Listening on " + server.getAddress());
    }
}
