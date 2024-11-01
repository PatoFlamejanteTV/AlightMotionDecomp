package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.transition.platform.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes3.dex */
abstract class MaterialVisibility<P extends VisibilityAnimatorProvider> extends Visibility {
    private final List<VisibilityAnimatorProvider> additionalAnimatorProviders = new ArrayList();
    private final P primaryAnimatorProvider;

    @Nullable
    private VisibilityAnimatorProvider secondaryAnimatorProvider;

    /* JADX INFO: Access modifiers changed from: protected */
    public MaterialVisibility(P p8, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.primaryAnimatorProvider = p8;
        this.secondaryAnimatorProvider = visibilityAnimatorProvider;
    }

    private static void addAnimatorIfNeeded(List<Animator> list, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z8) {
        Animator createDisappear;
        if (visibilityAnimatorProvider == null) {
            return;
        }
        if (z8) {
            createDisappear = visibilityAnimatorProvider.createAppear(viewGroup, view);
        } else {
            createDisappear = visibilityAnimatorProvider.createDisappear(viewGroup, view);
        }
        if (createDisappear != null) {
            list.add(createDisappear);
        }
    }

    private Animator createAnimator(@NonNull ViewGroup viewGroup, @NonNull View view, boolean z8) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        addAnimatorIfNeeded(arrayList, this.primaryAnimatorProvider, viewGroup, view, z8);
        addAnimatorIfNeeded(arrayList, this.secondaryAnimatorProvider, viewGroup, view, z8);
        Iterator<VisibilityAnimatorProvider> it = this.additionalAnimatorProviders.iterator();
        while (it.hasNext()) {
            addAnimatorIfNeeded(arrayList, it.next(), viewGroup, view, z8);
        }
        maybeApplyThemeValues(viewGroup.getContext(), z8);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    private void maybeApplyThemeValues(@NonNull Context context, boolean z8) {
        TransitionUtils.maybeApplyThemeDuration(this, context, getDurationThemeAttrResId(z8));
        TransitionUtils.maybeApplyThemeInterpolator(this, context, getEasingThemeAttrResId(z8), getDefaultEasingInterpolator(z8));
    }

    public void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.additionalAnimatorProviders.add(visibilityAnimatorProvider);
    }

    public void clearAdditionalAnimatorProvider() {
        this.additionalAnimatorProviders.clear();
    }

    @NonNull
    TimeInterpolator getDefaultEasingInterpolator(boolean z8) {
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    @AttrRes
    int getDurationThemeAttrResId(boolean z8) {
        return 0;
    }

    @AttrRes
    int getEasingThemeAttrResId(boolean z8) {
        return 0;
    }

    @NonNull
    public P getPrimaryAnimatorProvider() {
        return this.primaryAnimatorProvider;
    }

    @Nullable
    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return createAnimator(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return createAnimator(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return this.additionalAnimatorProviders.remove(visibilityAnimatorProvider);
    }

    public void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.secondaryAnimatorProvider = visibilityAnimatorProvider;
    }
}
