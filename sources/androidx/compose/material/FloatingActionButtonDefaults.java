package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();

    private FloatingActionButtonDefaults() {
    }

    @Composable
    /* renamed from: elevation-ixp7dh8, reason: not valid java name */
    public final /* synthetic */ FloatingActionButtonElevation m1238elevationixp7dh8(float f8, float f9, Composer composer, int i8, int i9) {
        float f10;
        float f11;
        composer.startReplaceableGroup(-654132828);
        if ((i9 & 1) != 0) {
            f10 = Dp.m5155constructorimpl(6);
        } else {
            f10 = f8;
        }
        if ((i9 & 2) != 0) {
            f11 = Dp.m5155constructorimpl(12);
        } else {
            f11 = f9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-654132828, i8, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:219)");
        }
        float f12 = 8;
        FloatingActionButtonElevation m1239elevationxZ9QkE = m1239elevationxZ9QkE(f10, f11, Dp.m5155constructorimpl(f12), Dp.m5155constructorimpl(f12), composer, (i8 & 14) | 3456 | (i8 & 112) | ((i8 << 6) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1239elevationxZ9QkE;
    }

    @Composable
    /* renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m1239elevationxZ9QkE(float f8, float f9, float f10, float f11, Composer composer, int i8, int i9) {
        float f12;
        float f13;
        float f14;
        float f15;
        composer.startReplaceableGroup(380403812);
        if ((i9 & 1) != 0) {
            f12 = Dp.m5155constructorimpl(6);
        } else {
            f12 = f8;
        }
        if ((i9 & 2) != 0) {
            f13 = Dp.m5155constructorimpl(12);
        } else {
            f13 = f9;
        }
        if ((i9 & 4) != 0) {
            f14 = Dp.m5155constructorimpl(8);
        } else {
            f14 = f10;
        }
        if ((i9 & 8) != 0) {
            f15 = Dp.m5155constructorimpl(8);
        } else {
            f15 = f11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(380403812, i8, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:244)");
        }
        Object[] objArr = {Dp.m5153boximpl(f12), Dp.m5153boximpl(f13), Dp.m5153boximpl(f14), Dp.m5153boximpl(f15)};
        composer.startReplaceableGroup(-568225417);
        boolean z8 = false;
        for (int i10 = 0; i10 < 4; i10++) {
            z8 |= composer.changed(objArr[i10]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultFloatingActionButtonElevation(f12, f13, f14, f15, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = (DefaultFloatingActionButtonElevation) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultFloatingActionButtonElevation;
    }
}
