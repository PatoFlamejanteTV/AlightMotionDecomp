package androidx.activity.result;

import Q5.I;
import Q5.InterfaceC1416k;
import Q5.l;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;

/* loaded from: classes.dex */
public final class ActivityResultCallerLauncher<I, O> extends ActivityResultLauncher<I> {
    private final ActivityResultContract<I, O> callerContract;
    private final I callerInput;
    private final ActivityResultLauncher<I> launcher;
    private final InterfaceC1416k resultContract$delegate = l.b(new ActivityResultCallerLauncher$resultContract$2(this));

    public ActivityResultCallerLauncher(ActivityResultLauncher<I> activityResultLauncher, ActivityResultContract<I, O> activityResultContract, I i8) {
        this.launcher = activityResultLauncher;
        this.callerContract = activityResultContract;
        this.callerInput = i8;
    }

    public final ActivityResultContract<I, O> getCallerContract() {
        return this.callerContract;
    }

    public final I getCallerInput() {
        return this.callerInput;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public ActivityResultContract<I, ?> getContract() {
        return getResultContract();
    }

    public final ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    public final ActivityResultContract<I, O> getResultContract() {
        return (ActivityResultContract) this.resultContract$delegate.getValue();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
        this.launcher.unregister();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void launch(I i8, ActivityOptionsCompat activityOptionsCompat) {
        this.launcher.launch(this.callerInput, activityOptionsCompat);
    }
}
