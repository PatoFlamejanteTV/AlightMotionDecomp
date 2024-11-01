package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DragAndDropEvent {
    public static final int $stable = 8;
    private final DragEvent dragEvent;

    public DragAndDropEvent(DragEvent dragEvent) {
        this.dragEvent = dragEvent;
    }

    public final DragEvent getDragEvent$ui_release() {
        return this.dragEvent;
    }
}
