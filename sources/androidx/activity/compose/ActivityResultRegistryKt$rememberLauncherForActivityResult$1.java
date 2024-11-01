package androidx.activity.compose;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ActivityResultRegistryKt$rememberLauncherForActivityResult$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ ActivityResultRegistry $activityResultRegistry;
    final /* synthetic */ ActivityResultContract<I, O> $contract;
    final /* synthetic */ State<Function1> $currentOnResult;
    final /* synthetic */ String $key;
    final /* synthetic */ ActivityResultLauncherHolder<I> $realLauncher;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityResultRegistryKt$rememberLauncherForActivityResult$1(ActivityResultLauncherHolder<I> activityResultLauncherHolder, ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract<I, O> activityResultContract, State<? extends Function1> state) {
        super(1);
        this.$realLauncher = activityResultLauncherHolder;
        this.$activityResultRegistry = activityResultRegistry;
        this.$key = str;
        this.$contract = activityResultContract;
        this.$currentOnResult = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(State state, Object obj) {
        ((Function1) state.getValue()).invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        ActivityResultLauncherHolder<I> activityResultLauncherHolder = this.$realLauncher;
        ActivityResultRegistry activityResultRegistry = this.$activityResultRegistry;
        String str = this.$key;
        Object obj = this.$contract;
        final State<Function1> state = this.$currentOnResult;
        activityResultLauncherHolder.setLauncher(activityResultRegistry.register(str, obj, new ActivityResultCallback() { // from class: androidx.activity.compose.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj2) {
                ActivityResultRegistryKt$rememberLauncherForActivityResult$1.invoke$lambda$0(State.this, obj2);
            }
        }));
        final ActivityResultLauncherHolder<I> activityResultLauncherHolder2 = this.$realLauncher;
        return new DisposableEffectResult() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ActivityResultLauncherHolder.this.unregister();
            }
        };
    }
}
