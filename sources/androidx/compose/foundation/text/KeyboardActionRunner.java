package androidx.compose.foundation.text;

import Q5.I;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextInputSession;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class KeyboardActionRunner implements KeyboardActionScope {
    public FocusManager focusManager;
    private TextInputSession inputSession;
    public KeyboardActions keyboardActions;

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public void mo857defaultKeyboardActionKlQnJC8(int i8) {
        boolean m4832equalsimpl0;
        boolean m4832equalsimpl02;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m4832equalsimpl0(i8, companion.m4847getNexteUduSuo())) {
            getFocusManager().mo2644moveFocus3ESFkO8(FocusDirection.Companion.m2639getNextdhqQ8s());
            return;
        }
        if (ImeAction.m4832equalsimpl0(i8, companion.m4849getPreviouseUduSuo())) {
            getFocusManager().mo2644moveFocus3ESFkO8(FocusDirection.Companion.m2640getPreviousdhqQ8s());
            return;
        }
        if (ImeAction.m4832equalsimpl0(i8, companion.m4845getDoneeUduSuo())) {
            TextInputSession textInputSession = this.inputSession;
            if (textInputSession != null) {
                textInputSession.hideSoftwareKeyboard();
                return;
            }
            return;
        }
        boolean z8 = true;
        if (ImeAction.m4832equalsimpl0(i8, companion.m4846getGoeUduSuo())) {
            m4832equalsimpl0 = true;
        } else {
            m4832equalsimpl0 = ImeAction.m4832equalsimpl0(i8, companion.m4850getSearcheUduSuo());
        }
        if (m4832equalsimpl0) {
            m4832equalsimpl02 = true;
        } else {
            m4832equalsimpl02 = ImeAction.m4832equalsimpl0(i8, companion.m4851getSendeUduSuo());
        }
        if (!m4832equalsimpl02) {
            z8 = ImeAction.m4832equalsimpl0(i8, companion.m4844getDefaulteUduSuo());
        }
        if (!z8) {
            ImeAction.m4832equalsimpl0(i8, companion.m4848getNoneeUduSuo());
        }
    }

    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        AbstractC3292y.y("focusManager");
        return null;
    }

    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        AbstractC3292y.y("keyboardActions");
        return null;
    }

    /* renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m858runActionKlQnJC8(int i8) {
        boolean m4832equalsimpl0;
        Function1 function1;
        ImeAction.Companion companion = ImeAction.Companion;
        I i9 = null;
        if (ImeAction.m4832equalsimpl0(i8, companion.m4845getDoneeUduSuo())) {
            function1 = getKeyboardActions().getOnDone();
        } else if (ImeAction.m4832equalsimpl0(i8, companion.m4846getGoeUduSuo())) {
            function1 = getKeyboardActions().getOnGo();
        } else if (ImeAction.m4832equalsimpl0(i8, companion.m4847getNexteUduSuo())) {
            function1 = getKeyboardActions().getOnNext();
        } else if (ImeAction.m4832equalsimpl0(i8, companion.m4849getPreviouseUduSuo())) {
            function1 = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m4832equalsimpl0(i8, companion.m4850getSearcheUduSuo())) {
            function1 = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m4832equalsimpl0(i8, companion.m4851getSendeUduSuo())) {
            function1 = getKeyboardActions().getOnSend();
        } else {
            if (ImeAction.m4832equalsimpl0(i8, companion.m4844getDefaulteUduSuo())) {
                m4832equalsimpl0 = true;
            } else {
                m4832equalsimpl0 = ImeAction.m4832equalsimpl0(i8, companion.m4848getNoneeUduSuo());
            }
            if (m4832equalsimpl0) {
                function1 = null;
            } else {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
        }
        if (function1 != null) {
            function1.invoke(this);
            i9 = I.f8786a;
        }
        if (i9 == null) {
            mo857defaultKeyboardActionKlQnJC8(i8);
        }
    }

    public final void setFocusManager(FocusManager focusManager) {
        AbstractC3292y.i(focusManager, "<set-?>");
        this.focusManager = focusManager;
    }

    public final void setInputSession(TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setKeyboardActions(KeyboardActions keyboardActions) {
        AbstractC3292y.i(keyboardActions, "<set-?>");
        this.keyboardActions = keyboardActions;
    }
}
