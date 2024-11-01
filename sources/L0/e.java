package L0;

import java.io.File;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    private static final b f5236c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final P0.g f5237a;

    /* renamed from: b, reason: collision with root package name */
    private c f5238b;

    public e(P0.g gVar) {
        this.f5237a = gVar;
        this.f5238b = f5236c;
    }

    private File d(String str) {
        return this.f5237a.q(str, "userlog");
    }

    public void a() {
        this.f5238b.d();
    }

    public byte[] b() {
        return this.f5238b.c();
    }

    public String c() {
        return this.f5238b.b();
    }

    public final void e(String str) {
        this.f5238b.a();
        this.f5238b = f5236c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i8) {
        this.f5238b = new h(file, i8);
    }

    public void g(long j8, String str) {
        this.f5238b.e(j8, str);
    }

    public e(P0.g gVar, String str) {
        this(gVar);
        e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b implements c {
        private b() {
        }

        @Override // L0.c
        public String b() {
            return null;
        }

        @Override // L0.c
        public byte[] c() {
            return null;
        }

        @Override // L0.c
        public void a() {
        }

        @Override // L0.c
        public void d() {
        }

        @Override // L0.c
        public void e(long j8, String str) {
        }
    }
}
