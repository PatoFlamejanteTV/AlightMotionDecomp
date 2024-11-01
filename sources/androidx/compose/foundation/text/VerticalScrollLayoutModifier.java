package androidx.compose.foundation.text;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Constraints;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class VerticalScrollLayoutModifier implements LayoutModifier {
    private final int cursorOffset;
    private final TextFieldScrollerPosition scrollerPosition;
    private final Function0 textLayoutResultProvider;
    private final TransformedText transformedText;

    public VerticalScrollLayoutModifier(TextFieldScrollerPosition scrollerPosition, int i8, TransformedText transformedText, Function0 textLayoutResultProvider) {
        AbstractC3292y.i(scrollerPosition, "scrollerPosition");
        AbstractC3292y.i(transformedText, "transformedText");
        AbstractC3292y.i(textLayoutResultProvider, "textLayoutResultProvider");
        this.scrollerPosition = scrollerPosition;
        this.cursorOffset = i8;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = textLayoutResultProvider;
    }

    public static /* synthetic */ VerticalScrollLayoutModifier copy$default(VerticalScrollLayoutModifier verticalScrollLayoutModifier, TextFieldScrollerPosition textFieldScrollerPosition, int i8, TransformedText transformedText, Function0 function0, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            textFieldScrollerPosition = verticalScrollLayoutModifier.scrollerPosition;
        }
        if ((i9 & 2) != 0) {
            i8 = verticalScrollLayoutModifier.cursorOffset;
        }
        if ((i9 & 4) != 0) {
            transformedText = verticalScrollLayoutModifier.transformedText;
        }
        if ((i9 & 8) != 0) {
            function0 = verticalScrollLayoutModifier.textLayoutResultProvider;
        }
        return verticalScrollLayoutModifier.copy(textFieldScrollerPosition, i8, transformedText, function0);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return b.b(this, function1);
    }

    public final TextFieldScrollerPosition component1() {
        return this.scrollerPosition;
    }

    public final int component2() {
        return this.cursorOffset;
    }

    public final TransformedText component3() {
        return this.transformedText;
    }

    public final Function0 component4() {
        return this.textLayoutResultProvider;
    }

    public final VerticalScrollLayoutModifier copy(TextFieldScrollerPosition scrollerPosition, int i8, TransformedText transformedText, Function0 textLayoutResultProvider) {
        AbstractC3292y.i(scrollerPosition, "scrollerPosition");
        AbstractC3292y.i(transformedText, "transformedText");
        AbstractC3292y.i(textLayoutResultProvider, "textLayoutResultProvider");
        return new VerticalScrollLayoutModifier(scrollerPosition, i8, transformedText, textLayoutResultProvider);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalScrollLayoutModifier)) {
            return false;
        }
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj;
        return AbstractC3292y.d(this.scrollerPosition, verticalScrollLayoutModifier.scrollerPosition) && this.cursorOffset == verticalScrollLayoutModifier.cursorOffset && AbstractC3292y.d(this.transformedText, verticalScrollLayoutModifier.transformedText) && AbstractC3292y.d(this.textLayoutResultProvider, verticalScrollLayoutModifier.textLayoutResultProvider);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, InterfaceC2072n interfaceC2072n) {
        return b.c(this, obj, interfaceC2072n);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, InterfaceC2072n interfaceC2072n) {
        return b.d(this, obj, interfaceC2072n);
    }

    public final int getCursorOffset() {
        return this.cursorOffset;
    }

    public final TextFieldScrollerPosition getScrollerPosition() {
        return this.scrollerPosition;
    }

    public final Function0 getTextLayoutResultProvider() {
        return this.textLayoutResultProvider;
    }

    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    public int hashCode() {
        return (((((this.scrollerPosition.hashCode() * 31) + this.cursorOffset) * 31) + this.transformedText.hashCode()) * 31) + this.textLayoutResultProvider.hashCode();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return e.a(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return e.b(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo133measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurable, "measurable");
        Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(Constraints.m5114copyZbe2FdA$default(j8, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int min = Math.min(mo4108measureBRTryo0.getHeight(), Constraints.m5122getMaxHeightimpl(j8));
        return MeasureScope.CC.q(measure, mo4108measureBRTryo0.getWidth(), min, null, new VerticalScrollLayoutModifier$measure$1(measure, this, mo4108measureBRTryo0, min), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return e.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return e.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return a.a(this, modifier);
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }
}
