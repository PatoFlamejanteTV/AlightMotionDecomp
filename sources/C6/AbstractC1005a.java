package C6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1005a implements y6.b {
    public /* synthetic */ AbstractC1005a(AbstractC3284p abstractC3284p) {
        this();
    }

    public static /* synthetic */ void n(AbstractC1005a abstractC1005a, B6.c cVar, int i8, Object obj, boolean z8, int i9, Object obj2) {
        if (obj2 == null) {
            if ((i9 & 8) != 0) {
                z8 = true;
            }
            abstractC1005a.m(cVar, i8, obj, z8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
    }

    private final int o(B6.c cVar, Object obj) {
        int s8 = cVar.s(a());
        h(obj, s8);
        return s8;
    }

    @Override // y6.InterfaceC4248a
    public Object d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return k(decoder, null);
    }

    protected abstract Object f();

    protected abstract int g(Object obj);

    protected abstract void h(Object obj, int i8);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Iterator i(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int j(Object obj);

    public final Object k(B6.e decoder, Object obj) {
        Object f8;
        AbstractC3292y.i(decoder, "decoder");
        if (obj == null || (f8 = p(obj)) == null) {
            f8 = f();
        }
        int g8 = g(f8);
        B6.c c8 = decoder.c(a());
        if (!c8.z()) {
            while (true) {
                int y8 = c8.y(a());
                if (y8 == -1) {
                    break;
                }
                n(this, c8, g8 + y8, f8, false, 8, null);
            }
        } else {
            l(c8, f8, g8, o(c8, f8));
        }
        c8.a(a());
        return q(f8);
    }

    protected abstract void l(B6.c cVar, Object obj, int i8, int i9);

    protected abstract void m(B6.c cVar, int i8, Object obj, boolean z8);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object p(Object obj);

    protected abstract Object q(Object obj);

    private AbstractC1005a() {
    }
}
