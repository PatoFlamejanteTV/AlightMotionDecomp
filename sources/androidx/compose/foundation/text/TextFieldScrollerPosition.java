package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import i6.m;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
public final class TextFieldScrollerPosition {
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextFieldScrollerPosition, Object> Saver = ListSaverKt.listSaver(TextFieldScrollerPosition$Companion$Saver$1.INSTANCE, TextFieldScrollerPosition$Companion$Saver$2.INSTANCE);
    private final MutableFloatState maximum$delegate;
    private final MutableFloatState offset$delegate;
    private final MutableState orientation$delegate;
    private Rect previousCursorRect;
    private long previousSelection;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Saver<TextFieldScrollerPosition, Object> getSaver() {
            return TextFieldScrollerPosition.Saver;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public TextFieldScrollerPosition(Orientation initialOrientation, float f8) {
        AbstractC3292y.i(initialOrientation, "initialOrientation");
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f8);
        this.maximum$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.previousCursorRect = Rect.Companion.getZero();
        this.previousSelection = TextRange.Companion.m4674getZerod9O1mEE();
        this.orientation$delegate = SnapshotStateKt.mutableStateOf(initialOrientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    private final void setMaximum(float f8) {
        this.maximum$delegate.setFloatValue(f8);
    }

    public final void coerceOffset$foundation_release(float f8, float f9, int i8) {
        float f10;
        float offset = getOffset();
        float f11 = i8;
        float f12 = offset + f11;
        if (f9 > f12 || (f8 < offset && f9 - f8 > f11)) {
            f10 = f9 - f12;
        } else if (f8 < offset && f9 - f8 <= f11) {
            f10 = f8 - offset;
        } else {
            f10 = 0.0f;
        }
        setOffset(getOffset() + f10);
    }

    public final float getMaximum() {
        return this.maximum$delegate.getFloatValue();
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    /* renamed from: getOffsetToFollow-5zc-tL8, reason: not valid java name */
    public final int m922getOffsetToFollow5zctL8(long j8) {
        if (TextRange.m4669getStartimpl(j8) != TextRange.m4669getStartimpl(this.previousSelection)) {
            return TextRange.m4669getStartimpl(j8);
        }
        if (TextRange.m4664getEndimpl(j8) != TextRange.m4664getEndimpl(this.previousSelection)) {
            return TextRange.m4664getEndimpl(j8);
        }
        return TextRange.m4667getMinimpl(j8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Orientation getOrientation() {
        return (Orientation) this.orientation$delegate.getValue();
    }

    /* renamed from: getPreviousSelection-d9O1mEE, reason: not valid java name */
    public final long m923getPreviousSelectiond9O1mEE() {
        return this.previousSelection;
    }

    public final void setOffset(float f8) {
        this.offset$delegate.setFloatValue(f8);
    }

    public final void setOrientation(Orientation orientation) {
        AbstractC3292y.i(orientation, "<set-?>");
        this.orientation$delegate.setValue(orientation);
    }

    /* renamed from: setPreviousSelection-5zc-tL8, reason: not valid java name */
    public final void m924setPreviousSelection5zctL8(long j8) {
        this.previousSelection = j8;
    }

    public final void update(Orientation orientation, Rect cursorRect, int i8, int i9) {
        boolean z8;
        float left;
        float right;
        AbstractC3292y.i(orientation, "orientation");
        AbstractC3292y.i(cursorRect, "cursorRect");
        float f8 = i9 - i8;
        setMaximum(f8);
        if (cursorRect.getLeft() != this.previousCursorRect.getLeft() || cursorRect.getTop() != this.previousCursorRect.getTop()) {
            if (orientation == Orientation.Vertical) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                left = cursorRect.getTop();
            } else {
                left = cursorRect.getLeft();
            }
            if (z8) {
                right = cursorRect.getBottom();
            } else {
                right = cursorRect.getRight();
            }
            coerceOffset$foundation_release(left, right, i8);
            this.previousCursorRect = cursorRect;
        }
        setOffset(m.j(getOffset(), 0.0f, f8));
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f8, int i8, AbstractC3284p abstractC3284p) {
        this(orientation, (i8 & 2) != 0 ? 0.0f : f8);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }
}
