package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
final class DrawWithContentModifier extends Modifier.Node implements DrawModifierNode {
    private Function1 onDraw;

    public DrawWithContentModifier(Function1 function1) {
        this.onDraw = function1;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        this.onDraw.invoke(contentDrawScope);
    }

    public final Function1 getOnDraw() {
        return this.onDraw;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        androidx.compose.ui.node.b.a(this);
    }

    public final void setOnDraw(Function1 function1) {
        this.onDraw = function1;
    }
}
