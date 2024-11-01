package androidx.leanback.app;

import android.app.Fragment;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class BackgroundFragment extends Fragment {
    private BackgroundManager mBackgroundManager;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BackgroundManager getBackgroundManager() {
        return this.mBackgroundManager;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BackgroundManager backgroundManager = this.mBackgroundManager;
        if (backgroundManager != null) {
            backgroundManager.detach();
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        BackgroundManager backgroundManager = this.mBackgroundManager;
        if (backgroundManager != null) {
            backgroundManager.onResume();
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        BackgroundManager backgroundManager = this.mBackgroundManager;
        if (backgroundManager != null) {
            backgroundManager.onActivityStart();
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        BackgroundManager backgroundManager = this.mBackgroundManager;
        if (backgroundManager != null) {
            backgroundManager.onStop();
        }
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBackgroundManager(BackgroundManager backgroundManager) {
        this.mBackgroundManager = backgroundManager;
    }
}
