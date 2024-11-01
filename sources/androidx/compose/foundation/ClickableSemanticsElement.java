package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class ClickableSemanticsElement extends ModifierNodeElement<ClickableSemanticsNode> {
    private final boolean enabled;
    private final Function0 onClick;
    private final String onClickLabel;
    private final Function0 onLongClick;
    private final String onLongClickLabel;
    private final Role role;

    public /* synthetic */ ClickableSemanticsElement(boolean z8, Role role, String str, Function0 function0, String str2, Function0 function02, AbstractC3284p abstractC3284p) {
        this(z8, role, str, function0, str2, function02);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSemanticsElement)) {
            return false;
        }
        ClickableSemanticsElement clickableSemanticsElement = (ClickableSemanticsElement) obj;
        if (this.enabled == clickableSemanticsElement.enabled && AbstractC3292y.d(this.role, clickableSemanticsElement.role) && AbstractC3292y.d(this.onLongClickLabel, clickableSemanticsElement.onLongClickLabel) && AbstractC3292y.d(this.onLongClick, clickableSemanticsElement.onLongClick) && AbstractC3292y.d(this.onClickLabel, clickableSemanticsElement.onClickLabel) && AbstractC3292y.d(this.onClick, clickableSemanticsElement.onClick)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i8;
        int i9;
        int i10;
        int a9 = a.a(this.enabled) * 31;
        Role role = this.role;
        int i11 = 0;
        if (role != null) {
            i8 = role.hashCode();
        } else {
            i8 = 0;
        }
        int i12 = (a9 + i8) * 31;
        String str = this.onLongClickLabel;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = (i12 + i9) * 31;
        Function0 function0 = this.onLongClick;
        if (function0 != null) {
            i10 = function0.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        String str2 = this.onClickLabel;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((i14 + i11) * 31) + this.onClick.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
    }

    private ClickableSemanticsElement(boolean z8, Role role, String str, Function0 function0, String str2, Function0 onClick) {
        AbstractC3292y.i(onClick, "onClick");
        this.enabled = z8;
        this.role = role;
        this.onLongClickLabel = str;
        this.onLongClick = function0;
        this.onClickLabel = str2;
        this.onClick = onClick;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ClickableSemanticsNode create() {
        return new ClickableSemanticsNode(this.enabled, this.onClickLabel, this.role, this.onClick, this.onLongClickLabel, this.onLongClick, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ClickableSemanticsNode node) {
        AbstractC3292y.i(node, "node");
        node.m304updateUMe6uN4(this.enabled, this.onClickLabel, this.role, this.onClick, this.onLongClickLabel, this.onLongClick);
    }
}
