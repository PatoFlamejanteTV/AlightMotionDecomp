package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$shrinkHorizontally$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $targetWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$shrinkHorizontally$2(Function1 function1) {
        super(1);
        this.$targetWidth = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.m5313boximpl(m147invokemzRDjE0(((IntSize) obj).m5325unboximpl()));
    }

    /* renamed from: invoke-mzRDjE0, reason: not valid java name */
    public final long m147invokemzRDjE0(long j8) {
        return IntSizeKt.IntSize(((Number) this.$targetWidth.invoke(Integer.valueOf(IntSize.m5321getWidthimpl(j8)))).intValue(), IntSize.m5320getHeightimpl(j8));
    }
}