package androidx.compose.ui.platform;

import androidx.compose.ui.text.AnnotatedString;

/* loaded from: classes.dex */
public abstract /* synthetic */ class H {
    public static boolean a(ClipboardManager clipboardManager) {
        AnnotatedString text = clipboardManager.getText();
        if (text == null || text.length() <= 0) {
            return false;
        }
        return true;
    }
}
