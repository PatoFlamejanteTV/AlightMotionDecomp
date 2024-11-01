package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    @Composable
    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final CheckboxColors m1132colorszjMxDiM(long j8, long j9, long j10, long j11, long j12, Composer composer, int i8, int i9) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        composer.startReplaceableGroup(469524104);
        if ((i9 & 1) != 0) {
            j13 = MaterialTheme.INSTANCE.getColors(composer, 6).m1157getSecondary0d7_KjU();
        } else {
            j13 = j8;
        }
        if ((i9 & 2) != 0) {
            j14 = Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j9;
        }
        if ((i9 & 4) != 0) {
            j15 = MaterialTheme.INSTANCE.getColors(composer, 6).m1159getSurface0d7_KjU();
        } else {
            j15 = j10;
        }
        if ((i9 & 8) != 0) {
            j16 = Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j16 = j11;
        }
        if ((i9 & 16) != 0) {
            j17 = Color.m2947copywmQWz5c$default(j13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j17 = j12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469524104, i8, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:226)");
        }
        Object[] objArr = {Color.m2938boximpl(j13), Color.m2938boximpl(j14), Color.m2938boximpl(j15), Color.m2938boximpl(j16), Color.m2938boximpl(j17)};
        composer.startReplaceableGroup(-568225417);
        boolean z8 = false;
        for (int i10 = 0; i10 < 5; i10++) {
            z8 |= composer.changed(objArr[i10]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultCheckboxColors(j15, Color.m2947copywmQWz5c$default(j15, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j13, Color.m2947copywmQWz5c$default(j13, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j16, Color.m2947copywmQWz5c$default(j16, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j17, j13, j14, j16, j17, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultCheckboxColors defaultCheckboxColors = (DefaultCheckboxColors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultCheckboxColors;
    }
}
