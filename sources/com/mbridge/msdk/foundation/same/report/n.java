package com.mbridge.msdk.foundation.same.report;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class n extends com.mbridge.msdk.e.a.a.a {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f21173a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    private final byte f21174b;

    public n(byte b9) {
        this.f21174b = b9;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c A[Catch: all -> 0x0102, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0102, blocks: (B:35:0x00c7, B:38:0x00d7, B:41:0x00e9, B:47:0x010c, B:50:0x0123, B:52:0x0127, B:53:0x0134), top: B:34:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0123 A[Catch: all -> 0x0102, TRY_ENTER, TryCatch #1 {all -> 0x0102, blocks: (B:35:0x00c7, B:38:0x00d7, B:41:0x00e9, B:47:0x010c, B:50:0x0123, B:52:0x0127, B:53:0x0134), top: B:34:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009e A[Catch: all -> 0x0067, TryCatch #2 {all -> 0x0067, blocks: (B:16:0x004d, B:18:0x005e, B:21:0x0062, B:22:0x0070, B:24:0x007d, B:27:0x0081, B:32:0x009f, B:33:0x00b7, B:66:0x009e, B:67:0x0086, B:68:0x00ad, B:69:0x006d), top: B:15:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0086 A[Catch: all -> 0x0067, TryCatch #2 {all -> 0x0067, blocks: (B:16:0x004d, B:18:0x005e, B:21:0x0062, B:22:0x0070, B:24:0x007d, B:27:0x0081, B:32:0x009f, B:33:0x00b7, B:66:0x009e, B:67:0x0086, B:68:0x00ad, B:69:0x006d), top: B:15:0x004d }] */
    @Override // com.mbridge.msdk.e.a.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.e.a.a.f a(com.mbridge.msdk.e.a.p<?> r12, java.util.Map<java.lang.String, java.lang.String> r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.n.a(com.mbridge.msdk.e.a.p, java.util.Map):com.mbridge.msdk.e.a.a.f");
    }

    private static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    private static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Exception unused) {
            }
        }
    }

    private void a(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            try {
                byteBuffer.clear();
            } catch (Exception unused) {
            }
        }
    }
}
