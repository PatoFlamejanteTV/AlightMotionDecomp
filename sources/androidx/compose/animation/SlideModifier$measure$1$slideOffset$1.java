package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SlideModifier$measure$1$slideOffset$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ SlideModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlideModifier$measure$1$slideOffset$1(SlideModifier slideModifier, long j8) {
        super(1);
        this.this$0 = slideModifier;
        this.$measuredSize = j8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m5270boximpl(m173invokeBjo55l4((EnterExitState) obj));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m173invokeBjo55l4(EnterExitState it) {
        AbstractC3292y.i(it, "it");
        return this.this$0.m172targetValueByStateoFUgxo0(it, this.$measuredSize);
    }
}
