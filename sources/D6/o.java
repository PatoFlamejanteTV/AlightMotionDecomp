package D6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class o {
    public static final a a(a from, Function1 builderAction) {
        AbstractC3292y.i(from, "from");
        AbstractC3292y.i(builderAction, "builderAction");
        d dVar = new d(from);
        builderAction.invoke(dVar);
        return new n(dVar.a(), dVar.b());
    }

    public static /* synthetic */ a b(a aVar, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            aVar = a.f1444d;
        }
        return a(aVar, function1);
    }
}
