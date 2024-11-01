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
public final class SelectableChipBorder {
    private final long borderColor;
    private final float borderWidth;
    private final long disabledBorderColor;
    private final long disabledSelectedBorderColor;
    private final long selectedBorderColor;
    private final float selectedBorderWidth;

    public /* synthetic */ SelectableChipBorder(long j8, long j9, long j10, long j11, float f8, float f9, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, f8, f9);
    }

    @Composable
    public final State<BorderStroke> borderStroke$material3_release(boolean z8, boolean z9, Composer composer, int i8) {
        long j8;
        float f8;
        composer.startReplaceableGroup(670222826);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(670222826, i8, -1, "androidx.compose.material3.SelectableChipBorder.borderStroke (Chip.kt:2002)");
        }
        if (z8) {
            if (z9) {
                j8 = this.selectedBorderColor;
            } else {
                j8 = this.borderColor;
            }
        } else if (z9) {
            j8 = this.disabledSelectedBorderColor;
        } else {
            j8 = this.disabledBorderColor;
        }
        if (z9) {
            f8 = this.selectedBorderWidth;
        } else {
            f8 = this.borderWidth;
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
        if (obj == null || !(obj instanceof SelectableChipBorder)) {
            return false;
        }
        SelectableChipBorder selectableChipBorder = (SelectableChipBorder) obj;
        if (Color.m2949equalsimpl0(this.borderColor, selectableChipBorder.borderColor) && Color.m2949equalsimpl0(this.selectedBorderColor, selectableChipBorder.selectedBorderColor) && Color.m2949equalsimpl0(this.disabledBorderColor, selectableChipBorder.disabledBorderColor) && Color.m2949equalsimpl0(this.disabledSelectedBorderColor, selectableChipBorder.disabledSelectedBorderColor) && Dp.m5160equalsimpl0(this.borderWidth, selectableChipBorder.borderWidth) && Dp.m5160equalsimpl0(this.selectedBorderWidth, selectableChipBorder.selectedBorderWidth)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((Color.m2955hashCodeimpl(this.borderColor) * 31) + Color.m2955hashCodeimpl(this.selectedBorderColor)) * 31) + Color.m2955hashCodeimpl(this.disabledBorderColor)) * 31) + Color.m2955hashCodeimpl(this.disabledSelectedBorderColor)) * 31) + Dp.m5161hashCodeimpl(this.borderWidth)) * 31) + Dp.m5161hashCodeimpl(this.selectedBorderWidth);
    }

    private SelectableChipBorder(long j8, long j9, long j10, long j11, float f8, float f9) {
        this.borderColor = j8;
        this.selectedBorderColor = j9;
        this.disabledBorderColor = j10;
        this.disabledSelectedBorderColor = j11;
        this.borderWidth = f8;
        this.selectedBorderWidth = f9;
    }
}
