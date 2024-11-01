package E6;

import Q5.s;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: E6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1046d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f2065a;

    static {
        Object b9;
        int i8;
        try {
            s.a aVar = Q5.s.f8810b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            AbstractC3292y.h(property, "getProperty(...)");
            b9 = Q5.s.b(l6.n.i(property));
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(th));
        }
        if (Q5.s.g(b9)) {
            b9 = null;
        }
        Integer num = (Integer) b9;
        if (num != null) {
            i8 = num.intValue();
        } else {
            i8 = 2097152;
        }
        f2065a = i8;
    }
}
