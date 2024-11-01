package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1 $listener;
    final /* synthetic */ AbstractComposeView $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1(AbstractComposeView abstractComposeView, ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1 viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4476invoke();
        return Q5.I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4476invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
    }
}
