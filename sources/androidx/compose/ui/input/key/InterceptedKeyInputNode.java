package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
final class InterceptedKeyInputNode extends Modifier.Node implements SoftKeyboardInterceptionModifierNode {
    private Function1 onEvent;
    private Function1 onPreEvent;

    public InterceptedKeyInputNode(Function1 function1, Function1 function12) {
        this.onEvent = function1;
        this.onPreEvent = function12;
    }

    public final Function1 getOnEvent() {
        return this.onEvent;
    }

    public final Function1 getOnPreEvent() {
        return this.onPreEvent;
    }

    @Override // androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
    /* renamed from: onInterceptKeyBeforeSoftKeyboard-ZmokQxo, reason: not valid java name */
    public boolean mo3563onInterceptKeyBeforeSoftKeyboardZmokQxo(android.view.KeyEvent keyEvent) {
        Function1 function1 = this.onEvent;
        if (function1 != null) {
            return ((Boolean) function1.invoke(KeyEvent.m3859boximpl(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
    /* renamed from: onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo, reason: not valid java name */
    public boolean mo3564onPreInterceptKeyBeforeSoftKeyboardZmokQxo(android.view.KeyEvent keyEvent) {
        Function1 function1 = this.onPreEvent;
        if (function1 != null) {
            return ((Boolean) function1.invoke(KeyEvent.m3859boximpl(keyEvent))).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(Function1 function1) {
        this.onEvent = function1;
    }

    public final void setOnPreEvent(Function1 function1) {
        this.onPreEvent = function1;
    }
}
