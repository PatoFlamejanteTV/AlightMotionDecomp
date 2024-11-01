package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class OffsetEffect extends RenderEffect {
    private final long offset;
    private final RenderEffect renderEffect;

    public /* synthetic */ OffsetEffect(RenderEffect renderEffect, long j8, AbstractC3284p abstractC3284p) {
        this(renderEffect, j8);
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    @RequiresApi(31)
    protected android.graphics.RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m3236createOffsetEffectUv8p0NA(this.renderEffect, this.offset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetEffect)) {
            return false;
        }
        OffsetEffect offsetEffect = (OffsetEffect) obj;
        if (AbstractC3292y.d(this.renderEffect, offsetEffect.renderEffect) && Offset.m2709equalsimpl0(this.offset, offsetEffect.offset)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i8;
        RenderEffect renderEffect = this.renderEffect;
        if (renderEffect != null) {
            i8 = renderEffect.hashCode();
        } else {
            i8 = 0;
        }
        return (i8 * 31) + Offset.m2714hashCodeimpl(this.offset);
    }

    public String toString() {
        return "OffsetEffect(renderEffect=" + this.renderEffect + ", offset=" + ((Object) Offset.m2720toStringimpl(this.offset)) + ')';
    }

    private OffsetEffect(RenderEffect renderEffect, long j8) {
        super(null);
        this.renderEffect = renderEffect;
        this.offset = j8;
    }
}
