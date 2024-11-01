package androidx.compose.foundation.text;

import Q5.p;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextFieldScrollKt {

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, int i8, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z8, int i9) {
        Rect zero;
        float left;
        float left2;
        if (textLayoutResult == null || (zero = textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i8))) == null) {
            zero = Rect.Companion.getZero();
        }
        Rect rect = zero;
        int mo419roundToPx0680j_4 = density.mo419roundToPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
        if (z8) {
            left = (i9 - rect.getLeft()) - mo419roundToPx0680j_4;
        } else {
            left = rect.getLeft();
        }
        float f8 = left;
        if (z8) {
            left2 = i9 - rect.getLeft();
        } else {
            left2 = rect.getLeft() + mo419roundToPx0680j_4;
        }
        return Rect.copy$default(rect, f8, 0.0f, left2, 0.0f, 10, null);
    }

    public static final Modifier textFieldScroll(Modifier modifier, TextFieldScrollerPosition scrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Function0 textLayoutResultProvider) {
        Modifier verticalScrollLayoutModifier;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(scrollerPosition, "scrollerPosition");
        AbstractC3292y.i(textFieldValue, "textFieldValue");
        AbstractC3292y.i(visualTransformation, "visualTransformation");
        AbstractC3292y.i(textLayoutResultProvider, "textLayoutResultProvider");
        Orientation orientation = scrollerPosition.getOrientation();
        int m922getOffsetToFollow5zctL8 = scrollerPosition.m922getOffsetToFollow5zctL8(textFieldValue.m4906getSelectiond9O1mEE());
        scrollerPosition.m924setPreviousSelection5zctL8(textFieldValue.m4906getSelectiond9O1mEE());
        TransformedText filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.getAnnotatedString());
        int i8 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(scrollerPosition, m922getOffsetToFollow5zctL8, filterWithValidation, textLayoutResultProvider);
            } else {
                throw new p();
            }
        } else {
            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(scrollerPosition, m922getOffsetToFollow5zctL8, filterWithValidation, textLayoutResultProvider);
        }
        return ClipKt.clipToBounds(modifier).then(verticalScrollLayoutModifier);
    }

    public static final Modifier textFieldScrollable(Modifier modifier, TextFieldScrollerPosition scrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z8) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(scrollerPosition, "scrollerPosition");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1(scrollerPosition, mutableInteractionSource, z8);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new TextFieldScrollKt$textFieldScrollable$2(scrollerPosition, z8, mutableInteractionSource));
    }

    public static /* synthetic */ Modifier textFieldScrollable$default(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            mutableInteractionSource = null;
        }
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        return textFieldScrollable(modifier, textFieldScrollerPosition, mutableInteractionSource, z8);
    }
}
