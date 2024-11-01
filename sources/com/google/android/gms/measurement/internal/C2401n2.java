package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.F6;

/* renamed from: com.google.android.gms.measurement.internal.n2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2401n2 extends AbstractC2485z3 {

    /* renamed from: c, reason: collision with root package name */
    private char f17960c;

    /* renamed from: d, reason: collision with root package name */
    private long f17961d;

    /* renamed from: e, reason: collision with root package name */
    private String f17962e;

    /* renamed from: f, reason: collision with root package name */
    private final C2415p2 f17963f;

    /* renamed from: g, reason: collision with root package name */
    private final C2415p2 f17964g;

    /* renamed from: h, reason: collision with root package name */
    private final C2415p2 f17965h;

    /* renamed from: i, reason: collision with root package name */
    private final C2415p2 f17966i;

    /* renamed from: j, reason: collision with root package name */
    private final C2415p2 f17967j;

    /* renamed from: k, reason: collision with root package name */
    private final C2415p2 f17968k;

    /* renamed from: l, reason: collision with root package name */
    private final C2415p2 f17969l;

    /* renamed from: m, reason: collision with root package name */
    private final C2415p2 f17970m;

    /* renamed from: n, reason: collision with root package name */
    private final C2415p2 f17971n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2401n2(S2 s22) {
        super(s22);
        this.f17960c = (char) 0;
        this.f17961d = -1L;
        this.f17963f = new C2415p2(this, 6, false, false);
        this.f17964g = new C2415p2(this, 6, true, false);
        this.f17965h = new C2415p2(this, 6, false, true);
        this.f17966i = new C2415p2(this, 5, false, false);
        this.f17967j = new C2415p2(this, 5, true, false);
        this.f17968k = new C2415p2(this, 5, false, true);
        this.f17969l = new C2415p2(this, 4, false, false);
        this.f17970m = new C2415p2(this, 3, false, false);
        this.f17971n = new C2415p2(this, 2, false, false);
    }

    private static String E(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            if (F6.a() && ((Boolean) G.f17245H0.a(null)).booleanValue()) {
                return "";
            }
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    private final String P() {
        String str;
        String str2;
        synchronized (this) {
            try {
                if (this.f17962e == null) {
                    if (this.f18099a.O() != null) {
                        str2 = this.f18099a.O();
                    } else {
                        str2 = "FA";
                    }
                    this.f17962e = str2;
                }
                AbstractC1396p.l(this.f17962e);
                str = this.f17962e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object s(String str) {
        if (str == null) {
            return null;
        }
        return new C2408o2(str);
    }

    private static String t(boolean z8, Object obj) {
        String str;
        String th;
        String className;
        String str2 = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i8 = 0;
        if (obj instanceof Long) {
            if (!z8) {
                return String.valueOf(obj);
            }
            Long l8 = (Long) obj;
            if (Math.abs(l8.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str2 = "-";
            }
            String valueOf = String.valueOf(Math.abs(l8.longValue()));
            return str2 + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str2 + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            if (z8) {
                th = th2.getClass().getName();
            } else {
                th = th2.toString();
            }
            StringBuilder sb = new StringBuilder(th);
            String E8 = E(S2.class.getCanonicalName());
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i8];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && E(className).equals(E8)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
                i8++;
            }
            return sb.toString();
        }
        if (obj instanceof C2408o2) {
            str = ((C2408o2) obj).f17986a;
            return str;
        }
        if (z8) {
            return "-";
        }
        return String.valueOf(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String u(boolean z8, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String t8 = t(z8, obj);
        String t9 = t(z8, obj2);
        String t10 = t(z8, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(t8)) {
            sb.append(str2);
            sb.append(t8);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(t9)) {
            sb.append(str2);
            sb.append(t9);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(t10)) {
            sb.append(str3);
            sb.append(t10);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean C(int i8) {
        return Log.isLoggable(P(), i8);
    }

    public final C2415p2 F() {
        return this.f17970m;
    }

    public final C2415p2 G() {
        return this.f17963f;
    }

    public final C2415p2 H() {
        return this.f17965h;
    }

    public final C2415p2 I() {
        return this.f17964g;
    }

    public final C2415p2 J() {
        return this.f17969l;
    }

    public final C2415p2 K() {
        return this.f17971n;
    }

    public final C2415p2 L() {
        return this.f17966i;
    }

    public final C2415p2 M() {
        return this.f17968k;
    }

    public final C2415p2 N() {
        return this.f17967j;
    }

    public final String O() {
        Pair a9;
        if (e().f18147f == null || (a9 = e().f18147f.a()) == null || a9 == C2484z2.f18142B) {
            return null;
        }
        return String.valueOf(a9.second) + ":" + ((String) a9.first);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2401n2 a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2349g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2467x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2359h2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2484z2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2485z3
    protected final boolean q() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(int i8, String str) {
        Log.println(i8, P(), str);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2321c y() {
        return super.y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void z(int i8, boolean z8, boolean z9, String str, Object obj, Object obj2, Object obj3) {
        int i9;
        if (!z8 && C(i8)) {
            v(i8, u(false, str, obj, obj2, obj3));
        }
        if (!z9 && i8 >= 5) {
            AbstractC1396p.l(str);
            P2 G8 = this.f18099a.G();
            if (G8 == null) {
                v(6, "Scheduler not set. Not logging error/warn");
                return;
            }
            if (!G8.p()) {
                v(6, "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i8 < 0) {
                i8 = 0;
            }
            if (i8 >= 9) {
                i9 = 8;
            } else {
                i9 = i8;
            }
            G8.D(new RunnableC2394m2(this, i9, str, obj, obj2, obj3));
        }
    }
}
