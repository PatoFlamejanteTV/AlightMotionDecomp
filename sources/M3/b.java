package M3;

import j3.m;
import java.util.Set;
import p3.i;

/* loaded from: classes4.dex */
public final class b implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f6137a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f6138b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f6139c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f6140d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f6141e;

    /* renamed from: f, reason: collision with root package name */
    private final N5.a f6142f;

    public b(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6) {
        this.f6137a = aVar;
        this.f6138b = aVar2;
        this.f6139c = aVar3;
        this.f6140d = aVar4;
        this.f6141e = aVar5;
        this.f6142f = aVar6;
    }

    public static b a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static a c(m mVar, N5.a aVar, v2.d dVar, i iVar, U5.g gVar, Set set) {
        return new a(mVar, aVar, dVar, iVar, gVar, set);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((m) this.f6137a.get(), this.f6138b, (v2.d) this.f6139c.get(), (i) this.f6140d.get(), (U5.g) this.f6141e.get(), (Set) this.f6142f.get());
    }
}
