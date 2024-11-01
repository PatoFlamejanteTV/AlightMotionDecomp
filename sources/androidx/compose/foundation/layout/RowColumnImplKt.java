package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2075q;
import e6.AbstractC2829a;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class RowColumnImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2073o MaxIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxHeight();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2073o MaxIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxWidth();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2073o MinIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinHeight();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMinHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2073o MinIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinWidth();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMinWidth();
    }

    public static final CrossAxisAlignment getCrossAxisAlignment(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean getFill(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    public static final RowColumnParentData getRowColumnParentData(IntrinsicMeasurable intrinsicMeasurable) {
        AbstractC3292y.i(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    public static final float getWeight(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, int i8, int i9) {
        int d8;
        int i10;
        int min = Math.min((list.size() - 1) * i9, i8);
        int size = list.size();
        float f8 = 0.0f;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i12);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int min2 = Math.min(((Number) interfaceC2072n.invoke(intrinsicMeasurable, Integer.MAX_VALUE)).intValue(), i8 - min);
                min += min2;
                i11 = Math.max(i11, ((Number) interfaceC2072n2.invoke(intrinsicMeasurable, Integer.valueOf(min2))).intValue());
            } else if (weight > 0.0f) {
                f8 += weight;
            }
        }
        if (f8 == 0.0f) {
            d8 = 0;
        } else if (i8 == Integer.MAX_VALUE) {
            d8 = Integer.MAX_VALUE;
        } else {
            d8 = AbstractC2829a.d(Math.max(i8 - min, 0) / f8);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i13);
            float weight2 = getWeight(getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                if (d8 != Integer.MAX_VALUE) {
                    i10 = AbstractC2829a.d(d8 * weight2);
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                i11 = Math.max(i11, ((Number) interfaceC2072n2.invoke(intrinsicMeasurable2, Integer.valueOf(i10))).intValue());
            }
        }
        return i11;
    }

    private static final int intrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC2072n interfaceC2072n, int i8, int i9) {
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        float f8 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i12);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            int intValue = ((Number) interfaceC2072n.invoke(intrinsicMeasurable, Integer.valueOf(i8))).intValue();
            if (weight == 0.0f) {
                i11 += intValue;
            } else if (weight > 0.0f) {
                f8 += weight;
                i10 = Math.max(i10, AbstractC2829a.d(intValue / weight));
            }
        }
        return AbstractC2829a.d(i10 * f8) + i11 + ((list.size() - 1) * i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int intrinsicSize(List<? extends IntrinsicMeasurable> list, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, int i8, int i9, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        if (layoutOrientation == layoutOrientation2) {
            return intrinsicMainAxisSize(list, interfaceC2072n, i8, i9);
        }
        return intrinsicCrossAxisSize(list, interfaceC2072n2, interfaceC2072n, i8, i9);
    }

    public static final boolean isRelative(RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout_release();
        }
        return false;
    }

    /* renamed from: rowColumnMeasurePolicy-TDGSqEk, reason: not valid java name */
    public static final MeasurePolicy m602rowColumnMeasurePolicyTDGSqEk(final LayoutOrientation orientation, final InterfaceC2075q arrangement, final float f8, final SizeMode crossAxisSize, final CrossAxisAlignment crossAxisAlignment) {
        AbstractC3292y.i(orientation, "orientation");
        AbstractC3292y.i(arrangement, "arrangement");
        AbstractC3292y.i(crossAxisSize, "crossAxisSize");
        AbstractC3292y.i(crossAxisAlignment, "crossAxisAlignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
                InterfaceC2073o MaxIntrinsicHeightMeasureBlock;
                AbstractC3292y.i(intrinsicMeasureScope, "<this>");
                AbstractC3292y.i(measurables, "measurables");
                MaxIntrinsicHeightMeasureBlock = RowColumnImplKt.MaxIntrinsicHeightMeasureBlock(LayoutOrientation.this);
                return ((Number) MaxIntrinsicHeightMeasureBlock.invoke(measurables, Integer.valueOf(i8), Integer.valueOf(intrinsicMeasureScope.mo419roundToPx0680j_4(f8)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
                InterfaceC2073o MaxIntrinsicWidthMeasureBlock;
                AbstractC3292y.i(intrinsicMeasureScope, "<this>");
                AbstractC3292y.i(measurables, "measurables");
                MaxIntrinsicWidthMeasureBlock = RowColumnImplKt.MaxIntrinsicWidthMeasureBlock(LayoutOrientation.this);
                return ((Number) MaxIntrinsicWidthMeasureBlock.invoke(measurables, Integer.valueOf(i8), Integer.valueOf(intrinsicMeasureScope.mo419roundToPx0680j_4(f8)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo109measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j8) {
                int crossAxisSize2;
                int mainAxisSize;
                AbstractC3292y.i(measure, "$this$measure");
                AbstractC3292y.i(measurables, "measurables");
                RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(LayoutOrientation.this, arrangement, f8, crossAxisSize, crossAxisAlignment, measurables, new Placeable[measurables.size()], null);
                RowColumnMeasureHelperResult m604measureWithoutPlacing_EkL_Y = rowColumnMeasurementHelper.m604measureWithoutPlacing_EkL_Y(measure, j8, 0, measurables.size());
                if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                    crossAxisSize2 = m604measureWithoutPlacing_EkL_Y.getMainAxisSize();
                    mainAxisSize = m604measureWithoutPlacing_EkL_Y.getCrossAxisSize();
                } else {
                    crossAxisSize2 = m604measureWithoutPlacing_EkL_Y.getCrossAxisSize();
                    mainAxisSize = m604measureWithoutPlacing_EkL_Y.getMainAxisSize();
                }
                return MeasureScope.CC.q(measure, crossAxisSize2, mainAxisSize, null, new RowColumnImplKt$rowColumnMeasurePolicy$1$measure$1(rowColumnMeasurementHelper, m604measureWithoutPlacing_EkL_Y, measure), 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
                InterfaceC2073o MinIntrinsicHeightMeasureBlock;
                AbstractC3292y.i(intrinsicMeasureScope, "<this>");
                AbstractC3292y.i(measurables, "measurables");
                MinIntrinsicHeightMeasureBlock = RowColumnImplKt.MinIntrinsicHeightMeasureBlock(LayoutOrientation.this);
                return ((Number) MinIntrinsicHeightMeasureBlock.invoke(measurables, Integer.valueOf(i8), Integer.valueOf(intrinsicMeasureScope.mo419roundToPx0680j_4(f8)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
                InterfaceC2073o MinIntrinsicWidthMeasureBlock;
                AbstractC3292y.i(intrinsicMeasureScope, "<this>");
                AbstractC3292y.i(measurables, "measurables");
                MinIntrinsicWidthMeasureBlock = RowColumnImplKt.MinIntrinsicWidthMeasureBlock(LayoutOrientation.this);
                return ((Number) MinIntrinsicWidthMeasureBlock.invoke(measurables, Integer.valueOf(i8), Integer.valueOf(intrinsicMeasureScope.mo419roundToPx0680j_4(f8)))).intValue();
            }
        };
    }
}
