package androidx.compose.ui.node;

import android.view.KeyEvent;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;

/* loaded from: classes.dex */
public interface RootForTest {
    Density getDensity();

    SemanticsOwner getSemanticsOwner();

    TextInputService getTextInputService();

    @ExperimentalComposeUiApi
    void measureAndLayoutForTest();

    /* renamed from: sendKeyEvent-ZmokQxo, reason: not valid java name */
    boolean mo4377sendKeyEventZmokQxo(KeyEvent keyEvent);
}
