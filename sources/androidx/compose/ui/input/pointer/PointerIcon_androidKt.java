package androidx.compose.ui.input.pointer;

import androidx.core.view.PointerIconCompat;

/* loaded from: classes.dex */
public final class PointerIcon_androidKt {
    private static final PointerIcon pointerIconDefault = new AndroidPointerIconType(1000);
    private static final PointerIcon pointerIconCrosshair = new AndroidPointerIconType(PointerIconCompat.TYPE_CROSSHAIR);
    private static final PointerIcon pointerIconText = new AndroidPointerIconType(PointerIconCompat.TYPE_TEXT);
    private static final PointerIcon pointerIconHand = new AndroidPointerIconType(PointerIconCompat.TYPE_HAND);

    public static final PointerIcon PointerIcon(android.view.PointerIcon pointerIcon) {
        return new AndroidPointerIcon(pointerIcon);
    }

    public static final PointerIcon getPointerIconCrosshair() {
        return pointerIconCrosshair;
    }

    public static final PointerIcon getPointerIconDefault() {
        return pointerIconDefault;
    }

    public static final PointerIcon getPointerIconHand() {
        return pointerIconHand;
    }

    public static final PointerIcon getPointerIconText() {
        return pointerIconText;
    }

    public static final PointerIcon PointerIcon(int i8) {
        return new AndroidPointerIconType(i8);
    }
}
