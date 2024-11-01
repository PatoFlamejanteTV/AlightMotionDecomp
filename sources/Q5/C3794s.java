package q5;

import R5.AbstractC1435t;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import c5.Q;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: q5.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3794s {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37307a = new a(null);

    /* renamed from: q5.s$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: q5.s$b */
    /* loaded from: classes5.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return T5.a.a(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
        }
    }

    private final void l(Context context, File file, File file2) {
        Object obj;
        C3791p a9 = C3791p.f37286s.a(context);
        String name = file.getName();
        AbstractC3292y.h(name, "getName(...)");
        c5.r Y8 = a9.Y(name);
        if (Y8 != null) {
            Y8.D0(file2.getName());
            Y8.o0(file2.getAbsolutePath());
            a9.q1(Y8);
        }
        Iterator it = a9.t0().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3292y.d(((Q) obj).l(), file.getName())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Q q8 = (Q) obj;
        if (q8 != null) {
            q8.U(file2.getName());
            a9.p1(q8);
        }
        a9.i();
    }

    public final ArrayList a(Context context) {
        AbstractC3292y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if (externalStoragePublicDirectory.exists() && externalStoragePublicDirectory.canRead() && externalStoragePublicDirectory.isDirectory()) {
            S4.e eVar = new S4.e();
            AbstractC3292y.f(externalStoragePublicDirectory);
            arrayList.addAll(eVar.i(externalStoragePublicDirectory, context));
        }
        return arrayList;
    }

    public final File b(Context context, File file) {
        PackageInfo packageInfo;
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(file, "file");
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        String name = file.getName();
        AbstractC3292y.h(name, "getName(...)");
        File file2 = null;
        if (l6.n.r(name, ".apk", false, 2, null)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                AbstractC3292y.f(packageManager);
                String absolutePath = file.getAbsolutePath();
                AbstractC3292y.h(absolutePath, "getAbsolutePath(...)");
                packageInfo = S4.r.c(packageManager, absolutePath, 1);
            } catch (Exception unused) {
                packageInfo = null;
            }
            if (packageInfo == null && (file2 = new C3788m().f(file, context)) != null) {
                l(context, file, file2);
            }
        } else {
            String name2 = file.getName();
            AbstractC3292y.h(name2, "getName(...)");
            if (l6.n.r(name2, ".xapk", false, 2, null) && (file2 = new C3788m().e(file, context)) != null) {
                l(context, file, file2);
            }
        }
        a9.i();
        return file2;
    }

    public final void c(Context context) {
        AbstractC3292y.i(context, "context");
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        ArrayList t02 = a9.t0();
        a9.i();
        Iterator it = new C3794s().e(context).iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            File file = (File) next;
            Iterator it2 = t02.iterator();
            AbstractC3292y.h(it2, "iterator(...)");
            while (true) {
                if (it2.hasNext()) {
                    Object next2 = it2.next();
                    AbstractC3292y.h(next2, "next(...)");
                    Q q8 = (Q) next2;
                    if (q8.h() != 0 || q8.l() == null || !l6.n.s(q8.l(), file.getName(), true)) {
                    }
                } else {
                    file.delete();
                    break;
                }
            }
        }
    }

    public final ArrayList d(Context context) {
        AbstractC3292y.i(context, "context");
        return new S4.e().i(f(context), context);
    }

    public final ArrayList e(Context context) {
        AbstractC3292y.i(context, "context");
        return new S4.e().i(g(context), context);
    }

    public final File f(Context context) {
        AbstractC3292y.i(context, "context");
        return new S4.f().a(context, "Apps");
    }

    public final File g(Context context) {
        AbstractC3292y.i(context, "context");
        return new S4.f().a(context, "Updates");
    }

    public final File h(Context context) {
        AbstractC3292y.i(context, "context");
        ArrayList j8 = j(context);
        int size = j8.size();
        if (size != 0) {
            if (size != 1) {
                if (j8.size() > 1) {
                    AbstractC1435t.B(j8, new b());
                }
                return (File) j8.get(0);
            }
            return (File) j8.get(0);
        }
        return null;
    }

    public final String i(String fileNameParam) {
        int X8;
        AbstractC3292y.i(fileNameParam, "fileNameParam");
        String str = "uptodown-";
        if (!l6.n.B(fileNameParam, str, false, 2, null) || l6.n.s0(fileNameParam, new String[]{"-"}, false, 0, 6, null).size() != 2) {
            return null;
        }
        int R8 = l6.n.R(fileNameParam, " ", 0, false, 6, null);
        if (R8 > 0) {
            String substring = fileNameParam.substring(0, R8);
            AbstractC3292y.h(substring, "substring(...)");
            fileNameParam = substring + ".apk";
        }
        if (l6.n.G(fileNameParam, "(", false, 2, null) && l6.n.q(fileNameParam, ").apk", true)) {
            String substring2 = fileNameParam.substring(0, l6.n.R(fileNameParam, "(", 0, false, 6, null));
            AbstractC3292y.h(substring2, "substring(...)");
            String substring3 = substring2.substring(str.length());
            AbstractC3292y.h(substring3, "substring(...)");
            return substring3;
        }
        if (!l6.n.q(fileNameParam, ".apk", true) || (X8 = l6.n.X(fileNameParam, ".apk", 0, false, 6, null)) <= 0 || fileNameParam.length() != X8 + 4) {
            return null;
        }
        String substring4 = fileNameParam.substring(0, X8);
        AbstractC3292y.h(substring4, "substring(...)");
        String substring5 = substring4.substring(str.length());
        AbstractC3292y.h(substring5, "substring(...)");
        return substring5;
    }

    public final ArrayList j(Context context) {
        AbstractC3292y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if (externalStoragePublicDirectory.exists() && externalStoragePublicDirectory.canRead() && externalStoragePublicDirectory.isDirectory()) {
            S4.e eVar = new S4.e();
            AbstractC3292y.f(externalStoragePublicDirectory);
            Iterator it = eVar.i(externalStoragePublicDirectory, context).iterator();
            AbstractC3292y.h(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                File file = (File) next;
                String name = file.getName();
                AbstractC3292y.h(name, "getName(...)");
                if (l6.n.q(name, ".apk", true)) {
                    AbstractC3292y.f(packageManager);
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3292y.h(absolutePath, "getAbsolutePath(...)");
                    PackageInfo c8 = S4.r.c(packageManager, absolutePath, 128);
                    if (c8 != null && c8.packageName.equals(context.getPackageName())) {
                        arrayList.add(file);
                    }
                }
            }
        }
        return arrayList;
    }

    public final long k(Context context, File storageDir) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(storageDir, "storageDir");
        Iterator it = new C3788m().k(context).iterator();
        long j8 = 0;
        while (it.hasNext()) {
            j8 += ((c5.r) it.next()).a0();
        }
        return storageDir.getUsableSpace() - j8;
    }
}
