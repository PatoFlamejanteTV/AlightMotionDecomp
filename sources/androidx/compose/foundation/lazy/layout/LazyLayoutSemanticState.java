package androidx.compose.foundation.lazy.layout;

import U5.d;
import androidx.compose.ui.semantics.CollectionInfo;

/* loaded from: classes.dex */
public interface LazyLayoutSemanticState {
    Object animateScrollBy(float f8, d dVar);

    CollectionInfo collectionInfo();

    boolean getCanScrollForward();

    float getCurrentPosition();

    Object scrollToItem(int i8, d dVar);
}
