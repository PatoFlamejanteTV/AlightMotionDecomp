package C6;

import A6.e;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class r0 implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f1092a = new r0();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1093b = new k0("kotlin.String", e.i.f264a);

    private r0() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1093b;
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public String d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return decoder.r();
    }

    @Override // y6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(B6.f encoder, String value) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(value, "value");
        encoder.F(value);
    }
}
