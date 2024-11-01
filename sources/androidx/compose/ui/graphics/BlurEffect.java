package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class BlurEffect extends RenderEffect {
    private final int edgeTreatment;
    private final float radiusX;
    private final float radiusY;
    private final RenderEffect renderEffect;

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f8, float f9, int i8, AbstractC3284p abstractC3284p) {
        this(renderEffect, f8, f9, i8);
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    @RequiresApi(31)
    protected android.graphics.RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m3235createBlurEffect8A3gB4(this.renderEffect, this.radiusX, this.radiusY, this.edgeTreatment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) obj;
        if (this.radiusX == blurEffect.radiusX && this.radiusY == blurEffect.radiusY && TileMode.m3294equalsimpl0(this.edgeTreatment, blurEffect.edgeTreatment) && AbstractC3292y.d(this.renderEffect, blurEffect.renderEffect)) {
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
        return (((((i8 * 31) + Float.floatToIntBits(this.radiusX)) * 31) + Float.floatToIntBits(this.radiusY)) * 31) + TileMode.m3295hashCodeimpl(this.edgeTreatment);
    }

    public String toString() {
        return "BlurEffect(renderEffect=" + this.renderEffect + ", radiusX=" + this.radiusX + ", radiusY=" + this.radiusY + ", edgeTreatment=" + ((Object) TileMode.m3296toStringimpl(this.edgeTreatment)) + ')';
    }

    private BlurEffect(RenderEffect renderEffect, float f8, float f9, int i8) {
        super(null);
        this.renderEffect = renderEffect;
        this.radiusX = f8;
        this.radiusY = f9;
        this.edgeTreatment = i8;
    }

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f8, float f9, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(renderEffect, f8, (i9 & 4) != 0 ? f8 : f9, (i9 & 8) != 0 ? TileMode.Companion.m3298getClamp3opZhB0() : i8, null);
    }
}
