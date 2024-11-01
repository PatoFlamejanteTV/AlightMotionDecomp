package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityOptionsCompat;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ManagedActivityResultLauncher<I, O> extends ActivityResultLauncher<I> {
    public static final int $stable = 8;
    private final State<ActivityResultContract<I, O>> contract;
    private final ActivityResultLauncherHolder<I> launcher;

    /* JADX WARN: Multi-variable type inference failed */
    public ManagedActivityResultLauncher(ActivityResultLauncherHolder<I> activityResultLauncherHolder, State<? extends ActivityResultContract<I, O>> state) {
        this.launcher = activityResultLauncherHolder;
        this.contract = state;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public ActivityResultContract<I, ?> getContract() {
        return this.contract.getValue();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void launch(I i8, ActivityOptionsCompat activityOptionsCompat) {
        this.launcher.launch(i8, activityOptionsCompat);
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
