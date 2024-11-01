package androidx.compose.ui.draw;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DrawBehindElement extends ModifierNodeElement<DrawBackgroundModifier> {
    private final Function1 onDraw;

    public DrawBehindElement(Function1 function1) {
        this.onDraw = function1;
    }

    public static /* synthetic */ DrawBehindElement copy$default(DrawBehindElement drawBehindElement, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = drawBehindElement.onDraw;
        }
        return drawBehindElement.copy(function1);
    }

    public final Function1 component1() {
        return this.onDraw;
    }

    public final DrawBehindElement copy(Function1 function1) {
        return new DrawBehindElement(function1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && AbstractC3292y.d(this.onDraw, ((DrawBehindElement) obj).onDraw);
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
        inspectorInfo.setName("drawBehind");
        inspectorInfo.getProperties().set("onDraw", this.onDraw);
    }

    public String toString() {
        return "DrawBehindElement(onDraw=" + this.onDraw + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DrawBackgroundModifier create() {
        return new DrawBackgroundModifier(this.onDraw);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DrawBackgroundModifier drawBackgroundModifier) {
        drawBackgroundModifier.setOnDraw(this.onDraw);
    }
}
