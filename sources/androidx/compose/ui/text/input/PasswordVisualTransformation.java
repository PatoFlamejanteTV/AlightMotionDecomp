package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PasswordVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private final char mask;

    public PasswordVisualTransformation() {
        this((char) 0, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PasswordVisualTransformation) && this.mask == ((PasswordVisualTransformation) obj).mask) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        return new TransformedText(new AnnotatedString(l6.n.v(String.valueOf(this.mask), annotatedString.getText().length()), null, null, 6, null), OffsetMapping.Companion.getIdentity());
    }

    public final char getMask() {
        return this.mask;
    }

    public int hashCode() {
        return this.mask;
    }

    public PasswordVisualTransformation(char c8) {
        this.mask = c8;
    }

    public /* synthetic */ PasswordVisualTransformation(char c8, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? (char) 8226 : c8);
    }
}
