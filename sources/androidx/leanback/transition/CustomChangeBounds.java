package androidx.leanback.transition;

import android.animation.Animator;
import android.transition.ChangeBounds;
import android.transition.TransitionValues;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import java.util.HashMap;

@RequiresApi(19)
/* loaded from: classes3.dex */
class CustomChangeBounds extends ChangeBounds {
    int mDefaultStartDelay;
    final HashMap<View, Integer> mViewStartDelays = new HashMap<>();
    final SparseIntArray mIdStartDelays = new SparseIntArray();
    final HashMap<String, Integer> mClassStartDelays = new HashMap<>();

    private int getDelay(View view) {
        Integer num = this.mViewStartDelays.get(view);
        if (num != null) {
            return num.intValue();
        }
        int i8 = this.mIdStartDelays.get(view.getId(), -1);
        if (i8 != -1) {
            return i8;
        }
        Integer num2 = this.mClassStartDelays.get(view.getClass().getName());
        if (num2 != null) {
            return num2.intValue();
        }
        return this.mDefaultStartDelay;
    }

    @Override // android.transition.ChangeBounds, android.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View view;
        Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
        if (createAnimator != null && transitionValues2 != null && (view = transitionValues2.view) != null) {
            createAnimator.setStartDelay(getDelay(view));
        }
        return createAnimator;
    }

    public void setDefaultStartDelay(int i8) {
        this.mDefaultStartDelay = i8;
    }

    public void setStartDelay(View view, int i8) {
        this.mViewStartDelays.put(view, Integer.valueOf(i8));
    }

    public void setStartDelay(int i8, int i9) {
        this.mIdStartDelays.put(i8, i9);
    }

    public void setStartDelay(String str, int i8) {
        this.mClassStartDelays.put(str, Integer.valueOf(i8));
    }
}
