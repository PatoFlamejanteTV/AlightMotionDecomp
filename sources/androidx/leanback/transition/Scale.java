package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* loaded from: classes3.dex */
class Scale extends Transition {
    private static final String PROPNAME_SCALE = "android:leanback:scale";

    private void captureValues(TransitionValues transitionValues) {
        transitionValues.values.put(PROPNAME_SCALE, Float.valueOf(transitionValues.view.getScaleX()));
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // android.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            float floatValue = ((Float) transitionValues.values.get(PROPNAME_SCALE)).floatValue();
            float floatValue2 = ((Float) transitionValues2.values.get(PROPNAME_SCALE)).floatValue();
            final View view = transitionValues.view;
            view.setScaleX(floatValue);
            view.setScaleY(floatValue);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.leanback.transition.Scale.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    view.setScaleX(floatValue3);
                    view.setScaleY(floatValue3);
                }
            });
            return ofFloat;
        }
        return null;
    }
}
