package androidx.compose.runtime;

import Q5.C1413h;
import Q5.I;
import Q5.r;
import Q5.x;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.collection.MutableIntIntMap;
import androidx.compose.runtime.GroupKind;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.changelist.FixupList;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IntMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Z;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ComposerImpl implements Composer {
    public static final int $stable = 8;
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final ComposerChangeListWriter changeListWriter;
    private ChangeList changes;
    private int childrenComposing;
    private final ControlledComposition composition;
    private int compositionToken;
    private int compoundKeyHash;
    private ChangeList deferredChanges;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;
    private boolean implicitRootStart;
    private Anchor insertAnchor;
    private FixupList insertFixups;
    private SlotTable insertTable;
    private boolean inserting;
    private boolean isComposing;
    private boolean isDisposed;
    private ChangeList lateChanges;
    private int[] nodeCountOverrides;
    private MutableIntIntMap nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    private final CompositionContext parentContext;
    private Pending pending;
    private PersistentCompositionLocalMap providerCache;
    private IntMap<PersistentCompositionLocalMap> providerUpdates;
    private boolean providersInvalid;
    private SlotReader reader;
    private boolean reusing;
    private final SlotTable slotTable;
    private boolean sourceInformationEnabled;
    private boolean startedGroup;
    private final IntStack startedGroups;
    private SlotWriter writer;
    private boolean writerHasAProvider;
    private final Stack<Pending> pendingStack = new Stack<>();
    private IntStack nodeIndexStack = new IntStack();
    private IntStack groupNodeCountStack = new IntStack();
    private final List<Invalidation> invalidations = new ArrayList();
    private final IntStack entersStack = new IntStack();
    private PersistentCompositionLocalMap parentProvider = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
    private final IntStack providersInvalidStack = new IntStack();
    private int reusingGroup = -1;
    private final ComposerImpl$derivedStateObserver$1 derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
        @Override // androidx.compose.runtime.DerivedStateObserver
        public void done(DerivedState<?> derivedState) {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.DerivedStateObserver
        public void start(DerivedState<?> derivedState) {
            ComposerImpl.this.childrenComposing++;
        }
    };
    private final Stack<RecomposeScopeImpl> invalidateStack = new Stack<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class CompositionContextHolder implements ReusableRememberObserver {
        private final CompositionContextImpl ref;

        public CompositionContextHolder(CompositionContextImpl compositionContextImpl) {
            this.ref = compositionContextImpl;
        }

        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final boolean collectingSourceInformation;
        private final Set<ComposerImpl> composers = new LinkedHashSet();
        private final MutableState compositionLocalScope$delegate = SnapshotStateKt.mutableStateOf(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), SnapshotStateKt.referentialEqualityPolicy());
        private final int compoundHashKey;
        private Set<Set<CompositionData>> inspectionTables;
        private final CompositionObserverHolder observerHolder;

        public CompositionContextImpl(int i8, boolean z8, boolean z9, CompositionObserverHolder compositionObserverHolder) {
            this.compoundHashKey = i8;
            this.collectingParameterInformation = z8;
            this.collectingSourceInformation = z9;
            this.observerHolder = compositionObserverHolder;
        }

        private final PersistentCompositionLocalMap getCompositionLocalScope() {
            return (PersistentCompositionLocalMap) this.compositionLocalScope$delegate.getValue();
        }

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }

        private final void setCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.compositionLocalScope$delegate.setValue(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @ComposableInferredTarget(scheme = "[0[0]]")
        public void composeInitial$runtime_release(ControlledComposition controlledComposition, InterfaceC2072n interfaceC2072n) {
            ComposerImpl.this.parentContext.composeInitial$runtime_release(controlledComposition, interfaceC2072n);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
        }

        public final void dispose() {
            if (!this.composers.isEmpty()) {
                Set<Set<CompositionData>> set = this.inspectionTables;
                if (set != null) {
                    for (ComposerImpl composerImpl : this.composers) {
                        Iterator<Set<CompositionData>> it = set.iterator();
                        while (it.hasNext()) {
                            it.next().remove(composerImpl.slotTable);
                        }
                    }
                }
                this.composers.clear();
            }
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingParameterInformation$runtime_release() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingSourceInformation$runtime_release() {
            return this.collectingSourceInformation;
        }

        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public int getCompoundHashKey$runtime_release() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public U5.g getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CompositionObserverHolder getObserverHolder$runtime_release() {
            return this.observerHolder;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public U5.g getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.parentContext.insertMovableContent$runtime_release(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.invalidate$runtime_release(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime_release(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(RecomposeScopeImpl recomposeScopeImpl) {
            ComposerImpl.this.parentContext.invalidateScope$runtime_release(recomposeScopeImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime_release(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState) {
            ComposerImpl.this.parentContext.movableContentStateReleased$runtime_release(movableContentStateReference, movableContentState);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference movableContentStateReference) {
            return ComposerImpl.this.parentContext.movableContentStateResolve$runtime_release(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(Set<CompositionData> set) {
            Set set2 = this.inspectionTables;
            if (set2 == null) {
                set2 = new HashSet();
                this.inspectionTables = set2;
            }
            set2.add(set);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(Composer composer) {
            AbstractC3292y.g(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.registerComposition$runtime_release(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportRemovedComposition$runtime_release(ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.reportRemovedComposition$runtime_release(controlledComposition);
        }

        public final void setInspectionTables(Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(Composer composer) {
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    AbstractC3292y.g(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((ComposerImpl) composer).slotTable);
                }
            }
            Z.a(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.unregisterComposition$runtime_release(controlledComposition);
        }

        public final void updateCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            setCompositionLocalScope(persistentCompositionLocalMap);
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(Applier<?> applier, CompositionContext compositionContext, SlotTable slotTable, Set<RememberObserver> set, ChangeList changeList, ChangeList changeList2, ControlledComposition controlledComposition) {
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = changeList;
        this.lateChanges = changeList2;
        this.composition = controlledComposition;
        SlotReader openReader = slotTable.openReader();
        openReader.close();
        this.reader = openReader;
        SlotTable slotTable2 = new SlotTable();
        this.insertTable = slotTable2;
        SlotWriter openWriter = slotTable2.openWriter();
        openWriter.close();
        this.writer = openWriter;
        this.changeListWriter = new ComposerChangeListWriter(this, this.changes);
        SlotReader openReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = openReader2.anchor(0);
            openReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new FixupList();
            this.implicitRootStart = true;
            this.startedGroups = new IntStack();
        } catch (Throwable th) {
            openReader2.close();
            throw th;
        }
    }

    private final void abortRoot() {
        cleanUpCompose();
        this.pendingStack.clear();
        this.nodeIndexStack.clear();
        this.groupNodeCountStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates = null;
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (!this.writer.getClosed()) {
            this.writer.close();
        }
        this.insertFixups.clear();
        createFreshInsertTable();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:            if (r0 != false) goto L14;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void addRecomposeScope() {
        /*
            r4 = this;
            boolean r0 = r4.getInserting()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L24
            androidx.compose.runtime.RecomposeScopeImpl r0 = new androidx.compose.runtime.RecomposeScopeImpl
            androidx.compose.runtime.ControlledComposition r2 = r4.getComposition()
            kotlin.jvm.internal.AbstractC3292y.g(r2, r1)
            androidx.compose.runtime.CompositionImpl r2 = (androidx.compose.runtime.CompositionImpl) r2
            r0.<init>(r2)
            androidx.compose.runtime.Stack<androidx.compose.runtime.RecomposeScopeImpl> r1 = r4.invalidateStack
            r1.push(r0)
            r4.updateValue(r0)
            int r1 = r4.compositionToken
            r0.start(r1)
            goto L77
        L24:
            java.util.List<androidx.compose.runtime.Invalidation> r0 = r4.invalidations
            androidx.compose.runtime.SlotReader r2 = r4.reader
            int r2 = r2.getParent()
            androidx.compose.runtime.Invalidation r0 = androidx.compose.runtime.ComposerKt.access$removeLocation(r0, r2)
            androidx.compose.runtime.SlotReader r2 = r4.reader
            java.lang.Object r2 = r2.next()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            boolean r3 = kotlin.jvm.internal.AbstractC3292y.d(r2, r3)
            if (r3 == 0) goto L54
            androidx.compose.runtime.RecomposeScopeImpl r2 = new androidx.compose.runtime.RecomposeScopeImpl
            androidx.compose.runtime.ControlledComposition r3 = r4.getComposition()
            kotlin.jvm.internal.AbstractC3292y.g(r3, r1)
            androidx.compose.runtime.CompositionImpl r3 = (androidx.compose.runtime.CompositionImpl) r3
            r2.<init>(r3)
            r4.updateValue(r2)
            goto L5b
        L54:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.AbstractC3292y.g(r2, r1)
            androidx.compose.runtime.RecomposeScopeImpl r2 = (androidx.compose.runtime.RecomposeScopeImpl) r2
        L5b:
            if (r0 != 0) goto L69
            boolean r0 = r2.getForcedRecompose()
            r1 = 0
            if (r0 == 0) goto L67
            r2.setForcedRecompose(r1)
        L67:
            if (r0 == 0) goto L6a
        L69:
            r1 = 1
        L6a:
            r2.setRequiresRecompose(r1)
            androidx.compose.runtime.Stack<androidx.compose.runtime.RecomposeScopeImpl> r0 = r4.invalidateStack
            r0.push(r2)
            int r0 = r4.compositionToken
            r2.start(r0)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.addRecomposeScope():void");
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.changeListWriter.resetTransientState();
        this.invalidateStack.clear();
        clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final int compoundKeyOf(int i8, int i9, int i10) {
        if (i8 != i9) {
            int groupCompoundKeyPart = groupCompoundKeyPart(this.reader, i8);
            if (groupCompoundKeyPart == 126665345) {
                return groupCompoundKeyPart;
            }
            return Integer.rotateLeft(compoundKeyOf(this.reader.parent(i8), i9, i10), 3) ^ groupCompoundKeyPart;
        }
        return i10;
    }

    private final void createFreshInsertTable() {
        ComposerKt.runtimeCheck(this.writer.getClosed());
        SlotTable slotTable = new SlotTable();
        this.insertTable = slotTable;
        SlotWriter openWriter = slotTable.openWriter();
        openWriter.close();
        this.writer = openWriter;
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.providerCache;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : currentCompositionLocalScope(this.reader.getParent());
    }

    private final void doCompose(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap, InterfaceC2072n interfaceC2072n) {
        Comparator comparator;
        if (!this.isComposing) {
            Object beginSection = Trace.INSTANCE.beginSection("Compose:recompose");
            try {
                this.compositionToken = SnapshotKt.currentSnapshot().getId();
                this.providerUpdates = null;
                int size = identityArrayMap.getSize();
                for (int i8 = 0; i8 < size; i8++) {
                    Object obj = identityArrayMap.getKeys()[i8];
                    AbstractC3292y.g(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    IdentityArraySet identityArraySet = (IdentityArraySet) identityArrayMap.getValues()[i8];
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                    Anchor anchor = recomposeScopeImpl.getAnchor();
                    if (anchor != null) {
                        this.invalidations.add(new Invalidation(recomposeScopeImpl, anchor.getLocation$runtime_release(), identityArraySet));
                    } else {
                        return;
                    }
                }
                List<Invalidation> list = this.invalidations;
                comparator = ComposerKt.InvalidationLocationAscending;
                AbstractC1435t.B(list, comparator);
                this.nodeIndex = 0;
                this.isComposing = true;
                try {
                    startRoot();
                    Object nextSlot = nextSlot();
                    if (nextSlot != interfaceC2072n && interfaceC2072n != null) {
                        updateValue(interfaceC2072n);
                    }
                    ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.derivedStateObserver;
                    MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
                    try {
                        derivedStateObservers.add(composerImpl$derivedStateObserver$1);
                        if (interfaceC2072n != null) {
                            startGroup(200, ComposerKt.getInvocation());
                            ActualJvm_jvmKt.invokeComposable(this, interfaceC2072n);
                            endGroup();
                        } else if ((this.forciblyRecompose || this.providersInvalid) && nextSlot != null && !AbstractC3292y.d(nextSlot, Composer.Companion.getEmpty())) {
                            startGroup(200, ComposerKt.getInvocation());
                            ActualJvm_jvmKt.invokeComposable(this, (InterfaceC2072n) Z.d(nextSlot, 2));
                            endGroup();
                        } else {
                            skipCurrentGroup();
                        }
                        derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                        endRoot();
                        this.isComposing = false;
                        this.invalidations.clear();
                        createFreshInsertTable();
                        I i9 = I.f8786a;
                        return;
                    } catch (Throwable th) {
                        derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.isComposing = false;
                    this.invalidations.clear();
                    abortRoot();
                    createFreshInsertTable();
                    throw th2;
                }
            } finally {
                Trace.INSTANCE.endSection(beginSection);
            }
        }
        ComposerKt.composeRuntimeError("Reentrant composition is not supported".toString());
        throw new C1413h();
    }

    private final void doRecordDownsFor(int i8, int i9) {
        if (i8 > 0 && i8 != i9) {
            doRecordDownsFor(this.reader.parent(i8), i9);
            if (this.reader.isNode(i8)) {
                this.changeListWriter.moveDown(nodeAt(this.reader, i8));
            }
        }
    }

    private final void end(boolean z8) {
        Set set;
        List<KeyInfo> list;
        if (getInserting()) {
            int parent = this.writer.getParent();
            updateCompoundKeyWhenWeExitGroup(this.writer.groupKey(parent), this.writer.groupObjectKey(parent), this.writer.groupAux(parent));
        } else {
            int parent2 = this.reader.getParent();
            updateCompoundKeyWhenWeExitGroup(this.reader.groupKey(parent2), this.reader.groupObjectKey(parent2), this.reader.groupAux(parent2));
        }
        int i8 = this.groupNodeCount;
        Pending pending = this.pending;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending.getKeyInfos();
            List<KeyInfo> used = pending.getUsed();
            Set fastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i9 < size2) {
                KeyInfo keyInfo = keyInfos.get(i9);
                if (!fastToSet.contains(keyInfo)) {
                    this.changeListWriter.removeNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), 0);
                    this.changeListWriter.moveReaderRelativeTo(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    set = fastToSet;
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                } else {
                    set = fastToSet;
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i10 >= size) {
                            fastToSet = set;
                        } else {
                            KeyInfo keyInfo2 = used.get(i10);
                            if (keyInfo2 != keyInfo) {
                                int nodePositionOf = pending.nodePositionOf(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (nodePositionOf != i11) {
                                    int updatedNodeCountOf = pending.updatedNodeCountOf(keyInfo2);
                                    list = used;
                                    this.changeListWriter.moveNode(pending.getStartIndex() + nodePositionOf, i11 + pending.getStartIndex(), updatedNodeCountOf);
                                    pending.registerMoveNode(nodePositionOf, i11, updatedNodeCountOf);
                                } else {
                                    list = used;
                                }
                            } else {
                                list = used;
                                i9++;
                            }
                            i10++;
                            i11 += pending.updatedNodeCountOf(keyInfo2);
                            fastToSet = set;
                            used = list;
                        }
                    }
                }
                i9++;
                fastToSet = set;
            }
            this.changeListWriter.endNodeMovement();
            if (keyInfos.size() > 0) {
                this.changeListWriter.moveReaderRelativeTo(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        int i12 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i12, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (z8) {
                this.insertFixups.endNodeInsert();
                i8 = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int insertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close();
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(insertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(insertedGroupVirtualIndex, i8);
                }
            }
        } else {
            if (z8) {
                this.changeListWriter.moveUp();
            }
            this.changeListWriter.endCurrentGroup();
            int parent4 = this.reader.getParent();
            if (i8 != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i8);
            }
            if (z8) {
                i8 = 1;
            }
            this.reader.endGroup();
            this.changeListWriter.endNodeMovement();
        }
        exitGroup(i8, inserting);
    }

    private final void endGroup() {
        end(false);
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        this.changeListWriter.endRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter openWriter = this.insertTable.openWriter();
            this.writer = openWriter;
            openWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void enterGroup(boolean z8, Pending pending) {
        this.pendingStack.push(this.pending);
        this.pending = pending;
        this.nodeIndexStack.push(this.nodeIndex);
        if (z8) {
            this.nodeIndex = 0;
        }
        this.groupNodeCountStack.push(this.groupNodeCount);
        this.groupNodeCount = 0;
    }

    private final void exitGroup(int i8, boolean z8) {
        Pending pop = this.pendingStack.pop();
        if (pop != null && !z8) {
            pop.setGroupIndex(pop.getGroupIndex() + 1);
        }
        this.pending = pop;
        this.nodeIndex = this.nodeIndexStack.pop() + i8;
        this.groupNodeCount = this.groupNodeCountStack.pop() + i8;
    }

    private final void finalizeCompose() {
        this.changeListWriter.finalizeComposition();
        if (this.pendingStack.isEmpty()) {
            cleanUpCompose();
        } else {
            ComposerKt.composeRuntimeError("Start/end imbalance".toString());
            throw new C1413h();
        }
    }

    @InternalComposeApi
    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    private final int groupCompoundKeyPart(SlotReader slotReader, int i8) {
        Object groupAux;
        if (slotReader.hasObjectKey(i8)) {
            Object groupObjectKey = slotReader.groupObjectKey(i8);
            if (groupObjectKey != null) {
                if (groupObjectKey instanceof Enum) {
                    return ((Enum) groupObjectKey).ordinal();
                }
                if (groupObjectKey instanceof MovableContent) {
                    return MovableContentKt.movableContentKey;
                }
                return groupObjectKey.hashCode();
            }
            return 0;
        }
        int groupKey = slotReader.groupKey(i8);
        if (groupKey == 207 && (groupAux = slotReader.groupAux(i8)) != null && !AbstractC3292y.d(groupAux, Composer.Companion.getEmpty())) {
            groupKey = groupAux.hashCode();
        }
        return groupKey;
    }

    private final void insertMovableContentGuarded(List<r> list) {
        ComposerChangeListWriter composerChangeListWriter;
        ChangeList changeList;
        ComposerChangeListWriter composerChangeListWriter2;
        ChangeList changeList2;
        SlotTable slotTable$runtime_release;
        Anchor anchor$runtime_release;
        List<? extends Object> collectNodesFrom;
        SlotReader slotReader;
        int[] iArr;
        IntMap intMap;
        ChangeList changeList3;
        ComposerChangeListWriter composerChangeListWriter3;
        int i8;
        ControlledComposition composition$runtime_release;
        ControlledComposition composition$runtime_release2;
        Integer valueOf;
        int i9;
        SlotTable slotTable$runtime_release2;
        SlotReader slotReader2;
        ChangeList changeList4;
        int i10 = 1;
        ComposerChangeListWriter composerChangeListWriter4 = this.changeListWriter;
        ChangeList changeList5 = this.lateChanges;
        ChangeList changeList6 = composerChangeListWriter4.getChangeList();
        try {
            composerChangeListWriter4.setChangeList(changeList5);
            this.changeListWriter.resetSlots();
            int size = list.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                try {
                    r rVar = list.get(i12);
                    MovableContentStateReference movableContentStateReference = (MovableContentStateReference) rVar.a();
                    MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) rVar.b();
                    Anchor anchor$runtime_release2 = movableContentStateReference.getAnchor$runtime_release();
                    int anchorIndex = movableContentStateReference.getSlotTable$runtime_release().anchorIndex(anchor$runtime_release2);
                    IntRef intRef = new IntRef(i11, i10, null);
                    this.changeListWriter.determineMovableContentNodeIndex(intRef, anchor$runtime_release2);
                    if (movableContentStateReference2 == null) {
                        if (AbstractC3292y.d(movableContentStateReference.getSlotTable$runtime_release(), this.insertTable)) {
                            createFreshInsertTable();
                        }
                        SlotReader openReader = movableContentStateReference.getSlotTable$runtime_release().openReader();
                        try {
                            openReader.reposition(anchorIndex);
                            this.changeListWriter.moveReaderToAbsolute(anchorIndex);
                            changeList4 = new ChangeList();
                            slotReader2 = openReader;
                        } catch (Throwable th) {
                            th = th;
                            slotReader2 = openReader;
                        }
                        try {
                            recomposeMovableContent$default(this, null, null, null, null, new ComposerImpl$insertMovableContentGuarded$1$1$1$1(this, changeList4, openReader, movableContentStateReference), 15, null);
                            this.changeListWriter.includeOperationsIn(changeList4, intRef);
                            I i13 = I.f8786a;
                            slotReader2.close();
                            composerChangeListWriter2 = composerChangeListWriter4;
                            changeList2 = changeList6;
                            i8 = size;
                            i9 = i12;
                        } catch (Throwable th2) {
                            th = th2;
                            slotReader2.close();
                            throw th;
                        }
                    } else {
                        MovableContentState movableContentStateResolve$runtime_release = this.parentContext.movableContentStateResolve$runtime_release(movableContentStateReference2);
                        if (movableContentStateResolve$runtime_release == null || (slotTable$runtime_release = movableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null) {
                            slotTable$runtime_release = movableContentStateReference2.getSlotTable$runtime_release();
                        }
                        if (movableContentStateResolve$runtime_release == null || (slotTable$runtime_release2 = movableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null || (anchor$runtime_release = slotTable$runtime_release2.anchor(0)) == null) {
                            anchor$runtime_release = movableContentStateReference2.getAnchor$runtime_release();
                        }
                        collectNodesFrom = ComposerKt.collectNodesFrom(slotTable$runtime_release, anchor$runtime_release);
                        if (!collectNodesFrom.isEmpty()) {
                            this.changeListWriter.copyNodesToNewAnchorLocation(collectNodesFrom, intRef);
                            if (AbstractC3292y.d(movableContentStateReference.getSlotTable$runtime_release(), this.slotTable)) {
                                int anchorIndex2 = this.slotTable.anchorIndex(anchor$runtime_release2);
                                updateNodeCount(anchorIndex2, updatedNodeCount(anchorIndex2) + collectNodesFrom.size());
                            }
                        }
                        this.changeListWriter.copySlotTableToAnchorLocation(movableContentStateResolve$runtime_release, this.parentContext, movableContentStateReference2, movableContentStateReference);
                        SlotReader openReader2 = slotTable$runtime_release.openReader();
                        try {
                            SlotReader reader$runtime_release = getReader$runtime_release();
                            int[] iArr2 = this.nodeCountOverrides;
                            IntMap intMap2 = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                setReader$runtime_release(openReader2);
                                int anchorIndex3 = slotTable$runtime_release.anchorIndex(anchor$runtime_release);
                                openReader2.reposition(anchorIndex3);
                                this.changeListWriter.moveReaderToAbsolute(anchorIndex3);
                                ChangeList changeList7 = new ChangeList();
                                ComposerChangeListWriter composerChangeListWriter5 = this.changeListWriter;
                                ChangeList changeList8 = composerChangeListWriter5.getChangeList();
                                try {
                                    composerChangeListWriter5.setChangeList(changeList7);
                                    i8 = size;
                                    ComposerChangeListWriter composerChangeListWriter6 = this.changeListWriter;
                                    boolean implicitRootStart = composerChangeListWriter6.getImplicitRootStart();
                                    try {
                                        composerChangeListWriter6.setImplicitRootStart(false);
                                        composition$runtime_release = movableContentStateReference2.getComposition$runtime_release();
                                        composition$runtime_release2 = movableContentStateReference.getComposition$runtime_release();
                                        valueOf = Integer.valueOf(openReader2.getCurrentGroup());
                                        composerChangeListWriter2 = composerChangeListWriter4;
                                        intMap = intMap2;
                                        changeList2 = changeList6;
                                        changeList3 = changeList8;
                                        i9 = i12;
                                        iArr = iArr2;
                                        slotReader = openReader2;
                                        composerChangeListWriter3 = composerChangeListWriter5;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        iArr = iArr2;
                                        slotReader = openReader2;
                                        intMap = intMap2;
                                        composerChangeListWriter3 = composerChangeListWriter5;
                                        changeList3 = changeList8;
                                    }
                                    try {
                                        recomposeMovableContent(composition$runtime_release, composition$runtime_release2, valueOf, movableContentStateReference2.getInvalidations$runtime_release(), new ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1(this, movableContentStateReference));
                                        try {
                                            composerChangeListWriter6.setImplicitRootStart(implicitRootStart);
                                            try {
                                                composerChangeListWriter3.setChangeList(changeList3);
                                                this.changeListWriter.includeOperationsIn(changeList7, intRef);
                                                I i14 = I.f8786a;
                                                try {
                                                    setReader$runtime_release(reader$runtime_release);
                                                    this.nodeCountOverrides = iArr;
                                                    this.providerUpdates = intMap;
                                                    try {
                                                        slotReader.close();
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        changeList = changeList2;
                                                        composerChangeListWriter = composerChangeListWriter2;
                                                        composerChangeListWriter.setChangeList(changeList);
                                                        throw th;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    slotReader.close();
                                                    throw th;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                setReader$runtime_release(reader$runtime_release);
                                                this.nodeCountOverrides = iArr;
                                                this.providerUpdates = intMap;
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            composerChangeListWriter3.setChangeList(changeList3);
                                            throw th;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        composerChangeListWriter6.setImplicitRootStart(implicitRootStart);
                                        throw th;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    iArr = iArr2;
                                    slotReader = openReader2;
                                    intMap = intMap2;
                                    changeList3 = changeList8;
                                    composerChangeListWriter3 = composerChangeListWriter5;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                iArr = iArr2;
                                slotReader = openReader2;
                                intMap = intMap2;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            slotReader = openReader2;
                        }
                    }
                    this.changeListWriter.skipToEndOfCurrentGroup();
                    i10 = 1;
                    i12 = i9 + 1;
                    size = i8;
                    changeList6 = changeList2;
                    composerChangeListWriter4 = composerChangeListWriter2;
                    i11 = 0;
                } catch (Throwable th12) {
                    th = th12;
                    composerChangeListWriter2 = composerChangeListWriter4;
                    changeList2 = changeList6;
                }
            }
            ComposerChangeListWriter composerChangeListWriter7 = composerChangeListWriter4;
            ChangeList changeList9 = changeList6;
            this.changeListWriter.endMovableContentPlacement();
            this.changeListWriter.moveReaderToAbsolute(0);
            composerChangeListWriter7.setChangeList(changeList9);
        } catch (Throwable th13) {
            th = th13;
            composerChangeListWriter = composerChangeListWriter4;
            changeList = changeList6;
        }
    }

    private final int insertedGroupVirtualIndex(int i8) {
        return (-2) - i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:            recordProviderUpdate(r13);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invokeMovableContentLambda(androidx.compose.runtime.MovableContent<java.lang.Object> r12, androidx.compose.runtime.PersistentCompositionLocalMap r13, java.lang.Object r14, boolean r15) {
        /*
            r11 = this;
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            r11.startMovableGroup(r0, r12)
            r11.updateSlot(r14)
            int r1 = r11.getCompoundKeyHash()
            r2 = 0
            r11.compoundKeyHash = r0     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r11.getInserting()     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L21
            androidx.compose.runtime.SlotWriter r0 = r11.writer     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.SlotWriter.markGroup$default(r0, r3, r4, r2)     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r12 = move-exception
            goto L9f
        L21:
            boolean r0 = r11.getInserting()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L28
            goto L35
        L28:
            androidx.compose.runtime.SlotReader r0 = r11.reader     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = r0.getGroupAux()     // Catch: java.lang.Throwable -> L1e
            boolean r0 = kotlin.jvm.internal.AbstractC3292y.d(r0, r13)     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L35
            r3 = 1
        L35:
            if (r3 == 0) goto L3a
            r11.recordProviderUpdate(r13)     // Catch: java.lang.Throwable -> L1e
        L3a:
            java.lang.Object r0 = androidx.compose.runtime.ComposerKt.getCompositionLocalMap()     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.GroupKind$Companion r5 = androidx.compose.runtime.GroupKind.Companion     // Catch: java.lang.Throwable -> L1e
            int r5 = r5.m2455getGroupULZAiWs()     // Catch: java.lang.Throwable -> L1e
            r6 = 202(0xca, float:2.83E-43)
            r11.m2442startBaiHCIY(r6, r0, r5, r13)     // Catch: java.lang.Throwable -> L1e
            r11.providerCache = r2     // Catch: java.lang.Throwable -> L1e
            boolean r13 = r11.getInserting()     // Catch: java.lang.Throwable -> L1e
            if (r13 == 0) goto L7f
            if (r15 != 0) goto L7f
            r11.writerHasAProvider = r4     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.SlotWriter r13 = r11.writer     // Catch: java.lang.Throwable -> L1e
            int r15 = r13.getParent()     // Catch: java.lang.Throwable -> L1e
            int r15 = r13.parent(r15)     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.Anchor r8 = r13.anchor(r15)     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.MovableContentStateReference r13 = new androidx.compose.runtime.MovableContentStateReference     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.ControlledComposition r6 = r11.getComposition()     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.SlotTable r7 = r11.insertTable     // Catch: java.lang.Throwable -> L1e
            java.util.List r9 = R5.AbstractC1435t.m()     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.PersistentCompositionLocalMap r10 = r11.currentCompositionLocalScope()     // Catch: java.lang.Throwable -> L1e
            r3 = r13
            r4 = r12
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.CompositionContext r12 = r11.parentContext     // Catch: java.lang.Throwable -> L1e
            r12.insertMovableContent$runtime_release(r13)     // Catch: java.lang.Throwable -> L1e
            goto L94
        L7f:
            boolean r13 = r11.providersInvalid     // Catch: java.lang.Throwable -> L1e
            r11.providersInvalid = r3     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1 r15 = new androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1     // Catch: java.lang.Throwable -> L1e
            r15.<init>(r12, r14)     // Catch: java.lang.Throwable -> L1e
            r12 = 316014703(0x12d6006f, float:1.3505406E-27)
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r12, r4, r15)     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.ActualJvm_jvmKt.invokeComposable(r11, r12)     // Catch: java.lang.Throwable -> L1e
            r11.providersInvalid = r13     // Catch: java.lang.Throwable -> L1e
        L94:
            r11.endGroup()
            r11.providerCache = r2
            r11.compoundKeyHash = r1
            r11.endMovableGroup()
            return
        L9f:
            r11.endGroup()
            r11.providerCache = r2
            r11.compoundKeyHash = r1
            r11.endMovableGroup()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda(androidx.compose.runtime.MovableContent, androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object, boolean):void");
    }

    private final Object nodeAt(SlotReader slotReader, int i8) {
        return slotReader.node(i8);
    }

    private final int nodeIndexOf(int i8, int i9, int i10, int i11) {
        int parent = this.reader.parent(i9);
        while (parent != i10 && !this.reader.isNode(parent)) {
            parent = this.reader.parent(parent);
        }
        if (this.reader.isNode(parent)) {
            i11 = 0;
        }
        if (parent == i9) {
            return i11;
        }
        int updatedNodeCount = (updatedNodeCount(parent) - this.reader.nodeCount(i9)) + i11;
        loop1: while (i11 < updatedNodeCount && parent != i8) {
            parent++;
            while (parent < i8) {
                int groupSize = this.reader.groupSize(parent) + parent;
                if (i8 >= groupSize) {
                    i11 += updatedNodeCount(parent);
                    parent = groupSize;
                }
            }
            break loop1;
        }
        return i11;
    }

    private final <R> R recomposeMovableContent(ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List<r> list, Function0 function0) {
        R r8;
        int i8;
        boolean z8 = this.isComposing;
        int i9 = this.nodeIndex;
        try {
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                r rVar = list.get(i10);
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) rVar.a();
                IdentityArraySet identityArraySet = (IdentityArraySet) rVar.b();
                if (identityArraySet != null) {
                    Object[] values = identityArraySet.getValues();
                    int size2 = identityArraySet.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        Object obj = values[i11];
                        AbstractC3292y.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        tryImminentInvalidation$runtime_release(recomposeScopeImpl, obj);
                    }
                } else {
                    tryImminentInvalidation$runtime_release(recomposeScopeImpl, null);
                }
            }
            if (controlledComposition != null) {
                if (num != null) {
                    i8 = num.intValue();
                } else {
                    i8 = -1;
                }
                r8 = (R) controlledComposition.delegateInvalidations(controlledComposition2, i8, function0);
                if (r8 == null) {
                }
                this.isComposing = z8;
                this.nodeIndex = i9;
                return r8;
            }
            r8 = (R) function0.invoke();
            this.isComposing = z8;
            this.nodeIndex = i9;
            return r8;
        } catch (Throwable th) {
            this.isComposing = z8;
            this.nodeIndex = i9;
            throw th;
        }
    }

    static /* synthetic */ Object recomposeMovableContent$default(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, Function0 function0, int i8, Object obj) {
        ControlledComposition controlledComposition3;
        ControlledComposition controlledComposition4;
        Integer num2;
        if ((i8 & 1) != 0) {
            controlledComposition3 = null;
        } else {
            controlledComposition3 = controlledComposition;
        }
        if ((i8 & 2) != 0) {
            controlledComposition4 = null;
        } else {
            controlledComposition4 = controlledComposition2;
        }
        if ((i8 & 4) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i8 & 8) != 0) {
            list = AbstractC1435t.m();
        }
        return composerImpl.recomposeMovableContent(controlledComposition3, controlledComposition4, num2, list, function0);
    }

    private final void recomposeToGroupEnd() {
        Invalidation firstInRange;
        boolean z8 = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int groupSize = this.reader.groupSize(parent) + parent;
        int i8 = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i9 = this.groupNodeCount;
        firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        boolean z9 = false;
        int i10 = parent;
        while (firstInRange != null) {
            int location = firstInRange.getLocation();
            ComposerKt.removeLocation(this.invalidations, location);
            if (firstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i10, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i8);
                this.compoundKeyHash = compoundKeyOf(this.reader.parent(currentGroup), parent, compoundKeyHash);
                this.providerCache = null;
                firstInRange.getScope().compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                i10 = currentGroup;
                z9 = true;
            } else {
                this.invalidateStack.push(firstInRange.getScope());
                firstInRange.getScope().rereadTrackedInstances();
                this.invalidateStack.pop();
            }
            firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        }
        if (z9) {
            recordUpsAndDowns(i10, parent, parent);
            this.reader.skipToGroupEnd();
            int updatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i8 + updatedNodeCount;
            this.groupNodeCount = i9 + updatedNodeCount;
        } else {
            skipReaderToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z8;
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrentGroup());
        this.changeListWriter.removeCurrentGroup();
    }

    private final void recordInsert(Anchor anchor) {
        if (this.insertFixups.isEmpty()) {
            this.changeListWriter.insertSlots(anchor, this.insertTable);
        } else {
            this.changeListWriter.insertSlots(anchor, this.insertTable, this.insertFixups);
            this.insertFixups = new FixupList();
        }
    }

    private final void recordProviderUpdate(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        IntMap<PersistentCompositionLocalMap> intMap = this.providerUpdates;
        if (intMap == null) {
            intMap = new IntMap<>(0, 1, null);
            this.providerUpdates = intMap;
        }
        intMap.set(this.reader.getCurrentGroup(), persistentCompositionLocalMap);
    }

    private final void recordUpsAndDowns(int i8, int i9, int i10) {
        int nearestCommonRootOf;
        SlotReader slotReader = this.reader;
        nearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, i8, i9, i10);
        while (i8 > 0 && i8 != nearestCommonRootOf) {
            if (slotReader.isNode(i8)) {
                this.changeListWriter.moveUp();
            }
            i8 = slotReader.parent(i8);
        }
        doRecordDownsFor(i9, nearestCommonRootOf);
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsMark()) {
            ChangeList changeList = new ChangeList();
            this.deferredChanges = changeList;
            SlotReader openReader = this.slotTable.openReader();
            try {
                this.reader = openReader;
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                ChangeList changeList2 = composerChangeListWriter.getChangeList();
                try {
                    composerChangeListWriter.setChangeList(changeList);
                    reportFreeMovableContent(0);
                    this.changeListWriter.releaseMovableContent();
                    composerChangeListWriter.setChangeList(changeList2);
                    I i8 = I.f8786a;
                } catch (Throwable th) {
                    composerChangeListWriter.setChangeList(changeList2);
                    throw th;
                }
            } finally {
                openReader.close();
            }
        }
    }

    private final void reportFreeMovableContent(int i8) {
        reportFreeMovableContent$reportGroup(this, i8, false, 0);
        this.changeListWriter.endNodeMovement();
    }

    private static final int reportFreeMovableContent$reportGroup(ComposerImpl composerImpl, int i8, boolean z8, int i9) {
        boolean z9;
        int i10;
        CompositionContextHolder compositionContextHolder;
        List filterToRange;
        SlotReader slotReader = composerImpl.reader;
        if (slotReader.hasMark(i8)) {
            int groupKey = slotReader.groupKey(i8);
            Object groupObjectKey = slotReader.groupObjectKey(i8);
            if (groupKey == 126665345 && (groupObjectKey instanceof MovableContent)) {
                MovableContent movableContent = (MovableContent) groupObjectKey;
                Object groupGet = slotReader.groupGet(i8, 0);
                Anchor anchor = slotReader.anchor(i8);
                filterToRange = ComposerKt.filterToRange(composerImpl.invalidations, i8, slotReader.groupSize(i8) + i8);
                ArrayList arrayList = new ArrayList(filterToRange.size());
                int size = filterToRange.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Invalidation invalidation = (Invalidation) filterToRange.get(i11);
                    arrayList.add(x.a(invalidation.getScope(), invalidation.getInstances()));
                }
                MovableContentStateReference movableContentStateReference = new MovableContentStateReference(movableContent, groupGet, composerImpl.getComposition(), composerImpl.slotTable, anchor, arrayList, composerImpl.currentCompositionLocalScope(i8));
                composerImpl.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
                composerImpl.changeListWriter.recordSlotEditing();
                composerImpl.changeListWriter.releaseMovableGroupAtCurrent(composerImpl.getComposition(), composerImpl.parentContext, movableContentStateReference);
                if (z8) {
                    composerImpl.changeListWriter.endNodeMovementAndDeleteNode(i9, i8);
                    return 0;
                }
                return slotReader.nodeCount(i8);
            }
            if (groupKey == 206 && AbstractC3292y.d(groupObjectKey, ComposerKt.getReference())) {
                Object groupGet2 = slotReader.groupGet(i8, 0);
                if (groupGet2 instanceof CompositionContextHolder) {
                    compositionContextHolder = (CompositionContextHolder) groupGet2;
                } else {
                    compositionContextHolder = null;
                }
                if (compositionContextHolder != null) {
                    for (ComposerImpl composerImpl2 : compositionContextHolder.getRef().getComposers()) {
                        composerImpl2.reportAllMovableContent();
                        composerImpl.parentContext.reportRemovedComposition$runtime_release(composerImpl2.getComposition());
                    }
                }
                return slotReader.nodeCount(i8);
            }
            if (slotReader.isNode(i8)) {
                return 1;
            }
            return slotReader.nodeCount(i8);
        }
        if (slotReader.containsMark(i8)) {
            int groupSize = slotReader.groupSize(i8) + i8;
            int i12 = 0;
            for (int i13 = i8 + 1; i13 < groupSize; i13 += slotReader.groupSize(i13)) {
                boolean isNode = slotReader.isNode(i13);
                if (isNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveDown(slotReader.node(i13));
                }
                if (!isNode && !z8) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (isNode) {
                    i10 = 0;
                } else {
                    i10 = i9 + i12;
                }
                i12 += reportFreeMovableContent$reportGroup(composerImpl, i13, z9, i10);
                if (isNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveUp();
                }
            }
            if (slotReader.isNode(i8)) {
                return 1;
            }
            return i12;
        }
        if (slotReader.isNode(i8)) {
            return 1;
        }
        return slotReader.nodeCount(i8);
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    /* renamed from: start-BaiHCIY, reason: not valid java name */
    private final void m2442startBaiHCIY(int i8, Object obj, int i9, Object obj2) {
        boolean z8;
        boolean z9;
        Object obj3 = obj;
        validateNodeNotExpected();
        updateCompoundKeyWhenWeEnterGroup(i8, obj, obj2);
        GroupKind.Companion companion = GroupKind.Companion;
        int i10 = 0;
        if (i9 != companion.m2455getGroupULZAiWs()) {
            z8 = true;
        } else {
            z8 = false;
        }
        Pending pending = null;
        if (getInserting()) {
            this.reader.beginEmpty();
            int currentGroup = this.writer.getCurrentGroup();
            if (z8) {
                this.writer.startNode(i8, Composer.Companion.getEmpty());
            } else if (obj2 != null) {
                SlotWriter slotWriter = this.writer;
                if (obj3 == null) {
                    obj3 = Composer.Companion.getEmpty();
                }
                slotWriter.startData(i8, obj3, obj2);
            } else {
                SlotWriter slotWriter2 = this.writer;
                if (obj3 == null) {
                    obj3 = Composer.Companion.getEmpty();
                }
                slotWriter2.startGroup(i8, obj3);
            }
            Pending pending2 = this.pending;
            if (pending2 != null) {
                KeyInfo keyInfo = new KeyInfo(i8, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                pending2.registerInsert(keyInfo, this.nodeIndex - pending2.getStartIndex());
                pending2.recordUsed(keyInfo);
            }
            enterGroup(z8, null);
            return;
        }
        if (i9 == companion.m2456getNodeULZAiWs() && this.reusing) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.pending == null) {
            int groupKey = this.reader.getGroupKey();
            if (!z9 && groupKey == i8 && AbstractC3292y.d(obj, this.reader.getGroupObjectKey())) {
                startReaderGroup(z8, obj2);
            } else {
                this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
            }
        }
        Pending pending3 = this.pending;
        if (pending3 != null) {
            KeyInfo next = pending3.getNext(i8, obj);
            if (!z9 && next != null) {
                pending3.recordUsed(next);
                int location = next.getLocation();
                this.nodeIndex = pending3.nodePositionOf(next) + pending3.getStartIndex();
                int slotPositionOf = pending3.slotPositionOf(next);
                int groupIndex = slotPositionOf - pending3.getGroupIndex();
                pending3.registerMoveSlot(slotPositionOf, pending3.getGroupIndex());
                this.changeListWriter.moveReaderRelativeTo(location);
                this.reader.reposition(location);
                if (groupIndex > 0) {
                    this.changeListWriter.moveCurrentGroup(groupIndex);
                }
                startReaderGroup(z8, obj2);
            } else {
                this.reader.beginEmpty();
                this.inserting = true;
                this.providerCache = null;
                ensureWriter();
                this.writer.beginInsert();
                int currentGroup2 = this.writer.getCurrentGroup();
                if (z8) {
                    this.writer.startNode(i8, Composer.Companion.getEmpty());
                } else if (obj2 != null) {
                    SlotWriter slotWriter3 = this.writer;
                    if (obj3 == null) {
                        obj3 = Composer.Companion.getEmpty();
                    }
                    slotWriter3.startData(i8, obj3, obj2);
                } else {
                    SlotWriter slotWriter4 = this.writer;
                    if (obj3 == null) {
                        obj3 = Composer.Companion.getEmpty();
                    }
                    slotWriter4.startGroup(i8, obj3);
                }
                this.insertAnchor = this.writer.anchor(currentGroup2);
                KeyInfo keyInfo2 = new KeyInfo(i8, -1, insertedGroupVirtualIndex(currentGroup2), -1, 0);
                pending3.registerInsert(keyInfo2, this.nodeIndex - pending3.getStartIndex());
                pending3.recordUsed(keyInfo2);
                ArrayList arrayList = new ArrayList();
                if (!z8) {
                    i10 = this.nodeIndex;
                }
                pending = new Pending(arrayList, i10);
            }
        }
        enterGroup(z8, pending);
    }

    private final void startGroup(int i8) {
        m2442startBaiHCIY(i8, null, GroupKind.Companion.m2455getGroupULZAiWs(), null);
    }

    private final void startReaderGroup(boolean z8, Object obj) {
        if (z8) {
            this.reader.startNode();
            return;
        }
        if (obj != null && this.reader.getGroupAux() != obj) {
            this.changeListWriter.updateAuxData(obj);
        }
        this.reader.startGroup();
    }

    private final void startRoot() {
        int asInt;
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        IntStack intStack = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = changed(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation$runtime_release();
        }
        if (!this.sourceInformationEnabled) {
            this.sourceInformationEnabled = this.parentContext.getCollectingSourceInformation$runtime_release();
        }
        Set<CompositionData> set = (Set) CompositionLocalMapKt.read(this.parentProvider, InspectionTablesKt.getLocalInspectionTables());
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.parentContext.getCompoundHashKey$runtime_release());
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int i8, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i8 == 207 && !AbstractC3292y.d(obj2, Composer.Companion.getEmpty())) {
                updateCompoundKeyWhenWeEnterGroupKeyHash(obj2.hashCode());
                return;
            } else {
                updateCompoundKeyWhenWeEnterGroupKeyHash(i8);
                return;
            }
        }
        if (obj instanceof Enum) {
            updateCompoundKeyWhenWeEnterGroupKeyHash(((Enum) obj).ordinal());
        } else {
            updateCompoundKeyWhenWeEnterGroupKeyHash(obj.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int i8) {
        this.compoundKeyHash = i8 ^ Integer.rotateLeft(getCompoundKeyHash(), 3);
    }

    private final void updateCompoundKeyWhenWeExitGroup(int i8, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i8 == 207 && !AbstractC3292y.d(obj2, Composer.Companion.getEmpty())) {
                updateCompoundKeyWhenWeExitGroupKeyHash(obj2.hashCode());
                return;
            } else {
                updateCompoundKeyWhenWeExitGroupKeyHash(i8);
                return;
            }
        }
        if (obj instanceof Enum) {
            updateCompoundKeyWhenWeExitGroupKeyHash(((Enum) obj).ordinal());
        } else {
            updateCompoundKeyWhenWeExitGroupKeyHash(obj.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int i8) {
        this.compoundKeyHash = Integer.rotateRight(i8 ^ getCompoundKeyHash(), 3);
    }

    private final void updateNodeCount(int i8, int i9) {
        if (updatedNodeCount(i8) != i9) {
            if (i8 < 0) {
                MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new MutableIntIntMap(0, 1, null);
                    this.nodeCountVirtualOverrides = mutableIntIntMap;
                }
                mutableIntIntMap.set(i8, i9);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getSize()];
                AbstractC1428l.v(iArr, -1, 0, 0, 6, null);
                this.nodeCountOverrides = iArr;
            }
            iArr[i8] = i9;
        }
    }

    private final void updateNodeCountOverrides(int i8, int i9) {
        int updatedNodeCount = updatedNodeCount(i8);
        if (updatedNodeCount != i9) {
            int i10 = i9 - updatedNodeCount;
            int size = this.pendingStack.getSize() - 1;
            while (i8 != -1) {
                int updatedNodeCount2 = updatedNodeCount(i8) + i10;
                updateNodeCount(i8, updatedNodeCount2);
                int i11 = size;
                while (true) {
                    if (-1 < i11) {
                        Pending peek = this.pendingStack.peek(i11);
                        if (peek != null && peek.updateNodeCount(i8, updatedNodeCount2)) {
                            size = i11 - 1;
                            break;
                        }
                        i11--;
                    } else {
                        break;
                    }
                }
                if (i8 < 0) {
                    i8 = this.reader.getParent();
                } else if (!this.reader.isNode(i8)) {
                    i8 = this.reader.parent(i8);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    private final PersistentCompositionLocalMap updateProviderMapGroup(PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentMap.Builder<CompositionLocal<Object>, State<? extends Object>> builder2 = persistentCompositionLocalMap.builder2();
        builder2.putAll(persistentCompositionLocalMap2);
        ?? build2 = builder2.build2();
        startGroup(ComposerKt.providerMapsKey, ComposerKt.getProviderMaps());
        updateSlot(build2);
        updateSlot(persistentCompositionLocalMap2);
        endGroup();
        return build2;
    }

    private final void updateSlot(Object obj) {
        nextSlot();
        updateValue(obj);
    }

    private final int updatedNodeCount(int i8) {
        int i9;
        if (i8 < 0) {
            MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
            if (mutableIntIntMap == null || !mutableIntIntMap.contains(i8)) {
                return 0;
            }
            return mutableIntIntMap.get(i8);
        }
        int[] iArr = this.nodeCountOverrides;
        if (iArr != null && (i9 = iArr[i8]) >= 0) {
            return i9;
        }
        return this.reader.nodeCount(i8);
    }

    private final void validateNodeExpected() {
        if (this.nodeExpected) {
            this.nodeExpected = false;
        } else {
            ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new C1413h();
        }
    }

    private final void validateNodeNotExpected() {
        if (!this.nodeExpected) {
            return;
        }
        ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new C1413h();
    }

    private final <R> R withReader(SlotReader slotReader, Function0 function0) {
        SlotReader reader$runtime_release = getReader$runtime_release();
        int[] iArr = this.nodeCountOverrides;
        IntMap intMap = this.providerUpdates;
        this.nodeCountOverrides = null;
        this.providerUpdates = null;
        try {
            setReader$runtime_release(slotReader);
            return (R) function0.invoke();
        } finally {
            AbstractC3290w.b(1);
            setReader$runtime_release(reader$runtime_release);
            this.nodeCountOverrides = iArr;
            this.providerUpdates = intMap;
            AbstractC3290w.a(1);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(V v8, InterfaceC2072n interfaceC2072n) {
        if (getInserting()) {
            this.insertFixups.updateNode(v8, interfaceC2072n);
        } else {
            this.changeListWriter.updateNode(v8, interfaceC2072n);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionContext buildContext() {
        CompositionContextHolder compositionContextHolder;
        CompositionImpl compositionImpl;
        startGroup(ComposerKt.referenceKey, ComposerKt.getReference());
        CompositionObserverHolder compositionObserverHolder = null;
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        Object nextSlot = nextSlot();
        if (nextSlot instanceof CompositionContextHolder) {
            compositionContextHolder = (CompositionContextHolder) nextSlot;
        } else {
            compositionContextHolder = null;
        }
        if (compositionContextHolder == null) {
            int compoundKeyHash = getCompoundKeyHash();
            boolean z8 = this.forceRecomposeScopes;
            boolean z9 = this.sourceInformationEnabled;
            ControlledComposition composition = getComposition();
            if (composition instanceof CompositionImpl) {
                compositionImpl = (CompositionImpl) composition;
            } else {
                compositionImpl = null;
            }
            if (compositionImpl != null) {
                compositionObserverHolder = compositionImpl.getObserverHolder$runtime_release();
            }
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(compoundKeyHash, z8, z9, compositionObserverHolder));
            updateValue(compositionContextHolder);
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return compositionContextHolder.getRef();
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean z8, Function0 function0) {
        T t8 = (T) nextSlotForCache();
        if (t8 == Composer.Companion.getEmpty() || z8) {
            T t9 = (T) function0.invoke();
            updateCachedValue(t9);
            return t9;
        }
        return t8;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(Object obj) {
        if (AbstractC3292y.d(nextSlot(), obj)) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changedInstance(Object obj) {
        if (nextSlot() != obj) {
            updateValue(obj);
            return true;
        }
        return false;
    }

    public final void changesApplied$runtime_release() {
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
        this.sourceInformationEnabled = true;
    }

    public final void composeContent$runtime_release(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap, InterfaceC2072n interfaceC2072n) {
        if (this.changes.isEmpty()) {
            doCompose(identityArrayMap, interfaceC2072n);
        } else {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new C1413h();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public <T> T consume(CompositionLocal<T> compositionLocal) {
        return (T) CompositionLocalMapKt.read(currentCompositionLocalScope(), compositionLocal);
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(Function0 function0) {
        validateNodeExpected();
        if (getInserting()) {
            int peek = this.nodeIndexStack.peek();
            SlotWriter slotWriter = this.writer;
            Anchor anchor = slotWriter.anchor(slotWriter.getParent());
            this.groupNodeCount++;
            this.insertFixups.createAndInsertNode(function0, peek, anchor);
            return;
        }
        ComposerKt.composeRuntimeError("createNode() can only be called when inserting".toString());
        throw new C1413h();
    }

    public final void deactivate$runtime_release() {
        this.invalidateStack.clear();
        this.invalidations.clear();
        this.changes.clear();
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean z8) {
        boolean z9;
        if (this.groupNodeCount == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (!getInserting()) {
                if (!z8) {
                    skipReaderToGroupEnd();
                    return;
                }
                int currentGroup = this.reader.getCurrentGroup();
                int currentEnd = this.reader.getCurrentEnd();
                this.changeListWriter.deactivateCurrentGroup();
                ComposerKt.removeRange(this.invalidations, currentGroup, currentEnd);
                this.reader.skipToGroupEnd();
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("No nodes can be emitted before calling dactivateToEndGroup".toString());
        throw new C1413h();
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void disableSourceInformation() {
        this.sourceInformationEnabled = false;
    }

    public final void dispose$runtime_release() {
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            deactivate$runtime_release();
            getApplier().clear();
            this.isDisposed = true;
            I i8 = I.f8786a;
            trace.endSection(beginSection);
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(beginSection);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        boolean z8;
        if (this.reusingGroup >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.reusing = z8;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getUsed()) {
            currentRecomposeScope$runtime_release.setDefaultsInScope(true);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProvider() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProviders() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public ScopeUpdateScope endRestartGroup() {
        RecomposeScopeImpl recomposeScopeImpl;
        Anchor anchor;
        Function1 end;
        RecomposeScopeImpl recomposeScopeImpl2 = null;
        if (this.invalidateStack.isNotEmpty()) {
            recomposeScopeImpl = this.invalidateStack.pop();
        } else {
            recomposeScopeImpl = null;
        }
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.setRequiresRecompose(false);
        }
        if (recomposeScopeImpl != null && (end = recomposeScopeImpl.end(this.compositionToken)) != null) {
            this.changeListWriter.endCompositionScope(end, getComposition());
        }
        if (recomposeScopeImpl != null && !recomposeScopeImpl.getSkipped$runtime_release() && (recomposeScopeImpl.getUsed() || this.forceRecomposeScopes)) {
            if (recomposeScopeImpl.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImpl.setAnchor(anchor);
            }
            recomposeScopeImpl.setDefaultsInvalid(false);
            recomposeScopeImpl2 = recomposeScopeImpl;
        }
        end(false);
        return recomposeScopeImpl2;
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    public final void endReuseFromRoot() {
        if (!this.isComposing && this.reusingGroup == 100) {
            this.reusingGroup = -1;
            this.reusing = false;
            return;
        }
        throw new IllegalArgumentException("Cannot disable reuse from root if it was caused by other groups".toString());
    }

    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int i8) {
        if (i8 < 0) {
            int i9 = -i8;
            SlotWriter slotWriter = this.writer;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent > i9) {
                    end(slotWriter.isNode(parent));
                } else {
                    return;
                }
            }
        } else {
            if (getInserting()) {
                SlotWriter slotWriter2 = this.writer;
                while (getInserting()) {
                    end(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 > i8) {
                    end(slotReader.isNode(parent2));
                } else {
                    return;
                }
            }
        }
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = true;
            this.forciblyRecompose = true;
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    public U5.g getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext();
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        if (this.childrenComposing > 0) {
            return true;
        }
        return false;
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.getSize();
    }

    @Override // androidx.compose.runtime.Composer
    public ControlledComposition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionData getCompositionData() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionLocalMap getCurrentCompositionLocalMap() {
        return currentCompositionLocalScope();
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        if (getInserting()) {
            return -this.writer.getParent();
        }
        return this.reader.getParent();
    }

    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        Stack<RecomposeScopeImpl> stack = this.invalidateStack;
        if (this.childrenComposing == 0 && stack.isNotEmpty()) {
            return stack.peek();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (!getSkipping() || this.providersInvalid) {
            return true;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getDefaultsInvalid()) {
            return true;
        }
        return false;
    }

    public final ChangeList getDeferredChanges$runtime_release() {
        return this.deferredChanges;
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return this.changes.isNotEmpty();
    }

    public final SlotTable getInsertTable$runtime_release() {
        return this.insertTable;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    public final SlotReader getReader$runtime_release() {
        return this.reader;
    }

    @Override // androidx.compose.runtime.Composer
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            return currentRecomposeScope$runtime_release.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        if (!getInserting() && !this.reusing && !this.providersInvalid && (currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release()) != null && !currentRecomposeScope$runtime_release.getRequiresRecompose() && !this.forciblyRecompose) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContent(MovableContent<?> movableContent, Object obj) {
        AbstractC3292y.g(movableContent, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        invokeMovableContentLambda(movableContent, currentCompositionLocalScope(), obj, false);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContentReferences(List<r> list) {
        try {
            insertMovableContentGuarded(list);
            cleanUpCompose();
        } catch (Throwable th) {
            abortRoot();
            throw th;
        }
    }

    public final boolean isComposing$runtime_release() {
        return this.isComposing;
    }

    public final boolean isDisposed$runtime_release() {
        return this.isDisposed;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Object joinKey(Object obj, Object obj2) {
        Object key;
        key = ComposerKt.getKey(this.reader.getGroupObjectKey(), obj, obj2);
        if (key == null) {
            return new JoinedKey(obj, obj2);
        }
        return key;
    }

    public final Object nextSlot() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        if (this.reusing && !(next instanceof ReusableRememberObserver)) {
            return Composer.Companion.getEmpty();
        }
        return next;
    }

    public final Object nextSlotForCache() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        if (this.reusing && !(next instanceof ReusableRememberObserver)) {
            return Composer.Companion.getEmpty();
        }
        if (next instanceof RememberObserverHolder) {
            return ((RememberObserverHolder) next).getWrapped();
        }
        return next;
    }

    public final int parentKey$runtime_release() {
        if (getInserting()) {
            SlotWriter slotWriter = this.writer;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    public final void prepareCompose$runtime_release(Function0 function0) {
        if (!this.isComposing) {
            this.isComposing = true;
            try {
                function0.invoke();
                return;
            } finally {
                this.isComposing = false;
            }
        }
        ComposerKt.composeRuntimeError("Preparing a composition while composing is not supported".toString());
        throw new C1413h();
    }

    public final boolean recompose$runtime_release(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap) {
        if (this.changes.isEmpty()) {
            if (!identityArrayMap.isNotEmpty() && !(!this.invalidations.isEmpty()) && !this.forciblyRecompose) {
                return false;
            }
            doCompose(identityArrayMap, null);
            return this.changes.isNotEmpty();
        }
        ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
        throw new C1413h();
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(Function0 function0) {
        this.changeListWriter.sideEffect(function0);
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(RecomposeScope recomposeScope) {
        RecomposeScopeImpl recomposeScopeImpl;
        if (recomposeScope instanceof RecomposeScopeImpl) {
            recomposeScopeImpl = (RecomposeScopeImpl) recomposeScope;
        } else {
            recomposeScopeImpl = null;
        }
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.setUsed(true);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public Object rememberedValue() {
        return nextSlotForCache();
    }

    public final void setDeferredChanges$runtime_release(ChangeList changeList) {
        this.deferredChanges = changeList;
    }

    public final void setInsertTable$runtime_release(SlotTable slotTable) {
        this.insertTable = slotTable;
    }

    public final void setReader$runtime_release(SlotReader slotReader) {
        this.reader = slotReader;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipCurrentGroup() {
        if (this.invalidations.isEmpty()) {
            skipGroup();
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        updateCompoundKeyWhenWeEnterGroup(groupKey, groupObjectKey, groupAux);
        startReaderGroup(slotReader.isNode(), null);
        recomposeToGroupEnd();
        slotReader.endGroup();
        updateCompoundKeyWhenWeExitGroup(groupKey, groupObjectKey, groupAux);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        boolean z8;
        if (this.groupNodeCount == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
            if (currentRecomposeScope$runtime_release != null) {
                currentRecomposeScope$runtime_release.scopeSkipped();
            }
            if (this.invalidations.isEmpty()) {
                skipReaderToGroupEnd();
                return;
            } else {
                recomposeToGroupEnd();
                return;
            }
        }
        ComposerKt.composeRuntimeError("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw new C1413h();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(String str) {
        if (getInserting() && this.sourceInformationEnabled) {
            this.writer.recordGroupSourceInformation(str);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        if (getInserting() && this.sourceInformationEnabled) {
            this.writer.recordGrouplessCallSourceInformationEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int i8, String str) {
        if (getInserting() && this.sourceInformationEnabled) {
            this.writer.recordGrouplessCallSourceInformationStart(i8, str);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        m2442startBaiHCIY(-127, null, GroupKind.Companion.m2455getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int i8, Object obj) {
        m2442startBaiHCIY(i8, obj, GroupKind.Companion.m2455getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m2442startBaiHCIY(125, null, GroupKind.Companion.m2456getNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProvider(ProvidedValue<?> providedValue) {
        State<? extends Object> state;
        PersistentCompositionLocalMap putValue;
        int asInt;
        PersistentCompositionLocalMap currentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(ComposerKt.providerKey, ComposerKt.getProvider());
        Object rememberedValue = rememberedValue();
        if (AbstractC3292y.d(rememberedValue, Composer.Companion.getEmpty())) {
            state = null;
        } else {
            AbstractC3292y.g(rememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Any?>");
            state = (State) rememberedValue;
        }
        CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
        AbstractC3292y.g(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        State<?> updatedStateOf$runtime_release = compositionLocal.updatedStateOf$runtime_release(providedValue.getValue(), state);
        boolean z8 = true;
        boolean z9 = !AbstractC3292y.d(updatedStateOf$runtime_release, state);
        if (z9) {
            updateRememberedValue(updatedStateOf$runtime_release);
        }
        boolean z10 = false;
        if (getInserting()) {
            putValue = currentCompositionLocalScope.putValue(compositionLocal, updatedStateOf$runtime_release);
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            Object groupAux = slotReader.groupAux(slotReader.getCurrentGroup());
            AbstractC3292y.g(groupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupAux;
            if ((getSkipping() && !z9) || (!providedValue.getCanOverride() && CompositionLocalMapKt.contains(currentCompositionLocalScope, compositionLocal))) {
                putValue = persistentCompositionLocalMap;
            } else {
                putValue = currentCompositionLocalScope.putValue(compositionLocal, updatedStateOf$runtime_release);
            }
            if (!this.reusing && persistentCompositionLocalMap == putValue) {
                z8 = false;
            }
            z10 = z8;
        }
        if (z10 && !getInserting()) {
            recordProviderUpdate(putValue);
        }
        IntStack intStack = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = z10;
        this.providerCache = putValue;
        m2442startBaiHCIY(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m2455getGroupULZAiWs(), putValue);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProviders(ProvidedValue<?>[] providedValueArr) {
        PersistentCompositionLocalMap updateProviderMapGroup;
        int asInt;
        PersistentCompositionLocalMap currentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(ComposerKt.providerKey, ComposerKt.getProvider());
        boolean z8 = true;
        boolean z9 = false;
        if (getInserting()) {
            updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope, CompositionLocalMapKt.updateCompositionMap$default(providedValueArr, currentCompositionLocalScope, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            Object groupGet = this.reader.groupGet(0);
            AbstractC3292y.g(groupGet, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupGet;
            Object groupGet2 = this.reader.groupGet(1);
            AbstractC3292y.g(groupGet2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) groupGet2;
            PersistentCompositionLocalMap updateCompositionMap = CompositionLocalMapKt.updateCompositionMap(providedValueArr, currentCompositionLocalScope, persistentCompositionLocalMap2);
            if (getSkipping() && !this.reusing && AbstractC3292y.d(persistentCompositionLocalMap2, updateCompositionMap)) {
                skipGroup();
                updateProviderMapGroup = persistentCompositionLocalMap;
            } else {
                updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope, updateCompositionMap);
                if (!this.reusing && AbstractC3292y.d(updateProviderMapGroup, persistentCompositionLocalMap)) {
                    z8 = false;
                }
                z9 = z8;
            }
        }
        if (z9 && !getInserting()) {
            recordProviderUpdate(updateProviderMapGroup);
        }
        IntStack intStack = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = z9;
        this.providerCache = updateProviderMapGroup;
        m2442startBaiHCIY(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m2455getGroupULZAiWs(), updateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int i8) {
        m2442startBaiHCIY(i8, null, GroupKind.Companion.m2455getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Composer startRestartGroup(int i8) {
        m2442startBaiHCIY(i8, null, GroupKind.Companion.m2455getGroupULZAiWs(), null);
        addRecomposeScope();
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int i8, Object obj) {
        if (!getInserting() && this.reader.getGroupKey() == i8 && !AbstractC3292y.d(this.reader.getGroupAux(), obj) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        m2442startBaiHCIY(i8, null, GroupKind.Companion.m2455getGroupULZAiWs(), obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m2442startBaiHCIY(125, null, GroupKind.Companion.m2457getReusableNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    public final void startReuseFromRoot() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    public final boolean tryImminentInvalidation$runtime_release(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.reader.getTable$runtime_release());
        if (this.isComposing && indexFor >= this.reader.getCurrentGroup()) {
            ComposerKt.insertIfMissing(this.invalidations, indexFor, recomposeScopeImpl, obj);
            return true;
        }
        return false;
    }

    public final void updateCachedValue(Object obj) {
        if (obj instanceof RememberObserver) {
            if (getInserting()) {
                this.changeListWriter.remember((RememberObserver) obj);
            }
            this.abandonSet.add(obj);
            obj = new RememberObserverHolder((RememberObserver) obj);
        }
        updateValue(obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(Object obj) {
        updateCachedValue(obj);
    }

    public final void updateValue(Object obj) {
        if (getInserting()) {
            this.writer.update(obj);
        } else {
            this.changeListWriter.updateValue(obj, this.reader.getGroupSlotIndex() - 1);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (!getInserting()) {
            Object node = getNode(this.reader);
            this.changeListWriter.moveDown(node);
            if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
                this.changeListWriter.useNode(node);
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("useNode() called while inserting".toString());
        throw new C1413h();
    }

    public final void verifyConsistent$runtime_release() {
        this.insertTable.verifyWellFormed();
    }

    private final void startGroup(int i8, Object obj) {
        m2442startBaiHCIY(i8, obj, GroupKind.Companion.m2455getGroupULZAiWs(), null);
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope(int i8) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && AbstractC3292y.d(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object groupAux = this.writer.groupAux(parent);
                    AbstractC3292y.g(groupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) groupAux;
                    this.providerCache = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getSize() > 0) {
            while (i8 > 0) {
                if (this.reader.groupKey(i8) == 202 && AbstractC3292y.d(this.reader.groupObjectKey(i8), ComposerKt.getCompositionLocalMap())) {
                    IntMap<PersistentCompositionLocalMap> intMap = this.providerUpdates;
                    if (intMap == null || (persistentCompositionLocalMap = intMap.get(i8)) == null) {
                        Object groupAux2 = this.reader.groupAux(i8);
                        AbstractC3292y.g(groupAux2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupAux2;
                    }
                    this.providerCache = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                i8 = this.reader.parent(i8);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.parentProvider;
        this.providerCache = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char c8) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Character) && c8 == ((Character) nextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(c8));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte b9) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Byte) && b9 == ((Number) nextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(b9));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short s8) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Short) && s8 == ((Number) nextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(s8));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean z8) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Boolean) && z8 == ((Boolean) nextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(z8));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float f8) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Float) && f8 == ((Number) nextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(f8));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long j8) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Long) && j8 == ((Number) nextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(j8));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double d8) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Double) && d8 == ((Number) nextSlot).doubleValue()) {
            return false;
        }
        updateValue(Double.valueOf(d8));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int i8) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Integer) && i8 == ((Number) nextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(i8));
        return true;
    }
}
