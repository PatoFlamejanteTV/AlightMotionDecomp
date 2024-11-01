package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class TextGeometricTransform {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextGeometricTransform None = new TextGeometricTransform(1.0f, 0.0f);
    private final float scaleX;
    private final float skewX;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getNone$ui_text_release$annotations() {
        }

        public final TextGeometricTransform getNone$ui_text_release() {
            return TextGeometricTransform.None;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextGeometricTransform() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.style.TextGeometricTransform.<init>():void");
    }

    public static /* synthetic */ TextGeometricTransform copy$default(TextGeometricTransform textGeometricTransform, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = textGeometricTransform.scaleX;
        }
        if ((i8 & 2) != 0) {
            f9 = textGeometricTransform.skewX;
        }
        return textGeometricTransform.copy(f8, f9);
    }

    public final TextGeometricTransform copy(float f8, float f9) {
        return new TextGeometricTransform(f8, f9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextGeometricTransform)) {
            return false;
        }
        TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj;
        if (this.scaleX == textGeometricTransform.scaleX && this.skewX == textGeometricTransform.skewX) {
            return true;
        }
        return false;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.scaleX) * 31) + Float.floatToIntBits(this.skewX);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.scaleX + ", skewX=" + this.skewX + ')';
    }

    public TextGeometricTransform(float f8, float f9) {
        this.scaleX = f8;
        this.skewX = f9;
    }

    public /* synthetic */ TextGeometricTransform(float f8, float f9, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? 1.0f : f8, (i8 & 2) != 0 ? 0.0f : f9);
    }
}
