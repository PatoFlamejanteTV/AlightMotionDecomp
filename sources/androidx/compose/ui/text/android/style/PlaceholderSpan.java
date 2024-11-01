package androidx.compose.ui.text.android.style;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PlaceholderSpan extends ReplacementSpan {
    public static final int ALIGN_ABOVE_BASELINE = 0;
    public static final int ALIGN_BOTTOM = 2;
    public static final int ALIGN_CENTER = 3;
    public static final int ALIGN_TEXT_BOTTOM = 5;
    public static final int ALIGN_TEXT_CENTER = 6;
    public static final int ALIGN_TEXT_TOP = 4;
    public static final int ALIGN_TOP = 1;
    public static final int UNIT_EM = 1;
    public static final int UNIT_SP = 0;
    public static final int UNIT_UNSPECIFIED = 2;
    private Paint.FontMetricsInt fontMetrics;
    private final float height;
    private int heightPx;
    private final int heightUnit;
    private boolean isLaidOut;
    private final float pxPerSp;
    private final int verticalAlign;
    private final float width;
    private int widthPx;
    private final int widthUnit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    public static final class Companion {

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface Unit {
        }

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface VerticalAlign {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public PlaceholderSpan(float f8, int i8, float f9, int i9, float f10, int i10) {
        this.width = f8;
        this.widthUnit = i8;
        this.height = f9;
        this.heightUnit = i9;
        this.pxPerSp = f10;
        this.verticalAlign = i10;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i8, int i9, float f8, int i10, int i11, int i12, Paint paint) {
    }

    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC3292y.y("fontMetrics");
        return null;
    }

    public final int getHeightPx() {
        if (this.isLaidOut) {
            return this.heightPx;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(Paint paint, CharSequence charSequence, int i8, int i9, Paint.FontMetricsInt fontMetricsInt) {
        float f8;
        int ceilToInt;
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        this.fontMetrics = paint.getFontMetricsInt();
        if (getFontMetrics().descent > getFontMetrics().ascent) {
            int i10 = this.widthUnit;
            if (i10 != 0) {
                if (i10 == 1) {
                    f8 = this.width * textSize;
                } else {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
            } else {
                f8 = this.width * this.pxPerSp;
            }
            this.widthPx = PlaceholderSpanKt.ceilToInt(f8);
            int i11 = this.heightUnit;
            if (i11 != 0) {
                if (i11 == 1) {
                    ceilToInt = PlaceholderSpanKt.ceilToInt(this.height * textSize);
                } else {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
            } else {
                ceilToInt = PlaceholderSpanKt.ceilToInt(this.height * this.pxPerSp);
            }
            this.heightPx = ceilToInt;
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = getFontMetrics().ascent;
                fontMetricsInt.descent = getFontMetrics().descent;
                fontMetricsInt.leading = getFontMetrics().leading;
                switch (this.verticalAlign) {
                    case 0:
                        if (fontMetricsInt.ascent > (-getHeightPx())) {
                            fontMetricsInt.ascent = -getHeightPx();
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (fontMetricsInt.ascent + getHeightPx() > fontMetricsInt.descent) {
                            fontMetricsInt.descent = fontMetricsInt.ascent + getHeightPx();
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - getHeightPx()) {
                            fontMetricsInt.ascent = fontMetricsInt.descent - getHeightPx();
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < getHeightPx()) {
                            int heightPx = fontMetricsInt.ascent - ((getHeightPx() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = heightPx;
                            fontMetricsInt.descent = heightPx + getHeightPx();
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(getFontMetrics().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(getFontMetrics().bottom, fontMetricsInt.descent);
            }
            return getWidthPx();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }

    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public final int getWidthPx() {
        if (this.isLaidOut) {
            return this.widthPx;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }
}
