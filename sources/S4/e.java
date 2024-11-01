package S4;

import Q5.I;
import S4.x;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.text.format.DateFormat;
import android.widget.Toast;
import androidx.documentfile.provider.DocumentFile;
import c6.InterfaceC2072n;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3274f;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3458i;
import n6.C3445b0;
import n6.M;

/* loaded from: classes5.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f9431a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f9432b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9433c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, String str, U5.d dVar) {
            super(2, dVar);
            this.f9432b = context;
            this.f9433c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f9432b, this.f9433c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f9431a == 0) {
                Q5.t.b(obj);
                Toast.makeText(this.f9432b, this.f9433c, 0).show();
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        int f9434a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9435b;

        /* renamed from: d, reason: collision with root package name */
        int f9437d;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9435b = obj;
            this.f9437d |= Integer.MIN_VALUE;
            return e.this.d(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f9438a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0 function0) {
            super(0);
            this.f9438a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m63invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m63invoke() {
            this.f9438a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f9439a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0 function0) {
            super(0);
            this.f9439a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m64invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m64invoke() {
            this.f9439a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S4.e$e, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0199e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f9440a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f9441b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9442c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f9443d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0199e(Context context, String str, Function0 function0, U5.d dVar) {
            super(2, dVar);
            this.f9441b = context;
            this.f9442c = str;
            this.f9443d = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0199e(this.f9441b, this.f9442c, this.f9443d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f9440a == 0) {
                Q5.t.b(obj);
                Toast.makeText(this.f9441b, this.f9442c, 0).show();
                this.f9443d.invoke();
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0199e) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    private final boolean a(String str) {
        return !l6.n.E(str, "Backups", true);
    }

    private final Object c(Context context, String str, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.c(), new a(context, str, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    private final Object e(Context context, String str, Function0 function0, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.c(), new C0199e(context, str, function0, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    private final ArrayList j(Context context) {
        ArrayList arrayList = new ArrayList();
        ArrayList b9 = new v().b(context);
        if (b9.size() > 0) {
            Iterator it = b9.iterator();
            while (it.hasNext()) {
                File file = new File(((P4.f) it.next()).b());
                if (file.exists() && file.isDirectory()) {
                    arrayList.addAll(i(file, context));
                }
            }
        } else {
            File rootDir = Environment.getExternalStorageDirectory();
            AbstractC3292y.h(rootDir, "rootDir");
            arrayList.addAll(i(rootDir, context));
        }
        return arrayList;
    }

    private final ArrayList n(ArrayList arrayList, Context context) {
        ArrayList arrayList2 = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        AbstractC3292y.h(packageManager, "context.packageManager");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            AbstractC3292y.h(name, "file.name");
            if (!l6.n.B(name, ".", false, 2, null)) {
                String name2 = file.getName();
                AbstractC3292y.h(name2, "file.name");
                if (l6.n.r(name2, ".apk", false, 2, null)) {
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3292y.h(absolutePath, "file.absolutePath");
                    PackageInfo c8 = r.c(packageManager, absolutePath, 128);
                    if (c8 != null) {
                        if (!k(c8)) {
                            arrayList2.add(file);
                        }
                    } else {
                        String name3 = file.getName();
                        AbstractC3292y.h(name3, "file.name");
                        if (!l6.n.B(name3, "split_config", false, 2, null)) {
                            arrayList2.add(file);
                        }
                    }
                } else {
                    x.a aVar = x.f9510b;
                    String name4 = file.getName();
                    AbstractC3292y.h(name4, "file.name");
                    if (aVar.a(name4)) {
                        arrayList2.add(file);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final String b(Object directory) {
        AbstractC3292y.i(directory, "directory");
        int i8 = 0;
        if (directory instanceof File) {
            File[] listFiles = ((File) directory).listFiles();
            if (listFiles != null) {
                i8 = listFiles.length;
            }
        } else if (directory instanceof DocumentFile) {
            i8 = ((DocumentFile) directory).listFiles().length;
        }
        return String.valueOf(i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.Object r11, java.lang.String r12, android.content.Context r13, kotlin.jvm.functions.Function0 r14, U5.d r15) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.e.d(java.lang.Object, java.lang.String, android.content.Context, kotlin.jvm.functions.Function0, U5.d):java.lang.Object");
    }

    public final long f(String realPath) {
        AbstractC3292y.i(realPath, "realPath");
        try {
            return new File(realPath).length();
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final String g(long j8) {
        Calendar calendar = Calendar.getInstance(Locale.FRANCE);
        calendar.setTimeInMillis(j8);
        return DateFormat.format("dd MMM yyyy hh:mm", calendar).toString();
    }

    public final long h(File dir) {
        File[] fileArr;
        AbstractC3292y.i(dir, "dir");
        if (dir.isDirectory()) {
            try {
                fileArr = dir.listFiles();
            } catch (SecurityException e8) {
                e8.printStackTrace();
                fileArr = null;
            }
            long j8 = 0;
            if (fileArr == null) {
                return 0L;
            }
            Iterator a9 = AbstractC3274f.a(fileArr);
            while (a9.hasNext()) {
                j8 += h((File) a9.next());
            }
            return j8;
        }
        return dir.length();
    }

    public final ArrayList i(File directory, Context context) {
        AbstractC3292y.i(directory, "directory");
        AbstractC3292y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        File[] listFiles = directory.listFiles();
        if (listFiles != null) {
            String packageName = context.getPackageName();
            for (File childFile : listFiles) {
                if (childFile.isDirectory()) {
                    String absolutePath = childFile.getAbsolutePath();
                    AbstractC3292y.h(absolutePath, "childFile.absolutePath");
                    if (!l6.n.r(absolutePath, "Android/data/" + packageName, false, 2, null)) {
                        String name = childFile.getName();
                        AbstractC3292y.h(name, "childFile.name");
                        if (a(name)) {
                            AbstractC3292y.h(childFile, "childFile");
                            arrayList.addAll(i(childFile, context));
                        }
                    }
                } else {
                    String name2 = childFile.getName();
                    AbstractC3292y.h(name2, "childFile.name");
                    if (l(name2)) {
                        arrayList.add(childFile);
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean k(PackageInfo pi) {
        AbstractC3292y.i(pi, "pi");
        try {
            Bundle bundle = pi.applicationInfo.metaData;
            if (bundle == null || !bundle.containsKey("com.android.vending.splits.required")) {
                return false;
            }
            return pi.applicationInfo.metaData.getBoolean("com.android.vending.splits.required");
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public final boolean l(String name) {
        AbstractC3292y.i(name, "name");
        if ((!l6.n.r(name, ".apk", false, 2, null) && !x.f9510b.a(name)) || l6.n.B(name, ".", false, 2, null)) {
            return false;
        }
        return true;
    }

    public final String m(String fileName) {
        AbstractC3292y.i(fileName, "fileName");
        return new l6.j("[/\\\\:*?\"<>|]").f(fileName, "");
    }

    public final ArrayList o(Context context) {
        AbstractC3292y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(j(context));
        return n(arrayList, context);
    }
}
