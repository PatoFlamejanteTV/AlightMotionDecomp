package n6;

import kotlin.jvm.functions.Function1;

/* renamed from: n6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3470o extends U5.d {

    /* renamed from: n6.o$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC3470o interfaceC3470o, Throwable th, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    th = null;
                }
                return interfaceC3470o.t(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    void C(Object obj);

    boolean b();

    void e(I i8, Object obj);

    void f(Function1 function1);

    boolean isActive();

    Object m(Throwable th);

    Object n(Object obj, Object obj2, Function1 function1);

    void o(Object obj, Function1 function1);

    boolean t(Throwable th);
}
