package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AppBarKt$rememberTopAppBarState$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ float $initialContentOffset;
    final /* synthetic */ float $initialHeightOffset;
    final /* synthetic */ float $initialHeightOffsetLimit;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$rememberTopAppBarState$1$1(float f8, float f9, float f10) {
        super(0);
        this.$initialHeightOffsetLimit = f8;
        this.$initialHeightOffset = f9;
        this.$initialContentOffset = f10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TopAppBarState invoke() {
        return new TopAppBarState(this.$initialHeightOffsetLimit, this.$initialHeightOffset, this.$initialContentOffset);
    }
}
