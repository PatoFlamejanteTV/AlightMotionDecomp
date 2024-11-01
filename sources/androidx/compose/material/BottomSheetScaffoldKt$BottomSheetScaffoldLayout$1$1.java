package androidx.compose.material;

import Q5.I;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2073o $body;
    final /* synthetic */ InterfaceC2073o $bottomSheet;
    final /* synthetic */ InterfaceC2072n $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ Function0 $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ BottomSheetState $sheetState;
    final /* synthetic */ InterfaceC2072n $snackbarHost;
    final /* synthetic */ InterfaceC2072n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ List<Placeable> $bodyPlaceables;
        final /* synthetic */ int $fabOffsetX;
        final /* synthetic */ int $fabOffsetY;
        final /* synthetic */ List<Placeable> $fabPlaceable;
        final /* synthetic */ int $sheetOffsetY;
        final /* synthetic */ List<Placeable> $sheetPlaceables;
        final /* synthetic */ int $snackbarOffsetX;
        final /* synthetic */ int $snackbarOffsetY;
        final /* synthetic */ List<Placeable> $snackbarPlaceables;
        final /* synthetic */ int $topBarHeight;
        final /* synthetic */ List<Placeable> $topBarPlaceables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends Placeable> list, List<? extends Placeable> list2, List<? extends Placeable> list3, List<? extends Placeable> list4, List<? extends Placeable> list5, int i8, int i9, int i10, int i11, int i12, int i13) {
            super(1);
            this.$bodyPlaceables = list;
            this.$topBarPlaceables = list2;
            this.$sheetPlaceables = list3;
            this.$fabPlaceable = list4;
            this.$snackbarPlaceables = list5;
            this.$topBarHeight = i8;
            this.$sheetOffsetY = i9;
            this.$fabOffsetX = i10;
            this.$fabOffsetY = i11;
            this.$snackbarOffsetX = i12;
            this.$snackbarOffsetY = i13;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return I.f8786a;
        }

        public final void invoke(Placeable.PlacementScope layout) {
            AbstractC3292y.i(layout, "$this$layout");
            List<Placeable> list = this.$bodyPlaceables;
            int i8 = this.$topBarHeight;
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                Placeable.PlacementScope.placeRelative$default(layout, list.get(i9), 0, i8, 0.0f, 4, null);
            }
            List<Placeable> list2 = this.$topBarPlaceables;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    Placeable.PlacementScope.placeRelative$default(layout, list2.get(i10), 0, 0, 0.0f, 4, null);
                }
            }
            List<Placeable> list3 = this.$sheetPlaceables;
            int i11 = this.$sheetOffsetY;
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                Placeable.PlacementScope.placeRelative$default(layout, list3.get(i12), 0, i11, 0.0f, 4, null);
            }
            List<Placeable> list4 = this.$fabPlaceable;
            if (list4 != null) {
                int i13 = this.$fabOffsetX;
                int i14 = this.$fabOffsetY;
                int size4 = list4.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    Placeable.PlacementScope.placeRelative$default(layout, list4.get(i15), i13, i14, 0.0f, 4, null);
                }
            }
            List<Placeable> list5 = this.$snackbarPlaceables;
            int i16 = this.$snackbarOffsetX;
            int i17 = this.$snackbarOffsetY;
            int size5 = list5.size();
            for (int i18 = 0; i18 < size5; i18++) {
                Placeable.PlacementScope.placeRelative$default(layout, list5.get(i18), i16, i17, 0.0f, 4, null);
            }
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BottomSheetValue.values().length];
            try {
                iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomSheetValue.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(Function0 function0, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, int i8, float f8, InterfaceC2072n interfaceC2072n3, BottomSheetState bottomSheetState, InterfaceC2073o interfaceC2073o, int i9, InterfaceC2073o interfaceC2073o2) {
        super(2);
        this.$sheetOffset = function0;
        this.$topBar = interfaceC2072n;
        this.$floatingActionButton = interfaceC2072n2;
        this.$floatingActionButtonPosition = i8;
        this.$sheetPeekHeight = f8;
        this.$snackbarHost = interfaceC2072n3;
        this.$sheetState = bottomSheetState;
        this.$bottomSheet = interfaceC2073o;
        this.$$dirty = i9;
        this.$body = interfaceC2073o2;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1118invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m5129unboximpl());
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011b A[LOOP:2: B:23:0x0115->B:25:0x011b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023e A[LOOP:4: B:58:0x0238->B:60:0x023e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0254  */
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.layout.MeasureResult m1118invoke0kLqBqw(androidx.compose.ui.layout.SubcomposeMeasureScope r24, long r25) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.m1118invoke0kLqBqw(androidx.compose.ui.layout.SubcomposeMeasureScope, long):androidx.compose.ui.layout.MeasureResult");
    }
}
