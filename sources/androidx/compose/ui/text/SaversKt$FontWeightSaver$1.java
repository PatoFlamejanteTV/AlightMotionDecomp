package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.font.FontWeight;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$FontWeightSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$FontWeightSaver$1 INSTANCE = new SaversKt$FontWeightSaver$1();

    SaversKt$FontWeightSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(SaverScope saverScope, FontWeight fontWeight) {
        return Integer.valueOf(fontWeight.getWeight());
    }
}
