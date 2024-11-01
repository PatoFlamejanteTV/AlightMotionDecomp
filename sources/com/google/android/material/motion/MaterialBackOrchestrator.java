package com.google.android.material.motion;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.BackEventCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import j$.util.Objects;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class MaterialBackOrchestrator {

    @Nullable
    private final BackCallbackDelegate backCallbackDelegate;

    @NonNull
    private final MaterialBackHandler backHandler;

    @NonNull
    private final View view;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(33)
    /* loaded from: classes3.dex */
    public static class Api33BackCallbackDelegate implements BackCallbackDelegate {

        @Nullable
        private OnBackInvokedCallback onBackInvokedCallback;

        private Api33BackCallbackDelegate() {
        }

        OnBackInvokedCallback createOnBackInvokedCallback(@NonNull final MaterialBackHandler materialBackHandler) {
            Objects.requireNonNull(materialBackHandler);
            return new OnBackInvokedCallback() { // from class: com.google.android.material.motion.b
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    MaterialBackHandler.this.handleBackInvoked();
                }
            };
        }

        boolean isListeningForBackCallbacks() {
            if (this.onBackInvokedCallback != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:            r3 = r3.findOnBackInvokedDispatcher();     */
        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        @androidx.annotation.DoNotInline
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void startListeningForBackCallbacks(@androidx.annotation.NonNull com.google.android.material.motion.MaterialBackHandler r2, @androidx.annotation.NonNull android.view.View r3, boolean r4) {
            /*
                r1 = this;
                android.window.OnBackInvokedCallback r0 = r1.onBackInvokedCallback
                if (r0 == 0) goto L5
                return
            L5:
                android.window.OnBackInvokedDispatcher r3 = com.google.android.material.motion.a.a(r3)
                if (r3 != 0) goto Lc
                return
            Lc:
                android.window.OnBackInvokedCallback r2 = r1.createOnBackInvokedCallback(r2)
                r1.onBackInvokedCallback = r2
                if (r4 == 0) goto L18
                r4 = 1000000(0xf4240, float:1.401298E-39)
                goto L19
            L18:
                r4 = 0
            L19:
                androidx.appcompat.app.p.a(r3, r4, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate.startListeningForBackCallbacks(com.google.android.material.motion.MaterialBackHandler, android.view.View, boolean):void");
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        @DoNotInline
        public void stopListeningForBackCallbacks(@NonNull View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (findOnBackInvokedDispatcher != null) {
                findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
                this.onBackInvokedCallback = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(34)
    /* loaded from: classes3.dex */
    public static class Api34BackCallbackDelegate extends Api33BackCallbackDelegate {
        private Api34BackCallbackDelegate() {
            super();
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate
        OnBackInvokedCallback createOnBackInvokedCallback(@NonNull final MaterialBackHandler materialBackHandler) {
            return new OnBackAnimationCallback() { // from class: com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.1
                @Override // android.window.OnBackAnimationCallback
                public void onBackCancelled() {
                    if (!Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        return;
                    }
                    materialBackHandler.cancelBackProgress();
                }

                @Override // android.window.OnBackInvokedCallback
                public void onBackInvoked() {
                    materialBackHandler.handleBackInvoked();
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackProgressed(@NonNull BackEvent backEvent) {
                    if (!Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        return;
                    }
                    materialBackHandler.updateBackProgress(new BackEventCompat(backEvent));
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackStarted(@NonNull BackEvent backEvent) {
                    if (!Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        return;
                    }
                    materialBackHandler.startBackProgress(new BackEventCompat(backEvent));
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface BackCallbackDelegate {
        void startListeningForBackCallbacks(@NonNull MaterialBackHandler materialBackHandler, @NonNull View view, boolean z8);

        void stopListeningForBackCallbacks(@NonNull View view);
    }

    public <T extends View & MaterialBackHandler> MaterialBackOrchestrator(@NonNull T t8) {
        this(t8, t8);
    }

    @Nullable
    private static BackCallbackDelegate createBackCallbackDelegate() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 34) {
            return new Api34BackCallbackDelegate();
        }
        if (i8 < 33) {
            return null;
        }
        return new Api33BackCallbackDelegate();
    }

    public boolean shouldListenForBackCallbacks() {
        if (this.backCallbackDelegate != null) {
            return true;
        }
        return false;
    }

    public void startListeningForBackCallbacks() {
        startListeningForBackCallbacks(false);
    }

    public void startListeningForBackCallbacksWithPriorityOverlay() {
        startListeningForBackCallbacks(true);
    }

    public void stopListeningForBackCallbacks() {
        BackCallbackDelegate backCallbackDelegate = this.backCallbackDelegate;
        if (backCallbackDelegate != null) {
            backCallbackDelegate.stopListeningForBackCallbacks(this.view);
        }
    }

    public MaterialBackOrchestrator(@NonNull MaterialBackHandler materialBackHandler, @NonNull View view) {
        this.backCallbackDelegate = createBackCallbackDelegate();
        this.backHandler = materialBackHandler;
        this.view = view;
    }

    private void startListeningForBackCallbacks(boolean z8) {
        BackCallbackDelegate backCallbackDelegate = this.backCallbackDelegate;
        if (backCallbackDelegate != null) {
            backCallbackDelegate.startListeningForBackCallbacks(this.backHandler, this.view, z8);
        }
    }
}
