package androidx.compose.ui.text.input;

/* loaded from: classes.dex */
public final class EditCommandKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSurrogatePair(char c8, char c9) {
        if (Character.isHighSurrogate(c8) && Character.isLowSurrogate(c9)) {
            return true;
        }
        return false;
    }
}
