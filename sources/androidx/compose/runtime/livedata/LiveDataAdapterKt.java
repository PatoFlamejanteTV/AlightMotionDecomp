package androidx.compose.runtime.livedata;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;

/* loaded from: classes.dex */
public final class LiveDataAdapterKt {
    @Composable
    public static final <T> State<T> observeAsState(LiveData<T> liveData, Composer composer, int i8) {
        composer.startReplaceableGroup(-2027206144);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2027206144, i8, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:40)");
        }
        State<T> observeAsState = observeAsState(liveData, liveData.getValue(), composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return observeAsState;
    }

    @Composable
    public static final <R, T extends R> State<R> observeAsState(LiveData<T> liveData, R r8, Composer composer, int i8) {
        composer.startReplaceableGroup(411178300);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(411178300, i8, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:57)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            if (liveData.isInitialized()) {
                r8 = liveData.getValue();
            }
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r8, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        EffectsKt.DisposableEffect(liveData, lifecycleOwner, new LiveDataAdapterKt$observeAsState$1(liveData, lifecycleOwner, mutableState), composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
