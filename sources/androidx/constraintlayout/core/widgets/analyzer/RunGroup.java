package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    int direction;
    WidgetRun firstRun;
    int groupIndex;
    WidgetRun lastRun;
    public int position = 0;
    public boolean dual = false;
    ArrayList<WidgetRun> runs = new ArrayList<>();

    public RunGroup(WidgetRun widgetRun, int i8) {
        this.firstRun = null;
        this.lastRun = null;
        int i9 = index;
        this.groupIndex = i9;
        index = i9 + 1;
        this.firstRun = widgetRun;
        this.lastRun = widgetRun;
        this.direction = i8;
    }

    private boolean defineTerminalWidget(WidgetRun widgetRun, int i8) {
        DependencyNode dependencyNode;
        WidgetRun widgetRun2;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun3;
        if (!widgetRun.widget.isTerminalWidget[i8]) {
            return false;
        }
        for (Dependency dependency : widgetRun.start.dependencies) {
            if ((dependency instanceof DependencyNode) && (widgetRun3 = (dependencyNode2 = (DependencyNode) dependency).run) != widgetRun && dependencyNode2 == widgetRun3.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator<WidgetRun> it = ((ChainRun) widgetRun).widgets.iterator();
                    while (it.hasNext()) {
                        defineTerminalWidget(it.next(), i8);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.widget.isTerminalWidget[i8] = false;
                }
                defineTerminalWidget(dependencyNode2.run, i8);
            }
        }
        for (Dependency dependency2 : widgetRun.end.dependencies) {
            if ((dependency2 instanceof DependencyNode) && (widgetRun2 = (dependencyNode = (DependencyNode) dependency2).run) != widgetRun && dependencyNode == widgetRun2.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator<WidgetRun> it2 = ((ChainRun) widgetRun).widgets.iterator();
                    while (it2.hasNext()) {
                        defineTerminalWidget(it2.next(), i8);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.widget.isTerminalWidget[i8] = false;
                }
                defineTerminalWidget(dependencyNode.run, i8);
            }
        }
        return false;
    }

    private long traverseEnd(DependencyNode dependencyNode, long j8) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof HelperReferences) {
            return j8;
        }
        int size = dependencyNode.dependencies.size();
        long j9 = j8;
        for (int i8 = 0; i8 < size; i8++) {
            Dependency dependency = dependencyNode.dependencies.get(i8);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    j9 = Math.min(j9, traverseEnd(dependencyNode2, dependencyNode2.margin + j8));
                }
            }
        }
        if (dependencyNode == widgetRun.end) {
            long wrapDimension = j8 - widgetRun.getWrapDimension();
            return Math.min(Math.min(j9, traverseEnd(widgetRun.start, wrapDimension)), wrapDimension - widgetRun.start.margin);
        }
        return j9;
    }

    private long traverseStart(DependencyNode dependencyNode, long j8) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof HelperReferences) {
            return j8;
        }
        int size = dependencyNode.dependencies.size();
        long j9 = j8;
        for (int i8 = 0; i8 < size; i8++) {
            Dependency dependency = dependencyNode.dependencies.get(i8);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    j9 = Math.max(j9, traverseStart(dependencyNode2, dependencyNode2.margin + j8));
                }
            }
        }
        if (dependencyNode == widgetRun.start) {
            long wrapDimension = j8 + widgetRun.getWrapDimension();
            return Math.max(Math.max(j9, traverseStart(widgetRun.end, wrapDimension)), wrapDimension - widgetRun.end.margin);
        }
        return j9;
    }

    public void add(WidgetRun widgetRun) {
        this.runs.add(widgetRun);
        this.lastRun = widgetRun;
    }

    public long computeWrapSize(ConstraintWidgetContainer constraintWidgetContainer, int i8) {
        WidgetRun widgetRun;
        WidgetRun widgetRun2;
        long wrapDimension;
        int i9;
        WidgetRun widgetRun3 = this.firstRun;
        long j8 = 0;
        if (widgetRun3 instanceof ChainRun) {
            if (((ChainRun) widgetRun3).orientation != i8) {
                return 0L;
            }
        } else if (i8 == 0) {
            if (!(widgetRun3 instanceof HorizontalWidgetRun)) {
                return 0L;
            }
        } else if (!(widgetRun3 instanceof VerticalWidgetRun)) {
            return 0L;
        }
        if (i8 == 0) {
            widgetRun = constraintWidgetContainer.horizontalRun;
        } else {
            widgetRun = constraintWidgetContainer.verticalRun;
        }
        DependencyNode dependencyNode = widgetRun.start;
        if (i8 == 0) {
            widgetRun2 = constraintWidgetContainer.horizontalRun;
        } else {
            widgetRun2 = constraintWidgetContainer.verticalRun;
        }
        DependencyNode dependencyNode2 = widgetRun2.end;
        boolean contains = widgetRun3.start.targets.contains(dependencyNode);
        boolean contains2 = this.firstRun.end.targets.contains(dependencyNode2);
        long wrapDimension2 = this.firstRun.getWrapDimension();
        if (contains && contains2) {
            long traverseStart = traverseStart(this.firstRun.start, 0L);
            long traverseEnd = traverseEnd(this.firstRun.end, 0L);
            long j9 = traverseStart - wrapDimension2;
            WidgetRun widgetRun4 = this.firstRun;
            int i10 = widgetRun4.end.margin;
            if (j9 >= (-i10)) {
                j9 += i10;
            }
            int i11 = widgetRun4.start.margin;
            long j10 = ((-traverseEnd) - wrapDimension2) - i11;
            if (j10 >= i11) {
                j10 -= i11;
            }
            float biasPercent = widgetRun4.widget.getBiasPercent(i8);
            if (biasPercent > 0.0f) {
                j8 = (((float) j10) / biasPercent) + (((float) j9) / (1.0f - biasPercent));
            }
            float f8 = (float) j8;
            long j11 = (f8 * biasPercent) + 0.5f + wrapDimension2 + (f8 * (1.0f - biasPercent)) + 0.5f;
            wrapDimension = r13.start.margin + j11;
            i9 = this.firstRun.end.margin;
        } else {
            if (contains) {
                return Math.max(traverseStart(this.firstRun.start, r13.margin), this.firstRun.start.margin + wrapDimension2);
            }
            if (contains2) {
                return Math.max(-traverseEnd(this.firstRun.end, r13.margin), (-this.firstRun.end.margin) + wrapDimension2);
            }
            wrapDimension = r13.start.margin + this.firstRun.getWrapDimension();
            i9 = this.firstRun.end.margin;
        }
        return wrapDimension - i9;
    }

    public void defineTerminalWidgets(boolean z8, boolean z9) {
        if (z8) {
            WidgetRun widgetRun = this.firstRun;
            if (widgetRun instanceof HorizontalWidgetRun) {
                defineTerminalWidget(widgetRun, 0);
            }
        }
        if (z9) {
            WidgetRun widgetRun2 = this.firstRun;
            if (widgetRun2 instanceof VerticalWidgetRun) {
                defineTerminalWidget(widgetRun2, 1);
            }
        }
    }
}
