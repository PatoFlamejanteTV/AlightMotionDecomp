package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class WrapContentElement$Companion$height$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ Alignment.Vertical $align;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentElement$Companion$height$1(Alignment.Vertical vertical) {
        super(2);
        this.$align = vertical;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return IntOffset.m5270boximpl(m676invoke5SAbXVA(((IntSize) obj).m5325unboximpl(), (LayoutDirection) obj2));
    }

    /* renamed from: invoke-5SAbXVA, reason: not valid java name */
    public final long m676invoke5SAbXVA(long j8, LayoutDirection layoutDirection) {
        AbstractC3292y.i(layoutDirection, "<anonymous parameter 1>");
        return IntOffsetKt.IntOffset(0, this.$align.align(0, IntSize.m5320getHeightimpl(j8)));
    }
}
