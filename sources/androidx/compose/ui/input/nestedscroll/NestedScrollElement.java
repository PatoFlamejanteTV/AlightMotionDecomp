package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NestedScrollElement extends ModifierNodeElement<NestedScrollNode> {
    private final NestedScrollConnection connection;
    private final NestedScrollDispatcher dispatcher;

    public NestedScrollElement(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.dispatcher = nestedScrollDispatcher;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        if (!AbstractC3292y.d(nestedScrollElement.connection, this.connection) || !AbstractC3292y.d(nestedScrollElement.dispatcher, this.dispatcher)) {
            return false;
        }
        return true;
    }

    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i8;
        int hashCode = this.connection.hashCode() * 31;
        NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
        if (nestedScrollDispatcher != null) {
            i8 = nestedScrollDispatcher.hashCode();
        } else {
            i8 = 0;
        }
        return hashCode + i8;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("nestedScroll");
        inspectorInfo.getProperties().set("connection", this.connection);
        inspectorInfo.getProperties().set("dispatcher", this.dispatcher);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public NestedScrollNode create() {
        return new NestedScrollNode(this.connection, this.dispatcher);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(NestedScrollNode nestedScrollNode) {
        nestedScrollNode.updateNode$ui_release(this.connection, this.dispatcher);
    }
}
