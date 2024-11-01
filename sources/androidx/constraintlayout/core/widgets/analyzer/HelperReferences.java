package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class HelperReferences extends WidgetRun {
    public HelperReferences(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void addDependency(DependencyNode dependencyNode) {
        this.start.dependencies.add(dependencyNode);
        dependencyNode.targets.add(this.start);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void apply() {
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget instanceof Barrier) {
            this.start.delegateToWidgetRun = true;
            Barrier barrier = (Barrier) constraintWidget;
            int barrierType = barrier.getBarrierType();
            boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
            int i8 = 0;
            if (barrierType != 0) {
                if (barrierType != 1) {
                    if (barrierType != 2) {
                        if (barrierType == 3) {
                            this.start.type = DependencyNode.Type.BOTTOM;
                            while (i8 < barrier.mWidgetsCount) {
                                ConstraintWidget constraintWidget2 = barrier.mWidgets[i8];
                                if (allowsGoneWidget || constraintWidget2.getVisibility() != 8) {
                                    DependencyNode dependencyNode = constraintWidget2.verticalRun.end;
                                    dependencyNode.dependencies.add(this.start);
                                    this.start.targets.add(dependencyNode);
                                }
                                i8++;
                            }
                            addDependency(this.widget.verticalRun.start);
                            addDependency(this.widget.verticalRun.end);
                            return;
                        }
                        return;
                    }
                    this.start.type = DependencyNode.Type.TOP;
                    while (i8 < barrier.mWidgetsCount) {
                        ConstraintWidget constraintWidget3 = barrier.mWidgets[i8];
                        if (allowsGoneWidget || constraintWidget3.getVisibility() != 8) {
                            DependencyNode dependencyNode2 = constraintWidget3.verticalRun.start;
                            dependencyNode2.dependencies.add(this.start);
                            this.start.targets.add(dependencyNode2);
                        }
                        i8++;
                    }
                    addDependency(this.widget.verticalRun.start);
                    addDependency(this.widget.verticalRun.end);
                    return;
                }
                this.start.type = DependencyNode.Type.RIGHT;
                while (i8 < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget4 = barrier.mWidgets[i8];
                    if (allowsGoneWidget || constraintWidget4.getVisibility() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.horizontalRun.end;
                        dependencyNode3.dependencies.add(this.start);
                        this.start.targets.add(dependencyNode3);
                    }
                    i8++;
                }
                addDependency(this.widget.horizontalRun.start);
                addDependency(this.widget.horizontalRun.end);
                return;
            }
            this.start.type = DependencyNode.Type.LEFT;
            while (i8 < barrier.mWidgetsCount) {
                ConstraintWidget constraintWidget5 = barrier.mWidgets[i8];
                if (allowsGoneWidget || constraintWidget5.getVisibility() != 8) {
                    DependencyNode dependencyNode4 = constraintWidget5.horizontalRun.start;
                    dependencyNode4.dependencies.add(this.start);
                    this.start.targets.add(dependencyNode4);
                }
                i8++;
            }
            addDependency(this.widget.horizontalRun.start);
            addDependency(this.widget.horizontalRun.end);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget instanceof Barrier) {
            int barrierType = ((Barrier) constraintWidget).getBarrierType();
            if (barrierType != 0 && barrierType != 1) {
                this.widget.setY(this.start.value);
            } else {
                this.widget.setX(this.start.value);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void clear() {
        this.runGroup = null;
        this.start.clear();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void reset() {
        this.start.resolved = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean supportsWrapComputation() {
        return false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        Barrier barrier = (Barrier) this.widget;
        int barrierType = barrier.getBarrierType();
        Iterator<DependencyNode> it = this.start.targets.iterator();
        int i8 = 0;
        int i9 = -1;
        while (it.hasNext()) {
            int i10 = it.next().value;
            if (i9 == -1 || i10 < i9) {
                i9 = i10;
            }
            if (i8 < i10) {
                i8 = i10;
            }
        }
        if (barrierType != 0 && barrierType != 2) {
            this.start.resolve(i8 + barrier.getMargin());
        } else {
            this.start.resolve(i9 + barrier.getMargin());
        }
    }
}
