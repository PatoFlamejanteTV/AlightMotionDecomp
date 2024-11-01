package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Barrier extends HelperWidget {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private static final boolean USE_RELAX_GONE = false;
    private static final boolean USE_RESOLUTION = true;
    private int mBarrierType = 0;
    private boolean mAllowsGoneWidget = true;
    private int mMargin = 0;
    boolean resolved = false;

    public Barrier() {
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z8) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ConstraintAnchor[] constraintAnchorArr2 = this.mListAnchors;
        constraintAnchorArr2[0] = this.mLeft;
        constraintAnchorArr2[2] = this.mTop;
        constraintAnchorArr2[1] = this.mRight;
        constraintAnchorArr2[3] = this.mBottom;
        int i13 = 0;
        while (true) {
            constraintAnchorArr = this.mListAnchors;
            if (i13 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i13];
            constraintAnchor.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor);
            i13++;
        }
        int i14 = this.mBarrierType;
        if (i14 >= 0 && i14 < 4) {
            ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i14];
            if (!this.resolved) {
                allSolved();
            }
            if (this.resolved) {
                this.resolved = false;
                int i15 = this.mBarrierType;
                if (i15 != 0 && i15 != 1) {
                    if (i15 == 2 || i15 == 3) {
                        linearSystem.addEquality(this.mTop.mSolverVariable, this.mY);
                        linearSystem.addEquality(this.mBottom.mSolverVariable, this.mY);
                        return;
                    }
                    return;
                }
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.mX);
                linearSystem.addEquality(this.mRight.mSolverVariable, this.mX);
                return;
            }
            for (int i16 = 0; i16 < this.mWidgetsCount; i16++) {
                ConstraintWidget constraintWidget = this.mWidgets[i16];
                if ((this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) && ((((i11 = this.mBarrierType) == 0 || i11 == 1) && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mLeft.mTarget != null && constraintWidget.mRight.mTarget != null) || (((i12 = this.mBarrierType) == 2 || i12 == 3) && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mTop.mTarget != null && constraintWidget.mBottom.mTarget != null))) {
                    z9 = true;
                    break;
                }
            }
            z9 = false;
            if (!this.mLeft.hasCenteredDependents() && !this.mRight.hasCenteredDependents()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!this.mTop.hasCenteredDependents() && !this.mBottom.hasCenteredDependents()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z9 && (((i10 = this.mBarrierType) == 0 && z10) || ((i10 == 2 && z11) || ((i10 == 1 && z10) || (i10 == 3 && z11))))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                i8 = 4;
            } else {
                i8 = 5;
            }
            for (int i17 = 0; i17 < this.mWidgetsCount; i17++) {
                ConstraintWidget constraintWidget2 = this.mWidgets[i17];
                if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                    SolverVariable createObjectVariable = linearSystem.createObjectVariable(constraintWidget2.mListAnchors[this.mBarrierType]);
                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.mListAnchors;
                    int i18 = this.mBarrierType;
                    ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i18];
                    constraintAnchor3.mSolverVariable = createObjectVariable;
                    ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
                    if (constraintAnchor4 != null && constraintAnchor4.mOwner == this) {
                        i9 = constraintAnchor3.mMargin;
                    } else {
                        i9 = 0;
                    }
                    if (i18 != 0 && i18 != 2) {
                        linearSystem.addGreaterBarrier(constraintAnchor2.mSolverVariable, createObjectVariable, this.mMargin + i9, z9);
                    } else {
                        linearSystem.addLowerBarrier(constraintAnchor2.mSolverVariable, createObjectVariable, this.mMargin - i9, z9);
                    }
                    linearSystem.addEquality(constraintAnchor2.mSolverVariable, createObjectVariable, this.mMargin + i9, i8);
                }
            }
            int i19 = this.mBarrierType;
            if (i19 == 0) {
                linearSystem.addEquality(this.mRight.mSolverVariable, this.mLeft.mSolverVariable, 0, 8);
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, 4);
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, 0);
                return;
            }
            if (i19 == 1) {
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.mRight.mSolverVariable, 0, 8);
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, 4);
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, 0);
            } else if (i19 == 2) {
                linearSystem.addEquality(this.mBottom.mSolverVariable, this.mTop.mSolverVariable, 0, 8);
                linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, 4);
                linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 0);
            } else if (i19 == 3) {
                linearSystem.addEquality(this.mTop.mSolverVariable, this.mBottom.mSolverVariable, 0, 8);
                linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 4);
                linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, 0);
            }
        }
    }

    public boolean allSolved() {
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        boolean z8 = true;
        while (true) {
            i8 = this.mWidgetsCount;
            if (i11 >= i8) {
                break;
            }
            ConstraintWidget constraintWidget = this.mWidgets[i11];
            if ((this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) && ((((i9 = this.mBarrierType) == 0 || i9 == 1) && !constraintWidget.isResolvedHorizontally()) || (((i10 = this.mBarrierType) == 2 || i10 == 3) && !constraintWidget.isResolvedVertically()))) {
                z8 = false;
            }
            i11++;
        }
        if (!z8 || i8 <= 0) {
            return false;
        }
        int i12 = 0;
        boolean z9 = false;
        for (int i13 = 0; i13 < this.mWidgetsCount; i13++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i13];
            if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                if (!z9) {
                    int i14 = this.mBarrierType;
                    if (i14 == 0) {
                        i12 = constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT).getFinalValue();
                    } else if (i14 == 1) {
                        i12 = constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getFinalValue();
                    } else if (i14 == 2) {
                        i12 = constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP).getFinalValue();
                    } else if (i14 == 3) {
                        i12 = constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getFinalValue();
                    }
                    z9 = true;
                }
                int i15 = this.mBarrierType;
                if (i15 == 0) {
                    i12 = Math.min(i12, constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT).getFinalValue());
                } else if (i15 == 1) {
                    i12 = Math.max(i12, constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getFinalValue());
                } else if (i15 == 2) {
                    i12 = Math.min(i12, constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP).getFinalValue());
                } else if (i15 == 3) {
                    i12 = Math.max(i12, constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getFinalValue());
                }
            }
        }
        int i16 = i12 + this.mMargin;
        int i17 = this.mBarrierType;
        if (i17 != 0 && i17 != 1) {
            setFinalVertical(i16, i16);
        } else {
            setFinalHorizontal(i16, i16);
        }
        this.resolved = true;
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        return true;
    }

    @Deprecated
    public boolean allowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Barrier barrier = (Barrier) constraintWidget;
        this.mBarrierType = barrier.mBarrierType;
        this.mAllowsGoneWidget = barrier.mAllowsGoneWidget;
        this.mMargin = barrier.mMargin;
    }

    public boolean getAllowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    public int getBarrierType() {
        return this.mBarrierType;
    }

    public int getMargin() {
        return this.mMargin;
    }

    public int getOrientation() {
        int i8 = this.mBarrierType;
        if (i8 != 0 && i8 != 1) {
            if (i8 == 2 || i8 == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
        return this.resolved;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
        return this.resolved;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void markWidgets() {
        for (int i8 = 0; i8 < this.mWidgetsCount; i8++) {
            ConstraintWidget constraintWidget = this.mWidgets[i8];
            if (this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) {
                int i9 = this.mBarrierType;
                if (i9 != 0 && i9 != 1) {
                    if (i9 == 2 || i9 == 3) {
                        constraintWidget.setInBarrier(1, true);
                    }
                } else {
                    constraintWidget.setInBarrier(0, true);
                }
            }
        }
    }

    public void setAllowsGoneWidget(boolean z8) {
        this.mAllowsGoneWidget = z8;
    }

    public void setBarrierType(int i8) {
        this.mBarrierType = i8;
    }

    public void setMargin(int i8) {
        this.mMargin = i8;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String str = "[Barrier] " + getDebugName() + " {";
        for (int i8 = 0; i8 < this.mWidgetsCount; i8++) {
            ConstraintWidget constraintWidget = this.mWidgets[i8];
            if (i8 > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.getDebugName();
        }
        return str + "}";
    }

    public Barrier(String str) {
        setDebugName(str);
    }
}
