package D0;

import c1.InterfaceC2008a;
import c1.InterfaceC2009b;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class G implements InterfaceC1040e {

    /* renamed from: a, reason: collision with root package name */
    private final Set f1148a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f1149b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f1150c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f1151d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f1152e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f1153f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1040e f1154g;

    /* loaded from: classes3.dex */
    private static class a implements Z0.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f1155a;

        /* renamed from: b, reason: collision with root package name */
        private final Z0.c f1156b;

        public a(Set set, Z0.c cVar) {
            this.f1155a = set;
            this.f1156b = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public G(C1038c c1038c, InterfaceC1040e interfaceC1040e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : c1038c.g()) {
            if (rVar.e()) {
                if (rVar.g()) {
                    hashSet4.add(rVar.c());
                } else {
                    hashSet.add(rVar.c());
                }
            } else if (rVar.d()) {
                hashSet3.add(rVar.c());
            } else if (rVar.g()) {
                hashSet5.add(rVar.c());
            } else {
                hashSet2.add(rVar.c());
            }
        }
        if (!c1038c.k().isEmpty()) {
            hashSet.add(F.b(Z0.c.class));
        }
        this.f1148a = DesugarCollections.unmodifiableSet(hashSet);
        this.f1149b = DesugarCollections.unmodifiableSet(hashSet2);
        this.f1150c = DesugarCollections.unmodifiableSet(hashSet3);
        this.f1151d = DesugarCollections.unmodifiableSet(hashSet4);
        this.f1152e = DesugarCollections.unmodifiableSet(hashSet5);
        this.f1153f = c1038c.k();
        this.f1154g = interfaceC1040e;
    }

    @Override // D0.InterfaceC1040e
    public Object a(Class cls) {
        if (this.f1148a.contains(F.b(cls))) {
            Object a9 = this.f1154g.a(cls);
            if (!cls.equals(Z0.c.class)) {
                return a9;
            }
            return new a(this.f1153f, (Z0.c) a9);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // D0.InterfaceC1040e
    public Object b(F f8) {
        if (this.f1148a.contains(f8)) {
            return this.f1154g.b(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", f8));
    }

    @Override // D0.InterfaceC1040e
    public InterfaceC2009b c(Class cls) {
        return f(F.b(cls));
    }

    @Override // D0.InterfaceC1040e
    public InterfaceC2008a d(F f8) {
        if (this.f1150c.contains(f8)) {
            return this.f1154g.d(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", f8));
    }

    @Override // D0.InterfaceC1040e
    public /* synthetic */ Set e(Class cls) {
        return AbstractC1039d.f(this, cls);
    }

    @Override // D0.InterfaceC1040e
    public InterfaceC2009b f(F f8) {
        if (this.f1149b.contains(f8)) {
            return this.f1154g.f(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", f8));
    }

    @Override // D0.InterfaceC1040e
    public InterfaceC2009b g(F f8) {
        if (this.f1152e.contains(f8)) {
            return this.f1154g.g(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", f8));
    }

    @Override // D0.InterfaceC1040e
    public Set h(F f8) {
        if (this.f1151d.contains(f8)) {
            return this.f1154g.h(f8);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", f8));
    }

    @Override // D0.InterfaceC1040e
    public InterfaceC2008a i(Class cls) {
        return d(F.b(cls));
    }
}
