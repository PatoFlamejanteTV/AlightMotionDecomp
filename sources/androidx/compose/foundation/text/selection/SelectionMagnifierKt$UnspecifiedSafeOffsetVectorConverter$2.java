package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2 extends AbstractC3293z implements Function1 {
    public static final SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2 INSTANCE = new SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2();

    SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Offset.m2701boximpl(m1008invoketuRUvjQ((AnimationVector2D) obj));
    }

    /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
    public final long m1008invoketuRUvjQ(AnimationVector2D it) {
        AbstractC3292y.i(it, "it");
        return OffsetKt.Offset(it.getV1(), it.getV2());
    }
}
