package androidx.compose.foundation.text.selection;

import android.view.KeyEvent;
import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SelectionManager_androidKt {
    /* renamed from: isCopyKeyEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m1043isCopyKeyEventZmokQxo(KeyEvent keyEvent) {
        AbstractC3292y.i(keyEvent, "keyEvent");
        if (KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo856mapZmokQxo(keyEvent) == KeyCommand.COPY) {
            return true;
        }
        return false;
    }

    public static final Modifier selectionMagnifier(Modifier modifier, SelectionManager manager) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(manager, "manager");
        if (!MagnifierStyle.Companion.getTextDefault().isSupported()) {
            return modifier;
        }
        return ComposedModifierKt.composed$default(modifier, null, new SelectionManager_androidKt$selectionMagnifier$1(manager), 1, null);
    }
}
