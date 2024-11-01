package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class WindowInsetsSizeKt$windowInsetsBottomHeight$2 extends AbstractC3293z implements InterfaceC2072n {
    public static final WindowInsetsSizeKt$windowInsetsBottomHeight$2 INSTANCE = new WindowInsetsSizeKt$windowInsetsBottomHeight$2();

    WindowInsetsSizeKt$windowInsetsBottomHeight$2() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Integer invoke(WindowInsets $receiver, Density it) {
        AbstractC3292y.i($receiver, "$this$$receiver");
        AbstractC3292y.i(it, "it");
        return Integer.valueOf($receiver.getBottom(it));
    }
}
