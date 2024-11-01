package D6;

import A6.e;
import E6.B;
import Q5.C;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.U;
import l6.AbstractC3334D;
import z6.AbstractC4273a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class q implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final q f1498a = new q();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1499b = A6.i.a("kotlinx.serialization.json.JsonLiteral", e.i.f264a);

    private q() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1499b;
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public p d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        i l8 = l.d(decoder).l();
        if (l8 instanceof p) {
            return (p) l8;
        }
        throw B.e(-1, "Unexpected JSON element, expected JsonLiteral, had " + U.b(l8.getClass()), l8.toString());
    }

    @Override // y6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(B6.f encoder, p value) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(value, "value");
        l.h(encoder);
        if (value.g()) {
            encoder.F(value.c());
            return;
        }
        if (value.e() != null) {
            encoder.v(value.e()).F(value.c());
            return;
        }
        Long k8 = l6.n.k(value.c());
        if (k8 != null) {
            encoder.C(k8.longValue());
            return;
        }
        C h8 = AbstractC3334D.h(value.c());
        if (h8 != null) {
            encoder.v(AbstractC4273a.s(C.f8775b).a()).C(h8.g());
            return;
        }
        Double g8 = l6.n.g(value.c());
        if (g8 != null) {
            encoder.h(g8.doubleValue());
            return;
        }
        Boolean L02 = l6.n.L0(value.c());
        if (L02 != null) {
            encoder.k(L02.booleanValue());
        } else {
            encoder.F(value.c());
        }
    }
}
