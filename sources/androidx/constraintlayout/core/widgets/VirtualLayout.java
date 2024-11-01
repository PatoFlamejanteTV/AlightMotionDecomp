package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.HashSet;

/* loaded from: classes.dex */
public class VirtualLayout extends HelperWidget {
    private int mPaddingTop = 0;
    private int mPaddingBottom = 0;
    private int mPaddingLeft = 0;
    private int mPaddingRight = 0;
    private int mPaddingStart = 0;
    private int mPaddingEnd = 0;
    private int mResolvedPaddingLeft = 0;
    private int mResolvedPaddingRight = 0;
    private boolean mNeedsCallFromSolver = false;
    private int mMeasuredWidth = 0;
    private int mMeasuredHeight = 0;
    protected BasicMeasure.Measure mMeasure = new BasicMeasure.Measure();
    BasicMeasure.Measurer mMeasurer = null;

    public void applyRtl(boolean z8) {
        int i8 = this.mPaddingStart;
        if (i8 > 0 || this.mPaddingEnd > 0) {
            if (z8) {
                this.mResolvedPaddingLeft = this.mPaddingEnd;
                this.mResolvedPaddingRight = i8;
            } else {
                this.mResolvedPaddingLeft = i8;
                this.mResolvedPaddingRight = this.mPaddingEnd;
            }
        }
    }

    public void captureWidgets() {
        for (int i8 = 0; i8 < this.mWidgetsCount; i8++) {
            ConstraintWidget constraintWidget = this.mWidgets[i8];
            if (constraintWidget != null) {
                constraintWidget.setInVirtualLayout(true);
            }
        }
    }

    public boolean contains(HashSet<ConstraintWidget> hashSet) {
        for (int i8 = 0; i8 < this.mWidgetsCount; i8++) {
            if (hashSet.contains(this.mWidgets[i8])) {
                return true;
            }
        }
        return false;
    }

    public int getMeasuredHeight() {
        return this.mMeasuredHeight;
    }

    public int getMeasuredWidth() {
        return this.mMeasuredWidth;
    }

    public int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public int getPaddingLeft() {
        return this.mResolvedPaddingLeft;
    }

    public int getPaddingRight() {
        return this.mResolvedPaddingRight;
    }

    public int getPaddingTop() {
        return this.mPaddingTop;
    }

    public void measure(int i8, int i9, int i10, int i11) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean measureChildren() {
        BasicMeasure.Measurer measurer;
        ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null) {
            measurer = ((ConstraintWidgetContainer) constraintWidget).getMeasurer();
        } else {
            measurer = null;
        }
        if (measurer == null) {
            return false;
        }
        for (int i8 = 0; i8 < this.mWidgetsCount; i8++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i8];
            if (constraintWidget2 != null && !(constraintWidget2 instanceof Guideline)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.getDimensionBehaviour(0);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.getDimensionBehaviour(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour != dimensionBehaviour3 || constraintWidget2.mMatchConstraintDefaultWidth == 1 || dimensionBehaviour2 != dimensionBehaviour3 || constraintWidget2.mMatchConstraintDefaultHeight == 1) {
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    BasicMeasure.Measure measure = this.mMeasure;
                    measure.horizontalBehavior = dimensionBehaviour;
                    measure.verticalBehavior = dimensionBehaviour2;
                    measure.horizontalDimension = constraintWidget2.getWidth();
                    this.mMeasure.verticalDimension = constraintWidget2.getHeight();
                    measurer.measure(constraintWidget2, this.mMeasure);
                    constraintWidget2.setWidth(this.mMeasure.measuredWidth);
                    constraintWidget2.setHeight(this.mMeasure.measuredHeight);
                    constraintWidget2.setBaselineDistance(this.mMeasure.measuredBaseline);
                }
            }
        }
        return true;
    }

    public boolean needSolverPass() {
        return this.mNeedsCallFromSolver;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void needsCallbackFromSolver(boolean z8) {
        this.mNeedsCallFromSolver = z8;
    }

    public void setMeasure(int i8, int i9) {
        this.mMeasuredWidth = i8;
        this.mMeasuredHeight = i9;
    }

    public void setPadding(int i8) {
        this.mPaddingLeft = i8;
        this.mPaddingTop = i8;
        this.mPaddingRight = i8;
        this.mPaddingBottom = i8;
        this.mPaddingStart = i8;
        this.mPaddingEnd = i8;
    }

    public void setPaddingBottom(int i8) {
        this.mPaddingBottom = i8;
    }

    public void setPaddingEnd(int i8) {
        this.mPaddingEnd = i8;
    }

    public void setPaddingLeft(int i8) {
        this.mPaddingLeft = i8;
        this.mResolvedPaddingLeft = i8;
    }

    public void setPaddingRight(int i8) {
        this.mPaddingRight = i8;
        this.mResolvedPaddingRight = i8;
    }

    public void setPaddingStart(int i8) {
        this.mPaddingStart = i8;
        this.mResolvedPaddingLeft = i8;
        this.mResolvedPaddingRight = i8;
    }

    public void setPaddingTop(int i8) {
        this.mPaddingTop = i8;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.Helper
    public void updateConstraints(ConstraintWidgetContainer constraintWidgetContainer) {
        captureWidgets();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void measure(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i8, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i9) {
        while (this.mMeasurer == null && getParent() != null) {
            this.mMeasurer = ((ConstraintWidgetContainer) getParent()).getMeasurer();
        }
        BasicMeasure.Measure measure = this.mMeasure;
        measure.horizontalBehavior = dimensionBehaviour;
        measure.verticalBehavior = dimensionBehaviour2;
        measure.horizontalDimension = i8;
        measure.verticalDimension = i9;
        this.mMeasurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
    }
}
