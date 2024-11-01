package G0;

import M0.F;
import M0.G;
import c1.InterfaceC2008a;
import c1.InterfaceC2009b;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d implements G0.a {

    /* renamed from: c, reason: collision with root package name */
    private static final h f2743c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2008a f2744a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f2745b = new AtomicReference(null);

    /* loaded from: classes3.dex */
    private static final class b implements h {
        private b() {
        }

        @Override // G0.h
        public File a() {
            return null;
        }

        @Override // G0.h
        public File b() {
            return null;
        }

        @Override // G0.h
        public File c() {
            return null;
        }

        @Override // G0.h
        public F.a d() {
            return null;
        }

        @Override // G0.h
        public File e() {
            return null;
        }

        @Override // G0.h
        public File f() {
            return null;
        }

        @Override // G0.h
        public File g() {
            return null;
        }
    }

    public d(InterfaceC2008a interfaceC2008a) {
        this.f2744a = interfaceC2008a;
        interfaceC2008a.a(new InterfaceC2008a.InterfaceC0369a() { // from class: G0.b
            @Override // c1.InterfaceC2008a.InterfaceC0369a
            public final void a(InterfaceC2009b interfaceC2009b) {
                d.this.g(interfaceC2009b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(InterfaceC2009b interfaceC2009b) {
        g.f().b("Crashlytics native component now available.");
        this.f2745b.set((G0.a) interfaceC2009b.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String str, String str2, long j8, G g8, InterfaceC2009b interfaceC2009b) {
        ((G0.a) interfaceC2009b.get()).a(str, str2, j8, g8);
    }

    @Override // G0.a
    public void a(final String str, final String str2, final long j8, final G g8) {
        g.f().i("Deferring native open session: " + str);
        this.f2744a.a(new InterfaceC2008a.InterfaceC0369a() { // from class: G0.c
            @Override // c1.InterfaceC2008a.InterfaceC0369a
            public final void a(InterfaceC2009b interfaceC2009b) {
                d.h(str, str2, j8, g8, interfaceC2009b);
            }
        });
    }

    @Override // G0.a
    public h b(String str) {
        G0.a aVar = (G0.a) this.f2745b.get();
        if (aVar == null) {
            return f2743c;
        }
        return aVar.b(str);
    }

    @Override // G0.a
    public boolean c() {
        G0.a aVar = (G0.a) this.f2745b.get();
        if (aVar != null && aVar.c()) {
            return true;
        }
        return false;
    }

    @Override // G0.a
    public boolean d(String str) {
        G0.a aVar = (G0.a) this.f2745b.get();
        if (aVar != null && aVar.d(str)) {
            return true;
        }
        return false;
    }
}
