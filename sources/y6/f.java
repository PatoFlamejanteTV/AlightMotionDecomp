package y6;

import C6.AbstractC1007b;
import C6.AbstractC1009c;
import Q5.C1413h;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.U;

/* loaded from: classes5.dex */
public abstract class f {
    public static final InterfaceC4248a a(AbstractC1007b abstractC1007b, B6.c decoder, String str) {
        AbstractC3292y.i(abstractC1007b, "<this>");
        AbstractC3292y.i(decoder, "decoder");
        InterfaceC4248a h8 = abstractC1007b.h(decoder, str);
        if (h8 != null) {
            return h8;
        }
        AbstractC1009c.b(str, abstractC1007b.j());
        throw new C1413h();
    }

    public static final i b(AbstractC1007b abstractC1007b, B6.f encoder, Object value) {
        AbstractC3292y.i(abstractC1007b, "<this>");
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(value, "value");
        i i8 = abstractC1007b.i(encoder, value);
        if (i8 != null) {
            return i8;
        }
        AbstractC1009c.a(U.b(value.getClass()), abstractC1007b.j());
        throw new C1413h();
    }
}
