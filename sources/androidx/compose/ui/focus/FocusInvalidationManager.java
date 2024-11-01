package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FocusInvalidationManager {
    public static final int $stable = 8;
    private final Function1 onRequestApplyChangesListener;
    private Set<FocusTargetNode> focusTargetNodes = new LinkedHashSet();
    private Set<FocusEventModifierNode> focusEventNodes = new LinkedHashSet();
    private Set<FocusPropertiesModifierNode> focusPropertiesNodes = new LinkedHashSet();
    private final Function0 invalidateNodes = new FocusInvalidationManager$invalidateNodes$1(this);

    public FocusInvalidationManager(Function1 function1) {
        this.onRequestApplyChangesListener = function1;
    }

    public final void scheduleInvalidation(FocusTargetNode focusTargetNode) {
        scheduleInvalidation(this.focusTargetNodes, focusTargetNode);
    }

    public final void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode) {
        scheduleInvalidation(this.focusEventNodes, focusEventModifierNode);
    }

    public final void scheduleInvalidation(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        scheduleInvalidation(this.focusPropertiesNodes, focusPropertiesModifierNode);
    }

    private final <T> void scheduleInvalidation(Set<T> set, T t8) {
        if (set.add(t8) && this.focusTargetNodes.size() + this.focusEventNodes.size() + this.focusPropertiesNodes.size() == 1) {
            this.onRequestApplyChangesListener.invoke(this.invalidateNodes);
        }
    }
}
