package D6;

import A6.j;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class u implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final u f1503a = new u();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1504b = A6.i.c("kotlinx.serialization.json.JsonNull", j.b.f287a, new A6.f[0], null, 8, null);

    private u() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1504b;
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public t d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        l.g(decoder);
        if (!decoder.x()) {
            decoder.q();
            return t.INSTANCE;
        }
        throw new E6.x("Expected 'null' literal");
    }

    @Override // y6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(B6.f encoder, t value) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(value, "value");
        l.h(encoder);
        encoder.e();
    }
}
