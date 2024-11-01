package androidx.activity.contextaware;

import Q5.s;
import Q5.t;
import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.InterfaceC3470o;

/* loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ InterfaceC3470o $co;
    final /* synthetic */ Function1 $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(InterfaceC3470o interfaceC3470o, Function1 function1) {
        this.$co = interfaceC3470o;
        this.$onContextAvailable = function1;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object b9;
        AbstractC3292y.i(context, "context");
        InterfaceC3470o interfaceC3470o = this.$co;
        Function1 function1 = this.$onContextAvailable;
        try {
            s.a aVar = s.f8810b;
            b9 = s.b(function1.invoke(context));
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        interfaceC3470o.resumeWith(b9);
    }
}
