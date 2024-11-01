package androidx.browser.browseractions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

@Deprecated
/* loaded from: classes.dex */
class BrowserActionsFallbackMenuDialog extends Dialog {
    private static final long ENTER_ANIMATION_DURATION_MS = 250;
    private static final long EXIT_ANIMATION_DURATION_MS = 150;
    private final View mContentView;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BrowserActionsFallbackMenuDialog(Context context, View view) {
        super(context);
        this.mContentView = view;
    }

    private void startAnimation(final boolean z8) {
        float f8;
        long j8;
        float f9 = 1.0f;
        if (z8) {
            f8 = 0.0f;
        } else {
            f8 = 1.0f;
        }
        if (!z8) {
            f9 = 0.0f;
        }
        if (z8) {
            j8 = ENTER_ANIMATION_DURATION_MS;
        } else {
            j8 = 150;
        }
        this.mContentView.setScaleX(f8);
        this.mContentView.setScaleY(f8);
        this.mContentView.animate().scaleX(f9).scaleY(f9).setDuration(j8).setInterpolator(new LinearOutSlowInInterpolator()).setListener(new AnimatorListenerAdapter() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuDialog.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!z8) {
                    BrowserActionsFallbackMenuDialog.super.dismiss();
                }
            }
        }).start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        startAnimation(false);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // android.app.Dialog
    public void show() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        startAnimation(true);
        super.show();
    }
}
