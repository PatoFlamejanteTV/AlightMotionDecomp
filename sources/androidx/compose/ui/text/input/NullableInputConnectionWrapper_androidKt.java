package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NullableInputConnectionWrapper_androidKt {
    public static final NullableInputConnectionWrapper NullableInputConnectionWrapper(InputConnection inputConnection, Function0 function0) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 25) {
            return new NullableInputConnectionWrapperApi25(inputConnection, function0);
        }
        if (i8 >= 24) {
            return new NullableInputConnectionWrapperApi24(inputConnection, function0);
        }
        return new NullableInputConnectionWrapperApi21(inputConnection, function0);
    }
}
