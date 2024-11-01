package J0;

import M0.F;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: J0.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1268z {

    /* renamed from: g, reason: collision with root package name */
    private static final Map f4000g;

    /* renamed from: h, reason: collision with root package name */
    static final String f4001h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f4002a;

    /* renamed from: b, reason: collision with root package name */
    private final I f4003b;

    /* renamed from: c, reason: collision with root package name */
    private final C1245b f4004c;

    /* renamed from: d, reason: collision with root package name */
    private final S0.d f4005d;

    /* renamed from: e, reason: collision with root package name */
    private final R0.j f4006e;

    /* renamed from: f, reason: collision with root package name */
    private final G0.j f4007f = G0.j.f2755a;

    static {
        HashMap hashMap = new HashMap();
        f4000g = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f4001h = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.2.0");
    }

    public C1268z(Context context, I i8, C1245b c1245b, S0.d dVar, R0.j jVar) {
        this.f4002a = context;
        this.f4003b = i8;
        this.f4004c = c1245b;
        this.f4005d = dVar;
        this.f4006e = jVar;
    }

    private F.e.d.a.c A(F.a aVar) {
        return this.f4007f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private F.a a(F.a aVar) {
        List list;
        if (this.f4006e.b().f9113b.f9122c && this.f4004c.f3887c.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (C1250g c1250g : this.f4004c.f3887c) {
                arrayList.add(F.a.AbstractC0091a.a().d(c1250g.c()).b(c1250g.a()).c(c1250g.b()).a());
            }
            list = DesugarCollections.unmodifiableList(arrayList);
        } else {
            list = null;
        }
        return F.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(list).a();
    }

    private F.b b() {
        return M0.F.b().l("19.2.0").h(this.f4004c.f3885a).i(this.f4003b.a().c()).g(this.f4003b.a().e()).f(this.f4003b.a().d()).d(this.f4004c.f3890f).e(this.f4004c.f3891g).k(4);
    }

    private static long f(long j8) {
        if (j8 <= 0) {
            return 0L;
        }
        return j8;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f4000g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private F.e.d.a.b.AbstractC0095a h() {
        return F.e.d.a.b.AbstractC0095a.a().b(0L).d(0L).c(this.f4004c.f3889e).e(this.f4004c.f3886b).a();
    }

    private List i() {
        return Collections.singletonList(h());
    }

    private F.e.d.a j(int i8, F.a aVar) {
        boolean z8;
        if (aVar.c() != 100) {
            z8 = true;
        } else {
            z8 = false;
        }
        return F.e.d.a.a().c(Boolean.valueOf(z8)).d(A(aVar)).h(i8).f(o(aVar)).a();
    }

    private F.e.d.a k(int i8, S0.e eVar, Thread thread, int i9, int i10, boolean z8) {
        Boolean bool;
        boolean z9;
        F.e.d.a.c e8 = this.f4007f.e(this.f4002a);
        if (e8.b() > 0) {
            if (e8.b() != 100) {
                z9 = true;
            } else {
                z9 = false;
            }
            bool = Boolean.valueOf(z9);
        } else {
            bool = null;
        }
        return F.e.d.a.a().c(bool).d(e8).b(this.f4007f.d(this.f4002a)).h(i8).f(p(eVar, thread, i9, i10, z8)).a();
    }

    private F.e.d.c l(int i8) {
        Double d8;
        C1249f a9 = C1249f.a(this.f4002a);
        Float b9 = a9.b();
        if (b9 != null) {
            d8 = Double.valueOf(b9.doubleValue());
        } else {
            d8 = null;
        }
        int c8 = a9.c();
        boolean n8 = AbstractC1253j.n(this.f4002a);
        long f8 = f(AbstractC1253j.b(this.f4002a) - AbstractC1253j.a(this.f4002a));
        return F.e.d.c.a().b(d8).c(c8).f(n8).e(i8).g(f8).d(AbstractC1253j.c(Environment.getDataDirectory().getPath())).a();
    }

    private F.e.d.a.b.c m(S0.e eVar, int i8, int i9) {
        return n(eVar, i8, i9, 0);
    }

    private F.e.d.a.b.c n(S0.e eVar, int i8, int i9, int i10) {
        String str = eVar.f9369b;
        String str2 = eVar.f9368a;
        StackTraceElement[] stackTraceElementArr = eVar.f9370c;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        S0.e eVar2 = eVar.f9371d;
        if (i10 >= i9) {
            S0.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f9371d;
                i11++;
            }
        }
        F.e.d.a.b.c.AbstractC0098a d8 = F.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i8)).d(i11);
        if (eVar2 != null && i11 == 0) {
            d8.b(n(eVar2, i8, i9, i10 + 1));
        }
        return d8.a();
    }

    private F.e.d.a.b o(F.a aVar) {
        return F.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private F.e.d.a.b p(S0.e eVar, Thread thread, int i8, int i9, boolean z8) {
        return F.e.d.a.b.a().f(z(eVar, thread, i8, z8)).d(m(eVar, i8, i9)).e(w()).c(i()).a();
    }

    private F.e.d.a.b.AbstractC0101e.AbstractC0103b q(StackTraceElement stackTraceElement, F.e.d.a.b.AbstractC0101e.AbstractC0103b.AbstractC0104a abstractC0104a) {
        long j8;
        long j9 = 0;
        if (stackTraceElement.isNativeMethod()) {
            j8 = Math.max(stackTraceElement.getLineNumber(), 0L);
        } else {
            j8 = 0;
        }
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j9 = stackTraceElement.getLineNumber();
        }
        return abstractC0104a.e(j8).f(str).b(fileName).d(j9).a();
    }

    private List r(StackTraceElement[] stackTraceElementArr, int i8) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, F.e.d.a.b.AbstractC0101e.AbstractC0103b.a().c(i8)));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private F.e.a s() {
        return F.e.a.a().e(this.f4003b.f()).g(this.f4004c.f3890f).d(this.f4004c.f3891g).f(this.f4003b.a().c()).b(this.f4004c.f3892h.d()).c(this.f4004c.f3892h.e()).a();
    }

    private F.e t(String str, long j8) {
        return F.e.a().m(j8).j(str).h(f4001h).b(s()).l(v()).e(u()).i(3).a();
    }

    private F.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int g8 = g();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b9 = AbstractC1253j.b(this.f4002a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean w8 = AbstractC1253j.w();
        int l8 = AbstractC1253j.l();
        return F.e.c.a().b(g8).f(Build.MODEL).c(availableProcessors).h(b9).d(blockCount).i(w8).j(l8).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    private F.e.AbstractC0108e v() {
        return F.e.AbstractC0108e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(AbstractC1253j.x()).a();
    }

    private F.e.d.a.b.AbstractC0099d w() {
        return F.e.d.a.b.AbstractC0099d.a().d(MBridgeConstans.ENDCARD_URL_TYPE_PL).c(MBridgeConstans.ENDCARD_URL_TYPE_PL).b(0L).a();
    }

    private F.e.d.a.b.AbstractC0101e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private F.e.d.a.b.AbstractC0101e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i8) {
        return F.e.d.a.b.AbstractC0101e.a().d(thread.getName()).c(i8).b(r(stackTraceElementArr, i8)).a();
    }

    private List z(S0.e eVar, Thread thread, int i8, boolean z8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f9370c, i8));
        if (z8) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f4005d.a(entry.getValue())));
                }
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public F.e.d c(F.a aVar) {
        int i8 = this.f4002a.getResources().getConfiguration().orientation;
        return F.e.d.a().g("anr").f(aVar.i()).b(j(i8, a(aVar))).c(l(i8)).a();
    }

    public F.e.d d(Throwable th, Thread thread, String str, long j8, int i8, int i9, boolean z8) {
        int i10 = this.f4002a.getResources().getConfiguration().orientation;
        return F.e.d.a().g(str).f(j8).b(k(i10, S0.e.a(th, this.f4005d), thread, i8, i9, z8)).c(l(i10)).a();
    }

    public M0.F e(String str, long j8) {
        return b().m(t(str, j8)).a();
    }
}
