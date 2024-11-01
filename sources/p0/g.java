package P0;

import G0.j;
import J0.AbstractC1253j;
import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    final String f7989a;

    /* renamed from: b, reason: collision with root package name */
    private final File f7990b;

    /* renamed from: c, reason: collision with root package name */
    private final File f7991c;

    /* renamed from: d, reason: collision with root package name */
    private final File f7992d;

    /* renamed from: e, reason: collision with root package name */
    private final File f7993e;

    /* renamed from: f, reason: collision with root package name */
    private final File f7994f;

    /* renamed from: g, reason: collision with root package name */
    private final File f7995g;

    public g(Context context) {
        String str;
        String d8 = j.f2755a.e(context).d();
        this.f7989a = d8;
        File filesDir = context.getFilesDir();
        this.f7990b = filesDir;
        if (y()) {
            str = ".crashlytics.v3" + File.separator + x(d8);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File t8 = t(new File(filesDir, str));
        this.f7991c = t8;
        this.f7992d = t(new File(t8, "open-sessions"));
        this.f7993e = t(new File(t8, "reports"));
        this.f7994f = t(new File(t8, "priority-reports"));
        this.f7995g = t(new File(t8, "native-reports"));
    }

    private void b(String str) {
        File file = new File(this.f7990b, str);
        if (file.exists() && v(file)) {
            G0.g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(final String str) {
        String[] list;
        if (this.f7990b.exists() && (list = this.f7990b.list(new FilenameFilter() { // from class: P0.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean s8;
                s8 = g.s(str, file, str2);
                return s8;
            }
        })) != null) {
            for (String str2 : list) {
                b(str2);
            }
        }
    }

    private File p(String str) {
        return u(new File(this.f7992d, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean s(String str, File file, String str2) {
        return str2.startsWith(str);
    }

    private static synchronized File t(File file) {
        synchronized (g.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return file;
                    }
                    G0.g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                    file.delete();
                }
                if (!file.mkdirs()) {
                    G0.g.f().d("Could not create Crashlytics-specific directory: " + file);
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static File u(File file) {
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean v(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                v(file2);
            }
        }
        return file.delete();
    }

    private static List w(Object[] objArr) {
        if (objArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(objArr);
    }

    static String x(String str) {
        if (str.length() > 40) {
            return AbstractC1253j.z(str);
        }
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean y() {
        return !this.f7989a.isEmpty();
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (y()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public boolean e(String str) {
        return v(new File(this.f7992d, str));
    }

    public List f() {
        return w(this.f7992d.list());
    }

    public File g(String str) {
        return new File(this.f7991c, str);
    }

    public List h(FilenameFilter filenameFilter) {
        return w(this.f7991c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.f7995g, str);
    }

    public List j() {
        return w(this.f7995g.listFiles());
    }

    public File k(String str) {
        return u(new File(p(str), "native"));
    }

    public File l(String str) {
        return new File(this.f7994f, str);
    }

    public List m() {
        return w(this.f7994f.listFiles());
    }

    public File n(String str) {
        return new File(this.f7993e, str);
    }

    public List o() {
        return w(this.f7993e.listFiles());
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public List r(String str, FilenameFilter filenameFilter) {
        return w(p(str).listFiles(filenameFilter));
    }
}
