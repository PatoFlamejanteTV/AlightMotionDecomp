package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;
import kotlin.jvm.functions.Function0;

@RequiresApi(25)
/* loaded from: classes.dex */
class NullableInputConnectionWrapperApi25 extends NullableInputConnectionWrapperApi24 {
    public NullableInputConnectionWrapperApi25(InputConnection inputConnection, Function0 function0) {
        super(inputConnection, function0);
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i8, Bundle bundle) {
        boolean commitContent;
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            commitContent = delegate.commitContent(inputContentInfo, i8, bundle);
            return commitContent;
        }
        return false;
    }
}
