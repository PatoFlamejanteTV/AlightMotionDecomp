package androidx.compose.ui.viewinterop;

import Q5.I;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidViewHolder$layoutNode$1$4 extends AbstractC3293z implements Function1 {
    final /* synthetic */ AndroidViewHolder $this_run;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$4(AndroidViewHolder androidViewHolder) {
        super(1);
        this.$this_run = androidViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Owner) obj);
        return I.f8786a;
    }

    public final void invoke(Owner owner) {
        AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
        if (androidComposeView != null) {
            androidComposeView.removeAndroidView(this.$this_run);
        }
        this.$this_run.removeAllViewsInLayout();
    }
}
