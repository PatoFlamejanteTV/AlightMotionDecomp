package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okio.ByteString;

/* loaded from: classes4.dex */
public interface WebSocket {

    /* loaded from: classes4.dex */
    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i8, String str);

    long queueSize();

    Request request();

    boolean send(ByteString byteString);

    boolean send(String str);
}
