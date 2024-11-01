package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class InlineTextContentKt {
    public static final String INLINE_CONTENT_TAG = "androidx.compose.foundation.text.inlineContent";
    private static final String REPLACEMENT_CHAR = "�";

    public static final void appendInlineContent(AnnotatedString.Builder builder, String id, String alternateText) {
        AbstractC3292y.i(builder, "<this>");
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(alternateText, "alternateText");
        if (alternateText.length() > 0) {
            builder.pushStringAnnotation(INLINE_CONTENT_TAG, id);
            builder.append(alternateText);
            builder.pop();
            return;
        }
        throw new IllegalArgumentException("alternateText can't be an empty string.".toString());
    }

    public static /* synthetic */ void appendInlineContent$default(AnnotatedString.Builder builder, String str, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = REPLACEMENT_CHAR;
        }
        appendInlineContent(builder, str, str2);
    }
}
