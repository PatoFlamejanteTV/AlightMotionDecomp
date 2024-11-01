package androidx.activity.compose;

import U5.h;
import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import c6.InterfaceC2072n;
import n6.M;

/* loaded from: classes.dex */
public final class PredictiveBackHandlerKt {
    @Composable
    public static final void PredictiveBackHandler(final boolean z8, InterfaceC2072n interfaceC2072n, Composer composer, int i8, int i9) {
        Composer startRestartGroup = composer.startRestartGroup(-642000585);
        if ((i9 & 1) != 0) {
            z8 = true;
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC2072n, startRestartGroup, 8);
        startRestartGroup.startReplaceableGroup(-723524056);
        startRestartGroup.startReplaceableGroup(-3687241);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(h.f10149a, startRestartGroup));
            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        startRestartGroup.endReplaceableGroup();
        final M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-3687241);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new OnBackPressedCallback(z8) { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1
                private OnBackInstance onBackInstance;

                public final OnBackInstance getOnBackInstance() {
                    return this.onBackInstance;
                }

                @Override // androidx.activity.OnBackPressedCallback
                public void handleOnBackCancelled() {
                    super.handleOnBackCancelled();
                    OnBackInstance onBackInstance = this.onBackInstance;
                    if (onBackInstance != null) {
                        onBackInstance.cancel();
                    }
                }

                @Override // androidx.activity.OnBackPressedCallback
                public void handleOnBackPressed() {
                    InterfaceC2072n PredictiveBackHandler$lambda$0;
                    OnBackInstance onBackInstance = this.onBackInstance;
                    if (onBackInstance != null && !onBackInstance.isPredictiveBack()) {
                        onBackInstance.cancel();
                        this.onBackInstance = null;
                    }
                    if (this.onBackInstance == null) {
                        M m8 = coroutineScope;
                        PredictiveBackHandler$lambda$0 = PredictiveBackHandlerKt.PredictiveBackHandler$lambda$0(rememberUpdatedState);
                        this.onBackInstance = new OnBackInstance(m8, false, PredictiveBackHandler$lambda$0);
                    }
                    OnBackInstance onBackInstance2 = this.onBackInstance;
                    if (onBackInstance2 != null) {
                        onBackInstance2.close();
                    }
                }

                @Override // androidx.activity.OnBackPressedCallback
                public void handleOnBackProgressed(BackEventCompat backEventCompat) {
                    super.handleOnBackProgressed(backEventCompat);
                    OnBackInstance onBackInstance = this.onBackInstance;
                    if (onBackInstance != null) {
                        p6.h.b(onBackInstance.m77sendJP2dKIU(backEventCompat));
                    }
                }

                @Override // androidx.activity.OnBackPressedCallback
                public void handleOnBackStarted(BackEventCompat backEventCompat) {
                    InterfaceC2072n PredictiveBackHandler$lambda$0;
                    super.handleOnBackStarted(backEventCompat);
                    OnBackInstance onBackInstance = this.onBackInstance;
                    if (onBackInstance != null) {
                        onBackInstance.cancel();
                    }
                    M m8 = coroutineScope;
                    PredictiveBackHandler$lambda$0 = PredictiveBackHandlerKt.PredictiveBackHandler$lambda$0(rememberUpdatedState);
                    this.onBackInstance = new OnBackInstance(m8, true, PredictiveBackHandler$lambda$0);
                }

                public final void setOnBackInstance(OnBackInstance onBackInstance) {
                    this.onBackInstance = onBackInstance;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 = (PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1) rememberedValue2;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z8), new PredictiveBackHandlerKt$PredictiveBackHandler$1(predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1, z8, null), startRestartGroup, (i8 & 14) | 64);
        OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null) {
            OnBackPressedDispatcher onBackPressedDispatcher = current.getOnBackPressedDispatcher();
            LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            EffectsKt.DisposableEffect(lifecycleOwner, onBackPressedDispatcher, new PredictiveBackHandlerKt$PredictiveBackHandler$2(onBackPressedDispatcher, lifecycleOwner, predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1), startRestartGroup, 72);
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new PredictiveBackHandlerKt$PredictiveBackHandler$3(z8, interfaceC2072n, i8, i9));
                return;
            }
            return;
        }
        throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2072n PredictiveBackHandler$lambda$0(State<? extends InterfaceC2072n> state) {
        return state.getValue();
    }
}
