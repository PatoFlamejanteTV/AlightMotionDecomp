package androidx.compose.material3;

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
        composer.startReplaceableGroup(-2059468846);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2059468846, i8, -1, "androidx.compose.material3.MaterialRippleTheme.defaultColor (MaterialTheme.kt:117)");
        }
        long m2958unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2958unboximpl;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    public RippleAlpha rippleAlpha(Composer composer, int i8) {
        RippleAlpha rippleAlpha;
        composer.startReplaceableGroup(1285764247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1285764247, i8, -1, "androidx.compose.material3.MaterialRippleTheme.rippleAlpha (MaterialTheme.kt:120)");
        }
        rippleAlpha = MaterialThemeKt.DefaultRippleAlpha;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rippleAlpha;
    }
}
