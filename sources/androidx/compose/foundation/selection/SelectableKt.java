package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SelectableKt {
    /* renamed from: selectable-O2vRcR0, reason: not valid java name */
    public static final Modifier m799selectableO2vRcR0(Modifier selectable, boolean z8, MutableInteractionSource interactionSource, Indication indication, boolean z9, Role role, Function0 onClick) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(selectable, "$this$selectable");
        AbstractC3292y.i(interactionSource, "interactionSource");
        AbstractC3292y.i(onClick, "onClick");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SelectableKt$selectableO2vRcR0$$inlined$debugInspectorInfo$1(z8, interactionSource, indication, z9, role, onClick);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(selectable, noInspectorInfo, SemanticsModifierKt.semantics$default(ClickableKt.m290clickableO2vRcR0$default(Modifier.Companion, interactionSource, indication, z9, null, role, onClick, 8, null), false, new SelectableKt$selectable$4$1(z8), 1, null));
    }

    /* renamed from: selectable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m800selectableO2vRcR0$default(Modifier modifier, boolean z8, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z9, Role role, Function0 function0, int i8, Object obj) {
        boolean z10;
        if ((i8 & 8) != 0) {
            z10 = true;
        } else {
            z10 = z9;
        }
        if ((i8 & 16) != 0) {
            role = null;
        }
        return m799selectableO2vRcR0(modifier, z8, mutableInteractionSource, indication, z10, role, function0);
    }

    /* renamed from: selectable-XHw0xAI, reason: not valid java name */
    public static final Modifier m801selectableXHw0xAI(Modifier selectable, boolean z8, boolean z9, Role role, Function0 onClick) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(selectable, "$this$selectable");
        AbstractC3292y.i(onClick, "onClick");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SelectableKt$selectableXHw0xAI$$inlined$debugInspectorInfo$1(z8, z9, role, onClick);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(selectable, noInspectorInfo, new SelectableKt$selectable$2(z8, z9, role, onClick));
    }

    /* renamed from: selectable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m802selectableXHw0xAI$default(Modifier modifier, boolean z8, boolean z9, Role role, Function0 function0, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z9 = true;
        }
        if ((i8 & 4) != 0) {
            role = null;
        }
        return m801selectableXHw0xAI(modifier, z8, z9, role, function0);
    }
}
