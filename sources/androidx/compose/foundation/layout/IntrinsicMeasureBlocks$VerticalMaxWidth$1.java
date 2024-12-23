package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class IntrinsicMeasureBlocks$VerticalMaxWidth$1 extends AbstractC3293z implements InterfaceC2073o {
    public static final IntrinsicMeasureBlocks$VerticalMaxWidth$1 INSTANCE = new IntrinsicMeasureBlocks$VerticalMaxWidth$1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i8) {
            AbstractC3292y.i(intrinsicSize, "$this$intrinsicSize");
            return Integer.valueOf(intrinsicSize.maxIntrinsicWidth(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements InterfaceC2072n {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i8) {
            AbstractC3292y.i(intrinsicSize, "$this$intrinsicSize");
            return Integer.valueOf(intrinsicSize.maxIntrinsicHeight(i8));
        }
    }

    IntrinsicMeasureBlocks$VerticalMaxWidth$1() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((List<? extends IntrinsicMeasurable>) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    public final Integer invoke(List<? extends IntrinsicMeasurable> measurables, int i8, int i9) {
        int intrinsicSize;
        AbstractC3292y.i(measurables, "measurables");
        intrinsicSize = RowColumnImplKt.intrinsicSize(measurables, AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE, i8, i9, LayoutOrientation.Vertical, LayoutOrientation.Horizontal);
        return Integer.valueOf(intrinsicSize);
    }
}
