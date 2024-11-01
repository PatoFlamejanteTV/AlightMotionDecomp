package androidx.compose.runtime.saveable;

import Q5.I;
import R5.Q;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import c6.InterfaceC2072n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SaveableStateHolderImpl implements SaveableStateHolder {
    public static final Companion Companion = new Companion(null);
    private static final Saver<SaveableStateHolderImpl, ?> Saver = SaverKt.Saver(SaveableStateHolderImpl$Companion$Saver$1.INSTANCE, SaveableStateHolderImpl$Companion$Saver$2.INSTANCE);
    private SaveableStateRegistry parentSaveableStateRegistry;
    private final Map<Object, RegistryHolder> registryHolders;
    private final Map<Object, Map<String, List<Object>>> savedStates;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Saver<SaveableStateHolderImpl, ?> getSaver() {
            return SaveableStateHolderImpl.Saver;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class RegistryHolder {
        private final Object key;
        private final SaveableStateRegistry registry;
        private boolean shouldSave = true;

        public RegistryHolder(Object obj) {
            this.key = obj;
            this.registry = SaveableStateRegistryKt.SaveableStateRegistry((Map) SaveableStateHolderImpl.this.savedStates.get(obj), new SaveableStateHolderImpl$RegistryHolder$registry$1(SaveableStateHolderImpl.this));
        }

        public final Object getKey() {
            return this.key;
        }

        public final SaveableStateRegistry getRegistry() {
            return this.registry;
        }

        public final boolean getShouldSave() {
            return this.shouldSave;
        }

        public final void saveTo(Map<Object, Map<String, List<Object>>> map) {
            if (this.shouldSave) {
                Map<String, List<Object>> performSave = this.registry.performSave();
                if (performSave.isEmpty()) {
                    map.remove(this.key);
                } else {
                    map.put(this.key, performSave);
                }
            }
        }

        public final void setShouldSave(boolean z8) {
            this.shouldSave = z8;
        }
    }

    public SaveableStateHolderImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> saveAll() {
        Map<Object, Map<String, List<Object>>> B8 = Q.B(this.savedStates);
        Iterator<T> it = this.registryHolders.values().iterator();
        while (it.hasNext()) {
            ((RegistryHolder) it.next()).saveTo(B8);
        }
        if (B8.isEmpty()) {
            return null;
        }
        return B8;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    @Composable
    public void SaveableStateProvider(Object obj, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        boolean z8;
        Composer startRestartGroup = composer.startRestartGroup(-1198538093);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1198538093, i8, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:74)");
        }
        startRestartGroup.startReplaceableGroup(444418301);
        startRestartGroup.startReusableGroup(ComposerKt.reuseKey, obj);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            SaveableStateRegistry parentSaveableStateRegistry = getParentSaveableStateRegistry();
            if (parentSaveableStateRegistry != null) {
                z8 = parentSaveableStateRegistry.canBeSaved(obj);
            } else {
                z8 = true;
            }
            if (z8) {
                rememberedValue = new RegistryHolder(obj);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        startRestartGroup.endReplaceableGroup();
        RegistryHolder registryHolder = (RegistryHolder) rememberedValue;
        CompositionLocalKt.CompositionLocalProvider(SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(registryHolder.getRegistry()), interfaceC2072n, startRestartGroup, i8 & 112);
        EffectsKt.DisposableEffect(I.f8786a, new SaveableStateHolderImpl$SaveableStateProvider$1$1(this, obj, registryHolder), startRestartGroup, 6);
        startRestartGroup.endReusableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SaveableStateHolderImpl$SaveableStateProvider$2(this, obj, interfaceC2072n, i8));
        }
    }

    public final SaveableStateRegistry getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object obj) {
        RegistryHolder registryHolder = this.registryHolders.get(obj);
        if (registryHolder != null) {
            registryHolder.setShouldSave(false);
        } else {
            this.savedStates.remove(obj);
        }
    }

    public final void setParentSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry) {
        this.parentSaveableStateRegistry = saveableStateRegistry;
    }

    public SaveableStateHolderImpl(Map<Object, Map<String, List<Object>>> map) {
        this.savedStates = map;
        this.registryHolders = new LinkedHashMap();
    }

    public /* synthetic */ SaveableStateHolderImpl(Map map, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
