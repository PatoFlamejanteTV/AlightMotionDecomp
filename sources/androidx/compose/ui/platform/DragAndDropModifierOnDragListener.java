package androidx.compose.ui.platform;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.ArraySet;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.node.ModifierNodeElement;
import c6.InterfaceC2073o;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DragAndDropModifierOnDragListener implements View.OnDragListener, DragAndDropManager {
    private final InterfaceC2073o startDrag;
    private final DragAndDropNode rootDragAndDropNode = new DragAndDropNode(DragAndDropModifierOnDragListener$rootDragAndDropNode$1.INSTANCE);
    private final ArraySet<DragAndDropModifierNode> interestedNodes = new ArraySet<>(0, 1, null);
    private final Modifier modifier = new ModifierNodeElement<DragAndDropNode>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            DragAndDropNode dragAndDropNode;
            dragAndDropNode = DragAndDropModifierOnDragListener.this.rootDragAndDropNode;
            return dragAndDropNode.hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootDragAndDropNode");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(DragAndDropNode dragAndDropNode) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public DragAndDropNode create() {
            DragAndDropNode dragAndDropNode;
            dragAndDropNode = DragAndDropModifierOnDragListener.this.rootDragAndDropNode;
            return dragAndDropNode;
        }
    };

    public DragAndDropModifierOnDragListener(InterfaceC2073o interfaceC2073o) {
        this.startDrag = interfaceC2073o;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    /* renamed from: drag-12SF9DM */
    public boolean mo2597drag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j8, Function1 function1) {
        return ((Boolean) this.startDrag.invoke(dragAndDropTransferData, Size.m2769boximpl(j8), function1)).booleanValue();
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public boolean isInterestedNode(DragAndDropModifierNode dragAndDropModifierNode) {
        return this.interestedNodes.contains(dragAndDropModifierNode);
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent dragEvent) {
        DragAndDropEvent dragAndDropEvent = new DragAndDropEvent(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean acceptDragAndDropTransfer = this.rootDragAndDropNode.acceptDragAndDropTransfer(dragAndDropEvent);
                Iterator<DragAndDropModifierNode> it = this.interestedNodes.iterator();
                while (it.hasNext()) {
                    it.next().onStarted(dragAndDropEvent);
                }
                return acceptDragAndDropTransfer;
            case 2:
                this.rootDragAndDropNode.onMoved(dragAndDropEvent);
                return false;
            case 3:
                return this.rootDragAndDropNode.onDrop(dragAndDropEvent);
            case 4:
                this.rootDragAndDropNode.onEnded(dragAndDropEvent);
                return false;
            case 5:
                this.rootDragAndDropNode.onEntered(dragAndDropEvent);
                return false;
            case 6:
                this.rootDragAndDropNode.onExited(dragAndDropEvent);
                return false;
            default:
                return false;
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public void registerNodeInterest(DragAndDropModifierNode dragAndDropModifierNode) {
        this.interestedNodes.add(dragAndDropModifierNode);
    }
}
