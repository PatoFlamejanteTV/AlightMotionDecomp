package C6;

import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3291x;
import z6.AbstractC4273a;

/* loaded from: classes5.dex */
public final class y0 implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f1131a = new y0();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1132b = E.a("kotlin.UInt", AbstractC4273a.A(C3291x.f34603a));

    private y0() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1132b;
    }

    @Override // y6.InterfaceC4248a
    public /* bridge */ /* synthetic */ Object d(B6.e eVar) {
        return Q5.A.a(f(eVar));
    }

    @Override // y6.i
    public /* bridge */ /* synthetic */ void e(B6.f fVar, Object obj) {
        g(fVar, ((Q5.A) obj).f());
    }

    public int f(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return Q5.A.b(decoder.A(a()).n());
    }

    public void g(B6.f encoder, int i8) {
        AbstractC3292y.i(encoder, "encoder");
        encoder.v(a()).B(i8);
    }
}
