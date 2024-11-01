package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class NavHostKt$NavHost$16$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ State<List<NavBackStackEntry>> $visibleEntries$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$16$1(State<? extends List<NavBackStackEntry>> state, ComposeNavigator composeNavigator) {
        super(1);
        this.$visibleEntries$delegate = state;
        this.$composeNavigator = composeNavigator;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final State<List<NavBackStackEntry>> state = this.$visibleEntries$delegate;
        final ComposeNavigator composeNavigator = this.$composeNavigator;
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$16$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Iterator it = NavHostKt.access$NavHost$lambda$6(State.this).iterator();
                while (it.hasNext()) {
                    composeNavigator.onTransitionComplete((NavBackStackEntry) it.next());
                }
            }
        };
    }
}
