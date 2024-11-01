package androidx.navigation.compose;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavBackStackEntry;
import c6.InterfaceC2072n;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DialogHostKt$PopulateVisibleList$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Collection<NavBackStackEntry> $backStack;
    final /* synthetic */ List<NavBackStackEntry> $this_PopulateVisibleList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$PopulateVisibleList$2(List<NavBackStackEntry> list, Collection<NavBackStackEntry> collection, int i8) {
        super(2);
        this.$this_PopulateVisibleList = list;
        this.$backStack = collection;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        DialogHostKt.PopulateVisibleList(this.$this_PopulateVisibleList, this.$backStack, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
