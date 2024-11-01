package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class WindowInsetsKt {
    public static final WindowInsets WindowInsets(int i8, int i9, int i10, int i11) {
        return new FixedIntInsets(i8, i9, i10, i11);
    }

    public static /* synthetic */ WindowInsets WindowInsets$default(int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = 0;
        }
        if ((i12 & 2) != 0) {
            i9 = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return WindowInsets(i8, i9, i10, i11);
    }

    /* renamed from: WindowInsets-a9UjIt4, reason: not valid java name */
    public static final WindowInsets m648WindowInsetsa9UjIt4(float f8, float f9, float f10, float f11) {
        return new FixedDpInsets(f8, f9, f10, f11, null);
    }

    /* renamed from: WindowInsets-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ WindowInsets m649WindowInsetsa9UjIt4$default(float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.m5155constructorimpl(0);
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.m5155constructorimpl(0);
        }
        if ((i8 & 4) != 0) {
            f10 = Dp.m5155constructorimpl(0);
        }
        if ((i8 & 8) != 0) {
            f11 = Dp.m5155constructorimpl(0);
        }
        return m648WindowInsetsa9UjIt4(f8, f9, f10, f11);
    }

    public static final WindowInsets add(WindowInsets windowInsets, WindowInsets insets) {
        AbstractC3292y.i(windowInsets, "<this>");
        AbstractC3292y.i(insets, "insets");
        return new AddedInsets(windowInsets, insets);
    }

    public static final WindowInsets asInsets(PaddingValues paddingValues) {
        AbstractC3292y.i(paddingValues, "<this>");
        return new PaddingValuesInsets(paddingValues);
    }

    @Composable
    @ReadOnlyComposable
    public static final PaddingValues asPaddingValues(WindowInsets windowInsets, Composer composer, int i8) {
        AbstractC3292y.i(windowInsets, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485016250, i8, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:242)");
        }
        InsetsPaddingValues insetsPaddingValues = new InsetsPaddingValues(windowInsets, (Density) composer.consume(CompositionLocalsKt.getLocalDensity()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return insetsPaddingValues;
    }

    public static final WindowInsets exclude(WindowInsets windowInsets, WindowInsets insets) {
        AbstractC3292y.i(windowInsets, "<this>");
        AbstractC3292y.i(insets, "insets");
        return new ExcludeInsets(windowInsets, insets);
    }

    /* renamed from: only-bOOhFvg, reason: not valid java name */
    public static final WindowInsets m650onlybOOhFvg(WindowInsets only, int i8) {
        AbstractC3292y.i(only, "$this$only");
        return new LimitInsets(only, i8, null);
    }

    public static final WindowInsets union(WindowInsets windowInsets, WindowInsets insets) {
        AbstractC3292y.i(windowInsets, "<this>");
        AbstractC3292y.i(insets, "insets");
        return new UnionInsets(windowInsets, insets);
    }

    public static final PaddingValues asPaddingValues(WindowInsets windowInsets, Density density) {
        AbstractC3292y.i(windowInsets, "<this>");
        AbstractC3292y.i(density, "density");
        return new InsetsPaddingValues(windowInsets, density);
    }
}
