package androidx.navigation.compose;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavBackStackEntryProviderKt$SaveableStateProvider$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ SaveableStateHolder $this_SaveableStateProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBackStackEntryProviderKt$SaveableStateProvider$1(SaveableStateHolder saveableStateHolder, InterfaceC2072n interfaceC2072n, int i8) {
        super(2);
        this.$this_SaveableStateProvider = saveableStateHolder;
        this.$content = interfaceC2072n;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        NavBackStackEntryProviderKt.SaveableStateProvider(this.$this_SaveableStateProvider, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
