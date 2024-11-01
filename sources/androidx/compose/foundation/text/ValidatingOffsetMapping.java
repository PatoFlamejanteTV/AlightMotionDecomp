package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class ValidatingOffsetMapping implements OffsetMapping {
    private final OffsetMapping delegate;
    private final int originalLength;
    private final int transformedLength;

    public ValidatingOffsetMapping(OffsetMapping delegate, int i8, int i9) {
        AbstractC3292y.i(delegate, "delegate");
        this.delegate = delegate;
        this.originalLength = i8;
        this.transformedLength = i9;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int originalToTransformed(int i8) {
        int originalToTransformed = this.delegate.originalToTransformed(i8);
        if (originalToTransformed >= 0 && originalToTransformed <= this.transformedLength) {
            return originalToTransformed;
        }
        throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i8 + " -> " + originalToTransformed + " is not in range of transformed text [0, " + this.transformedLength + ']').toString());
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int transformedToOriginal(int i8) {
        int transformedToOriginal = this.delegate.transformedToOriginal(i8);
        if (transformedToOriginal >= 0 && transformedToOriginal <= this.originalLength) {
            return transformedToOriginal;
        }
        throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i8 + " -> " + transformedToOriginal + " is not in range of original text [0, " + this.originalLength + ']').toString());
    }
}
