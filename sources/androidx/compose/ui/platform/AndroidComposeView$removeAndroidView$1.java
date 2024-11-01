package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidComposeView$removeAndroidView$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ AndroidViewHolder $view;
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$removeAndroidView$1(AndroidComposeView androidComposeView, AndroidViewHolder androidViewHolder) {
        super(0);
        this.this$0 = androidComposeView;
        this.$view = androidViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4406invoke();
        return Q5.I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4406invoke() {
        this.this$0.getAndroidViewsHandler$ui_release().removeViewInLayout(this.$view);
        HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = this.this$0.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        kotlin.jvm.internal.Z.c(layoutNodeToHolder).remove(this.this$0.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(this.$view));
        ViewCompat.setImportantForAccessibility(this.$view, 0);
    }
}
