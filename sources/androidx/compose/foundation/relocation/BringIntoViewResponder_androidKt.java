package androidx.compose.foundation.relocation;

import Q5.I;
import U5.d;
import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class BringIntoViewResponder_androidKt {
    public static final BringIntoViewParent defaultBringIntoViewParent(final CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        AbstractC3292y.i(compositionLocalConsumerModifierNode, "<this>");
        return new BringIntoViewParent() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponder_androidKt$defaultBringIntoViewParent$1
            @Override // androidx.compose.foundation.relocation.BringIntoViewParent
            public final Object bringChildIntoView(LayoutCoordinates layoutCoordinates, Function0 function0, d dVar) {
                Rect rect;
                android.graphics.Rect rect2;
                View view = (View) CompositionLocalConsumerModifierNodeKt.currentValueOf(CompositionLocalConsumerModifierNode.this, AndroidCompositionLocals_androidKt.getLocalView());
                long positionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
                Rect rect3 = (Rect) function0.invoke();
                if (rect3 != null) {
                    rect = rect3.m2749translatek4lQ0M(positionInRoot);
                } else {
                    rect = null;
                }
                if (rect != null) {
                    rect2 = BringIntoViewResponder_androidKt.toRect(rect);
                    view.requestRectangleOnScreen(rect2, false);
                }
                return I.f8786a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Rect toRect(Rect rect) {
        return new android.graphics.Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }
}
