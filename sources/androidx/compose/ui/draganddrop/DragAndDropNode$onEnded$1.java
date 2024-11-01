package androidx.compose.ui.draganddrop;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DragAndDropNode$onEnded$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ DragAndDropEvent $event;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$onEnded$1(DragAndDropEvent dragAndDropEvent) {
        super(1);
        this.$event = dragAndDropEvent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(DragAndDropNode dragAndDropNode) {
        dragAndDropNode.onEnded(this.$event);
        return Boolean.TRUE;
    }
}
