package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import i6.InterfaceC2977e;
import i6.m;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ProgressBarRangeInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ProgressBarRangeInfo Indeterminate = new ProgressBarRangeInfo(0.0f, m.b(0.0f, 0.0f), 0, 4, null);
    private final float current;
    private final InterfaceC2977e range;
    private final int steps;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final ProgressBarRangeInfo getIndeterminate() {
            return ProgressBarRangeInfo.Indeterminate;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public ProgressBarRangeInfo(float f8, InterfaceC2977e interfaceC2977e, int i8) {
        this.current = f8;
        this.range = interfaceC2977e;
        this.steps = i8;
        if (!(!Float.isNaN(f8))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj;
        if (this.current == progressBarRangeInfo.current && AbstractC3292y.d(this.range, progressBarRangeInfo.range) && this.steps == progressBarRangeInfo.steps) {
            return true;
        }
        return false;
    }

    public final float getCurrent() {
        return this.current;
    }

    public final InterfaceC2977e getRange() {
        return this.range;
    }

    public final int getSteps() {
        return this.steps;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.current) * 31) + this.range.hashCode()) * 31) + this.steps;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.current + ", range=" + this.range + ", steps=" + this.steps + ')';
    }

    public /* synthetic */ ProgressBarRangeInfo(float f8, InterfaceC2977e interfaceC2977e, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(f8, interfaceC2977e, (i9 & 4) != 0 ? 0 : i8);
    }
}
