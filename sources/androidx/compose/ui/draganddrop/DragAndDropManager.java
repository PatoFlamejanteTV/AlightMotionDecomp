package androidx.compose.ui.draganddrop;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface DragAndDropManager {
    /* renamed from: drag-12SF9DM, reason: not valid java name */
    boolean mo2597drag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j8, Function1 function1);

    Modifier getModifier();

    boolean isInterestedNode(DragAndDropModifierNode dragAndDropModifierNode);

    void registerNodeInterest(DragAndDropModifierNode dragAndDropModifierNode);
}
