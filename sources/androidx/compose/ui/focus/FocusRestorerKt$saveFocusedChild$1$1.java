package androidx.compose.ui.focus;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FocusRestorerKt$saveFocusedChild$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ FocusTargetNode $this_saveFocusedChild;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusRestorerKt$saveFocusedChild$1$1(FocusTargetNode focusTargetNode) {
        super(0);
        this.$this_saveFocusedChild = focusTargetNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(this.$this_saveFocusedChild.getPreviouslyFocusedChildHash());
    }
}
