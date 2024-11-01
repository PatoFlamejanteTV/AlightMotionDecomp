package androidx.navigation;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavBackStackEntry$savedStateHandle$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ NavBackStackEntry this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBackStackEntry$savedStateHandle$2(NavBackStackEntry navBackStackEntry) {
        super(0);
        this.this$0 = navBackStackEntry;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SavedStateHandle invoke() {
        boolean z8;
        z8 = this.this$0.savedStateRegistryAttached;
        if (z8) {
            if (this.this$0.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                NavBackStackEntry navBackStackEntry = this.this$0;
                return ((NavBackStackEntry.SavedStateViewModel) new ViewModelProvider(navBackStackEntry, new NavBackStackEntry.NavResultSavedStateFactory(navBackStackEntry)).get(NavBackStackEntry.SavedStateViewModel.class)).getHandle();
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }
}
