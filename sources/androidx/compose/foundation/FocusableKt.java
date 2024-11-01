package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectableModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class FocusableKt {
    private static final FocusableKt$FocusableInNonTouchModeElement$1 FocusableInNonTouchModeElement;
    private static final InspectableModifier focusGroupInspectorInfo;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        Function1 noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new FocusableKt$special$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        focusGroupInspectorInfo = new InspectableModifier(noInspectorInfo);
        FocusableInNonTouchModeElement = new ModifierNodeElement<FocusableInNonTouchMode>() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public boolean equals(Object obj) {
                return this == obj;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void inspectableProperties(InspectorInfo inspectorInfo) {
                AbstractC3292y.i(inspectorInfo, "<this>");
                inspectorInfo.setName("focusableInNonTouchMode");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void update(FocusableInNonTouchMode node) {
                AbstractC3292y.i(node, "node");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public FocusableInNonTouchMode create() {
                return new FocusableInNonTouchMode();
            }
        };
    }

    @ExperimentalFoundationApi
    public static final Modifier focusGroup(Modifier modifier) {
        AbstractC3292y.i(modifier, "<this>");
        return FocusModifierKt.focusTarget(FocusPropertiesKt.focusProperties(modifier.then(focusGroupInspectorInfo), FocusableKt$focusGroup$1.INSTANCE));
    }

    public static final Modifier focusable(Modifier modifier, boolean z8, MutableInteractionSource mutableInteractionSource) {
        Modifier modifier2;
        AbstractC3292y.i(modifier, "<this>");
        if (z8) {
            modifier2 = FocusModifierKt.focusTarget(new FocusableElement(mutableInteractionSource));
        } else {
            modifier2 = Modifier.Companion;
        }
        return modifier.then(modifier2);
    }

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z8, MutableInteractionSource mutableInteractionSource, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        if ((i8 & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z8, mutableInteractionSource);
    }

    public static final Modifier focusableInNonTouchMode(Modifier modifier, boolean z8, MutableInteractionSource mutableInteractionSource) {
        AbstractC3292y.i(modifier, "<this>");
        return InspectableValueKt.inspectableWrapper(modifier, new FocusableKt$focusableInNonTouchMode$1(z8, mutableInteractionSource), focusable(Modifier.Companion.then(FocusableInNonTouchModeElement), z8, mutableInteractionSource));
    }
}
