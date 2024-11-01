package androidx.compose.foundation;

import Q5.I;
import android.widget.EdgeEffect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect$onNewSize$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$onNewSize$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        super(1);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m255invokeozmzZPI(((IntSize) obj).m5325unboximpl());
        return I.f8786a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m255invokeozmzZPI(long j8) {
        long j9;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        EdgeEffect edgeEffect3;
        EdgeEffect edgeEffect4;
        EdgeEffect edgeEffect5;
        EdgeEffect edgeEffect6;
        EdgeEffect edgeEffect7;
        EdgeEffect edgeEffect8;
        long m5331toSizeozmzZPI = IntSizeKt.m5331toSizeozmzZPI(j8);
        j9 = this.this$0.containerSize;
        boolean z8 = !Size.m2777equalsimpl0(m5331toSizeozmzZPI, j9);
        this.this$0.containerSize = IntSizeKt.m5331toSizeozmzZPI(j8);
        if (z8) {
            edgeEffect = this.this$0.topEffect;
            edgeEffect.setSize(IntSize.m5321getWidthimpl(j8), IntSize.m5320getHeightimpl(j8));
            edgeEffect2 = this.this$0.bottomEffect;
            edgeEffect2.setSize(IntSize.m5321getWidthimpl(j8), IntSize.m5320getHeightimpl(j8));
            edgeEffect3 = this.this$0.leftEffect;
            edgeEffect3.setSize(IntSize.m5320getHeightimpl(j8), IntSize.m5321getWidthimpl(j8));
            edgeEffect4 = this.this$0.rightEffect;
            edgeEffect4.setSize(IntSize.m5320getHeightimpl(j8), IntSize.m5321getWidthimpl(j8));
            edgeEffect5 = this.this$0.topEffectNegation;
            edgeEffect5.setSize(IntSize.m5321getWidthimpl(j8), IntSize.m5320getHeightimpl(j8));
            edgeEffect6 = this.this$0.bottomEffectNegation;
            edgeEffect6.setSize(IntSize.m5321getWidthimpl(j8), IntSize.m5320getHeightimpl(j8));
            edgeEffect7 = this.this$0.leftEffectNegation;
            edgeEffect7.setSize(IntSize.m5320getHeightimpl(j8), IntSize.m5321getWidthimpl(j8));
            edgeEffect8 = this.this$0.rightEffectNegation;
            edgeEffect8.setSize(IntSize.m5320getHeightimpl(j8), IntSize.m5321getWidthimpl(j8));
        }
        if (z8) {
            this.this$0.invalidateOverscroll();
            this.this$0.animateToRelease();
        }
    }
}
