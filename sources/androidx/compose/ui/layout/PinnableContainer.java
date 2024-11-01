package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes.dex */
public interface PinnableContainer {

    /* loaded from: classes.dex */
    public interface PinnedHandle {
        void release();
    }

    PinnedHandle pin();
}
