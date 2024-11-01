package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import androidx.leanback.R;

/* loaded from: classes3.dex */
class ResizingTextView extends TextView {
    public static final int TRIGGER_MAX_LINES = 1;
    private float mDefaultLineSpacingExtra;
    private int mDefaultPaddingBottom;
    private int mDefaultPaddingTop;
    private int mDefaultTextSize;
    private boolean mDefaultsInitialized;
    private boolean mIsResized;
    private boolean mMaintainLineSpacing;
    private int mResizedPaddingAdjustmentBottom;
    private int mResizedPaddingAdjustmentTop;
    private int mResizedTextSize;
    private int mTriggerConditions;

    public ResizingTextView(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8);
        this.mIsResized = false;
        this.mDefaultsInitialized = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.lbResizingTextView, i8, i9);
        try {
            this.mTriggerConditions = obtainStyledAttributes.getInt(R.styleable.lbResizingTextView_resizeTrigger, 1);
            this.mResizedTextSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.lbResizingTextView_resizedTextSize, -1);
            this.mMaintainLineSpacing = obtainStyledAttributes.getBoolean(R.styleable.lbResizingTextView_maintainLineSpacing, false);
            this.mResizedPaddingAdjustmentTop = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.lbResizingTextView_resizedPaddingAdjustmentTop, 0);
            this.mResizedPaddingAdjustmentBottom = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.lbResizingTextView_resizedPaddingAdjustmentBottom, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void resizeParamsChanged() {
        if (this.mIsResized) {
            requestLayout();
        }
    }

    private void setPaddingTopAndBottom(int i8, int i9) {
        if (isPaddingRelative()) {
            setPaddingRelative(getPaddingStart(), i8, getPaddingEnd(), i9);
        } else {
            setPadding(getPaddingLeft(), i8, getPaddingRight(), i9);
        }
    }

    public boolean getMaintainLineSpacing() {
        return this.mMaintainLineSpacing;
    }

    public int getResizedPaddingAdjustmentBottom() {
        return this.mResizedPaddingAdjustmentBottom;
    }

    public int getResizedPaddingAdjustmentTop() {
        return this.mResizedPaddingAdjustmentTop;
    }

    public int getResizedTextSize() {
        return this.mResizedTextSize;
    }

    public int getTriggerConditions() {
        return this.mTriggerConditions;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r7, int r8) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ResizingTextView.onMeasure(int, int):void");
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    public void setMaintainLineSpacing(boolean z8) {
        if (this.mMaintainLineSpacing != z8) {
            this.mMaintainLineSpacing = z8;
            resizeParamsChanged();
        }
    }

    public void setResizedPaddingAdjustmentBottom(int i8) {
        if (this.mResizedPaddingAdjustmentBottom != i8) {
            this.mResizedPaddingAdjustmentBottom = i8;
            resizeParamsChanged();
        }
    }

    public void setResizedPaddingAdjustmentTop(int i8) {
        if (this.mResizedPaddingAdjustmentTop != i8) {
            this.mResizedPaddingAdjustmentTop = i8;
            resizeParamsChanged();
        }
    }

    public void setResizedTextSize(int i8) {
        if (this.mResizedTextSize != i8) {
            this.mResizedTextSize = i8;
            resizeParamsChanged();
        }
    }

    public void setTriggerConditions(int i8) {
        if (this.mTriggerConditions != i8) {
            this.mTriggerConditions = i8;
            requestLayout();
        }
    }

    public ResizingTextView(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public ResizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public ResizingTextView(Context context) {
        this(context, null);
    }
}
