package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextDecoration;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$TextDecorationSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$TextDecorationSaver$1 INSTANCE = new SaversKt$TextDecorationSaver$1();

    SaversKt$TextDecorationSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(SaverScope saverScope, TextDecoration textDecoration) {
        return Integer.valueOf(textDecoration.getMask());
    }
}
