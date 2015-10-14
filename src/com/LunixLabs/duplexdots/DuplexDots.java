package com.LunixLabs.duplexdots;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.UnknownHostException;

class DuplexDots extends WebSocketServer {

    public DuplexDots() throws UnknownHostException {

    }

    @Override
    public void onOpen(WebSocket webSocket, ClientHandshake clientHandshake) {

    }

    @Override
    public void onClose(WebSocket webSocket, int i, String s, boolean b) {

    }

    @Override
    public void onMessage(WebSocket webSocket, String s) {
        for(WebSocket ws : this.connections.
    }

    @Override
    public void onError(WebSocket webSocket, Exception e) {

    }
}
