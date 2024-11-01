package androidx.compose.runtime;

import Q5.C1413h;
import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ComposerKt {
    public static final int compositionLocalMapKey = 202;
    private static CompositionTracer compositionTracer = null;
    private static final int defaultsKey = -127;
    private static final int invalidGroupLocation = -2;
    public static final int invocationKey = 200;
    private static final int nodeKey = 125;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static final int rootKey = 100;
    private static final Object invocation = new OpaqueKey("provider");
    private static final Object provider = new OpaqueKey("provider");
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");
    private static final Object providerValues = new OpaqueKey("providerValues");
    private static final Object providerMaps = new OpaqueKey("providers");
    private static final Object reference = new OpaqueKey("reference");
    private static final Comparator<Invalidation> InvalidationLocationAscending = new Comparator() { // from class: androidx.compose.runtime.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int InvalidationLocationAscending$lambda$15;
            InvalidationLocationAscending$lambda$15 = ComposerKt.InvalidationLocationAscending$lambda$15((Invalidation) obj, (Invalidation) obj2);
            return InvalidationLocationAscending$lambda$15;
        }
    };

    public static final int InvalidationLocationAscending$lambda$15(Invalidation invalidation, Invalidation invalidation2) {
        return AbstractC3292y.k(invalidation.getLocation(), invalidation2.getLocation());
    }

    public static final boolean asBool(int i8) {
        return i8 != 0;
    }

    public static final int asInt(boolean z8) {
        return z8 ? 1 : 0;
    }

    @ComposeCompilerApi
    public static final <T> T cache(Composer composer, boolean z8, Function0 function0) {
        T t8 = (T) composer.rememberedValue();
        if (z8 || t8 == Composer.Companion.getEmpty()) {
            T t9 = (T) function0.invoke();
            composer.updateRememberedValue(t9);
            return t9;
        }
        return t8;
    }

    public static final List<Object> collectNodesFrom(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader openReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$11$collectFromGroup(openReader, arrayList, slotTable.anchorIndex(anchor));
            I i8 = I.f8786a;
            return arrayList;
        } finally {
            openReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$11$collectFromGroup(SlotReader slotReader, List<Object> list, int i8) {
        if (slotReader.isNode(i8)) {
            list.add(slotReader.node(i8));
            return;
        }
        int i9 = i8 + 1;
        int groupSize = i8 + slotReader.groupSize(i8);
        while (i9 < groupSize) {
            collectNodesFrom$lambda$11$collectFromGroup(slotReader, list, i9);
            i9 += slotReader.groupSize(i9);
        }
    }

    public static final Void composeRuntimeError(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void deactivateCurrentGroup(SlotWriter slotWriter, RememberManager rememberManager) {
        int currentGroup = slotWriter.getCurrentGroup();
        int currentGroupEnd = slotWriter.getCurrentGroupEnd();
        while (currentGroup < currentGroupEnd) {
            Object node = slotWriter.node(currentGroup);
            if (node instanceof ComposeNodeLifecycleCallback) {
                rememberManager.deactivating((ComposeNodeLifecycleCallback) node);
            }
            int slotIndex = slotWriter.slotIndex(slotWriter.groups, slotWriter.groupIndexToAddress(currentGroup));
            int i8 = currentGroup + 1;
            int dataIndex = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(i8));
            for (int i9 = slotIndex; i9 < dataIndex; i9++) {
                int i10 = i9 - slotIndex;
                Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(i9)];
                if (obj instanceof RememberObserverHolder) {
                    RememberObserver wrapped = ((RememberObserverHolder) obj).getWrapped();
                    if (!(wrapped instanceof ReusableRememberObserver)) {
                        removeData(slotWriter, currentGroup, i10, obj);
                        rememberManager.forgetting(wrapped);
                    }
                } else if (obj instanceof RecomposeScopeImpl) {
                    removeData(slotWriter, currentGroup, i10, obj);
                    ((RecomposeScopeImpl) obj).release();
                }
            }
            currentGroup = i8;
        }
    }

    private static final int distanceFrom(SlotReader slotReader, int i8, int i9) {
        int i10 = 0;
        while (i8 > 0 && i8 != i9) {
            i8 = slotReader.parent(i8);
            i10++;
        }
        return i10;
    }

    public static final List<Invalidation> filterToRange(List<Invalidation> list, int i8, int i9) {
        ArrayList arrayList = new ArrayList();
        for (int findInsertLocation = findInsertLocation(list, i8); findInsertLocation < list.size(); findInsertLocation++) {
            Invalidation invalidation = list.get(findInsertLocation);
            if (invalidation.getLocation() >= i9) {
                break;
            }
            arrayList.add(invalidation);
        }
        return arrayList;
    }

    private static final int findInsertLocation(List<Invalidation> list, int i8) {
        int findLocation = findLocation(list, i8);
        if (findLocation < 0) {
            return -(findLocation + 1);
        }
        return findLocation;
    }

    private static final int findLocation(List<Invalidation> list, int i8) {
        int size = list.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            int k8 = AbstractC3292y.k(list.get(i10).getLocation(), i8);
            if (k8 < 0) {
                i9 = i10 + 1;
            } else if (k8 > 0) {
                size = i10 - 1;
            } else {
                return i10;
            }
        }
        return -(i9 + 1);
    }

    public static final Invalidation firstInRange(List<Invalidation> list, int i8, int i9) {
        int findInsertLocation = findInsertLocation(list, i8);
        if (findInsertLocation < list.size()) {
            Invalidation invalidation = list.get(findInsertLocation);
            if (invalidation.getLocation() < i9) {
                return invalidation;
            }
            return null;
        }
        return null;
    }

    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    public static final Object getInvocation() {
        return invocation;
    }

    public static /* synthetic */ void getInvocation$annotations() {
    }

    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    public static final Object getJoinedKey(KeyInfo keyInfo) {
        if (keyInfo.getObjectKey() != null) {
            return new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey());
        }
        return Integer.valueOf(keyInfo.getKey());
    }

    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey;
        if (obj instanceof JoinedKey) {
            joinedKey = (JoinedKey) obj;
        } else {
            joinedKey = null;
        }
        if (joinedKey == null) {
            return null;
        }
        if ((!AbstractC3292y.d(joinedKey.getLeft(), obj2) || !AbstractC3292y.d(joinedKey.getRight(), obj3)) && (obj = getKey(joinedKey.getLeft(), obj2, obj3)) == null) {
            obj = getKey(joinedKey.getRight(), obj2, obj3);
        }
        return obj;
    }

    public static final Object getProvider() {
        return provider;
    }

    public static /* synthetic */ void getProvider$annotations() {
    }

    public static /* synthetic */ void getProviderKey$annotations() {
    }

    public static final Object getProviderMaps() {
        return providerMaps;
    }

    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    public static final Object getProviderValues() {
        return providerValues;
    }

    public static /* synthetic */ void getProviderValues$annotations() {
    }

    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    public static final Object getReference() {
        return reference;
    }

    public static /* synthetic */ void getReference$annotations() {
    }

    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    public static /* synthetic */ void getReuseKey$annotations() {
    }

    public static final void insertIfMissing(List<Invalidation> list, int i8, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int findLocation = findLocation(list, i8);
        IdentityArraySet identityArraySet = null;
        if (findLocation < 0) {
            int i9 = -(findLocation + 1);
            if (obj != null) {
                identityArraySet = new IdentityArraySet();
                identityArraySet.add(obj);
            }
            list.add(i9, new Invalidation(recomposeScopeImpl, i8, identityArraySet));
            return;
        }
        if (obj == null) {
            list.get(findLocation).setInstances(null);
            return;
        }
        IdentityArraySet<Object> instances = list.get(findLocation).getInstances();
        if (instances != null) {
            instances.add(obj);
        }
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null && compositionTracer2.isTraceInProgress()) {
            return true;
        }
        return false;
    }

    public static final <K, V> HashMap<K, LinkedHashSet<V>> multiMap() {
        return new HashMap<>();
    }

    public static final int nearestCommonRootOf(SlotReader slotReader, int i8, int i9, int i10) {
        if (i8 == i9) {
            return i8;
        }
        if (i8 != i10 && i9 != i10) {
            if (slotReader.parent(i8) == i9) {
                return i9;
            }
            if (slotReader.parent(i9) == i8) {
                return i8;
            }
            if (slotReader.parent(i8) == slotReader.parent(i9)) {
                return slotReader.parent(i8);
            }
            int distanceFrom = distanceFrom(slotReader, i8, i10);
            int distanceFrom2 = distanceFrom(slotReader, i9, i10);
            int i11 = distanceFrom - distanceFrom2;
            for (int i12 = 0; i12 < i11; i12++) {
                i8 = slotReader.parent(i8);
            }
            int i13 = distanceFrom2 - distanceFrom;
            for (int i14 = 0; i14 < i13; i14++) {
                i9 = slotReader.parent(i9);
            }
            while (i8 != i9) {
                i8 = slotReader.parent(i8);
                i9 = slotReader.parent(i9);
            }
            return i8;
        }
        return i10;
    }

    public static final <K, V> V pop(HashMap<K, LinkedHashSet<V>> hashMap, K k8) {
        V v8;
        LinkedHashSet<V> linkedHashSet = hashMap.get(k8);
        if (linkedHashSet != null && (v8 = (V) AbstractC1435t.n0(linkedHashSet)) != null) {
            remove(hashMap, k8, v8);
            return v8;
        }
        return null;
    }

    public static final <K, V> boolean put(HashMap<K, LinkedHashSet<V>> hashMap, K k8, V v8) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k8);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            hashMap.put(k8, linkedHashSet);
        }
        return linkedHashSet.add(v8);
    }

    private static final <K, V> I remove(HashMap<K, LinkedHashSet<V>> hashMap, K k8, V v8) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k8);
        if (linkedHashSet != null) {
            linkedHashSet.remove(v8);
            if (linkedHashSet.isEmpty()) {
                hashMap.remove(k8);
            }
            return I.f8786a;
        }
        return null;
    }

    public static final void removeCurrentGroup(SlotWriter slotWriter, RememberManager rememberManager) {
        Iterator<Object> groupSlots = slotWriter.groupSlots();
        while (groupSlots.hasNext()) {
            Object next = groupSlots.next();
            if (next instanceof ComposeNodeLifecycleCallback) {
                rememberManager.releasing((ComposeNodeLifecycleCallback) next);
            }
            if (next instanceof RememberObserverHolder) {
                rememberManager.forgetting(((RememberObserverHolder) next).getWrapped());
            }
            if (next instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) next).release();
            }
        }
        slotWriter.removeGroup();
    }

    private static final void removeData(SlotWriter slotWriter, int i8, int i9, Object obj) {
        boolean z8;
        if (obj == slotWriter.set(i8, i9, Composer.Companion.getEmpty())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            return;
        }
        composeRuntimeError("Slot table is out of sync".toString());
        throw new C1413h();
    }

    public static final Invalidation removeLocation(List<Invalidation> list, int i8) {
        int findLocation = findLocation(list, i8);
        if (findLocation >= 0) {
            return list.remove(findLocation);
        }
        return null;
    }

    public static final void removeRange(List<Invalidation> list, int i8, int i9) {
        int findInsertLocation = findInsertLocation(list, i8);
        while (findInsertLocation < list.size() && list.get(findInsertLocation).getLocation() < i9) {
            list.remove(findInsertLocation);
        }
    }

    public static final void runtimeCheck(boolean z8, Function0 function0) {
        if (z8) {
            return;
        }
        composeRuntimeError(function0.invoke().toString());
        throw new C1413h();
    }

    @ComposeCompilerApi
    public static final void sourceInformation(Composer composer, String str) {
        composer.sourceInformation(str);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(Composer composer) {
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(Composer composer, int i8, String str) {
        composer.sourceInformationMarkerStart(i8, str);
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i8, int i9, int i10, String str) {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i8, i9, i10, str);
        }
    }

    public static final void runtimeCheck(boolean z8) {
        if (z8) {
            return;
        }
        composeRuntimeError("Check failed".toString());
        throw new C1413h();
    }
}
