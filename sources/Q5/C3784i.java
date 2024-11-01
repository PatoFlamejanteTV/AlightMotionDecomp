package q5;

import Q5.I;
import R5.AbstractC1435t;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import c5.C2041f;
import c5.C2055u;
import c5.Q;
import c6.InterfaceC2072n;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.io.File;
import java.lang.Character;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;
import n6.M;
import q5.C3784i;

/* renamed from: q5.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3784i {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37274a = new a(null);

    /* renamed from: q5.i$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: q5.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0828a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                boolean z8;
                C2041f.c c02 = ((C2041f) obj).c0();
                C2041f.c cVar = C2041f.c.f15790a;
                boolean z9 = false;
                if (c02 != cVar) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Boolean valueOf = Boolean.valueOf(z8);
                if (((C2041f) obj2).c0() != cVar) {
                    z9 = true;
                }
                return T5.a.a(valueOf, Boolean.valueOf(z9));
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int e(C2041f app1, C2041f app2) {
            AbstractC3292y.i(app1, "app1");
            AbstractC3292y.i(app2, "app2");
            if (app1.z() == null) {
                return 1;
            }
            if (app2.z() == null) {
                return -1;
            }
            String z8 = app1.z();
            AbstractC3292y.f(z8);
            String z9 = app2.z();
            AbstractC3292y.f(z9);
            return l6.n.m(z8, z9, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int g(C2041f app1, C2041f app2) {
            AbstractC3292y.i(app1, "app1");
            AbstractC3292y.i(app2, "app2");
            return AbstractC3292y.l(app2.v(), app1.v());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int h(InterfaceC2072n interfaceC2072n, Object obj, Object obj2) {
            return ((Number) interfaceC2072n.invoke(obj, obj2)).intValue();
        }

        public final void d(ArrayList tmpUserApps, Context context) {
            AbstractC3292y.i(tmpUserApps, "tmpUserApps");
            AbstractC3292y.i(context, "context");
            AbstractC1435t.B(tmpUserApps, new Comparator() { // from class: q5.h
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int e8;
                    e8 = C3784i.a.e((C2041f) obj, (C2041f) obj2);
                    return e8;
                }
            });
            C3791p a9 = C3791p.f37286s.a(context);
            a9.a();
            ArrayList<Q> t02 = a9.t0();
            a9.i();
            Iterator it = t02.iterator();
            AbstractC3292y.h(it, "iterator(...)");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                Q q8 = (Q) next;
                int size = tmpUserApps.size();
                for (int i8 = 0; i8 < size; i8++) {
                    long f02 = ((C2041f) tmpUserApps.get(i8)).f0();
                    if (l6.n.s(q8.s(), ((C2041f) tmpUserApps.get(i8)).Q(), true) && q8.w() > f02) {
                        ((C2041f) tmpUserApps.get(i8)).J0(C2041f.c.f15790a);
                    }
                }
            }
            Iterator it2 = tmpUserApps.iterator();
            while (it2.hasNext()) {
                C2041f c2041f = (C2041f) it2.next();
                for (Q q9 : t02) {
                    if (c2041f.i() == 1 || (AbstractC3292y.d(c2041f.Q(), q9.s()) && q9.h() == 1)) {
                        c2041f.J0(C2041f.c.f15791b);
                    }
                }
            }
            AbstractC1435t.B(tmpUserApps, new C0828a());
            int i9 = 0;
            while (i9 < tmpUserApps.size() && (!l6.n.s(context.getPackageName(), ((C2041f) tmpUserApps.get(i9)).Q(), true) || ((C2041f) tmpUserApps.get(i9)).c0() != C2041f.c.f15790a)) {
                i9++;
            }
            if (i9 < tmpUserApps.size()) {
                Object remove = tmpUserApps.remove(i9);
                AbstractC3292y.h(remove, "removeAt(...)");
                tmpUserApps.add(0, (C2041f) remove);
            }
        }

        public final void f(ArrayList tmpUserApps) {
            AbstractC3292y.i(tmpUserApps, "tmpUserApps");
            final InterfaceC2072n interfaceC2072n = new InterfaceC2072n() { // from class: q5.f
                @Override // c6.InterfaceC2072n
                public final Object invoke(Object obj, Object obj2) {
                    int g8;
                    g8 = C3784i.a.g((C2041f) obj, (C2041f) obj2);
                    return Integer.valueOf(g8);
                }
            };
            AbstractC1435t.B(tmpUserApps, new Comparator() { // from class: q5.g
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int h8;
                    h8 = C3784i.a.h(InterfaceC2072n.this, obj, obj2);
                    return h8;
                }
            });
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q5.i$b */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f37275a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f37276b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ApplicationInfo f37277c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, ApplicationInfo applicationInfo, U5.d dVar) {
            super(2, dVar);
            this.f37276b = context;
            this.f37277c = applicationInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f37276b, this.f37277c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f37275a == 0) {
                Q5.t.b(obj);
                C3770C.f37260a.j(this.f37276b, this.f37277c.packageName, R.drawable.vector_uptodown_logo_bag_disabled);
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final c5.C2041f A(android.content.pm.ApplicationInfo r21, c5.C2041f r22, android.content.pm.PackageInfo r23, q5.C3791p r24, android.content.Context r25, android.content.pm.PackageManager r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.C3784i.A(android.content.pm.ApplicationInfo, c5.f, android.content.pm.PackageInfo, q5.p, android.content.Context, android.content.pm.PackageManager, boolean, boolean):c5.f");
    }

    private final boolean D(String str) {
        if (!l6.n.B(str, "com.miui.", false, 2, null) && !l6.n.B(str, "com.xiaomi.", false, 2, null)) {
            return false;
        }
        return true;
    }

    private final String F(String str) {
        Normalizer.Form form = Normalizer.Form.NFD;
        if (!Normalizer.isNormalized(str, form)) {
            return new l6.j("[\\p{InCombiningDiacriticalMarks}]").f(Normalizer.normalize(str, form), "");
        }
        return str;
    }

    private final long c(ApplicationInfo applicationInfo) {
        File parentFile = new File(applicationInfo.sourceDir).getParentFile();
        if (parentFile != null && parentFile.isDirectory()) {
            long h8 = new S4.e().h(parentFile);
            String packageName = applicationInfo.packageName;
            AbstractC3292y.h(packageName, "packageName");
            long r8 = h8 + r(packageName);
            String packageName2 = applicationInfo.packageName;
            AbstractC3292y.h(packageName2, "packageName");
            return r8 + q(packageName2);
        }
        return 0L;
    }

    private final void d(C2041f c2041f, C3791p c3791p, PackageManager packageManager) {
        ApplicationInfo applicationInfo;
        ArrayList U8;
        if (c2041f.w() == null && c2041f.l() == 0) {
            try {
                String Q8 = c2041f.Q();
                AbstractC3292y.f(Q8);
                applicationInfo = S4.r.a(packageManager, Q8, 128);
            } catch (PackageManager.NameNotFoundException unused) {
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                S4.d dVar = S4.d.f9430a;
                String sourceDir = applicationInfo.sourceDir;
                AbstractC3292y.h(sourceDir, "sourceDir");
                c2041f.A0(dVar.h(sourceDir));
            }
            if (c2041f.w() != null) {
                AbstractC3292y.f(applicationInfo);
                c2041f.I0(c(applicationInfo));
                c3791p.n1(c2041f);
            } else {
                c2041f.u0(1);
                c3791p.l1(c2041f);
            }
            if (c2041f.l() == 0 && (U8 = c3791p.U(c2041f)) != null) {
                Iterator it = U8.iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    C2055u c2055u = (C2055u) next;
                    if (c2055u.b() == null || c2055u.d() == null) {
                        if (c2055u.a() != null) {
                            S4.d dVar2 = S4.d.f9430a;
                            String a9 = c2055u.a();
                            AbstractC3292y.f(a9);
                            c2055u.g(dVar2.h(a9));
                            String a10 = c2055u.a();
                            AbstractC3292y.f(a10);
                            c2055u.h(dVar2.e(a10));
                            c3791p.m1(c2055u);
                        }
                    }
                }
            }
        }
    }

    private final void e(C2041f c2041f, C3791p c3791p, PackageManager packageManager) {
        ApplicationInfo applicationInfo;
        if (c2041f.X() == null && c2041f.l() == 0) {
            try {
                String Q8 = c2041f.Q();
                AbstractC3292y.f(Q8);
                applicationInfo = S4.r.a(packageManager, Q8, 128);
            } catch (PackageManager.NameNotFoundException unused) {
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                c2041f.G0(S4.d.f9430a.e(applicationInfo.sourceDir));
            }
            if (c2041f.X() != null) {
                c3791p.o1(c2041f);
            } else {
                c2041f.u0(1);
                c3791p.k1(c2041f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(String app1, String app2) {
        AbstractC3292y.i(app1, "app1");
        AbstractC3292y.i(app2, "app2");
        return l6.n.m(app1, app2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(InterfaceC2072n interfaceC2072n, Object obj, Object obj2) {
        return ((Number) interfaceC2072n.invoke(obj, obj2)).intValue();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0066 -> B:12:0x0067). Please report as a decompilation issue!!! */
    private final byte[] o(PackageManager packageManager, String str) {
        byte[] bArr;
        SigningInfo signingInfo;
        boolean hasPastSigningCertificates;
        Signature[] apkContentsSigners;
        Signature[] signingCertificateHistory;
        boolean z8;
        Signature[] signingCertificateHistory2;
        Signature[] signingCertificateHistory3;
        try {
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            signingInfo = S4.r.d(packageManager, str, 134217728).signingInfo;
            hasPastSigningCertificates = signingInfo.hasPastSigningCertificates();
            if (hasPastSigningCertificates) {
                signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                AbstractC3292y.h(signingCertificateHistory, "getSigningCertificateHistory(...)");
                if (signingCertificateHistory.length == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    signingCertificateHistory2 = signingInfo.getSigningCertificateHistory();
                    int length = signingCertificateHistory2.length - 1;
                    signingCertificateHistory3 = signingInfo.getSigningCertificateHistory();
                    bArr = signingCertificateHistory3[length].toByteArray();
                }
            }
            apkContentsSigners = signingInfo.getApkContentsSigners();
            if (apkContentsSigners != null && apkContentsSigners.length != 0) {
                bArr = apkContentsSigners[0].toByteArray();
            }
            bArr = null;
        } else {
            Signature[] signatureArr = S4.r.d(packageManager, str, 64).signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                bArr = signatureArr[0].toByteArray();
            }
            bArr = null;
        }
        return bArr;
    }

    private final String p(PackageManager packageManager, String str, String str2) {
        byte[] o8 = o(packageManager, str);
        if (o8 != null) {
            if (AbstractC3292y.d(str2, SameMD5.TAG)) {
                return S4.d.f9430a.g(o8);
            }
            if (AbstractC3292y.d(str2, "SHA256")) {
                return S4.d.f9430a.d(o8);
            }
        }
        return null;
    }

    private final long q(String str) {
        try {
            return new S4.e().h(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + str + '/'));
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0L;
        }
    }

    private final long r(String str) {
        try {
            return new S4.e().h(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/obb/" + str + '/'));
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0L;
        }
    }

    private final boolean u(int i8) {
        Character.UnicodeScript of;
        Character.UnicodeScript unicodeScript;
        if (Build.VERSION.SDK_INT >= 24) {
            of = Character.UnicodeScript.of(i8);
            unicodeScript = Character.UnicodeScript.HAN;
            if (of == unicodeScript) {
                return true;
            }
            return false;
        }
        return Character.isIdeographic(i8);
    }

    private final boolean v(ApplicationInfo applicationInfo) {
        if ((applicationInfo.flags & 2) != 0) {
            return true;
        }
        return false;
    }

    private final boolean w(C2041f c2041f) {
        if (c2041f.Q() != null && (c2041f.l0() || c2041f.n0())) {
            String Q8 = c2041f.Q();
            AbstractC3292y.f(Q8);
            if (D(Q8)) {
                return true;
            }
        }
        return false;
    }

    private final boolean x(String str, PackageManager packageManager) {
        if (str == null || packageManager.getLaunchIntentForPackage(str) == null) {
            return true;
        }
        return false;
    }

    public final C2041f B(Context context, String str) {
        PackageInfo packageInfo;
        AbstractC3292y.i(context, "context");
        synchronized (UptodownApp.f29249C.i()) {
            C2041f c2041f = null;
            if (str == null) {
                return null;
            }
            C3791p a9 = C3791p.f37286s.a(context);
            a9.a();
            PackageManager packageManager = context.getPackageManager();
            try {
                PackageManager packageManager2 = context.getPackageManager();
                AbstractC3292y.h(packageManager2, "getPackageManager(...)");
                packageInfo = S4.r.d(packageManager2, str, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                SettingsPreferences.a aVar = SettingsPreferences.f30529b;
                boolean g02 = aVar.g0(context);
                boolean h02 = aVar.h0(context);
                PackageManager packageManager3 = context.getPackageManager();
                AbstractC3292y.h(packageManager3, "getPackageManager(...)");
                ApplicationInfo a10 = S4.r.a(packageManager3, str, 128);
                String packageName = a10.packageName;
                AbstractC3292y.h(packageName, "packageName");
                C2041f S8 = a9.S(packageName);
                AbstractC3292y.f(packageManager);
                c2041f = A(a10, S8, packageInfo, a9, context, packageManager, g02, h02);
            }
            a9.i();
            return c2041f;
        }
    }

    public final ArrayList C(Context context) {
        ArrayList arrayList;
        PackageInfo packageInfo;
        AbstractC3292y.i(context, "context");
        synchronized (UptodownApp.f29249C.i()) {
            arrayList = new ArrayList();
            C3791p a9 = C3791p.f37286s.a(context);
            a9.a();
            PackageManager packageManager = context.getPackageManager();
            AbstractC3292y.f(packageManager);
            List<ApplicationInfo> b9 = S4.r.b(packageManager, 128);
            ArrayList V8 = a9.V();
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            boolean g02 = aVar.g0(context);
            boolean h02 = aVar.h0(context);
            for (ApplicationInfo applicationInfo : b9) {
                C2041f c2041f = null;
                try {
                    String packageName = applicationInfo.packageName;
                    AbstractC3292y.h(packageName, "packageName");
                    packageInfo = S4.r.d(packageManager, packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    Iterator it = V8.iterator();
                    int i8 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            int i9 = i8 + 1;
                            C2041f c2041f2 = (C2041f) it.next();
                            Iterator it2 = it;
                            if (l6.n.t(c2041f2.Q(), applicationInfo.packageName, false, 2, null)) {
                                c2041f = c2041f2;
                                break;
                            }
                            i8 = i9;
                            it = it2;
                        } else {
                            i8 = -1;
                            break;
                        }
                    }
                    if (i8 >= 0) {
                        V8.remove(i8);
                    }
                    arrayList.add(A(applicationInfo, c2041f, packageInfo, a9, context, packageManager, g02, h02));
                }
            }
            Iterator it3 = V8.iterator();
            AbstractC3292y.h(it3, "iterator(...)");
            while (it3.hasNext()) {
                Object next = it3.next();
                AbstractC3292y.h(next, "next(...)");
                C2041f c2041f3 = (C2041f) next;
                a9.r(c2041f3);
                if (c2041f3.Q() != null) {
                    String Q8 = c2041f3.Q();
                    AbstractC3292y.f(Q8);
                    a9.M(Q8);
                }
            }
            a9.i();
        }
        return arrayList;
    }

    public final void E(C2041f appTmp, PackageInfo pInfo, Context context) {
        AbstractC3292y.i(appTmp, "appTmp");
        AbstractC3292y.i(pInfo, "pInfo");
        AbstractC3292y.i(context, "context");
        try {
            appTmp.C0(pInfo.applicationInfo.loadLabel(context.getPackageManager()).toString());
        } catch (Exception unused) {
            appTmp.C0(appTmp.Q());
        }
        try {
            Configuration configuration = new Configuration();
            configuration.setLocale(new Locale("xx"));
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(pInfo.applicationInfo.packageName);
            AbstractC3292y.h(resourcesForApplication, "getResourcesForApplication(...)");
            resourcesForApplication.updateConfiguration(configuration, context.getResources().getDisplayMetrics());
            appTmp.r0(resourcesForApplication.getString(pInfo.applicationInfo.labelRes));
        } catch (Exception unused2) {
            appTmp.r0(appTmp.z());
        }
        String f8 = appTmp.f();
        AbstractC3292y.f(f8);
        int length = f8.length();
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                if (u(f8.charAt(i8))) {
                    appTmp.r0(appTmp.Q());
                    break;
                }
                i8++;
            } else {
                String f9 = appTmp.f();
                AbstractC3292y.f(f9);
                appTmp.r0(F(f9));
                break;
            }
        }
        if (l6.n.s(appTmp.f(), "null", true)) {
            appTmp.u0(1);
        }
    }

    public final void f(ArrayList apps, Context context) {
        AbstractC3292y.i(apps, "apps");
        AbstractC3292y.i(context, "context");
        synchronized (UptodownApp.f29249C.j()) {
            try {
                PackageManager packageManager = context.getPackageManager();
                C3791p a9 = C3791p.f37286s.a(context);
                a9.a();
                Iterator it = apps.iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    AbstractC3292y.f(packageManager);
                    d((C2041f) next, a9, packageManager);
                }
                a9.i();
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ArrayList g(ArrayList arrayList, Context context) {
        AbstractC3292y.i(context, "context");
        synchronized (UptodownApp.f29249C.k()) {
            if (arrayList != null) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    C3791p a9 = C3791p.f37286s.a(context);
                    a9.a();
                    Iterator it = arrayList.iterator();
                    AbstractC3292y.h(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC3292y.h(next, "next(...)");
                        AbstractC3292y.f(packageManager);
                        e((C2041f) next, a9, packageManager);
                    }
                    a9.i();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    public final ArrayList h(ArrayList apps) {
        AbstractC3292y.i(apps, "apps");
        ArrayList arrayList = new ArrayList();
        Iterator it = apps.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            C2041f c2041f = (C2041f) next;
            if (c2041f.l() == 0) {
                arrayList.add(c2041f);
            }
        }
        return arrayList;
    }

    public final String i(Context context, String packageName) {
        InstallSourceInfo installSourceInfo;
        String installingPackageName;
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(packageName, "packageName");
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                installSourceInfo = context.getPackageManager().getInstallSourceInfo(packageName);
                installingPackageName = installSourceInfo.getInstallingPackageName();
                return installingPackageName;
            }
            return context.getPackageManager().getInstallerPackageName(packageName);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final String j(ArrayList apps) {
        AbstractC3292y.i(apps, "apps");
        ArrayList arrayList = new ArrayList();
        Iterator it = apps.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            C2041f c2041f = (C2041f) next;
            String w8 = c2041f.w();
            AbstractC3292y.f(w8);
            arrayList.add(w8);
            if (c2041f.b0() != null) {
                AbstractC3292y.f(c2041f.b0());
                if (!r6.isEmpty()) {
                    ArrayList b02 = c2041f.b0();
                    AbstractC3292y.f(b02);
                    Iterator it2 = b02.iterator();
                    AbstractC3292y.h(it2, "iterator(...)");
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        AbstractC3292y.h(next2, "next(...)");
                        C2055u c2055u = (C2055u) next2;
                        if (c2055u.b() != null) {
                            String b9 = c2055u.b();
                            AbstractC3292y.f(b9);
                            arrayList.add(b9);
                        }
                    }
                }
            }
            if (c2041f.I() != null) {
                AbstractC3292y.f(c2041f.I());
                if (!r6.isEmpty()) {
                    ArrayList I8 = c2041f.I();
                    AbstractC3292y.f(I8);
                    Iterator it3 = I8.iterator();
                    AbstractC3292y.h(it3, "iterator(...)");
                    while (it3.hasNext()) {
                        Object next3 = it3.next();
                        AbstractC3292y.h(next3, "next(...)");
                        C2055u c2055u2 = (C2055u) next3;
                        if (c2055u2.b() != null) {
                            String b10 = c2055u2.b();
                            AbstractC3292y.f(b10);
                            arrayList.add(b10);
                        }
                    }
                }
            }
        }
        final InterfaceC2072n interfaceC2072n = new InterfaceC2072n() { // from class: q5.d
            @Override // c6.InterfaceC2072n
            public final Object invoke(Object obj, Object obj2) {
                int k8;
                k8 = C3784i.k((String) obj, (String) obj2);
                return Integer.valueOf(k8);
            }
        };
        AbstractC1435t.B(arrayList, new Comparator() { // from class: q5.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int l8;
                l8 = C3784i.l(InterfaceC2072n.this, obj, obj2);
                return l8;
            }
        });
        Iterator it4 = arrayList.iterator();
        AbstractC3292y.h(it4, "iterator(...)");
        String str = null;
        while (it4.hasNext()) {
            Object next4 = it4.next();
            AbstractC3292y.h(next4, "next(...)");
            String str2 = (String) next4;
            if (str == null) {
                str = str2;
            } else {
                Y y8 = Y.f34578a;
                str = String.format("%s%s", Arrays.copyOf(new Object[]{str, str2}, 2));
                AbstractC3292y.h(str, "format(...)");
            }
        }
        if (str != null) {
            return S4.d.f9430a.f(str + Build.VERSION.SDK_INT);
        }
        return str;
    }

    public final String m(PackageManager pm, String packagename) {
        AbstractC3292y.i(pm, "pm");
        AbstractC3292y.i(packagename, "packagename");
        return p(pm, packagename, SameMD5.TAG);
    }

    public final String n(PackageManager pm, String packagename) {
        AbstractC3292y.i(pm, "pm");
        AbstractC3292y.i(packagename, "packagename");
        return p(pm, packagename, "SHA256");
    }

    public final String s(String sha256) {
        AbstractC3292y.i(sha256, "sha256");
        return "https://www.virustotal.com/gui/file/" + sha256 + "/detection";
    }

    public final boolean t(String str, Context context) {
        PackageInfo packageInfo = null;
        if (str != null && context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageInfo = S4.r.d(packageManager, str, 0);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (packageInfo == null) {
            return false;
        }
        return true;
    }

    public final boolean y(String str) {
        if (str == null || l6.n.A(str, "org.chromium.webapk.", true)) {
            return false;
        }
        return Pattern.compile("^[a-zA-Z]\\w*(\\.\\w+)+$").matcher(str).matches();
    }

    public final boolean z(Context context) {
        AbstractC3292y.i(context, "context");
        String str = Build.BRAND;
        String str2 = Build.MANUFACTURER;
        if (l6.n.s(str, "Xiaomi", true) || l6.n.s(str2, "Xiaomi", true) || l6.n.s(str, "Poco", true)) {
            return true;
        }
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        ArrayList V8 = a9.V();
        a9.i();
        Iterator it = V8.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        int i8 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            if (w((C2041f) next) && (i8 = i8 + 1) > 5) {
                break;
            }
        }
        if (i8 > 5) {
            return true;
        }
        return false;
    }
}
