package p6;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public interface v {

    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ boolean a(v vVar, Throwable th, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    th = null;
                }
                return vVar.d(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    boolean A();

    boolean d(Throwable th);

    Object l(Object obj, U5.d dVar);

    void w(Function1 function1);

    Object x(Object obj);
}
