package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import c6.InterfaceC2072n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {
    public static final Companion Companion = new Companion(null);
    private final Set<Object> previouslyComposedKeys;
    private final MutableState wrappedHolder$delegate;
    private final SaveableStateRegistry wrappedRegistry;

    /* renamed from: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ SaveableStateRegistry $parentRegistry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SaveableStateRegistry saveableStateRegistry) {
            super(1);
            this.$parentRegistry = saveableStateRegistry;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            AbstractC3292y.i(it, "it");
            SaveableStateRegistry saveableStateRegistry = this.$parentRegistry;
            return Boolean.valueOf(saveableStateRegistry != null ? saveableStateRegistry.canBeSaved(it) : true);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Saver<LazySaveableStateHolder, Map<String, List<Object>>> saver(SaveableStateRegistry saveableStateRegistry) {
            return SaverKt.Saver(LazySaveableStateHolder$Companion$saver$1.INSTANCE, new LazySaveableStateHolder$Companion$saver$2(saveableStateRegistry));
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public LazySaveableStateHolder(SaveableStateRegistry wrappedRegistry) {
        MutableState mutableStateOf$default;
        AbstractC3292y.i(wrappedRegistry, "wrappedRegistry");
        this.wrappedRegistry = wrappedRegistry;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.wrappedHolder$delegate = mutableStateOf$default;
        this.previouslyComposedKeys = new LinkedHashSet();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    @Composable
    public void SaveableStateProvider(Object key, InterfaceC2072n content, Composer composer, int i8) {
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-697180401);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-697180401, i8, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
        }
        SaveableStateHolder wrappedHolder = getWrappedHolder();
        if (wrappedHolder != null) {
            wrappedHolder.SaveableStateProvider(key, content, startRestartGroup, (i8 & 112) | 520);
            EffectsKt.DisposableEffect(key, new LazySaveableStateHolder$SaveableStateProvider$1(this, key), startRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new LazySaveableStateHolder$SaveableStateProvider$2(this, key, content, i8));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object value) {
        AbstractC3292y.i(value, "value");
        return this.wrappedRegistry.canBeSaved(value);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String key) {
        AbstractC3292y.i(key, "key");
        return this.wrappedRegistry.consumeRestored(key);
    }

    public final SaveableStateHolder getWrappedHolder() {
        return (SaveableStateHolder) this.wrappedHolder$delegate.getValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        SaveableStateHolder wrappedHolder = getWrappedHolder();
        if (wrappedHolder != null) {
            Iterator<T> it = this.previouslyComposedKeys.iterator();
            while (it.hasNext()) {
                wrappedHolder.removeState(it.next());
            }
        }
        return this.wrappedRegistry.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(String key, Function0 valueProvider) {
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(valueProvider, "valueProvider");
        return this.wrappedRegistry.registerProvider(key, valueProvider);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object key) {
        AbstractC3292y.i(key, "key");
        SaveableStateHolder wrappedHolder = getWrappedHolder();
        if (wrappedHolder != null) {
            wrappedHolder.removeState(key);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void setWrappedHolder(SaveableStateHolder saveableStateHolder) {
        this.wrappedHolder$delegate.setValue(saveableStateHolder);
    }

    public LazySaveableStateHolder(SaveableStateRegistry saveableStateRegistry, Map<String, ? extends List<? extends Object>> map) {
        this(SaveableStateRegistryKt.SaveableStateRegistry(map, new AnonymousClass1(saveableStateRegistry)));
    }
}
