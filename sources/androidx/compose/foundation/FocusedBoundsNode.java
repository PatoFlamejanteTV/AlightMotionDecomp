package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class FocusedBoundsNode extends Modifier.Node implements ModifierLocalModifierNode, GlobalPositionAwareModifierNode {
    private boolean isFocused;
    private LayoutCoordinates layoutCoordinates;

    private final Function1 getObserver() {
        if (isAttached()) {
            return (Function1) getCurrent(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        }
        return null;
    }

    private final void notifyObserverWhenAttached() {
        Function1 observer;
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        if (layoutCoordinates != null) {
            AbstractC3292y.f(layoutCoordinates);
            if (layoutCoordinates.isAttached() && (observer = getObserver()) != null) {
                observer.invoke(this.layoutCoordinates);
            }
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return androidx.compose.ui.modifier.b.a(this, modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ ModifierLocalMap getProvidedValues() {
        return androidx.compose.ui.modifier.b.b(this);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        AbstractC3292y.i(coordinates, "coordinates");
        this.layoutCoordinates = coordinates;
        if (!this.isFocused) {
            return;
        }
        if (coordinates.isAttached()) {
            notifyObserverWhenAttached();
            return;
        }
        Function1 observer = getObserver();
        if (observer != null) {
            observer.invoke(null);
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        androidx.compose.ui.modifier.b.c(this, modifierLocal, obj);
    }

    public final void setFocus(boolean z8) {
        if (z8 == this.isFocused) {
            return;
        }
        if (!z8) {
            Function1 observer = getObserver();
            if (observer != null) {
                observer.invoke(null);
            }
        } else {
            notifyObserverWhenAttached();
        }
        this.isFocused = z8;
    }
}
