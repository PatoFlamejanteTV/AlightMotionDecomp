package D0;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: D0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1038c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1159a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f1160b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f1161c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1162d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1163e;

    /* renamed from: f, reason: collision with root package name */
    private final h f1164f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f1165g;

    public static b c(F f8) {
        return new b(f8, new F[0]);
    }

    public static b d(F f8, F... fArr) {
        return new b(f8, fArr);
    }

    public static b e(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b f(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static C1038c l(final Object obj, Class cls) {
        return m(cls).f(new h() { // from class: D0.a
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                Object q8;
                q8 = C1038c.q(obj, interfaceC1040e);
                return q8;
            }
        }).d();
    }

    public static b m(Class cls) {
        return e(cls).g();
    }

    public static C1038c s(final Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).f(new h() { // from class: D0.b
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                Object r8;
                r8 = C1038c.r(obj, interfaceC1040e);
                return r8;
            }
        }).d();
    }

    public Set g() {
        return this.f1161c;
    }

    public h h() {
        return this.f1164f;
    }

    public String i() {
        return this.f1159a;
    }

    public Set j() {
        return this.f1160b;
    }

    public Set k() {
        return this.f1165g;
    }

    public boolean n() {
        if (this.f1162d == 1) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.f1162d == 2) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if (this.f1163e == 0) {
            return true;
        }
        return false;
    }

    public C1038c t(h hVar) {
        return new C1038c(this.f1159a, this.f1160b, this.f1161c, this.f1162d, this.f1163e, hVar, this.f1165g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f1160b.toArray()) + ">{" + this.f1162d + ", type=" + this.f1163e + ", deps=" + Arrays.toString(this.f1161c.toArray()) + "}";
    }

    /* renamed from: D0.c$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f1166a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f1167b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f1168c;

        /* renamed from: d, reason: collision with root package name */
        private int f1169d;

        /* renamed from: e, reason: collision with root package name */
        private int f1170e;

        /* renamed from: f, reason: collision with root package name */
        private h f1171f;

        /* renamed from: g, reason: collision with root package name */
        private final Set f1172g;

        /* JADX INFO: Access modifiers changed from: private */
        public b g() {
            this.f1170e = 1;
            return this;
        }

        private b i(int i8) {
            boolean z8;
            if (this.f1169d == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            E.d(z8, "Instantiation type has already been set.");
            this.f1169d = i8;
            return this;
        }

        private void j(F f8) {
            E.a(!this.f1167b.contains(f8), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(r rVar) {
            E.c(rVar, "Null dependency");
            j(rVar.c());
            this.f1168c.add(rVar);
            return this;
        }

        public b c() {
            return i(1);
        }

        public C1038c d() {
            boolean z8;
            if (this.f1171f != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            E.d(z8, "Missing required property: factory.");
            return new C1038c(this.f1166a, new HashSet(this.f1167b), new HashSet(this.f1168c), this.f1169d, this.f1170e, this.f1171f, this.f1172g);
        }

        public b e() {
            return i(2);
        }

        public b f(h hVar) {
            this.f1171f = (h) E.c(hVar, "Null factory");
            return this;
        }

        public b h(String str) {
            this.f1166a = str;
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f1166a = null;
            HashSet hashSet = new HashSet();
            this.f1167b = hashSet;
            this.f1168c = new HashSet();
            this.f1169d = 0;
            this.f1170e = 0;
            this.f1172g = new HashSet();
            E.c(cls, "Null interface");
            hashSet.add(F.b(cls));
            for (Class cls2 : clsArr) {
                E.c(cls2, "Null interface");
                this.f1167b.add(F.b(cls2));
            }
        }

        private b(F f8, F... fArr) {
            this.f1166a = null;
            HashSet hashSet = new HashSet();
            this.f1167b = hashSet;
            this.f1168c = new HashSet();
            this.f1169d = 0;
            this.f1170e = 0;
            this.f1172g = new HashSet();
            E.c(f8, "Null interface");
            hashSet.add(f8);
            for (F f9 : fArr) {
                E.c(f9, "Null interface");
            }
            Collections.addAll(this.f1167b, fArr);
        }
    }

    private C1038c(String str, Set set, Set set2, int i8, int i9, h hVar, Set set3) {
        this.f1159a = str;
        this.f1160b = DesugarCollections.unmodifiableSet(set);
        this.f1161c = DesugarCollections.unmodifiableSet(set2);
        this.f1162d = i8;
        this.f1163e = i9;
        this.f1164f = hVar;
        this.f1165g = DesugarCollections.unmodifiableSet(set3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, InterfaceC1040e interfaceC1040e) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, InterfaceC1040e interfaceC1040e) {
        return obj;
    }
}
