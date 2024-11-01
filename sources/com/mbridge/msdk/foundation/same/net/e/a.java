package com.mbridge.msdk.foundation.same.net.e;

import com.mbridge.msdk.foundation.same.net.i;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.File;

/* loaded from: classes4.dex */
public class a extends i<Void> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f20868c = "a";

    /* renamed from: d, reason: collision with root package name */
    private File f20869d;

    /* renamed from: e, reason: collision with root package name */
    private File f20870e;

    public a(File file, String str) {
        super(0, str);
        this.f20869d = file;
        this.f20870e = new File(file + ".tmp");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:            r18.a(r16);     */
    @Override // com.mbridge.msdk.foundation.same.net.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] a(com.mbridge.msdk.foundation.same.net.f.b r17, com.mbridge.msdk.foundation.same.net.c r18) throws java.io.IOException {
        /*
            r16 = this;
            r7 = r16
            java.lang.String r8 = "Error occured when calling InputStream.close"
            java.util.List r0 = r17.b()
            java.lang.String r1 = "Content-Length"
            java.lang.String r0 = com.mbridge.msdk.foundation.same.net.g.b.a(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L20
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = r0.longValue()
            r9 = r0
            goto L21
        L20:
            r9 = r2
        L21:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 > 0) goto L2c
            java.lang.String r1 = com.mbridge.msdk.foundation.same.net.e.a.f20868c
            java.lang.String r4 = "Response doesn't present Content-Length!"
            com.mbridge.msdk.foundation.tools.ad.c(r1, r4)
        L2c:
            r11 = 0
            if (r0 <= 0) goto L4a
            java.io.File r0 = r7.f20869d
            long r0 = r0.length()
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 != 0) goto L4a
            java.io.File r0 = r7.f20869d
            java.io.File r1 = r7.f20870e
            r0.renameTo(r1)
            r1 = r18
            r2 = r16
            r3 = r9
            r5 = r9
            r1.a(r2, r3, r5)
            return r11
        L4a:
            java.io.RandomAccessFile r12 = new java.io.RandomAccessFile
            java.io.File r0 = r7.f20870e
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r1 = "rw"
            r12.<init>(r0, r1)
            r12.setLength(r2)
            java.io.InputStream r1 = r17.a()     // Catch: java.lang.Throwable -> Lb2
            java.util.List r0 = r17.b()     // Catch: java.lang.Throwable -> L73
            boolean r0 = com.mbridge.msdk.foundation.same.net.g.b.b(r0)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L76
            boolean r0 = r1 instanceof java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L76
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L73
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L73
            r13 = r0
            goto L77
        L73:
            r0 = move-exception
            r11 = r1
            goto Lb3
        L76:
            r13 = r1
        L77:
            r0 = 6144(0x1800, float:8.61E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L9e
        L7b:
            int r1 = r13.read(r0)     // Catch: java.lang.Throwable -> L9e
            r4 = -1
            if (r1 == r4) goto La5
            r4 = 0
            r12.write(r0, r4, r1)     // Catch: java.lang.Throwable -> L9e
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L9e
            long r14 = r2 + r4
            r1 = r18
            r2 = r16
            r3 = r9
            r5 = r14
            r1.a(r2, r3, r5)     // Catch: java.lang.Throwable -> L9e
            boolean r1 = r16.q()     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto La1
            r1 = r18
            r1.a(r7)     // Catch: java.lang.Throwable -> L9e
            goto La5
        L9e:
            r0 = move-exception
            r11 = r13
            goto Lb3
        La1:
            r1 = r18
            r2 = r14
            goto L7b
        La5:
            r13.close()     // Catch: java.lang.Exception -> La9
            goto Lae
        La9:
            java.lang.String r0 = com.mbridge.msdk.foundation.same.net.e.a.f20868c
            com.mbridge.msdk.foundation.tools.ad.b(r0, r8)
        Lae:
            r12.close()
            return r11
        Lb2:
            r0 = move-exception
        Lb3:
            if (r11 == 0) goto Lbe
            r11.close()     // Catch: java.lang.Exception -> Lb9
            goto Lbe
        Lb9:
            java.lang.String r1 = com.mbridge.msdk.foundation.same.net.e.a.f20868c
            com.mbridge.msdk.foundation.tools.ad.b(r1, r8)
        Lbe:
            r12.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.e.a.a(com.mbridge.msdk.foundation.same.net.f.b, com.mbridge.msdk.foundation.same.net.c):byte[]");
    }

    @Override // com.mbridge.msdk.foundation.same.net.i
    public final int b() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.foundation.same.net.i
    public final k<Void> a(com.mbridge.msdk.foundation.same.net.f.c cVar) {
        if (!q()) {
            if (this.f20870e.canRead() && this.f20870e.length() > 0) {
                if (this.f20870e.renameTo(this.f20869d)) {
                    return k.a(null, cVar);
                }
                ad.c(f20868c, "Can't rename the download temporary file!");
                return k.a(new com.mbridge.msdk.foundation.same.net.b.a(4, cVar));
            }
            ad.c(f20868c, "Download temporary file was invalid!");
            return k.a(new com.mbridge.msdk.foundation.same.net.b.a(4, cVar));
        }
        return k.a(new com.mbridge.msdk.foundation.same.net.b.a(-2, cVar));
    }
}
