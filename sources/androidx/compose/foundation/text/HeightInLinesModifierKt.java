package androidx.compose.foundation.text;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    public static final Modifier heightInLines(Modifier modifier, TextStyle textStyle, int i8, int i9) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(textStyle, "textStyle");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1(i8, i9, textStyle);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new HeightInLinesModifierKt$heightInLines$2(i8, i9, textStyle));
    }

    public static /* synthetic */ Modifier heightInLines$default(Modifier modifier, TextStyle textStyle, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 1;
        }
        if ((i10 & 4) != 0) {
            i9 = Integer.MAX_VALUE;
        }
        return heightInLines(modifier, textStyle, i8, i9);
    }

    public static final void validateMinMaxLines(int i8, int i9) {
        if (i8 > 0 && i9 > 0) {
            if (i8 <= i9) {
                return;
            }
            throw new IllegalArgumentException(("minLines " + i8 + " must be less than or equal to maxLines " + i9).toString());
        }
        throw new IllegalArgumentException(("both minLines " + i8 + " and maxLines " + i9 + " must be greater than zero").toString());
    }
}
