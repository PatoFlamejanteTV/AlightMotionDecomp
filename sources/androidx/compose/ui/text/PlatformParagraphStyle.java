package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PlatformParagraphStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final PlatformParagraphStyle Default = new PlatformParagraphStyle();
    private final int emojiSupportMatch;
    private final boolean includeFontPadding;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final PlatformParagraphStyle getDefault() {
            return PlatformParagraphStyle.Default;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ PlatformParagraphStyle(int i8, AbstractC3284p abstractC3284p) {
        this(i8);
    }

    public static /* synthetic */ void getIncludeFontPadding$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformParagraphStyle)) {
            return false;
        }
        PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) obj;
        if (this.includeFontPadding == platformParagraphStyle.includeFontPadding && EmojiSupportMatch.m4539equalsimpl0(this.emojiSupportMatch, platformParagraphStyle.emojiSupportMatch)) {
            return true;
        }
        return false;
    }

    /* renamed from: getEmojiSupportMatch-_3YsG6Y, reason: not valid java name */
    public final int m4607getEmojiSupportMatch_3YsG6Y() {
        return this.emojiSupportMatch;
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public int hashCode() {
        return (androidx.compose.foundation.a.a(this.includeFontPadding) * 31) + EmojiSupportMatch.m4540hashCodeimpl(this.emojiSupportMatch);
    }

    public final PlatformParagraphStyle merge(PlatformParagraphStyle platformParagraphStyle) {
        return platformParagraphStyle == null ? this : platformParagraphStyle;
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + ((Object) EmojiSupportMatch.m4541toStringimpl(this.emojiSupportMatch)) + ')';
    }

    public /* synthetic */ PlatformParagraphStyle(int i8, boolean z8, AbstractC3284p abstractC3284p) {
        this(i8, z8);
    }

    public PlatformParagraphStyle(boolean z8) {
        this.includeFontPadding = z8;
        this.emojiSupportMatch = EmojiSupportMatch.Companion.m4543getDefault_3YsG6Y();
    }

    public /* synthetic */ PlatformParagraphStyle(boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? false : z8);
    }

    public /* synthetic */ PlatformParagraphStyle(int i8, boolean z8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? EmojiSupportMatch.Companion.m4543getDefault_3YsG6Y() : i8, (i9 & 2) != 0 ? false : z8, (AbstractC3284p) null);
    }

    private PlatformParagraphStyle(int i8, boolean z8) {
        this.includeFontPadding = z8;
        this.emojiSupportMatch = i8;
    }

    private PlatformParagraphStyle(int i8) {
        this.includeFontPadding = false;
        this.emojiSupportMatch = i8;
    }

    public /* synthetic */ PlatformParagraphStyle(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? EmojiSupportMatch.Companion.m4543getDefault_3YsG6Y() : i8, (AbstractC3284p) null);
    }

    public PlatformParagraphStyle() {
        this(EmojiSupportMatch.Companion.m4543getDefault_3YsG6Y(), false, (AbstractC3284p) null);
    }
}
