package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ValidatingOffsetMappingKt {
    private static final OffsetMapping ValidatingEmptyOffsetMappingIdentity = new ValidatingOffsetMapping(OffsetMapping.Companion.getIdentity(), 0, 0);

    public static final TransformedText filterWithValidation(VisualTransformation visualTransformation, AnnotatedString text) {
        AbstractC3292y.i(visualTransformation, "<this>");
        AbstractC3292y.i(text, "text");
        TransformedText filter = visualTransformation.filter(text);
        return new TransformedText(filter.getText(), new ValidatingOffsetMapping(filter.getOffsetMapping(), text.length(), filter.getText().length()));
    }

    public static final OffsetMapping getValidatingEmptyOffsetMappingIdentity() {
        return ValidatingEmptyOffsetMappingIdentity;
    }
}
