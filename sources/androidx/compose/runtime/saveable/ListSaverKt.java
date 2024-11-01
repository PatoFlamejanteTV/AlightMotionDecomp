package androidx.compose.runtime.saveable;

import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Z;

/* loaded from: classes.dex */
public final class ListSaverKt {
    public static final <Original, Saveable> Saver<Original, Object> listSaver(InterfaceC2072n interfaceC2072n, Function1 function1) {
        ListSaverKt$listSaver$1 listSaverKt$listSaver$1 = new ListSaverKt$listSaver$1(interfaceC2072n);
        AbstractC3292y.g(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return SaverKt.Saver(listSaverKt$listSaver$1, (Function1) Z.d(function1, 1));
    }
}
