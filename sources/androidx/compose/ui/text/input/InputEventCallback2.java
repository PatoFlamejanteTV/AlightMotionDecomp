package androidx.compose.ui.text.input;

import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes.dex */
public interface InputEventCallback2 {
    void onConnectionClosed(RecordingInputConnection recordingInputConnection);

    void onEditCommands(List<? extends EditCommand> list);

    /* renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    void mo4860onImeActionKlQnJC8(int i8);

    void onKeyEvent(KeyEvent keyEvent);

    void onRequestCursorAnchorInfo(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13);
}
