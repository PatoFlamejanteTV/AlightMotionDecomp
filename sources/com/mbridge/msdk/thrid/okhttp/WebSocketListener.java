package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okio.ByteString;

/* loaded from: classes4.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i8, String str) {
    }

    public void onClosing(WebSocket webSocket, int i8, String str) {
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
    }

    public void onMessage(WebSocket webSocket, ByteString byteString) {
    }

    public void onOpen(WebSocket webSocket, Response response) {
    }

    public void onMessage(WebSocket webSocket, String str) {
    }
}
