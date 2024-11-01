package com.stripe.android.stripe3ds2.views;

import Q5.s;
import Q5.t;
import R5.AbstractC1435t;
import androidx.core.os.EnvironmentCompat;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0678a f28247e;

    /* renamed from: g, reason: collision with root package name */
    public static final a f28249g;

    /* renamed from: i, reason: collision with root package name */
    public static final a f28251i;

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ a[] f28255m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ W5.a f28256n;

    /* renamed from: a, reason: collision with root package name */
    private final String f28257a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28258b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f28259c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f28260d;

    /* renamed from: f, reason: collision with root package name */
    public static final a f28248f = new a("Visa", 0, "visa", U3.c.f10090h, Integer.valueOf(U3.f.f10137f), false, 8, null);

    /* renamed from: h, reason: collision with root package name */
    public static final a f28250h = new a("Amex", 2, "american_express", U3.c.f10083a, Integer.valueOf(U3.f.f10132a), false, 8, null);

    /* renamed from: j, reason: collision with root package name */
    public static final a f28252j = new a("CartesBancaires", 4, "cartes_bancaires", U3.c.f10084b, Integer.valueOf(U3.f.f10133b), true);

    /* renamed from: k, reason: collision with root package name */
    public static final a f28253k = new a("UnionPay", 5, "unionpay", U3.c.f10088f, Integer.valueOf(U3.f.f10136e), false, 8, null);

    /* renamed from: l, reason: collision with root package name */
    public static final a f28254l = new a("Unknown", 6, EnvironmentCompat.MEDIA_UNKNOWN, U3.c.f10089g, null, false, 8, null);

    /* renamed from: com.stripe.android.stripe3ds2.views.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0678a {
        private C0678a() {
        }

        public final a a(String directoryServerName, Z3.c errorReporter) {
            Object obj;
            Object b9;
            AbstractC3292y.i(directoryServerName, "directoryServerName");
            AbstractC3292y.i(errorReporter, "errorReporter");
            Iterator<E> it = a.d().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (n.s(((a) obj).b(), n.M0(directoryServerName).toString(), true)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            a aVar = (a) obj;
            if (aVar != null) {
                b9 = s.b(aVar);
            } else {
                W5.a d8 = a.d();
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(d8, 10));
                Iterator<E> it2 = d8.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((a) it2.next()).b());
                }
                s.a aVar2 = s.f8810b;
                b9 = s.b(t.a(new W3.b("Directory server name '" + directoryServerName + "' is not supported. Must be one of " + arrayList + ".", null, 2, null)));
            }
            Throwable e8 = s.e(b9);
            if (e8 != null) {
                errorReporter.l(e8);
            }
            a aVar3 = a.f28254l;
            if (s.g(b9)) {
                b9 = aVar3;
            }
            return (a) b9;
        }

        public /* synthetic */ C0678a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        int i8 = 8;
        AbstractC3284p abstractC3284p = null;
        boolean z8 = false;
        f28249g = new a("Mastercard", 1, "mastercard", U3.c.f10087e, Integer.valueOf(U3.f.f10135d), z8, i8, abstractC3284p);
        f28251i = new a("Discover", 3, "discover", U3.c.f10085c, Integer.valueOf(U3.f.f10134c), z8, i8, abstractC3284p);
        a[] a9 = a();
        f28255m = a9;
        f28256n = W5.b.a(a9);
        f28247e = new C0678a(null);
    }

    private a(String str, int i8, String str2, int i9, Integer num, boolean z8) {
        this.f28257a = str2;
        this.f28258b = i9;
        this.f28259c = num;
        this.f28260d = z8;
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f28248f, f28249g, f28250h, f28251i, f28252j, f28253k, f28254l};
    }

    public static W5.a d() {
        return f28256n;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f28255m.clone();
    }

    public final String b() {
        return this.f28257a;
    }

    public final int c() {
        return this.f28258b;
    }

    public final Integer e() {
        return this.f28259c;
    }

    public final boolean f() {
        return this.f28260d;
    }

    /* synthetic */ a(String str, int i8, String str2, int i9, Integer num, boolean z8, int i10, AbstractC3284p abstractC3284p) {
        this(str, i8, str2, i9, num, (i10 & 8) != 0 ? false : z8);
    }
}
