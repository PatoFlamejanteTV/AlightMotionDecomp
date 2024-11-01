package androidx.compose.ui.draganddrop;

/* loaded from: classes.dex */
public interface DragAndDropTarget {
    void onChanged(DragAndDropEvent dragAndDropEvent);

    boolean onDrop(DragAndDropEvent dragAndDropEvent);

    void onEnded(DragAndDropEvent dragAndDropEvent);

    void onEntered(DragAndDropEvent dragAndDropEvent);

    void onExited(DragAndDropEvent dragAndDropEvent);

    void onMoved(DragAndDropEvent dragAndDropEvent);

    void onStarted(DragAndDropEvent dragAndDropEvent);
}
