package C6;

import A6.e;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class H implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final H f1010a = new H();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1011b = new k0("kotlin.Int", e.f.f261a);

    private H() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1011b;
    }

    @Override // y6.i
    public /* bridge */ /* synthetic */ void e(B6.f fVar, Object obj) {
        g(fVar, ((Number) obj).intValue());
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return Integer.valueOf(decoder.n());
    }

    public void g(B6.f encoder, int i8) {
        AbstractC3292y.i(encoder, "encoder");
        encoder.B(i8);
    }
}
