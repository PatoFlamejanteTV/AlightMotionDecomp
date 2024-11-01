package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class TextIndent {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextIndent None = new TextIndent(0, 0, 3, null);
    private final long firstLine;
    private final long restLine;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        public final TextIndent getNone() {
            return TextIndent.None;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ TextIndent(long j8, long j9, AbstractC3284p abstractC3284p) {
        this(j8, j9);
    }

    /* renamed from: copy-NB67dxo$default, reason: not valid java name */
    public static /* synthetic */ TextIndent m5081copyNB67dxo$default(TextIndent textIndent, long j8, long j9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = textIndent.firstLine;
        }
        if ((i8 & 2) != 0) {
            j9 = textIndent.restLine;
        }
        return textIndent.m5082copyNB67dxo(j8, j9);
    }

    /* renamed from: copy-NB67dxo, reason: not valid java name */
    public final TextIndent m5082copyNB67dxo(long j8, long j9) {
        return new TextIndent(j8, j9, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) obj;
        if (TextUnit.m5339equalsimpl0(this.firstLine, textIndent.firstLine) && TextUnit.m5339equalsimpl0(this.restLine, textIndent.restLine)) {
            return true;
        }
        return false;
    }

    /* renamed from: getFirstLine-XSAIIZE, reason: not valid java name */
    public final long m5083getFirstLineXSAIIZE() {
        return this.firstLine;
    }

    /* renamed from: getRestLine-XSAIIZE, reason: not valid java name */
    public final long m5084getRestLineXSAIIZE() {
        return this.restLine;
    }

    public int hashCode() {
        return (TextUnit.m5343hashCodeimpl(this.firstLine) * 31) + TextUnit.m5343hashCodeimpl(this.restLine);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) TextUnit.m5349toStringimpl(this.firstLine)) + ", restLine=" + ((Object) TextUnit.m5349toStringimpl(this.restLine)) + ')';
    }

    private TextIndent(long j8, long j9) {
        this.firstLine = j8;
        this.restLine = j9;
    }

    public /* synthetic */ TextIndent(long j8, long j9, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? TextUnitKt.getSp(0) : j8, (i8 & 2) != 0 ? TextUnitKt.getSp(0) : j9, null);
    }
}
