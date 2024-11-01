package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
public interface PlatformTextInputSession {
    View getView();

    Object startInputMethod(PlatformTextInputMethodRequest platformTextInputMethodRequest, U5.d dVar);
}
