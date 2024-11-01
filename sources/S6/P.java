package s6;

import kotlin.jvm.internal.AbstractC3292y;
import n6.V0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final U5.g f39182a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f39183b;

    /* renamed from: c, reason: collision with root package name */
    private final V0[] f39184c;

    /* renamed from: d, reason: collision with root package name */
    private int f39185d;

    public P(U5.g gVar, int i8) {
        this.f39182a = gVar;
        this.f39183b = new Object[i8];
        this.f39184c = new V0[i8];
    }

    public final void a(V0 v02, Object obj) {
        Object[] objArr = this.f39183b;
        int i8 = this.f39185d;
        objArr[i8] = obj;
        V0[] v0Arr = this.f39184c;
        this.f39185d = i8 + 1;
        AbstractC3292y.g(v02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        v0Arr[i8] = v02;
    }

    public final void b(U5.g gVar) {
        int length = this.f39184c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i8 = length - 1;
            V0 v02 = this.f39184c[length];
            AbstractC3292y.f(v02);
            v02.restoreThreadContext(gVar, this.f39183b[length]);
            if (i8 >= 0) {
                length = i8;
            } else {
                return;
            }
        }
    }
}
