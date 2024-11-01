package androidx.compose.ui.text;

import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class AndroidTextStyle_androidKt {
    public static final boolean DefaultIncludeFontPadding = false;

    public static final PlatformTextStyle createPlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    public static final PlatformSpanStyle lerp(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f8) {
        return platformSpanStyle;
    }

    public static final PlatformParagraphStyle lerp(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f8) {
        return platformParagraphStyle.getIncludeFontPadding() == platformParagraphStyle2.getIncludeFontPadding() ? platformParagraphStyle : new PlatformParagraphStyle(((EmojiSupportMatch) SpanStyleKt.lerpDiscrete(EmojiSupportMatch.m4536boximpl(platformParagraphStyle.m4607getEmojiSupportMatch_3YsG6Y()), EmojiSupportMatch.m4536boximpl(platformParagraphStyle2.m4607getEmojiSupportMatch_3YsG6Y()), f8)).m4542unboximpl(), ((Boolean) SpanStyleKt.lerpDiscrete(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding()), Boolean.valueOf(platformParagraphStyle2.getIncludeFontPadding()), f8)).booleanValue(), (AbstractC3284p) null);
    }
}
