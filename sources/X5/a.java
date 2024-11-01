package X5;

import R5.AbstractC1428l;
import g6.AbstractC2923c;
import g6.C2922b;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: X5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static final class C0257a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0257a f11597a = new C0257a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f11598b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f11599c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            AbstractC3292y.f(methods);
            int length = methods.length;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                method = null;
                if (i9 < length) {
                    method2 = methods[i9];
                    if (AbstractC3292y.d(method2.getName(), "addSuppressed")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        AbstractC3292y.h(parameterTypes, "getParameterTypes(...)");
                        if (AbstractC3292y.d(AbstractC1428l.K0(parameterTypes), Throwable.class)) {
                            break;
                        }
                    }
                    i9++;
                } else {
                    method2 = null;
                    break;
                }
            }
            f11598b = method2;
            int length2 = methods.length;
            while (true) {
                if (i8 >= length2) {
                    break;
                }
                Method method3 = methods[i8];
                if (AbstractC3292y.d(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i8++;
            }
            f11599c = method;
        }

        private C0257a() {
        }
    }

    public void a(Throwable cause, Throwable exception) {
        AbstractC3292y.i(cause, "cause");
        AbstractC3292y.i(exception, "exception");
        Method method = C0257a.f11598b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public AbstractC2923c b() {
        return new C2922b();
    }
}
