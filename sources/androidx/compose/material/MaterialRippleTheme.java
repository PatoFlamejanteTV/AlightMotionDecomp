package androidx.compose.material;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

/* JADX INFO: Access modifiers changed from: package-private */
@Immutable
/* loaded from: classes.dex */
public final class MaterialRippleTheme implements RippleTheme {
    public static final MaterialRippleTheme INSTANCE = new MaterialRippleTheme();

    private MaterialRippleTheme() {
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    /* renamed from: defaultColor-WaAFU9c */
    public long mo43defaultColorWaAFU9c(Composer composer, int i8) {
        composer.startReplaceableGroup(550536719);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(550536719, i8, -1, "androidx.compose.material.MaterialRippleTheme.defaultColor (MaterialTheme.kt:127)");
        }
        long m1423defaultRippleColor5vOe2sY = RippleTheme.Companion.m1423defaultRippleColor5vOe2sY(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl(), MaterialTheme.INSTANCE.getColors(composer, 6).isLight());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1423defaultRippleColor5vOe2sY;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    public RippleAlpha rippleAlpha(Composer composer, int i8) {
        composer.startReplaceableGroup(-1419762518);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1419762518, i8, -1, "androidx.compose.material.MaterialRippleTheme.rippleAlpha (MaterialTheme.kt:133)");
        }
        RippleAlpha m1422defaultRippleAlphaDxMtmZc = RippleTheme.Companion.m1422defaultRippleAlphaDxMtmZc(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl(), MaterialTheme.INSTANCE.getColors(composer, 6).isLight());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1422defaultRippleAlphaDxMtmZc;
    }
}
