package androidx.compose.material3;

import Q5.s;
import U5.d;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.U;
import n6.InterfaceC3470o;
import w6.AbstractC4160c;
import w6.InterfaceC4158a;

@Stable
/* loaded from: classes.dex */
public final class SnackbarHostState {
    private final MutableState currentSnackbarData$delegate;
    private final InterfaceC4158a mutex = AbstractC4160c.b(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class SnackbarDataImpl implements SnackbarData {
        private final InterfaceC3470o continuation;
        private final SnackbarVisuals visuals;

        public SnackbarDataImpl(SnackbarVisuals visuals, InterfaceC3470o continuation) {
            AbstractC3292y.i(visuals, "visuals");
            AbstractC3292y.i(continuation, "continuation");
            this.visuals = visuals;
            this.continuation = continuation;
        }

        @Override // androidx.compose.material3.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                InterfaceC3470o interfaceC3470o = this.continuation;
                s.a aVar = s.f8810b;
                interfaceC3470o.resumeWith(s.b(SnackbarResult.Dismissed));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !AbstractC3292y.d(U.b(SnackbarDataImpl.class), U.b(obj.getClass()))) {
                return false;
            }
            SnackbarDataImpl snackbarDataImpl = (SnackbarDataImpl) obj;
            if (AbstractC3292y.d(getVisuals(), snackbarDataImpl.getVisuals()) && AbstractC3292y.d(this.continuation, snackbarDataImpl.continuation)) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.material3.SnackbarData
        public SnackbarVisuals getVisuals() {
            return this.visuals;
        }

        public int hashCode() {
            return (getVisuals().hashCode() * 31) + this.continuation.hashCode();
        }

        @Override // androidx.compose.material3.SnackbarData
        public void performAction() {
            if (this.continuation.isActive()) {
                InterfaceC3470o interfaceC3470o = this.continuation;
                s.a aVar = s.f8810b;
                interfaceC3470o.resumeWith(s.b(SnackbarResult.ActionPerformed));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class SnackbarVisualsImpl implements SnackbarVisuals {
        private final String actionLabel;
        private final SnackbarDuration duration;
        private final String message;
        private final boolean withDismissAction;

        public SnackbarVisualsImpl(String message, String str, boolean z8, SnackbarDuration duration) {
            AbstractC3292y.i(message, "message");
            AbstractC3292y.i(duration, "duration");
            this.message = message;
            this.actionLabel = str;
            this.withDismissAction = z8;
            this.duration = duration;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !AbstractC3292y.d(U.b(SnackbarVisualsImpl.class), U.b(obj.getClass()))) {
                return false;
            }
            SnackbarVisualsImpl snackbarVisualsImpl = (SnackbarVisualsImpl) obj;
            if (AbstractC3292y.d(getMessage(), snackbarVisualsImpl.getMessage()) && AbstractC3292y.d(getActionLabel(), snackbarVisualsImpl.getActionLabel()) && getWithDismissAction() == snackbarVisualsImpl.getWithDismissAction() && getDuration() == snackbarVisualsImpl.getDuration()) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        public int hashCode() {
            int i8;
            int hashCode = getMessage().hashCode() * 31;
            String actionLabel = getActionLabel();
            if (actionLabel != null) {
                i8 = actionLabel.hashCode();
            } else {
                i8 = 0;
            }
            return ((((hashCode + i8) * 31) + androidx.compose.foundation.a.a(getWithDismissAction())) * 31) + getDuration().hashCode();
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

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, boolean z8, SnackbarDuration snackbarDuration, d dVar, int i8, Object obj) {
        boolean z9;
        SnackbarDuration snackbarDuration2;
        if ((i8 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i8 & 4) != 0) {
            z9 = false;
        } else {
            z9 = z8;
        }
        if ((i8 & 8) != 0) {
            if (str3 == null) {
                snackbarDuration2 = SnackbarDuration.Short;
            } else {
                snackbarDuration2 = SnackbarDuration.Indefinite;
            }
            snackbarDuration = snackbarDuration2;
        }
        return snackbarHostState.showSnackbar(str, str3, z9, snackbarDuration, dVar);
    }

    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData$delegate.getValue();
    }

    public final Object showSnackbar(String str, String str2, boolean z8, SnackbarDuration snackbarDuration, d dVar) {
        return showSnackbar(new SnackbarVisualsImpl(str, str2, z8, snackbarDuration), dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #1 {all -> 0x009c, blocks: (B:26:0x0070, B:28:0x0098), top: B:25:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object showSnackbar(androidx.compose.material3.SnackbarVisuals r9, U5.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.SnackbarHostState$showSnackbar$2
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = (androidx.compose.material3.SnackbarHostState$showSnackbar$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = new androidx.compose.material3.SnackbarHostState$showSnackbar$2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L49
            if (r2 != r3) goto L41
            java.lang.Object r9 = r0.L$3
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r9 = (androidx.compose.material3.SnackbarHostState$showSnackbar$2) r9
            java.lang.Object r9 = r0.L$2
            w6.a r9 = (w6.InterfaceC4158a) r9
            java.lang.Object r1 = r0.L$1
            androidx.compose.material3.SnackbarVisuals r1 = (androidx.compose.material3.SnackbarVisuals) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.SnackbarHostState r0 = (androidx.compose.material3.SnackbarHostState) r0
            Q5.t.b(r10)     // Catch: java.lang.Throwable -> L3e
            goto La9
        L3e:
            r10 = move-exception
            goto Lb2
        L41:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L49:
            java.lang.Object r9 = r0.L$2
            w6.a r9 = (w6.InterfaceC4158a) r9
            java.lang.Object r2 = r0.L$1
            androidx.compose.material3.SnackbarVisuals r2 = (androidx.compose.material3.SnackbarVisuals) r2
            java.lang.Object r6 = r0.L$0
            androidx.compose.material3.SnackbarHostState r6 = (androidx.compose.material3.SnackbarHostState) r6
            Q5.t.b(r10)
            r10 = r9
            r9 = r2
            goto L70
        L5b:
            Q5.t.b(r10)
            w6.a r10 = r8.mutex
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r2 = r10.a(r5, r0)
            if (r2 != r1) goto L6f
            return r1
        L6f:
            r6 = r8
        L70:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9c
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L9c
            r0.L$2 = r10     // Catch: java.lang.Throwable -> L9c
            r0.L$3 = r0     // Catch: java.lang.Throwable -> L9c
            r0.label = r3     // Catch: java.lang.Throwable -> L9c
            n6.p r2 = new n6.p     // Catch: java.lang.Throwable -> L9c
            U5.d r3 = V5.b.c(r0)     // Catch: java.lang.Throwable -> L9c
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L9c
            r2.B()     // Catch: java.lang.Throwable -> L9c
            androidx.compose.material3.SnackbarHostState$SnackbarDataImpl r3 = new androidx.compose.material3.SnackbarHostState$SnackbarDataImpl     // Catch: java.lang.Throwable -> L9c
            r3.<init>(r9, r2)     // Catch: java.lang.Throwable -> L9c
            access$setCurrentSnackbarData(r6, r3)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r9 = r2.y()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r2 = V5.b.e()     // Catch: java.lang.Throwable -> L9c
            if (r9 != r2) goto La2
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L9c
            goto La2
        L9c:
            r9 = move-exception
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
            goto Lb2
        La2:
            if (r9 != r1) goto La5
            return r1
        La5:
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        La9:
            r0.setCurrentSnackbarData(r5)     // Catch: java.lang.Throwable -> Lb0
            r9.d(r5)
            return r10
        Lb0:
            r10 = move-exception
            goto Lb6
        Lb2:
            r0.setCurrentSnackbarData(r5)     // Catch: java.lang.Throwable -> Lb0
            throw r10     // Catch: java.lang.Throwable -> Lb0
        Lb6:
            r9.d(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostState.showSnackbar(androidx.compose.material3.SnackbarVisuals, U5.d):java.lang.Object");
    }
}
