package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidComposeView$onFocusChanged$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ boolean $gainFocus;
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$onFocusChanged$1(boolean z8, AndroidComposeView androidComposeView) {
        super(0);
        this.$gainFocus = z8;
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4405invoke();
        return Q5.I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4405invoke() {
        if (this.$gainFocus) {
            this.this$0.clearFocus();
        } else {
            this.this$0.requestFocus();
        }
    }
}
