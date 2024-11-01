package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PlatformTextStyle {
    public static final int $stable = 0;
    private final PlatformParagraphStyle paragraphStyle;
    private final PlatformSpanStyle spanStyle;

    public /* synthetic */ PlatformTextStyle(int i8, AbstractC3284p abstractC3284p) {
        this(i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) obj;
        if (AbstractC3292y.d(this.paragraphStyle, platformTextStyle.paragraphStyle) && AbstractC3292y.d(this.spanStyle, platformTextStyle.spanStyle)) {
            return true;
        }
        return false;
    }

    public final PlatformParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    public final PlatformSpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    public int hashCode() {
        int i8;
        PlatformSpanStyle platformSpanStyle = this.spanStyle;
        int i9 = 0;
        if (platformSpanStyle != null) {
            i8 = platformSpanStyle.hashCode();
        } else {
            i8 = 0;
        }
        int i10 = i8 * 31;
        PlatformParagraphStyle platformParagraphStyle = this.paragraphStyle;
        if (platformParagraphStyle != null) {
            i9 = platformParagraphStyle.hashCode();
        }
        return i10 + i9;
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.spanStyle + ", paragraphSyle=" + this.paragraphStyle + ')';
    }

    public PlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        this.spanStyle = platformSpanStyle;
        this.paragraphStyle = platformParagraphStyle;
    }

    public /* synthetic */ PlatformTextStyle(boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? false : z8);
    }

    public PlatformTextStyle(boolean z8) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(z8));
    }

    private PlatformTextStyle(int i8) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(i8, (AbstractC3284p) null));
    }
}
