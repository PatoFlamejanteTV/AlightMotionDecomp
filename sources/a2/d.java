package a2;

import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final a2.e f14059c = new j();

    /* renamed from: d, reason: collision with root package name */
    public static final a2.e f14060d = new k();

    /* renamed from: e, reason: collision with root package name */
    public static final a2.e f14061e = new l();

    /* renamed from: f, reason: collision with root package name */
    public static final a2.e f14062f = new m();

    /* renamed from: g, reason: collision with root package name */
    public static final a2.e f14063g = new n();

    /* renamed from: h, reason: collision with root package name */
    public static final a2.e f14064h = new o();

    /* renamed from: i, reason: collision with root package name */
    public static final a2.e f14065i = new p();

    /* renamed from: j, reason: collision with root package name */
    public static final a2.e f14066j = new a2.c();

    /* renamed from: k, reason: collision with root package name */
    public static final a2.e f14067k = new C1664b();

    /* renamed from: l, reason: collision with root package name */
    public static final a2.e f14068l = new C1663a();

    /* renamed from: m, reason: collision with root package name */
    public static final a2.e f14069m = new q();

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f14070a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private LinkedList f14071b = new LinkedList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements a2.e {
        a() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Double d8, Appendable appendable, X1.g gVar) {
            if (d8.isInfinite()) {
                appendable.append("null");
            } else {
                appendable.append(d8.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements a2.e {
        b() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, Appendable appendable, X1.g gVar) {
            appendable.append('\"');
            X1.i.a(date.toString(), appendable, gVar);
            appendable.append('\"');
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements a2.e {
        c() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Float f8, Appendable appendable, X1.g gVar) {
            if (f8.isInfinite()) {
                appendable.append("null");
            } else {
                appendable.append(f8.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a2.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0277d implements a2.e {
        C0277d() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr, Appendable appendable, X1.g gVar) {
            gVar.c(appendable);
            boolean z8 = false;
            for (int i8 : iArr) {
                if (z8) {
                    gVar.m(appendable);
                } else {
                    z8 = true;
                }
                appendable.append(Integer.toString(i8));
            }
            gVar.d(appendable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements a2.e {
        e() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(short[] sArr, Appendable appendable, X1.g gVar) {
            gVar.c(appendable);
            boolean z8 = false;
            for (short s8 : sArr) {
                if (z8) {
                    gVar.m(appendable);
                } else {
                    z8 = true;
                }
                appendable.append(Short.toString(s8));
            }
            gVar.d(appendable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements a2.e {
        f() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(long[] jArr, Appendable appendable, X1.g gVar) {
            gVar.c(appendable);
            boolean z8 = false;
            for (long j8 : jArr) {
                if (z8) {
                    gVar.m(appendable);
                } else {
                    z8 = true;
                }
                appendable.append(Long.toString(j8));
            }
            gVar.d(appendable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements a2.e {
        g() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(float[] fArr, Appendable appendable, X1.g gVar) {
            gVar.c(appendable);
            boolean z8 = false;
            for (float f8 : fArr) {
                if (z8) {
                    gVar.m(appendable);
                } else {
                    z8 = true;
                }
                appendable.append(Float.toString(f8));
            }
            gVar.d(appendable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements a2.e {
        h() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(double[] dArr, Appendable appendable, X1.g gVar) {
            gVar.c(appendable);
            boolean z8 = false;
            for (double d8 : dArr) {
                if (z8) {
                    gVar.m(appendable);
                } else {
                    z8 = true;
                }
                appendable.append(Double.toString(d8));
            }
            gVar.d(appendable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements a2.e {
        i() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(boolean[] zArr, Appendable appendable, X1.g gVar) {
            gVar.c(appendable);
            boolean z8 = false;
            for (boolean z9 : zArr) {
                if (z8) {
                    gVar.m(appendable);
                } else {
                    z8 = true;
                }
                appendable.append(Boolean.toString(z9));
            }
            gVar.d(appendable);
        }
    }

    /* loaded from: classes4.dex */
    class j implements a2.e {
        j() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(X1.f fVar, Appendable appendable, X1.g gVar) {
            fVar.e(appendable);
        }
    }

    /* loaded from: classes4.dex */
    class k implements a2.e {
        k() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(X1.f fVar, Appendable appendable, X1.g gVar) {
            fVar.j(appendable, gVar);
        }
    }

    /* loaded from: classes4.dex */
    class l implements a2.e {
        l() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(X1.c cVar, Appendable appendable, X1.g gVar) {
            appendable.append(cVar.c(gVar));
        }
    }

    /* loaded from: classes4.dex */
    class m implements a2.e {
        m() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(X1.b bVar, Appendable appendable, X1.g gVar) {
            appendable.append(bVar.g());
        }
    }

    /* loaded from: classes4.dex */
    class n implements a2.e {
        n() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Iterable iterable, Appendable appendable, X1.g gVar) {
            gVar.c(appendable);
            boolean z8 = true;
            for (Object obj : iterable) {
                if (z8) {
                    gVar.e(appendable);
                    z8 = false;
                } else {
                    gVar.a(appendable);
                }
                if (obj == null) {
                    appendable.append("null");
                } else {
                    X1.i.b(obj, appendable, gVar);
                }
                gVar.b(appendable);
            }
            gVar.d(appendable);
        }
    }

    /* loaded from: classes4.dex */
    class o implements a2.e {
        o() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Enum r12, Appendable appendable, X1.g gVar) {
            gVar.p(appendable, r12.name());
        }
    }

    /* loaded from: classes4.dex */
    class p implements a2.e {
        p() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map, Appendable appendable, X1.g gVar) {
            gVar.n(appendable);
            boolean z8 = true;
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null || !gVar.g()) {
                    if (z8) {
                        gVar.l(appendable);
                        z8 = false;
                    } else {
                        gVar.m(appendable);
                    }
                    d.g(entry.getKey().toString(), value, appendable, gVar);
                }
            }
            gVar.o(appendable);
        }
    }

    /* loaded from: classes4.dex */
    class q implements a2.e {
        q() {
        }

        @Override // a2.e
        public void a(Object obj, Appendable appendable, X1.g gVar) {
            appendable.append(obj.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r implements a2.e {
        r() {
        }

        @Override // a2.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(String str, Appendable appendable, X1.g gVar) {
            gVar.p(appendable, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class s {

        /* renamed from: a, reason: collision with root package name */
        public Class f14082a;

        /* renamed from: b, reason: collision with root package name */
        public a2.e f14083b;

        public s(Class cls, a2.e eVar) {
            this.f14082a = cls;
            this.f14083b = eVar;
        }
    }

    public d() {
        c();
    }

    public static void g(String str, Object obj, Appendable appendable, X1.g gVar) {
        if (str == null) {
            appendable.append("null");
        } else if (!gVar.h(str)) {
            appendable.append(str);
        } else {
            appendable.append('\"');
            X1.i.a(str, appendable, gVar);
            appendable.append('\"');
        }
        gVar.k(appendable);
        if (obj instanceof String) {
            gVar.p(appendable, (String) obj);
        } else {
            X1.i.b(obj, appendable, gVar);
        }
        gVar.j(appendable);
    }

    public a2.e a(Class cls) {
        return (a2.e) this.f14070a.get(cls);
    }

    public a2.e b(Class cls) {
        Iterator it = this.f14071b.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (sVar.f14082a.isAssignableFrom(cls)) {
                return sVar.f14083b;
            }
        }
        return null;
    }

    public void c() {
        d(new r(), String.class);
        d(new a(), Double.class);
        d(new b(), Date.class);
        d(new c(), Float.class);
        a2.e eVar = f14069m;
        d(eVar, Integer.class, Long.class, Byte.class, Short.class, BigInteger.class, BigDecimal.class);
        d(eVar, Boolean.class);
        d(new C0277d(), int[].class);
        d(new e(), short[].class);
        d(new f(), long[].class);
        d(new g(), float[].class);
        d(new h(), double[].class);
        d(new i(), boolean[].class);
        e(X1.f.class, f14060d);
        e(X1.e.class, f14059c);
        e(X1.c.class, f14061e);
        e(X1.b.class, f14062f);
        e(Map.class, f14065i);
        e(Iterable.class, f14063g);
        e(Enum.class, f14064h);
        e(Number.class, eVar);
    }

    public void d(a2.e eVar, Class... clsArr) {
        for (Class cls : clsArr) {
            this.f14070a.put(cls, eVar);
        }
    }

    public void e(Class cls, a2.e eVar) {
        f(cls, eVar);
    }

    public void f(Class cls, a2.e eVar) {
        this.f14071b.addLast(new s(cls, eVar));
    }
}
