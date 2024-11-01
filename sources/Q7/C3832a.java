package q7;

import java.io.ByteArrayOutputStream;

/* renamed from: q7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3832a {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f37596a = new ByteArrayOutputStream();

    private C3832a() {
    }

    public static C3832a f() {
        return new C3832a();
    }

    public C3832a a(boolean z8) {
        this.f37596a.write(z8 ? 1 : 0);
        return this;
    }

    public byte[] b() {
        return this.f37596a.toByteArray();
    }

    public C3832a c(J7.c cVar) {
        try {
            this.f37596a.write(cVar.getEncoded());
            return this;
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public C3832a d(byte[] bArr) {
        try {
            this.f37596a.write(bArr);
            return this;
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public C3832a e(byte[][] bArr) {
        try {
            for (byte[] bArr2 : bArr) {
                this.f37596a.write(bArr2);
            }
            return this;
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public C3832a g(int i8, int i9) {
        while (this.f37596a.size() < i9) {
            this.f37596a.write(i8);
        }
        return this;
    }

    public C3832a h(int i8) {
        int i9 = i8 & 65535;
        this.f37596a.write((byte) (i9 >>> 8));
        this.f37596a.write((byte) i9);
        return this;
    }

    public C3832a i(int i8) {
        this.f37596a.write((byte) (i8 >>> 24));
        this.f37596a.write((byte) (i8 >>> 16));
        this.f37596a.write((byte) (i8 >>> 8));
        this.f37596a.write((byte) i8);
        return this;
    }

    public C3832a j(long j8) {
        i((int) (j8 >>> 32));
        i((int) j8);
        return this;
    }
}
