package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.style.TextForegroundStyle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BrushStyle implements TextForegroundStyle {
    private final float alpha;
    private final ShaderBrush value;

    public BrushStyle(ShaderBrush shaderBrush, float f8) {
        this.value = shaderBrush;
        this.alpha = f8;
    }

    public static /* synthetic */ BrushStyle copy$default(BrushStyle brushStyle, ShaderBrush shaderBrush, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            shaderBrush = brushStyle.value;
        }
        if ((i8 & 2) != 0) {
            f8 = brushStyle.alpha;
        }
        return brushStyle.copy(shaderBrush, f8);
    }

    public final ShaderBrush component1() {
        return this.value;
    }

    public final float component2() {
        return this.alpha;
    }

    public final BrushStyle copy(ShaderBrush shaderBrush, float f8) {
        return new BrushStyle(shaderBrush, f8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrushStyle)) {
            return false;
        }
        BrushStyle brushStyle = (BrushStyle) obj;
        return AbstractC3292y.d(this.value, brushStyle.value) && Float.compare(this.alpha, brushStyle.alpha) == 0;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public Brush getBrush() {
        return this.value;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public long mo4957getColor0d7_KjU() {
        return Color.Companion.m2984getUnspecified0d7_KjU();
    }

    public final ShaderBrush getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + Float.floatToIntBits(this.alpha);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public /* synthetic */ TextForegroundStyle merge(TextForegroundStyle textForegroundStyle) {
        return TextForegroundStyle.CC.a(this, textForegroundStyle);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public /* synthetic */ TextForegroundStyle takeOrElse(Function0 function0) {
        return TextForegroundStyle.CC.b(this, function0);
    }

    public String toString() {
        return "BrushStyle(value=" + this.value + ", alpha=" + this.alpha + ')';
    }
}
