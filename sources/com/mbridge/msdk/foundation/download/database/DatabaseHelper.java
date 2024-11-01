package com.mbridge.msdk.foundation.download.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.GlobalComponent;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class DatabaseHelper implements IDatabaseHelper {
    private volatile SQLiteDatabase database;
    private final IDatabaseOpenHelper databaseOpenHelper;
    private final Handler handler;
    private final String tableName = GlobalComponent.getInstance().getDatabaseTableName();

    public DatabaseHelper(Context context, Handler handler, IDatabaseOpenHelper iDatabaseOpenHelper) {
        this.handler = handler;
        this.databaseOpenHelper = iDatabaseOpenHelper;
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void clear() {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.9
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database)) {
                    try {
                        try {
                            if (DatabaseHelper.this.database.isOpen()) {
                                try {
                                    DatabaseHelper.this.database.beginTransaction();
                                    DatabaseHelper.this.database.delete(DatabaseHelper.this.tableName, null, null);
                                    DatabaseHelper.this.database.setTransactionSuccessful();
                                    if (DatabaseHelper.this.database.inTransaction()) {
                                        DatabaseHelper.this.database.endTransaction();
                                    }
                                } catch (Exception e8) {
                                    if (MBridgeConstans.DEBUG) {
                                        e8.printStackTrace();
                                    }
                                    if (DatabaseHelper.this.database.inTransaction()) {
                                        DatabaseHelper.this.database.endTransaction();
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            ad.b(IDatabaseHelper.TAG, th.getMessage());
                        }
                    } catch (Throwable th2) {
                        try {
                            if (DatabaseHelper.this.database.inTransaction()) {
                                DatabaseHelper.this.database.endTransaction();
                            }
                        } catch (Throwable th3) {
                            ad.b(IDatabaseHelper.TAG, th3.getMessage());
                        }
                        throw th2;
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void find(final String str, final String str2, final IDatabaseHelper.IDatabaseListener iDatabaseListener) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.1
            /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r4 = this;
                    java.lang.String r0 = " = '"
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)
                    boolean r1 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r1)
                    if (r1 == 0) goto L1b
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$100(r1)
                    android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$002(r1, r2)
                L1b:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)
                    boolean r1 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r1)
                    r2 = 0
                    if (r1 != 0) goto Lc2
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)
                    boolean r1 = r1.isOpen()
                    if (r1 != 0) goto L36
                    goto Lc2
                L36:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    r1.<init>()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    java.lang.String r3 = "SELECT * FROM "
                    r1.append(r3)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r3 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    java.lang.String r3 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$200(r3)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    r1.append(r3)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    java.lang.String r3 = " WHERE "
                    r1.append(r3)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    java.lang.String r3 = "download_id"
                    r1.append(r3)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    r1.append(r0)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    java.lang.String r3 = r3     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    r1.append(r3)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    java.lang.String r3 = "' AND "
                    r1.append(r3)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    java.lang.String r3 = "director_path"
                    r1.append(r3)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    r1.append(r0)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    java.lang.String r0 = r4     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    r1.append(r0)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    java.lang.String r0 = "'"
                    r1.append(r0)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    android.database.Cursor r0 = r1.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
                    if (r0 == 0) goto L91
                    boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
                    if (r1 == 0) goto L91
                    com.mbridge.msdk.foundation.download.database.DownloadModel r2 = com.mbridge.msdk.foundation.download.database.DownloadModel.create(r0)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
                    goto L91
                L8d:
                    r1 = move-exception
                    goto Lb5
                L8f:
                    r1 = move-exception
                    goto La3
                L91:
                    if (r0 == 0) goto L96
                    r0.close()
                L96:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Lb4
                L9a:
                    r0.onDatabase(r2)
                    goto Lb4
                L9e:
                    r1 = move-exception
                    r0 = r2
                    goto Lb5
                La1:
                    r1 = move-exception
                    r0 = r2
                La3:
                    boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L8d
                    if (r3 == 0) goto Laa
                    r1.printStackTrace()     // Catch: java.lang.Throwable -> L8d
                Laa:
                    if (r0 == 0) goto Laf
                    r0.close()
                Laf:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Lb4
                    goto L9a
                Lb4:
                    return
                Lb5:
                    if (r0 == 0) goto Lba
                    r0.close()
                Lba:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Lc1
                    r0.onDatabase(r2)
                Lc1:
                    throw r1
                Lc2:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
                    if (r0 == 0) goto Lcf
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    r0.onDatabase(r2)
                Lcf:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.database.DatabaseHelper.AnonymousClass1.run():void");
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public List<DownloadModel> findAll() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                if (Objects.isNull(this.database)) {
                    this.database = this.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(this.database) && this.database.isOpen()) {
                    cursor = rawQuery("SELECT * FROM " + this.tableName, null);
                    if (cursor != null) {
                        while (cursor.moveToNext()) {
                            arrayList.add(DownloadModel.create(cursor));
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                }
                return arrayList;
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                }
                return arrayList;
            }
        } catch (Throwable unused) {
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void findByDownloadUrl(final String str, final IDatabaseHelper.IDatabaseListener iDatabaseListener) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.2
            /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r4 = this;
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r0)
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r0)
                    if (r0 == 0) goto L19
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$100(r0)
                    android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$002(r0, r1)
                L19:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r0)
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r0)
                    r1 = 0
                    if (r0 != 0) goto Lb0
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r0)
                    boolean r0 = r0.isOpen()
                    if (r0 != 0) goto L34
                    goto Lb0
                L34:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
                    r0.<init>()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
                    java.lang.String r2 = "SELECT * FROM "
                    r0.append(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
                    java.lang.String r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$200(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
                    r0.append(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
                    java.lang.String r2 = " WHERE "
                    r0.append(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
                    java.lang.String r2 = "download_url"
                    r0.append(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
                    java.lang.String r2 = " = '"
                    r0.append(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
                    java.lang.String r2 = r3     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
                    r0.append(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
                    java.lang.String r2 = "'"
                    r0.append(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
                    java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
                    android.database.Cursor r0 = r2.rawQuery(r0, r1)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
                    if (r0 == 0) goto L7f
                    boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
                    if (r2 == 0) goto L7f
                    com.mbridge.msdk.foundation.download.database.DownloadModel r1 = com.mbridge.msdk.foundation.download.database.DownloadModel.create(r0)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
                    goto L7f
                L7b:
                    r2 = move-exception
                    goto La3
                L7d:
                    r2 = move-exception
                    goto L91
                L7f:
                    if (r0 == 0) goto L84
                    r0.close()
                L84:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto La2
                L88:
                    r0.onDatabase(r1)
                    goto La2
                L8c:
                    r2 = move-exception
                    r0 = r1
                    goto La3
                L8f:
                    r2 = move-exception
                    r0 = r1
                L91:
                    boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L7b
                    if (r3 == 0) goto L98
                    r2.printStackTrace()     // Catch: java.lang.Throwable -> L7b
                L98:
                    if (r0 == 0) goto L9d
                    r0.close()
                L9d:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto La2
                    goto L88
                La2:
                    return
                La3:
                    if (r0 == 0) goto La8
                    r0.close()
                La8:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Laf
                    r0.onDatabase(r1)
                Laf:
                    throw r2
                Lb0:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
                    if (r0 == 0) goto Lbd
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    r0.onDatabase(r1)
                Lbd:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.database.DatabaseHelper.AnonymousClass2.run():void");
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:            if (r1.moveToFirst() != false) goto L19;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:            r0.add(com.mbridge.msdk.foundation.download.database.DownloadModel.create(r1));     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:            if (r1.moveToNext() != false) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:            if (r1 != null) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:            r1.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:            if (r1 != null) goto L22;     */
    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.mbridge.msdk.foundation.download.database.DownloadModel> getUnwantedModels(long r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r5.database     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r2)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            if (r2 == 0) goto L1b
            com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r2 = r5.databaseOpenHelper     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            r5.database = r2     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            goto L1b
        L17:
            r6 = move-exception
            goto L83
        L19:
            r6 = move-exception
            goto L78
        L1b:
            android.database.sqlite.SQLiteDatabase r2 = r5.database     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r2)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            if (r2 != 0) goto L77
            android.database.sqlite.SQLiteDatabase r2 = r5.database     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            boolean r2 = r2.isOpen()     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            if (r2 != 0) goto L2c
            goto L77
        L2c:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            long r2 = r2 - r6
            android.database.sqlite.SQLiteDatabase r6 = r5.database     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            r7.<init>()     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            java.lang.String r4 = "SELECT * FROM "
            r7.append(r4)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            java.lang.String r4 = r5.tableName     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            r7.append(r4)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            java.lang.String r4 = " WHERE "
            r7.append(r4)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            java.lang.String r4 = "last_modified_time"
            r7.append(r4)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            java.lang.String r4 = " <= "
            r7.append(r4)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            r7.append(r2)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            android.database.Cursor r1 = r6.rawQuery(r7, r1)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            if (r1 == 0) goto L71
            boolean r6 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            if (r6 == 0) goto L71
        L64:
            com.mbridge.msdk.foundation.download.database.DownloadModel r6 = com.mbridge.msdk.foundation.download.database.DownloadModel.create(r1)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            r0.add(r6)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            boolean r6 = r1.moveToNext()     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            if (r6 != 0) goto L64
        L71:
            if (r1 == 0) goto L82
        L73:
            r1.close()
            goto L82
        L77:
            return r0
        L78:
            boolean r7 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L17
            if (r7 == 0) goto L7f
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L17
        L7f:
            if (r1 == 0) goto L82
            goto L73
        L82:
            return r0
        L83:
            if (r1 == 0) goto L88
            r1.close()
        L88:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.database.DatabaseHelper.getUnwantedModels(long):java.util.List");
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void insert(final DownloadModel downloadModel) {
        this.handler.postAtFrontOfQueue(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.3
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        try {
                            try {
                                DatabaseHelper.this.database.beginTransaction();
                                DatabaseHelper.this.database.insert(DatabaseHelper.this.tableName, null, DownloadModel.create(downloadModel));
                                DatabaseHelper.this.database.setTransactionSuccessful();
                                if (DatabaseHelper.this.database.inTransaction()) {
                                    DatabaseHelper.this.database.endTransaction();
                                }
                            } catch (Throwable th) {
                                try {
                                    if (DatabaseHelper.this.database.inTransaction()) {
                                        DatabaseHelper.this.database.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    ad.b(IDatabaseHelper.TAG, th2.getMessage());
                                }
                                throw th;
                            }
                        } catch (Exception e8) {
                            if (MBridgeConstans.DEBUG) {
                                e8.printStackTrace();
                            }
                            if (DatabaseHelper.this.database.inTransaction()) {
                                DatabaseHelper.this.database.endTransaction();
                            }
                        }
                    } catch (Throwable th3) {
                        ad.b(IDatabaseHelper.TAG, th3.getMessage());
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public Cursor rawQuery(String str, String[] strArr) {
        try {
            try {
                if (Objects.isNull(this.database)) {
                    this.database = this.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(this.database) && this.database.isOpen()) {
                    this.database.beginTransaction();
                    Cursor rawQuery = this.database.rawQuery(str, strArr);
                    this.database.setTransactionSuccessful();
                    try {
                        if (this.database.inTransaction()) {
                            this.database.endTransaction();
                        }
                    } catch (Throwable th) {
                        if (MBridgeConstans.DEBUG) {
                            th.printStackTrace();
                        }
                    }
                    return rawQuery;
                }
                return null;
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                }
                try {
                    if (this.database.inTransaction()) {
                        this.database.endTransaction();
                    }
                } catch (Throwable th2) {
                    if (MBridgeConstans.DEBUG) {
                        th2.printStackTrace();
                    }
                }
                return null;
            }
        } finally {
            try {
                if (this.database.inTransaction()) {
                    this.database.endTransaction();
                }
            } catch (Throwable th3) {
                if (MBridgeConstans.DEBUG) {
                    th3.printStackTrace();
                }
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void remove(final String str, final String str2) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.6
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        DatabaseHelper.this.database.execSQL("DELETE FROM " + DatabaseHelper.this.tableName + " WHERE " + DownloadModel.DOWNLOAD_ID + " = '" + str + "' AND " + DownloadModel.DIRECTORY_PATH + " = '" + str2 + "'");
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            e8.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void update(final DownloadModel downloadModel, final String str) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.4
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, DownloadModel.create(downloadModel), "download_id = ? AND director_path = ?", new String[]{downloadModel.getDownloadId(), str});
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            e8.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void updateProgress(final String str, final String str2, final DownloadModel downloadModel) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.5
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, DownloadModel.create(downloadModel), "download_id = ? AND director_path = ?", new String[]{str, str2});
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            e8.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void updateUnzipResource(final String str, String str2, long j8) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.8
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(DownloadModel.DOWNLOAD_ID, str);
                        DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, contentValues, "download_id = '" + str + "'", null);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            e8.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void remove(final String str) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.7
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        DatabaseHelper.this.database.execSQL("DELETE FROM " + DatabaseHelper.this.tableName + " WHERE " + DownloadModel.DOWNLOAD_ID + " = '" + str + "'");
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            e8.printStackTrace();
                        }
                    }
                }
            }
        });
    }
}
