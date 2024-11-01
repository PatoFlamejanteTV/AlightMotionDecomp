package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = ViewConfiguration.getTapTimeout();

    public static final long getTapIndicationDelay() {
        return TapIndicationDelay;
    }

    /* renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m305isClickZmokQxo(KeyEvent isClick) {
        AbstractC3292y.i(isClick, "$this$isClick");
        if (KeyEventType.m3869equalsimpl0(KeyEvent_androidKt.m3877getTypeZmokQxo(isClick), KeyEventType.Companion.m3874getKeyUpCS__XNY()) && m306isEnterZmokQxo(isClick)) {
            return true;
        }
        return false;
    }

    public static final boolean isComposeRootInScrollableContainer(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        AbstractC3292y.i(compositionLocalConsumerModifierNode, "<this>");
        return isInScrollableViewGroup((View) CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, AndroidCompositionLocals_androidKt.getLocalView()));
    }

    /* renamed from: isEnter-ZmokQxo, reason: not valid java name */
    private static final boolean m306isEnterZmokQxo(KeyEvent keyEvent) {
        int m3883getNativeKeyCodeYVgTNJs = Key_androidKt.m3883getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m3876getKeyZmokQxo(keyEvent));
        if (m3883getNativeKeyCodeYVgTNJs != 23 && m3883getNativeKeyCodeYVgTNJs != 66 && m3883getNativeKeyCodeYVgTNJs != 160) {
            return false;
        }
        return true;
    }

    private static final boolean isInScrollableViewGroup(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* renamed from: isPress-ZmokQxo, reason: not valid java name */
    public static final boolean m307isPressZmokQxo(KeyEvent isPress) {
        AbstractC3292y.i(isPress, "$this$isPress");
        if (KeyEventType.m3869equalsimpl0(KeyEvent_androidKt.m3877getTypeZmokQxo(isPress), KeyEventType.Companion.m3873getKeyDownCS__XNY()) && m306isEnterZmokQxo(isPress)) {
            return true;
        }
        return false;
    }
}
