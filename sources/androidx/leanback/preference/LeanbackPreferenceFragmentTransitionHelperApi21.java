package androidx.leanback.preference;

import android.app.Fragment;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.GravityCompat;
import androidx.leanback.transition.FadeAndShortSlide;

@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class LeanbackPreferenceFragmentTransitionHelperApi21 {
    private LeanbackPreferenceFragmentTransitionHelperApi21() {
    }

    public static void addTransitions(Fragment fragment) {
        FadeAndShortSlide fadeAndShortSlide = new FadeAndShortSlide(GravityCompat.START);
        FadeAndShortSlide fadeAndShortSlide2 = new FadeAndShortSlide(GravityCompat.END);
        fragment.setEnterTransition(fadeAndShortSlide2);
        fragment.setExitTransition(fadeAndShortSlide);
        fragment.setReenterTransition(fadeAndShortSlide);
        fragment.setReturnTransition(fadeAndShortSlide2);
    }
}
