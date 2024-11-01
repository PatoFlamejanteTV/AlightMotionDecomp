package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class SizeTransformImpl implements SizeTransform {
    private final boolean clip;
    private final InterfaceC2072n sizeAnimationSpec;

    public SizeTransformImpl(boolean z8, InterfaceC2072n sizeAnimationSpec) {
        AbstractC3292y.i(sizeAnimationSpec, "sizeAnimationSpec");
        this.clip = z8;
        this.sizeAnimationSpec = sizeAnimationSpec;
    }

    @Override // androidx.compose.animation.SizeTransform
    /* renamed from: createAnimationSpec-TemP2vQ */
    public FiniteAnimationSpec<IntSize> mo171createAnimationSpecTemP2vQ(long j8, long j9) {
        return (FiniteAnimationSpec) this.sizeAnimationSpec.invoke(IntSize.m5313boximpl(j8), IntSize.m5313boximpl(j9));
    }

    @Override // androidx.compose.animation.SizeTransform
    public boolean getClip() {
        return this.clip;
    }

    public final InterfaceC2072n getSizeAnimationSpec() {
        return this.sizeAnimationSpec;
    }

    public /* synthetic */ SizeTransformImpl(boolean z8, InterfaceC2072n interfaceC2072n, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? true : z8, interfaceC2072n);
    }
}
