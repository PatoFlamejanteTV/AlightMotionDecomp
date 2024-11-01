package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class WindowInfoImpl implements WindowInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final MutableState<PointerKeyboardModifiers> GlobalKeyboardModifiers;
    private final MutableState<Boolean> _isWindowFocused;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final MutableState<PointerKeyboardModifiers> getGlobalKeyboardModifiers$ui_release() {
            return WindowInfoImpl.GlobalKeyboardModifiers;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        MutableState<PointerKeyboardModifiers> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PointerKeyboardModifiers.m4044boximpl(PointerEvent_androidKt.EmptyPointerKeyboardModifiers()), null, 2, null);
        GlobalKeyboardModifiers = mutableStateOf$default;
    }

    public WindowInfoImpl() {
        MutableState<Boolean> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this._isWindowFocused = mutableStateOf$default;
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A$annotations, reason: not valid java name */
    public static /* synthetic */ void m4481getKeyboardModifiersk7X9c1A$annotations() {
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    @ExperimentalComposeUiApi
    /* renamed from: getKeyboardModifiers-k7X9c1A */
    public int mo4480getKeyboardModifiersk7X9c1A() {
        return GlobalKeyboardModifiers.getValue().m4050unboximpl();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return this._isWindowFocused.getValue().booleanValue();
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m4482setKeyboardModifiers5xRPYO0(int i8) {
        GlobalKeyboardModifiers.setValue(PointerKeyboardModifiers.m4044boximpl(i8));
    }

    public void setWindowFocused(boolean z8) {
        this._isWindowFocused.setValue(Boolean.valueOf(z8));
    }
}
