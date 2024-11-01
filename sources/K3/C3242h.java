package k3;

import android.content.Context;
import j3.m;
import kotlin.jvm.functions.Function0;

/* renamed from: k3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3242h implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f34467a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f34468b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f34469c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f34470d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f34471e;

    public C3242h(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5) {
        this.f34467a = aVar;
        this.f34468b = aVar2;
        this.f34469c = aVar3;
        this.f34470d = aVar4;
        this.f34471e = aVar5;
    }

    public static C3242h a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5) {
        return new C3242h(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static C3241g c(Context context, Function0 function0, m mVar, v2.d dVar, U5.g gVar) {
        return new C3241g(context, function0, mVar, dVar, gVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3241g get() {
        return c((Context) this.f34467a.get(), (Function0) this.f34468b.get(), (m) this.f34469c.get(), (v2.d) this.f34470d.get(), (U5.g) this.f34471e.get());
    }
}
