package O2;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class g implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final f f7134a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f7135b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f7136c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f7137d;

    public g(f fVar, N5.a aVar, N5.a aVar2, N5.a aVar3) {
        this.f7134a = fVar;
        this.f7135b = aVar;
        this.f7136c = aVar2;
        this.f7137d = aVar3;
    }

    public static g a(f fVar, N5.a aVar, N5.a aVar2, N5.a aVar3) {
        return new g(fVar, aVar, aVar2, aVar3);
    }

    public static Function1 c(f fVar, Context context, v2.d dVar, p3.i iVar) {
        return (Function1) z5.h.d(fVar.a(context, dVar, iVar));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function1 get() {
        return c(this.f7134a, (Context) this.f7135b.get(), (v2.d) this.f7136c.get(), (p3.i) this.f7137d.get());
    }
}
