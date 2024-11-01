package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public abstract class ShaderBrush extends Brush {
    private long createdSize;
    private Shader internalShader;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.Companion.m2789getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo2901applyToPq9zytI(long j8, Paint paint, float f8) {
        Shader shader = this.internalShader;
        if (shader == null || !Size.m2777equalsimpl0(this.createdSize, j8)) {
            if (Size.m2783isEmptyimpl(j8)) {
                shader = null;
                this.internalShader = null;
                this.createdSize = Size.Companion.m2789getUnspecifiedNHjbRc();
            } else {
                shader = mo2923createShaderuvyYCjk(j8);
                this.internalShader = shader;
                this.createdSize = j8;
            }
        }
        long mo2827getColor0d7_KjU = paint.mo2827getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m2949equalsimpl0(mo2827getColor0d7_KjU, companion.m2974getBlack0d7_KjU())) {
            paint.mo2833setColor8_81llA(companion.m2974getBlack0d7_KjU());
        }
        if (!AbstractC3292y.d(paint.getShader(), shader)) {
            paint.setShader(shader);
        }
        if (paint.getAlpha() != f8) {
            paint.setAlpha(f8);
        }
    }

    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo2923createShaderuvyYCjk(long j8);
}
