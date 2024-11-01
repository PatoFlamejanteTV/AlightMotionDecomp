package androidx.compose.foundation;

import Q5.I;
import U5.d;
import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
abstract class AbstractClickablePointerInputNode extends DelegatingNode implements ModifierLocalModifierNode, CompositionLocalConsumerModifierNode, PointerInputModifierNode {
    private final Function0 delayPressInteraction;
    private boolean enabled;
    private final AbstractClickableNode.InteractionData interactionData;
    private MutableInteractionSource interactionSource;
    private Function0 onClick;
    private final SuspendingPointerInputModifierNode pointerInputNode;

    public /* synthetic */ AbstractClickablePointerInputNode(boolean z8, MutableInteractionSource mutableInteractionSource, Function0 function0, AbstractClickableNode.InteractionData interactionData, AbstractC3284p abstractC3284p) {
        this(z8, mutableInteractionSource, function0, interactionData);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return androidx.compose.ui.modifier.b.a(this, modifierLocal);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractClickableNode.InteractionData getInteractionData() {
        return this.interactionData;
    }

    protected final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Function0 getOnClick() {
        return this.onClick;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ ModifierLocalMap getProvidedValues() {
        return androidx.compose.ui.modifier.b.b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: handlePressInteraction-d-4ec7I, reason: not valid java name */
    public final Object m247handlePressInteractiond4ec7I(PressGestureScope pressGestureScope, long j8, d dVar) {
        Object m288access$handlePressInteractionEPk0efs;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (m288access$handlePressInteractionEPk0efs = ClickableKt.m288access$handlePressInteractionEPk0efs(pressGestureScope, j8, mutableInteractionSource, this.interactionData, this.delayPressInteraction, dVar)) == V5.b.e()) {
            return m288access$handlePressInteractionEPk0efs;
        }
        return I.f8786a;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return f.a(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        f.b(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo242onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long j8) {
        AbstractC3292y.i(pointerEvent, "pointerEvent");
        AbstractC3292y.i(pass, "pass");
        this.pointerInputNode.mo242onPointerEventH0pRuoY(pointerEvent, pass, j8);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        f.c(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object pointerInput(PointerInputScope pointerInputScope, d dVar);

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        androidx.compose.ui.modifier.b.c(this, modifierLocal, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void resetPointerInputHandler() {
        this.pointerInputNode.resetPointerInputHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setEnabled(boolean z8) {
        this.enabled = z8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setInteractionSource(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setOnClick(Function0 function0) {
        AbstractC3292y.i(function0, "<set-?>");
        this.onClick = function0;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return f.d(this);
    }

    private AbstractClickablePointerInputNode(boolean z8, MutableInteractionSource mutableInteractionSource, Function0 function0, AbstractClickableNode.InteractionData interactionData) {
        this.enabled = z8;
        this.interactionSource = mutableInteractionSource;
        this.onClick = function0;
        this.interactionData = interactionData;
        this.delayPressInteraction = new AbstractClickablePointerInputNode$delayPressInteraction$1(this);
        this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AbstractClickablePointerInputNode$pointerInputNode$1(this, null)));
    }
}
