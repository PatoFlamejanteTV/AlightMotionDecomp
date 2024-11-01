package C6;

import A6.e;
import kotlin.jvm.internal.AbstractC3292y;
import m6.C3374a;

/* renamed from: C6.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1030u implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1030u f1107a = new C1030u();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1108b = new k0("kotlin.time.Duration", e.i.f264a);

    private C1030u() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1108b;
    }

    @Override // y6.InterfaceC4248a
    public /* bridge */ /* synthetic */ Object d(B6.e eVar) {
        return C3374a.e(f(eVar));
    }

    @Override // y6.i
    public /* bridge */ /* synthetic */ void e(B6.f fVar, Object obj) {
        g(fVar, ((C3374a) obj).P());
    }

    public long f(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return C3374a.f35036b.c(decoder.r());
    }

    public void g(B6.f encoder, long j8) {
        AbstractC3292y.i(encoder, "encoder");
        encoder.F(C3374a.L(j8));
    }
}
