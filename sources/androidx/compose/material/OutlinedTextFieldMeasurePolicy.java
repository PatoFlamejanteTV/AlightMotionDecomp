package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.MathHelpersKt;
import c6.InterfaceC2072n;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final Function1 onLabelMeasured;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public OutlinedTextFieldMeasurePolicy(Function1 onLabelMeasured, boolean z8, float f8, PaddingValues paddingValues) {
        AbstractC3292y.i(onLabelMeasured, "onLabelMeasured");
        AbstractC3292y.i(paddingValues, "paddingValues");
        this.onLabelMeasured = onLabelMeasured;
        this.singleLine = z8;
        this.animationProgress = f8;
        this.paddingValues = paddingValues;
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8, InterfaceC2072n interfaceC2072n) {
        Object obj;
        Object obj2;
        int i9;
        Object obj3;
        int i10;
        Object obj4;
        int i11;
        int i12;
        int m1273calculateHeightO3s9Psw;
        List<? extends IntrinsicMeasurable> list2 = list;
        for (Object obj5 : list2) {
            if (AbstractC3292y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), "TextField")) {
                int intValue = ((Number) interfaceC2072n.invoke(obj5, Integer.valueOf(i8))).intValue();
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (AbstractC3292y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), "Label")) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                if (intrinsicMeasurable != null) {
                    i9 = ((Number) interfaceC2072n.invoke(intrinsicMeasurable, Integer.valueOf(i8))).intValue();
                } else {
                    i9 = 0;
                }
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (AbstractC3292y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), "Trailing")) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
                if (intrinsicMeasurable2 != null) {
                    i10 = ((Number) interfaceC2072n.invoke(intrinsicMeasurable2, Integer.valueOf(i8))).intValue();
                } else {
                    i10 = 0;
                }
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (AbstractC3292y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj4), "Leading")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                if (intrinsicMeasurable3 != null) {
                    i11 = ((Number) interfaceC2072n.invoke(intrinsicMeasurable3, Integer.valueOf(i8))).intValue();
                } else {
                    i11 = 0;
                }
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (AbstractC3292y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                if (intrinsicMeasurable4 != null) {
                    i12 = ((Number) interfaceC2072n.invoke(intrinsicMeasurable4, Integer.valueOf(i8))).intValue();
                } else {
                    i12 = 0;
                }
                m1273calculateHeightO3s9Psw = OutlinedTextFieldKt.m1273calculateHeightO3s9Psw(i11, i10, intValue, i9, i12, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m1273calculateHeightO3s9Psw;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8, InterfaceC2072n interfaceC2072n) {
        Object obj;
        Object obj2;
        int i9;
        Object obj3;
        int i10;
        Object obj4;
        int i11;
        int i12;
        int m1274calculateWidthO3s9Psw;
        List<? extends IntrinsicMeasurable> list2 = list;
        for (Object obj5 : list2) {
            if (AbstractC3292y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), "TextField")) {
                int intValue = ((Number) interfaceC2072n.invoke(obj5, Integer.valueOf(i8))).intValue();
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (AbstractC3292y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), "Label")) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                if (intrinsicMeasurable != null) {
                    i9 = ((Number) interfaceC2072n.invoke(intrinsicMeasurable, Integer.valueOf(i8))).intValue();
                } else {
                    i9 = 0;
                }
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (AbstractC3292y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), "Trailing")) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
                if (intrinsicMeasurable2 != null) {
                    i10 = ((Number) interfaceC2072n.invoke(intrinsicMeasurable2, Integer.valueOf(i8))).intValue();
                } else {
                    i10 = 0;
                }
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (AbstractC3292y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj4), "Leading")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                if (intrinsicMeasurable3 != null) {
                    i11 = ((Number) interfaceC2072n.invoke(intrinsicMeasurable3, Integer.valueOf(i8))).intValue();
                } else {
                    i11 = 0;
                }
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (AbstractC3292y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                if (intrinsicMeasurable4 != null) {
                    i12 = ((Number) interfaceC2072n.invoke(intrinsicMeasurable4, Integer.valueOf(i8))).intValue();
                } else {
                    i12 = 0;
                }
                m1274calculateWidthO3s9Psw = OutlinedTextFieldKt.m1274calculateWidthO3s9Psw(i11, i10, intValue, i9, i12, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m1274calculateWidthO3s9Psw;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i8, OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        return intrinsicWidth(intrinsicMeasureScope, measurables, i8, OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo109measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j8) {
        Object obj;
        Placeable placeable;
        Object obj2;
        Placeable placeable2;
        Object obj3;
        Placeable placeable3;
        Object obj4;
        Placeable placeable4;
        int m1274calculateWidthO3s9Psw;
        int m1273calculateHeightO3s9Psw;
        int i8;
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurables, "measurables");
        int mo419roundToPx0680j_4 = measure.mo419roundToPx0680j_4(this.paddingValues.mo527calculateBottomPaddingD9Ej5fM());
        long m5114copyZbe2FdA$default = Constraints.m5114copyZbe2FdA$default(j8, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list = measurables;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3292y.d(LayoutIdKt.getLayoutId((Measurable) obj), "Leading")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Measurable measurable = (Measurable) obj;
        if (measurable != null) {
            placeable = measurable.mo4108measureBRTryo0(m5114copyZbe2FdA$default);
        } else {
            placeable = null;
        }
        int widthOrZero = TextFieldImplKt.widthOrZero(placeable);
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (AbstractC3292y.d(LayoutIdKt.getLayoutId((Measurable) obj2), "Trailing")) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Measurable measurable2 = (Measurable) obj2;
        if (measurable2 != null) {
            placeable2 = measurable2.mo4108measureBRTryo0(ConstraintsKt.m5140offsetNN6EwU$default(m5114copyZbe2FdA$default, -widthOrZero, 0, 2, null));
        } else {
            placeable2 = null;
        }
        int widthOrZero2 = widthOrZero + TextFieldImplKt.widthOrZero(placeable2);
        int mo419roundToPx0680j_42 = measure.mo419roundToPx0680j_4(this.paddingValues.mo528calculateLeftPaddingu2uoSUM(measure.getLayoutDirection())) + measure.mo419roundToPx0680j_4(this.paddingValues.mo529calculateRightPaddingu2uoSUM(measure.getLayoutDirection()));
        int i9 = -widthOrZero2;
        int i10 = -mo419roundToPx0680j_4;
        long m5139offsetNN6EwU = ConstraintsKt.m5139offsetNN6EwU(m5114copyZbe2FdA$default, MathHelpersKt.lerp(i9 - mo419roundToPx0680j_42, -mo419roundToPx0680j_42, this.animationProgress), i10);
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj3 = it3.next();
                if (AbstractC3292y.d(LayoutIdKt.getLayoutId((Measurable) obj3), "Label")) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        Measurable measurable3 = (Measurable) obj3;
        if (measurable3 != null) {
            placeable3 = measurable3.mo4108measureBRTryo0(m5139offsetNN6EwU);
        } else {
            placeable3 = null;
        }
        if (placeable3 != null) {
            this.onLabelMeasured.invoke(Size.m2769boximpl(SizeKt.Size(placeable3.getWidth(), placeable3.getHeight())));
        }
        long m5114copyZbe2FdA$default2 = Constraints.m5114copyZbe2FdA$default(ConstraintsKt.m5139offsetNN6EwU(j8, i9, i10 - Math.max(TextFieldImplKt.heightOrZero(placeable3) / 2, measure.mo419roundToPx0680j_4(this.paddingValues.mo530calculateTopPaddingD9Ej5fM()))), 0, 0, 0, 0, 11, null);
        for (Measurable measurable4 : list) {
            if (AbstractC3292y.d(LayoutIdKt.getLayoutId(measurable4), "TextField")) {
                Placeable mo4108measureBRTryo0 = measurable4.mo4108measureBRTryo0(m5114copyZbe2FdA$default2);
                long m5114copyZbe2FdA$default3 = Constraints.m5114copyZbe2FdA$default(m5114copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj4 = it4.next();
                        if (AbstractC3292y.d(LayoutIdKt.getLayoutId((Measurable) obj4), "Hint")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                Measurable measurable5 = (Measurable) obj4;
                if (measurable5 != null) {
                    placeable4 = measurable5.mo4108measureBRTryo0(m5114copyZbe2FdA$default3);
                } else {
                    placeable4 = null;
                }
                m1274calculateWidthO3s9Psw = OutlinedTextFieldKt.m1274calculateWidthO3s9Psw(TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeable2), mo4108measureBRTryo0.getWidth(), TextFieldImplKt.widthOrZero(placeable3), TextFieldImplKt.widthOrZero(placeable4), this.animationProgress, j8, measure.getDensity(), this.paddingValues);
                m1273calculateHeightO3s9Psw = OutlinedTextFieldKt.m1273calculateHeightO3s9Psw(TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeable2), mo4108measureBRTryo0.getHeight(), TextFieldImplKt.heightOrZero(placeable3), TextFieldImplKt.heightOrZero(placeable4), this.animationProgress, j8, measure.getDensity(), this.paddingValues);
                for (Measurable measurable6 : list) {
                    if (AbstractC3292y.d(LayoutIdKt.getLayoutId(measurable6), OutlinedTextFieldKt.BorderId)) {
                        int i11 = 0;
                        if (m1274calculateWidthO3s9Psw != Integer.MAX_VALUE) {
                            i8 = m1274calculateWidthO3s9Psw;
                        } else {
                            i8 = 0;
                        }
                        if (m1273calculateHeightO3s9Psw != Integer.MAX_VALUE) {
                            i11 = m1273calculateHeightO3s9Psw;
                        }
                        return MeasureScope.CC.q(measure, m1274calculateWidthO3s9Psw, m1273calculateHeightO3s9Psw, null, new OutlinedTextFieldMeasurePolicy$measure$2(m1273calculateHeightO3s9Psw, m1274calculateWidthO3s9Psw, placeable, placeable2, mo4108measureBRTryo0, placeable3, placeable4, measurable6.mo4108measureBRTryo0(ConstraintsKt.Constraints(i8, m1274calculateWidthO3s9Psw, i11, m1273calculateHeightO3s9Psw)), this, measure), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i8, OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        return intrinsicWidth(intrinsicMeasureScope, measurables, i8, OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }
}
