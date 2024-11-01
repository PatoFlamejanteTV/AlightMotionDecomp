package androidx.compose.ui.layout;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SubcomposeLayoutKt$SubcomposeLayout$4 extends AbstractC3293z implements Function0 {
    final /* synthetic */ SubcomposeLayoutState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutKt$SubcomposeLayout$4(SubcomposeLayoutState subcomposeLayoutState) {
        super(0);
        this.$state = subcomposeLayoutState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4182invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4182invoke() {
        this.$state.forceRecomposeChildren$ui_release();
    }
}
