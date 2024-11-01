package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class SwipeProgress<T> {
    public static final int $stable = 0;
    private final float fraction;
    private final T from;
    private final T to;

    public SwipeProgress(T t8, T t9, float f8) {
        this.from = t8;
        this.to = t9;
        this.fraction = f8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwipeProgress)) {
            return false;
        }
        SwipeProgress swipeProgress = (SwipeProgress) obj;
        if (AbstractC3292y.d(this.from, swipeProgress.from) && AbstractC3292y.d(this.to, swipeProgress.to) && this.fraction == swipeProgress.fraction) {
            return true;
        }
        return false;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final T getFrom() {
        return this.from;
    }

    public final T getTo() {
        return this.to;
    }

    public int hashCode() {
        int i8;
        T t8 = this.from;
        int i9 = 0;
        if (t8 != null) {
            i8 = t8.hashCode();
        } else {
            i8 = 0;
        }
        int i10 = i8 * 31;
        T t9 = this.to;
        if (t9 != null) {
            i9 = t9.hashCode();
        }
        return ((i10 + i9) * 31) + Float.floatToIntBits(this.fraction);
    }

    public String toString() {
        return "SwipeProgress(from=" + this.from + ", to=" + this.to + ", fraction=" + this.fraction + ')';
    }
}
