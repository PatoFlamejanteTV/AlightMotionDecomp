package E6;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: E6.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1062u {

    /* renamed from: a, reason: collision with root package name */
    private final Map f2078a = AbstractC1061t.a(16);

    /* renamed from: E6.u$a */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    public final Object a(A6.f descriptor, a key) {
        Object obj;
        AbstractC3292y.i(descriptor, "descriptor");
        AbstractC3292y.i(key, "key");
        Map map = (Map) this.f2078a.get(descriptor);
        if (map != null) {
            obj = map.get(key);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object b(A6.f descriptor, a key, Function0 defaultValue) {
        AbstractC3292y.i(descriptor, "descriptor");
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(defaultValue, "defaultValue");
        Object a9 = a(descriptor, key);
        if (a9 != null) {
            return a9;
        }
        Object invoke = defaultValue.invoke();
        c(descriptor, key, invoke);
        return invoke;
    }

    public final void c(A6.f descriptor, a key, Object value) {
        AbstractC3292y.i(descriptor, "descriptor");
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(value, "value");
        Map map = this.f2078a;
        Object obj = map.get(descriptor);
        if (obj == null) {
            obj = AbstractC1061t.a(2);
            map.put(descriptor, obj);
        }
        ((Map) obj).put(key, value);
    }
}
