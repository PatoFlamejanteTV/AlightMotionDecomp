package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class KeyMapping_androidKt {
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo856mapZmokQxo(KeyEvent event) {
            AbstractC3292y.i(event, "event");
            KeyCommand keyCommand = null;
            if (KeyEvent_androidKt.m3882isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m3879isAltPressedZmokQxo(event)) {
                long m3876getKeyZmokQxo = KeyEvent_androidKt.m3876getKeyZmokQxo(event);
                MappedKeys mappedKeys = MappedKeys.INSTANCE;
                if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, mappedKeys.m880getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, mappedKeys.m881getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, mappedKeys.m882getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, mappedKeys.m879getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyEvent_androidKt.m3879isAltPressedZmokQxo(event)) {
                long m3876getKeyZmokQxo2 = KeyEvent_androidKt.m3876getKeyZmokQxo(event);
                MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m880getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m881getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m882getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m879getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                }
            }
            if (keyCommand == null) {
                return KeyMappingKt.getDefaultKeyMapping().mo856mapZmokQxo(event);
            }
            return keyCommand;
        }
    };

    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
