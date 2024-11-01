package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocal;

/* loaded from: classes.dex */
public final class CompositionLocalConsumerModifierNodeKt {
    public static final <T> T currentValueOf(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode, CompositionLocal<T> compositionLocal) {
        if (compositionLocalConsumerModifierNode.getNode().isAttached()) {
            return (T) DelegatableNodeKt.requireLayoutNode(compositionLocalConsumerModifierNode).getCompositionLocalMap().get(compositionLocal);
        }
        throw new IllegalStateException("Cannot read CompositionLocal because the Modifier node is not currently attached.".toString());
    }
}
