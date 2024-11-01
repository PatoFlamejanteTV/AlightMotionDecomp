package L0;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class g implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f5242g = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f5243a;

    /* renamed from: b, reason: collision with root package name */
    int f5244b;

    /* renamed from: c, reason: collision with root package name */
    private int f5245c;

    /* renamed from: d, reason: collision with root package name */
    private b f5246d;

    /* renamed from: e, reason: collision with root package name */
    private b f5247e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f5248f = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        boolean f5249a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f5250b;

        a(StringBuilder sb) {
            this.f5250b = sb;
        }

        @Override // L0.g.d
        public void a(InputStream inputStream, int i8) {
            if (this.f5249a) {
                this.f5249a = false;
            } else {
                this.f5250b.append(", ");
            }
            this.f5250b.append(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f5252c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        final int f5253a;

        /* renamed from: b, reason: collision with root package name */
        final int f5254b;

        b(int i8, int i9) {
            this.f5253a = i8;
            this.f5254b = i9;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f5253a + ", length = " + this.f5254b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class c extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        private int f5255a;

        /* renamed from: b, reason: collision with root package name */
        private int f5256b;

        /* synthetic */ c(g gVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) {
            g.u(bArr, "buffer");
            if ((i8 | i9) >= 0 && i9 <= bArr.length - i8) {
                int i10 = this.f5256b;
                if (i10 <= 0) {
                    return -1;
                }
                if (i9 > i10) {
                    i9 = i10;
                }
                g.this.H(this.f5255a, bArr, i8, i9);
                this.f5255a = g.this.L(this.f5255a + i9);
                this.f5256b -= i9;
                return i9;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        private c(b bVar) {
            this.f5255a = g.this.L(bVar.f5253a + 4);
            this.f5256b = bVar.f5254b;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f5256b == 0) {
                return -1;
            }
            g.this.f5243a.seek(this.f5255a);
            int read = g.this.f5243a.read();
            this.f5255a = g.this.L(this.f5255a + 1);
            this.f5256b--;
            return read;
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(InputStream inputStream, int i8);
    }

    public g(File file) {
        if (!file.exists()) {
            r(file);
        }
        this.f5243a = v(file);
        B();
    }

    private void B() {
        this.f5243a.seek(0L);
        this.f5243a.readFully(this.f5248f);
        int E8 = E(this.f5248f, 0);
        this.f5244b = E8;
        if (E8 <= this.f5243a.length()) {
            this.f5245c = E(this.f5248f, 4);
            int E9 = E(this.f5248f, 8);
            int E10 = E(this.f5248f, 12);
            this.f5246d = z(E9);
            this.f5247e = z(E10);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f5244b + ", Actual length: " + this.f5243a.length());
    }

    private static int E(byte[] bArr, int i8) {
        return ((bArr[i8] & 255) << 24) + ((bArr[i8 + 1] & 255) << 16) + ((bArr[i8 + 2] & 255) << 8) + (bArr[i8 + 3] & 255);
    }

    private int F() {
        return this.f5244b - K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(int i8, byte[] bArr, int i9, int i10) {
        int L8 = L(i8);
        int i11 = L8 + i10;
        int i12 = this.f5244b;
        if (i11 <= i12) {
            this.f5243a.seek(L8);
            this.f5243a.readFully(bArr, i9, i10);
            return;
        }
        int i13 = i12 - L8;
        this.f5243a.seek(L8);
        this.f5243a.readFully(bArr, i9, i13);
        this.f5243a.seek(16L);
        this.f5243a.readFully(bArr, i9 + i13, i10 - i13);
    }

    private void I(int i8, byte[] bArr, int i9, int i10) {
        int L8 = L(i8);
        int i11 = L8 + i10;
        int i12 = this.f5244b;
        if (i11 <= i12) {
            this.f5243a.seek(L8);
            this.f5243a.write(bArr, i9, i10);
            return;
        }
        int i13 = i12 - L8;
        this.f5243a.seek(L8);
        this.f5243a.write(bArr, i9, i13);
        this.f5243a.seek(16L);
        this.f5243a.write(bArr, i9 + i13, i10 - i13);
    }

    private void J(int i8) {
        this.f5243a.setLength(i8);
        this.f5243a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int L(int i8) {
        int i9 = this.f5244b;
        if (i8 >= i9) {
            return (i8 + 16) - i9;
        }
        return i8;
    }

    private void M(int i8, int i9, int i10, int i11) {
        O(this.f5248f, i8, i9, i10, i11);
        this.f5243a.seek(0L);
        this.f5243a.write(this.f5248f);
    }

    private static void N(byte[] bArr, int i8, int i9) {
        bArr[i8] = (byte) (i9 >> 24);
        bArr[i8 + 1] = (byte) (i9 >> 16);
        bArr[i8 + 2] = (byte) (i9 >> 8);
        bArr[i8 + 3] = (byte) i9;
    }

    private static void O(byte[] bArr, int... iArr) {
        int i8 = 0;
        for (int i9 : iArr) {
            N(bArr, i8, i9);
            i8 += 4;
        }
    }

    private void p(int i8) {
        int i9 = i8 + 4;
        int F8 = F();
        if (F8 >= i9) {
            return;
        }
        int i10 = this.f5244b;
        do {
            F8 += i10;
            i10 <<= 1;
        } while (F8 < i9);
        J(i10);
        b bVar = this.f5247e;
        int L8 = L(bVar.f5253a + 4 + bVar.f5254b);
        if (L8 < this.f5246d.f5253a) {
            FileChannel channel = this.f5243a.getChannel();
            channel.position(this.f5244b);
            long j8 = L8 - 4;
            if (channel.transferTo(16L, j8, channel) != j8) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i11 = this.f5247e.f5253a;
        int i12 = this.f5246d.f5253a;
        if (i11 < i12) {
            int i13 = (this.f5244b + i11) - 16;
            M(i10, this.f5245c, i12, i13);
            this.f5247e = new b(i13, this.f5247e.f5254b);
        } else {
            M(i10, this.f5245c, i12, i11);
        }
        this.f5244b = i10;
    }

    private static void r(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile v8 = v(file2);
        try {
            v8.setLength(4096L);
            v8.seek(0L);
            byte[] bArr = new byte[16];
            O(bArr, 4096, 0, 0, 0);
            v8.write(bArr);
            v8.close();
            if (file2.renameTo(file)) {
            } else {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            v8.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object u(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile v(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b z(int i8) {
        if (i8 == 0) {
            return b.f5252c;
        }
        this.f5243a.seek(i8);
        return new b(i8, this.f5243a.readInt());
    }

    public synchronized void G() {
        try {
            if (!t()) {
                if (this.f5245c == 1) {
                    k();
                } else {
                    b bVar = this.f5246d;
                    int L8 = L(bVar.f5253a + 4 + bVar.f5254b);
                    H(L8, this.f5248f, 0, 4);
                    int E8 = E(this.f5248f, 0);
                    M(this.f5244b, this.f5245c - 1, L8, this.f5247e.f5253a);
                    this.f5245c--;
                    this.f5246d = new b(L8, E8);
                }
            } else {
                throw new NoSuchElementException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public int K() {
        if (this.f5245c == 0) {
            return 16;
        }
        b bVar = this.f5247e;
        int i8 = bVar.f5253a;
        int i9 = this.f5246d.f5253a;
        if (i8 >= i9) {
            return (i8 - i9) + 4 + bVar.f5254b + 16;
        }
        return (((i8 + 4) + bVar.f5254b) + this.f5244b) - i9;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f5243a.close();
    }

    public void i(byte[] bArr) {
        j(bArr, 0, bArr.length);
    }

    public synchronized void j(byte[] bArr, int i8, int i9) {
        int L8;
        int i10;
        try {
            u(bArr, "buffer");
            if ((i8 | i9) >= 0 && i9 <= bArr.length - i8) {
                p(i9);
                boolean t8 = t();
                if (t8) {
                    L8 = 16;
                } else {
                    b bVar = this.f5247e;
                    L8 = L(bVar.f5253a + 4 + bVar.f5254b);
                }
                b bVar2 = new b(L8, i9);
                N(this.f5248f, 0, i9);
                I(bVar2.f5253a, this.f5248f, 0, 4);
                I(bVar2.f5253a + 4, bArr, i8, i9);
                if (t8) {
                    i10 = bVar2.f5253a;
                } else {
                    i10 = this.f5246d.f5253a;
                }
                M(this.f5244b, this.f5245c + 1, i10, bVar2.f5253a);
                this.f5247e = bVar2;
                this.f5245c++;
                if (t8) {
                    this.f5246d = bVar2;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void k() {
        try {
            M(4096, 0, 0, 0);
            this.f5245c = 0;
            b bVar = b.f5252c;
            this.f5246d = bVar;
            this.f5247e = bVar;
            if (this.f5244b > 4096) {
                J(4096);
            }
            this.f5244b = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void q(d dVar) {
        int i8 = this.f5246d.f5253a;
        for (int i9 = 0; i9 < this.f5245c; i9++) {
            b z8 = z(i8);
            dVar.a(new c(this, z8, null), z8.f5254b);
            i8 = L(z8.f5253a + 4 + z8.f5254b);
        }
    }

    public synchronized boolean t() {
        boolean z8;
        if (this.f5245c == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        return z8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f5244b);
        sb.append(", size=");
        sb.append(this.f5245c);
        sb.append(", first=");
        sb.append(this.f5246d);
        sb.append(", last=");
        sb.append(this.f5247e);
        sb.append(", element lengths=[");
        try {
            q(new a(sb));
        } catch (IOException e8) {
            f5242g.log(Level.WARNING, "read error", (Throwable) e8);
        }
        sb.append("]]");
        return sb.toString();
    }
}
