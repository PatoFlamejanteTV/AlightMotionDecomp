package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class WidgetContainer extends ConstraintWidget {
    public ArrayList<ConstraintWidget> mChildren;

    public WidgetContainer() {
        this.mChildren = new ArrayList<>();
    }

    public void add(ConstraintWidget constraintWidget) {
        this.mChildren.add(constraintWidget);
        if (constraintWidget.getParent() != null) {
            ((WidgetContainer) constraintWidget.getParent()).remove(constraintWidget);
        }
        constraintWidget.setParent(this);
    }

    public ArrayList<ConstraintWidget> getChildren() {
        return this.mChildren;
    }

    public ConstraintWidgetContainer getRootConstraintContainer() {
        ConstraintWidgetContainer constraintWidgetContainer;
        ConstraintWidget parent = getParent();
        if (this instanceof ConstraintWidgetContainer) {
            constraintWidgetContainer = (ConstraintWidgetContainer) this;
        } else {
            constraintWidgetContainer = null;
        }
        while (parent != null) {
            ConstraintWidget parent2 = parent.getParent();
            if (parent instanceof ConstraintWidgetContainer) {
                constraintWidgetContainer = (ConstraintWidgetContainer) parent;
            }
            parent = parent2;
        }
        return constraintWidgetContainer;
    }

    public void layout() {
        ArrayList<ConstraintWidget> arrayList = this.mChildren;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i8);
            if (constraintWidget instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget).layout();
            }
        }
    }

    public void remove(ConstraintWidget constraintWidget) {
        this.mChildren.remove(constraintWidget);
        constraintWidget.reset();
    }

    public void removeAllChildren() {
        this.mChildren.clear();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void reset() {
        this.mChildren.clear();
        super.reset();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void resetSolverVariables(Cache cache) {
        super.resetSolverVariables(cache);
        int size = this.mChildren.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.mChildren.get(i8).resetSolverVariables(cache);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void setOffset(int i8, int i9) {
        super.setOffset(i8, i9);
        int size = this.mChildren.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mChildren.get(i10).setOffset(getRootX(), getRootY());
        }
    }

    public WidgetContainer(int i8, int i9, int i10, int i11) {
        super(i8, i9, i10, i11);
        this.mChildren = new ArrayList<>();
    }

    public WidgetContainer(int i8, int i9) {
        super(i8, i9);
        this.mChildren = new ArrayList<>();
    }

    public void add(ConstraintWidget... constraintWidgetArr) {
        for (ConstraintWidget constraintWidget : constraintWidgetArr) {
            add(constraintWidget);
        }
    }
}
