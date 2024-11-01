package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PaddingKt$absolutePadding$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ float $bottom;
    final /* synthetic */ float $left;
    final /* synthetic */ float $right;
    final /* synthetic */ float $top;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingKt$absolutePadding$1(float f8, float f9, float f10, float f11) {
        super(1);
        this.$left = f8;
        this.$top = f9;
        this.$right = f10;
        this.$bottom = f11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8786a;
    }

    public final void invoke(InspectorInfo $receiver) {
        AbstractC3292y.i($receiver, "$this$$receiver");
        $receiver.setName("absolutePadding");
        $receiver.getProperties().set(TtmlNode.LEFT, Dp.m5153boximpl(this.$left));
        $receiver.getProperties().set("top", Dp.m5153boximpl(this.$top));
        $receiver.getProperties().set(TtmlNode.RIGHT, Dp.m5153boximpl(this.$right));
        $receiver.getProperties().set("bottom", Dp.m5153boximpl(this.$bottom));
    }
}
