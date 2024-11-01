package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TextFieldImplKt$CommonDecorationBox$3$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ float $labelProgress;
    final /* synthetic */ MutableState<Size> $labelSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$1$1(float f8, MutableState<Size> mutableState) {
        super(1);
        this.$labelProgress = f8;
        this.$labelSize = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m1383invokeuvyYCjk(((Size) obj).m2786unboximpl());
        return I.f8786a;
    }

    /* renamed from: invoke-uvyYCjk, reason: not valid java name */
    public final void m1383invokeuvyYCjk(long j8) {
        float m2781getWidthimpl = Size.m2781getWidthimpl(j8) * this.$labelProgress;
        float m2778getHeightimpl = Size.m2778getHeightimpl(j8) * this.$labelProgress;
        if (Size.m2781getWidthimpl(this.$labelSize.getValue().m2786unboximpl()) != m2781getWidthimpl || Size.m2778getHeightimpl(this.$labelSize.getValue().m2786unboximpl()) != m2778getHeightimpl) {
            this.$labelSize.setValue(Size.m2769boximpl(SizeKt.Size(m2781getWidthimpl, m2778getHeightimpl)));
        }
    }
}
