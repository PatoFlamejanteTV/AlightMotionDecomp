package J0;

import M0.F;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: J0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1251h implements L {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f3906a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3907b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3908c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1251h(String str, String str2, byte[] bArr) {
        this.f3907b = str;
        this.f3908c = str2;
        this.f3906a = bArr;
    }

    private byte[] c() {
        if (d()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f3906a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean d() {
        byte[] bArr = this.f3906a;
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        return true;
    }

    @Override // J0.L
    public String a() {
        return this.f3908c;
    }

    @Override // J0.L
    public F.d.b b() {
        byte[] c8 = c();
        if (c8 == null) {
            return null;
        }
        return F.d.b.a().b(c8).c(this.f3907b).a();
    }

    @Override // J0.L
    public InputStream getStream() {
        if (d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f3906a);
    }
}
