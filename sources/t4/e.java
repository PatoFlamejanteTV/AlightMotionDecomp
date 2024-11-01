package t4;

import Q5.I;
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
import i6.m;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class e implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f39587a;

    /* renamed from: b, reason: collision with root package name */
    private final float f39588b;

    /* renamed from: c, reason: collision with root package name */
    private final PaddingValues f39589c;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f39590a = new a();

        a() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i8) {
            AbstractC3292y.i(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i8));
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f39591a = new b();

        b() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i8) {
            AbstractC3292y.i(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i8));
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placeable f39592a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f39593b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f39594c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f39595d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f39596e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Placeable f39597f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Placeable f39598g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Placeable f39599h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Placeable f39600i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ e f39601j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f39602k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f39603l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ MeasureScope f39604m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Placeable placeable, int i8, int i9, int i10, int i11, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, e eVar, int i12, int i13, MeasureScope measureScope) {
            super(1);
            this.f39592a = placeable;
            this.f39593b = i8;
            this.f39594c = i9;
            this.f39595d = i10;
            this.f39596e = i11;
            this.f39597f = placeable2;
            this.f39598g = placeable3;
            this.f39599h = placeable4;
            this.f39600i = placeable5;
            this.f39601j = eVar;
            this.f39602k = i12;
            this.f39603l = i13;
            this.f39604m = measureScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return I.f8786a;
        }

        public final void invoke(Placeable.PlacementScope layout) {
            AbstractC3292y.i(layout, "$this$layout");
            if (this.f39592a == null) {
                t4.d.o(layout, this.f39595d, this.f39596e, this.f39597f, this.f39598g, this.f39599h, this.f39600i, this.f39601j.f39587a, this.f39604m.getDensity(), this.f39601j.f39589c);
                return;
            }
            int d8 = m.d(this.f39593b - this.f39594c, 0);
            t4.d.n(layout, this.f39595d, this.f39596e, this.f39597f, this.f39592a, this.f39598g, this.f39599h, this.f39600i, this.f39601j.f39587a, d8, this.f39603l + this.f39602k, this.f39601j.f39588b, this.f39604m.getDensity());
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f39605a = new d();

        d() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i8) {
            AbstractC3292y.i(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i8));
        }
    }

    /* renamed from: t4.e$e, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0893e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0893e f39606a = new C0893e();

        C0893e() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i8) {
            AbstractC3292y.i(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i8));
        }
    }

    public e(boolean z8, float f8, PaddingValues paddingValues) {
        AbstractC3292y.i(paddingValues, "paddingValues");
        this.f39587a = z8;
        this.f39588b = f8;
        this.f39589c = paddingValues;
    }

    private final int d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8, InterfaceC2072n interfaceC2072n) {
        Object obj;
        Object obj2;
        int i9;
        int i10;
        Object obj3;
        int i11;
        Object obj4;
        int i12;
        Object l8;
        int i13;
        boolean z8;
        int j8;
        Object l9;
        Object l10;
        Object l11;
        Object l12;
        int size = list.size();
        int i14 = 0;
        while (true) {
            obj = null;
            if (i14 < size) {
                obj2 = list.get(i14);
                l12 = t4.d.l((IntrinsicMeasurable) obj2);
                if (AbstractC3292y.d(l12, "Leading")) {
                    break;
                }
                i14++;
            } else {
                obj2 = null;
                break;
            }
        }
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
        if (intrinsicMeasurable != null) {
            i9 = i8 - intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE);
            i10 = ((Number) interfaceC2072n.invoke(intrinsicMeasurable, Integer.valueOf(i8))).intValue();
        } else {
            i9 = i8;
            i10 = 0;
        }
        int size2 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 < size2) {
                obj3 = list.get(i15);
                l11 = t4.d.l((IntrinsicMeasurable) obj3);
                if (AbstractC3292y.d(l11, "Trailing")) {
                    break;
                }
                i15++;
            } else {
                obj3 = null;
                break;
            }
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
        if (intrinsicMeasurable2 != null) {
            i9 -= intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE);
            i11 = ((Number) interfaceC2072n.invoke(intrinsicMeasurable2, Integer.valueOf(i8))).intValue();
        } else {
            i11 = 0;
        }
        int size3 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 < size3) {
                obj4 = list.get(i16);
                l10 = t4.d.l((IntrinsicMeasurable) obj4);
                if (AbstractC3292y.d(l10, "Label")) {
                    break;
                }
                i16++;
            } else {
                obj4 = null;
                break;
            }
        }
        Object obj5 = (IntrinsicMeasurable) obj4;
        if (obj5 != null) {
            i12 = ((Number) interfaceC2072n.invoke(obj5, Integer.valueOf(i9))).intValue();
        } else {
            i12 = 0;
        }
        int size4 = list.size();
        for (int i17 = 0; i17 < size4; i17++) {
            Object obj6 = list.get(i17);
            l8 = t4.d.l((IntrinsicMeasurable) obj6);
            if (AbstractC3292y.d(l8, "TextField")) {
                int intValue = ((Number) interfaceC2072n.invoke(obj6, Integer.valueOf(i9))).intValue();
                int size5 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i18);
                    l9 = t4.d.l((IntrinsicMeasurable) obj7);
                    if (AbstractC3292y.d(l9, "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i18++;
                }
                Object obj8 = (IntrinsicMeasurable) obj;
                if (obj8 != null) {
                    i13 = ((Number) interfaceC2072n.invoke(obj8, Integer.valueOf(i9))).intValue();
                } else {
                    i13 = 0;
                }
                if (i12 > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                j8 = t4.d.j(intValue, z8, i12, i10, i11, i13, AbstractC4007a.d(), intrinsicMeasureScope.getDensity(), this.f39589c);
                return j8;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int e(List list, int i8, InterfaceC2072n interfaceC2072n) {
        Object l8;
        Object obj;
        Object obj2;
        int i9;
        Object obj3;
        int i10;
        Object obj4;
        int i11;
        int i12;
        int k8;
        Object l9;
        Object l10;
        Object l11;
        Object l12;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj5 = list.get(i13);
            l8 = t4.d.l((IntrinsicMeasurable) obj5);
            if (AbstractC3292y.d(l8, "TextField")) {
                int intValue = ((Number) interfaceC2072n.invoke(obj5, Integer.valueOf(i8))).intValue();
                int size2 = list.size();
                int i14 = 0;
                while (true) {
                    obj = null;
                    if (i14 < size2) {
                        obj2 = list.get(i14);
                        l12 = t4.d.l((IntrinsicMeasurable) obj2);
                        if (AbstractC3292y.d(l12, "Label")) {
                            break;
                        }
                        i14++;
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
                int size3 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size3) {
                        obj3 = list.get(i15);
                        l11 = t4.d.l((IntrinsicMeasurable) obj3);
                        if (AbstractC3292y.d(l11, "Trailing")) {
                            break;
                        }
                        i15++;
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
                int size4 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size4) {
                        obj4 = list.get(i16);
                        l10 = t4.d.l((IntrinsicMeasurable) obj4);
                        if (AbstractC3292y.d(l10, "Leading")) {
                            break;
                        }
                        i16++;
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
                int size5 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i17);
                    l9 = t4.d.l((IntrinsicMeasurable) obj6);
                    if (AbstractC3292y.d(l9, "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i17++;
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                if (intrinsicMeasurable4 != null) {
                    i12 = ((Number) interfaceC2072n.invoke(intrinsicMeasurable4, Integer.valueOf(i8))).intValue();
                } else {
                    i12 = 0;
                }
                k8 = t4.d.k(i11, i10, intValue, i9, i12, AbstractC4007a.d());
                return k8;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        return d(intrinsicMeasureScope, measurables, i8, a.f39590a);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        return e(measurables, i8, b.f39591a);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo109measure3p2s80s(MeasureScope measure, List list, long j8) {
        float f8;
        Object obj;
        Placeable placeable;
        int p8;
        Object obj2;
        Placeable placeable2;
        int p9;
        Object obj3;
        Placeable placeable3;
        int i8;
        int i9;
        Object obj4;
        Placeable placeable4;
        int p10;
        int p11;
        int p12;
        int p13;
        int k8;
        boolean z8;
        int m8;
        int m9;
        int m10;
        int j9;
        List measurables = list;
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurables, "measurables");
        int mo419roundToPx0680j_4 = measure.mo419roundToPx0680j_4(this.f39589c.mo530calculateTopPaddingD9Ej5fM());
        int mo419roundToPx0680j_42 = measure.mo419roundToPx0680j_4(this.f39589c.mo527calculateBottomPaddingD9Ej5fM());
        f8 = t4.d.f39576a;
        int mo419roundToPx0680j_43 = measure.mo419roundToPx0680j_4(f8);
        long m5114copyZbe2FdA$default = Constraints.m5114copyZbe2FdA$default(j8, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = measurables.get(i10);
                if (AbstractC3292y.d(LayoutIdKt.getLayoutId((Measurable) obj), "Leading")) {
                    break;
                }
                i10++;
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
        p8 = t4.d.p(placeable);
        int size2 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 < size2) {
                obj2 = measurables.get(i11);
                if (AbstractC3292y.d(LayoutIdKt.getLayoutId((Measurable) obj2), "Trailing")) {
                    break;
                }
                i11++;
            } else {
                obj2 = null;
                break;
            }
        }
        Measurable measurable2 = (Measurable) obj2;
        if (measurable2 != null) {
            placeable2 = measurable2.mo4108measureBRTryo0(ConstraintsKt.m5140offsetNN6EwU$default(m5114copyZbe2FdA$default, -p8, 0, 2, null));
        } else {
            placeable2 = null;
        }
        p9 = t4.d.p(placeable2);
        int i12 = p8 + p9;
        int i13 = -mo419roundToPx0680j_42;
        int i14 = -i12;
        long m5139offsetNN6EwU = ConstraintsKt.m5139offsetNN6EwU(m5114copyZbe2FdA$default, i14, i13);
        int size3 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 < size3) {
                obj3 = measurables.get(i15);
                int i16 = size3;
                if (AbstractC3292y.d(LayoutIdKt.getLayoutId((Measurable) obj3), "Label")) {
                    break;
                }
                i15++;
                size3 = i16;
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
        int max = Math.max(i8, mo419roundToPx0680j_4);
        if (placeable3 != null) {
            i9 = (i13 - mo419roundToPx0680j_43) - max;
        } else {
            i9 = (-mo419roundToPx0680j_4) - mo419roundToPx0680j_42;
        }
        long m5139offsetNN6EwU2 = ConstraintsKt.m5139offsetNN6EwU(Constraints.m5114copyZbe2FdA$default(j8, 0, 0, 0, 0, 11, null), i14, i9);
        int size4 = list.size();
        int i17 = 0;
        while (i17 < size4) {
            Measurable measurable4 = (Measurable) measurables.get(i17);
            int i18 = size4;
            if (AbstractC3292y.d(LayoutIdKt.getLayoutId(measurable4), "TextField")) {
                Placeable mo4108measureBRTryo0 = measurable4.mo4108measureBRTryo0(m5139offsetNN6EwU2);
                long m5114copyZbe2FdA$default2 = Constraints.m5114copyZbe2FdA$default(m5139offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                int size5 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 < size5) {
                        obj4 = measurables.get(i19);
                        int i20 = size5;
                        if (AbstractC3292y.d(LayoutIdKt.getLayoutId((Measurable) obj4), "Hint")) {
                            break;
                        }
                        i19++;
                        measurables = list;
                        size5 = i20;
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
                p10 = t4.d.p(placeable);
                p11 = t4.d.p(placeable2);
                int width = mo4108measureBRTryo0.getWidth();
                p12 = t4.d.p(placeable3);
                p13 = t4.d.p(placeable4);
                k8 = t4.d.k(p10, p11, width, p12, p13, j8);
                int height = mo4108measureBRTryo0.getHeight();
                if (placeable3 != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                m8 = t4.d.m(placeable);
                m9 = t4.d.m(placeable2);
                m10 = t4.d.m(placeable4);
                j9 = t4.d.j(height, z8, max, m8, m9, m10, j8, measure.getDensity(), this.f39589c);
                return MeasureScope.CC.q(measure, k8, j9, null, new c(placeable3, mo419roundToPx0680j_4, i8, k8, j9, mo4108measureBRTryo0, placeable4, placeable, placeable2, this, max, mo419roundToPx0680j_43, measure), 4, null);
            }
            i17++;
            measurables = list;
            size4 = i18;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        return d(intrinsicMeasureScope, measurables, i8, d.f39605a);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        return e(measurables, i8, C0893e.f39606a);
    }
}
