package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ClickableElement extends ModifierNodeElement<ClickableNode> {
    private final boolean enabled;
    private final MutableInteractionSource interactionSource;
    private final Function0 onClick;
    private final String onClickLabel;
    private final Role role;

    public /* synthetic */ ClickableElement(MutableInteractionSource mutableInteractionSource, boolean z8, String str, Role role, Function0 function0, AbstractC3284p abstractC3284p) {
        this(mutableInteractionSource, z8, str, role, function0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3292y.d(ClickableElement.class, cls)) {
            return false;
        }
        AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.foundation.ClickableElement");
        ClickableElement clickableElement = (ClickableElement) obj;
        if (AbstractC3292y.d(this.interactionSource, clickableElement.interactionSource) && this.enabled == clickableElement.enabled && AbstractC3292y.d(this.onClickLabel, clickableElement.onClickLabel) && AbstractC3292y.d(this.role, clickableElement.role) && AbstractC3292y.d(this.onClick, clickableElement.onClick)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i8;
        int hashCode = ((this.interactionSource.hashCode() * 31) + a.a(this.enabled)) * 31;
        String str = this.onClickLabel;
        int i9 = 0;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        int i10 = (hashCode + i8) * 31;
        Role role = this.role;
        if (role != null) {
            i9 = Role.m4497hashCodeimpl(role.m4499unboximpl());
        }
        return ((i10 + i9) * 31) + this.onClick.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
    }

    public /* synthetic */ ClickableElement(MutableInteractionSource mutableInteractionSource, boolean z8, String str, Role role, Function0 function0, int i8, AbstractC3284p abstractC3284p) {
        this(mutableInteractionSource, z8, str, (i8 & 8) != 0 ? null : role, function0, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ClickableNode create() {
        return new ClickableNode(this.interactionSource, this.enabled, this.onClickLabel, this.role, this.onClick, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ClickableNode node) {
        AbstractC3292y.i(node, "node");
        node.m301updateXHw0xAI(this.interactionSource, this.enabled, this.onClickLabel, this.role, this.onClick);
    }

    private ClickableElement(MutableInteractionSource interactionSource, boolean z8, String str, Role role, Function0 onClick) {
        AbstractC3292y.i(interactionSource, "interactionSource");
        AbstractC3292y.i(onClick, "onClick");
        this.interactionSource = interactionSource;
        this.enabled = z8;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = onClick;
    }
}
