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
public final class CombinedClickableElement extends ModifierNodeElement<CombinedClickableNode> {
    private final boolean enabled;
    private final MutableInteractionSource interactionSource;
    private final Function0 onClick;
    private final String onClickLabel;
    private final Function0 onDoubleClick;
    private final Function0 onLongClick;
    private final String onLongClickLabel;
    private final Role role;

    public /* synthetic */ CombinedClickableElement(MutableInteractionSource mutableInteractionSource, boolean z8, String str, Role role, Function0 function0, String str2, Function0 function02, Function0 function03, AbstractC3284p abstractC3284p) {
        this(mutableInteractionSource, z8, str, role, function0, str2, function02, function03);
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
        if (!AbstractC3292y.d(CombinedClickableElement.class, cls)) {
            return false;
        }
        AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.foundation.CombinedClickableElement");
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        if (AbstractC3292y.d(this.interactionSource, combinedClickableElement.interactionSource) && this.enabled == combinedClickableElement.enabled && AbstractC3292y.d(this.onClickLabel, combinedClickableElement.onClickLabel) && AbstractC3292y.d(this.role, combinedClickableElement.role) && AbstractC3292y.d(this.onClick, combinedClickableElement.onClick) && AbstractC3292y.d(this.onLongClickLabel, combinedClickableElement.onLongClickLabel) && AbstractC3292y.d(this.onLongClick, combinedClickableElement.onLongClick) && AbstractC3292y.d(this.onDoubleClick, combinedClickableElement.onDoubleClick)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i8;
        int i9;
        int i10;
        int i11;
        int hashCode = ((this.interactionSource.hashCode() * 31) + a.a(this.enabled)) * 31;
        String str = this.onClickLabel;
        int i12 = 0;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        int i13 = (hashCode + i8) * 31;
        Role role = this.role;
        if (role != null) {
            i9 = Role.m4497hashCodeimpl(role.m4499unboximpl());
        } else {
            i9 = 0;
        }
        int hashCode2 = (((i13 + i9) * 31) + this.onClick.hashCode()) * 31;
        String str2 = this.onLongClickLabel;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (hashCode2 + i10) * 31;
        Function0 function0 = this.onLongClick;
        if (function0 != null) {
            i11 = function0.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        Function0 function02 = this.onDoubleClick;
        if (function02 != null) {
            i12 = function02.hashCode();
        }
        return i15 + i12;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
    }

    public /* synthetic */ CombinedClickableElement(MutableInteractionSource mutableInteractionSource, boolean z8, String str, Role role, Function0 function0, String str2, Function0 function02, Function0 function03, int i8, AbstractC3284p abstractC3284p) {
        this(mutableInteractionSource, z8, str, (i8 & 8) != 0 ? null : role, function0, str2, function02, function03, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public CombinedClickableNode create() {
        return new CombinedClickableNode(this.interactionSource, this.enabled, this.onClickLabel, this.role, this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(CombinedClickableNode node) {
        AbstractC3292y.i(node, "node");
        node.m309updatecJG_KMw(this.interactionSource, this.enabled, this.onClickLabel, this.role, this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick);
    }

    private CombinedClickableElement(MutableInteractionSource interactionSource, boolean z8, String str, Role role, Function0 onClick, String str2, Function0 function0, Function0 function02) {
        AbstractC3292y.i(interactionSource, "interactionSource");
        AbstractC3292y.i(onClick, "onClick");
        this.interactionSource = interactionSource;
        this.enabled = z8;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = onClick;
        this.onLongClickLabel = str2;
        this.onLongClick = function0;
        this.onDoubleClick = function02;
    }
}
