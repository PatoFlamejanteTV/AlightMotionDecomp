package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import l6.AbstractC3335a;

/* loaded from: classes.dex */
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 36;

    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(Saver<T, ? extends Object> saver) {
        AbstractC3292y.g(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new RememberSaveableKt$mutableStateSaver$1$1(saver), new RememberSaveableKt$mutableStateSaver$1$2(saver));
    }

    @Composable
    /* renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> T m2560rememberSaveable(Object[] objArr, Saver<T, ? extends Object> saver, String str, Function0 function0, Composer composer, int i8, int i9) {
        Object consumeRestored;
        composer.startReplaceableGroup(441892779);
        if ((i9 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        T t8 = null;
        if ((i9 & 4) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441892779, i8, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        if (str == null || str.length() == 0) {
            str = Integer.toString(currentCompositeKeyHash, AbstractC3335a.a(MaxSupportedRadix));
            AbstractC3292y.h(str, "toString(this, checkRadix(radix))");
        }
        AbstractC3292y.g(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            if (saveableStateRegistry != null && (consumeRestored = saveableStateRegistry.consumeRestored(str)) != null) {
                t8 = saver.restore(consumeRestored);
            }
            rememberedValue = new SaveableHolder(saver, saveableStateRegistry, str, t8 == null ? function0.invoke() : t8, objArr);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SaveableHolder saveableHolder = (SaveableHolder) rememberedValue;
        T t9 = (T) saveableHolder.getValueIfInputsDidntChange(objArr);
        if (t9 == null) {
            t9 = (T) function0.invoke();
        }
        EffectsKt.SideEffect(new RememberSaveableKt$rememberSaveable$1(saveableHolder, saver, saveableStateRegistry, str, t9, objArr), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return t9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCanBeSaved(SaveableStateRegistry saveableStateRegistry, Object obj) {
        String str;
        if (obj != null && !saveableStateRegistry.canBeSaved(obj)) {
            if (obj instanceof SnapshotMutableState) {
                SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
                if (snapshotMutableState.getPolicy() != SnapshotStateKt.neverEqualPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.structuralEqualityPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.referentialEqualityPolicy()) {
                    str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                } else {
                    str = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                }
            } else {
                str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
            }
            throw new IllegalArgumentException(str);
        }
    }

    @Composable
    public static final <T> MutableState<T> rememberSaveable(Object[] objArr, Saver<T, ? extends Object> saver, String str, Function0 function0, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(-202053668);
        if ((i9 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-202053668, i8, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:127)");
        }
        MutableState<T> mutableState = (MutableState) m2560rememberSaveable(Arrays.copyOf(objArr, objArr.length), mutableStateSaver(saver), str2, function0, composer, (i8 & 896) | 8 | (i8 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
