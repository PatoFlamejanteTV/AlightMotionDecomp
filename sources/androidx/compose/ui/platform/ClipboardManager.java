package androidx.compose.ui.platform;

import androidx.compose.ui.text.AnnotatedString;

/* loaded from: classes.dex */
public interface ClipboardManager {
    AnnotatedString getText();

    boolean hasText();

    void setText(AnnotatedString annotatedString);
}
