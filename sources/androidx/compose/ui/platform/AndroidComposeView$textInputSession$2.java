package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidComposeView$textInputSession$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$textInputSession$2(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AndroidPlatformTextInputSession invoke(n6.M m8) {
        AndroidComposeView androidComposeView = this.this$0;
        return new AndroidPlatformTextInputSession(androidComposeView, androidComposeView.getTextInputService(), m8);
    }
}
