package u;

import s.AbstractC3937d;
import s.C3936c;

/* loaded from: classes3.dex */
final class s implements s.i {

    /* renamed from: a, reason: collision with root package name */
    private final p f40137a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40138b;

    /* renamed from: c, reason: collision with root package name */
    private final C3936c f40139c;

    /* renamed from: d, reason: collision with root package name */
    private final s.h f40140d;

    /* renamed from: e, reason: collision with root package name */
    private final t f40141e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(p pVar, String str, C3936c c3936c, s.h hVar, t tVar) {
        this.f40137a = pVar;
        this.f40138b = str;
        this.f40139c = c3936c;
        this.f40140d = hVar;
        this.f40141e = tVar;
    }

    @Override // s.i
    public void a(AbstractC3937d abstractC3937d, s.k kVar) {
        this.f40141e.a(o.a().e(this.f40137a).c(abstractC3937d).f(this.f40138b).d(this.f40140d).b(this.f40139c).a(), kVar);
    }

    @Override // s.i
    public void b(AbstractC3937d abstractC3937d) {
        a(abstractC3937d, new s.k() { // from class: u.r
            @Override // s.k
            public final void a(Exception exc) {
                s.e(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p d() {
        return this.f40137a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Exception exc) {
    }
}
