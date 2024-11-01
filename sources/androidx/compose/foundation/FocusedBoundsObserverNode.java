package androidx.compose.foundation;

import Q5.I;
import Q5.x;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class FocusedBoundsObserverNode extends Modifier.Node implements ModifierLocalModifierNode, Function1 {
    private Function1 onPositioned;
    private final ModifierLocalMap providedValues;

    public FocusedBoundsObserverNode(Function1 onPositioned) {
        AbstractC3292y.i(onPositioned, "onPositioned");
        this.onPositioned = onPositioned;
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(x.a(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver(), this));
    }

    private final Function1 getParent() {
        if (isAttached()) {
            return (Function1) getCurrent(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        }
        return null;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return androidx.compose.ui.modifier.b.a(this, modifierLocal);
    }

    public final Function1 getOnPositioned() {
        return this.onPositioned;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return I.f8786a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        androidx.compose.ui.modifier.b.c(this, modifierLocal, obj);
    }

    public final void setOnPositioned(Function1 function1) {
        AbstractC3292y.i(function1, "<set-?>");
        this.onPositioned = function1;
    }

    public void invoke(LayoutCoordinates layoutCoordinates) {
        if (isAttached()) {
            this.onPositioned.invoke(layoutCoordinates);
            Function1 parent = getParent();
            if (parent != null) {
                parent.invoke(layoutCoordinates);
            }
        }
    }
}
