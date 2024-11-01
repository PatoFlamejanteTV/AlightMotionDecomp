package com.mbridge.msdk.dycreator.baseview.cusview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class MBridgeTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private ObjectAnimator f19752a;

    public MBridgeTextView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f19752a;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f19752a;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f19752a = objectAnimator;
    }

    public MBridgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeTextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
