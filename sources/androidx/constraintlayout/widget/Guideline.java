package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {
    private boolean mFilterRedundantCalls;

    public Guideline(Context context) {
        super(context);
        this.mFilterRedundantCalls = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z8) {
        this.mFilterRedundantCalls = z8;
    }

    public void setGuidelineBegin(int i8) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.mFilterRedundantCalls && layoutParams.guideBegin == i8) {
            return;
        }
        layoutParams.guideBegin = i8;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i8) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.mFilterRedundantCalls && layoutParams.guideEnd == i8) {
            return;
        }
        layoutParams.guideEnd = i8;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f8) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.mFilterRedundantCalls && layoutParams.guidePercent == f8) {
            return;
        }
        layoutParams.guidePercent = f8;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFilterRedundantCalls = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mFilterRedundantCalls = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8);
        this.mFilterRedundantCalls = true;
        super.setVisibility(8);
    }
}
