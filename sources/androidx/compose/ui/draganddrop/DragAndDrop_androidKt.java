package androidx.compose.ui.draganddrop;

import R5.a0;
import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.Set;

/* loaded from: classes.dex */
public final class DragAndDrop_androidKt {
    public static final long getPositionInRoot(DragAndDropEvent dragAndDropEvent) {
        return OffsetKt.Offset(dragAndDropEvent.getDragEvent$ui_release().getX(), dragAndDropEvent.getDragEvent$ui_release().getY());
    }

    public static final Set<String> mimeTypes(DragAndDropEvent dragAndDropEvent) {
        ClipDescription clipDescription = dragAndDropEvent.getDragEvent$ui_release().getClipDescription();
        if (clipDescription == null) {
            return a0.f();
        }
        Set c8 = a0.c(clipDescription.getMimeTypeCount());
        int mimeTypeCount = clipDescription.getMimeTypeCount();
        for (int i8 = 0; i8 < mimeTypeCount; i8++) {
            c8.add(clipDescription.getMimeType(i8));
        }
        return a0.a(c8);
    }

    public static final DragEvent toAndroidDragEvent(DragAndDropEvent dragAndDropEvent) {
        return dragAndDropEvent.getDragEvent$ui_release();
    }
}
