package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class BackwardsCompatNodeKt {
    private static final BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 DetachedModifierLocalReadScope = new ModifierLocalReadScope() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1
        @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
        public <T> T getCurrent(ModifierLocal<T> modifierLocal) {
            return (T) modifierLocal.getDefaultFactory$ui_release().invoke();
        }
    };
    private static final Function1 onDrawCacheReadsChanged = BackwardsCompatNodeKt$onDrawCacheReadsChanged$1.INSTANCE;
    private static final Function1 updateModifierLocalConsumer = BackwardsCompatNodeKt$updateModifierLocalConsumer$1.INSTANCE;

    public static final boolean isChainUpdate(BackwardsCompatNode backwardsCompatNode) {
        Modifier.Node tail$ui_release = DelegatableNodeKt.requireLayoutNode(backwardsCompatNode).getNodes$ui_release().getTail$ui_release();
        AbstractC3292y.g(tail$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((TailModifierNode) tail$ui_release).getAttachHasBeenRun();
    }
}
