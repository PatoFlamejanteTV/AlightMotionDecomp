package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidComposeView$viewTreeOwners$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$viewTreeOwners$2(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AndroidComposeView.ViewTreeOwners invoke() {
        AndroidComposeView.ViewTreeOwners viewTreeOwners;
        viewTreeOwners = this.this$0.get_viewTreeOwners();
        return viewTreeOwners;
    }
}
