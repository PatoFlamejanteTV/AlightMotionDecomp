package W6;

import java.io.EOFException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class z0 extends C0 {

    /* renamed from: c, reason: collision with root package name */
    private int f10894c;

    /* renamed from: d, reason: collision with root package name */
    private int f10895d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10896e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10897f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z0(InputStream inputStream, int i8) {
        super(inputStream, i8);
        this.f10896e = false;
        this.f10897f = true;
        this.f10894c = inputStream.read();
        int read = inputStream.read();
        this.f10895d = read;
        if (read >= 0) {
            g();
            return;
        }
        throw new EOFException();
    }

    private boolean g() {
        if (!this.f10896e && this.f10897f && this.f10894c == 0 && this.f10895d == 0) {
            this.f10896e = true;
            b(true);
        }
        return this.f10896e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z8) {
        this.f10897f = z8;
        g();
    }

    @Override // java.io.InputStream
    public int read() {
        if (g()) {
            return -1;
        }
        int read = this.f10791a.read();
        if (read < 0) {
            throw new EOFException();
        }
        int i8 = this.f10894c;
        this.f10894c = this.f10895d;
        this.f10895d = read;
        return i8;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        if (this.f10897f || i9 < 3) {
            return super.read(bArr, i8, i9);
        }
        if (this.f10896e) {
            return -1;
        }
        int read = this.f10791a.read(bArr, i8 + 2, i9 - 2);
        if (read < 0) {
            throw new EOFException();
        }
        bArr[i8] = (byte) this.f10894c;
        bArr[i8 + 1] = (byte) this.f10895d;
        this.f10894c = this.f10791a.read();
        int read2 = this.f10791a.read();
        this.f10895d = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        throw new EOFException();
    }
}
