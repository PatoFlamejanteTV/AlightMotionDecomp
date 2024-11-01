package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    @Composable
    /* renamed from: colors-SQMK_m0, reason: not valid java name */
    public final SwitchColors m1342colorsSQMK_m0(long j8, long j9, float f8, long j10, long j11, float f9, long j12, long j13, long j14, long j15, Composer composer, int i8, int i9, int i10) {
        long j16;
        long j17;
        float f10;
        long j18;
        long j19;
        float f11;
        float f12;
        long j20;
        long j21;
        long j22;
        long j23;
        int i11;
        long j24;
        long j25;
        composer.startReplaceableGroup(-1032127534);
        if ((i10 & 1) != 0) {
            j16 = MaterialTheme.INSTANCE.getColors(composer, 6).m1158getSecondaryVariant0d7_KjU();
        } else {
            j16 = j8;
        }
        if ((i10 & 2) != 0) {
            j17 = j16;
        } else {
            j17 = j9;
        }
        if ((i10 & 4) != 0) {
            f10 = 0.54f;
        } else {
            f10 = f8;
        }
        if ((i10 & 8) != 0) {
            j18 = MaterialTheme.INSTANCE.getColors(composer, 6).m1159getSurface0d7_KjU();
        } else {
            j18 = j10;
        }
        if ((i10 & 16) != 0) {
            j19 = MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU();
        } else {
            j19 = j11;
        }
        if ((i10 & 32) != 0) {
            f11 = 0.38f;
        } else {
            f11 = f9;
        }
        if ((i10 & 64) != 0) {
            f12 = f10;
            j20 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(j16, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1159getSurface0d7_KjU());
        } else {
            f12 = f10;
            j20 = j12;
        }
        if ((i10 & 128) != 0) {
            j21 = j16;
            j22 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(j17, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1159getSurface0d7_KjU());
        } else {
            j21 = j16;
            j22 = j13;
        }
        if ((i10 & 256) != 0) {
            i11 = 6;
            j23 = j20;
            j24 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(j18, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1159getSurface0d7_KjU());
        } else {
            j23 = j20;
            i11 = 6;
            j24 = j14;
        }
        if ((i10 & 512) != 0) {
            j25 = ColorKt.m2993compositeOverOWjLjI(Color.m2947copywmQWz5c$default(j19, ContentAlpha.INSTANCE.getDisabled(composer, i11), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1159getSurface0d7_KjU());
        } else {
            j25 = j15;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1032127534, i8, i9, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:320)");
        }
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(j21, Color.m2947copywmQWz5c$default(j17, f12, 0.0f, 0.0f, 0.0f, 14, null), j18, Color.m2947copywmQWz5c$default(j19, f11, 0.0f, 0.0f, 0.0f, 14, null), j23, Color.m2947copywmQWz5c$default(j22, f12, 0.0f, 0.0f, 0.0f, 14, null), j24, Color.m2947copywmQWz5c$default(j25, f11, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSwitchColors;
    }
}
