package androidx.activity.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PredictiveBackHandlerKt$PredictiveBackHandler$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 $backCallBack;
    final /* synthetic */ OnBackPressedDispatcher $backDispatcher;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredictiveBackHandlerKt$PredictiveBackHandler$2(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1) {
        super(1);
        this.$backDispatcher = onBackPressedDispatcher;
        this.$lifecycleOwner = lifecycleOwner;
        this.$backCallBack = predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.$backDispatcher.addCallback(this.$lifecycleOwner, this.$backCallBack);
        final PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 = this.$backCallBack;
        return new DisposableEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$2$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                remove();
            }
        };
    }
}
