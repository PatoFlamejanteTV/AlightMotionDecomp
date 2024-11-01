package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TextFieldScrollerPosition$Companion$Saver$2 extends AbstractC3293z implements Function1 {
    public static final TextFieldScrollerPosition$Companion$Saver$2 INSTANCE = new TextFieldScrollerPosition$Companion$Saver$2();

    TextFieldScrollerPosition$Companion$Saver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final TextFieldScrollerPosition invoke(List<? extends Object> restored) {
        AbstractC3292y.i(restored, "restored");
        Object obj = restored.get(1);
        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Boolean");
        Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
        Object obj2 = restored.get(0);
        AbstractC3292y.g(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new TextFieldScrollerPosition(orientation, ((Float) obj2).floatValue());
    }
}
