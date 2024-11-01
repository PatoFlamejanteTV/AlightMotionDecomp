package androidx.activity.compose;

import Q5.I;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;

/* loaded from: classes.dex */
public final class ActivityResultLauncherHolder<I> {
    private ActivityResultLauncher<I> launcher;

    public final ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    public final void launch(I i8, ActivityOptionsCompat activityOptionsCompat) {
        I i9;
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(i8, activityOptionsCompat);
            i9 = I.f8786a;
        } else {
            i9 = null;
        }
        if (i9 != null) {
        } else {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }

    public final void setLauncher(ActivityResultLauncher<I> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public final void unregister() {
        I i8;
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            i8 = I.f8786a;
        } else {
            i8 = null;
        }
        if (i8 != null) {
        } else {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }
}
