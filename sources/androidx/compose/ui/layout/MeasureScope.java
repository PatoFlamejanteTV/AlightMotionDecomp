package androidx.compose.ui.layout;

import R5.Q;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.DpRect;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface MeasureScope extends IntrinsicMeasureScope {

    /* renamed from: androidx.compose.ui.layout.MeasureScope$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        public static MeasureResult a(final MeasureScope measureScope, final int i8, final int i9, final Map map, final Function1 function1) {
            return new MeasureResult(i8, i9, map, measureScope, function1) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1
                final /* synthetic */ Function1 $placementBlock;
                final /* synthetic */ int $width;
                private final Map<AlignmentLine, Integer> alignmentLines;
                private final int height;
                final /* synthetic */ MeasureScope this$0;
                private final int width;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.$width = i8;
                    this.this$0 = measureScope;
                    this.$placementBlock = function1;
                    this.width = i8;
                    this.height = i9;
                    this.alignmentLines = map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return this.alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return this.height;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return this.width;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    MeasureScope measureScope2 = this.this$0;
                    if (measureScope2 instanceof LookaheadCapablePlaceable) {
                        this.$placementBlock.invoke(((LookaheadCapablePlaceable) measureScope2).getPlacementScope());
                    } else {
                        this.$placementBlock.invoke(new SimplePlacementScope(this.$width, this.this$0.getLayoutDirection()));
                    }
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MeasureResult q(MeasureScope measureScope, int i8, int i9, Map map, Function1 function1, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    map = Q.h();
                }
                return measureScope.layout(i8, i9, map, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
    }

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isLookingAhead(MeasureScope measureScope) {
            return b.a(measureScope);
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i8, int i9, Map<AlignmentLine, Integer> map, Function1 function1) {
            return CC.a(measureScope, i8, i9, map, function1);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4126roundToPxR2X_6o(MeasureScope measureScope, long j8) {
            return androidx.compose.ui.unit.a.a(measureScope, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4127roundToPx0680j_4(MeasureScope measureScope, float f8) {
            return androidx.compose.ui.unit.a.b(measureScope, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4128toDpGaN1DYA(MeasureScope measureScope, long j8) {
            return androidx.compose.ui.unit.b.a(measureScope, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4129toDpu2uoSUM(MeasureScope measureScope, float f8) {
            return androidx.compose.ui.unit.a.c(measureScope, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4131toDpSizekrfVVM(MeasureScope measureScope, long j8) {
            return androidx.compose.ui.unit.a.e(measureScope, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4132toPxR2X_6o(MeasureScope measureScope, long j8) {
            return androidx.compose.ui.unit.a.f(measureScope, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4133toPx0680j_4(MeasureScope measureScope, float f8) {
            return androidx.compose.ui.unit.a.g(measureScope, f8);
        }

        @Stable
        @Deprecated
        public static Rect toRect(MeasureScope measureScope, DpRect dpRect) {
            return androidx.compose.ui.unit.a.h(measureScope, dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4134toSizeXkaWNTQ(MeasureScope measureScope, long j8) {
            return androidx.compose.ui.unit.a.i(measureScope, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4135toSp0xMU5do(MeasureScope measureScope, float f8) {
            return androidx.compose.ui.unit.b.b(measureScope, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4136toSpkPz2Gy4(MeasureScope measureScope, float f8) {
            return androidx.compose.ui.unit.a.j(measureScope, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4130toDpu2uoSUM(MeasureScope measureScope, int i8) {
            return androidx.compose.ui.unit.a.d(measureScope, i8);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4137toSpkPz2Gy4(MeasureScope measureScope, int i8) {
            return androidx.compose.ui.unit.a.k(measureScope, i8);
        }
    }

    MeasureResult layout(int i8, int i9, Map<AlignmentLine, Integer> map, Function1 function1);
}
