package D6;

import A6.e;
import E6.B;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.U;

/* loaded from: classes5.dex */
public final class y implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final y f1512a = new y();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1513b = A6.i.c("kotlinx.serialization.json.JsonPrimitive", e.i.f264a, new A6.f[0], null, 8, null);

    private y() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1513b;
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public x d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        i l8 = l.d(decoder).l();
        if (l8 instanceof x) {
            return (x) l8;
        }
        throw B.e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + U.b(l8.getClass()), l8.toString());
    }

    @Override // y6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(B6.f encoder, x value) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(value, "value");
        l.c(encoder);
        if (value instanceof t) {
            encoder.z(u.f1503a, t.INSTANCE);
        } else {
            encoder.z(q.f1498a, (p) value);
        }
    }
}
