package androidx.compose.foundation.relocation;

import Q5.I;
import Q5.x;
import U5.d;
import V5.b;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import n6.N;

/* loaded from: classes.dex */
final class BringIntoViewResponderNode extends BringIntoViewChildNode implements BringIntoViewParent {
    private final ModifierLocalMap providedValues;
    private BringIntoViewResponder responder;

    public BringIntoViewResponderNode(BringIntoViewResponder responder) {
        AbstractC3292y.i(responder, "responder");
        this.responder = responder;
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(x.a(BringIntoViewKt.getModifierLocalBringIntoViewParent(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect bringChildIntoView$localRect(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, Function0 function0) {
        Rect rect;
        Rect localRectOf;
        LayoutCoordinates layoutCoordinates2 = bringIntoViewResponderNode.getLayoutCoordinates();
        if (layoutCoordinates2 == null) {
            return null;
        }
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates != null && (rect = (Rect) function0.invoke()) != null) {
            localRectOf = BringIntoViewResponderKt.localRectOf(layoutCoordinates2, layoutCoordinates, rect);
            return localRectOf;
        }
        return null;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    public Object bringChildIntoView(LayoutCoordinates layoutCoordinates, Function0 function0, d dVar) {
        Object e8 = N.e(new BringIntoViewResponderNode$bringChildIntoView$2(this, layoutCoordinates, function0, new BringIntoViewResponderNode$bringChildIntoView$parentRect$1(this, layoutCoordinates, function0), null), dVar);
        if (e8 == b.e()) {
            return e8;
        }
        return I.f8786a;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewChildNode, androidx.compose.ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    public final BringIntoViewResponder getResponder() {
        return this.responder;
    }

    public final void setResponder(BringIntoViewResponder bringIntoViewResponder) {
        AbstractC3292y.i(bringIntoViewResponder, "<set-?>");
        this.responder = bringIntoViewResponder;
    }
}
