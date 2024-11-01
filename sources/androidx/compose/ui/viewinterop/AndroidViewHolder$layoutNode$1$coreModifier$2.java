package androidx.compose.ui.viewinterop;

import Q5.I;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidViewHolder$layoutNode$1$coreModifier$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ LayoutNode $layoutNode;
    final /* synthetic */ AndroidViewHolder $this_run;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$coreModifier$2(AndroidViewHolder androidViewHolder, LayoutNode layoutNode, AndroidViewHolder androidViewHolder2) {
        super(1);
        this.$this_run = androidViewHolder;
        this.$layoutNode = layoutNode;
        this.this$0 = androidViewHolder2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f8786a;
    }

    public final void invoke(DrawScope drawScope) {
        AndroidViewHolder androidViewHolder = this.$this_run;
        LayoutNode layoutNode = this.$layoutNode;
        AndroidViewHolder androidViewHolder2 = this.this$0;
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        if (androidViewHolder.getView().getVisibility() != 8) {
            androidViewHolder.isDrawing = true;
            Owner owner$ui_release = layoutNode.getOwner$ui_release();
            AndroidComposeView androidComposeView = owner$ui_release instanceof AndroidComposeView ? (AndroidComposeView) owner$ui_release : null;
            if (androidComposeView != null) {
                androidComposeView.drawAndroidView(androidViewHolder2, AndroidCanvas_androidKt.getNativeCanvas(canvas));
            }
            androidViewHolder.isDrawing = false;
        }
    }
}
