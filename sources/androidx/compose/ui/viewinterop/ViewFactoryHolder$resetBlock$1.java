package androidx.compose.ui.viewinterop;

import Q5.I;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ViewFactoryHolder$resetBlock$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ ViewFactoryHolder<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder$resetBlock$1(ViewFactoryHolder<T> viewFactoryHolder) {
        super(0);
        this.this$0 = viewFactoryHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m5405invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5405invoke() {
        View view;
        view = ((ViewFactoryHolder) this.this$0).typedView;
        this.this$0.getResetBlock().invoke(view);
    }
}
