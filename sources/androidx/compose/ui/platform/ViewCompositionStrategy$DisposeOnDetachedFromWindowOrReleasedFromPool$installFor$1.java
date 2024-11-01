package androidx.compose.ui.platform;

import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 $listener;
    final /* synthetic */ PoolingContainerListener $poolingContainerListener;
    final /* synthetic */ AbstractComposeView $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(AbstractComposeView abstractComposeView, ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1, PoolingContainerListener poolingContainerListener) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1;
        this.$poolingContainerListener = poolingContainerListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4475invoke();
        return Q5.I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4475invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
        PoolingContainer.removePoolingContainerListener(this.$view, this.$poolingContainerListener);
    }
}
