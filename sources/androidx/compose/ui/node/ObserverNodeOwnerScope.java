package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ObserverNodeOwnerScope implements OwnerScope {
    private final ObserverModifierNode observerNode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Function1 OnObserveReadsChanged = ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1.INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Function1 getOnObserveReadsChanged$ui_release() {
            return ObserverNodeOwnerScope.OnObserveReadsChanged;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public ObserverNodeOwnerScope(ObserverModifierNode observerModifierNode) {
        this.observerNode = observerModifierNode;
    }

    public final ObserverModifierNode getObserverNode$ui_release() {
        return this.observerNode;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.observerNode.getNode().isAttached();
    }
}
