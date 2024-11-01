package J0;

import j$.util.Objects;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: J0.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1256m {

    /* renamed from: d, reason: collision with root package name */
    private static final FilenameFilter f3925d = new FilenameFilter() { // from class: J0.k
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean d8;
            d8 = C1256m.d(file, str);
            return d8;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator f3926e = new Comparator() { // from class: J0.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int e8;
            e8 = C1256m.e((File) obj, (File) obj2);
            return e8;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final P0.g f3927a;

    /* renamed from: b, reason: collision with root package name */
    private String f3928b = null;

    /* renamed from: c, reason: collision with root package name */
    private String f3929c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1256m(P0.g gVar) {
        this.f3927a = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(File file, String str) {
        return str.startsWith("aqs.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    private static void f(P0.g gVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                gVar.q(str, "aqs." + str2).createNewFile();
            } catch (IOException e8) {
                G0.g.f().l("Failed to persist App Quality Sessions session id.", e8);
            }
        }
    }

    static String g(P0.g gVar, String str) {
        List r8 = gVar.r(str, f3925d);
        if (r8.isEmpty()) {
            G0.g.f().k("Unable to read App Quality Sessions session id.");
            return null;
        }
        return ((File) Collections.min(r8, f3926e)).getName().substring(4);
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f3928b, str)) {
            return this.f3929c;
        }
        return g(this.f3927a, str);
    }

    public synchronized void h(String str) {
        if (!Objects.equals(this.f3929c, str)) {
            f(this.f3927a, this.f3928b, str);
            this.f3929c = str;
        }
    }

    public synchronized void i(String str) {
        if (!Objects.equals(this.f3928b, str)) {
            f(this.f3927a, str, this.f3929c);
            this.f3928b = str;
        }
    }
}
