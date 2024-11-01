package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ShaderBrushSpan$shaderState$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ ShaderBrushSpan this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShaderBrushSpan$shaderState$1(ShaderBrushSpan shaderBrushSpan) {
        super(0);
        this.this$0 = shaderBrushSpan;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Shader invoke() {
        if (this.this$0.m4941getSizeNHjbRc() == Size.Companion.m2789getUnspecifiedNHjbRc() || Size.m2783isEmptyimpl(this.this$0.m4941getSizeNHjbRc())) {
            return null;
        }
        return this.this$0.getShaderBrush().mo2923createShaderuvyYCjk(this.this$0.m4941getSizeNHjbRc());
    }
}
