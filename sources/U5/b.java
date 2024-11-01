package U5;

import U5.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class b implements g.c {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f10141a;

    /* renamed from: b, reason: collision with root package name */
    private final g.c f10142b;

    public b(g.c baseKey, Function1 safeCast) {
        AbstractC3292y.i(baseKey, "baseKey");
        AbstractC3292y.i(safeCast, "safeCast");
        this.f10141a = safeCast;
        this.f10142b = baseKey instanceof b ? ((b) baseKey).f10142b : baseKey;
    }

    public final boolean a(g.c key) {
        AbstractC3292y.i(key, "key");
        if (key != this && this.f10142b != key) {
            return false;
        }
        return true;
    }

    public final g.b b(g.b element) {
        AbstractC3292y.i(element, "element");
        return (g.b) this.f10141a.invoke(element);
    }
}
