package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class TextSelectionColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long handleColor;

    public /* synthetic */ TextSelectionColors(long j8, long j9, AbstractC3284p abstractC3284p) {
        this(j8, j9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextSelectionColors)) {
            return false;
        }
        TextSelectionColors textSelectionColors = (TextSelectionColors) obj;
        if (Color.m2949equalsimpl0(this.handleColor, textSelectionColors.handleColor) && Color.m2949equalsimpl0(this.backgroundColor, textSelectionColors.backgroundColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m1070getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getHandleColor-0d7_KjU, reason: not valid java name */
    public final long m1071getHandleColor0d7_KjU() {
        return this.handleColor;
    }

    public int hashCode() {
        return (Color.m2955hashCodeimpl(this.handleColor) * 31) + Color.m2955hashCodeimpl(this.backgroundColor);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) Color.m2956toStringimpl(this.handleColor)) + ", selectionBackgroundColor=" + ((Object) Color.m2956toStringimpl(this.backgroundColor)) + ')';
    }

    private TextSelectionColors(long j8, long j9) {
        this.handleColor = j8;
        this.backgroundColor = j9;
    }
}
