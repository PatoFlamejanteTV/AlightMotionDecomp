package androidx.compose.ui.draw;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class DrawWithContentElement extends ModifierNodeElement<DrawWithContentModifier> {
    private final Function1 onDraw;

    public DrawWithContentElement(Function1 function1) {
        this.onDraw = function1;
    }

    public static /* synthetic */ DrawWithContentElement copy$default(DrawWithContentElement drawWithContentElement, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = drawWithContentElement.onDraw;
        }
        return drawWithContentElement.copy(function1);
    }

    public final Function1 component1() {
        return this.onDraw;
    }

    public final DrawWithContentElement copy(Function1 function1) {
        return new DrawWithContentElement(function1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && AbstractC3292y.d(this.onDraw, ((DrawWithContentElement) obj).onDraw);
    }

    public final Function1 getOnDraw() {
        return this.onDraw;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onDraw.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("drawWithContent");
        inspectorInfo.getProperties().set("onDraw", this.onDraw);
    }

    public String toString() {
        return "DrawWithContentElement(onDraw=" + this.onDraw + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DrawWithContentModifier create() {
        return new DrawWithContentModifier(this.onDraw);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DrawWithContentModifier drawWithContentModifier) {
        drawWithContentModifier.setOnDraw(this.onDraw);
    }
}
