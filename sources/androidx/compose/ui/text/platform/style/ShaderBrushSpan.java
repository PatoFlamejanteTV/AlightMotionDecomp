package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint_androidKt;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 0;
    private final float alpha;
    private final ShaderBrush shaderBrush;
    private final State<Shader> shaderState;
    private final MutableState size$delegate;

    public ShaderBrushSpan(ShaderBrush shaderBrush, float f8) {
        MutableState mutableStateOf$default;
        this.shaderBrush = shaderBrush;
        this.alpha = f8;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m2769boximpl(Size.Companion.m2789getUnspecifiedNHjbRc()), null, 2, null);
        this.size$delegate = mutableStateOf$default;
        this.shaderState = SnapshotStateKt.derivedStateOf(new ShaderBrushSpan$shaderState$1(this));
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ShaderBrush getShaderBrush() {
        return this.shaderBrush;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m4941getSizeNHjbRc() {
        return ((Size) this.size$delegate.getValue()).m2786unboximpl();
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m4942setSizeuvyYCjk(long j8) {
        this.size$delegate.setValue(Size.m2769boximpl(j8));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        AndroidTextPaint_androidKt.setAlpha(textPaint, this.alpha);
        textPaint.setShader(this.shaderState.getValue());
    }
}
