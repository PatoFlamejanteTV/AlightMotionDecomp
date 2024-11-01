package androidx.compose.material;

import Q5.s;
import U5.d;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3292y;
import n6.InterfaceC3470o;
import w6.AbstractC4160c;
import w6.InterfaceC4158a;

@Stable
/* loaded from: classes.dex */
public final class SnackbarHostState {
    public static final int $stable = 0;
    private final MutableState currentSnackbarData$delegate;
    private final InterfaceC4158a mutex = AbstractC4160c.b(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    @Stable
    /* loaded from: classes.dex */
    public static final class SnackbarDataImpl implements SnackbarData {
        private final String actionLabel;
        private final InterfaceC3470o continuation;
        private final SnackbarDuration duration;
        private final String message;

        public SnackbarDataImpl(String message, String str, SnackbarDuration duration, InterfaceC3470o continuation) {
            AbstractC3292y.i(message, "message");
            AbstractC3292y.i(duration, "duration");
            AbstractC3292y.i(continuation, "continuation");
            this.message = message;
            this.actionLabel = str;
            this.duration = duration;
            this.continuation = continuation;
        }

        @Override // androidx.compose.material.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                InterfaceC3470o interfaceC3470o = this.continuation;
                s.a aVar = s.f8810b;
                interfaceC3470o.resumeWith(s.b(SnackbarResult.Dismissed));
            }
        }

        @Override // androidx.compose.material.SnackbarData
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material.SnackbarData
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material.SnackbarData
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material.SnackbarData
        public void performAction() {
            if (this.continuation.isActive()) {
                InterfaceC3470o interfaceC3470o = this.continuation;
                s.a aVar = s.f8810b;
                interfaceC3470o.resumeWith(s.b(SnackbarResult.ActionPerformed));
            }
        }
    }

    public SnackbarHostState() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentSnackbarData$delegate = mutableStateOf$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(SnackbarData snackbarData) {
        this.currentSnackbarData$delegate.setValue(snackbarData);
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, SnackbarDuration snackbarDuration, d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = null;
        }
        if ((i8 & 4) != 0) {
            snackbarDuration = SnackbarDuration.Short;
        }
        return snackbarHostState.showSnackbar(str, str2, snackbarDuration, dVar);
    }

    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6 A[Catch: all -> 0x00ba, TRY_LEAVE, TryCatch #1 {all -> 0x00ba, blocks: (B:26:0x008a, B:28:0x00b6), top: B:25:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object showSnackbar(java.lang.String r9, java.lang.String r10, androidx.compose.material.SnackbarDuration r11, U5.d r12) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostState.showSnackbar(java.lang.String, java.lang.String, androidx.compose.material.SnackbarDuration, U5.d):java.lang.Object");
    }
}
