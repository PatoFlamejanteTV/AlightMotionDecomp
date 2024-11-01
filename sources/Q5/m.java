package Q5;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class m {

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8802a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.f8803a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.f8804b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.f8805c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8802a = iArr;
        }
    }

    public static InterfaceC1416k a(o mode, Function0 initializer) {
        AbstractC3292y.i(mode, "mode");
        AbstractC3292y.i(initializer, "initializer");
        int i8 = a.f8802a[mode.ordinal()];
        int i9 = 2;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return new J(initializer);
                }
                throw new p();
            }
            return new u(initializer);
        }
        AbstractC3284p abstractC3284p = null;
        return new v(initializer, abstractC3284p, i9, abstractC3284p);
    }

    public static InterfaceC1416k b(Function0 initializer) {
        AbstractC3292y.i(initializer, "initializer");
        AbstractC3284p abstractC3284p = null;
        return new v(initializer, abstractC3284p, 2, abstractC3284p);
    }
}
