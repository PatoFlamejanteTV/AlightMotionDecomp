package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.jvm.internal.T;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FocusablePinnableContainerNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    private boolean isFocused;
    private PinnableContainer.PinnedHandle pinnedHandle;

    private final PinnableContainer retrievePinnableContainer() {
        T t8 = new T();
        ObserverModifierNodeKt.observeReads(this, new FocusablePinnableContainerNode$retrievePinnableContainer$1(t8, this));
        return (PinnableContainer) t8.f34573a;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        PinnableContainer.PinnedHandle pinnedHandle;
        PinnableContainer retrievePinnableContainer = retrievePinnableContainer();
        if (this.isFocused) {
            PinnableContainer.PinnedHandle pinnedHandle2 = this.pinnedHandle;
            if (pinnedHandle2 != null) {
                pinnedHandle2.release();
            }
            if (retrievePinnableContainer != null) {
                pinnedHandle = retrievePinnableContainer.pin();
            } else {
                pinnedHandle = null;
            }
            this.pinnedHandle = pinnedHandle;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.pinnedHandle = null;
    }

    public final void setFocus(boolean z8) {
        PinnableContainer.PinnedHandle pinnedHandle = null;
        if (z8) {
            PinnableContainer retrievePinnableContainer = retrievePinnableContainer();
            if (retrievePinnableContainer != null) {
                pinnedHandle = retrievePinnableContainer.pin();
            }
            this.pinnedHandle = pinnedHandle;
        } else {
            PinnableContainer.PinnedHandle pinnedHandle2 = this.pinnedHandle;
            if (pinnedHandle2 != null) {
                pinnedHandle2.release();
            }
            this.pinnedHandle = null;
        }
        this.isFocused = z8;
    }
}
