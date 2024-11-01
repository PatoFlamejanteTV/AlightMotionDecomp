package com.mbridge.msdk.video.dynview.h;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.List;

/* loaded from: classes4.dex */
public final class b {
    public final void a(final View view, long j8) {
        ValueAnimator ofInt;
        ValueAnimator ofFloat;
        if (view == null) {
            return;
        }
        if (view.getLayoutParams().width == 0) {
            ofInt = ValueAnimator.ofInt(0, r2);
        } else {
            ofInt = ValueAnimator.ofInt(r2, 0);
        }
        ofInt.setDuration(j8);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mbridge.msdk.video.dynview.h.b.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.setLayoutParams(layoutParams);
            }
        });
        if (view.getLayoutParams().width == 0) {
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        } else {
            ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        ofFloat.setDuration(j8);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mbridge.msdk.video.dynview.h.b.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                view.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.start();
    }

    public final void b(final View view, long j8) {
        if (view != null) {
            view.setAlpha(1.0f);
            view.animate().alpha(0.0f).setDuration(j8).setListener(new Animator.AnimatorListener() { // from class: com.mbridge.msdk.video.dynview.h.b.1
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    View view2 = view;
                    if (view2 != null && (view2 instanceof ViewGroup)) {
                        ((ViewGroup) view2).removeAllViews();
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    View view2 = view;
                    if (view2 != null && (view2 instanceof ViewGroup)) {
                        ((ViewGroup) view2).removeAllViews();
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            });
        }
    }

    public final void c(View view, long j8) {
        if (view != null) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(j8);
        }
    }

    private PropertyValuesHolder b(Property property, float f8) {
        float f9 = (-2.0f) * f8;
        float f10 = f8 * 2.0f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, f9), Keyframe.ofFloat(0.2f, f9), Keyframe.ofFloat(0.3f, f10), Keyframe.ofFloat(0.4f, f9), Keyframe.ofFloat(0.5f, f10), Keyframe.ofFloat(0.6f, f9), Keyframe.ofFloat(0.7f, f10), Keyframe.ofFloat(0.8f, f9), Keyframe.ofFloat(0.9f, f10), Keyframe.ofFloat(1.0f, 0.0f));
    }

    private PropertyValuesHolder c(Property property, float f8) {
        float f9 = f8 - 0.4f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, f8), Keyframe.ofFloat(0.1f, f9), Keyframe.ofFloat(0.2f, f9), Keyframe.ofFloat(0.3f, f8), Keyframe.ofFloat(0.4f, f8), Keyframe.ofFloat(0.5f, f8), Keyframe.ofFloat(0.6f, f8), Keyframe.ofFloat(0.7f, f8), Keyframe.ofFloat(0.8f, f8), Keyframe.ofFloat(0.9f, f8), Keyframe.ofFloat(1.0f, f8));
    }

    public final void a(final List<View> list, int i8, int i9, long j8) {
        ValueAnimator duration = ValueAnimator.ofInt(i8, i9).setDuration(j8);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mbridge.msdk.video.dynview.h.b.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                List list2 = list;
                if (list2 != null && list2.size() > 0) {
                    for (View view : list) {
                        if (view != null) {
                            view.setPadding(0, 0, 0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                            view.requestLayout();
                        }
                    }
                }
            }
        });
        duration.start();
    }

    public final ObjectAnimator b(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, c(View.SCALE_X, 1.0f), c(View.SCALE_Y, 1.0f)).setDuration(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        duration.setRepeatCount(-1);
        return duration;
    }

    public final ObjectAnimator c(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, b(View.ROTATION, 2.0f)).setDuration(1000L);
        duration.setRepeatCount(-1);
        return duration;
    }

    public final void a(final View view, int i8, int i9, int i10, int i11, long j8) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i8, i9);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mbridge.msdk.video.dynview.h.b.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                if (view2 != null) {
                    view2.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.requestLayout();
                }
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(i10, i11);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mbridge.msdk.video.dynview.h.b.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                if (view2 != null) {
                    view2.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.requestLayout();
                    if (view.getVisibility() != 0) {
                        view.setVisibility(0);
                    }
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofInt2);
        animatorSet.setDuration(j8);
        animatorSet.start();
    }

    private PropertyValuesHolder a(Property property, float f8) {
        float f9 = f8 - 0.2f;
        float f10 = f8 + 0.3f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, f8), Keyframe.ofFloat(0.1f, f8 - 0.4f), Keyframe.ofFloat(0.2f, f9), Keyframe.ofFloat(0.3f, f10), Keyframe.ofFloat(0.4f, f9), Keyframe.ofFloat(0.5f, f10), Keyframe.ofFloat(0.6f, f8 - 0.1f), Keyframe.ofFloat(0.7f, f10), Keyframe.ofFloat(0.8f, f8), Keyframe.ofFloat(0.9f, 0.1f + f8), Keyframe.ofFloat(1.0f, f8));
    }

    public final ObjectAnimator a(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, a(View.SCALE_X, 1.0f), a(View.SCALE_Y, 1.0f), b(View.ROTATION_X, 5.0f)).setDuration(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        duration.setRepeatCount(-1);
        return duration;
    }
}
