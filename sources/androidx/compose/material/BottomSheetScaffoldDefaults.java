package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldDefaults {
    public static final int $stable = 0;
    public static final BottomSheetScaffoldDefaults INSTANCE = new BottomSheetScaffoldDefaults();
    private static final float SheetElevation = Dp.m5155constructorimpl(8);
    private static final float SheetPeekHeight = Dp.m5155constructorimpl(56);

    private BottomSheetScaffoldDefaults() {
    }

    /* renamed from: getSheetElevation-D9Ej5fM, reason: not valid java name */
    public final float m1108getSheetElevationD9Ej5fM() {
        return SheetElevation;
    }

    /* renamed from: getSheetPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m1109getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }
}
