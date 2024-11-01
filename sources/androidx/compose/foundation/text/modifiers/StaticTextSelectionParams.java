package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextOverflow;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public class StaticTextSelectionParams {
    public static final Companion Companion = new Companion(null);
    private static final StaticTextSelectionParams Empty = new StaticTextSelectionParams(null, null);
    private final LayoutCoordinates layoutCoordinates;
    private final TextLayoutResult textLayoutResult;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final StaticTextSelectionParams getEmpty() {
            return StaticTextSelectionParams.Empty;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public StaticTextSelectionParams(LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult) {
        this.layoutCoordinates = layoutCoordinates;
        this.textLayoutResult = textLayoutResult;
    }

    public static /* synthetic */ StaticTextSelectionParams copy$default(StaticTextSelectionParams staticTextSelectionParams, LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                layoutCoordinates = staticTextSelectionParams.layoutCoordinates;
            }
            if ((i8 & 2) != 0) {
                textLayoutResult = staticTextSelectionParams.textLayoutResult;
            }
            return staticTextSelectionParams.copy(layoutCoordinates, textLayoutResult);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    public final StaticTextSelectionParams copy(LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult) {
        return new StaticTextSelectionParams(layoutCoordinates, textLayoutResult);
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public Path getPathForRange(int i8, int i9) {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            return textLayoutResult.getPathForRange(i8, i9);
        }
        return null;
    }

    public boolean getShouldClip() {
        TextOverflow textOverflow;
        TextLayoutInput layoutInput;
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null && (layoutInput = textLayoutResult.getLayoutInput()) != null) {
            textOverflow = TextOverflow.m5098boximpl(layoutInput.m4638getOverflowgIe3tQ8());
        } else {
            textOverflow = null;
        }
        int m5110getVisiblegIe3tQ8 = TextOverflow.Companion.m5110getVisiblegIe3tQ8();
        if (textOverflow == null) {
            return false;
        }
        return TextOverflow.m5101equalsimpl0(textOverflow.m5104unboximpl(), m5110getVisiblegIe3tQ8);
    }

    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }
}
