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
final class WrapContentElement$Companion$width$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ Alignment.Horizontal $align;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentElement$Companion$width$1(Alignment.Horizontal horizontal) {
        super(2);
        this.$align = horizontal;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return IntOffset.m5270boximpl(m678invoke5SAbXVA(((IntSize) obj).m5325unboximpl(), (LayoutDirection) obj2));
    }

    /* renamed from: invoke-5SAbXVA, reason: not valid java name */
    public final long m678invoke5SAbXVA(long j8, LayoutDirection layoutDirection) {
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        return IntOffsetKt.IntOffset(this.$align.align(0, IntSize.m5321getWidthimpl(j8), layoutDirection), 0);
    }
}