package C6;

import A6.e;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class B implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final B f994a = new B();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f995b = new k0("kotlin.Float", e.C0006e.f260a);

    private B() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f995b;
    }

    @Override // y6.i
    public /* bridge */ /* synthetic */ void e(B6.f fVar, Object obj) {
        g(fVar, ((Number) obj).floatValue());
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return Float.valueOf(decoder.G());
    }

    public void g(B6.f encoder, float f8) {
        AbstractC3292y.i(encoder, "encoder");
        encoder.p(f8);
    }
}
