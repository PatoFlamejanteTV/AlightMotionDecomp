package androidx.compose.foundation;

import Q5.I;
import U5.d;
import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CombinedClickablePointerInputNode extends AbstractClickablePointerInputNode {
    private Function0 onDoubleClick;
    private Function0 onLongClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickablePointerInputNode(boolean z8, MutableInteractionSource interactionSource, Function0 onClick, AbstractClickableNode.InteractionData interactionData, Function0 function0, Function0 function02) {
        super(z8, interactionSource, onClick, interactionData, null);
        AbstractC3292y.i(interactionSource, "interactionSource");
        AbstractC3292y.i(onClick, "onClick");
        AbstractC3292y.i(interactionData, "interactionData");
        this.onLongClick = function0;
        this.onDoubleClick = function02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.foundation.AbstractClickablePointerInputNode
    public Object pointerInput(PointerInputScope pointerInputScope, d dVar) {
        CombinedClickablePointerInputNode$pointerInput$2 combinedClickablePointerInputNode$pointerInput$2;
        CombinedClickablePointerInputNode$pointerInput$3 combinedClickablePointerInputNode$pointerInput$3;
        AbstractClickableNode.InteractionData interactionData = getInteractionData();
        long m5327getCenterozmzZPI = IntSizeKt.m5327getCenterozmzZPI(pointerInputScope.mo4019getSizeYbymL2g());
        interactionData.m246setCentreOffsetk4lQ0M(OffsetKt.Offset(IntOffset.m5279getXimpl(m5327getCenterozmzZPI), IntOffset.m5280getYimpl(m5327getCenterozmzZPI)));
        if (getEnabled() && this.onDoubleClick != null) {
            combinedClickablePointerInputNode$pointerInput$2 = new CombinedClickablePointerInputNode$pointerInput$2(this);
        } else {
            combinedClickablePointerInputNode$pointerInput$2 = null;
        }
        if (getEnabled() && this.onLongClick != null) {
            combinedClickablePointerInputNode$pointerInput$3 = new CombinedClickablePointerInputNode$pointerInput$3(this);
        } else {
            combinedClickablePointerInputNode$pointerInput$3 = null;
        }
        Object detectTapGestures = TapGestureDetectorKt.detectTapGestures(pointerInputScope, combinedClickablePointerInputNode$pointerInput$2, combinedClickablePointerInputNode$pointerInput$3, new CombinedClickablePointerInputNode$pointerInput$4(this, null), new CombinedClickablePointerInputNode$pointerInput$5(this), dVar);
        if (detectTapGestures == V5.b.e()) {
            return detectTapGestures;
        }
        return I.f8786a;
    }

    public final void update(boolean z8, MutableInteractionSource interactionSource, Function0 onClick, Function0 function0, Function0 function02) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        AbstractC3292y.i(interactionSource, "interactionSource");
        AbstractC3292y.i(onClick, "onClick");
        setOnClick(onClick);
        setInteractionSource(interactionSource);
        boolean z13 = true;
        boolean z14 = false;
        if (getEnabled() != z8) {
            setEnabled(z8);
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.onLongClick == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (function0 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            z9 = true;
        }
        this.onLongClick = function0;
        if (this.onDoubleClick == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (function02 == null) {
            z14 = true;
        }
        if (z12 == z14) {
            z13 = z9;
        }
        this.onDoubleClick = function02;
        if (z13) {
            resetPointerInputHandler();
        }
    }
}
