package androidx.compose.material;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class FabPlacement {
    private final int height;
    private final boolean isDocked;
    private final int left;
    private final int width;

    public FabPlacement(boolean z8, int i8, int i9, int i10) {
        this.isDocked = z8;
        this.left = i8;
        this.width = i9;
        this.height = i10;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isDocked() {
        return this.isDocked;
    }
}
