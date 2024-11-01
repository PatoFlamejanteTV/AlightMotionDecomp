package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class BasicMeasure {
    public static final int AT_MOST = Integer.MIN_VALUE;
    private static final boolean DEBUG = false;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    private static final int MODE_SHIFT = 30;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;
    private ConstraintWidgetContainer constraintWidgetContainer;
    private final ArrayList<ConstraintWidget> mVariableDimensionsWidgets = new ArrayList<>();
    private Measure mMeasure = new Measure();

    /* loaded from: classes.dex */
    public static class Measure {
        public static int SELF_DIMENSIONS = 0;
        public static int TRY_GIVEN_DIMENSIONS = 1;
        public static int USE_GIVEN_DIMENSIONS = 2;
        public ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measureStrategy;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;
    }

    /* loaded from: classes.dex */
    public interface Measurer {
        void didMeasures();

        void measure(ConstraintWidget constraintWidget, Measure measure);
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.constraintWidgetContainer = constraintWidgetContainer;
    }

    private boolean measure(Measurer measurer, ConstraintWidget constraintWidget, int i8) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        this.mMeasure.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
        this.mMeasure.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
        this.mMeasure.horizontalDimension = constraintWidget.getWidth();
        this.mMeasure.verticalDimension = constraintWidget.getHeight();
        Measure measure = this.mMeasure;
        measure.measuredNeedsSolverPass = false;
        measure.measureStrategy = i8;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (measure.verticalBehavior == dimensionBehaviour2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8 && constraintWidget.mDimensionRatio > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 && constraintWidget.mDimensionRatio > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
            measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z11 && constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
            measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        measurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
        Measure measure2 = this.mMeasure;
        measure2.measureStrategy = Measure.SELF_DIMENSIONS;
        return measure2.measuredNeedsSolverPass;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:            if (r8 != r9) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0095, code lost:            if (r5.mDimensionRatio <= 0.0f) goto L56;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void measureChildren(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r13) {
        /*
            r12 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r13.mChildren
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.optimizeFor(r1)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r2 = r13.getMeasurer()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r0) goto Lb0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r5 = r13.mChildren
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r6 == 0) goto L22
            goto Lac
        L22:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r6 == 0) goto L28
            goto Lac
        L28:
            boolean r6 = r5.isInVirtualLayout()
            if (r6 == 0) goto L30
            goto Lac
        L30:
            if (r1 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r5.horizontalRun
            if (r6 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r7 = r5.verticalRun
            if (r7 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r6.dimension
            boolean r6 = r6.resolved
            if (r6 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r7.dimension
            boolean r6 = r6.resolved
            if (r6 == 0) goto L48
            goto Lac
        L48:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r5.getDimensionBehaviour(r3)
            r7 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.getDimensionBehaviour(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.mMatchConstraintDefaultWidth
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r10 = r5.mMatchConstraintDefaultHeight
            if (r10 == r7) goto L61
            r10 = 1
            goto L62
        L61:
            r10 = 0
        L62:
            if (r10 != 0) goto L98
            boolean r11 = r13.optimizeFor(r7)
            if (r11 == 0) goto L98
            boolean r11 = r5 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r11 != 0) goto L98
            if (r6 != r9) goto L7d
            int r11 = r5.mMatchConstraintDefaultWidth
            if (r11 != 0) goto L7d
            if (r8 == r9) goto L7d
            boolean r11 = r5.isInHorizontalChain()
            if (r11 != 0) goto L7d
            r10 = 1
        L7d:
            if (r8 != r9) goto L8c
            int r11 = r5.mMatchConstraintDefaultHeight
            if (r11 != 0) goto L8c
            if (r6 == r9) goto L8c
            boolean r11 = r5.isInHorizontalChain()
            if (r11 != 0) goto L8c
            r10 = 1
        L8c:
            if (r6 == r9) goto L90
            if (r8 != r9) goto L98
        L90:
            float r6 = r5.mDimensionRatio
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L98
            goto L99
        L98:
            r7 = r10
        L99:
            if (r7 == 0) goto L9c
            goto Lac
        L9c:
            int r6 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            r12.measure(r2, r5, r6)
            androidx.constraintlayout.core.Metrics r5 = r13.mMetrics
            if (r5 == 0) goto Lac
            long r6 = r5.measuredWidgets
            r8 = 1
            long r6 = r6 + r8
            r5.measuredWidgets = r6
        Lac:
            int r4 = r4 + 1
            goto L12
        Lb0:
            r2.didMeasures()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.measureChildren(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer):void");
    }

    private void solveLinearSystem(ConstraintWidgetContainer constraintWidgetContainer, String str, int i8, int i9, int i10) {
        int minWidth = constraintWidgetContainer.getMinWidth();
        int minHeight = constraintWidgetContainer.getMinHeight();
        constraintWidgetContainer.setMinWidth(0);
        constraintWidgetContainer.setMinHeight(0);
        constraintWidgetContainer.setWidth(i9);
        constraintWidgetContainer.setHeight(i10);
        constraintWidgetContainer.setMinWidth(minWidth);
        constraintWidgetContainer.setMinHeight(minHeight);
        this.constraintWidgetContainer.setPass(i8);
        this.constraintWidgetContainer.layout();
    }

    public long solverMeasure(ConstraintWidgetContainer constraintWidgetContainer, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z8;
        boolean z9;
        boolean z10;
        int i17;
        int i18;
        boolean z11;
        boolean z12;
        boolean z13;
        int i19;
        Measurer measurer;
        int i20;
        int i21;
        int i22;
        boolean z14;
        boolean z15;
        boolean z16;
        Metrics metrics;
        boolean z17;
        boolean z18;
        boolean z19;
        Measurer measurer2 = constraintWidgetContainer.getMeasurer();
        int size = constraintWidgetContainer.mChildren.size();
        int width = constraintWidgetContainer.getWidth();
        int height = constraintWidgetContainer.getHeight();
        boolean enabled = Optimizer.enabled(i8, 128);
        if (!enabled && !Optimizer.enabled(i8, 64)) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z8) {
            for (int i23 = 0; i23 < size; i23++) {
                ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i23);
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (horizontalDimensionBehaviour == dimensionBehaviour) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (constraintWidget.getVerticalDimensionBehaviour() == dimensionBehaviour) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z17 && z18 && constraintWidget.getDimensionRatio() > 0.0f) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if ((constraintWidget.isInHorizontalChain() && z19) || ((constraintWidget.isInVerticalChain() && z19) || (constraintWidget instanceof VirtualLayout) || constraintWidget.isInHorizontalChain() || constraintWidget.isInVerticalChain())) {
                    z8 = false;
                    break;
                }
            }
        }
        if (z8 && (metrics = LinearSystem.sMetrics) != null) {
            metrics.measures++;
        }
        if ((i11 == 1073741824 && i13 == 1073741824) || enabled) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z20 = z8 & z9;
        if (z20) {
            int min = Math.min(constraintWidgetContainer.getMaxWidth(), i12);
            int min2 = Math.min(constraintWidgetContainer.getMaxHeight(), i14);
            if (i11 == 1073741824 && constraintWidgetContainer.getWidth() != min) {
                constraintWidgetContainer.setWidth(min);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i13 == 1073741824 && constraintWidgetContainer.getHeight() != min2) {
                constraintWidgetContainer.setHeight(min2);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i11 == 1073741824 && i13 == 1073741824) {
                z10 = constraintWidgetContainer.directMeasure(enabled);
                i17 = 2;
            } else {
                boolean directMeasureSetup = constraintWidgetContainer.directMeasureSetup(enabled);
                if (i11 == 1073741824) {
                    directMeasureSetup &= constraintWidgetContainer.directMeasureWithOrientation(enabled, 0);
                    i17 = 1;
                } else {
                    i17 = 0;
                }
                if (i13 == 1073741824) {
                    z10 = constraintWidgetContainer.directMeasureWithOrientation(enabled, 1) & directMeasureSetup;
                    i17++;
                } else {
                    z10 = directMeasureSetup;
                }
            }
            if (z10) {
                if (i11 == 1073741824) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i13 == 1073741824) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                constraintWidgetContainer.updateFromRuns(z15, z16);
            }
        } else {
            z10 = false;
            i17 = 0;
        }
        if (!z10 || i17 != 2) {
            int optimizationLevel = constraintWidgetContainer.getOptimizationLevel();
            if (size > 0) {
                measureChildren(constraintWidgetContainer);
            }
            updateHierarchy(constraintWidgetContainer);
            int size2 = this.mVariableDimensionsWidgets.size();
            if (size > 0) {
                solveLinearSystem(constraintWidgetContainer, "First pass", 0, width, height);
            }
            if (size2 > 0) {
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour2 = constraintWidgetContainer.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (horizontalDimensionBehaviour2 == dimensionBehaviour2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (constraintWidgetContainer.getVerticalDimensionBehaviour() == dimensionBehaviour2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int max = Math.max(constraintWidgetContainer.getWidth(), this.constraintWidgetContainer.getMinWidth());
                int max2 = Math.max(constraintWidgetContainer.getHeight(), this.constraintWidgetContainer.getMinHeight());
                int i24 = 0;
                boolean z21 = false;
                while (i24 < size2) {
                    ConstraintWidget constraintWidget2 = this.mVariableDimensionsWidgets.get(i24);
                    if (!(constraintWidget2 instanceof VirtualLayout)) {
                        i20 = optimizationLevel;
                        i22 = width;
                        i21 = height;
                    } else {
                        int width2 = constraintWidget2.getWidth();
                        i20 = optimizationLevel;
                        int height2 = constraintWidget2.getHeight();
                        i21 = height;
                        boolean measure = measure(measurer2, constraintWidget2, Measure.TRY_GIVEN_DIMENSIONS) | z21;
                        Metrics metrics2 = constraintWidgetContainer.mMetrics;
                        i22 = width;
                        if (metrics2 != null) {
                            metrics2.measuredMatchWidgets++;
                        }
                        int width3 = constraintWidget2.getWidth();
                        int height3 = constraintWidget2.getHeight();
                        if (width3 != width2) {
                            constraintWidget2.setWidth(width3);
                            if (z11 && constraintWidget2.getRight() > max) {
                                max = Math.max(max, constraintWidget2.getRight() + constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                            }
                            z14 = true;
                        } else {
                            z14 = measure;
                        }
                        if (height3 != height2) {
                            constraintWidget2.setHeight(height3);
                            if (z12 && constraintWidget2.getBottom() > max2) {
                                max2 = Math.max(max2, constraintWidget2.getBottom() + constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                            }
                            z14 = true;
                        }
                        z21 = z14 | ((VirtualLayout) constraintWidget2).needSolverPass();
                    }
                    i24++;
                    optimizationLevel = i20;
                    height = i21;
                    width = i22;
                }
                int i25 = optimizationLevel;
                int i26 = width;
                int i27 = height;
                int i28 = 2;
                int i29 = 0;
                while (i29 < i28) {
                    int i30 = 0;
                    while (i30 < size2) {
                        ConstraintWidget constraintWidget3 = this.mVariableDimensionsWidgets.get(i30);
                        if (((constraintWidget3 instanceof Helper) && !(constraintWidget3 instanceof VirtualLayout)) || (constraintWidget3 instanceof Guideline) || constraintWidget3.getVisibility() == 8 || ((z20 && constraintWidget3.horizontalRun.dimension.resolved && constraintWidget3.verticalRun.dimension.resolved) || (constraintWidget3 instanceof VirtualLayout))) {
                            z13 = z20;
                            i19 = size2;
                            measurer = measurer2;
                        } else {
                            int width4 = constraintWidget3.getWidth();
                            int height4 = constraintWidget3.getHeight();
                            int baselineDistance = constraintWidget3.getBaselineDistance();
                            int i31 = Measure.TRY_GIVEN_DIMENSIONS;
                            z13 = z20;
                            if (i29 == 1) {
                                i31 = Measure.USE_GIVEN_DIMENSIONS;
                            }
                            boolean measure2 = measure(measurer2, constraintWidget3, i31) | z21;
                            Metrics metrics3 = constraintWidgetContainer.mMetrics;
                            i19 = size2;
                            measurer = measurer2;
                            if (metrics3 != null) {
                                metrics3.measuredMatchWidgets++;
                            }
                            int width5 = constraintWidget3.getWidth();
                            int height5 = constraintWidget3.getHeight();
                            if (width5 != width4) {
                                constraintWidget3.setWidth(width5);
                                if (z11 && constraintWidget3.getRight() > max) {
                                    max = Math.max(max, constraintWidget3.getRight() + constraintWidget3.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                                }
                                measure2 = true;
                            }
                            if (height5 != height4) {
                                constraintWidget3.setHeight(height5);
                                if (z12 && constraintWidget3.getBottom() > max2) {
                                    max2 = Math.max(max2, constraintWidget3.getBottom() + constraintWidget3.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                                }
                                measure2 = true;
                            }
                            if (constraintWidget3.hasBaseline() && baselineDistance != constraintWidget3.getBaselineDistance()) {
                                z21 = true;
                            } else {
                                z21 = measure2;
                            }
                        }
                        i30++;
                        measurer2 = measurer;
                        z20 = z13;
                        size2 = i19;
                    }
                    boolean z22 = z20;
                    int i32 = size2;
                    Measurer measurer3 = measurer2;
                    if (!z21) {
                        break;
                    }
                    i29++;
                    solveLinearSystem(constraintWidgetContainer, "intermediate pass", i29, i26, i27);
                    measurer2 = measurer3;
                    z20 = z22;
                    size2 = i32;
                    i28 = 2;
                    z21 = false;
                }
                i18 = i25;
            } else {
                i18 = optimizationLevel;
            }
            constraintWidgetContainer.setOptimizationLevel(i18);
            return 0L;
        }
        return 0L;
    }

    public void updateHierarchy(ConstraintWidgetContainer constraintWidgetContainer) {
        this.mVariableDimensionsWidgets.clear();
        int size = constraintWidgetContainer.mChildren.size();
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i8);
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (horizontalDimensionBehaviour == dimensionBehaviour || constraintWidget.getVerticalDimensionBehaviour() == dimensionBehaviour) {
                this.mVariableDimensionsWidgets.add(constraintWidget);
            }
        }
        constraintWidgetContainer.invalidateGraph();
    }
}
