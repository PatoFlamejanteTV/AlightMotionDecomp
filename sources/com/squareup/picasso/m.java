package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
final class m extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f24523a;

    /* renamed from: b, reason: collision with root package name */
    private long f24524b;

    /* renamed from: c, reason: collision with root package name */
    private long f24525c;

    /* renamed from: d, reason: collision with root package name */
    private long f24526d;

    /* renamed from: e, reason: collision with root package name */
    private long f24527e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24528f;

    /* renamed from: g, reason: collision with root package name */
    private int f24529g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void h(long j8) {
        try {
            long j9 = this.f24525c;
            long j10 = this.f24524b;
            if (j9 < j10 && j10 <= this.f24526d) {
                this.f24523a.reset();
                this.f24523a.mark((int) (j8 - this.f24525c));
                i(this.f24525c, this.f24524b);
            } else {
                this.f24525c = j10;
                this.f24523a.mark((int) (j8 - j10));
            }
            this.f24526d = j8;
        } catch (IOException e8) {
            throw new IllegalStateException("Unable to mark: " + e8);
        }
    }

    private void i(long j8, long j9) {
        while (j8 < j9) {
            long skip = this.f24523a.skip(j9 - j8);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j8 += skip;
        }
    }

    public void a(boolean z8) {
        this.f24528f = z8;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f24523a.available();
    }

    public void b(long j8) {
        if (this.f24524b <= this.f24526d && j8 >= this.f24525c) {
            this.f24523a.reset();
            i(this.f24525c, j8);
            this.f24524b = j8;
            return;
        }
        throw new IOException("Cannot reset");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f24523a.close();
    }

    public long g(int i8) {
        long j8 = this.f24524b + i8;
        if (this.f24526d < j8) {
            h(j8);
        }
        return this.f24524b;
    }

    @Override // java.io.InputStream
    public void mark(int i8) {
        this.f24527e = g(i8);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f24523a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        if (!this.f24528f) {
            long j8 = this.f24524b + 1;
            long j9 = this.f24526d;
            if (j8 > j9) {
                h(j9 + this.f24529g);
            }
        }
        int read = this.f24523a.read();
        if (read != -1) {
            this.f24524b++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        b(this.f24527e);
    }

    @Override // java.io.InputStream
    public long skip(long j8) {
        if (!this.f24528f) {
            long j9 = this.f24524b;
            if (j9 + j8 > this.f24526d) {
                h(j9 + j8 + this.f24529g);
            }
        }
        long skip = this.f24523a.skip(j8);
        this.f24524b += skip;
        return skip;
    }

    m(InputStream inputStream, int i8) {
        this(inputStream, i8, 1024);
    }

    private m(InputStream inputStream, int i8, int i9) {
        this.f24527e = -1L;
        this.f24528f = true;
        this.f24529g = -1;
        this.f24523a = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i8);
        this.f24529g = i9;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (!this.f24528f) {
            long j8 = this.f24524b;
            if (bArr.length + j8 > this.f24526d) {
                h(j8 + bArr.length + this.f24529g);
            }
        }
        int read = this.f24523a.read(bArr);
        if (read != -1) {
            this.f24524b += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        if (!this.f24528f) {
            long j8 = this.f24524b;
            long j9 = i9;
            if (j8 + j9 > this.f24526d) {
                h(j8 + j9 + this.f24529g);
            }
        }
        int read = this.f24523a.read(bArr, i8, i9);
        if (read != -1) {
            this.f24524b += read;
        }
        return read;
    }
}
