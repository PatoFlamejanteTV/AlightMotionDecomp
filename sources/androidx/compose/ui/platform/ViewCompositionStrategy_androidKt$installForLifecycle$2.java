package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ViewCompositionStrategy_androidKt$installForLifecycle$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ LifecycleEventObserver $observer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy_androidKt$installForLifecycle$2(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        super(0);
        this.$lifecycle = lifecycle;
        this.$observer = lifecycleEventObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4478invoke();
        return Q5.I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4478invoke() {
        this.$lifecycle.removeObserver(this.$observer);
    }
}
