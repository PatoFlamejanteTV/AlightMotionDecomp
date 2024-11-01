package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class InsetsValues {
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public InsetsValues(int i8, int i9, int i10, int i11) {
        this.left = i8;
        this.top = i9;
        this.right = i10;
        this.bottom = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsValues)) {
            return false;
        }
        InsetsValues insetsValues = (InsetsValues) obj;
        if (this.left == insetsValues.left && this.top == insetsValues.top && this.right == insetsValues.right && this.bottom == insetsValues.bottom) {
            return true;
        }
        return false;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public String toString() {
        return "InsetsValues(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
    }
}
