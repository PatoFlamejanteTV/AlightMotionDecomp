package q7;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: q7.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C3837f implements J7.c {

    /* renamed from: a, reason: collision with root package name */
    private final C3836e f37620a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f37621b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f37622c;

    public C3837f(C3836e c3836e, byte[] bArr, byte[] bArr2) {
        this.f37620a = c3836e;
        this.f37621b = bArr;
        this.f37622c = bArr2;
    }

    public static C3837f a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof C3837f) {
            return (C3837f) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            C3836e e8 = C3836e.e(dataInputStream2.readInt());
            byte[] bArr = new byte[e8.c()];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[e8.d() * e8.c()];
            dataInputStream2.readFully(bArr2);
            return new C3837f(e8, bArr, bArr2);
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream3 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
            }
            try {
                C3837f a9 = a(dataInputStream);
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3837f c3837f = (C3837f) obj;
        C3836e c3836e = this.f37620a;
        if (c3836e == null ? c3837f.f37620a != null : !c3836e.equals(c3837f.f37620a)) {
            return false;
        }
        if (!Arrays.equals(this.f37621b, c3837f.f37621b)) {
            return false;
        }
        return Arrays.equals(this.f37622c, c3837f.f37622c);
    }

    @Override // J7.c
    public byte[] getEncoded() {
        return C3832a.f().i(this.f37620a.f()).d(this.f37621b).d(this.f37622c).b();
    }

    public int hashCode() {
        int i8;
        C3836e c3836e = this.f37620a;
        if (c3836e != null) {
            i8 = c3836e.hashCode();
        } else {
            i8 = 0;
        }
        return (((i8 * 31) + Arrays.hashCode(this.f37621b)) * 31) + Arrays.hashCode(this.f37622c);
    }
}
