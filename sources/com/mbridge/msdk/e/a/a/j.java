package com.mbridge.msdk.e.a.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class j extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final c f20006a;

    public j(c cVar, int i8) {
        this.f20006a = cVar;
        ((ByteArrayOutputStream) this).buf = cVar.a(Math.max(i8, 256));
    }

    private void a(int i8) {
        int i9 = ((ByteArrayOutputStream) this).count;
        if (i9 + i8 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] a9 = this.f20006a.a((i9 + i8) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a9, 0, ((ByteArrayOutputStream) this).count);
        this.f20006a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = a9;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f20006a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f20006a.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i8, int i9) {
        a(i9);
        if (bArr != null) {
            super.write(bArr, i8, i9);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i8) {
        a(1);
        super.write(i8);
    }
}
