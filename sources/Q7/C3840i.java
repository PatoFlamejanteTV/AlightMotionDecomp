package q7;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: q7.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3840i extends AbstractC3838g {

    /* renamed from: b, reason: collision with root package name */
    private final C3842k f37636b;

    /* renamed from: c, reason: collision with root package name */
    private final C3836e f37637c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f37638d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f37639e;

    public C3840i(C3842k c3842k, C3836e c3836e, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f37636b = c3842k;
        this.f37637c = c3836e;
        this.f37638d = J7.a.d(bArr2);
        this.f37639e = J7.a.d(bArr);
    }

    public static C3840i a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof C3840i) {
            return (C3840i) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            C3842k e8 = C3842k.e(dataInputStream2.readInt());
            C3836e e9 = C3836e.e(dataInputStream2.readInt());
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[e8.d()];
            dataInputStream2.readFully(bArr2);
            return new C3840i(e8, e9, bArr2, bArr);
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream3 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
            }
            try {
                C3840i a9 = a(dataInputStream);
                dataInputStream.close();
                return a9;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream3 = dataInputStream;
                if (dataInputStream3 != null) {
                    dataInputStream3.close();
                }
                throw th;
            }
        }
        if (obj instanceof InputStream) {
            return a(L7.a.b((InputStream) obj));
        }
        throw new IllegalArgumentException("cannot parse " + obj);
    }

    byte[] b() {
        return C3832a.f().i(this.f37636b.f()).i(this.f37637c.f()).d(this.f37638d).d(this.f37639e).b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3840i c3840i = (C3840i) obj;
        if (!this.f37636b.equals(c3840i.f37636b) || !this.f37637c.equals(c3840i.f37637c) || !J7.a.a(this.f37638d, c3840i.f37638d)) {
            return false;
        }
        return J7.a.a(this.f37639e, c3840i.f37639e);
    }

    @Override // q7.AbstractC3838g, J7.c
    public byte[] getEncoded() {
        return b();
    }

    public int hashCode() {
        return (((((this.f37636b.hashCode() * 31) + this.f37637c.hashCode()) * 31) + J7.a.k(this.f37638d)) * 31) + J7.a.k(this.f37639e);
    }
}
