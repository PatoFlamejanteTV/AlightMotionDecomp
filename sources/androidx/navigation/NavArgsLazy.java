package androidx.navigation;

import Q5.InterfaceC1416k;
import android.os.Bundle;
import androidx.navigation.NavArgs;
import b6.AbstractC1989a;
import j6.InterfaceC3214c;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NavArgsLazy<Args extends NavArgs> implements InterfaceC1416k {
    private final Function0 argumentProducer;
    private Args cached;
    private final InterfaceC3214c navArgsClass;

    public NavArgsLazy(InterfaceC3214c navArgsClass, Function0 argumentProducer) {
        AbstractC3292y.i(navArgsClass, "navArgsClass");
        AbstractC3292y.i(argumentProducer, "argumentProducer");
        this.navArgsClass = navArgsClass;
        this.argumentProducer = argumentProducer;
    }

    @Override // Q5.InterfaceC1416k
    public boolean isInitialized() {
        if (this.cached != null) {
            return true;
        }
        return false;
    }

    @Override // Q5.InterfaceC1416k
    public Args getValue() {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Bundle bundle = (Bundle) this.argumentProducer.invoke();
        Method method = NavArgsLazyKt.getMethodMap().get(this.navArgsClass);
        if (method == null) {
            Class a9 = AbstractC1989a.a(this.navArgsClass);
            Class<Bundle>[] methodSignature = NavArgsLazyKt.getMethodSignature();
            method = a9.getMethod("fromBundle", (Class[]) Arrays.copyOf(methodSignature, methodSignature.length));
            NavArgsLazyKt.getMethodMap().put(this.navArgsClass, method);
            AbstractC3292y.h(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Object invoke = method.invoke(null, bundle);
        AbstractC3292y.g(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        Args args2 = (Args) invoke;
        this.cached = args2;
        return args2;
    }
}
