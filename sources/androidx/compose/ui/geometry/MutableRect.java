package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MutableRect {
    public static final int $stable = 8;
    private float bottom;
    private float left;
    private float right;
    private float top;

    public MutableRect(float f8, float f9, float f10, float f11) {
        this.left = f8;
        this.top = f9;
        this.right = f10;
        this.bottom = f11;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m2699containsk4lQ0M(long j8) {
        if (Offset.m2712getXimpl(j8) >= this.left && Offset.m2712getXimpl(j8) < this.right && Offset.m2713getYimpl(j8) >= this.top && Offset.m2713getYimpl(j8) < this.bottom) {
            return true;
        }
        return false;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m2700getSizeNHjbRc() {
        return SizeKt.Size(getRight() - getLeft(), getBottom() - getTop());
    }

    public final float getTop() {
        return this.top;
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    @Stable
    public final void intersect(float f8, float f9, float f10, float f11) {
        this.left = Math.max(f8, this.left);
        this.top = Math.max(f9, this.top);
        this.right = Math.min(f10, this.right);
        this.bottom = Math.min(f11, this.bottom);
    }

    public final boolean isEmpty() {
        if (this.left < this.right && this.top < this.bottom) {
            return false;
        }
        return true;
    }

    public final void set(float f8, float f9, float f10, float f11) {
        this.left = f8;
        this.top = f9;
        this.right = f10;
        this.bottom = f11;
    }

    public final void setBottom(float f8) {
        this.bottom = f8;
    }

    public final void setLeft(float f8) {
        this.left = f8;
    }

    public final void setRight(float f8) {
        this.right = f8;
    }

    public final void setTop(float f8) {
        this.top = f8;
    }

    public String toString() {
        return "MutableRect(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }
}
