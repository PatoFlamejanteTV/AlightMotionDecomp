package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okio.BufferedSource;
import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
public interface PushObserver {
    public static final PushObserver CANCEL = new PushObserver() { // from class: com.mbridge.msdk.thrid.okhttp.internal.http2.PushObserver.1
        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.PushObserver
        public boolean onData(int i8, BufferedSource bufferedSource, int i9, boolean z8) throws IOException {
            bufferedSource.skip(i9);
            return true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.PushObserver
        public boolean onHeaders(int i8, List<Header> list, boolean z8) {
            return true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.PushObserver
        public boolean onRequest(int i8, List<Header> list) {
            return true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.PushObserver
        public void onReset(int i8, ErrorCode errorCode) {
        }
    };

    boolean onData(int i8, BufferedSource bufferedSource, int i9, boolean z8) throws IOException;

    boolean onHeaders(int i8, List<Header> list, boolean z8);

    boolean onRequest(int i8, List<Header> list);

    void onReset(int i8, ErrorCode errorCode);
}
