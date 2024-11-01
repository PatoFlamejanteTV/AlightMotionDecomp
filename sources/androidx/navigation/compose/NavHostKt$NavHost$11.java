package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavHostController;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class NavHostKt$NavHost$11 extends AbstractC3293z implements Function1 {
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ NavHostController $navController;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$11(NavHostController navHostController, LifecycleOwner lifecycleOwner) {
        super(1);
        this.$navController = navHostController;
        this.$lifecycleOwner = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.$navController.setLifecycleOwner(this.$lifecycleOwner);
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$11$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }
}
