package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.style.TextForegroundStyle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ColorStyle implements TextForegroundStyle {
    private final long value;

    public /* synthetic */ ColorStyle(long j8, AbstractC3284p abstractC3284p) {
        this(j8);
    }

    /* renamed from: copy-8_81llA$default, reason: not valid java name */
    public static /* synthetic */ ColorStyle m4958copy8_81llA$default(ColorStyle colorStyle, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = colorStyle.value;
        }
        return colorStyle.m4960copy8_81llA(j8);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m4959component10d7_KjU() {
        return this.value;
    }

    /* renamed from: copy-8_81llA, reason: not valid java name */
    public final ColorStyle m4960copy8_81llA(long j8) {
        return new ColorStyle(j8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorStyle) && Color.m2949equalsimpl0(this.value, ((ColorStyle) obj).value);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return Color.m2950getAlphaimpl(mo4957getColor0d7_KjU());
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public Brush getBrush() {
        return null;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU */
    public long mo4957getColor0d7_KjU() {
        return this.value;
    }

    /* renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m4961getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m2955hashCodeimpl(this.value);
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
        return "ColorStyle(value=" + ((Object) Color.m2956toStringimpl(this.value)) + ')';
    }

    private ColorStyle(long j8) {
        this.value = j8;
        if (j8 == Color.Companion.m2984getUnspecified0d7_KjU()) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }
}
