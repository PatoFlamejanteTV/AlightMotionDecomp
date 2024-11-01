package androidx.compose.ui.text.style;

import Q5.p;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public interface TextForegroundStyle {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: androidx.compose.ui.text.style.TextForegroundStyle$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        public static TextForegroundStyle a(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2) {
            boolean z8 = textForegroundStyle2 instanceof BrushStyle;
            if (z8 && (textForegroundStyle instanceof BrushStyle)) {
                return new BrushStyle(((BrushStyle) textForegroundStyle2).getValue(), TextDrawStyleKt.access$takeOrElse(textForegroundStyle2.getAlpha(), new TextForegroundStyle$merge$1(textForegroundStyle)));
            }
            if (z8 && !(textForegroundStyle instanceof BrushStyle)) {
                return textForegroundStyle2;
            }
            if (z8 || !(textForegroundStyle instanceof BrushStyle)) {
                return textForegroundStyle2.takeOrElse(new TextForegroundStyle$merge$2(textForegroundStyle));
            }
            return textForegroundStyle;
        }

        public static TextForegroundStyle b(TextForegroundStyle textForegroundStyle, Function0 function0) {
            if (AbstractC3292y.d(textForegroundStyle, Unspecified.INSTANCE)) {
                return (TextForegroundStyle) function0.invoke();
            }
            return textForegroundStyle;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final TextForegroundStyle from(Brush brush, float f8) {
            if (brush == null) {
                return Unspecified.INSTANCE;
            }
            if (brush instanceof SolidColor) {
                return m5080from8_81llA(TextDrawStyleKt.m5079modulateDxMtmZc(((SolidColor) brush).m3260getValue0d7_KjU(), f8));
            }
            if (brush instanceof ShaderBrush) {
                return new BrushStyle((ShaderBrush) brush, f8);
            }
            throw new p();
        }

        /* renamed from: from-8_81llA, reason: not valid java name */
        public final TextForegroundStyle m5080from8_81llA(long j8) {
            if (j8 != Color.Companion.m2984getUnspecified0d7_KjU()) {
                return new ColorStyle(j8, null);
            }
            return Unspecified.INSTANCE;
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class Unspecified implements TextForegroundStyle {
        public static final int $stable = 0;
        public static final Unspecified INSTANCE = new Unspecified();

        private Unspecified() {
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public float getAlpha() {
            return Float.NaN;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public Brush getBrush() {
            return null;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        /* renamed from: getColor-0d7_KjU */
        public long mo4957getColor0d7_KjU() {
            return Color.Companion.m2984getUnspecified0d7_KjU();
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public /* synthetic */ TextForegroundStyle merge(TextForegroundStyle textForegroundStyle) {
            return CC.a(this, textForegroundStyle);
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public /* synthetic */ TextForegroundStyle takeOrElse(Function0 function0) {
            return CC.b(this, function0);
        }
    }

    float getAlpha();

    Brush getBrush();

    /* renamed from: getColor-0d7_KjU */
    long mo4957getColor0d7_KjU();

    TextForegroundStyle merge(TextForegroundStyle textForegroundStyle);

    TextForegroundStyle takeOrElse(Function0 function0);
}
