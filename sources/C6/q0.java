package C6;

import A6.e;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class q0 implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f1088a = new q0();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1089b = new k0("kotlin.Short", e.h.f263a);

    private q0() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1089b;
    }

    @Override // y6.i
    public /* bridge */ /* synthetic */ void e(B6.f fVar, Object obj) {
        g(fVar, ((Number) obj).shortValue());
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Short d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return Short.valueOf(decoder.F());
    }

    public void g(B6.f encoder, short s8) {
        AbstractC3292y.i(encoder, "encoder");
        encoder.i(s8);
    }
}
