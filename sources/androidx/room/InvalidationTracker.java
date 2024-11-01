package androidx.room;

import Q5.I;
import R5.AbstractC1435t;
import R5.Q;
import R5.a0;
import a6.AbstractC1677b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public class InvalidationTracker {
    private static final String CREATE_TRACKING_TABLE_SQL = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    private static final String INVALIDATED_COLUMN_NAME = "invalidated";
    public static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";
    public static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
    private static final String TABLE_ID_COLUMN_NAME = "table_id";
    private static final String UPDATE_TABLE_NAME = "room_table_modification_log";
    private AutoCloser autoCloser;
    private volatile SupportSQLiteStatement cleanupStatement;
    private final RoomDatabase database;
    private volatile boolean initialized;
    private final InvalidationLiveDataContainer invalidationLiveDataContainer;
    private MultiInstanceInvalidationClient multiInstanceInvalidationClient;
    private final ObservedTableTracker observedTableTracker;

    @GuardedBy("observerMap")
    private final SafeIterableMap<Observer, ObserverWrapper> observerMap;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    private final AtomicBoolean pendingRefresh;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Runnable refreshRunnable;
    private final Map<String, String> shadowTablesMap;
    private final Object syncTriggersLock;
    private final Map<String, Integer> tableIdLookup;
    private final String[] tablesNames;
    private final Object trackerLock;
    private final Map<String, Set<String>> viewTables;
    public static final Companion Companion = new Companion(null);
    private static final String[] TRIGGERS = {"UPDATE", "DELETE", "INSERT"};

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        public final void beginTransactionInternal$room_runtime_release(SupportSQLiteDatabase database) {
            AbstractC3292y.i(database, "database");
            if (database.isWriteAheadLoggingEnabled()) {
                database.beginTransactionNonExclusive();
            } else {
                database.beginTransaction();
            }
        }

        public final String getTriggerName$room_runtime_release(String tableName, String triggerType) {
            AbstractC3292y.i(tableName, "tableName");
            AbstractC3292y.i(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class ObservedTableTracker {
        public static final int ADD = 1;
        public static final Companion Companion = new Companion(null);
        public static final int NO_OP = 0;
        public static final int REMOVE = 2;
        private boolean needsSync;
        private final long[] tableObservers;
        private final int[] triggerStateChanges;
        private final boolean[] triggerStates;

        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public ObservedTableTracker(int i8) {
            this.tableObservers = new long[i8];
            this.triggerStates = new boolean[i8];
            this.triggerStateChanges = new int[i8];
        }

        public final boolean getNeedsSync() {
            return this.needsSync;
        }

        public final long[] getTableObservers() {
            return this.tableObservers;
        }

        @VisibleForTesting
        public final int[] getTablesToSync() {
            boolean z8;
            synchronized (this) {
                try {
                    if (!this.needsSync) {
                        return null;
                    }
                    long[] jArr = this.tableObservers;
                    int length = jArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length) {
                        int i10 = i9 + 1;
                        int i11 = 1;
                        if (jArr[i8] > 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        boolean[] zArr = this.triggerStates;
                        if (z8 != zArr[i9]) {
                            int[] iArr = this.triggerStateChanges;
                            if (!z8) {
                                i11 = 2;
                            }
                            iArr[i9] = i11;
                        } else {
                            this.triggerStateChanges[i9] = 0;
                        }
                        zArr[i9] = z8;
                        i8++;
                        i9 = i10;
                    }
                    this.needsSync = false;
                    return (int[]) this.triggerStateChanges.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean onAdded(int... tableIds) {
            boolean z8;
            AbstractC3292y.i(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z8 = false;
                    for (int i8 : tableIds) {
                        long[] jArr = this.tableObservers;
                        long j8 = jArr[i8];
                        jArr[i8] = 1 + j8;
                        if (j8 == 0) {
                            this.needsSync = true;
                            z8 = true;
                        }
                    }
                    I i9 = I.f8786a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z8;
        }

        public final boolean onRemoved(int... tableIds) {
            boolean z8;
            AbstractC3292y.i(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z8 = false;
                    for (int i8 : tableIds) {
                        long[] jArr = this.tableObservers;
                        long j8 = jArr[i8];
                        jArr[i8] = j8 - 1;
                        if (j8 == 1) {
                            this.needsSync = true;
                            z8 = true;
                        }
                    }
                    I i9 = I.f8786a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z8;
        }

        public final void resetTriggerState() {
            synchronized (this) {
                Arrays.fill(this.triggerStates, false);
                this.needsSync = true;
                I i8 = I.f8786a;
            }
        }

        public final void setNeedsSync(boolean z8) {
            this.needsSync = z8;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Observer {
        private final String[] tables;

        public Observer(String[] tables) {
            AbstractC3292y.i(tables, "tables");
            this.tables = tables;
        }

        public final String[] getTables$room_runtime_release() {
            return this.tables;
        }

        public boolean isRemote$room_runtime_release() {
            return false;
        }

        public abstract void onInvalidated(Set<String> set);

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected Observer(java.lang.String r3, java.lang.String... r4) {
            /*
                r2 = this;
                java.lang.String r0 = "firstTable"
                kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
                java.lang.String r0 = "rest"
                kotlin.jvm.internal.AbstractC3292y.i(r4, r0)
                java.util.List r0 = R5.AbstractC1435t.c()
                r1 = r0
                java.util.Collection r1 = (java.util.Collection) r1
                R5.AbstractC1435t.E(r1, r4)
                r0.add(r3)
                java.util.List r3 = R5.AbstractC1435t.a(r0)
                java.util.Collection r3 = (java.util.Collection) r3
                r4 = 0
                java.lang.String[] r4 = new java.lang.String[r4]
                java.lang.Object[] r3 = r3.toArray(r4)
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                kotlin.jvm.internal.AbstractC3292y.g(r3, r4)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker.Observer.<init>(java.lang.String, java.lang.String[]):void");
        }
    }

    /* loaded from: classes3.dex */
    public static final class ObserverWrapper {
        private final Observer observer;
        private final Set<String> singleTableSet;
        private final int[] tableIds;
        private final String[] tableNames;

        public ObserverWrapper(Observer observer, int[] tableIds, String[] tableNames) {
            boolean z8;
            Set<String> f8;
            AbstractC3292y.i(observer, "observer");
            AbstractC3292y.i(tableIds, "tableIds");
            AbstractC3292y.i(tableNames, "tableNames");
            this.observer = observer;
            this.tableIds = tableIds;
            this.tableNames = tableNames;
            if (tableNames.length == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                f8 = a0.d(tableNames[0]);
            } else {
                f8 = a0.f();
            }
            this.singleTableSet = f8;
            if (tableIds.length == tableNames.length) {
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final Observer getObserver$room_runtime_release() {
            return this.observer;
        }

        public final int[] getTableIds$room_runtime_release() {
            return this.tableIds;
        }

        public final void notifyByTableInvalidStatus$room_runtime_release(Set<Integer> invalidatedTablesIds) {
            Set<String> f8;
            AbstractC3292y.i(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.tableIds;
            int length = iArr.length;
            if (length != 0) {
                int i8 = 0;
                if (length != 1) {
                    Set b9 = a0.b();
                    int[] iArr2 = this.tableIds;
                    int length2 = iArr2.length;
                    int i9 = 0;
                    while (i8 < length2) {
                        int i10 = i9 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i8]))) {
                            b9.add(this.tableNames[i9]);
                        }
                        i8++;
                        i9 = i10;
                    }
                    f8 = a0.a(b9);
                } else if (invalidatedTablesIds.contains(Integer.valueOf(iArr[0]))) {
                    f8 = this.singleTableSet;
                } else {
                    f8 = a0.f();
                }
            } else {
                f8 = a0.f();
            }
            if (!f8.isEmpty()) {
                this.observer.onInvalidated(f8);
            }
        }

        public final void notifyByTableNames$room_runtime_release(String[] tables) {
            Set<String> f8;
            AbstractC3292y.i(tables, "tables");
            int length = this.tableNames.length;
            if (length != 0) {
                if (length != 1) {
                    Set b9 = a0.b();
                    for (String str : tables) {
                        for (String str2 : this.tableNames) {
                            if (l6.n.s(str2, str, true)) {
                                b9.add(str2);
                            }
                        }
                    }
                    f8 = a0.a(b9);
                } else {
                    int length2 = tables.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length2) {
                            if (l6.n.s(tables[i8], this.tableNames[0], true)) {
                                f8 = this.singleTableSet;
                                break;
                            }
                            i8++;
                        } else {
                            f8 = a0.f();
                            break;
                        }
                    }
                }
            } else {
                f8 = a0.f();
            }
            if (!f8.isEmpty()) {
                this.observer.onInvalidated(f8);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class WeakObserver extends Observer {
        private final WeakReference<Observer> delegateRef;
        private final InvalidationTracker tracker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeakObserver(InvalidationTracker tracker, Observer delegate) {
            super(delegate.getTables$room_runtime_release());
            AbstractC3292y.i(tracker, "tracker");
            AbstractC3292y.i(delegate, "delegate");
            this.tracker = tracker;
            this.delegateRef = new WeakReference<>(delegate);
        }

        public final WeakReference<Observer> getDelegateRef() {
            return this.delegateRef;
        }

        public final InvalidationTracker getTracker() {
            return this.tracker;
        }

        @Override // androidx.room.InvalidationTracker.Observer
        public void onInvalidated(Set<String> tables) {
            AbstractC3292y.i(tables, "tables");
            Observer observer = this.delegateRef.get();
            if (observer == null) {
                this.tracker.removeObserver(this);
            } else {
                observer.onInvalidated(tables);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(RoomDatabase database, Map<String, String> shadowTablesMap, Map<String, Set<String>> viewTables, String... tableNames) {
        String str;
        AbstractC3292y.i(database, "database");
        AbstractC3292y.i(shadowTablesMap, "shadowTablesMap");
        AbstractC3292y.i(viewTables, "viewTables");
        AbstractC3292y.i(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.pendingRefresh = new AtomicBoolean(false);
        this.observedTableTracker = new ObservedTableTracker(tableNames.length);
        this.invalidationLiveDataContainer = new InvalidationLiveDataContainer(database);
        this.observerMap = new SafeIterableMap<>();
        this.syncTriggersLock = new Object();
        this.trackerLock = new Object();
        this.tableIdLookup = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i8 = 0; i8 < length; i8++) {
            String str2 = tableNames[i8];
            Locale US = Locale.US;
            AbstractC3292y.h(US, "US");
            String lowerCase = str2.toLowerCase(US);
            AbstractC3292y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.tableIdLookup.put(lowerCase, Integer.valueOf(i8));
            String str3 = this.shadowTablesMap.get(tableNames[i8]);
            if (str3 != null) {
                AbstractC3292y.h(US, "US");
                str = str3.toLowerCase(US);
                AbstractC3292y.h(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i8] = lowerCase;
        }
        this.tablesNames = strArr;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String value = entry.getValue();
            Locale US2 = Locale.US;
            AbstractC3292y.h(US2, "US");
            String lowerCase2 = value.toLowerCase(US2);
            AbstractC3292y.h(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.tableIdLookup.containsKey(lowerCase2)) {
                String key = entry.getKey();
                AbstractC3292y.h(US2, "US");
                String lowerCase3 = key.toLowerCase(US2);
                AbstractC3292y.h(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map = this.tableIdLookup;
                map.put(lowerCase3, Q.i(map, lowerCase2));
            }
        }
        this.refreshRunnable = new Runnable() { // from class: androidx.room.InvalidationTracker$refreshRunnable$1
            private final Set<Integer> checkUpdatedTable() {
                InvalidationTracker invalidationTracker = InvalidationTracker.this;
                Set b9 = a0.b();
                Cursor query$default = RoomDatabase.query$default(invalidationTracker.getDatabase$room_runtime_release(), new SimpleSQLiteQuery(InvalidationTracker.SELECT_UPDATED_TABLES_SQL), null, 2, null);
                while (query$default.moveToNext()) {
                    try {
                        b9.add(Integer.valueOf(query$default.getInt(0)));
                    } finally {
                    }
                }
                I i9 = I.f8786a;
                AbstractC1677b.a(query$default, null);
                Set<Integer> a9 = a0.a(b9);
                if (!a9.isEmpty()) {
                    if (InvalidationTracker.this.getCleanupStatement$room_runtime_release() != null) {
                        SupportSQLiteStatement cleanupStatement$room_runtime_release = InvalidationTracker.this.getCleanupStatement$room_runtime_release();
                        if (cleanupStatement$room_runtime_release != null) {
                            cleanupStatement$room_runtime_release.executeUpdateDelete();
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                return a9;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:            if (r0 != null) goto L26;     */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:            r0.decrementCountAndScheduleClose();     */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:            if ((!r3.isEmpty()) == false) goto L59;     */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:            r0 = r5.this$0.getObserverMap$room_runtime_release();        r1 = r5.this$0;     */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00d2, code lost:            monitor-enter(r0);     */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:            r1 = r1.getObserverMap$room_runtime_release().iterator();     */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00df, code lost:            if (r1.hasNext() == false) goto L69;     */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:            ((androidx.room.InvalidationTracker.ObserverWrapper) ((java.util.Map.Entry) r1.next()).getValue()).notifyByTableInvalidStatus$room_runtime_release(r3);     */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:            r1 = Q5.I.f8786a;     */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00f5, code lost:            monitor-exit(r0);     */
            /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:            return;     */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00f1, code lost:            r1 = move-exception;     */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00f8, code lost:            throw r1;     */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00f9, code lost:            return;     */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x00a6, code lost:            if (r0 == null) goto L44;     */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x00bd, code lost:            if (r0 == null) goto L44;     */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 265
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker$refreshRunnable$1.run():void");
            }
        };
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshRunnable$annotations() {
    }

    private final String[] resolveViews(String[] strArr) {
        Set b9 = a0.b();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.viewTables;
            Locale US = Locale.US;
            AbstractC3292y.h(US, "US");
            String lowerCase = str.toLowerCase(US);
            AbstractC3292y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.viewTables;
                AbstractC3292y.h(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                AbstractC3292y.h(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                AbstractC3292y.f(set);
                b9.addAll(set);
            } else {
                b9.add(str);
            }
        }
        Object[] array = a0.a(b9).toArray(new String[0]);
        AbstractC3292y.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    private final void startTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i8) {
        supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i8 + ", 0)");
        String str = this.tablesNames[i8];
        for (String str2 : TRIGGERS) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + Companion.getTriggerName$room_runtime_release(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE " + UPDATE_TABLE_NAME + " SET " + INVALIDATED_COLUMN_NAME + " = 1 WHERE " + TABLE_ID_COLUMN_NAME + " = " + i8 + " AND " + INVALIDATED_COLUMN_NAME + " = 0; END";
            AbstractC3292y.h(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    private final void stopTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i8) {
        String str = this.tablesNames[i8];
        for (String str2 : TRIGGERS) {
            String str3 = "DROP TRIGGER IF EXISTS " + Companion.getTriggerName$room_runtime_release(str, str2);
            AbstractC3292y.h(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    private final String[] validateAndResolveTableNames(String[] strArr) {
        String[] resolveViews = resolveViews(strArr);
        for (String str : resolveViews) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale US = Locale.US;
            AbstractC3292y.h(US, "US");
            String lowerCase = str.toLowerCase(US);
            AbstractC3292y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return resolveViews;
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void addObserver(Observer observer) {
        ObserverWrapper putIfAbsent;
        AbstractC3292y.i(observer, "observer");
        String[] resolveViews = resolveViews(observer.getTables$room_runtime_release());
        ArrayList arrayList = new ArrayList(resolveViews.length);
        for (String str : resolveViews) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale US = Locale.US;
            AbstractC3292y.h(US, "US");
            String lowerCase = str.toLowerCase(US);
            AbstractC3292y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num != null) {
                arrayList.add(num);
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        int[] V02 = AbstractC1435t.V0(arrayList);
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, V02, resolveViews);
        synchronized (this.observerMap) {
            putIfAbsent = this.observerMap.putIfAbsent(observer, observerWrapper);
        }
        if (putIfAbsent == null && this.observedTableTracker.onAdded(Arrays.copyOf(V02, V02.length))) {
            syncTriggers$room_runtime_release();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void addWeakObserver(Observer observer) {
        AbstractC3292y.i(observer, "observer");
        addObserver(new WeakObserver(this, observer));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> createLiveData(String[] tableNames, Callable<T> computeFunction) {
        AbstractC3292y.i(tableNames, "tableNames");
        AbstractC3292y.i(computeFunction, "computeFunction");
        return createLiveData(tableNames, false, computeFunction);
    }

    public final boolean ensureInitialization$room_runtime_release() {
        if (!this.database.isOpen()) {
            return false;
        }
        if (!this.initialized) {
            this.database.getOpenHelper().getWritableDatabase();
        }
        if (!this.initialized) {
            Log.e(Room.LOG_TAG, "database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    public final SupportSQLiteStatement getCleanupStatement$room_runtime_release() {
        return this.cleanupStatement;
    }

    public final RoomDatabase getDatabase$room_runtime_release() {
        return this.database;
    }

    public final SafeIterableMap<Observer, ObserverWrapper> getObserverMap$room_runtime_release() {
        return this.observerMap;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final AtomicBoolean getPendingRefresh() {
        return this.pendingRefresh;
    }

    public final Map<String, Integer> getTableIdLookup$room_runtime_release() {
        return this.tableIdLookup;
    }

    public final String[] getTablesNames$room_runtime_release() {
        return this.tablesNames;
    }

    public final void internalInit$room_runtime_release(SupportSQLiteDatabase database) {
        AbstractC3292y.i(database, "database");
        synchronized (this.trackerLock) {
            if (this.initialized) {
                Log.e(Room.LOG_TAG, "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.execSQL("PRAGMA temp_store = MEMORY;");
            database.execSQL("PRAGMA recursive_triggers='ON';");
            database.execSQL(CREATE_TRACKING_TABLE_SQL);
            syncTriggers$room_runtime_release(database);
            this.cleanupStatement = database.compileStatement(RESET_UPDATED_TABLES_SQL);
            this.initialized = true;
            I i8 = I.f8786a;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting(otherwise = 3)
    public final void notifyObserversByTableNames(String... tables) {
        AbstractC3292y.i(tables, "tables");
        synchronized (this.observerMap) {
            try {
                Iterator<Map.Entry<K, V>> it = this.observerMap.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    AbstractC3292y.h(entry, "(observer, wrapper)");
                    Observer observer = (Observer) entry.getKey();
                    ObserverWrapper observerWrapper = (ObserverWrapper) entry.getValue();
                    if (!observer.isRemote$room_runtime_release()) {
                        observerWrapper.notifyByTableNames$room_runtime_release(tables);
                    }
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onAutoCloseCallback$room_runtime_release() {
        synchronized (this.trackerLock) {
            this.initialized = false;
            this.observedTableTracker.resetTriggerState();
            I i8 = I.f8786a;
        }
    }

    public void refreshVersionsAsync() {
        if (this.pendingRefresh.compareAndSet(false, true)) {
            AutoCloser autoCloser = this.autoCloser;
            if (autoCloser != null) {
                autoCloser.incrementCountAndEnsureDbIsOpen();
            }
            this.database.getQueryExecutor().execute(this.refreshRunnable);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @WorkerThread
    public void refreshVersionsSync() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            autoCloser.incrementCountAndEnsureDbIsOpen();
        }
        syncTriggers$room_runtime_release();
        this.refreshRunnable.run();
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void removeObserver(Observer observer) {
        ObserverWrapper remove;
        AbstractC3292y.i(observer, "observer");
        synchronized (this.observerMap) {
            remove = this.observerMap.remove(observer);
        }
        if (remove != null) {
            ObservedTableTracker observedTableTracker = this.observedTableTracker;
            int[] tableIds$room_runtime_release = remove.getTableIds$room_runtime_release();
            if (observedTableTracker.onRemoved(Arrays.copyOf(tableIds$room_runtime_release, tableIds$room_runtime_release.length))) {
                syncTriggers$room_runtime_release();
            }
        }
    }

    public final void setAutoCloser$room_runtime_release(AutoCloser autoCloser) {
        AbstractC3292y.i(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.setAutoCloseCallback(new Runnable() { // from class: androidx.room.c
            @Override // java.lang.Runnable
            public final void run() {
                InvalidationTracker.this.onAutoCloseCallback$room_runtime_release();
            }
        });
    }

    public final void setCleanupStatement$room_runtime_release(SupportSQLiteStatement supportSQLiteStatement) {
        this.cleanupStatement = supportSQLiteStatement;
    }

    public final void startMultiInstanceInvalidation$room_runtime_release(Context context, String name, Intent serviceIntent) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationClient = new MultiInstanceInvalidationClient(context, name, serviceIntent, this, this.database.getQueryExecutor());
    }

    public final void stopMultiInstanceInvalidation$room_runtime_release() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
        }
        this.multiInstanceInvalidationClient = null;
    }

    public final void syncTriggers$room_runtime_release(SupportSQLiteDatabase database) {
        AbstractC3292y.i(database, "database");
        if (database.inTransaction()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.database.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.syncTriggersLock) {
                    int[] tablesToSync = this.observedTableTracker.getTablesToSync();
                    if (tablesToSync == null) {
                        return;
                    }
                    Companion.beginTransactionInternal$room_runtime_release(database);
                    try {
                        int length = tablesToSync.length;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < length) {
                            int i10 = tablesToSync[i8];
                            int i11 = i9 + 1;
                            if (i10 == 1) {
                                startTrackingTable(database, i9);
                            } else if (i10 == 2) {
                                stopTrackingTable(database, i9);
                            }
                            i8++;
                            i9 = i11;
                        }
                        database.setTransactionSuccessful();
                        database.endTransaction();
                        I i12 = I.f8786a;
                    } catch (Throwable th) {
                        database.endTransaction();
                        throw th;
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e8) {
            Log.e(Room.LOG_TAG, "Cannot run invalidation tracker. Is the db closed?", e8);
        } catch (IllegalStateException e9) {
            Log.e(Room.LOG_TAG, "Cannot run invalidation tracker. Is the db closed?", e9);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> createLiveData(String[] tableNames, boolean z8, Callable<T> computeFunction) {
        AbstractC3292y.i(tableNames, "tableNames");
        AbstractC3292y.i(computeFunction, "computeFunction");
        return this.invalidationLiveDataContainer.create(validateAndResolveTableNames(tableNames), z8, computeFunction);
    }

    public final void syncTriggers$room_runtime_release() {
        if (this.database.isOpen()) {
            syncTriggers$room_runtime_release(this.database.getOpenHelper().getWritableDatabase());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(RoomDatabase database, String... tableNames) {
        this(database, Q.h(), Q.h(), (String[]) Arrays.copyOf(tableNames, tableNames.length));
        AbstractC3292y.i(database, "database");
        AbstractC3292y.i(tableNames, "tableNames");
    }
}
