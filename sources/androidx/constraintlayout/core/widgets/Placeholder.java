package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;

/* loaded from: classes.dex */
public class Placeholder extends VirtualLayout {
    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z8) {
        super.addToSolver(linearSystem, z8);
        if (this.mWidgetsCount > 0) {
            ConstraintWidget constraintWidget = this.mWidgets[0];
            constraintWidget.resetAllConstraints();
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.connect(type, this, type);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.connect(type2, this, type2);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.connect(type3, this, type3);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.connect(type4, this, type4);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i8, int i9, int i10, int i11) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        boolean z8 = false;
        if (this.mWidgetsCount > 0) {
            paddingLeft += this.mWidgets[0].getWidth();
            paddingTop += this.mWidgets[0].getHeight();
        }
        int max = Math.max(getMinWidth(), paddingLeft);
        int max2 = Math.max(getMinHeight(), paddingTop);
        if (i8 != 1073741824) {
            if (i8 == Integer.MIN_VALUE) {
                i9 = Math.min(max, i9);
            } else if (i8 == 0) {
                i9 = max;
            } else {
                i9 = 0;
            }
        }
        if (i10 != 1073741824) {
            if (i10 == Integer.MIN_VALUE) {
                i11 = Math.min(max2, i11);
            } else if (i10 == 0) {
                i11 = max2;
            } else {
                i11 = 0;
            }
        }
        setMeasure(i9, i11);
        setWidth(i9);
        setHeight(i11);
        if (this.mWidgetsCount > 0) {
            z8 = true;
        }
        needsCallbackFromSolver(z8);
    }
}
