package C6;

import kotlin.jvm.internal.AbstractC3292y;
import z6.AbstractC4273a;

/* loaded from: classes5.dex */
public final class E0 implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final E0 f1003a = new E0();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1004b = E.a("kotlin.UShort", AbstractC4273a.C(kotlin.jvm.internal.W.f34576a));

    private E0() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1004b;
    }

    @Override // y6.InterfaceC4248a
    public /* bridge */ /* synthetic */ Object d(B6.e eVar) {
        return Q5.F.a(f(eVar));
    }

    @Override // y6.i
    public /* bridge */ /* synthetic */ void e(B6.f fVar, Object obj) {
        g(fVar, ((Q5.F) obj).f());
    }

    public short f(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return Q5.F.b(decoder.A(a()).F());
    }

    public void g(B6.f encoder, short s8) {
        AbstractC3292y.i(encoder, "encoder");
        encoder.v(a()).i(s8);
    }
}
