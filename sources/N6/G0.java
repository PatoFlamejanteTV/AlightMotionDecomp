package n6;

import s6.C3980F;

/* loaded from: classes5.dex */
public abstract class G0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C3980F f35648a = new C3980F("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    public static final C3980F f35649b = new C3980F("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    private static final C3980F f35650c = new C3980F("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    private static final C3980F f35651d = new C3980F("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    private static final C3980F f35652e = new C3980F("SEALED");

    /* renamed from: f, reason: collision with root package name */
    private static final C3455g0 f35653f = new C3455g0(false);

    /* renamed from: g, reason: collision with root package name */
    private static final C3455g0 f35654g = new C3455g0(true);

    public static final Object g(Object obj) {
        if (obj instanceof InterfaceC3478s0) {
            return new C3480t0((InterfaceC3478s0) obj);
        }
        return obj;
    }

    public static final Object h(Object obj) {
        C3480t0 c3480t0;
        InterfaceC3478s0 interfaceC3478s0;
        if (obj instanceof C3480t0) {
            c3480t0 = (C3480t0) obj;
        } else {
            c3480t0 = null;
        }
        if (c3480t0 != null && (interfaceC3478s0 = c3480t0.f35751a) != null) {
            return interfaceC3478s0;
        }
        return obj;
    }
}
