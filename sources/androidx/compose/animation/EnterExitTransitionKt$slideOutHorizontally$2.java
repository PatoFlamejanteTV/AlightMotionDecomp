package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$slideOutHorizontally$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $targetOffsetX;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$slideOutHorizontally$2(Function1 function1) {
        super(1);
        this.$targetOffsetX = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m5270boximpl(m152invokemHKZG7I(((IntSize) obj).m5325unboximpl()));
    }

    /* renamed from: invoke-mHKZG7I, reason: not valid java name */
    public final long m152invokemHKZG7I(long j8) {
        return IntOffsetKt.IntOffset(((Number) this.$targetOffsetX.invoke(Integer.valueOf(IntSize.m5321getWidthimpl(j8)))).intValue(), 0);
    }
}
