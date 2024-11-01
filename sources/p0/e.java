package P0;

import J0.A;
import J0.C1257n;
import L0.m;
import M0.F;
import N0.j;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f7979e = Charset.forName(C.UTF8_NAME);

    /* renamed from: f, reason: collision with root package name */
    private static final int f7980f = 15;

    /* renamed from: g, reason: collision with root package name */
    private static final j f7981g = new j();

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f7982h = new Comparator() { // from class: P0.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int u8;
            u8 = e.u((File) obj, (File) obj2);
            return u8;
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final FilenameFilter f7983i = new FilenameFilter() { // from class: P0.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean v8;
            v8 = e.v(file, str);
            return v8;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f7984a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private final g f7985b;

    /* renamed from: c, reason: collision with root package name */
    private final R0.j f7986c;

    /* renamed from: d, reason: collision with root package name */
    private final C1257n f7987d;

    public e(g gVar, R0.j jVar, C1257n c1257n) {
        this.f7985b = gVar;
        this.f7986c = jVar;
        this.f7987d = c1257n;
    }

    private static String A(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f7979e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void B(File file, F.d dVar, String str, F.a aVar) {
        String d8 = this.f7987d.d(str);
        try {
            j jVar = f7981g;
            F(this.f7985b.i(str), jVar.M(jVar.L(A(file)).u(dVar).q(aVar).p(d8)));
        } catch (IOException e8) {
            G0.g.f().l("Could not synthesize final native report file for " + file, e8);
        }
    }

    private void C(String str, long j8) {
        boolean z8;
        List<File> r8 = this.f7985b.r(str, f7983i);
        if (r8.isEmpty()) {
            G0.g.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(r8);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z8 = false;
            for (File file : r8) {
                try {
                    arrayList.add(f7981g.j(A(file)));
                } catch (IOException e8) {
                    G0.g.f().l("Could not add event to report for " + file, e8);
                }
                if (z8 || s(file.getName())) {
                    z8 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            G0.g.f().k("Could not parse event files for session " + str);
            return;
        }
        D(this.f7985b.q(str, "report"), arrayList, j8, z8, m.k(str, this.f7985b), this.f7987d.d(str));
    }

    private void D(File file, List list, long j8, boolean z8, String str, String str2) {
        File n8;
        try {
            j jVar = f7981g;
            F r8 = jVar.L(A(file)).v(j8, z8, str).p(str2).r(list);
            F.e n9 = r8.n();
            if (n9 == null) {
                return;
            }
            G0.g.f().b("appQualitySessionId: " + str2);
            if (z8) {
                n8 = this.f7985b.l(n9.i());
            } else {
                n8 = this.f7985b.n(n9.i());
            }
            F(n8, jVar.M(r8));
        } catch (IOException e8) {
            G0.g.f().l("Could not synthesize final report file for " + file, e8);
        }
    }

    private int E(String str, int i8) {
        List r8 = this.f7985b.r(str, new FilenameFilter() { // from class: P0.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean t8;
                t8 = e.t(file, str2);
                return t8;
            }
        });
        Collections.sort(r8, new Comparator() { // from class: P0.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int x8;
                x8 = e.x((File) obj, (File) obj2);
                return x8;
            }
        });
        return f(r8, i8);
    }

    private static void F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f7979e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void G(File file, String str, long j8) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f7979e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j8));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private SortedSet e(String str) {
        this.f7985b.d();
        SortedSet p8 = p();
        if (str != null) {
            p8.remove(str);
        }
        if (p8.size() <= 8) {
            return p8;
        }
        while (p8.size() > 8) {
            String str2 = (String) p8.last();
            G0.g.f().b("Removing session over cap: " + str2);
            this.f7985b.e(str2);
            p8.remove(str2);
        }
        return p8;
    }

    private static int f(List list, int i8) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i8) {
                return size;
            }
            g.v(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i8 = this.f7986c.b().f9112a.f9124b;
        List n8 = n();
        int size = n8.size();
        if (size <= i8) {
            return;
        }
        Iterator it = n8.subList(i8, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static long h(long j8) {
        return j8 * 1000;
    }

    private void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static String m(int i8, boolean z8) {
        String str;
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i8));
        if (z8) {
            str = "_";
        } else {
            str = "";
        }
        return NotificationCompat.CATEGORY_EVENT + format + str;
    }

    private List n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f7985b.m());
        arrayList.addAll(this.f7985b.j());
        Comparator comparator = f7982h;
        Collections.sort(arrayList, comparator);
        List o8 = this.f7985b.o();
        Collections.sort(o8, comparator);
        arrayList.addAll(o8);
        return arrayList;
    }

    private static String o(String str) {
        return str.substring(0, f7980f);
    }

    private static boolean s(String str) {
        if (str.startsWith(NotificationCompat.CATEGORY_EVENT) && str.endsWith("_")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(File file, String str) {
        if (str.startsWith(NotificationCompat.CATEGORY_EVENT) && !str.endsWith("_")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean v(File file, String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void i() {
        j(this.f7985b.o());
        j(this.f7985b.m());
        j(this.f7985b.j());
    }

    public void k(String str, long j8) {
        for (String str2 : e(str)) {
            G0.g.f().i("Finalizing report for session " + str2);
            C(str2, j8);
            this.f7985b.e(str2);
        }
        g();
    }

    public void l(String str, F.d dVar, F.a aVar) {
        File q8 = this.f7985b.q(str, "report");
        G0.g.f().b("Writing native session report for " + str + " to file: " + q8);
        B(q8, dVar, str, aVar);
    }

    public SortedSet p() {
        return new TreeSet(this.f7985b.f()).descendingSet();
    }

    public long q(String str) {
        return this.f7985b.q(str, "start-time").lastModified();
    }

    public boolean r() {
        if (this.f7985b.o().isEmpty() && this.f7985b.m().isEmpty() && this.f7985b.j().isEmpty()) {
            return false;
        }
        return true;
    }

    public List w() {
        List<File> n8 = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n8) {
            try {
                arrayList.add(A.a(f7981g.L(A(file)), file.getName(), file));
            } catch (IOException e8) {
                G0.g.f().l("Could not load report file " + file + "; deleting", e8);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(F.e.d dVar, String str, boolean z8) {
        int i8 = this.f7986c.b().f9112a.f9123a;
        try {
            F(this.f7985b.q(str, m(this.f7984a.getAndIncrement(), z8)), f7981g.k(dVar));
        } catch (IOException e8) {
            G0.g.f().l("Could not persist event for session " + str, e8);
        }
        E(str, i8);
    }

    public void z(F f8) {
        F.e n8 = f8.n();
        if (n8 == null) {
            G0.g.f().b("Could not get session for report");
            return;
        }
        String i8 = n8.i();
        try {
            F(this.f7985b.q(i8, "report"), f7981g.M(f8));
            G(this.f7985b.q(i8, "start-time"), "", n8.l());
        } catch (IOException e8) {
            G0.g.f().c("Could not persist report for session " + i8, e8);
        }
    }
}
