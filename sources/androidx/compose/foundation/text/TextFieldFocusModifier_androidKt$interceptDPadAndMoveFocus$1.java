package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.core.view.InputDeviceCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1(FocusManager focusManager, TextFieldState textFieldState) {
        super(1);
        this.$focusManager = focusManager;
        this.$state = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m913invokeZmokQxo(((KeyEvent) obj).m3865unboximpl());
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m913invokeZmokQxo(android.view.KeyEvent keyEvent) {
        boolean m912isKeyCodeYhN2O0w;
        boolean m912isKeyCodeYhN2O0w2;
        boolean m912isKeyCodeYhN2O0w3;
        boolean m912isKeyCodeYhN2O0w4;
        boolean m912isKeyCodeYhN2O0w5;
        AbstractC3292y.i(keyEvent, "keyEvent");
        InputDevice device = keyEvent.getDevice();
        boolean z8 = false;
        if (device != null && device.supportsSource(InputDeviceCompat.SOURCE_DPAD) && !device.isVirtual() && KeyEventType.m3869equalsimpl0(KeyEvent_androidKt.m3877getTypeZmokQxo(keyEvent), KeyEventType.Companion.m3873getKeyDownCS__XNY())) {
            m912isKeyCodeYhN2O0w = TextFieldFocusModifier_androidKt.m912isKeyCodeYhN2O0w(keyEvent, 19);
            if (!m912isKeyCodeYhN2O0w) {
                m912isKeyCodeYhN2O0w2 = TextFieldFocusModifier_androidKt.m912isKeyCodeYhN2O0w(keyEvent, 20);
                if (!m912isKeyCodeYhN2O0w2) {
                    m912isKeyCodeYhN2O0w3 = TextFieldFocusModifier_androidKt.m912isKeyCodeYhN2O0w(keyEvent, 21);
                    if (!m912isKeyCodeYhN2O0w3) {
                        m912isKeyCodeYhN2O0w4 = TextFieldFocusModifier_androidKt.m912isKeyCodeYhN2O0w(keyEvent, 22);
                        if (!m912isKeyCodeYhN2O0w4) {
                            m912isKeyCodeYhN2O0w5 = TextFieldFocusModifier_androidKt.m912isKeyCodeYhN2O0w(keyEvent, 23);
                            if (m912isKeyCodeYhN2O0w5) {
                                TextInputSession inputSession = this.$state.getInputSession();
                                if (inputSession != null) {
                                    inputSession.showSoftwareKeyboard();
                                }
                                z8 = true;
                            }
                        } else {
                            z8 = this.$focusManager.mo2644moveFocus3ESFkO8(FocusDirection.Companion.m2641getRightdhqQ8s());
                        }
                    } else {
                        z8 = this.$focusManager.mo2644moveFocus3ESFkO8(FocusDirection.Companion.m2638getLeftdhqQ8s());
                    }
                } else {
                    z8 = this.$focusManager.mo2644moveFocus3ESFkO8(FocusDirection.Companion.m2635getDowndhqQ8s());
                }
            } else {
                z8 = this.$focusManager.mo2644moveFocus3ESFkO8(FocusDirection.Companion.m2642getUpdhqQ8s());
            }
        }
        return Boolean.valueOf(z8);
    }
}
