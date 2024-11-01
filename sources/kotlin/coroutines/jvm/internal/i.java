package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f34560a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final a f34561b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    private static a f34562c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f34563a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f34564b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f34565c;

        public a(Method method, Method method2, Method method3) {
            this.f34563a = method;
            this.f34564b = method2;
            this.f34565c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f34562c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f34561b;
            f34562c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        Object obj;
        Object obj2;
        Object obj3;
        AbstractC3292y.i(continuation, "continuation");
        a aVar = f34562c;
        if (aVar == null) {
            aVar = a(continuation);
        }
        if (aVar == f34561b) {
            return null;
        }
        Method method = aVar.f34563a;
        if (method != null) {
            obj = method.invoke(continuation.getClass(), null);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Method method2 = aVar.f34564b;
        if (method2 != null) {
            obj2 = method2.invoke(obj, null);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        Method method3 = aVar.f34565c;
        if (method3 != null) {
            obj3 = method3.invoke(obj2, null);
        } else {
            obj3 = null;
        }
        if (!(obj3 instanceof String)) {
            return null;
        }
        return (String) obj3;
    }
}
