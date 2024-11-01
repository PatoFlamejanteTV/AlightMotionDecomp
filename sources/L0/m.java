package L0;

import L0.m;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final f f5275a;

    /* renamed from: b, reason: collision with root package name */
    private final K0.g f5276b;

    /* renamed from: c, reason: collision with root package name */
    private String f5277c;

    /* renamed from: d, reason: collision with root package name */
    private final a f5278d = new a(false);

    /* renamed from: e, reason: collision with root package name */
    private final a f5279e = new a(true);

    /* renamed from: f, reason: collision with root package name */
    private final j f5280f = new j(128);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicMarkableReference f5281g = new AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference f5282a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference f5283b = new AtomicReference(null);

        /* renamed from: c, reason: collision with root package name */
        private final boolean f5284c;

        public a(boolean z8) {
            int i8;
            this.f5284c = z8;
            if (z8) {
                i8 = 8192;
            } else {
                i8 = 1024;
            }
            this.f5282a = new AtomicMarkableReference(new d(64, i8), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f5283b.set(null);
            e();
        }

        private void d() {
            Runnable runnable = new Runnable() { // from class: L0.l
                @Override // java.lang.Runnable
                public final void run() {
                    m.a.this.c();
                }
            };
            if (androidx.compose.animation.core.d.a(this.f5283b, null, runnable)) {
                m.this.f5276b.f4555b.f(runnable);
            }
        }

        private void e() {
            Map map;
            synchronized (this) {
                try {
                    if (this.f5282a.isMarked()) {
                        map = ((d) this.f5282a.getReference()).a();
                        AtomicMarkableReference atomicMarkableReference = this.f5282a;
                        atomicMarkableReference.set((d) atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (map != null) {
                m.this.f5275a.q(m.this.f5277c, map, this.f5284c);
            }
        }

        public Map b() {
            return ((d) this.f5282a.getReference()).a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((d) this.f5282a.getReference()).d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f5282a;
                    atomicMarkableReference.set((d) atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public m(String str, P0.g gVar, K0.g gVar2) {
        this.f5277c = str;
        this.f5275a = new f(gVar);
        this.f5276b = gVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(String str, Map map, List list) {
        if (h() != null) {
            this.f5275a.s(str, h());
        }
        if (!map.isEmpty()) {
            this.f5275a.p(str, map);
        }
        if (!list.isEmpty()) {
            this.f5275a.r(str, list);
        }
    }

    public static m j(String str, P0.g gVar, K0.g gVar2) {
        f fVar = new f(gVar);
        m mVar = new m(str, gVar, gVar2);
        ((d) mVar.f5278d.f5282a.getReference()).e(fVar.i(str, false));
        ((d) mVar.f5279e.f5282a.getReference()).e(fVar.i(str, true));
        mVar.f5281g.set(fVar.k(str), false);
        mVar.f5280f.c(fVar.j(str));
        return mVar;
    }

    public static String k(String str, P0.g gVar) {
        return new f(gVar).k(str);
    }

    public Map e() {
        return this.f5278d.b();
    }

    public Map f() {
        return this.f5279e.b();
    }

    public List g() {
        return this.f5280f.a();
    }

    public String h() {
        return (String) this.f5281g.getReference();
    }

    public boolean l(String str, String str2) {
        return this.f5279e.f(str, str2);
    }

    public void m(final String str) {
        synchronized (this.f5277c) {
            this.f5277c = str;
            final Map b9 = this.f5278d.b();
            final List b10 = this.f5280f.b();
            this.f5276b.f4555b.f(new Runnable() { // from class: L0.k
                @Override // java.lang.Runnable
                public final void run() {
                    m.this.i(str, b9, b10);
                }
            });
        }
    }
}
