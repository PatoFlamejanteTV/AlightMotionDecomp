package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class WidgetGroup {
    private static final boolean DEBUG = false;
    static int count;
    int id;
    int orientation;
    ArrayList<ConstraintWidget> widgets = new ArrayList<>();
    boolean authoritative = false;
    ArrayList<MeasureResult> results = null;
    private int moveTo = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class MeasureResult {
        int baseline;
        int bottom;
        int left;
        int orientation;
        int right;
        int top;
        WeakReference<ConstraintWidget> widgetRef;

        public MeasureResult(ConstraintWidget constraintWidget, LinearSystem linearSystem, int i8) {
            this.widgetRef = new WeakReference<>(constraintWidget);
            this.left = linearSystem.getObjectVariableValue(constraintWidget.mLeft);
            this.top = linearSystem.getObjectVariableValue(constraintWidget.mTop);
            this.right = linearSystem.getObjectVariableValue(constraintWidget.mRight);
            this.bottom = linearSystem.getObjectVariableValue(constraintWidget.mBottom);
            this.baseline = linearSystem.getObjectVariableValue(constraintWidget.mBaseline);
            this.orientation = i8;
        }

        public void apply() {
            ConstraintWidget constraintWidget = this.widgetRef.get();
            if (constraintWidget != null) {
                constraintWidget.setFinalFrame(this.left, this.top, this.right, this.bottom, this.baseline, this.orientation);
            }
        }
    }

    public WidgetGroup(int i8) {
        int i9 = count;
        count = i9 + 1;
        this.id = i9;
        this.orientation = i8;
    }

    private boolean contains(ConstraintWidget constraintWidget) {
        return this.widgets.contains(constraintWidget);
    }

    private String getOrientationString() {
        int i8 = this.orientation;
        if (i8 == 0) {
            return "Horizontal";
        }
        if (i8 == 1) {
            return "Vertical";
        }
        if (i8 == 2) {
            return "Both";
        }
        return "Unknown";
    }

    private int measureWrap(int i8, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.getDimensionBehaviour(i8);
        if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != ConstraintWidget.DimensionBehaviour.FIXED) {
            return -1;
        }
        if (i8 == 0) {
            return constraintWidget.getWidth();
        }
        return constraintWidget.getHeight();
    }

    private int solverMeasure(LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i8) {
        int objectVariableValue;
        int objectVariableValue2;
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) arrayList.get(0).getParent();
        linearSystem.reset();
        constraintWidgetContainer.addToSolver(linearSystem, false);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            arrayList.get(i9).addToSolver(linearSystem, false);
        }
        if (i8 == 0 && constraintWidgetContainer.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 0);
        }
        if (i8 == 1 && constraintWidgetContainer.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 1);
        }
        try {
            linearSystem.minimize();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        this.results = new ArrayList<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.results.add(new MeasureResult(arrayList.get(i10), linearSystem, i8));
        }
        if (i8 == 0) {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mLeft);
            objectVariableValue2 = linearSystem.getObjectVariableValue(constraintWidgetContainer.mRight);
            linearSystem.reset();
        } else {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mTop);
            objectVariableValue2 = linearSystem.getObjectVariableValue(constraintWidgetContainer.mBottom);
            linearSystem.reset();
        }
        return objectVariableValue2 - objectVariableValue;
    }

    public boolean add(ConstraintWidget constraintWidget) {
        if (this.widgets.contains(constraintWidget)) {
            return false;
        }
        this.widgets.add(constraintWidget);
        return true;
    }

    public void apply() {
        if (this.results == null || !this.authoritative) {
            return;
        }
        for (int i8 = 0; i8 < this.results.size(); i8++) {
            this.results.get(i8).apply();
        }
    }

    public void cleanup(ArrayList<WidgetGroup> arrayList) {
        int size = this.widgets.size();
        if (this.moveTo != -1 && size > 0) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                WidgetGroup widgetGroup = arrayList.get(i8);
                if (this.moveTo == widgetGroup.id) {
                    moveTo(this.orientation, widgetGroup);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void clear() {
        this.widgets.clear();
    }

    public int getId() {
        return this.id;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public boolean intersectWith(WidgetGroup widgetGroup) {
        for (int i8 = 0; i8 < this.widgets.size(); i8++) {
            if (widgetGroup.contains(this.widgets.get(i8))) {
                return true;
            }
        }
        return false;
    }

    public boolean isAuthoritative() {
        return this.authoritative;
    }

    public void moveTo(int i8, WidgetGroup widgetGroup) {
        Iterator<ConstraintWidget> it = this.widgets.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            widgetGroup.add(next);
            if (i8 == 0) {
                next.horizontalGroup = widgetGroup.getId();
            } else {
                next.verticalGroup = widgetGroup.getId();
            }
        }
        this.moveTo = widgetGroup.id;
    }

    public void setAuthoritative(boolean z8) {
        this.authoritative = z8;
    }

    public void setOrientation(int i8) {
        this.orientation = i8;
    }

    public int size() {
        return this.widgets.size();
    }

    public String toString() {
        String str = getOrientationString() + " [" + this.id + "] <";
        Iterator<ConstraintWidget> it = this.widgets.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().getDebugName();
        }
        return str + " >";
    }

    public int measureWrap(LinearSystem linearSystem, int i8) {
        if (this.widgets.size() == 0) {
            return 0;
        }
        return solverMeasure(linearSystem, this.widgets, i8);
    }
}
