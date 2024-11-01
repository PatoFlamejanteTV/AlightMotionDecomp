package androidx.compose.ui.layout;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;

/* loaded from: classes.dex */
public final class PinnableContainerKt {
    private static final ProvidableCompositionLocal<PinnableContainer> LocalPinnableContainer = CompositionLocalKt.compositionLocalOf$default(null, PinnableContainerKt$LocalPinnableContainer$1.INSTANCE, 1, null);

    public static final ProvidableCompositionLocal<PinnableContainer> getLocalPinnableContainer() {
        return LocalPinnableContainer;
    }
}
