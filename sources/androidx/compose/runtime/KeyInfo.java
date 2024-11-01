package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class KeyInfo {
    public static final int $stable = 8;
    private final int index;
    private final int key;
    private final int location;
    private final int nodes;
    private final Object objectKey;

    public KeyInfo(int i8, Object obj, int i9, int i10, int i11) {
        this.key = i8;
        this.objectKey = obj;
        this.location = i9;
        this.nodes = i10;
        this.index = i11;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getKey() {
        return this.key;
    }

    public final int getLocation() {
        return this.location;
    }

    public final int getNodes() {
        return this.nodes;
    }

    public final Object getObjectKey() {
        return this.objectKey;
    }
}
