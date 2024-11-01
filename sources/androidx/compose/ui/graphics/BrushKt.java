package androidx.compose.ui.graphics;

import android.graphics.Shader;

/* loaded from: classes.dex */
public final class BrushKt {
    public static final ShaderBrush ShaderBrush(final Shader shader) {
        return new ShaderBrush() { // from class: androidx.compose.ui.graphics.BrushKt$ShaderBrush$1
            @Override // androidx.compose.ui.graphics.ShaderBrush
            /* renamed from: createShader-uvyYCjk, reason: not valid java name */
            public Shader mo2923createShaderuvyYCjk(long j8) {
                return shader;
            }
        };
    }
}
