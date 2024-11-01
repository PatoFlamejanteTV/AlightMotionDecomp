package androidx.compose.material.ripple;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes.dex */
final class DebugRippleTheme implements RippleTheme {
    public static final DebugRippleTheme INSTANCE = new DebugRippleTheme();

    private DebugRippleTheme() {
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    /* renamed from: defaultColor-WaAFU9c */
    public long mo43defaultColorWaAFU9c(Composer composer, int i8) {
        composer.startReplaceableGroup(2042140174);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2042140174, i8, -1, "androidx.compose.material.ripple.DebugRippleTheme.defaultColor (RippleTheme.kt:214)");
        }
        long m1423defaultRippleColor5vOe2sY = RippleTheme.Companion.m1423defaultRippleColor5vOe2sY(Color.Companion.m2974getBlack0d7_KjU(), true);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1423defaultRippleColor5vOe2sY;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    public RippleAlpha rippleAlpha(Composer composer, int i8) {
        composer.startReplaceableGroup(-1629816343);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1629816343, i8, -1, "androidx.compose.material.ripple.DebugRippleTheme.rippleAlpha (RippleTheme.kt:217)");
        }
        RippleAlpha m1422defaultRippleAlphaDxMtmZc = RippleTheme.Companion.m1422defaultRippleAlphaDxMtmZc(Color.Companion.m2974getBlack0d7_KjU(), true);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1422defaultRippleAlphaDxMtmZc;
    }
}
