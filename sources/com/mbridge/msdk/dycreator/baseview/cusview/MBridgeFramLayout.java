package com.mbridge.msdk.dycreator.baseview.cusview;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class MBridgeFramLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private AnimatorSet f19720a;

    public MBridgeFramLayout(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f19720a;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f19720a;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f19720a = animatorSet;
    }

    public MBridgeFramLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeFramLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
