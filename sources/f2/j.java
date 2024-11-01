package F2;

import c3.C2024d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class j implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f2211a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f2212b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f2213c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f2214d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f2215e;

    /* renamed from: f, reason: collision with root package name */
    private final N5.a f2216f;

    /* renamed from: g, reason: collision with root package name */
    private final N5.a f2217g;

    public j(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6, N5.a aVar7) {
        this.f2211a = aVar;
        this.f2212b = aVar2;
        this.f2213c = aVar3;
        this.f2214d = aVar4;
        this.f2215e = aVar5;
        this.f2216f = aVar6;
        this.f2217g = aVar7;
    }

    public static j a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6, N5.a aVar7) {
        return new j(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static i c(Function0 function0, Function1 function1, M3.e eVar, t3.d dVar, C2024d c2024d, p3.i iVar, U5.g gVar) {
        return new i(function0, function1, eVar, dVar, c2024d, iVar, gVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Function0) this.f2211a.get(), (Function1) this.f2212b.get(), (M3.e) this.f2213c.get(), (t3.d) this.f2214d.get(), (C2024d) this.f2215e.get(), (p3.i) this.f2216f.get(), (U5.g) this.f2217g.get());
    }
}
