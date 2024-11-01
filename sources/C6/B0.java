package C6;

import kotlin.jvm.internal.AbstractC3292y;
import z6.AbstractC4273a;

/* loaded from: classes5.dex */
public final class B0 implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final B0 f996a = new B0();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f997b = E.a("kotlin.ULong", AbstractC4273a.B(kotlin.jvm.internal.A.f34566a));

    private B0() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f997b;
    }

    @Override // y6.InterfaceC4248a
    public /* bridge */ /* synthetic */ Object d(B6.e eVar) {
        return Q5.C.a(f(eVar));
    }

    @Override // y6.i
    public /* bridge */ /* synthetic */ void e(B6.f fVar, Object obj) {
        g(fVar, ((Q5.C) obj).g());
    }

    public long f(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return Q5.C.b(decoder.A(a()).v());
    }

    public void g(B6.f encoder, long j8) {
        AbstractC3292y.i(encoder, "encoder");
        encoder.v(a()).C(j8);
    }
}
