package q7;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: q7.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C3841j implements J7.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f37640a;

    /* renamed from: b, reason: collision with root package name */
    private final C3837f f37641b;

    /* renamed from: c, reason: collision with root package name */
    private final C3842k f37642c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[][] f37643d;

    public C3841j(int i8, C3837f c3837f, C3842k c3842k, byte[][] bArr) {
        this.f37640a = i8;
        this.f37641b = c3837f;
        this.f37642c = c3842k;
        this.f37643d = bArr;
    }

    public static C3841j a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof C3841j) {
            return (C3841j) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            int readInt = dataInputStream2.readInt();
            C3837f a9 = C3837f.a(obj);
            C3842k e8 = C3842k.e(dataInputStream2.readInt());
            int c8 = e8.c();
            byte[][] bArr = new byte[c8];
            for (int i8 = 0; i8 < c8; i8++) {
                byte[] bArr2 = new byte[e8.d()];
                bArr[i8] = bArr2;
                dataInputStream2.readFully(bArr2);
            }
            return new C3841j(readInt, a9, e8, bArr);
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream3 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
            }
            try {
                C3841j a10 = a(dataInputStream);
                dataInputStream.close();
                return a10;
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
        C3841j c3841j = (C3841j) obj;
        if (this.f37640a != c3841j.f37640a) {
            return false;
        }
        C3837f c3837f = this.f37641b;
        if (c3837f == null ? c3841j.f37641b != null : !c3837f.equals(c3841j.f37641b)) {
            return false;
        }
        C3842k c3842k = this.f37642c;
        if (c3842k == null ? c3841j.f37642c != null : !c3842k.equals(c3841j.f37642c)) {
            return false;
        }
        return Arrays.deepEquals(this.f37643d, c3841j.f37643d);
    }

    @Override // J7.c
    public byte[] getEncoded() {
        return C3832a.f().i(this.f37640a).d(this.f37641b.getEncoded()).i(this.f37642c.f()).e(this.f37643d).b();
    }

    public int hashCode() {
        int i8;
        int i9 = this.f37640a * 31;
        C3837f c3837f = this.f37641b;
        int i10 = 0;
        if (c3837f != null) {
            i8 = c3837f.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i9 + i8) * 31;
        C3842k c3842k = this.f37642c;
        if (c3842k != null) {
            i10 = c3842k.hashCode();
        }
        return ((i11 + i10) * 31) + Arrays.deepHashCode(this.f37643d);
    }
}
