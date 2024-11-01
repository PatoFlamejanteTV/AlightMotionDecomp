package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class DialogHostKt$PopulateVisibleList$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ NavBackStackEntry $entry;
    final /* synthetic */ boolean $isInspecting;
    final /* synthetic */ List<NavBackStackEntry> $this_PopulateVisibleList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$PopulateVisibleList$1$1(NavBackStackEntry navBackStackEntry, boolean z8, List<NavBackStackEntry> list) {
        super(1);
        this.$entry = navBackStackEntry;
        this.$isInspecting = z8;
        this.$this_PopulateVisibleList = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final boolean z8 = this.$isInspecting;
        final List<NavBackStackEntry> list = this.$this_PopulateVisibleList;
        final NavBackStackEntry navBackStackEntry = this.$entry;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$1$1$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (z8 && !list.contains(navBackStackEntry)) {
                    list.add(navBackStackEntry);
                }
                if (event == Lifecycle.Event.ON_START && !list.contains(navBackStackEntry)) {
                    list.add(navBackStackEntry);
                }
                if (event == Lifecycle.Event.ON_STOP) {
                    list.remove(navBackStackEntry);
                }
            }
        };
        this.$entry.getLifecycle().addObserver(lifecycleEventObserver);
        final NavBackStackEntry navBackStackEntry2 = this.$entry;
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                NavBackStackEntry.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }
}
