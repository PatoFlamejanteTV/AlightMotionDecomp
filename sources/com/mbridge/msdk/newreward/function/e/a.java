package com.mbridge.msdk.newreward.function.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.DatabaseUtils;
import com.mbridge.msdk.newreward.function.common.JSONUtils;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private SQLiteDatabase f22404a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f22405b = new Object();

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f22404a = sQLiteDatabase;
    }

    public final void a(final com.mbridge.msdk.newreward.function.d.a.b bVar) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b(bVar);
            }
        });
    }

    public final void b(int i8, String str, String str2, String str3, boolean z8, String str4, long j8) {
        SQLiteDatabase sQLiteDatabase;
        Cursor query;
        if (!DatabaseUtils.isDatabaseAvailable(this.f22404a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "insert: database is not available");
                return;
            }
            return;
        }
        double d8 = com.mbridge.msdk.newreward.function.h.a.d(str4);
        synchronized (this.f22405b) {
            try {
                try {
                    query = this.f22404a.query("campaign", null, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(i8), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, str3}, null, null, null);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "insert: ", e8);
                    }
                    sQLiteDatabase = this.f22404a;
                }
                if (query != null && query.getCount() > 0) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "insert:  already exist");
                    }
                    DatabaseUtils.closeCursor(query);
                    DatabaseUtils.endTransaction(this.f22404a);
                    return;
                }
                DatabaseUtils.beginTransaction(this.f22404a);
                ContentValues contentValues = new ContentValues();
                contentValues.put("ad_type", Integer.valueOf(i8));
                contentValues.put(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.m().k());
                contentValues.put("placement_id", str);
                contentValues.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                contentValues.put("local_id", str3);
                contentValues.put("state", (Integer) 0);
                contentValues.put("bid_token", str4);
                contentValues.put("invalid_time", Long.valueOf(j8));
                contentValues.put("header_bidding", Integer.valueOf(z8 ? 1 : 0));
                contentValues.put("load_start_time", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("ecppv", Double.valueOf(d8));
                long insert = this.f22404a.insert("campaign", null, contentValues);
                if (MBridgeConstans.DEBUG) {
                    ad.a("CampaignTable", "insert result:  " + insert);
                }
                DatabaseUtils.setTransactionSuccessful(this.f22404a);
                sQLiteDatabase = this.f22404a;
                DatabaseUtils.endTransaction(sQLiteDatabase);
            } catch (Throwable th) {
                DatabaseUtils.endTransaction(this.f22404a);
                throw th;
            }
        }
    }

    public final void c(int i8, String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.f22404a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "clearLoadCheckCampaigns: database is not available");
                return;
            }
            return;
        }
        synchronized (this.f22405b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.f22404a);
                    int delete = this.f22404a.delete("campaign", "ad_type=? and app_id=? and placement_id=? and unit_id=? and state in (0,405,401,404);", new String[]{String.valueOf(i8), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2});
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "clearLoadCheckCampaigns result:  " + delete);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.f22404a);
                    sQLiteDatabase = this.f22404a;
                } catch (Throwable th) {
                    DatabaseUtils.endTransaction(this.f22404a);
                    throw th;
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CampaignTable", "clearLoadCheckCampaigns: ", e8);
                }
                sQLiteDatabase = this.f22404a;
            }
            DatabaseUtils.endTransaction(sQLiteDatabase);
        }
    }

    public final void d(int i8, String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.f22404a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "clearUnInvalidCampaign: database is not available");
                return;
            }
            return;
        }
        synchronized (this.f22405b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.f22404a);
                    int delete = this.f22404a.delete("campaign", a(), new String[]{String.valueOf(i8), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, String.valueOf(System.currentTimeMillis())});
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "clearUnInvalidCampaign result:  " + delete);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.f22404a);
                    sQLiteDatabase = this.f22404a;
                } catch (Throwable th) {
                    DatabaseUtils.endTransaction(this.f22404a);
                    throw th;
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CampaignTable", "clearUnInvalidCampaign: ", e8);
                }
                sQLiteDatabase = this.f22404a;
            }
            DatabaseUtils.endTransaction(sQLiteDatabase);
        }
    }

    public final List<String> e(int i8, String str, String str2) {
        Cursor query;
        Cursor cursor = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.f22404a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "database is not available");
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.f22405b) {
            try {
                try {
                    try {
                        query = this.f22404a.query("campaign", null, a(), new String[]{String.valueOf(i8), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, String.valueOf(System.currentTimeMillis())}, null, null, null, null);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Exception e8) {
                    e = e8;
                }
                if (query != null) {
                    try {
                    } catch (Exception e9) {
                        e = e9;
                        cursor = query;
                        if (MBridgeConstans.DEBUG) {
                            ad.a("CampaignTable", "find: ", e);
                        }
                        DatabaseUtils.closeCursor(cursor);
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        DatabaseUtils.closeCursor(cursor);
                        throw th;
                    }
                    if (query.getCount() > 0) {
                        int columnIndex = query.getColumnIndex("local_id");
                        while (query.moveToNext()) {
                            String string = query.getString(columnIndex);
                            if (!TextUtils.isEmpty(string)) {
                                arrayList.add(string);
                            }
                        }
                        DatabaseUtils.closeCursor(query);
                        return arrayList;
                    }
                }
                DatabaseUtils.closeCursor(query);
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void a(final int i8, final String str, final String str2, final boolean z8, final b bVar) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.3
            @Override // java.lang.Runnable
            public final void run() {
                List<com.mbridge.msdk.newreward.function.d.a.b> a9 = a.this.a(i8, str, str2, z8);
                if (a9 != null && !a9.isEmpty()) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(a9);
                        return;
                    }
                    return;
                }
                b bVar3 = bVar;
                if (bVar3 != null) {
                    bVar3.a();
                }
            }
        });
    }

    public final List<com.mbridge.msdk.newreward.function.d.a.b> a(int i8, String str, String str2, boolean z8) {
        Cursor cursor;
        Cursor cursor2 = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.f22404a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "find: database is not available");
            }
            return null;
        }
        synchronized (this.f22405b) {
            try {
                cursor = this.f22404a.query("campaign", null, "ad_type=? and app_id=? and placement_id=? and unit_id=? and header_bidding=? and state in (401,404,405)", new String[]{String.valueOf(i8), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, String.valueOf(z8 ? 1 : 0)}, null, null, "load_start_time desc");
            } catch (Exception e8) {
                e = e8;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                DatabaseUtils.closeCursor(cursor2);
                throw th;
            }
            try {
                try {
                    List<com.mbridge.msdk.newreward.function.d.a.b> a9 = a(cursor);
                    if (a9 != null) {
                        if (a9.size() == 0) {
                        }
                        DatabaseUtils.closeCursor(cursor);
                        return a9;
                    }
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CampaignTable", "find: mBridgeCampaigns is null or empty");
                    }
                    DatabaseUtils.closeCursor(cursor);
                    return a9;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    DatabaseUtils.closeCursor(cursor2);
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
                if (MBridgeConstans.DEBUG) {
                    ad.a("CampaignTable", "find: ", e);
                }
                DatabaseUtils.closeCursor(cursor);
                return null;
            }
        }
    }

    public final List<com.mbridge.msdk.newreward.function.d.a.b> a(int i8, String str, String str2, boolean z8, int i9) {
        Cursor cursor;
        Cursor cursor2 = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.f22404a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "find: database is not available");
            }
            return null;
        }
        synchronized (this.f22405b) {
            try {
                cursor = this.f22404a.query("campaign", null, "ad_type=? and app_id=? and placement_id=? and unit_id=? and header_bidding=? and state=? and invalid_time>?", new String[]{String.valueOf(i8), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, String.valueOf(z8 ? 1 : 0), String.valueOf(3), String.valueOf(System.currentTimeMillis())}, null, null, "load_start_time desc", String.valueOf(i9 <= 0 ? Integer.MAX_VALUE : i9));
            } catch (Exception e8) {
                e = e8;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                DatabaseUtils.closeCursor(cursor2);
                throw th;
            }
            try {
                try {
                    List<com.mbridge.msdk.newreward.function.d.a.b> a9 = a(cursor);
                    if (a9 != null) {
                        if (a9.size() == 0) {
                        }
                        DatabaseUtils.closeCursor(cursor);
                        return a9;
                    }
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CampaignTable", "find: mBridgeCampaigns is null or empty");
                    }
                    DatabaseUtils.closeCursor(cursor);
                    return a9;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    DatabaseUtils.closeCursor(cursor2);
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
                if (MBridgeConstans.DEBUG) {
                    ad.a("CampaignTable", "find: ", e);
                }
                DatabaseUtils.closeCursor(cursor);
                return null;
            }
        }
    }

    public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        SQLiteDatabase sQLiteDatabase;
        if (bVar == null) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "insert: mBridgeCampaigns is null");
                return;
            }
            return;
        }
        List<com.mbridge.msdk.newreward.function.d.a.a> s8 = bVar.s();
        if (s8 != null && !s8.isEmpty()) {
            if (!DatabaseUtils.isDatabaseAvailable(this.f22404a)) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignTable", "insert: database is not available");
                    return;
                }
                return;
            }
            synchronized (this.f22405b) {
                try {
                    try {
                        DatabaseUtils.beginTransaction(this.f22404a);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("request_id", bVar.d());
                        contentValues.put("session_id", bVar.i());
                        contentValues.put("system_id", bVar.j());
                        contentValues.put("backup_id", bVar.k());
                        contentValues.put("state", Integer.valueOf(bVar.h()));
                        contentValues.put("template", Integer.valueOf(bVar.m()));
                        contentValues.put("invalid_time", Long.valueOf(bVar.n()));
                        contentValues.put("invalid_time_2", Long.valueOf(bVar.o()));
                        contentValues.put("invalid_time_backup", Long.valueOf(bVar.p()));
                        contentValues.put("show_count", Integer.valueOf(bVar.r()));
                        contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_PARENT_SESSION_ID, bVar.l());
                        contentValues.put("token_rule", Integer.valueOf(bVar.E()));
                        contentValues.put(DataSchemeDataSource.SCHEME_DATA, bVar.t().toString());
                        long update = this.f22404a.update("campaign", contentValues, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(bVar.a()), com.mbridge.msdk.foundation.controller.c.m().k(), bVar.b(), bVar.c(), bVar.e()});
                        if (MBridgeConstans.DEBUG) {
                            ad.a("CampaignTable", "updateCampaign result:  " + update);
                        }
                        DatabaseUtils.setTransactionSuccessful(this.f22404a);
                        sQLiteDatabase = this.f22404a;
                    } catch (Throwable th) {
                        DatabaseUtils.endTransaction(this.f22404a);
                        throw th;
                    }
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "updateCampaign: ", e8);
                    }
                    sQLiteDatabase = this.f22404a;
                }
                DatabaseUtils.endTransaction(sQLiteDatabase);
            }
            return;
        }
        if (MBridgeConstans.DEBUG) {
            ad.b("CampaignTable", "insert: campaignList is null or empty");
        }
    }

    private static String a() {
        return "ad_type=? and app_id=? and placement_id=? and unit_id=? and (state in (6,402,406,403,8,7) or invalid_time<? )";
    }

    private static List<com.mbridge.msdk.newreward.function.d.a.b> a(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (cursor2 == null || cursor.getCount() <= 0) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int columnIndex = cursor2.getColumnIndex("ad_type");
            int columnIndex2 = cursor2.getColumnIndex(MBridgeConstans.APP_ID);
            int columnIndex3 = cursor2.getColumnIndex("placement_id");
            int columnIndex4 = cursor2.getColumnIndex(MBridgeConstans.PROPERTIES_UNIT_ID);
            int columnIndex5 = cursor2.getColumnIndex("request_id");
            int columnIndex6 = cursor2.getColumnIndex("local_id");
            int columnIndex7 = cursor2.getColumnIndex("bid_token");
            int columnIndex8 = cursor2.getColumnIndex("header_bidding");
            int columnIndex9 = cursor2.getColumnIndex("load_start_time");
            int columnIndex10 = cursor2.getColumnIndex("backup_id");
            int columnIndex11 = cursor2.getColumnIndex("state");
            int columnIndex12 = cursor2.getColumnIndex("template");
            int columnIndex13 = cursor2.getColumnIndex("invalid_time");
            int columnIndex14 = cursor2.getColumnIndex("invalid_time_2");
            ArrayList arrayList2 = arrayList;
            int columnIndex15 = cursor2.getColumnIndex("invalid_time_backup");
            int columnIndex16 = cursor2.getColumnIndex("ecppv");
            int columnIndex17 = cursor2.getColumnIndex("session_id");
            int i8 = columnIndex14;
            int columnIndex18 = cursor2.getColumnIndex("system_id");
            int i9 = columnIndex13;
            int columnIndex19 = cursor2.getColumnIndex("show_count");
            int columnIndex20 = cursor2.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_PARENT_SESSION_ID);
            int columnIndex21 = cursor2.getColumnIndex(DataSchemeDataSource.SCHEME_DATA);
            int columnIndex22 = cursor2.getColumnIndex("token_rule");
            while (cursor.moveToNext()) {
                int i10 = columnIndex22;
                int i11 = columnIndex;
                int i12 = columnIndex2;
                int i13 = columnIndex3;
                int i14 = columnIndex4;
                com.mbridge.msdk.newreward.function.d.a.b bVar = new com.mbridge.msdk.newreward.function.d.a.b(cursor2.getInt(columnIndex), cursor2.getString(columnIndex2), cursor2.getString(columnIndex3), cursor2.getString(columnIndex4));
                bVar.a(cursor2.getString(columnIndex5));
                bVar.b(cursor2.getString(columnIndex6));
                String string = cursor2.getString(columnIndex7);
                bVar.c(string);
                boolean z8 = true;
                if (cursor2.getInt(columnIndex8) != 1) {
                    z8 = false;
                }
                bVar.a(z8);
                bVar.e(cursor2.getLong(columnIndex9));
                bVar.d(cursor2.getString(columnIndex17));
                bVar.e(cursor2.getString(columnIndex18));
                bVar.f(cursor2.getString(columnIndex10));
                bVar.a(cursor2.getInt(columnIndex11));
                bVar.b(cursor2.getInt(columnIndex12));
                int i15 = columnIndex18;
                int i16 = columnIndex17;
                int i17 = i9;
                bVar.b(cursor2.getLong(i17));
                i9 = i17;
                int i18 = i8;
                bVar.c(cursor2.getLong(i18));
                i8 = i18;
                int i19 = columnIndex15;
                bVar.d(cursor2.getLong(i19));
                columnIndex15 = i19;
                int i20 = columnIndex16;
                bVar.a(cursor2.getDouble(i20));
                int i21 = columnIndex19;
                bVar.c(cursor2.getInt(i21));
                columnIndex16 = i20;
                int i22 = columnIndex20;
                bVar.g(cursor2.getString(i22));
                bVar.i(cursor2.getInt(i10));
                int i23 = columnIndex21;
                JSONObject parse = JSONUtils.parse(cursor2.getString(i23));
                bVar.a(parse);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(bVar);
                CampaignUnit parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(parse, string);
                if (parseCampaignUnit != null) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList<CampaignEx> ads = parseCampaignUnit.getAds();
                    if (ads != null) {
                        for (CampaignEx campaignEx : ads) {
                            int i24 = i23;
                            int i25 = i21;
                            campaignEx.setRequestId(bVar.d());
                            campaignEx.setLocalRequestId(bVar.e());
                            com.mbridge.msdk.newreward.function.d.a.a aVar = new com.mbridge.msdk.newreward.function.d.a.a(bVar);
                            aVar.a(campaignEx);
                            int i26 = i22;
                            aVar.b(campaignEx.getAppName());
                            aVar.c(campaignEx.getRequestIdNotice());
                            aVar.a(campaignEx.getId());
                            arrayList4.add(aVar);
                            bVar.h(campaignEx.getCMPTEntryUrl());
                            bVar.f(campaignEx.getMof_tplid());
                            bVar.h(campaignEx.getVcn());
                            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                            if (rewardTemplateMode != null) {
                                bVar.g(rewardTemplateMode.b());
                            }
                            i21 = i25;
                            i23 = i24;
                            i22 = i26;
                        }
                        columnIndex21 = i23;
                        int i27 = i21;
                        int i28 = i22;
                        bVar.b(ads);
                        bVar.a(arrayList4);
                        cursor2 = cursor;
                        arrayList2 = arrayList3;
                        columnIndex18 = i15;
                        columnIndex17 = i16;
                        columnIndex19 = i27;
                        columnIndex22 = i10;
                        columnIndex = i11;
                        columnIndex2 = i12;
                        columnIndex3 = i13;
                        columnIndex4 = i14;
                        columnIndex20 = i28;
                    }
                }
                cursor2 = cursor;
                arrayList2 = arrayList3;
                columnIndex21 = i23;
                columnIndex20 = i22;
                columnIndex18 = i15;
                columnIndex17 = i16;
                columnIndex22 = i10;
                columnIndex = i11;
                columnIndex3 = i13;
                columnIndex4 = i14;
                columnIndex19 = i21;
                columnIndex2 = i12;
            }
            return arrayList2;
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("CampaignTable", "parseCampaignTable: ", e8);
            }
            return null;
        }
    }

    public final void b(int i8, String str, String str2, String str3, int i9) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.f22404a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "updateState: database is not available");
                return;
            }
            return;
        }
        synchronized (this.f22405b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.f22404a);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", Integer.valueOf(i9));
                    int update = this.f22404a.update("campaign", contentValues, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(i8), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, str3});
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "updateState result:  " + update);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.f22404a);
                    sQLiteDatabase = this.f22404a;
                } catch (Throwable th) {
                    DatabaseUtils.endTransaction(this.f22404a);
                    throw th;
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CampaignTable", "updateState: ", e8);
                }
                sQLiteDatabase = this.f22404a;
            }
            DatabaseUtils.endTransaction(sQLiteDatabase);
        }
    }

    public final void b(final int i8, final String str, final String str2) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.7
            @Override // java.lang.Runnable
            public final void run() {
                a.this.c(i8, str, str2);
            }
        });
    }

    public final void a(final int i8, final String str, final String str2, final String str3, final boolean z8, final String str4, final long j8) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b(i8, str, str2, str3, z8, str4, j8);
            }
        });
    }

    public final void a(final int i8, final String str, final String str2, final boolean z8, final int i9, final b bVar) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.4
            @Override // java.lang.Runnable
            public final void run() {
                List<com.mbridge.msdk.newreward.function.d.a.b> a9 = a.this.a(i8, str, str2, z8, i9);
                if (a9 != null && a9.size() != 0) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(a9);
                        return;
                    }
                    return;
                }
                b bVar3 = bVar;
                if (bVar3 != null) {
                    bVar3.a();
                }
            }
        });
    }

    public final void a(final int i8, final String str, final String str2, final String str3, final int i9) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.5
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b(i8, str, str2, str3, i9);
            }
        });
    }

    public final void a(final int i8, final String str, final String str2) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.6
            @Override // java.lang.Runnable
            public final void run() {
                a.this.d(i8, str, str2);
            }
        });
    }
}
