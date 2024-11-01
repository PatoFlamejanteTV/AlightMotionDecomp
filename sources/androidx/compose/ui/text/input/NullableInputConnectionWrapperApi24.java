package androidx.compose.ui.text.input;

import android.os.Handler;
import android.view.inputmethod.InputConnection;
import androidx.annotation.RequiresApi;
import kotlin.jvm.functions.Function0;

@RequiresApi(24)
/* loaded from: classes.dex */
class NullableInputConnectionWrapperApi24 extends NullableInputConnectionWrapperApi21 {
    public NullableInputConnectionWrapperApi24(InputConnection inputConnection, Function0 function0) {
        super(inputConnection, function0);
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapperApi21
    protected final void closeDelegate(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i8, int i9) {
        boolean deleteSurroundingTextInCodePoints;
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            deleteSurroundingTextInCodePoints = delegate.deleteSurroundingTextInCodePoints(i8, i9);
            return deleteSurroundingTextInCodePoints;
        }
        return false;
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        Handler handler;
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            handler = delegate.getHandler();
            return handler;
        }
        return null;
    }
}
