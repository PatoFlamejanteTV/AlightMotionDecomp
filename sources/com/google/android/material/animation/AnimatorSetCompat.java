package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class AnimatorSetCompat {
    public static void playTogether(@NonNull AnimatorSet animatorSet, @NonNull List<Animator> list) {
        int size = list.size();
        long j8 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Animator animator = list.get(i8);
            j8 = Math.max(j8, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j8);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
