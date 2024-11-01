package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class ChipBorder {
    private final long borderColor;
    private final float borderWidth;
    private final long disabledBorderColor;

    public /* synthetic */ ChipBorder(long j8, long j9, float f8, AbstractC3284p abstractC3284p) {
        this(j8, j9, f8);
    }

    @Composable
    public final State<BorderStroke> borderStroke$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(1899621712);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899621712, i8, -1, "androidx.compose.material3.ChipBorder.borderStroke (Chip.kt:2055)");
        }
        float f8 = this.borderWidth;
        if (z8) {
            j8 = this.borderColor;
        } else {
            j8 = this.disabledBorderColor;
        }
        State<BorderStroke> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m286BorderStrokecXLIe8U(f8, j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipBorder)) {
            return false;
        }
        ChipBorder chipBorder = (ChipBorder) obj;
        if (Color.m2949equalsimpl0(this.borderColor, chipBorder.borderColor) && Color.m2949equalsimpl0(this.disabledBorderColor, chipBorder.disabledBorderColor) && Dp.m5160equalsimpl0(this.borderWidth, chipBorder.borderWidth)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Color.m2955hashCodeimpl(this.borderColor) * 31) + Color.m2955hashCodeimpl(this.disabledBorderColor)) * 31) + Dp.m5161hashCodeimpl(this.borderWidth);
    }

    private ChipBorder(long j8, long j9, float f8) {
        this.borderColor = j8;
        this.disabledBorderColor = j9;
        this.borderWidth = f8;
    }
}
