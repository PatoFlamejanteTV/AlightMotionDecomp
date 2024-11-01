package C6;

import A6.e;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class Q implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f1019a = new Q();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1020b = new k0("kotlin.Long", e.g.f262a);

    private Q() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1020b;
    }

    @Override // y6.i
    public /* bridge */ /* synthetic */ void e(B6.f fVar, Object obj) {
        g(fVar, ((Number) obj).longValue());
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Long d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return Long.valueOf(decoder.v());
    }

    public void g(B6.f encoder, long j8) {
        AbstractC3292y.i(encoder, "encoder");
        encoder.C(j8);
    }
}
