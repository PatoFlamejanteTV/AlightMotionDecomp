package androidx.activity.contextaware;

import Q5.I;
import U5.d;
import V5.b;
import android.content.Context;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3290w;
import n6.C3472p;

/* loaded from: classes.dex */
public final class ContextAwareKt {
    public static final <R> Object withContextAvailable(ContextAware contextAware, Function1 function1, d dVar) {
        Context peekAvailableContext = contextAware.peekAvailableContext();
        if (peekAvailableContext != null) {
            return function1.invoke(peekAvailableContext);
        }
        C3472p c3472p = new C3472p(b.c(dVar), 1);
        c3472p.B();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(c3472p, function1);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        c3472p.f(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object y8 = c3472p.y();
        if (y8 == b.e()) {
            h.c(dVar);
        }
        return y8;
    }

    private static final <R> Object withContextAvailable$$forInline(ContextAware contextAware, Function1 function1, d dVar) {
        Context peekAvailableContext = contextAware.peekAvailableContext();
        if (peekAvailableContext != null) {
            return function1.invoke(peekAvailableContext);
        }
        AbstractC3290w.c(0);
        C3472p c3472p = new C3472p(b.c(dVar), 1);
        c3472p.B();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(c3472p, function1);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        c3472p.f(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        I i8 = I.f8786a;
        Object y8 = c3472p.y();
        if (y8 == b.e()) {
            h.c(dVar);
        }
        AbstractC3290w.c(1);
        return y8;
    }
}
