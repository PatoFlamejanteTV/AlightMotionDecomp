package androidx.compose.ui.platform;

import R5.AbstractC1428l;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AndroidClipboardManager_androidKt {
    private static final byte BACKGROUND_ID = 10;
    private static final byte BASELINE_SHIFT_ID = 8;
    private static final int BASELINE_SHIFT_SIZE = 4;
    private static final int BYTE_SIZE = 1;
    private static final byte COLOR_ID = 1;
    private static final int COLOR_SIZE = 8;
    private static final int FLOAT_SIZE = 4;
    private static final byte FONT_FEATURE_SETTINGS_ID = 6;
    private static final byte FONT_SIZE_ID = 2;
    private static final byte FONT_STYLE_ID = 4;
    private static final byte FONT_STYLE_ITALIC = 1;
    private static final byte FONT_STYLE_NORMAL = 0;
    private static final int FONT_STYLE_SIZE = 1;
    private static final byte FONT_SYNTHESIS_ALL = 1;
    private static final byte FONT_SYNTHESIS_ID = 5;
    private static final byte FONT_SYNTHESIS_NONE = 0;
    private static final int FONT_SYNTHESIS_SIZE = 1;
    private static final byte FONT_SYNTHESIS_STYLE = 3;
    private static final byte FONT_SYNTHESIS_WEIGHT = 2;
    private static final byte FONT_WEIGHT_ID = 3;
    private static final int FONT_WEIGHT_SIZE = 4;
    private static final int INT_SIZE = 4;
    private static final byte LETTER_SPACING_ID = 7;
    private static final int LONG_SIZE = 8;
    private static final String PLAIN_TEXT_LABEL = "plain text";
    private static final byte SHADOW_ID = 12;
    private static final int SHADOW_SIZE = 20;
    private static final byte TEXT_DECORATION_ID = 11;
    private static final int TEXT_DECORATION_SIZE = 4;
    private static final byte TEXT_GEOMETRIC_TRANSFORM_ID = 9;
    private static final int TEXT_GEOMETRIC_TRANSFORM_SIZE = 8;
    private static final int TEXT_UNIT_SIZE = 5;
    private static final byte UNIT_TYPE_EM = 2;
    private static final byte UNIT_TYPE_SP = 1;
    private static final byte UNIT_TYPE_UNSPECIFIED = 0;

    public static final AnnotatedString convertToAnnotatedString(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new AnnotatedString(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i8 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int i02 = AbstractC1428l.i0(annotationArr);
        if (i02 >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i8];
                if (AbstractC3292y.d(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new AnnotatedString.Range(new DecodeHelper(annotation.getValue()).decodeSpanStyle(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i8 == i02) {
                    break;
                }
                i8++;
            }
        }
        return new AnnotatedString(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence convertToCharSequence(AnnotatedString annotatedString) {
        if (annotatedString.getSpanStyles().isEmpty()) {
            return annotatedString.getText();
        }
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        EncodeHelper encodeHelper = new EncodeHelper();
        List<AnnotatedString.Range<SpanStyle>> spanStyles = annotatedString.getSpanStyles();
        int size = spanStyles.size();
        for (int i8 = 0; i8 < size; i8++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i8);
            SpanStyle component1 = range.component1();
            int component2 = range.component2();
            int component3 = range.component3();
            encodeHelper.reset();
            encodeHelper.encode(component1);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", encodeHelper.encodedString()), component2, component3, 33);
        }
        return spannableString;
    }
}
