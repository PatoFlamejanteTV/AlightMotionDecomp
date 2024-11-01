package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
final class UnionInsets implements WindowInsets {
    private final WindowInsets first;
    private final WindowInsets second;

    public UnionInsets(WindowInsets first, WindowInsets second) {
        AbstractC3292y.i(first, "first");
        AbstractC3292y.i(second, "second");
        this.first = first;
        this.second = second;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnionInsets)) {
            return false;
        }
        UnionInsets unionInsets = (UnionInsets) obj;
        if (AbstractC3292y.d(unionInsets.first, this.first) && AbstractC3292y.d(unionInsets.second, this.second)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        AbstractC3292y.i(density, "density");
        return Math.max(this.first.getBottom(density), this.second.getBottom(density));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        return Math.max(this.first.getLeft(density, layoutDirection), this.second.getLeft(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        return Math.max(this.first.getRight(density, layoutDirection), this.second.getRight(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        AbstractC3292y.i(density, "density");
        return Math.max(this.first.getTop(density), this.second.getTop(density));
    }

    public int hashCode() {
        return this.first.hashCode() + (this.second.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.first + " ∪ " + this.second + ')';
    }
}
