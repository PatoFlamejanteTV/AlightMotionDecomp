package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ToggleableKt {
    /* renamed from: toggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m803toggleableO2vRcR0(Modifier toggleable, boolean z8, MutableInteractionSource interactionSource, Indication indication, boolean z9, Role role, Function1 onValueChange) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(toggleable, "$this$toggleable");
        AbstractC3292y.i(interactionSource, "interactionSource");
        AbstractC3292y.i(onValueChange, "onValueChange");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ToggleableKt$toggleableO2vRcR0$$inlined$debugInspectorInfo$1(z8, interactionSource, indication, z9, role, onValueChange);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(toggleable, noInspectorInfo, m807triStateToggleableO2vRcR0(Modifier.Companion, ToggleableStateKt.ToggleableState(z8), interactionSource, indication, z9, role, new ToggleableKt$toggleable$4$1(onValueChange, z8)));
    }

    /* renamed from: toggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m804toggleableO2vRcR0$default(Modifier modifier, boolean z8, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z9, Role role, Function1 function1, int i8, Object obj) {
        boolean z10;
        if ((i8 & 8) != 0) {
            z10 = true;
        } else {
            z10 = z9;
        }
        if ((i8 & 16) != 0) {
            role = null;
        }
        return m803toggleableO2vRcR0(modifier, z8, mutableInteractionSource, indication, z10, role, function1);
    }

    /* renamed from: toggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m805toggleableXHw0xAI(Modifier toggleable, boolean z8, boolean z9, Role role, Function1 onValueChange) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(toggleable, "$this$toggleable");
        AbstractC3292y.i(onValueChange, "onValueChange");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ToggleableKt$toggleableXHw0xAI$$inlined$debugInspectorInfo$1(z8, z9, role, onValueChange);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(toggleable, noInspectorInfo, new ToggleableKt$toggleable$2(z8, z9, role, onValueChange));
    }

    /* renamed from: toggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m806toggleableXHw0xAI$default(Modifier modifier, boolean z8, boolean z9, Role role, Function1 function1, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z9 = true;
        }
        if ((i8 & 4) != 0) {
            role = null;
        }
        return m805toggleableXHw0xAI(modifier, z8, z9, role, function1);
    }

    /* renamed from: triStateToggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m807triStateToggleableO2vRcR0(Modifier triStateToggleable, ToggleableState state, MutableInteractionSource interactionSource, Indication indication, boolean z8, Role role, Function0 onClick) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(triStateToggleable, "$this$triStateToggleable");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(interactionSource, "interactionSource");
        AbstractC3292y.i(onClick, "onClick");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ToggleableKt$triStateToggleableO2vRcR0$$inlined$debugInspectorInfo$1(state, z8, role, interactionSource, indication, onClick);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(triStateToggleable, noInspectorInfo, SemanticsModifierKt.semantics$default(ClickableKt.m290clickableO2vRcR0$default(Modifier.Companion, interactionSource, indication, z8, null, role, onClick, 8, null), false, new ToggleableKt$triStateToggleable$4$1(state), 1, null));
    }

    /* renamed from: triStateToggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m808triStateToggleableO2vRcR0$default(Modifier modifier, ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z8, Role role, Function0 function0, int i8, Object obj) {
        boolean z9;
        if ((i8 & 8) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if ((i8 & 16) != 0) {
            role = null;
        }
        return m807triStateToggleableO2vRcR0(modifier, toggleableState, mutableInteractionSource, indication, z9, role, function0);
    }

    /* renamed from: triStateToggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m809triStateToggleableXHw0xAI(Modifier triStateToggleable, ToggleableState state, boolean z8, Role role, Function0 onClick) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(triStateToggleable, "$this$triStateToggleable");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(onClick, "onClick");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ToggleableKt$triStateToggleableXHw0xAI$$inlined$debugInspectorInfo$1(state, z8, role, onClick);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(triStateToggleable, noInspectorInfo, new ToggleableKt$triStateToggleable$2(state, z8, role, onClick));
    }

    /* renamed from: triStateToggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m810triStateToggleableXHw0xAI$default(Modifier modifier, ToggleableState toggleableState, boolean z8, Role role, Function0 function0, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        if ((i8 & 4) != 0) {
            role = null;
        }
        return m809triStateToggleableXHw0xAI(modifier, toggleableState, z8, role, function0);
    }
}
