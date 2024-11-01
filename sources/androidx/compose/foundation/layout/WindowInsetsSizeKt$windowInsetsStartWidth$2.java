package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class WindowInsetsSizeKt$windowInsetsStartWidth$2 extends AbstractC3293z implements InterfaceC2073o {
    public static final WindowInsetsSizeKt$windowInsetsStartWidth$2 INSTANCE = new WindowInsetsSizeKt$windowInsetsStartWidth$2();

    WindowInsetsSizeKt$windowInsetsStartWidth$2() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public final Integer invoke(WindowInsets $receiver, LayoutDirection layoutDirection, Density density) {
        int right;
        AbstractC3292y.i($receiver, "$this$$receiver");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        AbstractC3292y.i(density, "density");
        if (layoutDirection == LayoutDirection.Ltr) {
            right = $receiver.getLeft(density, layoutDirection);
        } else {
            right = $receiver.getRight(density, layoutDirection);
        }
        return Integer.valueOf(right);
    }
}
