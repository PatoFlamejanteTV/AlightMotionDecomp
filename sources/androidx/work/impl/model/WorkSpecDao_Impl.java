package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import q6.InterfaceC3821f;

/* loaded from: classes3.dex */
public final class WorkSpecDao_Impl implements WorkSpecDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<WorkSpec> __insertionAdapterOfWorkSpec;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfIncrementGeneration;
    private final SharedSQLiteStatement __preparedStmtOfIncrementPeriodCount;
    private final SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount;
    private final SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled;
    private final SharedSQLiteStatement __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast;
    private final SharedSQLiteStatement __preparedStmtOfResetScheduledState;
    private final SharedSQLiteStatement __preparedStmtOfResetWorkSpecNextScheduleTimeOverride;
    private final SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount;
    private final SharedSQLiteStatement __preparedStmtOfSetCancelledState;
    private final SharedSQLiteStatement __preparedStmtOfSetLastEnqueueTime;
    private final SharedSQLiteStatement __preparedStmtOfSetNextScheduleTimeOverride;
    private final SharedSQLiteStatement __preparedStmtOfSetOutput;
    private final SharedSQLiteStatement __preparedStmtOfSetState;
    private final SharedSQLiteStatement __preparedStmtOfSetStopReason;
    private final EntityDeletionOrUpdateAdapter<WorkSpec> __updateAdapterOfWorkSpec;

    public WorkSpecDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfWorkSpec = new EntityInsertionAdapter<WorkSpec>(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkSpec workSpec) {
                String str = workSpec.id;
                if (str == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, str);
                }
                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindLong(2, WorkTypeConverters.stateToInt(workSpec.state));
                String str2 = workSpec.workerClassName;
                if (str2 == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, str2);
                }
                String str3 = workSpec.inputMergerClassName;
                if (str3 == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, str3);
                }
                byte[] byteArrayInternal = Data.toByteArrayInternal(workSpec.input);
                if (byteArrayInternal == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindBlob(5, byteArrayInternal);
                }
                byte[] byteArrayInternal2 = Data.toByteArrayInternal(workSpec.output);
                if (byteArrayInternal2 == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindBlob(6, byteArrayInternal2);
                }
                supportSQLiteStatement.bindLong(7, workSpec.initialDelay);
                supportSQLiteStatement.bindLong(8, workSpec.intervalDuration);
                supportSQLiteStatement.bindLong(9, workSpec.flexDuration);
                supportSQLiteStatement.bindLong(10, workSpec.runAttemptCount);
                supportSQLiteStatement.bindLong(11, WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                supportSQLiteStatement.bindLong(12, workSpec.backoffDelayDuration);
                supportSQLiteStatement.bindLong(13, workSpec.lastEnqueueTime);
                supportSQLiteStatement.bindLong(14, workSpec.minimumRetentionDuration);
                supportSQLiteStatement.bindLong(15, workSpec.scheduleRequestedAt);
                supportSQLiteStatement.bindLong(16, workSpec.expedited ? 1L : 0L);
                supportSQLiteStatement.bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
                supportSQLiteStatement.bindLong(18, workSpec.getPeriodCount());
                supportSQLiteStatement.bindLong(19, workSpec.getGeneration());
                supportSQLiteStatement.bindLong(20, workSpec.getNextScheduleTimeOverride());
                supportSQLiteStatement.bindLong(21, workSpec.getNextScheduleTimeOverrideGeneration());
                supportSQLiteStatement.bindLong(22, workSpec.getStopReason());
                Constraints constraints = workSpec.constraints;
                if (constraints != null) {
                    supportSQLiteStatement.bindLong(23, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                    supportSQLiteStatement.bindLong(24, constraints.requiresCharging() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(25, constraints.requiresDeviceIdle() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(26, constraints.requiresBatteryNotLow() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(27, constraints.requiresStorageNotLow() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(28, constraints.getContentTriggerUpdateDelayMillis());
                    supportSQLiteStatement.bindLong(29, constraints.getContentTriggerMaxDelayMillis());
                    byte[] ofTriggersToByteArray = WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers());
                    if (ofTriggersToByteArray == null) {
                        supportSQLiteStatement.bindNull(30);
                        return;
                    } else {
                        supportSQLiteStatement.bindBlob(30, ofTriggersToByteArray);
                        return;
                    }
                }
                supportSQLiteStatement.bindNull(23);
                supportSQLiteStatement.bindNull(24);
                supportSQLiteStatement.bindNull(25);
                supportSQLiteStatement.bindNull(26);
                supportSQLiteStatement.bindNull(27);
                supportSQLiteStatement.bindNull(28);
                supportSQLiteStatement.bindNull(29);
                supportSQLiteStatement.bindNull(30);
            }
        };
        this.__updateAdapterOfWorkSpec = new EntityDeletionOrUpdateAdapter<WorkSpec>(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkSpec workSpec) {
                String str = workSpec.id;
                if (str == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, str);
                }
                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindLong(2, WorkTypeConverters.stateToInt(workSpec.state));
                String str2 = workSpec.workerClassName;
                if (str2 == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, str2);
                }
                String str3 = workSpec.inputMergerClassName;
                if (str3 == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, str3);
                }
                byte[] byteArrayInternal = Data.toByteArrayInternal(workSpec.input);
                if (byteArrayInternal == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindBlob(5, byteArrayInternal);
                }
                byte[] byteArrayInternal2 = Data.toByteArrayInternal(workSpec.output);
                if (byteArrayInternal2 == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindBlob(6, byteArrayInternal2);
                }
                supportSQLiteStatement.bindLong(7, workSpec.initialDelay);
                supportSQLiteStatement.bindLong(8, workSpec.intervalDuration);
                supportSQLiteStatement.bindLong(9, workSpec.flexDuration);
                supportSQLiteStatement.bindLong(10, workSpec.runAttemptCount);
                supportSQLiteStatement.bindLong(11, WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                supportSQLiteStatement.bindLong(12, workSpec.backoffDelayDuration);
                supportSQLiteStatement.bindLong(13, workSpec.lastEnqueueTime);
                supportSQLiteStatement.bindLong(14, workSpec.minimumRetentionDuration);
                supportSQLiteStatement.bindLong(15, workSpec.scheduleRequestedAt);
                supportSQLiteStatement.bindLong(16, workSpec.expedited ? 1L : 0L);
                supportSQLiteStatement.bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
                supportSQLiteStatement.bindLong(18, workSpec.getPeriodCount());
                supportSQLiteStatement.bindLong(19, workSpec.getGeneration());
                supportSQLiteStatement.bindLong(20, workSpec.getNextScheduleTimeOverride());
                supportSQLiteStatement.bindLong(21, workSpec.getNextScheduleTimeOverrideGeneration());
                supportSQLiteStatement.bindLong(22, workSpec.getStopReason());
                Constraints constraints = workSpec.constraints;
                if (constraints != null) {
                    supportSQLiteStatement.bindLong(23, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                    supportSQLiteStatement.bindLong(24, constraints.requiresCharging() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(25, constraints.requiresDeviceIdle() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(26, constraints.requiresBatteryNotLow() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(27, constraints.requiresStorageNotLow() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(28, constraints.getContentTriggerUpdateDelayMillis());
                    supportSQLiteStatement.bindLong(29, constraints.getContentTriggerMaxDelayMillis());
                    byte[] ofTriggersToByteArray = WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers());
                    if (ofTriggersToByteArray == null) {
                        supportSQLiteStatement.bindNull(30);
                    } else {
                        supportSQLiteStatement.bindBlob(30, ofTriggersToByteArray);
                    }
                } else {
                    supportSQLiteStatement.bindNull(23);
                    supportSQLiteStatement.bindNull(24);
                    supportSQLiteStatement.bindNull(25);
                    supportSQLiteStatement.bindNull(26);
                    supportSQLiteStatement.bindNull(27);
                    supportSQLiteStatement.bindNull(28);
                    supportSQLiteStatement.bindNull(29);
                    supportSQLiteStatement.bindNull(30);
                }
                String str4 = workSpec.id;
                if (str4 == null) {
                    supportSQLiteStatement.bindNull(31);
                } else {
                    supportSQLiteStatement.bindString(31, str4);
                }
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.__preparedStmtOfSetState = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET state=? WHERE id=?";
            }
        };
        this.__preparedStmtOfSetCancelledState = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
            }
        };
        this.__preparedStmtOfIncrementPeriodCount = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.6
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfSetOutput = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.7
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.__preparedStmtOfSetLastEnqueueTime = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.8
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            }
        };
        this.__preparedStmtOfIncrementWorkSpecRunAttemptCount = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.9
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfResetWorkSpecRunAttemptCount = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.10
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.__preparedStmtOfSetNextScheduleTimeOverride = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.11
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
            }
        };
        this.__preparedStmtOfResetWorkSpecNextScheduleTimeOverride = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.12
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
            }
        };
        this.__preparedStmtOfMarkWorkSpecScheduled = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.13
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.__preparedStmtOfResetScheduledState = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.14
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.15
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
        this.__preparedStmtOfIncrementGeneration = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.16
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfSetStopReason = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.17
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET stop_reason=? WHERE id=?";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkProgressAsandroidxWorkData(HashMap<String, ArrayList<Data>> hashMap) {
        byte[] blob;
        int i8;
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap<String, ArrayList<Data>> hashMap2 = new HashMap<>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
            loop0: while (true) {
                i8 = 0;
                for (String str : keySet) {
                    hashMap2.put(str, hashMap.get(str));
                    i8++;
                    if (i8 == 999) {
                        break;
                    }
                }
                __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                hashMap2 = new HashMap<>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
            }
            if (i8 > 0) {
                __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                return;
            }
            return;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i9 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                acquire.bindNull(i9);
            } else {
                acquire.bindString(i9, str2);
            }
            i9++;
        }
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                ArrayList<Data> arrayList = hashMap.get(query.getString(columnIndex));
                if (arrayList != null) {
                    if (query.isNull(0)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(0);
                    }
                    arrayList.add(Data.fromByteArray(blob));
                }
            }
        } finally {
            query.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(HashMap<String, ArrayList<String>> hashMap) {
        String string;
        int i8;
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap<String, ArrayList<String>> hashMap2 = new HashMap<>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
            loop0: while (true) {
                i8 = 0;
                for (String str : keySet) {
                    hashMap2.put(str, hashMap.get(str));
                    i8++;
                    if (i8 == 999) {
                        break;
                    }
                }
                __fetchRelationshipWorkTagAsjavaLangString(hashMap2);
                hashMap2 = new HashMap<>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
            }
            if (i8 > 0) {
                __fetchRelationshipWorkTagAsjavaLangString(hashMap2);
                return;
            }
            return;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i9 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                acquire.bindNull(i9);
            } else {
                acquire.bindString(i9, str2);
            }
            i9++;
        }
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                ArrayList<String> arrayList = hashMap.get(query.getString(columnIndex));
                if (arrayList != null) {
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    arrayList.add(string);
                }
            }
        } finally {
            query.close();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int countNonFinishedContentUriTriggerWorkers() {
        int i8 = 0;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            if (query.moveToFirst()) {
                i8 = query.getInt(0);
            }
            return i8;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void delete(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDelete.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int i8) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        byte[] blob3;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        acquire.bindLong(1, i8);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            int i14 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(columnIndexOrThrow)) {
                    string = null;
                } else {
                    string = query.getString(columnIndexOrThrow);
                }
                WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                if (query.isNull(columnIndexOrThrow3)) {
                    string2 = null;
                } else {
                    string2 = query.getString(columnIndexOrThrow3);
                }
                if (query.isNull(columnIndexOrThrow4)) {
                    string3 = null;
                } else {
                    string3 = query.getString(columnIndexOrThrow4);
                }
                if (query.isNull(columnIndexOrThrow5)) {
                    blob = null;
                } else {
                    blob = query.getBlob(columnIndexOrThrow5);
                }
                Data fromByteArray = Data.fromByteArray(blob);
                if (query.isNull(columnIndexOrThrow6)) {
                    blob2 = null;
                } else {
                    blob2 = query.getBlob(columnIndexOrThrow6);
                }
                Data fromByteArray2 = Data.fromByteArray(blob2);
                long j8 = query.getLong(columnIndexOrThrow7);
                long j9 = query.getLong(columnIndexOrThrow8);
                long j10 = query.getLong(columnIndexOrThrow9);
                int i15 = query.getInt(columnIndexOrThrow10);
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow11));
                long j11 = query.getLong(columnIndexOrThrow12);
                long j12 = query.getLong(columnIndexOrThrow13);
                int i16 = i14;
                long j13 = query.getLong(i16);
                int i17 = columnIndexOrThrow;
                int i18 = columnIndexOrThrow15;
                long j14 = query.getLong(i18);
                columnIndexOrThrow15 = i18;
                int i19 = columnIndexOrThrow16;
                if (query.getInt(i19) != 0) {
                    columnIndexOrThrow16 = i19;
                    i9 = columnIndexOrThrow17;
                    z8 = true;
                } else {
                    columnIndexOrThrow16 = i19;
                    i9 = columnIndexOrThrow17;
                    z8 = false;
                }
                OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i9));
                columnIndexOrThrow17 = i9;
                int i20 = columnIndexOrThrow18;
                int i21 = query.getInt(i20);
                columnIndexOrThrow18 = i20;
                int i22 = columnIndexOrThrow19;
                int i23 = query.getInt(i22);
                columnIndexOrThrow19 = i22;
                int i24 = columnIndexOrThrow20;
                long j15 = query.getLong(i24);
                columnIndexOrThrow20 = i24;
                int i25 = columnIndexOrThrow21;
                int i26 = query.getInt(i25);
                columnIndexOrThrow21 = i25;
                int i27 = columnIndexOrThrow22;
                int i28 = query.getInt(i27);
                columnIndexOrThrow22 = i27;
                int i29 = columnIndexOrThrow23;
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(i29));
                columnIndexOrThrow23 = i29;
                int i30 = columnIndexOrThrow24;
                if (query.getInt(i30) != 0) {
                    columnIndexOrThrow24 = i30;
                    i10 = columnIndexOrThrow25;
                    z9 = true;
                } else {
                    columnIndexOrThrow24 = i30;
                    i10 = columnIndexOrThrow25;
                    z9 = false;
                }
                if (query.getInt(i10) != 0) {
                    columnIndexOrThrow25 = i10;
                    i11 = columnIndexOrThrow26;
                    z10 = true;
                } else {
                    columnIndexOrThrow25 = i10;
                    i11 = columnIndexOrThrow26;
                    z10 = false;
                }
                if (query.getInt(i11) != 0) {
                    columnIndexOrThrow26 = i11;
                    i12 = columnIndexOrThrow27;
                    z11 = true;
                } else {
                    columnIndexOrThrow26 = i11;
                    i12 = columnIndexOrThrow27;
                    z11 = false;
                }
                if (query.getInt(i12) != 0) {
                    columnIndexOrThrow27 = i12;
                    i13 = columnIndexOrThrow28;
                    z12 = true;
                } else {
                    columnIndexOrThrow27 = i12;
                    i13 = columnIndexOrThrow28;
                    z12 = false;
                }
                long j16 = query.getLong(i13);
                columnIndexOrThrow28 = i13;
                int i31 = columnIndexOrThrow29;
                long j17 = query.getLong(i31);
                columnIndexOrThrow29 = i31;
                int i32 = columnIndexOrThrow30;
                if (query.isNull(i32)) {
                    blob3 = null;
                } else {
                    blob3 = query.getBlob(i32);
                }
                Constraints constraints = new Constraints(intToNetworkType, z9, z10, z11, z12, j16, j17, WorkTypeConverters.byteArrayToSetOfTriggers(blob3));
                columnIndexOrThrow30 = i32;
                arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j8, j9, j10, constraints, i15, intToBackoffPolicy, j11, j12, j13, j14, z8, intToOutOfQuotaPolicy, i21, i23, j15, i26, i28));
                columnIndexOrThrow = i17;
                i14 = i16;
            }
            query.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllUnfinishedWork() {
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllWorkSpecIds() {
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<String>> getAllWorkSpecIdsLiveData() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"workspec"}, true, new Callable<List<String>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.18
            protected void finalize() {
                acquire.release();
            }

            @Override // java.util.concurrent.Callable
            public List<String> call() throws Exception {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, false, null);
                    try {
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            arrayList.add(query.isNull(0) ? null : query.getString(0));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        query.close();
                        return arrayList;
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForScheduling(int i8) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        byte[] blob3;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        acquire.bindLong(1, i8);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            int i14 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(columnIndexOrThrow)) {
                    string = null;
                } else {
                    string = query.getString(columnIndexOrThrow);
                }
                WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                if (query.isNull(columnIndexOrThrow3)) {
                    string2 = null;
                } else {
                    string2 = query.getString(columnIndexOrThrow3);
                }
                if (query.isNull(columnIndexOrThrow4)) {
                    string3 = null;
                } else {
                    string3 = query.getString(columnIndexOrThrow4);
                }
                if (query.isNull(columnIndexOrThrow5)) {
                    blob = null;
                } else {
                    blob = query.getBlob(columnIndexOrThrow5);
                }
                Data fromByteArray = Data.fromByteArray(blob);
                if (query.isNull(columnIndexOrThrow6)) {
                    blob2 = null;
                } else {
                    blob2 = query.getBlob(columnIndexOrThrow6);
                }
                Data fromByteArray2 = Data.fromByteArray(blob2);
                long j8 = query.getLong(columnIndexOrThrow7);
                long j9 = query.getLong(columnIndexOrThrow8);
                long j10 = query.getLong(columnIndexOrThrow9);
                int i15 = query.getInt(columnIndexOrThrow10);
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow11));
                long j11 = query.getLong(columnIndexOrThrow12);
                long j12 = query.getLong(columnIndexOrThrow13);
                int i16 = i14;
                long j13 = query.getLong(i16);
                int i17 = columnIndexOrThrow;
                int i18 = columnIndexOrThrow15;
                long j14 = query.getLong(i18);
                columnIndexOrThrow15 = i18;
                int i19 = columnIndexOrThrow16;
                if (query.getInt(i19) != 0) {
                    columnIndexOrThrow16 = i19;
                    i9 = columnIndexOrThrow17;
                    z8 = true;
                } else {
                    columnIndexOrThrow16 = i19;
                    i9 = columnIndexOrThrow17;
                    z8 = false;
                }
                OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i9));
                columnIndexOrThrow17 = i9;
                int i20 = columnIndexOrThrow18;
                int i21 = query.getInt(i20);
                columnIndexOrThrow18 = i20;
                int i22 = columnIndexOrThrow19;
                int i23 = query.getInt(i22);
                columnIndexOrThrow19 = i22;
                int i24 = columnIndexOrThrow20;
                long j15 = query.getLong(i24);
                columnIndexOrThrow20 = i24;
                int i25 = columnIndexOrThrow21;
                int i26 = query.getInt(i25);
                columnIndexOrThrow21 = i25;
                int i27 = columnIndexOrThrow22;
                int i28 = query.getInt(i27);
                columnIndexOrThrow22 = i27;
                int i29 = columnIndexOrThrow23;
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(i29));
                columnIndexOrThrow23 = i29;
                int i30 = columnIndexOrThrow24;
                if (query.getInt(i30) != 0) {
                    columnIndexOrThrow24 = i30;
                    i10 = columnIndexOrThrow25;
                    z9 = true;
                } else {
                    columnIndexOrThrow24 = i30;
                    i10 = columnIndexOrThrow25;
                    z9 = false;
                }
                if (query.getInt(i10) != 0) {
                    columnIndexOrThrow25 = i10;
                    i11 = columnIndexOrThrow26;
                    z10 = true;
                } else {
                    columnIndexOrThrow25 = i10;
                    i11 = columnIndexOrThrow26;
                    z10 = false;
                }
                if (query.getInt(i11) != 0) {
                    columnIndexOrThrow26 = i11;
                    i12 = columnIndexOrThrow27;
                    z11 = true;
                } else {
                    columnIndexOrThrow26 = i11;
                    i12 = columnIndexOrThrow27;
                    z11 = false;
                }
                if (query.getInt(i12) != 0) {
                    columnIndexOrThrow27 = i12;
                    i13 = columnIndexOrThrow28;
                    z12 = true;
                } else {
                    columnIndexOrThrow27 = i12;
                    i13 = columnIndexOrThrow28;
                    z12 = false;
                }
                long j16 = query.getLong(i13);
                columnIndexOrThrow28 = i13;
                int i31 = columnIndexOrThrow29;
                long j17 = query.getLong(i31);
                columnIndexOrThrow29 = i31;
                int i32 = columnIndexOrThrow30;
                if (query.isNull(i32)) {
                    blob3 = null;
                } else {
                    blob3 = query.getBlob(i32);
                }
                Constraints constraints = new Constraints(intToNetworkType, z9, z10, z11, z12, j16, j17, WorkTypeConverters.byteArrayToSetOfTriggers(blob3));
                columnIndexOrThrow30 = i32;
                arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j8, j9, j10, constraints, i15, intToBackoffPolicy, j11, j12, j13, j14, z8, intToOutOfQuotaPolicy, i21, i23, j15, i26, i28));
                columnIndexOrThrow = i17;
                i14 = i16;
            }
            query.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForSchedulingWithContentUris() {
        RoomSQLiteQuery roomSQLiteQuery;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i8;
        boolean z8;
        int i9;
        boolean z9;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        byte[] blob3;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i13 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    if (query.isNull(columnIndexOrThrow3)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(columnIndexOrThrow3);
                    }
                    if (query.isNull(columnIndexOrThrow4)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(columnIndexOrThrow4);
                    }
                    if (query.isNull(columnIndexOrThrow5)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(columnIndexOrThrow5);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    if (query.isNull(columnIndexOrThrow6)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(columnIndexOrThrow6);
                    }
                    Data fromByteArray2 = Data.fromByteArray(blob2);
                    long j8 = query.getLong(columnIndexOrThrow7);
                    long j9 = query.getLong(columnIndexOrThrow8);
                    long j10 = query.getLong(columnIndexOrThrow9);
                    int i14 = query.getInt(columnIndexOrThrow10);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow11));
                    long j11 = query.getLong(columnIndexOrThrow12);
                    long j12 = query.getLong(columnIndexOrThrow13);
                    int i15 = i13;
                    long j13 = query.getLong(i15);
                    int i16 = columnIndexOrThrow;
                    int i17 = columnIndexOrThrow15;
                    long j14 = query.getLong(i17);
                    columnIndexOrThrow15 = i17;
                    int i18 = columnIndexOrThrow16;
                    if (query.getInt(i18) != 0) {
                        columnIndexOrThrow16 = i18;
                        i8 = columnIndexOrThrow17;
                        z8 = true;
                    } else {
                        columnIndexOrThrow16 = i18;
                        i8 = columnIndexOrThrow17;
                        z8 = false;
                    }
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i8));
                    columnIndexOrThrow17 = i8;
                    int i19 = columnIndexOrThrow18;
                    int i20 = query.getInt(i19);
                    columnIndexOrThrow18 = i19;
                    int i21 = columnIndexOrThrow19;
                    int i22 = query.getInt(i21);
                    columnIndexOrThrow19 = i21;
                    int i23 = columnIndexOrThrow20;
                    long j15 = query.getLong(i23);
                    columnIndexOrThrow20 = i23;
                    int i24 = columnIndexOrThrow21;
                    int i25 = query.getInt(i24);
                    columnIndexOrThrow21 = i24;
                    int i26 = columnIndexOrThrow22;
                    int i27 = query.getInt(i26);
                    columnIndexOrThrow22 = i26;
                    int i28 = columnIndexOrThrow23;
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(i28));
                    columnIndexOrThrow23 = i28;
                    int i29 = columnIndexOrThrow24;
                    if (query.getInt(i29) != 0) {
                        columnIndexOrThrow24 = i29;
                        i9 = columnIndexOrThrow25;
                        z9 = true;
                    } else {
                        columnIndexOrThrow24 = i29;
                        i9 = columnIndexOrThrow25;
                        z9 = false;
                    }
                    if (query.getInt(i9) != 0) {
                        columnIndexOrThrow25 = i9;
                        i10 = columnIndexOrThrow26;
                        z10 = true;
                    } else {
                        columnIndexOrThrow25 = i9;
                        i10 = columnIndexOrThrow26;
                        z10 = false;
                    }
                    if (query.getInt(i10) != 0) {
                        columnIndexOrThrow26 = i10;
                        i11 = columnIndexOrThrow27;
                        z11 = true;
                    } else {
                        columnIndexOrThrow26 = i10;
                        i11 = columnIndexOrThrow27;
                        z11 = false;
                    }
                    if (query.getInt(i11) != 0) {
                        columnIndexOrThrow27 = i11;
                        i12 = columnIndexOrThrow28;
                        z12 = true;
                    } else {
                        columnIndexOrThrow27 = i11;
                        i12 = columnIndexOrThrow28;
                        z12 = false;
                    }
                    long j16 = query.getLong(i12);
                    columnIndexOrThrow28 = i12;
                    int i30 = columnIndexOrThrow29;
                    long j17 = query.getLong(i30);
                    columnIndexOrThrow29 = i30;
                    int i31 = columnIndexOrThrow30;
                    if (query.isNull(i31)) {
                        blob3 = null;
                    } else {
                        blob3 = query.getBlob(i31);
                    }
                    Constraints constraints = new Constraints(intToNetworkType, z9, z10, z11, z12, j16, j17, WorkTypeConverters.byteArrayToSetOfTriggers(blob3));
                    columnIndexOrThrow30 = i31;
                    arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j8, j9, j10, constraints, i14, intToBackoffPolicy, j11, j12, j13, j14, z8, intToOutOfQuotaPolicy, i20, i22, j15, i25, i27));
                    columnIndexOrThrow = i16;
                    i13 = i15;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<Data> getInputsFromPrerequisites(String str) {
        byte[] blob;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    blob = null;
                } else {
                    blob = query.getBlob(0);
                }
                arrayList.add(Data.fromByteArray(blob));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRecentlyCompletedWork(long j8) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i8;
        boolean z8;
        int i9;
        boolean z9;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        byte[] blob3;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        acquire.bindLong(1, j8);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            int i13 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(columnIndexOrThrow)) {
                    string = null;
                } else {
                    string = query.getString(columnIndexOrThrow);
                }
                WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                if (query.isNull(columnIndexOrThrow3)) {
                    string2 = null;
                } else {
                    string2 = query.getString(columnIndexOrThrow3);
                }
                if (query.isNull(columnIndexOrThrow4)) {
                    string3 = null;
                } else {
                    string3 = query.getString(columnIndexOrThrow4);
                }
                if (query.isNull(columnIndexOrThrow5)) {
                    blob = null;
                } else {
                    blob = query.getBlob(columnIndexOrThrow5);
                }
                Data fromByteArray = Data.fromByteArray(blob);
                if (query.isNull(columnIndexOrThrow6)) {
                    blob2 = null;
                } else {
                    blob2 = query.getBlob(columnIndexOrThrow6);
                }
                Data fromByteArray2 = Data.fromByteArray(blob2);
                long j9 = query.getLong(columnIndexOrThrow7);
                long j10 = query.getLong(columnIndexOrThrow8);
                long j11 = query.getLong(columnIndexOrThrow9);
                int i14 = query.getInt(columnIndexOrThrow10);
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow11));
                long j12 = query.getLong(columnIndexOrThrow12);
                long j13 = query.getLong(columnIndexOrThrow13);
                int i15 = i13;
                long j14 = query.getLong(i15);
                int i16 = columnIndexOrThrow;
                int i17 = columnIndexOrThrow15;
                long j15 = query.getLong(i17);
                columnIndexOrThrow15 = i17;
                int i18 = columnIndexOrThrow16;
                if (query.getInt(i18) != 0) {
                    columnIndexOrThrow16 = i18;
                    i8 = columnIndexOrThrow17;
                    z8 = true;
                } else {
                    columnIndexOrThrow16 = i18;
                    i8 = columnIndexOrThrow17;
                    z8 = false;
                }
                OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i8));
                columnIndexOrThrow17 = i8;
                int i19 = columnIndexOrThrow18;
                int i20 = query.getInt(i19);
                columnIndexOrThrow18 = i19;
                int i21 = columnIndexOrThrow19;
                int i22 = query.getInt(i21);
                columnIndexOrThrow19 = i21;
                int i23 = columnIndexOrThrow20;
                long j16 = query.getLong(i23);
                columnIndexOrThrow20 = i23;
                int i24 = columnIndexOrThrow21;
                int i25 = query.getInt(i24);
                columnIndexOrThrow21 = i24;
                int i26 = columnIndexOrThrow22;
                int i27 = query.getInt(i26);
                columnIndexOrThrow22 = i26;
                int i28 = columnIndexOrThrow23;
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(i28));
                columnIndexOrThrow23 = i28;
                int i29 = columnIndexOrThrow24;
                if (query.getInt(i29) != 0) {
                    columnIndexOrThrow24 = i29;
                    i9 = columnIndexOrThrow25;
                    z9 = true;
                } else {
                    columnIndexOrThrow24 = i29;
                    i9 = columnIndexOrThrow25;
                    z9 = false;
                }
                if (query.getInt(i9) != 0) {
                    columnIndexOrThrow25 = i9;
                    i10 = columnIndexOrThrow26;
                    z10 = true;
                } else {
                    columnIndexOrThrow25 = i9;
                    i10 = columnIndexOrThrow26;
                    z10 = false;
                }
                if (query.getInt(i10) != 0) {
                    columnIndexOrThrow26 = i10;
                    i11 = columnIndexOrThrow27;
                    z11 = true;
                } else {
                    columnIndexOrThrow26 = i10;
                    i11 = columnIndexOrThrow27;
                    z11 = false;
                }
                if (query.getInt(i11) != 0) {
                    columnIndexOrThrow27 = i11;
                    i12 = columnIndexOrThrow28;
                    z12 = true;
                } else {
                    columnIndexOrThrow27 = i11;
                    i12 = columnIndexOrThrow28;
                    z12 = false;
                }
                long j17 = query.getLong(i12);
                columnIndexOrThrow28 = i12;
                int i30 = columnIndexOrThrow29;
                long j18 = query.getLong(i30);
                columnIndexOrThrow29 = i30;
                int i31 = columnIndexOrThrow30;
                if (query.isNull(i31)) {
                    blob3 = null;
                } else {
                    blob3 = query.getBlob(i31);
                }
                Constraints constraints = new Constraints(intToNetworkType, z9, z10, z11, z12, j17, j18, WorkTypeConverters.byteArrayToSetOfTriggers(blob3));
                columnIndexOrThrow30 = i31;
                arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j9, j10, j11, constraints, i14, intToBackoffPolicy, j12, j13, j14, j15, z8, intToOutOfQuotaPolicy, i20, i22, j16, i25, i27));
                columnIndexOrThrow = i16;
                i13 = i15;
            }
            query.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRunningWork() {
        RoomSQLiteQuery roomSQLiteQuery;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i8;
        boolean z8;
        int i9;
        boolean z9;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        byte[] blob3;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i13 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    if (query.isNull(columnIndexOrThrow3)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(columnIndexOrThrow3);
                    }
                    if (query.isNull(columnIndexOrThrow4)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(columnIndexOrThrow4);
                    }
                    if (query.isNull(columnIndexOrThrow5)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(columnIndexOrThrow5);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    if (query.isNull(columnIndexOrThrow6)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(columnIndexOrThrow6);
                    }
                    Data fromByteArray2 = Data.fromByteArray(blob2);
                    long j8 = query.getLong(columnIndexOrThrow7);
                    long j9 = query.getLong(columnIndexOrThrow8);
                    long j10 = query.getLong(columnIndexOrThrow9);
                    int i14 = query.getInt(columnIndexOrThrow10);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow11));
                    long j11 = query.getLong(columnIndexOrThrow12);
                    long j12 = query.getLong(columnIndexOrThrow13);
                    int i15 = i13;
                    long j13 = query.getLong(i15);
                    int i16 = columnIndexOrThrow;
                    int i17 = columnIndexOrThrow15;
                    long j14 = query.getLong(i17);
                    columnIndexOrThrow15 = i17;
                    int i18 = columnIndexOrThrow16;
                    if (query.getInt(i18) != 0) {
                        columnIndexOrThrow16 = i18;
                        i8 = columnIndexOrThrow17;
                        z8 = true;
                    } else {
                        columnIndexOrThrow16 = i18;
                        i8 = columnIndexOrThrow17;
                        z8 = false;
                    }
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i8));
                    columnIndexOrThrow17 = i8;
                    int i19 = columnIndexOrThrow18;
                    int i20 = query.getInt(i19);
                    columnIndexOrThrow18 = i19;
                    int i21 = columnIndexOrThrow19;
                    int i22 = query.getInt(i21);
                    columnIndexOrThrow19 = i21;
                    int i23 = columnIndexOrThrow20;
                    long j15 = query.getLong(i23);
                    columnIndexOrThrow20 = i23;
                    int i24 = columnIndexOrThrow21;
                    int i25 = query.getInt(i24);
                    columnIndexOrThrow21 = i24;
                    int i26 = columnIndexOrThrow22;
                    int i27 = query.getInt(i26);
                    columnIndexOrThrow22 = i26;
                    int i28 = columnIndexOrThrow23;
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(i28));
                    columnIndexOrThrow23 = i28;
                    int i29 = columnIndexOrThrow24;
                    if (query.getInt(i29) != 0) {
                        columnIndexOrThrow24 = i29;
                        i9 = columnIndexOrThrow25;
                        z9 = true;
                    } else {
                        columnIndexOrThrow24 = i29;
                        i9 = columnIndexOrThrow25;
                        z9 = false;
                    }
                    if (query.getInt(i9) != 0) {
                        columnIndexOrThrow25 = i9;
                        i10 = columnIndexOrThrow26;
                        z10 = true;
                    } else {
                        columnIndexOrThrow25 = i9;
                        i10 = columnIndexOrThrow26;
                        z10 = false;
                    }
                    if (query.getInt(i10) != 0) {
                        columnIndexOrThrow26 = i10;
                        i11 = columnIndexOrThrow27;
                        z11 = true;
                    } else {
                        columnIndexOrThrow26 = i10;
                        i11 = columnIndexOrThrow27;
                        z11 = false;
                    }
                    if (query.getInt(i11) != 0) {
                        columnIndexOrThrow27 = i11;
                        i12 = columnIndexOrThrow28;
                        z12 = true;
                    } else {
                        columnIndexOrThrow27 = i11;
                        i12 = columnIndexOrThrow28;
                        z12 = false;
                    }
                    long j16 = query.getLong(i12);
                    columnIndexOrThrow28 = i12;
                    int i30 = columnIndexOrThrow29;
                    long j17 = query.getLong(i30);
                    columnIndexOrThrow29 = i30;
                    int i31 = columnIndexOrThrow30;
                    if (query.isNull(i31)) {
                        blob3 = null;
                    } else {
                        blob3 = query.getBlob(i31);
                    }
                    Constraints constraints = new Constraints(intToNetworkType, z9, z10, z11, z12, j16, j17, WorkTypeConverters.byteArrayToSetOfTriggers(blob3));
                    columnIndexOrThrow30 = i31;
                    arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j8, j9, j10, constraints, i14, intToBackoffPolicy, j11, j12, j13, j14, z8, intToOutOfQuotaPolicy, i20, i22, j15, i25, i27));
                    columnIndexOrThrow = i16;
                    i13 = i15;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<Long> getScheduleRequestedAtLiveData(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"workspec"}, false, new Callable<Long>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.25
            protected void finalize() {
                acquire.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                Cursor query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, false, null);
                try {
                    Long valueOf = Long.valueOf(query.moveToFirst() ? query.getLong(0) : 0L);
                    query.close();
                    return valueOf;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getScheduledWork() {
        RoomSQLiteQuery roomSQLiteQuery;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i8;
        boolean z8;
        int i9;
        boolean z9;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        byte[] blob3;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i13 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    if (query.isNull(columnIndexOrThrow3)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(columnIndexOrThrow3);
                    }
                    if (query.isNull(columnIndexOrThrow4)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(columnIndexOrThrow4);
                    }
                    if (query.isNull(columnIndexOrThrow5)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(columnIndexOrThrow5);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    if (query.isNull(columnIndexOrThrow6)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(columnIndexOrThrow6);
                    }
                    Data fromByteArray2 = Data.fromByteArray(blob2);
                    long j8 = query.getLong(columnIndexOrThrow7);
                    long j9 = query.getLong(columnIndexOrThrow8);
                    long j10 = query.getLong(columnIndexOrThrow9);
                    int i14 = query.getInt(columnIndexOrThrow10);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow11));
                    long j11 = query.getLong(columnIndexOrThrow12);
                    long j12 = query.getLong(columnIndexOrThrow13);
                    int i15 = i13;
                    long j13 = query.getLong(i15);
                    int i16 = columnIndexOrThrow;
                    int i17 = columnIndexOrThrow15;
                    long j14 = query.getLong(i17);
                    columnIndexOrThrow15 = i17;
                    int i18 = columnIndexOrThrow16;
                    if (query.getInt(i18) != 0) {
                        columnIndexOrThrow16 = i18;
                        i8 = columnIndexOrThrow17;
                        z8 = true;
                    } else {
                        columnIndexOrThrow16 = i18;
                        i8 = columnIndexOrThrow17;
                        z8 = false;
                    }
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i8));
                    columnIndexOrThrow17 = i8;
                    int i19 = columnIndexOrThrow18;
                    int i20 = query.getInt(i19);
                    columnIndexOrThrow18 = i19;
                    int i21 = columnIndexOrThrow19;
                    int i22 = query.getInt(i21);
                    columnIndexOrThrow19 = i21;
                    int i23 = columnIndexOrThrow20;
                    long j15 = query.getLong(i23);
                    columnIndexOrThrow20 = i23;
                    int i24 = columnIndexOrThrow21;
                    int i25 = query.getInt(i24);
                    columnIndexOrThrow21 = i24;
                    int i26 = columnIndexOrThrow22;
                    int i27 = query.getInt(i26);
                    columnIndexOrThrow22 = i26;
                    int i28 = columnIndexOrThrow23;
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(i28));
                    columnIndexOrThrow23 = i28;
                    int i29 = columnIndexOrThrow24;
                    if (query.getInt(i29) != 0) {
                        columnIndexOrThrow24 = i29;
                        i9 = columnIndexOrThrow25;
                        z9 = true;
                    } else {
                        columnIndexOrThrow24 = i29;
                        i9 = columnIndexOrThrow25;
                        z9 = false;
                    }
                    if (query.getInt(i9) != 0) {
                        columnIndexOrThrow25 = i9;
                        i10 = columnIndexOrThrow26;
                        z10 = true;
                    } else {
                        columnIndexOrThrow25 = i9;
                        i10 = columnIndexOrThrow26;
                        z10 = false;
                    }
                    if (query.getInt(i10) != 0) {
                        columnIndexOrThrow26 = i10;
                        i11 = columnIndexOrThrow27;
                        z11 = true;
                    } else {
                        columnIndexOrThrow26 = i10;
                        i11 = columnIndexOrThrow27;
                        z11 = false;
                    }
                    if (query.getInt(i11) != 0) {
                        columnIndexOrThrow27 = i11;
                        i12 = columnIndexOrThrow28;
                        z12 = true;
                    } else {
                        columnIndexOrThrow27 = i11;
                        i12 = columnIndexOrThrow28;
                        z12 = false;
                    }
                    long j16 = query.getLong(i12);
                    columnIndexOrThrow28 = i12;
                    int i30 = columnIndexOrThrow29;
                    long j17 = query.getLong(i30);
                    columnIndexOrThrow29 = i30;
                    int i31 = columnIndexOrThrow30;
                    if (query.isNull(i31)) {
                        blob3 = null;
                    } else {
                        blob3 = query.getBlob(i31);
                    }
                    Constraints constraints = new Constraints(intToNetworkType, z9, z10, z11, z12, j16, j17, WorkTypeConverters.byteArrayToSetOfTriggers(blob3));
                    columnIndexOrThrow30 = i31;
                    arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j8, j9, j10, constraints, i14, intToBackoffPolicy, j11, j12, j13, j14, z8, intToOutOfQuotaPolicy, i20, i22, j15, i25, i27));
                    columnIndexOrThrow = i16;
                    i13 = i15;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkInfo.State getState(String str) {
        Integer valueOf;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        WorkInfo.State state = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            if (query.moveToFirst()) {
                if (query.isNull(0)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(query.getInt(0));
                }
                if (valueOf != null) {
                    WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                    state = WorkTypeConverters.intToState(valueOf.intValue());
                }
            }
            return state;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithName(String str) {
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithTag(String str) {
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec getWorkSpec(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        WorkSpec workSpec;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i8;
        boolean z8;
        int i9;
        boolean z9;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        byte[] blob3;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            if (query.moveToFirst()) {
                if (query.isNull(columnIndexOrThrow)) {
                    string = null;
                } else {
                    string = query.getString(columnIndexOrThrow);
                }
                WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                if (query.isNull(columnIndexOrThrow3)) {
                    string2 = null;
                } else {
                    string2 = query.getString(columnIndexOrThrow3);
                }
                if (query.isNull(columnIndexOrThrow4)) {
                    string3 = null;
                } else {
                    string3 = query.getString(columnIndexOrThrow4);
                }
                if (query.isNull(columnIndexOrThrow5)) {
                    blob = null;
                } else {
                    blob = query.getBlob(columnIndexOrThrow5);
                }
                Data fromByteArray = Data.fromByteArray(blob);
                if (query.isNull(columnIndexOrThrow6)) {
                    blob2 = null;
                } else {
                    blob2 = query.getBlob(columnIndexOrThrow6);
                }
                Data fromByteArray2 = Data.fromByteArray(blob2);
                long j8 = query.getLong(columnIndexOrThrow7);
                long j9 = query.getLong(columnIndexOrThrow8);
                long j10 = query.getLong(columnIndexOrThrow9);
                int i13 = query.getInt(columnIndexOrThrow10);
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow11));
                long j11 = query.getLong(columnIndexOrThrow12);
                long j12 = query.getLong(columnIndexOrThrow13);
                long j13 = query.getLong(columnIndexOrThrow14);
                long j14 = query.getLong(columnIndexOrThrow15);
                if (query.getInt(columnIndexOrThrow16) != 0) {
                    i8 = columnIndexOrThrow17;
                    z8 = true;
                } else {
                    i8 = columnIndexOrThrow17;
                    z8 = false;
                }
                OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i8));
                int i14 = query.getInt(columnIndexOrThrow18);
                int i15 = query.getInt(columnIndexOrThrow19);
                long j15 = query.getLong(columnIndexOrThrow20);
                int i16 = query.getInt(columnIndexOrThrow21);
                int i17 = query.getInt(columnIndexOrThrow22);
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow23));
                if (query.getInt(columnIndexOrThrow24) != 0) {
                    i9 = columnIndexOrThrow25;
                    z9 = true;
                } else {
                    i9 = columnIndexOrThrow25;
                    z9 = false;
                }
                if (query.getInt(i9) != 0) {
                    i10 = columnIndexOrThrow26;
                    z10 = true;
                } else {
                    i10 = columnIndexOrThrow26;
                    z10 = false;
                }
                if (query.getInt(i10) != 0) {
                    i11 = columnIndexOrThrow27;
                    z11 = true;
                } else {
                    i11 = columnIndexOrThrow27;
                    z11 = false;
                }
                if (query.getInt(i11) != 0) {
                    i12 = columnIndexOrThrow28;
                    z12 = true;
                } else {
                    i12 = columnIndexOrThrow28;
                    z12 = false;
                }
                long j16 = query.getLong(i12);
                long j17 = query.getLong(columnIndexOrThrow29);
                if (query.isNull(columnIndexOrThrow30)) {
                    blob3 = null;
                } else {
                    blob3 = query.getBlob(columnIndexOrThrow30);
                }
                workSpec = new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j8, j9, j10, new Constraints(intToNetworkType, z9, z10, z11, z12, j16, j17, WorkTypeConverters.byteArrayToSetOfTriggers(blob3)), i13, intToBackoffPolicy, j11, j12, j13, j14, z8, intToOutOfQuotaPolicy, i14, i15, j15, i16, i17);
            } else {
                workSpec = null;
            }
            query.close();
            roomSQLiteQuery.release();
            return workSpec;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String str) {
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                arrayList.add(new WorkSpec.IdAndState(string, WorkTypeConverters.intToState(query.getInt(1))));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public InterfaceC3821f getWorkStatusPojoFlowDataForIds(List<String> list) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i8 = 1;
        for (String str : list) {
            if (str == null) {
                acquire.bindNull(i8);
            } else {
                acquire.bindString(i8, str);
            }
            i8++;
        }
        return CoroutinesRoom.createFlow(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.20
            protected void finalize() {
                acquire.release();
            }

            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, true, null);
                    try {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        while (query.moveToNext()) {
                            String string = query.getString(0);
                            if (((ArrayList) hashMap.get(string)) == null) {
                                hashMap.put(string, new ArrayList());
                            }
                            String string2 = query.getString(0);
                            if (((ArrayList) hashMap2.get(string2)) == null) {
                                hashMap2.put(string2, new ArrayList());
                            }
                        }
                        query.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            String string3 = query.isNull(0) ? null : query.getString(0);
                            WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                            Data fromByteArray = Data.fromByteArray(query.isNull(2) ? null : query.getBlob(2));
                            int i9 = query.getInt(3);
                            int i10 = query.getInt(4);
                            long j8 = query.getLong(13);
                            long j9 = query.getLong(14);
                            long j10 = query.getLong(15);
                            BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                            long j11 = query.getLong(17);
                            long j12 = query.getLong(18);
                            int i11 = query.getInt(19);
                            long j13 = query.getLong(20);
                            int i12 = query.getInt(21);
                            Constraints constraints = new Constraints(WorkTypeConverters.intToNetworkType(query.getInt(5)), query.getInt(6) != 0, query.getInt(7) != 0, query.getInt(8) != 0, query.getInt(9) != 0, query.getLong(10), query.getLong(11), WorkTypeConverters.byteArrayToSetOfTriggers(query.isNull(12) ? null : query.getBlob(12)));
                            ArrayList arrayList2 = (ArrayList) hashMap.get(query.getString(0));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            ArrayList arrayList3 = arrayList2;
                            ArrayList arrayList4 = (ArrayList) hashMap2.get(query.getString(0));
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j8, j9, j10, constraints, i9, intToBackoffPolicy, j11, j12, i11, i10, j13, i12, arrayList3, arrayList4));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        query.close();
                        return arrayList;
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public InterfaceC3821f getWorkStatusPojoFlowForName(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return CoroutinesRoom.createFlow(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.24
            protected void finalize() {
                acquire.release();
            }

            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, true, null);
                    try {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        while (query.moveToNext()) {
                            String string = query.getString(0);
                            if (((ArrayList) hashMap.get(string)) == null) {
                                hashMap.put(string, new ArrayList());
                            }
                            String string2 = query.getString(0);
                            if (((ArrayList) hashMap2.get(string2)) == null) {
                                hashMap2.put(string2, new ArrayList());
                            }
                        }
                        query.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            String string3 = query.isNull(0) ? null : query.getString(0);
                            WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                            Data fromByteArray = Data.fromByteArray(query.isNull(2) ? null : query.getBlob(2));
                            int i8 = query.getInt(3);
                            int i9 = query.getInt(4);
                            long j8 = query.getLong(13);
                            long j9 = query.getLong(14);
                            long j10 = query.getLong(15);
                            BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                            long j11 = query.getLong(17);
                            long j12 = query.getLong(18);
                            int i10 = query.getInt(19);
                            long j13 = query.getLong(20);
                            int i11 = query.getInt(21);
                            Constraints constraints = new Constraints(WorkTypeConverters.intToNetworkType(query.getInt(5)), query.getInt(6) != 0, query.getInt(7) != 0, query.getInt(8) != 0, query.getInt(9) != 0, query.getLong(10), query.getLong(11), WorkTypeConverters.byteArrayToSetOfTriggers(query.isNull(12) ? null : query.getBlob(12)));
                            ArrayList arrayList2 = (ArrayList) hashMap.get(query.getString(0));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            ArrayList arrayList3 = arrayList2;
                            ArrayList arrayList4 = (ArrayList) hashMap2.get(query.getString(0));
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j8, j9, j10, constraints, i8, intToBackoffPolicy, j11, j12, i10, i9, j13, i11, arrayList3, arrayList4));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        query.close();
                        return arrayList;
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public InterfaceC3821f getWorkStatusPojoFlowForTag(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return CoroutinesRoom.createFlow(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.21
            protected void finalize() {
                acquire.release();
            }

            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, true, null);
                    try {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        while (query.moveToNext()) {
                            String string = query.getString(0);
                            if (((ArrayList) hashMap.get(string)) == null) {
                                hashMap.put(string, new ArrayList());
                            }
                            String string2 = query.getString(0);
                            if (((ArrayList) hashMap2.get(string2)) == null) {
                                hashMap2.put(string2, new ArrayList());
                            }
                        }
                        query.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            String string3 = query.isNull(0) ? null : query.getString(0);
                            WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                            Data fromByteArray = Data.fromByteArray(query.isNull(2) ? null : query.getBlob(2));
                            int i8 = query.getInt(3);
                            int i9 = query.getInt(4);
                            long j8 = query.getLong(13);
                            long j9 = query.getLong(14);
                            long j10 = query.getLong(15);
                            BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                            long j11 = query.getLong(17);
                            long j12 = query.getLong(18);
                            int i10 = query.getInt(19);
                            long j13 = query.getLong(20);
                            int i11 = query.getInt(21);
                            Constraints constraints = new Constraints(WorkTypeConverters.intToNetworkType(query.getInt(5)), query.getInt(6) != 0, query.getInt(7) != 0, query.getInt(8) != 0, query.getInt(9) != 0, query.getLong(10), query.getLong(11), WorkTypeConverters.byteArrayToSetOfTriggers(query.isNull(12) ? null : query.getBlob(12)));
                            ArrayList arrayList2 = (ArrayList) hashMap.get(query.getString(0));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            ArrayList arrayList3 = arrayList2;
                            ArrayList arrayList4 = (ArrayList) hashMap2.get(query.getString(0));
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j8, j9, j10, constraints, i8, intToBackoffPolicy, j11, j12, i10, i9, j13, i11, arrayList3, arrayList4));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        query.close();
                        return arrayList;
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String str) {
        String string;
        byte[] blob;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            WorkSpec.WorkInfoPojo workInfoPojo = null;
            byte[] blob2 = null;
            Cursor query = DBUtil.query(this.__db, acquire, true, null);
            try {
                HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
                HashMap<String, ArrayList<Data>> hashMap2 = new HashMap<>();
                while (query.moveToNext()) {
                    String string2 = query.getString(0);
                    if (hashMap.get(string2) == null) {
                        hashMap.put(string2, new ArrayList<>());
                    }
                    String string3 = query.getString(0);
                    if (hashMap2.get(string3) == null) {
                        hashMap2.put(string3, new ArrayList<>());
                    }
                }
                query.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(hashMap);
                __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                if (query.moveToFirst()) {
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                    if (query.isNull(2)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(2);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    int i8 = query.getInt(3);
                    int i9 = query.getInt(4);
                    long j8 = query.getLong(13);
                    long j9 = query.getLong(14);
                    long j10 = query.getLong(15);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                    long j11 = query.getLong(17);
                    long j12 = query.getLong(18);
                    int i10 = query.getInt(19);
                    long j13 = query.getLong(20);
                    int i11 = query.getInt(21);
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(5));
                    if (query.getInt(6) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (query.getInt(7) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (query.getInt(8) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (query.getInt(9) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    long j14 = query.getLong(10);
                    long j15 = query.getLong(11);
                    if (!query.isNull(12)) {
                        blob2 = query.getBlob(12);
                    }
                    Constraints constraints = new Constraints(intToNetworkType, z8, z9, z10, z11, j14, j15, WorkTypeConverters.byteArrayToSetOfTriggers(blob2));
                    ArrayList<String> arrayList = hashMap.get(query.getString(0));
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<String> arrayList2 = arrayList;
                    ArrayList<Data> arrayList3 = hashMap2.get(query.getString(0));
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    workInfoPojo = new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j8, j9, j10, constraints, i8, intToBackoffPolicy, j11, j12, i10, i9, j13, i11, arrayList2, arrayList3);
                }
                this.__db.setTransactionSuccessful();
                query.close();
                acquire.release();
                return workInfoPojo;
            } catch (Throwable th) {
                query.close();
                acquire.release();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> list) {
        String string;
        byte[] blob;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        byte[] blob2;
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i8 = 1;
        for (String str : list) {
            if (str == null) {
                acquire.bindNull(i8);
            } else {
                acquire.bindString(i8, str);
            }
            i8++;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor query = DBUtil.query(this.__db, acquire, true, null);
            try {
                HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
                HashMap<String, ArrayList<Data>> hashMap2 = new HashMap<>();
                while (query.moveToNext()) {
                    String string2 = query.getString(0);
                    if (hashMap.get(string2) == null) {
                        hashMap.put(string2, new ArrayList<>());
                    }
                    String string3 = query.getString(0);
                    if (hashMap2.get(string3) == null) {
                        hashMap2.put(string3, new ArrayList<>());
                    }
                }
                query.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(hashMap);
                __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                    if (query.isNull(2)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(2);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    int i9 = query.getInt(3);
                    int i10 = query.getInt(4);
                    long j8 = query.getLong(13);
                    long j9 = query.getLong(14);
                    long j10 = query.getLong(15);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                    long j11 = query.getLong(17);
                    long j12 = query.getLong(18);
                    int i11 = query.getInt(19);
                    long j13 = query.getLong(20);
                    int i12 = query.getInt(21);
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(5));
                    if (query.getInt(6) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (query.getInt(7) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (query.getInt(8) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (query.getInt(9) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    long j14 = query.getLong(10);
                    long j15 = query.getLong(11);
                    if (query.isNull(12)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(12);
                    }
                    Constraints constraints = new Constraints(intToNetworkType, z8, z9, z10, z11, j14, j15, WorkTypeConverters.byteArrayToSetOfTriggers(blob2));
                    ArrayList<String> arrayList2 = hashMap.get(query.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList3 = arrayList2;
                    ArrayList<Data> arrayList4 = hashMap2.get(query.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    arrayList.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j8, j9, j10, constraints, i9, intToBackoffPolicy, j11, j12, i11, i10, j13, i12, arrayList3, arrayList4));
                }
                this.__db.setTransactionSuccessful();
                query.close();
                acquire.release();
                return arrayList;
            } catch (Throwable th) {
                query.close();
                acquire.release();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String str) {
        String string;
        byte[] blob;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        byte[] blob2;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor query = DBUtil.query(this.__db, acquire, true, null);
            try {
                HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
                HashMap<String, ArrayList<Data>> hashMap2 = new HashMap<>();
                while (query.moveToNext()) {
                    String string2 = query.getString(0);
                    if (hashMap.get(string2) == null) {
                        hashMap.put(string2, new ArrayList<>());
                    }
                    String string3 = query.getString(0);
                    if (hashMap2.get(string3) == null) {
                        hashMap2.put(string3, new ArrayList<>());
                    }
                }
                query.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(hashMap);
                __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                    if (query.isNull(2)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(2);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    int i8 = query.getInt(3);
                    int i9 = query.getInt(4);
                    long j8 = query.getLong(13);
                    long j9 = query.getLong(14);
                    long j10 = query.getLong(15);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                    long j11 = query.getLong(17);
                    long j12 = query.getLong(18);
                    int i10 = query.getInt(19);
                    long j13 = query.getLong(20);
                    int i11 = query.getInt(21);
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(5));
                    if (query.getInt(6) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (query.getInt(7) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (query.getInt(8) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (query.getInt(9) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    long j14 = query.getLong(10);
                    long j15 = query.getLong(11);
                    if (query.isNull(12)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(12);
                    }
                    Constraints constraints = new Constraints(intToNetworkType, z8, z9, z10, z11, j14, j15, WorkTypeConverters.byteArrayToSetOfTriggers(blob2));
                    ArrayList<String> arrayList2 = hashMap.get(query.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList3 = arrayList2;
                    ArrayList<Data> arrayList4 = hashMap2.get(query.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    arrayList.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j8, j9, j10, constraints, i8, intToBackoffPolicy, j11, j12, i10, i9, j13, i11, arrayList3, arrayList4));
                }
                this.__db.setTransactionSuccessful();
                query.close();
                acquire.release();
                return arrayList;
            } catch (Throwable th) {
                query.close();
                acquire.release();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String str) {
        String string;
        byte[] blob;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        byte[] blob2;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor query = DBUtil.query(this.__db, acquire, true, null);
            try {
                HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
                HashMap<String, ArrayList<Data>> hashMap2 = new HashMap<>();
                while (query.moveToNext()) {
                    String string2 = query.getString(0);
                    if (hashMap.get(string2) == null) {
                        hashMap.put(string2, new ArrayList<>());
                    }
                    String string3 = query.getString(0);
                    if (hashMap2.get(string3) == null) {
                        hashMap2.put(string3, new ArrayList<>());
                    }
                }
                query.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(hashMap);
                __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                    if (query.isNull(2)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(2);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    int i8 = query.getInt(3);
                    int i9 = query.getInt(4);
                    long j8 = query.getLong(13);
                    long j9 = query.getLong(14);
                    long j10 = query.getLong(15);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                    long j11 = query.getLong(17);
                    long j12 = query.getLong(18);
                    int i10 = query.getInt(19);
                    long j13 = query.getLong(20);
                    int i11 = query.getInt(21);
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(5));
                    if (query.getInt(6) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (query.getInt(7) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (query.getInt(8) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (query.getInt(9) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    long j14 = query.getLong(10);
                    long j15 = query.getLong(11);
                    if (query.isNull(12)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(12);
                    }
                    Constraints constraints = new Constraints(intToNetworkType, z8, z9, z10, z11, j14, j15, WorkTypeConverters.byteArrayToSetOfTriggers(blob2));
                    ArrayList<String> arrayList2 = hashMap.get(query.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList3 = arrayList2;
                    ArrayList<Data> arrayList4 = hashMap2.get(query.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    arrayList.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j8, j9, j10, constraints, i8, intToBackoffPolicy, j11, j12, i10, i9, j13, i11, arrayList3, arrayList4));
                }
                this.__db.setTransactionSuccessful();
                query.close();
                acquire.release();
                return arrayList;
            } catch (Throwable th) {
                query.close();
                acquire.release();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(List<String> list) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i8 = 1;
        for (String str : list) {
            if (str == null) {
                acquire.bindNull(i8);
            } else {
                acquire.bindString(i8, str);
            }
            i8++;
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.19
            protected void finalize() {
                acquire.release();
            }

            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, true, null);
                    try {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        while (query.moveToNext()) {
                            String string = query.getString(0);
                            if (((ArrayList) hashMap.get(string)) == null) {
                                hashMap.put(string, new ArrayList());
                            }
                            String string2 = query.getString(0);
                            if (((ArrayList) hashMap2.get(string2)) == null) {
                                hashMap2.put(string2, new ArrayList());
                            }
                        }
                        query.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            String string3 = query.isNull(0) ? null : query.getString(0);
                            WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                            Data fromByteArray = Data.fromByteArray(query.isNull(2) ? null : query.getBlob(2));
                            int i9 = query.getInt(3);
                            int i10 = query.getInt(4);
                            long j8 = query.getLong(13);
                            long j9 = query.getLong(14);
                            long j10 = query.getLong(15);
                            BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                            long j11 = query.getLong(17);
                            long j12 = query.getLong(18);
                            int i11 = query.getInt(19);
                            long j13 = query.getLong(20);
                            int i12 = query.getInt(21);
                            Constraints constraints = new Constraints(WorkTypeConverters.intToNetworkType(query.getInt(5)), query.getInt(6) != 0, query.getInt(7) != 0, query.getInt(8) != 0, query.getInt(9) != 0, query.getLong(10), query.getLong(11), WorkTypeConverters.byteArrayToSetOfTriggers(query.isNull(12) ? null : query.getBlob(12)));
                            ArrayList arrayList2 = (ArrayList) hashMap.get(query.getString(0));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            ArrayList arrayList3 = arrayList2;
                            ArrayList arrayList4 = (ArrayList) hashMap2.get(query.getString(0));
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j8, j9, j10, constraints, i9, intToBackoffPolicy, j11, j12, i11, i10, j13, i12, arrayList3, arrayList4));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        query.close();
                        return arrayList;
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.23
            protected void finalize() {
                acquire.release();
            }

            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, true, null);
                    try {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        while (query.moveToNext()) {
                            String string = query.getString(0);
                            if (((ArrayList) hashMap.get(string)) == null) {
                                hashMap.put(string, new ArrayList());
                            }
                            String string2 = query.getString(0);
                            if (((ArrayList) hashMap2.get(string2)) == null) {
                                hashMap2.put(string2, new ArrayList());
                            }
                        }
                        query.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            String string3 = query.isNull(0) ? null : query.getString(0);
                            WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                            Data fromByteArray = Data.fromByteArray(query.isNull(2) ? null : query.getBlob(2));
                            int i8 = query.getInt(3);
                            int i9 = query.getInt(4);
                            long j8 = query.getLong(13);
                            long j9 = query.getLong(14);
                            long j10 = query.getLong(15);
                            BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                            long j11 = query.getLong(17);
                            long j12 = query.getLong(18);
                            int i10 = query.getInt(19);
                            long j13 = query.getLong(20);
                            int i11 = query.getInt(21);
                            Constraints constraints = new Constraints(WorkTypeConverters.intToNetworkType(query.getInt(5)), query.getInt(6) != 0, query.getInt(7) != 0, query.getInt(8) != 0, query.getInt(9) != 0, query.getLong(10), query.getLong(11), WorkTypeConverters.byteArrayToSetOfTriggers(query.isNull(12) ? null : query.getBlob(12)));
                            ArrayList arrayList2 = (ArrayList) hashMap.get(query.getString(0));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            ArrayList arrayList3 = arrayList2;
                            ArrayList arrayList4 = (ArrayList) hashMap2.get(query.getString(0));
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j8, j9, j10, constraints, i8, intToBackoffPolicy, j11, j12, i10, i9, j13, i11, arrayList3, arrayList4));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        query.close();
                        return arrayList;
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.22
            protected void finalize() {
                acquire.release();
            }

            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, true, null);
                    try {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        while (query.moveToNext()) {
                            String string = query.getString(0);
                            if (((ArrayList) hashMap.get(string)) == null) {
                                hashMap.put(string, new ArrayList());
                            }
                            String string2 = query.getString(0);
                            if (((ArrayList) hashMap2.get(string2)) == null) {
                                hashMap2.put(string2, new ArrayList());
                            }
                        }
                        query.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            String string3 = query.isNull(0) ? null : query.getString(0);
                            WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                            Data fromByteArray = Data.fromByteArray(query.isNull(2) ? null : query.getBlob(2));
                            int i8 = query.getInt(3);
                            int i9 = query.getInt(4);
                            long j8 = query.getLong(13);
                            long j9 = query.getLong(14);
                            long j10 = query.getLong(15);
                            BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                            long j11 = query.getLong(17);
                            long j12 = query.getLong(18);
                            int i10 = query.getInt(19);
                            long j13 = query.getLong(20);
                            int i11 = query.getInt(21);
                            Constraints constraints = new Constraints(WorkTypeConverters.intToNetworkType(query.getInt(5)), query.getInt(6) != 0, query.getInt(7) != 0, query.getInt(8) != 0, query.getInt(9) != 0, query.getLong(10), query.getLong(11), WorkTypeConverters.byteArrayToSetOfTriggers(query.isNull(12) ? null : query.getBlob(12)));
                            ArrayList arrayList2 = (ArrayList) hashMap.get(query.getString(0));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            ArrayList arrayList3 = arrayList2;
                            ArrayList arrayList4 = (ArrayList) hashMap2.get(query.getString(0));
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j8, j9, j10, constraints, i8, intToBackoffPolicy, j11, j12, i10, i9, j13, i11, arrayList3, arrayList4));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        query.close();
                        return arrayList;
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public boolean hasUnfinishedWork() {
        boolean z8 = false;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            if (query.moveToFirst()) {
                if (query.getInt(0) != 0) {
                    z8 = true;
                }
            }
            return z8;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementGeneration(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfIncrementGeneration.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfIncrementGeneration.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementPeriodCount(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfIncrementPeriodCount.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfIncrementPeriodCount.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int incrementWorkSpecRunAttemptCount(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void insertWorkSpec(WorkSpec workSpec) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWorkSpec.insert((EntityInsertionAdapter<WorkSpec>) workSpec);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int markWorkSpecScheduled(String str, long j8) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfMarkWorkSpecScheduled.acquire();
        acquire.bindLong(1, j8);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfMarkWorkSpecScheduled.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.acquire();
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetScheduledState() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfResetScheduledState.acquire();
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfResetScheduledState.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void resetWorkSpecNextScheduleTimeOverride(String str, int i8) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfResetWorkSpecNextScheduleTimeOverride.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        acquire.bindLong(2, i8);
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfResetWorkSpecNextScheduleTimeOverride.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetWorkSpecRunAttemptCount(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfResetWorkSpecRunAttemptCount.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfResetWorkSpecRunAttemptCount.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setCancelledState(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetCancelledState.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetCancelledState.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setLastEnqueueTime(String str, long j8) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetLastEnqueueTime.acquire();
        acquire.bindLong(1, j8);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetLastEnqueueTime.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setNextScheduleTimeOverride(String str, long j8) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetNextScheduleTimeOverride.acquire();
        acquire.bindLong(1, j8);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetNextScheduleTimeOverride.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setOutput(String str, Data data) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetOutput.acquire();
        byte[] byteArrayInternal = Data.toByteArrayInternal(data);
        if (byteArrayInternal == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindBlob(1, byteArrayInternal);
        }
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetOutput.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setState(WorkInfo.State state, String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetState.acquire();
        acquire.bindLong(1, WorkTypeConverters.stateToInt(state));
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetState.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setStopReason(String str, int i8) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetStopReason.acquire();
        acquire.bindLong(1, i8);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetStopReason.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void updateWorkSpec(WorkSpec workSpec) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfWorkSpec.handle(workSpec);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
