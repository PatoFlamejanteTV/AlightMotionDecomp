package C6;

import A6.e;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1029t implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1029t f1103a = new C1029t();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1104b = new k0("kotlin.Double", e.d.f259a);

    private C1029t() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1104b;
    }

    @Override // y6.i
    public /* bridge */ /* synthetic */ void e(B6.f fVar, Object obj) {
        g(fVar, ((Number) obj).doubleValue());
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Double d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return Double.valueOf(decoder.H());
    }

    public void g(B6.f encoder, double d8) {
        AbstractC3292y.i(encoder, "encoder");
        encoder.h(d8);
    }
}
