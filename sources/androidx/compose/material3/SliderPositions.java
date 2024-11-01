package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class SliderPositions {
    private final MutableState positionFraction$delegate;
    private final MutableState tickFractions$delegate;

    public SliderPositions(float f8, float[] initialTickFractions) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        AbstractC3292y.i(initialTickFractions, "initialTickFractions");
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f8), null, 2, null);
        this.positionFraction$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialTickFractions, null, 2, null);
        this.tickFractions$delegate = mutableStateOf$default2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderPositions)) {
            return false;
        }
        SliderPositions sliderPositions = (SliderPositions) obj;
        if (getPositionFraction() == sliderPositions.getPositionFraction() && Arrays.equals(getTickFractions(), sliderPositions.getTickFractions())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getPositionFraction() {
        return ((Number) this.positionFraction$delegate.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float[] getTickFractions() {
        return (float[]) this.tickFractions$delegate.getValue();
    }

    public int hashCode() {
        return (Float.floatToIntBits(getPositionFraction()) * 31) + Arrays.hashCode(getTickFractions());
    }

    public final void setPositionFraction$material3_release(float f8) {
        this.positionFraction$delegate.setValue(Float.valueOf(f8));
    }

    public final void setTickFractions$material3_release(float[] fArr) {
        AbstractC3292y.i(fArr, "<set-?>");
        this.tickFractions$delegate.setValue(fArr);
    }
}
