package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public interface FocusOwner extends FocusManager {
    void clearFocus(boolean z8, boolean z9);

    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo, reason: not valid java name */
    boolean mo2645dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent);

    /* renamed from: dispatchKeyEvent-ZmokQxo, reason: not valid java name */
    boolean mo2646dispatchKeyEventZmokQxo(KeyEvent keyEvent);

    boolean dispatchRotaryEvent(RotaryScrollEvent rotaryScrollEvent);

    Rect getFocusRect();

    FocusTransactionManager getFocusTransactionManager();

    LayoutDirection getLayoutDirection();

    Modifier getModifier();

    void releaseFocus();

    void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode);

    void scheduleInvalidation(FocusPropertiesModifierNode focusPropertiesModifierNode);

    void scheduleInvalidation(FocusTargetNode focusTargetNode);

    void setLayoutDirection(LayoutDirection layoutDirection);

    void takeFocus();
}
