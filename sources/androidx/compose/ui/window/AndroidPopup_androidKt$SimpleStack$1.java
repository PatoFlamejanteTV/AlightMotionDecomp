package androidx.compose.ui.window;

import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class AndroidPopup_androidKt$SimpleStack$1 implements MeasurePolicy {
    public static final AndroidPopup_androidKt$SimpleStack$1 INSTANCE = new AndroidPopup_androidKt$SimpleStack$1();

    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(Placeable.PlacementScope placementScope) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return I.f8786a;
        }
    }

    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements Function1 {
        final /* synthetic */ Placeable $p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Placeable placeable) {
            super(1);
            this.$p = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return I.f8786a;
        }

        public final void invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.placeRelative$default(placementScope, this.$p, 0, 0, 0.0f, 4, null);
        }
    }

    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends AbstractC3293z implements Function1 {
        final /* synthetic */ List<Placeable> $placeables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(List<? extends Placeable> list) {
            super(1);
            this.$placeables = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return I.f8786a;
        }

        public final void invoke(Placeable.PlacementScope placementScope) {
            int o8 = AbstractC1435t.o(this.$placeables);
            if (o8 < 0) {
                return;
            }
            int i8 = 0;
            while (true) {
                Placeable.PlacementScope.placeRelative$default(placementScope, this.$placeables.get(i8), 0, 0, 0.0f, 4, null);
                if (i8 == o8) {
                    return;
                } else {
                    i8++;
                }
            }
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return g.a(this, intrinsicMeasureScope, list, i8);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return g.b(this, intrinsicMeasureScope, list, i8);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo109measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j8) {
        int i8;
        int i9;
        int size = list.size();
        if (size != 0) {
            int i10 = 0;
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList.add(list.get(i11).mo4108measureBRTryo0(j8));
                }
                int o8 = AbstractC1435t.o(arrayList);
                if (o8 >= 0) {
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        Placeable placeable = (Placeable) arrayList.get(i10);
                        i12 = Math.max(i12, placeable.getWidth());
                        i13 = Math.max(i13, placeable.getHeight());
                        if (i10 == o8) {
                            break;
                        }
                        i10++;
                    }
                    i8 = i12;
                    i9 = i13;
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                return MeasureScope.CC.q(measureScope, i8, i9, null, new AnonymousClass3(arrayList), 4, null);
            }
            Placeable mo4108measureBRTryo0 = list.get(0).mo4108measureBRTryo0(j8);
            return MeasureScope.CC.q(measureScope, mo4108measureBRTryo0.getWidth(), mo4108measureBRTryo0.getHeight(), null, new AnonymousClass2(mo4108measureBRTryo0), 4, null);
        }
        return MeasureScope.CC.q(measureScope, 0, 0, null, AnonymousClass1.INSTANCE, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return g.c(this, intrinsicMeasureScope, list, i8);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return g.d(this, intrinsicMeasureScope, list, i8);
    }
}
