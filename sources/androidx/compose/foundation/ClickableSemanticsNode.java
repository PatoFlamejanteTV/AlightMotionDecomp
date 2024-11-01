package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.h;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class ClickableSemanticsNode extends Modifier.Node implements SemanticsModifierNode {
    private boolean enabled;
    private Function0 onClick;
    private String onClickLabel;
    private Function0 onLongClick;
    private String onLongClickLabel;
    private Role role;

    public /* synthetic */ ClickableSemanticsNode(boolean z8, String str, Role role, Function0 function0, String str2, Function0 function02, AbstractC3284p abstractC3284p) {
        this(z8, str, role, function0, str2, function02);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        AbstractC3292y.i(semanticsPropertyReceiver, "<this>");
        Role role = this.role;
        if (role != null) {
            AbstractC3292y.f(role);
            SemanticsPropertiesKt.m4516setRolekuIjeqM(semanticsPropertyReceiver, role.m4499unboximpl());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.onClickLabel, new ClickableSemanticsNode$applySemantics$1(this));
        if (this.onLongClick != null) {
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.onLongClickLabel, new ClickableSemanticsNode$applySemantics$2(this));
        }
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return h.a(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    /* renamed from: update-UMe6uN4, reason: not valid java name */
    public final void m304updateUMe6uN4(boolean z8, String str, Role role, Function0 onClick, String str2, Function0 function0) {
        AbstractC3292y.i(onClick, "onClick");
        this.enabled = z8;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = onClick;
        this.onLongClickLabel = str2;
        this.onLongClick = function0;
    }

    private ClickableSemanticsNode(boolean z8, String str, Role role, Function0 onClick, String str2, Function0 function0) {
        AbstractC3292y.i(onClick, "onClick");
        this.enabled = z8;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = onClick;
        this.onLongClickLabel = str2;
        this.onLongClick = function0;
    }
}
