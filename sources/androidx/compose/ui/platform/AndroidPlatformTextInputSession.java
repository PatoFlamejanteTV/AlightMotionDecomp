package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.text.input.TextInputService;
import java.util.concurrent.atomic.AtomicReference;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope, n6.M {
    public static final int $stable = 8;
    private final n6.M coroutineScope;
    private final AtomicReference methodSessionMutex = SessionMutex.m2588constructorimpl();
    private final TextInputService textInputService;
    private final View view;

    public AndroidPlatformTextInputSession(View view, TextInputService textInputService, n6.M m8) {
        this.view = view;
        this.textInputService = textInputService;
        this.coroutineScope = m8;
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m2592getCurrentSessionimpl(this.methodSessionMutex);
        if (inputMethodSession != null) {
            return inputMethodSession.createInputConnection(editorInfo);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSessionScope, n6.M
    public U5.g getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public View getView() {
        return this.view;
    }

    public final boolean isReadyForConnection() {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m2592getCurrentSessionimpl(this.methodSessionMutex);
        if (inputMethodSession == null || !inputMethodSession.isActive()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object startInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest r6, U5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            Q5.t.b(r7)
            goto L4a
        L31:
            Q5.t.b(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.methodSessionMutex
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2 r2 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
            r2.<init>(r6)
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 r6 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3
            r4 = 0
            r6.<init>(r5, r4)
            r0.label = r3
            java.lang.Object r6 = androidx.compose.ui.SessionMutex.m2595withSessionCancellingPreviousimpl(r7, r2, r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            Q5.h r6 = new Q5.h
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidPlatformTextInputSession.startInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest, U5.d):java.lang.Object");
    }
}
