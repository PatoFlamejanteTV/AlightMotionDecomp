package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.leanback.R;

/* loaded from: classes3.dex */
class GuidedActionsRelativeLayout extends RelativeLayout {
    private boolean mInOverride;
    private InterceptKeyEventListener mInterceptKeyEventListener;
    private float mKeyLinePercent;

    /* loaded from: classes3.dex */
    interface InterceptKeyEventListener {
        boolean onInterceptKeyEvent(KeyEvent keyEvent);
    }

    public GuidedActionsRelativeLayout(Context context) {
        this(context, null);
    }

    private void init() {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(R.styleable.LeanbackGuidedStepTheme);
        this.mKeyLinePercent = obtainStyledAttributes.getFloat(R.styleable.LeanbackGuidedStepTheme_guidedStepKeyline, 40.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterceptKeyEventListener interceptKeyEventListener = this.mInterceptKeyEventListener;
        if (interceptKeyEventListener != null && interceptKeyEventListener.onInterceptKeyEvent(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        this.mInOverride = false;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        View findViewById;
        int size = View.MeasureSpec.getSize(i9);
        if (size > 0 && (findViewById = findViewById(R.id.guidedactions_sub_list)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            if (marginLayoutParams.topMargin < 0 && !this.mInOverride) {
                this.mInOverride = true;
            }
            if (this.mInOverride) {
                marginLayoutParams.topMargin = (int) ((this.mKeyLinePercent * size) / 100.0f);
            }
        }
        super.onMeasure(i8, i9);
    }

    public void setInterceptKeyEventListener(InterceptKeyEventListener interceptKeyEventListener) {
        this.mInterceptKeyEventListener = interceptKeyEventListener;
    }

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mInOverride = false;
        this.mKeyLinePercent = GuidanceStylingRelativeLayout.getKeyLinePercent(context);
    }
}
