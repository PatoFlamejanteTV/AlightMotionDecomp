package C6;

import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3278j;
import z6.AbstractC4273a;

/* loaded from: classes5.dex */
public final class v0 implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f1116a = new v0();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1117b = E.a("kotlin.UByte", AbstractC4273a.w(C3278j.f34590a));

    private v0() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1117b;
    }

    @Override // y6.InterfaceC4248a
    public /* bridge */ /* synthetic */ Object d(B6.e eVar) {
        return Q5.y.a(f(eVar));
    }

    @Override // y6.i
    public /* bridge */ /* synthetic */ void e(B6.f fVar, Object obj) {
        g(fVar, ((Q5.y) obj).f());
    }

    public byte f(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return Q5.y.b(decoder.A(a()).D());
    }

    public void g(B6.f encoder, byte b9) {
        AbstractC3292y.i(encoder, "encoder");
        encoder.v(a()).j(b9);
    }
}
