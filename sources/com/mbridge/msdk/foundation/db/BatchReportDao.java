package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.foundation.same.report.BatchReportMessage;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes4.dex */
public class BatchReportDao extends a<BatchReportMessage> implements NoProGuard, Serializable {
    private static volatile BatchReportDao instance;
    private final Object lock;

    protected BatchReportDao(g gVar) {
        super(gVar);
        this.lock = new Object();
    }

    public static BatchReportDao getInstance(g gVar) {
        if (instance == null) {
            synchronized (BatchReportDao.class) {
                try {
                    if (instance == null) {
                        instance = new BatchReportDao(gVar);
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public void addReportMessage(String str, int i8) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!com.mbridge.msdk.f.d.a(writableDatabase)) {
            return;
        }
        try {
            synchronized (this.lock) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("report_message", str);
                contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("uuid", UUID.randomUUID().toString().replace("-", ""));
                contentValues.put("report_state", (Integer) 0);
                contentValues.put("type", Integer.valueOf(i8));
                writableDatabase.insert("batch_report", null, contentValues);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void deleteBatchReportMessagesByTimestamp(long j8) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!com.mbridge.msdk.f.d.a(writableDatabase)) {
            return;
        }
        try {
            synchronized (this.lock) {
                writableDatabase.execSQL("delete from batch_report where time <= " + j8);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public ArrayList<BatchReportMessage> getBatchReportMessages(long j8, int i8) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        Cursor cursor = null;
        if (!com.mbridge.msdk.f.d.a(writableDatabase)) {
            return null;
        }
        ArrayList<BatchReportMessage> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM ");
        sb.append("batch_report");
        sb.append(" WHERE ");
        sb.append("time");
        sb.append(" <= ");
        sb.append(j8);
        sb.append(" AND ");
        sb.append("report_state");
        sb.append(" = 0");
        sb.append(" AND ");
        sb.append("type");
        sb.append(" = " + i8);
        sb.append(" ORDER BY ");
        sb.append("time");
        sb.append(" ASC ");
        synchronized (this.lock) {
            try {
                try {
                    Cursor rawQuery = writableDatabase.rawQuery(sb.toString(), null);
                    if (rawQuery != null) {
                        while (rawQuery.moveToNext()) {
                            try {
                                arrayList.add(new BatchReportMessage(rawQuery.getString(rawQuery.getColumnIndex("uuid")), rawQuery.getString(rawQuery.getColumnIndex("report_message")), rawQuery.getLong(rawQuery.getColumnIndex("time"))));
                            } catch (Throwable th) {
                                th = th;
                                cursor = rawQuery;
                                if (cursor != null) {
                                    try {
                                        cursor.close();
                                    } catch (Exception unused) {
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                    if (rawQuery != null) {
                        try {
                            rawQuery.close();
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("report_state", (Integer) 1);
                    writableDatabase.update("batch_report", contentValues, "time <= " + j8, null);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return arrayList;
    }

    public void updateMessagesReportState(ArrayList<BatchReportMessage> arrayList) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (arrayList != null && arrayList.size() != 0 && com.mbridge.msdk.f.d.a(writableDatabase)) {
            Iterator<BatchReportMessage> it = arrayList.iterator();
            while (it.hasNext()) {
                BatchReportMessage next = it.next();
                try {
                    synchronized (this.lock) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("report_state", (Integer) 0);
                        writableDatabase.update("batch_report", contentValues, "uuid = '" + next.getUuid() + "'", null);
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        }
    }

    public static BatchReportDao getInstance(Context context) {
        if (instance == null) {
            synchronized (BatchReportDao.class) {
                try {
                    if (instance == null) {
                        instance = new BatchReportDao(h.a(context));
                    }
                } finally {
                }
            }
        }
        return instance;
    }
}
