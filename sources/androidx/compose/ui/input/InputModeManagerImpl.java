package androidx.compose.ui.input;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class InputModeManagerImpl implements InputModeManager {
    public static final int $stable = 0;
    private final MutableState inputMode$delegate;
    private final Function1 onRequestInputModeChange;

    public /* synthetic */ InputModeManagerImpl(int i8, Function1 function1, AbstractC3284p abstractC3284p) {
        this(i8, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.input.InputModeManager
    /* renamed from: getInputMode-aOaMEAU */
    public int mo3560getInputModeaOaMEAU() {
        return ((InputMode) this.inputMode$delegate.getValue()).m3557unboximpl();
    }

    @Override // androidx.compose.ui.input.InputModeManager
    @ExperimentalComposeUiApi
    /* renamed from: requestInputMode-iuPiT84 */
    public boolean mo3561requestInputModeiuPiT84(int i8) {
        return ((Boolean) this.onRequestInputModeChange.invoke(InputMode.m3551boximpl(i8))).booleanValue();
    }

    /* renamed from: setInputMode-iuPiT84, reason: not valid java name */
    public void m3562setInputModeiuPiT84(int i8) {
        this.inputMode$delegate.setValue(InputMode.m3551boximpl(i8));
    }

    private InputModeManagerImpl(int i8, Function1 function1) {
        MutableState mutableStateOf$default;
        this.onRequestInputModeChange = function1;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputMode.m3551boximpl(i8), null, 2, null);
        this.inputMode$delegate = mutableStateOf$default;
    }
}
