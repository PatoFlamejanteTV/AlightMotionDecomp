package q7;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: q7.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3835d extends AbstractC3838g {

    /* renamed from: b, reason: collision with root package name */
    private final int f37606b;

    /* renamed from: c, reason: collision with root package name */
    private final C3840i f37607c;

    public C3835d(int i8, C3840i c3840i) {
        super(false);
        this.f37606b = i8;
        this.f37607c = c3840i;
    }

    public static C3835d a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof C3835d) {
            return (C3835d) obj;
        }
        if (obj instanceof DataInputStream) {
            return new C3835d(((DataInputStream) obj).readInt(), C3840i.a(obj));
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream2 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
            }
            try {
                C3835d a9 = a(dataInputStream);
                dataInputStream.close();
                return a9;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        }
        if (obj instanceof InputStream) {
            return a(L7.a.b((InputStream) obj));
        }
        throw new IllegalArgumentException("cannot parse " + obj);
    }

    public int b() {
        return this.f37606b;
    }

    public C3840i c() {
        return this.f37607c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3835d c3835d = (C3835d) obj;
        if (this.f37606b != c3835d.f37606b) {
            return false;
        }
        return this.f37607c.equals(c3835d.f37607c);
    }

    @Override // q7.AbstractC3838g, J7.c
    public byte[] getEncoded() {
        return C3832a.f().i(this.f37606b).d(this.f37607c.getEncoded()).b();
    }

    public int hashCode() {
        return (this.f37606b * 31) + this.f37607c.hashCode();
    }
}
