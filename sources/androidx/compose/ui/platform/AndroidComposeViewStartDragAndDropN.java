package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;

@RequiresApi(24)
/* loaded from: classes.dex */
final class AndroidComposeViewStartDragAndDropN {
    public static final AndroidComposeViewStartDragAndDropN INSTANCE = new AndroidComposeViewStartDragAndDropN();

    private AndroidComposeViewStartDragAndDropN() {
    }

    @DoNotInline
    @RequiresApi(24)
    public final boolean startDragAndDrop(View view, DragAndDropTransferData dragAndDropTransferData, ComposeDragShadowBuilder composeDragShadowBuilder) {
        boolean startDragAndDrop;
        startDragAndDrop = view.startDragAndDrop(dragAndDropTransferData.getClipData(), composeDragShadowBuilder, dragAndDropTransferData.getLocalState(), dragAndDropTransferData.getFlags());
        return startDragAndDrop;
    }
}
