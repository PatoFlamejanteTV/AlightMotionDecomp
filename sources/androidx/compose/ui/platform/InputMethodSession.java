package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper_androidKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
final class InputMethodSession {
    private NullableInputConnectionWrapper connection;
    private boolean disposed;
    private final Object lock = new Object();
    private final Function0 onConnectionClosed;
    private final PlatformTextInputMethodRequest request;

    public InputMethodSession(PlatformTextInputMethodRequest platformTextInputMethodRequest, Function0 function0) {
        this.request = platformTextInputMethodRequest;
        this.onConnectionClosed = function0;
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        synchronized (this.lock) {
            try {
                if (this.disposed) {
                    return null;
                }
                NullableInputConnectionWrapper nullableInputConnectionWrapper = this.connection;
                if (nullableInputConnectionWrapper != null) {
                    nullableInputConnectionWrapper.disposeDelegate();
                }
                NullableInputConnectionWrapper NullableInputConnectionWrapper = NullableInputConnectionWrapper_androidKt.NullableInputConnectionWrapper(this.request.createInputConnection(editorInfo), this.onConnectionClosed);
                this.connection = NullableInputConnectionWrapper;
                return NullableInputConnectionWrapper;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void dispose() {
        synchronized (this.lock) {
            try {
                this.disposed = true;
                NullableInputConnectionWrapper nullableInputConnectionWrapper = this.connection;
                if (nullableInputConnectionWrapper != null) {
                    nullableInputConnectionWrapper.disposeDelegate();
                }
                this.connection = null;
                Q5.I i8 = Q5.I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isActive() {
        return !this.disposed;
    }
}
