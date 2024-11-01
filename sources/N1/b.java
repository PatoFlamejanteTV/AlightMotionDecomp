package N1;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f6424a;

    /* renamed from: b, reason: collision with root package name */
    private final Charset f6425b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f6426c;

    /* renamed from: d, reason: collision with root package name */
    private int f6427d;

    /* renamed from: e, reason: collision with root package name */
    private int f6428e;

    /* loaded from: classes4.dex */
    class a extends ByteArrayOutputStream {
        a(int i8) {
            super(i8);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i8 = ((ByteArrayOutputStream) this).count;
            if (i8 > 0 && ((ByteArrayOutputStream) this).buf[i8 - 1] == 13) {
                i8--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i8, b.this.f6425b.name());
            } catch (UnsupportedEncodingException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() {
        InputStream inputStream = this.f6424a;
        byte[] bArr = this.f6426c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f6427d = 0;
            this.f6428e = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f6424a) {
            try {
                if (this.f6426c != null) {
                    this.f6426c = null;
                    this.f6424a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String g() {
        int i8;
        byte[] bArr;
        int i9;
        synchronized (this.f6424a) {
            try {
                if (this.f6426c != null) {
                    if (this.f6427d >= this.f6428e) {
                        b();
                    }
                    for (int i10 = this.f6427d; i10 != this.f6428e; i10++) {
                        byte[] bArr2 = this.f6426c;
                        if (bArr2[i10] == 10) {
                            int i11 = this.f6427d;
                            if (i10 != i11) {
                                i9 = i10 - 1;
                                if (bArr2[i9] == 13) {
                                    String str = new String(bArr2, i11, i9 - i11, this.f6425b.name());
                                    this.f6427d = i10 + 1;
                                    return str;
                                }
                            }
                            i9 = i10;
                            String str2 = new String(bArr2, i11, i9 - i11, this.f6425b.name());
                            this.f6427d = i10 + 1;
                            return str2;
                        }
                    }
                    a aVar = new a((this.f6428e - this.f6427d) + 80);
                    loop1: while (true) {
                        byte[] bArr3 = this.f6426c;
                        int i12 = this.f6427d;
                        aVar.write(bArr3, i12, this.f6428e - i12);
                        this.f6428e = -1;
                        b();
                        i8 = this.f6427d;
                        while (i8 != this.f6428e) {
                            bArr = this.f6426c;
                            if (bArr[i8] == 10) {
                                break loop1;
                            }
                            i8++;
                        }
                    }
                    int i13 = this.f6427d;
                    if (i8 != i13) {
                        aVar.write(bArr, i13, i8 - i13);
                    }
                    this.f6427d = i8 + 1;
                    return aVar.toString();
                }
                throw new IOException("LineReader is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b(InputStream inputStream, int i8, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i8 >= 0) {
            if (charset.equals(c.f6430a)) {
                this.f6424a = inputStream;
                this.f6425b = charset;
                this.f6426c = new byte[i8];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
