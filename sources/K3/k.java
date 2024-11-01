package k3;

import android.content.Context;
import j3.m;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class k implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f34482a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f34483b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f34484c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f34485d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f34486e;

    public k(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5) {
        this.f34482a = aVar;
        this.f34483b = aVar2;
        this.f34484c = aVar3;
        this.f34485d = aVar4;
        this.f34486e = aVar5;
    }

    public static k a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5) {
        return new k(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static j c(Context context, Function0 function0, m mVar, v2.d dVar, U5.g gVar) {
        return new j(context, function0, mVar, dVar, gVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c((Context) this.f34482a.get(), (Function0) this.f34483b.get(), (m) this.f34484c.get(), (v2.d) this.f34485d.get(), (U5.g) this.f34486e.get());
    }
}
