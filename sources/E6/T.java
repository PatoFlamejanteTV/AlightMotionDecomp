package E6;

import kotlin.jvm.internal.AbstractC3292y;
import y6.InterfaceC4248a;

/* loaded from: classes5.dex */
public abstract class T {
    public static final Object a(D6.a json, D6.i element, InterfaceC4248a deserializer) {
        boolean d8;
        B6.e e8;
        AbstractC3292y.i(json, "json");
        AbstractC3292y.i(element, "element");
        AbstractC3292y.i(deserializer, "deserializer");
        if (element instanceof D6.v) {
            e8 = new H(json, (D6.v) element, null, null, 12, null);
        } else if (element instanceof D6.b) {
            e8 = new I(json, (D6.b) element);
        } else {
            if (element instanceof D6.p) {
                d8 = true;
            } else {
                d8 = AbstractC3292y.d(element, D6.t.INSTANCE);
            }
            if (d8) {
                e8 = new E(json, (D6.x) element);
            } else {
                throw new Q5.p();
            }
        }
        return e8.w(deserializer);
    }

    public static final Object b(D6.a aVar, String discriminator, D6.v element, InterfaceC4248a deserializer) {
        AbstractC3292y.i(aVar, "<this>");
        AbstractC3292y.i(discriminator, "discriminator");
        AbstractC3292y.i(element, "element");
        AbstractC3292y.i(deserializer, "deserializer");
        return new H(aVar, element, discriminator, deserializer.a()).w(deserializer);
    }
}
