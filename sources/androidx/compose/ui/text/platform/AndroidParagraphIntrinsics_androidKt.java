package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Density;
import java.util.List;

/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics_androidKt {
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(TextStyle textStyle) {
        EmojiSupportMatch emojiSupportMatch;
        boolean m4539equalsimpl0;
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle != null && (paragraphStyle = platformStyle.getParagraphStyle()) != null) {
            emojiSupportMatch = EmojiSupportMatch.m4536boximpl(paragraphStyle.m4607getEmojiSupportMatch_3YsG6Y());
        } else {
            emojiSupportMatch = null;
        }
        int m4544getNone_3YsG6Y = EmojiSupportMatch.Companion.m4544getNone_3YsG6Y();
        if (emojiSupportMatch == null) {
            m4539equalsimpl0 = false;
        } else {
            m4539equalsimpl0 = EmojiSupportMatch.m4539equalsimpl0(emojiSupportMatch.m4542unboximpl(), m4544getNone_3YsG6Y);
        }
        return !m4539equalsimpl0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:            if (r6 == null) goto L22;     */
    /* renamed from: resolveTextDirectionHeuristics-HklW4sA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m4915resolveTextDirectionHeuristicsHklW4sA(int r6, androidx.compose.ui.text.intl.LocaleList r7) {
        /*
            androidx.compose.ui.text.style.TextDirection$Companion r0 = androidx.compose.ui.text.style.TextDirection.Companion
            int r1 = r0.m5074getContentOrLtrs_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m5069equalsimpl0(r6, r1)
            r2 = 2
            if (r1 == 0) goto Le
            goto L6e
        Le:
            int r1 = r0.m5075getContentOrRtls_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m5069equalsimpl0(r6, r1)
            r3 = 3
            if (r1 == 0) goto L1b
        L19:
            r2 = 3
            goto L6e
        L1b:
            int r1 = r0.m5076getLtrs_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m5069equalsimpl0(r6, r1)
            r4 = 0
            if (r1 == 0) goto L28
            r2 = 0
            goto L6e
        L28:
            int r1 = r0.m5077getRtls_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m5069equalsimpl0(r6, r1)
            r5 = 1
            if (r1 == 0) goto L35
            r2 = 1
            goto L6e
        L35:
            int r1 = r0.m5073getContents_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m5069equalsimpl0(r6, r1)
            if (r1 == 0) goto L41
            r6 = 1
            goto L49
        L41:
            int r0 = r0.m5078getUnspecifieds_7Xco()
            boolean r6 = androidx.compose.ui.text.style.TextDirection.m5069equalsimpl0(r6, r0)
        L49:
            if (r6 == 0) goto L6f
            if (r7 == 0) goto L62
            androidx.compose.ui.text.intl.Locale r6 = r7.get(r4)
            androidx.compose.ui.text.intl.PlatformLocale r6 = r6.getPlatformLocale$ui_text_release()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"
            kotlin.jvm.internal.AbstractC3292y.g(r6, r7)
            androidx.compose.ui.text.intl.AndroidLocale r6 = (androidx.compose.ui.text.intl.AndroidLocale) r6
            java.util.Locale r6 = r6.getJavaLocale()
            if (r6 != 0) goto L66
        L62:
            java.util.Locale r6 = java.util.Locale.getDefault()
        L66:
            int r6 = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(r6)
            if (r6 == 0) goto L6e
            if (r6 == r5) goto L19
        L6e:
            return r2
        L6f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt.m4915resolveTextDirectionHeuristicsHklW4sA(int, androidx.compose.ui.text.intl.LocaleList):int");
    }

    /* renamed from: resolveTextDirectionHeuristics-HklW4sA$default, reason: not valid java name */
    public static /* synthetic */ int m4916resolveTextDirectionHeuristicsHklW4sA$default(int i8, LocaleList localeList, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            localeList = null;
        }
        return m4915resolveTextDirectionHeuristicsHklW4sA(i8, localeList);
    }
}
