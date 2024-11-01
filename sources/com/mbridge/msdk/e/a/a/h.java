package com.mbridge.msdk.e.a.a;

import com.mbridge.msdk.e.a.aa;
import com.mbridge.msdk.e.a.z;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
final class h {

    /* loaded from: classes4.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f20004a;

        /* renamed from: b, reason: collision with root package name */
        private final z f20005b;

        private a(String str, z zVar) {
            this.f20004a = str;
            this.f20005b = zVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(InputStream inputStream, int i8, c cVar) throws IOException {
        byte[] bArr;
        j jVar = new j(cVar, i8);
        try {
            bArr = cVar.a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    jVar.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            aa.a("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    cVar.a(bArr);
                    jVar.close();
                    throw th;
                }
            }
            byte[] byteArray = jVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                aa.a("Error occurred when closing InputStream", new Object[0]);
            }
            cVar.a(bArr);
            jVar.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }
}
