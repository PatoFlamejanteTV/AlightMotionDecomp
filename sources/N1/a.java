package N1;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class a implements Closeable {

    /* renamed from: o, reason: collision with root package name */
    static final Pattern f6390o = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: p, reason: collision with root package name */
    private static final OutputStream f6391p = new b();

    /* renamed from: a, reason: collision with root package name */
    private final File f6392a;

    /* renamed from: b, reason: collision with root package name */
    private final File f6393b;

    /* renamed from: c, reason: collision with root package name */
    private final File f6394c;

    /* renamed from: d, reason: collision with root package name */
    private final File f6395d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6396e;

    /* renamed from: f, reason: collision with root package name */
    private long f6397f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6398g;

    /* renamed from: i, reason: collision with root package name */
    private Writer f6400i;

    /* renamed from: k, reason: collision with root package name */
    private int f6402k;

    /* renamed from: h, reason: collision with root package name */
    private long f6399h = 0;

    /* renamed from: j, reason: collision with root package name */
    private final LinkedHashMap f6401j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    private long f6403l = 0;

    /* renamed from: m, reason: collision with root package name */
    final ThreadPoolExecutor f6404m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: n, reason: collision with root package name */
    private final Callable f6405n = new CallableC0116a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N1.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class CallableC0116a implements Callable {
        CallableC0116a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                try {
                    if (a.this.f6400i != null) {
                        a.this.N();
                        if (a.this.F()) {
                            a.this.K();
                            a.this.f6402k = 0;
                        }
                        return null;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f6407a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f6408b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6409c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f6410d;

        /* renamed from: N1.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private class C0117a extends FilterOutputStream {
            /* synthetic */ C0117a(c cVar, OutputStream outputStream, CallableC0116a callableC0116a) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.f6409c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.f6409c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i8) {
                try {
                    ((FilterOutputStream) this).out.write(i8);
                } catch (IOException unused) {
                    c.this.f6409c = true;
                }
            }

            private C0117a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i8, int i9) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i8, i9);
                } catch (IOException unused) {
                    c.this.f6409c = true;
                }
            }
        }

        /* synthetic */ c(a aVar, d dVar, CallableC0116a callableC0116a) {
            this(dVar);
        }

        public void a() {
            a.this.t(this, false);
        }

        public void e() {
            if (this.f6409c) {
                a.this.t(this, false);
                a.this.L(this.f6407a.f6413a);
            } else {
                a.this.t(this, true);
            }
            this.f6410d = true;
        }

        public OutputStream f(int i8) {
            FileOutputStream fileOutputStream;
            C0117a c0117a;
            synchronized (a.this) {
                try {
                    if (this.f6407a.f6416d == this) {
                        if (!this.f6407a.f6415c) {
                            this.f6408b[i8] = true;
                        }
                        File k8 = this.f6407a.k(i8);
                        try {
                            fileOutputStream = new FileOutputStream(k8);
                        } catch (FileNotFoundException unused) {
                            a.this.f6392a.mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(k8);
                            } catch (FileNotFoundException unused2) {
                                return a.f6391p;
                            }
                        }
                        c0117a = new C0117a(this, fileOutputStream, null);
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0117a;
        }

        private c(d dVar) {
            this.f6407a = dVar;
            this.f6408b = dVar.f6415c ? null : new boolean[a.this.f6398g];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f6413a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f6414b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6415c;

        /* renamed from: d, reason: collision with root package name */
        private c f6416d;

        /* renamed from: e, reason: collision with root package name */
        private long f6417e;

        /* synthetic */ d(a aVar, String str, CallableC0116a callableC0116a) {
            this(str);
        }

        private IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) {
            if (strArr.length == a.this.f6398g) {
                for (int i8 = 0; i8 < strArr.length; i8++) {
                    try {
                        this.f6414b[i8] = Long.parseLong(strArr[i8]);
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public File j(int i8) {
            return new File(a.this.f6392a, this.f6413a + "." + i8);
        }

        public File k(int i8) {
            return new File(a.this.f6392a, this.f6413a + "." + i8 + ".tmp");
        }

        public String l() {
            StringBuilder sb = new StringBuilder();
            for (long j8 : this.f6414b) {
                sb.append(' ');
                sb.append(j8);
            }
            return sb.toString();
        }

        private d(String str) {
            this.f6413a = str;
            this.f6414b = new long[a.this.f6398g];
        }
    }

    /* loaded from: classes4.dex */
    public final class e implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final String f6419a;

        /* renamed from: b, reason: collision with root package name */
        private final long f6420b;

        /* renamed from: c, reason: collision with root package name */
        private final InputStream[] f6421c;

        /* renamed from: d, reason: collision with root package name */
        private final long[] f6422d;

        /* synthetic */ e(a aVar, String str, long j8, InputStream[] inputStreamArr, long[] jArr, CallableC0116a callableC0116a) {
            this(str, j8, inputStreamArr, jArr);
        }

        public InputStream a(int i8) {
            return this.f6421c[i8];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f6421c) {
                N1.c.a(inputStream);
            }
        }

        private e(String str, long j8, InputStream[] inputStreamArr, long[] jArr) {
            this.f6419a = str;
            this.f6420b = j8;
            this.f6421c = inputStreamArr;
            this.f6422d = jArr;
        }
    }

    private a(File file, int i8, int i9, long j8) {
        this.f6392a = file;
        this.f6396e = i8;
        this.f6393b = new File(file, "journal");
        this.f6394c = new File(file, "journal.tmp");
        this.f6395d = new File(file, "journal.bkp");
        this.f6398g = i9;
        this.f6397f = j8;
    }

    private synchronized c B(String str, long j8) {
        r();
        O(str);
        d dVar = (d) this.f6401j.get(str);
        CallableC0116a callableC0116a = null;
        if (j8 != -1 && (dVar == null || dVar.f6417e != j8)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0116a);
            this.f6401j.put(str, dVar);
        } else if (dVar.f6416d != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0116a);
        dVar.f6416d = cVar;
        this.f6400i.write("DIRTY " + str + '\n');
        this.f6400i.flush();
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F() {
        int i8 = this.f6402k;
        if (i8 >= 2000 && i8 >= this.f6401j.size()) {
            return true;
        }
        return false;
    }

    public static a G(File file, int i8, int i9, long j8) {
        if (j8 > 0) {
            if (i9 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        M(file2, file3, false);
                    }
                }
                a aVar = new a(file, i8, i9, j8);
                if (aVar.f6393b.exists()) {
                    try {
                        aVar.I();
                        aVar.H();
                        aVar.f6400i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.f6393b, true), N1.c.f6430a));
                        return aVar;
                    } catch (IOException e8) {
                        System.out.println("DiskLruCache " + file + " is corrupt: " + e8.getMessage() + ", removing");
                        aVar.u();
                    }
                }
                file.mkdirs();
                a aVar2 = new a(file, i8, i9, j8);
                aVar2.K();
                return aVar2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void H() {
        v(this.f6394c);
        Iterator it = this.f6401j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i8 = 0;
            if (dVar.f6416d != null) {
                dVar.f6416d = null;
                while (i8 < this.f6398g) {
                    v(dVar.j(i8));
                    v(dVar.k(i8));
                    i8++;
                }
                it.remove();
            } else {
                while (i8 < this.f6398g) {
                    this.f6399h += dVar.f6414b[i8];
                    i8++;
                }
            }
        }
    }

    private void I() {
        N1.b bVar = new N1.b(new FileInputStream(this.f6393b), N1.c.f6430a);
        try {
            String g8 = bVar.g();
            String g9 = bVar.g();
            String g10 = bVar.g();
            String g11 = bVar.g();
            String g12 = bVar.g();
            if ("libcore.io.DiskLruCache".equals(g8) && "1".equals(g9) && Integer.toString(this.f6396e).equals(g10) && Integer.toString(this.f6398g).equals(g11) && "".equals(g12)) {
                int i8 = 0;
                while (true) {
                    try {
                        J(bVar.g());
                        i8++;
                    } catch (EOFException unused) {
                        this.f6402k = i8 - this.f6401j.size();
                        N1.c.a(bVar);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + g8 + ", " + g9 + ", " + g11 + ", " + g12 + "]");
            }
        } catch (Throwable th) {
            N1.c.a(bVar);
            throw th;
        }
    }

    private void J(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i8 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i8);
            if (indexOf2 == -1) {
                substring = str.substring(i8);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f6401j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i8, indexOf2);
            }
            d dVar = (d) this.f6401j.get(substring);
            CallableC0116a callableC0116a = null;
            if (dVar == null) {
                dVar = new d(this, substring, callableC0116a);
                this.f6401j.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f6415c = true;
                dVar.f6416d = null;
                dVar.n(split);
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f6416d = new c(this, dVar, callableC0116a);
                return;
            }
            if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void K() {
        try {
            Writer writer = this.f6400i;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6394c), N1.c.f6430a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f6396e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f6398g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f6401j.values()) {
                    if (dVar.f6416d != null) {
                        bufferedWriter.write("DIRTY " + dVar.f6413a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f6413a + dVar.l() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.f6393b.exists()) {
                    M(this.f6393b, this.f6395d, true);
                }
                M(this.f6394c, this.f6393b, false);
                this.f6395d.delete();
                this.f6400i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6393b, true), N1.c.f6430a));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void M(File file, File file2, boolean z8) {
        if (z8) {
            v(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        while (this.f6399h > this.f6397f) {
            L((String) ((Map.Entry) this.f6401j.entrySet().iterator().next()).getKey());
        }
    }

    private void O(String str) {
        if (f6390o.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
    }

    private void r() {
        if (this.f6400i != null) {
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void t(c cVar, boolean z8) {
        d dVar = cVar.f6407a;
        if (dVar.f6416d == cVar) {
            if (z8 && !dVar.f6415c) {
                for (int i8 = 0; i8 < this.f6398g; i8++) {
                    if (cVar.f6408b[i8]) {
                        if (!dVar.k(i8).exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i8);
                    }
                }
            }
            for (int i9 = 0; i9 < this.f6398g; i9++) {
                File k8 = dVar.k(i9);
                if (z8) {
                    if (k8.exists()) {
                        File j8 = dVar.j(i9);
                        k8.renameTo(j8);
                        long j9 = dVar.f6414b[i9];
                        long length = j8.length();
                        dVar.f6414b[i9] = length;
                        this.f6399h = (this.f6399h - j9) + length;
                    }
                } else {
                    v(k8);
                }
            }
            this.f6402k++;
            dVar.f6416d = null;
            if (dVar.f6415c | z8) {
                dVar.f6415c = true;
                this.f6400i.write("CLEAN " + dVar.f6413a + dVar.l() + '\n');
                if (z8) {
                    long j10 = this.f6403l;
                    this.f6403l = 1 + j10;
                    dVar.f6417e = j10;
                }
            } else {
                this.f6401j.remove(dVar.f6413a);
                this.f6400i.write("REMOVE " + dVar.f6413a + '\n');
            }
            this.f6400i.flush();
            if (this.f6399h > this.f6397f || F()) {
                this.f6404m.submit(this.f6405n);
            }
            return;
        }
        throw new IllegalStateException();
    }

    private static void v(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public synchronized e E(String str) {
        InputStream inputStream;
        r();
        O(str);
        d dVar = (d) this.f6401j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f6415c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f6398g];
        for (int i8 = 0; i8 < this.f6398g; i8++) {
            try {
                inputStreamArr[i8] = new FileInputStream(dVar.j(i8));
            } catch (FileNotFoundException unused) {
                for (int i9 = 0; i9 < this.f6398g && (inputStream = inputStreamArr[i9]) != null; i9++) {
                    N1.c.a(inputStream);
                }
                return null;
            }
        }
        this.f6402k++;
        this.f6400i.append((CharSequence) ("READ " + str + '\n'));
        if (F()) {
            this.f6404m.submit(this.f6405n);
        }
        return new e(this, str, dVar.f6417e, inputStreamArr, dVar.f6414b, null);
    }

    public synchronized boolean L(String str) {
        try {
            r();
            O(str);
            d dVar = (d) this.f6401j.get(str);
            if (dVar != null && dVar.f6416d == null) {
                for (int i8 = 0; i8 < this.f6398g; i8++) {
                    File j8 = dVar.j(i8);
                    if (j8.exists() && !j8.delete()) {
                        throw new IOException("failed to delete " + j8);
                    }
                    this.f6399h -= dVar.f6414b[i8];
                    dVar.f6414b[i8] = 0;
                }
                this.f6402k++;
                this.f6400i.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f6401j.remove(str);
                if (F()) {
                    this.f6404m.submit(this.f6405n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f6400i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f6401j.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f6416d != null) {
                    dVar.f6416d.a();
                }
            }
            N();
            this.f6400i.close();
            this.f6400i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void flush() {
        r();
        N();
        this.f6400i.flush();
    }

    public void u() {
        close();
        N1.c.b(this.f6392a);
    }

    public c z(String str) {
        return B(str, -1L);
    }

    /* loaded from: classes4.dex */
    static class b extends OutputStream {
        b() {
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
        }
    }
}
