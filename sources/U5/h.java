package U5;

import U5.g;
import c6.InterfaceC2072n;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class h implements g, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final h f10149a = new h();

    private h() {
    }

    @Override // U5.g
    public Object fold(Object obj, InterfaceC2072n operation) {
        AbstractC3292y.i(operation, "operation");
        return obj;
    }

    @Override // U5.g
    public g.b get(g.c key) {
        AbstractC3292y.i(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // U5.g
    public g minusKey(g.c key) {
        AbstractC3292y.i(key, "key");
        return this;
    }

    @Override // U5.g
    public g plus(g context) {
        AbstractC3292y.i(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
