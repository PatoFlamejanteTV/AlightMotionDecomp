package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class HelperWidget extends ConstraintWidget implements Helper {
    public ConstraintWidget[] mWidgets = new ConstraintWidget[4];
    public int mWidgetsCount = 0;

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void add(ConstraintWidget constraintWidget) {
        if (constraintWidget != this && constraintWidget != null) {
            int i8 = this.mWidgetsCount + 1;
            ConstraintWidget[] constraintWidgetArr = this.mWidgets;
            if (i8 > constraintWidgetArr.length) {
                this.mWidgets = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.mWidgets;
            int i9 = this.mWidgetsCount;
            constraintWidgetArr2[i9] = constraintWidget;
            this.mWidgetsCount = i9 + 1;
        }
    }

    public void addDependents(ArrayList<WidgetGroup> arrayList, int i8, WidgetGroup widgetGroup) {
        for (int i9 = 0; i9 < this.mWidgetsCount; i9++) {
            widgetGroup.add(this.mWidgets[i9]);
        }
        for (int i10 = 0; i10 < this.mWidgetsCount; i10++) {
            Grouping.findDependents(this.mWidgets[i10], i8, arrayList, widgetGroup);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        HelperWidget helperWidget = (HelperWidget) constraintWidget;
        this.mWidgetsCount = 0;
        int i8 = helperWidget.mWidgetsCount;
        for (int i9 = 0; i9 < i8; i9++) {
            add(hashMap.get(helperWidget.mWidgets[i9]));
        }
    }

    public int findGroupInDependents(int i8) {
        int i9;
        int i10;
        for (int i11 = 0; i11 < this.mWidgetsCount; i11++) {
            ConstraintWidget constraintWidget = this.mWidgets[i11];
            if (i8 == 0 && (i10 = constraintWidget.horizontalGroup) != -1) {
                return i10;
            }
            if (i8 == 1 && (i9 = constraintWidget.verticalGroup) != -1) {
                return i9;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void removeAllIds() {
        this.mWidgetsCount = 0;
        Arrays.fill(this.mWidgets, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void updateConstraints(ConstraintWidgetContainer constraintWidgetContainer) {
    }
}
