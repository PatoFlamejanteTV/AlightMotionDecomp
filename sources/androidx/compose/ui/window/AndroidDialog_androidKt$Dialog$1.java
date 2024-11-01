package androidx.compose.ui.window;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidDialog_androidKt$Dialog$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ DialogWrapper $dialog;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$1(DialogWrapper dialogWrapper) {
        super(1);
        this.$dialog = dialogWrapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.$dialog.show();
        final DialogWrapper dialogWrapper = this.$dialog;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                DialogWrapper.this.dismiss();
                DialogWrapper.this.disposeComposition();
            }
        };
    }
}
