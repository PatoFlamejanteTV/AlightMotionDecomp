package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.AlignmentLineKt;
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
import c6.InterfaceC2072n;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z8, float f8, PaddingValues paddingValues) {
        AbstractC3292y.i(paddingValues, "paddingValues");
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
        Object obj5;
        int i12;
        int i13;
        boolean z8;
        int m1848calculateHeightjCXOeKk;
        List<? extends IntrinsicMeasurable> list2 = list;
        for (Object obj6 : list2) {
            if (AbstractC3292y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj6), "TextField")) {
                int intValue = ((Number) interfaceC2072n.invoke(obj6, Integer.valueOf(i8))).intValue();
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
                    if (it4.hasNext()) {
                        obj5 = it4.next();
                        if (AbstractC3292y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), "Hint")) {
                            break;
                        }
                    } else {
                        obj5 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
                if (intrinsicMeasurable4 != null) {
                    i12 = ((Number) interfaceC2072n.invoke(intrinsicMeasurable4, Integer.valueOf(i8))).intValue();
                } else {
                    i12 = 0;
                }
                Iterator<T> it5 = list2.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next = it5.next();
                    if (AbstractC3292y.d(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), TextFieldImplKt.SupportingId)) {
                        obj = next;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj;
                if (intrinsicMeasurable5 != null) {
                    i13 = ((Number) interfaceC2072n.invoke(intrinsicMeasurable5, Integer.valueOf(i8))).intValue();
                } else {
                    i13 = 0;
                }
                if (i9 > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                m1848calculateHeightjCXOeKk = TextFieldKt.m1848calculateHeightjCXOeKk(intValue, z8, i9, i11, i10, i12, i13, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m1848calculateHeightjCXOeKk;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> list, int i8, InterfaceC2072n interfaceC2072n) {
        Object obj;
        Object obj2;
        int i9;
        Object obj3;
        int i10;
        Object obj4;
        int i11;
        int i12;
        int m1849calculateWidthVsPV1Ek;
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
                m1849calculateWidthVsPV1Ek = TextFieldKt.m1849calculateWidthVsPV1Ek(i11, i10, intValue, i9, i12, TextFieldImplKt.getZeroConstraints());
                return m1849calculateWidthVsPV1Ek;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i8, TextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        return intrinsicWidth(measurables, i8, TextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
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
        int i8;
        int i9;
        Object obj4;
        Placeable placeable4;
        Object obj5;
        Placeable placeable5;
        int m1849calculateWidthVsPV1Ek;
        boolean z8;
        int m1848calculateHeightjCXOeKk;
        int i10;
        int i11;
        TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurables, "measurables");
        int mo419roundToPx0680j_4 = measure.mo419roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.mo530calculateTopPaddingD9Ej5fM());
        int mo419roundToPx0680j_42 = measure.mo419roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.mo527calculateBottomPaddingD9Ej5fM());
        int mo419roundToPx0680j_43 = measure.mo419roundToPx0680j_4(TextFieldKt.getTextFieldTopPadding());
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
        int max = Math.max(0, TextFieldImplKt.heightOrZero(placeable));
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
        int max2 = Math.max(max, TextFieldImplKt.heightOrZero(placeable2));
        int i12 = -widthOrZero2;
        long m5139offsetNN6EwU = ConstraintsKt.m5139offsetNN6EwU(m5114copyZbe2FdA$default, i12, -mo419roundToPx0680j_42);
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
            i8 = placeable3.get(AlignmentLineKt.getLastBaseline());
            if (i8 == Integer.MIN_VALUE) {
                i8 = placeable3.getHeight();
            }
        } else {
            i8 = 0;
        }
        int max3 = Math.max(i8, mo419roundToPx0680j_4);
        if (placeable3 != null) {
            i9 = max3 + mo419roundToPx0680j_43;
        } else {
            i9 = mo419roundToPx0680j_4;
        }
        long m5139offsetNN6EwU2 = ConstraintsKt.m5139offsetNN6EwU(Constraints.m5114copyZbe2FdA$default(j8, 0, 0, 0, 0, 11, null), i12, (-i9) - mo419roundToPx0680j_42);
        Iterator it4 = list.iterator();
        while (true) {
            int i13 = i8;
            if (it4.hasNext()) {
                Measurable measurable4 = (Measurable) it4.next();
                Iterator it5 = it4;
                if (AbstractC3292y.d(LayoutIdKt.getLayoutId(measurable4), "TextField")) {
                    Placeable mo4108measureBRTryo0 = measurable4.mo4108measureBRTryo0(m5139offsetNN6EwU2);
                    long m5114copyZbe2FdA$default2 = Constraints.m5114copyZbe2FdA$default(m5139offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                    Iterator it6 = list.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            Object next = it6.next();
                            Iterator it7 = it6;
                            if (AbstractC3292y.d(LayoutIdKt.getLayoutId((Measurable) next), "Hint")) {
                                obj4 = next;
                                break;
                            }
                            it6 = it7;
                        } else {
                            obj4 = null;
                            break;
                        }
                    }
                    Measurable measurable5 = (Measurable) obj4;
                    if (measurable5 != null) {
                        placeable4 = measurable5.mo4108measureBRTryo0(m5114copyZbe2FdA$default2);
                    } else {
                        placeable4 = null;
                    }
                    long m5114copyZbe2FdA$default3 = Constraints.m5114copyZbe2FdA$default(ConstraintsKt.m5140offsetNN6EwU$default(m5114copyZbe2FdA$default, 0, -Math.max(max2, Math.max(TextFieldImplKt.heightOrZero(mo4108measureBRTryo0), TextFieldImplKt.heightOrZero(placeable4)) + i9 + mo419roundToPx0680j_42), 1, null), 0, 0, 0, 0, 11, null);
                    Iterator<T> it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            obj5 = it8.next();
                            if (AbstractC3292y.d(LayoutIdKt.getLayoutId((Measurable) obj5), TextFieldImplKt.SupportingId)) {
                                break;
                            }
                        } else {
                            obj5 = null;
                            break;
                        }
                    }
                    Measurable measurable6 = (Measurable) obj5;
                    if (measurable6 != null) {
                        placeable5 = measurable6.mo4108measureBRTryo0(m5114copyZbe2FdA$default3);
                    } else {
                        placeable5 = null;
                    }
                    int heightOrZero = TextFieldImplKt.heightOrZero(placeable5);
                    m1849calculateWidthVsPV1Ek = TextFieldKt.m1849calculateWidthVsPV1Ek(TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeable2), mo4108measureBRTryo0.getWidth(), TextFieldImplKt.widthOrZero(placeable3), TextFieldImplKt.widthOrZero(placeable4), j8);
                    int height = mo4108measureBRTryo0.getHeight();
                    if (placeable3 != null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    m1848calculateHeightjCXOeKk = TextFieldKt.m1848calculateHeightjCXOeKk(height, z8, max3, TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeable2), TextFieldImplKt.heightOrZero(placeable4), TextFieldImplKt.heightOrZero(placeable5), j8, measure.getDensity(), textFieldMeasurePolicy.paddingValues);
                    int i14 = m1848calculateHeightjCXOeKk - heightOrZero;
                    for (Measurable measurable7 : list) {
                        if (AbstractC3292y.d(LayoutIdKt.getLayoutId(measurable7), TextFieldImplKt.ContainerId)) {
                            if (m1849calculateWidthVsPV1Ek != Integer.MAX_VALUE) {
                                i10 = m1849calculateWidthVsPV1Ek;
                            } else {
                                i10 = 0;
                            }
                            if (i14 != Integer.MAX_VALUE) {
                                i11 = i14;
                            } else {
                                i11 = 0;
                            }
                            return MeasureScope.CC.q(measure, m1849calculateWidthVsPV1Ek, m1848calculateHeightjCXOeKk, null, new TextFieldMeasurePolicy$measure$1(placeable3, mo419roundToPx0680j_4, i13, m1849calculateWidthVsPV1Ek, m1848calculateHeightjCXOeKk, mo4108measureBRTryo0, placeable4, placeable, placeable2, measurable7.mo4108measureBRTryo0(ConstraintsKt.Constraints(i10, m1849calculateWidthVsPV1Ek, i11, i14)), placeable5, this, max3, mo419roundToPx0680j_43, measure), 4, null);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                textFieldMeasurePolicy = this;
                it4 = it5;
                i8 = i13;
            } else {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i8, TextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        return intrinsicWidth(measurables, i8, TextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }
}
