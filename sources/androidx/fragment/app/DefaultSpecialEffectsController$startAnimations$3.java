package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class DefaultSpecialEffectsController$startAnimations$3 implements Animation.AnimationListener {
    final /* synthetic */ DefaultSpecialEffectsController.AnimationInfo $animationInfo;
    final /* synthetic */ SpecialEffectsController.Operation $operation;
    final /* synthetic */ View $viewToAnimate;
    final /* synthetic */ DefaultSpecialEffectsController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultSpecialEffectsController$startAnimations$3(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController defaultSpecialEffectsController, View view, DefaultSpecialEffectsController.AnimationInfo animationInfo) {
        this.$operation = operation;
        this.this$0 = defaultSpecialEffectsController;
        this.$viewToAnimate = view;
        this.$animationInfo = animationInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAnimationEnd$lambda$0(DefaultSpecialEffectsController this$0, View view, DefaultSpecialEffectsController.AnimationInfo animationInfo) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(animationInfo, "$animationInfo");
        this$0.getContainer().endViewTransition(view);
        animationInfo.completeSpecialEffect();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        AbstractC3292y.i(animation, "animation");
        ViewGroup container = this.this$0.getContainer();
        final DefaultSpecialEffectsController defaultSpecialEffectsController = this.this$0;
        final View view = this.$viewToAnimate;
        final DefaultSpecialEffectsController.AnimationInfo animationInfo = this.$animationInfo;
        container.post(new Runnable() { // from class: androidx.fragment.app.h
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSpecialEffectsController$startAnimations$3.onAnimationEnd$lambda$0(DefaultSpecialEffectsController.this, view, animationInfo);
            }
        });
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + this.$operation + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        AbstractC3292y.i(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        AbstractC3292y.i(animation, "animation");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + this.$operation + " has reached onAnimationStart.");
        }
    }
}
