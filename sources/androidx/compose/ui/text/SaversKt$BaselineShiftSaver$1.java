package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.BaselineShift;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$BaselineShiftSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$BaselineShiftSaver$1 INSTANCE = new SaversKt$BaselineShiftSaver$1();

    SaversKt$BaselineShiftSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4608invoke8a2Sb4w((SaverScope) obj, ((BaselineShift) obj2).m4949unboximpl());
    }

    /* renamed from: invoke-8a2Sb4w, reason: not valid java name */
    public final Object m4608invoke8a2Sb4w(SaverScope saverScope, float f8) {
        return Float.valueOf(f8);
    }
}
