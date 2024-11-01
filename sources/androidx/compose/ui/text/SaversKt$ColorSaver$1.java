package androidx.compose.ui.text;

import Q5.C;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Color;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$ColorSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$ColorSaver$1 INSTANCE = new SaversKt$ColorSaver$1();

    SaversKt$ColorSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4610invoke4WTKRHQ((SaverScope) obj, ((Color) obj2).m2958unboximpl());
    }

    /* renamed from: invoke-4WTKRHQ, reason: not valid java name */
    public final Object m4610invoke4WTKRHQ(SaverScope saverScope, long j8) {
        return C.a(j8);
    }
}
