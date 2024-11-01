package W6;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
class x0 extends C0 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f10885e = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    private final int f10886c;

    /* renamed from: d, reason: collision with root package name */
    private int f10887d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(InputStream inputStream, int i8, int i9) {
        super(inputStream, i9);
        if (i8 >= 0) {
            this.f10886c = i8;
            this.f10887d = i8;
            if (i8 == 0) {
                b(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("negative lengths not allowed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f10887d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(byte[] bArr) {
        int i8 = this.f10887d;
        if (i8 == bArr.length) {
            if (i8 == 0) {
                return;
            }
            int a9 = a();
            int i9 = this.f10887d;
            if (i9 < a9) {
                int c8 = i9 - L7.a.c(this.f10791a, bArr);
                this.f10887d = c8;
                if (c8 == 0) {
                    b(true);
                    return;
                }
                throw new EOFException("DEF length " + this.f10886c + " object truncated by " + this.f10887d);
            }
            throw new IOException("corrupted stream - out of bounds length found: " + this.f10887d + " >= " + a9);
        }
        throw new IllegalArgumentException("buffer length not right for data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] i() {
        if (this.f10887d == 0) {
            return f10885e;
        }
        int a9 = a();
        int i8 = this.f10887d;
        if (i8 < a9) {
            byte[] bArr = new byte[i8];
            int c8 = i8 - L7.a.c(this.f10791a, bArr);
            this.f10887d = c8;
            if (c8 == 0) {
                b(true);
                return bArr;
            }
            throw new EOFException("DEF length " + this.f10886c + " object truncated by " + this.f10887d);
        }
        throw new IOException("corrupted stream - out of bounds length found: " + this.f10887d + " >= " + a9);
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f10887d == 0) {
            return -1;
        }
        int read = this.f10791a.read();
        if (read >= 0) {
            int i8 = this.f10887d - 1;
            this.f10887d = i8;
            if (i8 == 0) {
                b(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f10886c + " object truncated by " + this.f10887d);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        int i10 = this.f10887d;
        if (i10 == 0) {
            return -1;
        }
        int read = this.f10791a.read(bArr, i8, Math.min(i9, i10));
        if (read >= 0) {
            int i11 = this.f10887d - read;
            this.f10887d = i11;
            if (i11 == 0) {
                b(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f10886c + " object truncated by " + this.f10887d);
    }
}
