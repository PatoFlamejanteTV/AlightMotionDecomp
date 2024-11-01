package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class CircularPropagation extends VisibilityPropagation {
    private float mPropagationSpeed = 3.0f;

    private static float distance(float f8, float f9, float f10, float f11) {
        float f12 = f10 - f8;
        float f13 = f11 - f9;
        return (float) Math.sqrt((f12 * f12) + (f13 * f13));
    }

    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(@NonNull ViewGroup viewGroup, @NonNull Transition transition, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        int i8;
        int round;
        int i9;
        if (transitionValues == null && transitionValues2 == null) {
            return 0L;
        }
        if (transitionValues2 != null && getViewVisibility(transitionValues) != 0) {
            transitionValues = transitionValues2;
            i8 = 1;
        } else {
            i8 = -1;
        }
        int viewX = getViewX(transitionValues);
        int viewY = getViewY(transitionValues);
        Rect epicenter = transition.getEpicenter();
        if (epicenter != null) {
            i9 = epicenter.centerX();
            round = epicenter.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int round2 = Math.round(r5[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            round = Math.round(r5[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            i9 = round2;
        }
        float distance = distance(viewX, viewY, i9, round) / distance(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round((((float) (duration * i8)) / this.mPropagationSpeed) * distance);
    }

    public void setPropagationSpeed(float f8) {
        if (f8 != 0.0f) {
            this.mPropagationSpeed = f8;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }
}
