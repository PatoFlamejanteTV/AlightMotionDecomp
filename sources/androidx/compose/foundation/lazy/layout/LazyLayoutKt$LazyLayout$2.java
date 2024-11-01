package androidx.compose.foundation.lazy.layout;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyLayoutKt$LazyLayout$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ LazyLayoutItemProvider $itemProvider;
    final /* synthetic */ InterfaceC2072n $measurePolicy;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ LazyLayoutPrefetchState $prefetchState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$2(LazyLayoutItemProvider lazyLayoutItemProvider, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, InterfaceC2072n interfaceC2072n, int i8, int i9) {
        super(2);
        this.$itemProvider = lazyLayoutItemProvider;
        this.$modifier = modifier;
        this.$prefetchState = lazyLayoutPrefetchState;
        this.$measurePolicy = interfaceC2072n;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        LazyLayoutKt.LazyLayout(this.$itemProvider, this.$modifier, this.$prefetchState, this.$measurePolicy, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
