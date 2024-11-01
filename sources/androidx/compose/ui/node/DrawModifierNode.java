package androidx.compose.ui.node;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;

/* loaded from: classes.dex */
public interface DrawModifierNode extends DelegatableNode {
    void draw(ContentDrawScope contentDrawScope);

    void onMeasureResultChanged();
}
