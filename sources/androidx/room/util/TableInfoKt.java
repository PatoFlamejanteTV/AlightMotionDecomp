package androidx.room.util;

import R5.AbstractC1435t;
import R5.Q;
import R5.a0;
import a6.AbstractC1677b;
import android.database.Cursor;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class TableInfoKt {
    private static final Map<String, TableInfo.Column> readColumns(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        boolean z8;
        Cursor query = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
        try {
            if (query.getColumnCount() <= 0) {
                Map<String, TableInfo.Column> h8 = Q.h();
                AbstractC1677b.a(query, null);
                return h8;
            }
            int columnIndex = query.getColumnIndex("name");
            int columnIndex2 = query.getColumnIndex("type");
            int columnIndex3 = query.getColumnIndex("notnull");
            int columnIndex4 = query.getColumnIndex("pk");
            int columnIndex5 = query.getColumnIndex("dflt_value");
            Map c8 = Q.c();
            while (query.moveToNext()) {
                String name = query.getString(columnIndex);
                String type = query.getString(columnIndex2);
                if (query.getInt(columnIndex3) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int i8 = query.getInt(columnIndex4);
                String string = query.getString(columnIndex5);
                AbstractC3292y.h(name, "name");
                AbstractC3292y.h(type, "type");
                c8.put(name, new TableInfo.Column(name, type, z8, i8, string, 2));
            }
            Map<String, TableInfo.Column> b9 = Q.b(c8);
            AbstractC1677b.a(query, null);
            return b9;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1677b.a(query, th);
                throw th2;
            }
        }
    }

    private static final List<TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(TypedValues.TransitionType.S_FROM);
        int columnIndex4 = cursor.getColumnIndex(TypedValues.TransitionType.S_TO);
        List c8 = AbstractC1435t.c();
        while (cursor.moveToNext()) {
            int i8 = cursor.getInt(columnIndex);
            int i9 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            AbstractC3292y.h(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            AbstractC3292y.h(string2, "cursor.getString(toColumnIndex)");
            c8.add(new TableInfo.ForeignKeyWithSequence(i8, i9, string, string2));
        }
        return AbstractC1435t.O0(AbstractC1435t.a(c8));
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Cursor query = supportSQLiteDatabase.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = query.getColumnIndex("id");
            int columnIndex2 = query.getColumnIndex("seq");
            int columnIndex3 = query.getColumnIndex("table");
            int columnIndex4 = query.getColumnIndex("on_delete");
            int columnIndex5 = query.getColumnIndex("on_update");
            List<TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings = readForeignKeyFieldMappings(query);
            query.moveToPosition(-1);
            Set b9 = a0.b();
            while (query.moveToNext()) {
                if (query.getInt(columnIndex2) == 0) {
                    int i8 = query.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<TableInfo.ForeignKeyWithSequence> arrayList3 = new ArrayList();
                    for (Object obj : readForeignKeyFieldMappings) {
                        if (((TableInfo.ForeignKeyWithSequence) obj).getId() == i8) {
                            arrayList3.add(obj);
                        }
                    }
                    for (TableInfo.ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    String string = query.getString(columnIndex3);
                    AbstractC3292y.h(string, "cursor.getString(tableColumnIndex)");
                    String string2 = query.getString(columnIndex4);
                    AbstractC3292y.h(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = query.getString(columnIndex5);
                    AbstractC3292y.h(string3, "cursor.getString(onUpdateColumnIndex)");
                    b9.add(new TableInfo.ForeignKey(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set<TableInfo.ForeignKey> a9 = a0.a(b9);
            AbstractC1677b.a(query, null);
            return a9;
        } finally {
        }
    }

    private static final TableInfo.Index readIndex(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z8) {
        String str2;
        Cursor query = supportSQLiteDatabase.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = query.getColumnIndex("seqno");
            int columnIndex2 = query.getColumnIndex("cid");
            int columnIndex3 = query.getColumnIndex("name");
            int columnIndex4 = query.getColumnIndex(CampaignEx.JSON_KEY_DESC);
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (query.moveToNext()) {
                    if (query.getInt(columnIndex2) >= 0) {
                        int i8 = query.getInt(columnIndex);
                        String columnName = query.getString(columnIndex3);
                        if (query.getInt(columnIndex4) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        Integer valueOf = Integer.valueOf(i8);
                        AbstractC3292y.h(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i8), str2);
                    }
                }
                Collection values = treeMap.values();
                AbstractC3292y.h(values, "columnsMap.values");
                List W02 = AbstractC1435t.W0(values);
                Collection values2 = treeMap2.values();
                AbstractC3292y.h(values2, "ordersMap.values");
                TableInfo.Index index = new TableInfo.Index(str, z8, W02, AbstractC1435t.W0(values2));
                AbstractC1677b.a(query, null);
                return index;
            }
            AbstractC1677b.a(query, null);
            return null;
        } finally {
        }
    }

    private static final Set<TableInfo.Index> readIndices(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Cursor query = supportSQLiteDatabase.query("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = query.getColumnIndex("name");
            int columnIndex2 = query.getColumnIndex(TtmlNode.ATTR_TTS_ORIGIN);
            int columnIndex3 = query.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set b9 = a0.b();
                while (query.moveToNext()) {
                    if (AbstractC3292y.d("c", query.getString(columnIndex2))) {
                        String name = query.getString(columnIndex);
                        boolean z8 = true;
                        if (query.getInt(columnIndex3) != 1) {
                            z8 = false;
                        }
                        AbstractC3292y.h(name, "name");
                        TableInfo.Index readIndex = readIndex(supportSQLiteDatabase, name, z8);
                        if (readIndex == null) {
                            AbstractC1677b.a(query, null);
                            return null;
                        }
                        b9.add(readIndex);
                    }
                }
                Set<TableInfo.Index> a9 = a0.a(b9);
                AbstractC1677b.a(query, null);
                return a9;
            }
            AbstractC1677b.a(query, null);
            return null;
        } finally {
        }
    }

    public static final TableInfo readTableInfo(SupportSQLiteDatabase database, String tableName) {
        AbstractC3292y.i(database, "database");
        AbstractC3292y.i(tableName, "tableName");
        return new TableInfo(tableName, readColumns(database, tableName), readForeignKeys(database, tableName), readIndices(database, tableName));
    }
}
