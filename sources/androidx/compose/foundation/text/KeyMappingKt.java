package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.K;

/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping commonKeyMapping = commonKeyMapping(new K() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // j6.k
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m3880isCtrlPressedZmokQxo(((KeyEvent) obj).m3865unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo856mapZmokQxo(android.view.KeyEvent event) {
                AbstractC3292y.i(event, "event");
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m3882isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m3880isCtrlPressedZmokQxo(event)) {
                    long m3876getKeyZmokQxo = KeyEvent_androidKt.m3876getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, mappedKeys.m880getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, mappedKeys.m881getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, mappedKeys.m882getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, mappedKeys.m879getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m3880isCtrlPressedZmokQxo(event)) {
                    long m3876getKeyZmokQxo2 = KeyEvent_androidKt.m3876getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m880getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m881getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m882getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m879getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m884getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m878getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m874getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m873getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m3882isShiftPressedZmokQxo(event)) {
                    long m3876getKeyZmokQxo3 = KeyEvent_androidKt.m3876getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m887getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_LEFT;
                    } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m886getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                    }
                } else if (KeyEvent_androidKt.m3879isAltPressedZmokQxo(event)) {
                    long m3876getKeyZmokQxo4 = KeyEvent_androidKt.m3876getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo4, mappedKeys4.m874getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m3568equalsimpl0(m3876getKeyZmokQxo4, mappedKeys4.m878getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                if (keyCommand == null) {
                    return KeyMapping.this.mo856mapZmokQxo(event);
                }
                return keyCommand;
            }
        };
    }

    public static final KeyMapping commonKeyMapping(final Function1 shortcutModifier) {
        AbstractC3292y.i(shortcutModifier, "shortcutModifier");
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo856mapZmokQxo(android.view.KeyEvent event) {
                boolean m3568equalsimpl0;
                AbstractC3292y.i(event, "event");
                if (((Boolean) Function1.this.invoke(KeyEvent.m3859boximpl(event))).booleanValue() && KeyEvent_androidKt.m3882isShiftPressedZmokQxo(event)) {
                    if (!Key.m3568equalsimpl0(KeyEvent_androidKt.m3876getKeyZmokQxo(event), MappedKeys.INSTANCE.m895getZEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.REDO;
                }
                if (((Boolean) Function1.this.invoke(KeyEvent.m3859boximpl(event))).booleanValue()) {
                    long m3876getKeyZmokQxo = KeyEvent_androidKt.m3876getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, mappedKeys.m875getCEK5gGoQ())) {
                        m3568equalsimpl0 = true;
                    } else {
                        m3568equalsimpl0 = Key.m3568equalsimpl0(m3876getKeyZmokQxo, mappedKeys.m885getInsertEK5gGoQ());
                    }
                    if (m3568equalsimpl0) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, mappedKeys.m892getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, mappedKeys.m893getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, mappedKeys.m872getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, mappedKeys.m894getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (!Key.m3568equalsimpl0(m3876getKeyZmokQxo, mappedKeys.m895getZEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.UNDO;
                }
                if (KeyEvent_androidKt.m3880isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m3882isShiftPressedZmokQxo(event)) {
                    long m3876getKeyZmokQxo2 = KeyEvent_androidKt.m3876getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m880getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m881getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m882getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m879getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m889getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m888getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m887getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m886getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (!Key.m3568equalsimpl0(m3876getKeyZmokQxo2, mappedKeys2.m885getInsertEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.PASTE;
                }
                long m3876getKeyZmokQxo3 = KeyEvent_androidKt.m3876getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m880getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m881getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m882getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m879getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m889getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m888getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m887getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m886getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m883getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m874getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m878getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m890getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m877getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m876getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (!Key.m3568equalsimpl0(m3876getKeyZmokQxo3, mappedKeys3.m891getTabEK5gGoQ())) {
                    return null;
                }
                return KeyCommand.TAB;
            }
        };
    }

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
