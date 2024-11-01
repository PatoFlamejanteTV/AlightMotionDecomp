package M6;

import U6.InterfaceC1450f;
import U6.InterfaceC1451g;
import U6.L;
import U6.X;
import U6.Z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class d implements Closeable, Flushable {

    /* renamed from: u, reason: collision with root package name */
    static final Pattern f6195u = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: a, reason: collision with root package name */
    final R6.a f6196a;

    /* renamed from: b, reason: collision with root package name */
    final File f6197b;

    /* renamed from: c, reason: collision with root package name */
    private final File f6198c;

    /* renamed from: d, reason: collision with root package name */
    private final File f6199d;

    /* renamed from: e, reason: collision with root package name */
    private final File f6200e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6201f;

    /* renamed from: g, reason: collision with root package name */
    private long f6202g;

    /* renamed from: h, reason: collision with root package name */
    final int f6203h;

    /* renamed from: j, reason: collision with root package name */
    InterfaceC1450f f6205j;

    /* renamed from: l, reason: collision with root package name */
    int f6207l;

    /* renamed from: m, reason: collision with root package name */
    boolean f6208m;

    /* renamed from: n, reason: collision with root package name */
    boolean f6209n;

    /* renamed from: o, reason: collision with root package name */
    boolean f6210o;

    /* renamed from: p, reason: collision with root package name */
    boolean f6211p;

    /* renamed from: q, reason: collision with root package name */
    boolean f6212q;

    /* renamed from: s, reason: collision with root package name */
    private final Executor f6214s;

    /* renamed from: i, reason: collision with root package name */
    private long f6204i = 0;

    /* renamed from: k, reason: collision with root package name */
    final LinkedHashMap f6206k = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: r, reason: collision with root package name */
    private long f6213r = 0;

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f6215t = new a();

    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (d.this) {
                d dVar = d.this;
                if ((!dVar.f6209n) | dVar.f6210o) {
                    return;
                }
                try {
                    dVar.F();
                } catch (IOException unused) {
                    d.this.f6211p = true;
                }
                try {
                    if (d.this.q()) {
                        d.this.z();
                        d.this.f6207l = 0;
                    }
                } catch (IOException unused2) {
                    d dVar2 = d.this;
                    dVar2.f6212q = true;
                    dVar2.f6205j = L.c(L.b());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b extends M6.e {
        b(X x8) {
            super(x8);
        }

        @Override // M6.e
        protected void a(IOException iOException) {
            d.this.f6208m = true;
        }
    }

    /* loaded from: classes5.dex */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        final C0114d f6218a;

        /* renamed from: b, reason: collision with root package name */
        final boolean[] f6219b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6220c;

        /* loaded from: classes5.dex */
        class a extends M6.e {
            a(X x8) {
                super(x8);
            }

            @Override // M6.e
            protected void a(IOException iOException) {
                synchronized (d.this) {
                    c.this.c();
                }
            }
        }

        c(C0114d c0114d) {
            boolean[] zArr;
            this.f6218a = c0114d;
            if (c0114d.f6227e) {
                zArr = null;
            } else {
                zArr = new boolean[d.this.f6203h];
            }
            this.f6219b = zArr;
        }

        public void a() {
            synchronized (d.this) {
                try {
                    if (!this.f6220c) {
                        if (this.f6218a.f6228f == this) {
                            d.this.b(this, false);
                        }
                        this.f6220c = true;
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b() {
            synchronized (d.this) {
                try {
                    if (!this.f6220c) {
                        if (this.f6218a.f6228f == this) {
                            d.this.b(this, true);
                        }
                        this.f6220c = true;
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void c() {
            if (this.f6218a.f6228f == this) {
                int i8 = 0;
                while (true) {
                    d dVar = d.this;
                    if (i8 < dVar.f6203h) {
                        try {
                            dVar.f6196a.delete(this.f6218a.f6226d[i8]);
                        } catch (IOException unused) {
                        }
                        i8++;
                    } else {
                        this.f6218a.f6228f = null;
                        return;
                    }
                }
            }
        }

        public X d(int i8) {
            synchronized (d.this) {
                try {
                    if (!this.f6220c) {
                        C0114d c0114d = this.f6218a;
                        if (c0114d.f6228f != this) {
                            return L.b();
                        }
                        if (!c0114d.f6227e) {
                            this.f6219b[i8] = true;
                        }
                        try {
                            return new a(d.this.f6196a.sink(c0114d.f6226d[i8]));
                        } catch (FileNotFoundException unused) {
                            return L.b();
                        }
                    }
                    throw new IllegalStateException();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M6.d$d, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public final class C0114d {

        /* renamed from: a, reason: collision with root package name */
        final String f6223a;

        /* renamed from: b, reason: collision with root package name */
        final long[] f6224b;

        /* renamed from: c, reason: collision with root package name */
        final File[] f6225c;

        /* renamed from: d, reason: collision with root package name */
        final File[] f6226d;

        /* renamed from: e, reason: collision with root package name */
        boolean f6227e;

        /* renamed from: f, reason: collision with root package name */
        c f6228f;

        /* renamed from: g, reason: collision with root package name */
        long f6229g;

        C0114d(String str) {
            this.f6223a = str;
            int i8 = d.this.f6203h;
            this.f6224b = new long[i8];
            this.f6225c = new File[i8];
            this.f6226d = new File[i8];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i9 = 0; i9 < d.this.f6203h; i9++) {
                sb.append(i9);
                this.f6225c[i9] = new File(d.this.f6197b, sb.toString());
                sb.append(".tmp");
                this.f6226d[i9] = new File(d.this.f6197b, sb.toString());
                sb.setLength(length);
            }
        }

        private IOException a(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        void b(String[] strArr) {
            if (strArr.length == d.this.f6203h) {
                for (int i8 = 0; i8 < strArr.length; i8++) {
                    try {
                        this.f6224b[i8] = Long.parseLong(strArr[i8]);
                    } catch (NumberFormatException unused) {
                        throw a(strArr);
                    }
                }
                return;
            }
            throw a(strArr);
        }

        e c() {
            Z z8;
            if (Thread.holdsLock(d.this)) {
                Z[] zArr = new Z[d.this.f6203h];
                long[] jArr = (long[]) this.f6224b.clone();
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    try {
                        d dVar = d.this;
                        if (i9 < dVar.f6203h) {
                            zArr[i9] = dVar.f6196a.source(this.f6225c[i9]);
                            i9++;
                        } else {
                            return new e(this.f6223a, this.f6229g, zArr, jArr);
                        }
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            d dVar2 = d.this;
                            if (i8 < dVar2.f6203h && (z8 = zArr[i8]) != null) {
                                L6.c.d(z8);
                                i8++;
                            } else {
                                try {
                                    dVar2.E(this);
                                    return null;
                                } catch (IOException unused2) {
                                    return null;
                                }
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }

        void d(InterfaceC1450f interfaceC1450f) {
            for (long j8 : this.f6224b) {
                interfaceC1450f.writeByte(32).writeDecimalLong(j8);
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class e implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final String f6231a;

        /* renamed from: b, reason: collision with root package name */
        private final long f6232b;

        /* renamed from: c, reason: collision with root package name */
        private final Z[] f6233c;

        /* renamed from: d, reason: collision with root package name */
        private final long[] f6234d;

        e(String str, long j8, Z[] zArr, long[] jArr) {
            this.f6231a = str;
            this.f6232b = j8;
            this.f6233c = zArr;
            this.f6234d = jArr;
        }

        public c a() {
            return d.this.j(this.f6231a, this.f6232b);
        }

        public Z b(int i8) {
            return this.f6233c[i8];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (Z z8 : this.f6233c) {
                L6.c.d(z8);
            }
        }
    }

    d(R6.a aVar, File file, int i8, int i9, long j8, Executor executor) {
        this.f6196a = aVar;
        this.f6197b = file;
        this.f6201f = i8;
        this.f6198c = new File(file, "journal");
        this.f6199d = new File(file, "journal.tmp");
        this.f6200e = new File(file, "journal.bkp");
        this.f6203h = i9;
        this.f6202g = j8;
        this.f6214s = executor;
    }

    private void G(String str) {
        if (f6195u.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    private synchronized void a() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static d g(R6.a aVar, File file, int i8, int i9, long j8) {
        if (j8 > 0) {
            if (i9 > 0) {
                return new d(aVar, file, i8, i9, j8, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), L6.c.B("OkHttp DiskLruCache", true)));
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private InterfaceC1450f r() {
        return L.c(new b(this.f6196a.appendingSink(this.f6198c)));
    }

    private void t() {
        this.f6196a.delete(this.f6199d);
        Iterator it = this.f6206k.values().iterator();
        while (it.hasNext()) {
            C0114d c0114d = (C0114d) it.next();
            int i8 = 0;
            if (c0114d.f6228f == null) {
                while (i8 < this.f6203h) {
                    this.f6204i += c0114d.f6224b[i8];
                    i8++;
                }
            } else {
                c0114d.f6228f = null;
                while (i8 < this.f6203h) {
                    this.f6196a.delete(c0114d.f6225c[i8]);
                    this.f6196a.delete(c0114d.f6226d[i8]);
                    i8++;
                }
                it.remove();
            }
        }
    }

    private void u() {
        InterfaceC1451g d8 = L.d(this.f6196a.source(this.f6198c));
        try {
            String readUtf8LineStrict = d8.readUtf8LineStrict();
            String readUtf8LineStrict2 = d8.readUtf8LineStrict();
            String readUtf8LineStrict3 = d8.readUtf8LineStrict();
            String readUtf8LineStrict4 = d8.readUtf8LineStrict();
            String readUtf8LineStrict5 = d8.readUtf8LineStrict();
            if ("libcore.io.DiskLruCache".equals(readUtf8LineStrict) && "1".equals(readUtf8LineStrict2) && Integer.toString(this.f6201f).equals(readUtf8LineStrict3) && Integer.toString(this.f6203h).equals(readUtf8LineStrict4) && "".equals(readUtf8LineStrict5)) {
                int i8 = 0;
                while (true) {
                    try {
                        v(d8.readUtf8LineStrict());
                        i8++;
                    } catch (EOFException unused) {
                        this.f6207l = i8 - this.f6206k.size();
                        if (!d8.exhausted()) {
                            z();
                        } else {
                            this.f6205j = r();
                        }
                        L6.c.d(d8);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + readUtf8LineStrict + ", " + readUtf8LineStrict2 + ", " + readUtf8LineStrict4 + ", " + readUtf8LineStrict5 + "]");
            }
        } catch (Throwable th) {
            L6.c.d(d8);
            throw th;
        }
    }

    private void v(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i8 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i8);
            if (indexOf2 == -1) {
                substring = str.substring(i8);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f6206k.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i8, indexOf2);
            }
            C0114d c0114d = (C0114d) this.f6206k.get(substring);
            if (c0114d == null) {
                c0114d = new C0114d(substring);
                this.f6206k.put(substring, c0114d);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c0114d.f6227e = true;
                c0114d.f6228f = null;
                c0114d.b(split);
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c0114d.f6228f = new c(c0114d);
                return;
            }
            if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public synchronized boolean B(String str) {
        p();
        a();
        G(str);
        C0114d c0114d = (C0114d) this.f6206k.get(str);
        if (c0114d == null) {
            return false;
        }
        boolean E8 = E(c0114d);
        if (E8 && this.f6204i <= this.f6202g) {
            this.f6211p = false;
        }
        return E8;
    }

    boolean E(C0114d c0114d) {
        c cVar = c0114d.f6228f;
        if (cVar != null) {
            cVar.c();
        }
        for (int i8 = 0; i8 < this.f6203h; i8++) {
            this.f6196a.delete(c0114d.f6225c[i8]);
            long j8 = this.f6204i;
            long[] jArr = c0114d.f6224b;
            this.f6204i = j8 - jArr[i8];
            jArr[i8] = 0;
        }
        this.f6207l++;
        this.f6205j.writeUtf8("REMOVE").writeByte(32).writeUtf8(c0114d.f6223a).writeByte(10);
        this.f6206k.remove(c0114d.f6223a);
        if (q()) {
            this.f6214s.execute(this.f6215t);
        }
        return true;
    }

    void F() {
        while (this.f6204i > this.f6202g) {
            E((C0114d) this.f6206k.values().iterator().next());
        }
        this.f6211p = false;
    }

    synchronized void b(c cVar, boolean z8) {
        C0114d c0114d = cVar.f6218a;
        if (c0114d.f6228f == cVar) {
            if (z8 && !c0114d.f6227e) {
                for (int i8 = 0; i8 < this.f6203h; i8++) {
                    if (cVar.f6219b[i8]) {
                        if (!this.f6196a.exists(c0114d.f6226d[i8])) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i8);
                    }
                }
            }
            for (int i9 = 0; i9 < this.f6203h; i9++) {
                File file = c0114d.f6226d[i9];
                if (z8) {
                    if (this.f6196a.exists(file)) {
                        File file2 = c0114d.f6225c[i9];
                        this.f6196a.rename(file, file2);
                        long j8 = c0114d.f6224b[i9];
                        long size = this.f6196a.size(file2);
                        c0114d.f6224b[i9] = size;
                        this.f6204i = (this.f6204i - j8) + size;
                    }
                } else {
                    this.f6196a.delete(file);
                }
            }
            this.f6207l++;
            c0114d.f6228f = null;
            if (c0114d.f6227e | z8) {
                c0114d.f6227e = true;
                this.f6205j.writeUtf8("CLEAN").writeByte(32);
                this.f6205j.writeUtf8(c0114d.f6223a);
                c0114d.d(this.f6205j);
                this.f6205j.writeByte(10);
                if (z8) {
                    long j9 = this.f6213r;
                    this.f6213r = 1 + j9;
                    c0114d.f6229g = j9;
                }
            } else {
                this.f6206k.remove(c0114d.f6223a);
                this.f6205j.writeUtf8("REMOVE").writeByte(32);
                this.f6205j.writeUtf8(c0114d.f6223a);
                this.f6205j.writeByte(10);
            }
            this.f6205j.flush();
            if (this.f6204i > this.f6202g || q()) {
                this.f6214s.execute(this.f6215t);
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f6209n && !this.f6210o) {
                for (C0114d c0114d : (C0114d[]) this.f6206k.values().toArray(new C0114d[this.f6206k.size()])) {
                    c cVar = c0114d.f6228f;
                    if (cVar != null) {
                        cVar.a();
                    }
                }
                F();
                this.f6205j.close();
                this.f6205j = null;
                this.f6210o = true;
                return;
            }
            this.f6210o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (!this.f6209n) {
            return;
        }
        a();
        F();
        this.f6205j.flush();
    }

    public void h() {
        close();
        this.f6196a.deleteContents(this.f6197b);
    }

    public c i(String str) {
        return j(str, -1L);
    }

    public synchronized boolean isClosed() {
        return this.f6210o;
    }

    synchronized c j(String str, long j8) {
        p();
        a();
        G(str);
        C0114d c0114d = (C0114d) this.f6206k.get(str);
        if (j8 != -1 && (c0114d == null || c0114d.f6229g != j8)) {
            return null;
        }
        if (c0114d != null && c0114d.f6228f != null) {
            return null;
        }
        if (!this.f6211p && !this.f6212q) {
            this.f6205j.writeUtf8("DIRTY").writeByte(32).writeUtf8(str).writeByte(10);
            this.f6205j.flush();
            if (this.f6208m) {
                return null;
            }
            if (c0114d == null) {
                c0114d = new C0114d(str);
                this.f6206k.put(str, c0114d);
            }
            c cVar = new c(c0114d);
            c0114d.f6228f = cVar;
            return cVar;
        }
        this.f6214s.execute(this.f6215t);
        return null;
    }

    public synchronized e k(String str) {
        p();
        a();
        G(str);
        C0114d c0114d = (C0114d) this.f6206k.get(str);
        if (c0114d != null && c0114d.f6227e) {
            e c8 = c0114d.c();
            if (c8 == null) {
                return null;
            }
            this.f6207l++;
            this.f6205j.writeUtf8("READ").writeByte(32).writeUtf8(str).writeByte(10);
            if (q()) {
                this.f6214s.execute(this.f6215t);
            }
            return c8;
        }
        return null;
    }

    public synchronized void p() {
        try {
            if (this.f6209n) {
                return;
            }
            if (this.f6196a.exists(this.f6200e)) {
                if (this.f6196a.exists(this.f6198c)) {
                    this.f6196a.delete(this.f6200e);
                } else {
                    this.f6196a.rename(this.f6200e, this.f6198c);
                }
            }
            if (this.f6196a.exists(this.f6198c)) {
                try {
                    u();
                    t();
                    this.f6209n = true;
                    return;
                } catch (IOException e8) {
                    S6.f.i().p(5, "DiskLruCache " + this.f6197b + " is corrupt: " + e8.getMessage() + ", removing", e8);
                    try {
                        h();
                        this.f6210o = false;
                    } catch (Throwable th) {
                        this.f6210o = false;
                        throw th;
                    }
                }
            }
            z();
            this.f6209n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    boolean q() {
        int i8 = this.f6207l;
        if (i8 >= 2000 && i8 >= this.f6206k.size()) {
            return true;
        }
        return false;
    }

    synchronized void z() {
        try {
            InterfaceC1450f interfaceC1450f = this.f6205j;
            if (interfaceC1450f != null) {
                interfaceC1450f.close();
            }
            InterfaceC1450f c8 = L.c(this.f6196a.sink(this.f6199d));
            try {
                c8.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                c8.writeUtf8("1").writeByte(10);
                c8.writeDecimalLong(this.f6201f).writeByte(10);
                c8.writeDecimalLong(this.f6203h).writeByte(10);
                c8.writeByte(10);
                for (C0114d c0114d : this.f6206k.values()) {
                    if (c0114d.f6228f != null) {
                        c8.writeUtf8("DIRTY").writeByte(32);
                        c8.writeUtf8(c0114d.f6223a);
                        c8.writeByte(10);
                    } else {
                        c8.writeUtf8("CLEAN").writeByte(32);
                        c8.writeUtf8(c0114d.f6223a);
                        c0114d.d(c8);
                        c8.writeByte(10);
                    }
                }
                c8.close();
                if (this.f6196a.exists(this.f6198c)) {
                    this.f6196a.rename(this.f6198c, this.f6200e);
                }
                this.f6196a.rename(this.f6199d, this.f6198c);
                this.f6196a.delete(this.f6200e);
                this.f6205j = r();
                this.f6208m = false;
                this.f6212q = false;
            } catch (Throwable th) {
                c8.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
