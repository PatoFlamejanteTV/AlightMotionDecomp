package androidx.compose.ui.draganddrop;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class DragAndDropNodeKt$DragAndDropModifierNode$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $shouldStartDragAndDrop;
    final /* synthetic */ DragAndDropTarget $target;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNodeKt$DragAndDropModifierNode$2(Function1 function1, DragAndDropTarget dragAndDropTarget) {
        super(1);
        this.$shouldStartDragAndDrop = function1;
        this.$target = dragAndDropTarget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DragAndDropTarget invoke(DragAndDropEvent dragAndDropEvent) {
        if (((Boolean) this.$shouldStartDragAndDrop.invoke(dragAndDropEvent)).booleanValue()) {
            return this.$target;
        }
        return null;
    }
}
