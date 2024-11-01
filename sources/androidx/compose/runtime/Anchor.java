package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class Anchor {
    public static final int $stable = 8;
    private int location;

    public Anchor(int i8) {
        this.location = i8;
    }

    public final int getLocation$runtime_release() {
        return this.location;
    }

    public final boolean getValid() {
        if (this.location != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void setLocation$runtime_release(int i8) {
        this.location = i8;
    }

    public final int toIndexFor(SlotTable slotTable) {
        return slotTable.anchorIndex(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.location + " }";
    }

    public final int toIndexFor(SlotWriter slotWriter) {
        return slotWriter.anchorIndex(this);
    }
}
