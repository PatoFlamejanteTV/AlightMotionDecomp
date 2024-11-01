package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidClipboardManager implements ClipboardManager {
    public static final int $stable = 8;
    private final android.content.ClipboardManager clipboardManager;

    public AndroidClipboardManager(android.content.ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public AnnotatedString getText() {
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        CharSequence charSequence = null;
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (itemAt != null) {
            charSequence = itemAt.getText();
        }
        return AndroidClipboardManager_androidKt.convertToAnnotatedString(charSequence);
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public boolean hasText() {
        ClipDescription primaryClipDescription = this.clipboardManager.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public void setText(AnnotatedString annotatedString) {
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", AndroidClipboardManager_androidKt.convertToCharSequence(annotatedString)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AndroidClipboardManager(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            kotlin.jvm.internal.AbstractC3292y.g(r2, r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidClipboardManager.<init>(android.content.Context):void");
    }
}
