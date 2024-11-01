package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AppBarDefaults {
    public static final int $stable = 0;
    private static final PaddingValues ContentPadding;
    public static final AppBarDefaults INSTANCE = new AppBarDefaults();
    private static final float TopAppBarElevation = Dp.m5155constructorimpl(4);
    private static final float BottomAppBarElevation = Dp.m5155constructorimpl(8);

    static {
        float f8;
        float f9;
        f8 = AppBarKt.AppBarHorizontalPadding;
        f9 = AppBarKt.AppBarHorizontalPadding;
        ContentPadding = PaddingKt.m574PaddingValuesa9UjIt4$default(f8, 0.0f, f9, 0.0f, 10, null);
    }

    private AppBarDefaults() {
    }

    /* renamed from: getBottomAppBarElevation-D9Ej5fM, reason: not valid java name */
    public final float m1079getBottomAppBarElevationD9Ej5fM() {
        return BottomAppBarElevation;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getTopAppBarElevation-D9Ej5fM, reason: not valid java name */
    public final float m1080getTopAppBarElevationD9Ej5fM() {
        return TopAppBarElevation;
    }
}
