package androidx.compose.animation;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import R5.N;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSizeKt;
import i6.i;
import java.util.List;
import k6.AbstractC3258j;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    private final AnimatedContentTransitionScopeImpl<?> rootScope;

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl<?> rootScope) {
        AbstractC3292y.i(rootScope, "rootScope");
        this.rootScope = rootScope;
    }

    public final AnimatedContentTransitionScopeImpl<?> getRootScope() {
        return this.rootScope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        Integer num = (Integer) AbstractC3258j.A(AbstractC3258j.y(AbstractC1435t.c0(measurables), new AnimatedContentMeasurePolicy$maxIntrinsicHeight$1(i8)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        Integer num = (Integer) AbstractC3258j.A(AbstractC3258j.y(AbstractC1435t.c0(measurables), new AnimatedContentMeasurePolicy$maxIntrinsicWidth$1(i8)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo109measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j8) {
        Placeable placeable;
        Placeable placeable2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurables, "measurables");
        int size = measurables.size();
        Placeable[] placeableArr = new Placeable[size];
        int size2 = measurables.size();
        int i14 = 0;
        while (true) {
            placeable = null;
            AnimatedContentTransitionScopeImpl.ChildData childData = null;
            if (i14 >= size2) {
                break;
            }
            Measurable measurable = measurables.get(i14);
            Object parentData = measurable.getParentData();
            if (parentData instanceof AnimatedContentTransitionScopeImpl.ChildData) {
                childData = (AnimatedContentTransitionScopeImpl.ChildData) parentData;
            }
            if (childData != null && childData.isTarget()) {
                placeableArr[i14] = measurable.mo4108measureBRTryo0(j8);
            }
            i14++;
        }
        int size3 = measurables.size();
        for (int i15 = 0; i15 < size3; i15++) {
            Measurable measurable2 = measurables.get(i15);
            if (placeableArr[i15] == null) {
                placeableArr[i15] = measurable2.mo4108measureBRTryo0(j8);
            }
        }
        if (size == 0) {
            placeable2 = null;
        } else {
            placeable2 = placeableArr[0];
            int i02 = AbstractC1428l.i0(placeableArr);
            if (i02 != 0) {
                if (placeable2 != null) {
                    i8 = placeable2.getWidth();
                } else {
                    i8 = 0;
                }
                N it = new i(1, i02).iterator();
                while (it.hasNext()) {
                    Placeable placeable3 = placeableArr[it.nextInt()];
                    if (placeable3 != null) {
                        i9 = placeable3.getWidth();
                    } else {
                        i9 = 0;
                    }
                    if (i8 < i9) {
                        placeable2 = placeable3;
                        i8 = i9;
                    }
                }
            }
        }
        if (placeable2 != null) {
            i10 = placeable2.getWidth();
        } else {
            i10 = 0;
        }
        if (size != 0) {
            placeable = placeableArr[0];
            int i03 = AbstractC1428l.i0(placeableArr);
            if (i03 != 0) {
                if (placeable != null) {
                    i12 = placeable.getHeight();
                } else {
                    i12 = 0;
                }
                N it2 = new i(1, i03).iterator();
                while (it2.hasNext()) {
                    Placeable placeable4 = placeableArr[it2.nextInt()];
                    if (placeable4 != null) {
                        i13 = placeable4.getHeight();
                    } else {
                        i13 = 0;
                    }
                    if (i12 < i13) {
                        placeable = placeable4;
                        i12 = i13;
                    }
                }
            }
        }
        if (placeable != null) {
            i11 = placeable.getHeight();
        } else {
            i11 = 0;
        }
        this.rootScope.m132setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(i10, i11));
        return MeasureScope.CC.q(measure, i10, i11, null, new AnimatedContentMeasurePolicy$measure$3(placeableArr, this, i10, i11), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        Integer num = (Integer) AbstractC3258j.A(AbstractC3258j.y(AbstractC1435t.c0(measurables), new AnimatedContentMeasurePolicy$minIntrinsicHeight$1(i8)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        Integer num = (Integer) AbstractC3258j.A(AbstractC3258j.y(AbstractC1435t.c0(measurables), new AnimatedContentMeasurePolicy$minIntrinsicWidth$1(i8)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
