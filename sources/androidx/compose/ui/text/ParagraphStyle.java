package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class ParagraphStyle {
    public static final int $stable = 0;
    private final int hyphens;
    private final int lineBreak;
    private final long lineHeight;
    private final LineHeightStyle lineHeightStyle;
    private final PlatformParagraphStyle platformStyle;
    private final int textAlign;
    private final int textDirection;
    private final TextIndent textIndent;
    private final TextMotion textMotion;

    public /* synthetic */ ParagraphStyle(int i8, int i9, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i10, int i11, TextMotion textMotion, AbstractC3284p abstractC3284p) {
        this(i8, i9, j8, textIndent, platformParagraphStyle, lineHeightStyle, i10, i11, textMotion);
    }

    /* renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m4564copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            textAlign = TextAlign.m5052boximpl(paragraphStyle.textAlign);
        }
        if ((i8 & 2) != 0) {
            textDirection = TextDirection.m5066boximpl(paragraphStyle.textDirection);
        }
        TextDirection textDirection2 = textDirection;
        if ((i8 & 4) != 0) {
            j8 = paragraphStyle.lineHeight;
        }
        long j9 = j8;
        if ((i8 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        return paragraphStyle.m4573copyElsmlbk(textAlign, textDirection2, j9, textIndent);
    }

    /* renamed from: copy-NH1kkwU$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m4565copyNH1kkwU$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i8, Object obj) {
        TextAlign textAlign2;
        TextDirection textDirection2;
        long j9;
        TextIndent textIndent2;
        PlatformParagraphStyle platformParagraphStyle2;
        LineHeightStyle lineHeightStyle2;
        LineBreak lineBreak2;
        Hyphens hyphens2;
        TextMotion textMotion2;
        if ((i8 & 1) != 0) {
            textAlign2 = TextAlign.m5052boximpl(paragraphStyle.textAlign);
        } else {
            textAlign2 = textAlign;
        }
        if ((i8 & 2) != 0) {
            textDirection2 = TextDirection.m5066boximpl(paragraphStyle.textDirection);
        } else {
            textDirection2 = textDirection;
        }
        if ((i8 & 4) != 0) {
            j9 = paragraphStyle.lineHeight;
        } else {
            j9 = j8;
        }
        if ((i8 & 8) != 0) {
            textIndent2 = paragraphStyle.textIndent;
        } else {
            textIndent2 = textIndent;
        }
        if ((i8 & 16) != 0) {
            platformParagraphStyle2 = paragraphStyle.platformStyle;
        } else {
            platformParagraphStyle2 = platformParagraphStyle;
        }
        if ((i8 & 32) != 0) {
            lineHeightStyle2 = paragraphStyle.lineHeightStyle;
        } else {
            lineHeightStyle2 = lineHeightStyle;
        }
        if ((i8 & 64) != 0) {
            lineBreak2 = LineBreak.m4972boximpl(paragraphStyle.lineBreak);
        } else {
            lineBreak2 = lineBreak;
        }
        if ((i8 & 128) != 0) {
            hyphens2 = Hyphens.m4962boximpl(paragraphStyle.hyphens);
        } else {
            hyphens2 = hyphens;
        }
        if ((i8 & 256) != 0) {
            textMotion2 = paragraphStyle.textMotion;
        } else {
            textMotion2 = textMotion;
        }
        return paragraphStyle.m4574copyNH1kkwU(textAlign2, textDirection2, j9, textIndent2, platformParagraphStyle2, lineHeightStyle2, lineBreak2, hyphens2, textMotion2);
    }

    /* renamed from: copy-ciSxzs0$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m4566copyciSxzs0$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i8, Object obj) {
        TextAlign textAlign2;
        TextDirection textDirection2;
        long j9;
        TextIndent textIndent2;
        PlatformParagraphStyle platformParagraphStyle2;
        LineHeightStyle lineHeightStyle2;
        LineBreak lineBreak2;
        Hyphens hyphens2;
        if ((i8 & 1) != 0) {
            textAlign2 = TextAlign.m5052boximpl(paragraphStyle.textAlign);
        } else {
            textAlign2 = textAlign;
        }
        if ((i8 & 2) != 0) {
            textDirection2 = TextDirection.m5066boximpl(paragraphStyle.textDirection);
        } else {
            textDirection2 = textDirection;
        }
        if ((i8 & 4) != 0) {
            j9 = paragraphStyle.lineHeight;
        } else {
            j9 = j8;
        }
        if ((i8 & 8) != 0) {
            textIndent2 = paragraphStyle.textIndent;
        } else {
            textIndent2 = textIndent;
        }
        if ((i8 & 16) != 0) {
            platformParagraphStyle2 = paragraphStyle.platformStyle;
        } else {
            platformParagraphStyle2 = platformParagraphStyle;
        }
        if ((i8 & 32) != 0) {
            lineHeightStyle2 = paragraphStyle.lineHeightStyle;
        } else {
            lineHeightStyle2 = lineHeightStyle;
        }
        if ((i8 & 64) != 0) {
            lineBreak2 = LineBreak.m4972boximpl(paragraphStyle.lineBreak);
        } else {
            lineBreak2 = lineBreak;
        }
        if ((i8 & 128) != 0) {
            hyphens2 = Hyphens.m4962boximpl(paragraphStyle.hyphens);
        } else {
            hyphens2 = hyphens;
        }
        return paragraphStyle.m4575copyciSxzs0(textAlign2, textDirection2, j9, textIndent2, platformParagraphStyle2, lineHeightStyle2, lineBreak2, hyphens2);
    }

    /* renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m4567copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            textAlign = TextAlign.m5052boximpl(paragraphStyle.textAlign);
        }
        if ((i8 & 2) != 0) {
            textDirection = TextDirection.m5066boximpl(paragraphStyle.textDirection);
        }
        TextDirection textDirection2 = textDirection;
        if ((i8 & 4) != 0) {
            j8 = paragraphStyle.lineHeight;
        }
        long j9 = j8;
        if ((i8 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        if ((i8 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        PlatformParagraphStyle platformParagraphStyle2 = platformParagraphStyle;
        if ((i8 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        return paragraphStyle.m4576copyxPh5V4g(textAlign, textDirection2, j9, textIndent2, platformParagraphStyle2, lineHeightStyle);
    }

    /* renamed from: copy-ykzQM6k$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m4568copyykzQM6k$default(ParagraphStyle paragraphStyle, int i8, int i9, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i10, int i11, TextMotion textMotion, int i12, Object obj) {
        int i13;
        int i14;
        long j9;
        TextIndent textIndent2;
        PlatformParagraphStyle platformParagraphStyle2;
        LineHeightStyle lineHeightStyle2;
        int i15;
        int i16;
        TextMotion textMotion2;
        if ((i12 & 1) != 0) {
            i13 = paragraphStyle.textAlign;
        } else {
            i13 = i8;
        }
        if ((i12 & 2) != 0) {
            i14 = paragraphStyle.textDirection;
        } else {
            i14 = i9;
        }
        if ((i12 & 4) != 0) {
            j9 = paragraphStyle.lineHeight;
        } else {
            j9 = j8;
        }
        if ((i12 & 8) != 0) {
            textIndent2 = paragraphStyle.textIndent;
        } else {
            textIndent2 = textIndent;
        }
        if ((i12 & 16) != 0) {
            platformParagraphStyle2 = paragraphStyle.platformStyle;
        } else {
            platformParagraphStyle2 = platformParagraphStyle;
        }
        if ((i12 & 32) != 0) {
            lineHeightStyle2 = paragraphStyle.lineHeightStyle;
        } else {
            lineHeightStyle2 = lineHeightStyle;
        }
        if ((i12 & 64) != 0) {
            i15 = paragraphStyle.lineBreak;
        } else {
            i15 = i10;
        }
        if ((i12 & 128) != 0) {
            i16 = paragraphStyle.hyphens;
        } else {
            i16 = i11;
        }
        if ((i12 & 256) != 0) {
            textMotion2 = paragraphStyle.textMotion;
        } else {
            textMotion2 = textMotion;
        }
        return paragraphStyle.m4577copyykzQM6k(i13, i14, j9, textIndent2, platformParagraphStyle2, lineHeightStyle2, i15, i16, textMotion2);
    }

    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m4569getHyphensEaSxIns$annotations() {
    }

    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m4570getLineBreakLgCVezo$annotations() {
    }

    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m4571getTextAlignbuA522U$annotations() {
    }

    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m4572getTextDirectionmmuk1to$annotations() {
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    /* renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m4573copyElsmlbk(TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent) {
        int m5065getUnspecifiede0LSkKk;
        int m5078getUnspecifieds_7Xco;
        if (textAlign != null) {
            m5065getUnspecifiede0LSkKk = textAlign.m5058unboximpl();
        } else {
            m5065getUnspecifiede0LSkKk = TextAlign.Companion.m5065getUnspecifiede0LSkKk();
        }
        int i8 = m5065getUnspecifiede0LSkKk;
        if (textDirection != null) {
            m5078getUnspecifieds_7Xco = textDirection.m5072unboximpl();
        } else {
            m5078getUnspecifieds_7Xco = TextDirection.Companion.m5078getUnspecifieds_7Xco();
        }
        return new ParagraphStyle(i8, m5078getUnspecifieds_7Xco, j8, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (AbstractC3284p) null);
    }

    /* renamed from: copy-NH1kkwU, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m4574copyNH1kkwU(TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        int m5065getUnspecifiede0LSkKk;
        int m5078getUnspecifieds_7Xco;
        int m4992getUnspecifiedrAG3T2k;
        int m4971getUnspecifiedvmbZdU8;
        if (textAlign != null) {
            m5065getUnspecifiede0LSkKk = textAlign.m5058unboximpl();
        } else {
            m5065getUnspecifiede0LSkKk = TextAlign.Companion.m5065getUnspecifiede0LSkKk();
        }
        int i8 = m5065getUnspecifiede0LSkKk;
        if (textDirection != null) {
            m5078getUnspecifieds_7Xco = textDirection.m5072unboximpl();
        } else {
            m5078getUnspecifieds_7Xco = TextDirection.Companion.m5078getUnspecifieds_7Xco();
        }
        int i9 = m5078getUnspecifieds_7Xco;
        if (lineBreak != null) {
            m4992getUnspecifiedrAG3T2k = lineBreak.m4984unboximpl();
        } else {
            m4992getUnspecifiedrAG3T2k = LineBreak.Companion.m4992getUnspecifiedrAG3T2k();
        }
        int i10 = m4992getUnspecifiedrAG3T2k;
        if (hyphens != null) {
            m4971getUnspecifiedvmbZdU8 = hyphens.m4968unboximpl();
        } else {
            m4971getUnspecifiedvmbZdU8 = Hyphens.Companion.m4971getUnspecifiedvmbZdU8();
        }
        return new ParagraphStyle(i8, i9, j8, textIndent, platformParagraphStyle, lineHeightStyle, i10, m4971getUnspecifiedvmbZdU8, textMotion, (AbstractC3284p) null);
    }

    /* renamed from: copy-ciSxzs0, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m4575copyciSxzs0(TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        int m5065getUnspecifiede0LSkKk;
        int m5078getUnspecifieds_7Xco;
        int m4992getUnspecifiedrAG3T2k;
        int m4971getUnspecifiedvmbZdU8;
        if (textAlign != null) {
            m5065getUnspecifiede0LSkKk = textAlign.m5058unboximpl();
        } else {
            m5065getUnspecifiede0LSkKk = TextAlign.Companion.m5065getUnspecifiede0LSkKk();
        }
        int i8 = m5065getUnspecifiede0LSkKk;
        if (textDirection != null) {
            m5078getUnspecifieds_7Xco = textDirection.m5072unboximpl();
        } else {
            m5078getUnspecifieds_7Xco = TextDirection.Companion.m5078getUnspecifieds_7Xco();
        }
        int i9 = m5078getUnspecifieds_7Xco;
        if (lineBreak != null) {
            m4992getUnspecifiedrAG3T2k = lineBreak.m4984unboximpl();
        } else {
            m4992getUnspecifiedrAG3T2k = LineBreak.Companion.m4992getUnspecifiedrAG3T2k();
        }
        int i10 = m4992getUnspecifiedrAG3T2k;
        if (hyphens != null) {
            m4971getUnspecifiedvmbZdU8 = hyphens.m4968unboximpl();
        } else {
            m4971getUnspecifiedvmbZdU8 = Hyphens.Companion.m4971getUnspecifiedvmbZdU8();
        }
        return new ParagraphStyle(i8, i9, j8, textIndent, platformParagraphStyle, lineHeightStyle, i10, m4971getUnspecifiedvmbZdU8, this.textMotion, (AbstractC3284p) null);
    }

    /* renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m4576copyxPh5V4g(TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        int m5065getUnspecifiede0LSkKk;
        int m5078getUnspecifieds_7Xco;
        if (textAlign != null) {
            m5065getUnspecifiede0LSkKk = textAlign.m5058unboximpl();
        } else {
            m5065getUnspecifiede0LSkKk = TextAlign.Companion.m5065getUnspecifiede0LSkKk();
        }
        int i8 = m5065getUnspecifiede0LSkKk;
        if (textDirection != null) {
            m5078getUnspecifieds_7Xco = textDirection.m5072unboximpl();
        } else {
            m5078getUnspecifieds_7Xco = TextDirection.Companion.m5078getUnspecifieds_7Xco();
        }
        return new ParagraphStyle(i8, m5078getUnspecifieds_7Xco, j8, textIndent, platformParagraphStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (AbstractC3284p) null);
    }

    /* renamed from: copy-ykzQM6k, reason: not valid java name */
    public final ParagraphStyle m4577copyykzQM6k(int i8, int i9, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i10, int i11, TextMotion textMotion) {
        return new ParagraphStyle(i8, i9, j8, textIndent, platformParagraphStyle, lineHeightStyle, i10, i11, textMotion, (AbstractC3284p) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        if (TextAlign.m5055equalsimpl0(this.textAlign, paragraphStyle.textAlign) && TextDirection.m5069equalsimpl0(this.textDirection, paragraphStyle.textDirection) && TextUnit.m5339equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && AbstractC3292y.d(this.textIndent, paragraphStyle.textIndent) && AbstractC3292y.d(this.platformStyle, paragraphStyle.platformStyle) && AbstractC3292y.d(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && LineBreak.m4978equalsimpl0(this.lineBreak, paragraphStyle.lineBreak) && Hyphens.m4965equalsimpl0(this.hyphens, paragraphStyle.hyphens) && AbstractC3292y.d(this.textMotion, paragraphStyle.textMotion)) {
            return true;
        }
        return false;
    }

    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m4578getHyphensEaSxIns() {
        return Hyphens.m4962boximpl(this.hyphens);
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m4579getHyphensvmbZdU8() {
        return this.hyphens;
    }

    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m4580getLineBreakLgCVezo() {
        return LineBreak.m4972boximpl(this.lineBreak);
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m4581getLineBreakrAG3T2k() {
        return this.lineBreak;
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m4582getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m4583getTextAlignbuA522U() {
        return TextAlign.m5052boximpl(this.textAlign);
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m4584getTextAligne0LSkKk() {
        return this.textAlign;
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m4585getTextDirectionmmuk1to() {
        return TextDirection.m5066boximpl(this.textDirection);
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m4586getTextDirections_7Xco() {
        return this.textDirection;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    public int hashCode() {
        int i8;
        int i9;
        int i10;
        int m5056hashCodeimpl = ((((TextAlign.m5056hashCodeimpl(this.textAlign) * 31) + TextDirection.m5070hashCodeimpl(this.textDirection)) * 31) + TextUnit.m5343hashCodeimpl(this.lineHeight)) * 31;
        TextIndent textIndent = this.textIndent;
        int i11 = 0;
        if (textIndent != null) {
            i8 = textIndent.hashCode();
        } else {
            i8 = 0;
        }
        int i12 = (m5056hashCodeimpl + i8) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        if (platformParagraphStyle != null) {
            i9 = platformParagraphStyle.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = (i12 + i9) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        if (lineHeightStyle != null) {
            i10 = lineHeightStyle.hashCode();
        } else {
            i10 = 0;
        }
        int m4982hashCodeimpl = (((((i13 + i10) * 31) + LineBreak.m4982hashCodeimpl(this.lineBreak)) * 31) + Hyphens.m4966hashCodeimpl(this.hyphens)) * 31;
        TextMotion textMotion = this.textMotion;
        if (textMotion != null) {
            i11 = textMotion.hashCode();
        }
        return m4982hashCodeimpl + i11;
    }

    @Stable
    public final ParagraphStyle merge(ParagraphStyle paragraphStyle) {
        if (paragraphStyle == null) {
            return this;
        }
        return ParagraphStyleKt.m4587fastMergej5T8yCg(this, paragraphStyle.textAlign, paragraphStyle.textDirection, paragraphStyle.lineHeight, paragraphStyle.textIndent, paragraphStyle.platformStyle, paragraphStyle.lineHeightStyle, paragraphStyle.lineBreak, paragraphStyle.hyphens, paragraphStyle.textMotion);
    }

    @Stable
    public final ParagraphStyle plus(ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) TextAlign.m5057toStringimpl(this.textAlign)) + ", textDirection=" + ((Object) TextDirection.m5071toStringimpl(this.textDirection)) + ", lineHeight=" + ((Object) TextUnit.m5349toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) LineBreak.m4983toStringimpl(this.lineBreak)) + ", hyphens=" + ((Object) Hyphens.m4967toStringimpl(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, AbstractC3284p abstractC3284p) {
        this(textAlign, textDirection, j8, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, AbstractC3284p abstractC3284p) {
        this(textAlign, textDirection, j8, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, AbstractC3284p abstractC3284p) {
        this(textAlign, textDirection, j8, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, AbstractC3284p abstractC3284p) {
        this(textAlign, textDirection, j8, textIndent);
    }

    private ParagraphStyle(int i8, int i9, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i10, int i11, TextMotion textMotion) {
        this.textAlign = i8;
        this.textDirection = i9;
        this.lineHeight = j8;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = i10;
        this.hyphens = i11;
        this.textMotion = textMotion;
        if (TextUnit.m5339equalsimpl0(j8, TextUnit.Companion.m5353getUnspecifiedXSAIIZE()) || TextUnit.m5342getValueimpl(j8) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + TextUnit.m5342getValueimpl(j8) + ')').toString());
    }

    public /* synthetic */ ParagraphStyle(int i8, int i9, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i10, int i11, TextMotion textMotion, int i12, AbstractC3284p abstractC3284p) {
        this((i12 & 1) != 0 ? TextAlign.Companion.m5065getUnspecifiede0LSkKk() : i8, (i12 & 2) != 0 ? TextDirection.Companion.m5078getUnspecifieds_7Xco() : i9, (i12 & 4) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j8, (i12 & 8) != 0 ? null : textIndent, (i12 & 16) != 0 ? null : platformParagraphStyle, (i12 & 32) != 0 ? null : lineHeightStyle, (i12 & 64) != 0 ? LineBreak.Companion.m4992getUnspecifiedrAG3T2k() : i10, (i12 & 128) != 0 ? Hyphens.Companion.m4971getUnspecifiedvmbZdU8() : i11, (i12 & 256) == 0 ? textMotion : null, (AbstractC3284p) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : textAlign, (i8 & 2) != 0 ? null : textDirection, (i8 & 4) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j8, (i8 & 8) != 0 ? null : textIndent, (i8 & 16) != 0 ? null : platformParagraphStyle, (i8 & 32) != 0 ? null : lineHeightStyle, (i8 & 64) != 0 ? null : lineBreak, (i8 & 128) != 0 ? null : hyphens, (i8 & 256) == 0 ? textMotion : null, (AbstractC3284p) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(textAlign != null ? textAlign.m5058unboximpl() : TextAlign.Companion.m5065getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5072unboximpl() : TextDirection.Companion.m5078getUnspecifieds_7Xco(), j8, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m4984unboximpl() : LineBreak.Companion.m4992getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m4968unboximpl() : Hyphens.Companion.m4971getUnspecifiedvmbZdU8(), textMotion, (AbstractC3284p) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : textAlign, (i8 & 2) != 0 ? null : textDirection, (i8 & 4) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j8, (i8 & 8) != 0 ? null : textIndent, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent) {
        this(textAlign != null ? textAlign.m5058unboximpl() : TextAlign.Companion.m5065getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5072unboximpl() : TextDirection.Companion.m5078getUnspecifieds_7Xco(), j8, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.Companion.m4992getUnspecifiedrAG3T2k(), Hyphens.Companion.m4971getUnspecifiedvmbZdU8(), (TextMotion) null, (AbstractC3284p) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : textAlign, (i8 & 2) != 0 ? null : textDirection, (i8 & 4) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j8, (i8 & 8) != 0 ? null : textIndent, (i8 & 16) != 0 ? null : platformParagraphStyle, (i8 & 32) == 0 ? lineHeightStyle : null, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        this(textAlign != null ? textAlign.m5058unboximpl() : TextAlign.Companion.m5065getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5072unboximpl() : TextDirection.Companion.m5078getUnspecifieds_7Xco(), j8, textIndent, platformParagraphStyle, lineHeightStyle, LineBreak.Companion.m4992getUnspecifiedrAG3T2k(), Hyphens.Companion.m4971getUnspecifiedvmbZdU8(), (TextMotion) null, (AbstractC3284p) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : textAlign, (i8 & 2) != 0 ? null : textDirection, (i8 & 4) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j8, (i8 & 8) != 0 ? null : textIndent, (i8 & 16) != 0 ? null : platformParagraphStyle, (i8 & 32) != 0 ? null : lineHeightStyle, (i8 & 64) != 0 ? null : lineBreak, (i8 & 128) == 0 ? hyphens : null, (AbstractC3284p) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(textAlign != null ? textAlign.m5058unboximpl() : TextAlign.Companion.m5065getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5072unboximpl() : TextDirection.Companion.m5078getUnspecifieds_7Xco(), j8, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m4984unboximpl() : LineBreak.Companion.m4992getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m4968unboximpl() : Hyphens.Companion.m4971getUnspecifiedvmbZdU8(), (TextMotion) null, (AbstractC3284p) null);
    }
}
