package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.AabEntity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.out.Campaign;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class f extends a<Campaign> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20420a = "com.mbridge.msdk.foundation.db.f";

    /* renamed from: b, reason: collision with root package name */
    private static f f20421b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20422c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20423d;

    /* renamed from: e, reason: collision with root package name */
    private final String f20424e;

    /* renamed from: f, reason: collision with root package name */
    private final String f20425f;

    /* renamed from: g, reason: collision with root package name */
    private final String f20426g;

    /* renamed from: h, reason: collision with root package name */
    private final String f20427h;

    /* renamed from: i, reason: collision with root package name */
    private final String f20428i;

    /* renamed from: j, reason: collision with root package name */
    private final String f20429j;

    /* renamed from: k, reason: collision with root package name */
    private final String f20430k;

    /* renamed from: l, reason: collision with root package name */
    private final String f20431l;

    /* renamed from: m, reason: collision with root package name */
    private final String f20432m;

    /* renamed from: n, reason: collision with root package name */
    private final String f20433n;

    /* renamed from: o, reason: collision with root package name */
    private final String f20434o;

    /* renamed from: p, reason: collision with root package name */
    private final String f20435p;

    /* renamed from: q, reason: collision with root package name */
    private final String f20436q;

    /* renamed from: r, reason: collision with root package name */
    private final String f20437r;

    /* renamed from: s, reason: collision with root package name */
    private final String f20438s;

    private f(g gVar) {
        super(gVar);
        this.f20422c = "rid";
        this.f20423d = "lrid";
        this.f20424e = "cid";
        this.f20425f = CampaignEx.JSON_KEY_PLCT;
        this.f20426g = CampaignEx.JSON_KEY_PLCTB;
        this.f20427h = CampaignEx.JSON_KEY_TIMESTAMP;
        this.f20428i = "ridCount";
        this.f20429j = " WHERE ";
        this.f20430k = " AND ";
        this.f20431l = "SELECT ";
        this.f20432m = "*";
        this.f20433n = " FROM ";
        this.f20434o = " AND readyState = '0'";
        this.f20435p = " AND is_bid_campaign = 1";
        this.f20436q = " order by ts ASC";
        this.f20437r = " group by request_id";
        this.f20438s = " group by bid_token";
    }

    public static synchronized f a(g gVar) {
        f fVar;
        synchronized (f.class) {
            try {
                if (f20421b == null) {
                    f20421b = new f(gVar);
                }
                fVar = f20421b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x06ec, code lost:            return null;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x06e8, code lost:            if (r10 != null) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x06ce, code lost:            if (r10 != null) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x06d0, code lost:            r10.close();     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> g(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 1781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.f.g(java.lang.String):java.util.List");
    }

    public final synchronized void b(String str, List<CampaignEx> list) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("readyState", (Integer) 0);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update("campaign", contentValues, "unitid = '" + str + "' AND id = '" + campaignEx.getId() + "' AND request_id = '" + campaignEx.getRequestId() + "'", null);
                        }
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("CampaignDao", e8.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public final synchronized void c(String str) {
        String str2;
        try {
            str2 = "unitid = " + str;
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e8.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", str2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0131, code lost:            if (r1 != null) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0133, code lost:            r1.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014a, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0147, code lost:            if (0 != 0) goto L28;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.mbridge.msdk.foundation.entity.c> d(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.f.d(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:            if (0 == 0) goto L32;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> e(java.lang.String r5) {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto Lc
            return r0
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT "
            r1.append(r2)
            java.lang.String r2 = "local_request_id"
            r1.append(r2)
            java.lang.String r2 = " as "
            r1.append(r2)
            java.lang.String r2 = "lrid"
            r1.append(r2)
            java.lang.String r2 = " FROM "
            r1.append(r2)
            java.lang.String r2 = "campaign"
            r1.append(r2)
            java.lang.String r2 = " WHERE "
            r1.append(r2)
            java.lang.String r2 = "unitid"
            r1.append(r2)
            java.lang.String r2 = " = '"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "' AND "
            r1.append(r5)
            java.lang.String r5 = "readyState"
            r1.append(r5)
            java.lang.String r5 = " = "
            r1.append(r5)
            r5 = 2
            r1.append(r5)
            r5 = 0
            java.lang.Object r2 = new java.lang.Object     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            r2.<init>()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            android.database.sqlite.SQLiteDatabase r3 = r4.getReadableDatabase()     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L95
            android.database.Cursor r5 = r3.rawQuery(r1, r5)     // Catch: java.lang.Throwable -> L95
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L95
            if (r5 == 0) goto L8f
            int r1 = r5.getCount()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            if (r1 <= 0) goto L8f
        L70:
            boolean r1 = r5.moveToNext()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            if (r1 == 0) goto L8f
            java.lang.String r1 = "lrid"
            int r1 = r5.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            if (r2 == 0) goto L87
            goto L70
        L87:
            r0.add(r1)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            goto L70
        L8b:
            r0 = move-exception
            goto La5
        L8d:
            r1 = move-exception
            goto L98
        L8f:
            if (r5 == 0) goto La4
        L91:
            r5.close()
            goto La4
        L95:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L95
            throw r1     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
        L98:
            java.lang.String r2 = "CampaignDao"
            java.lang.String r1 = r1.getLocalizedMessage()     // Catch: java.lang.Throwable -> L8b
            com.mbridge.msdk.foundation.tools.ad.b(r2, r1)     // Catch: java.lang.Throwable -> L8b
            if (r5 == 0) goto La4
            goto L91
        La4:
            return r0
        La5:
            if (r5 == 0) goto Laa
            r5.close()
        Laa:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.f.e(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0111, code lost:            if (r1 != null) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0113, code lost:            r1.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012a, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0127, code lost:            if (0 != 0) goto L26;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.entity.c> f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.f.f(java.lang.String):j$.util.concurrent.ConcurrentHashMap");
    }

    public final synchronized void a(String str, int i8, int i9) {
        String str2;
        try {
            str2 = "unitid = " + str + " AND level = " + i8 + " AND adSource = " + i9;
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e8.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", str2, null);
    }

    public final int c(String str, String str2) {
        String str3;
        if (!TextUtils.isEmpty(str)) {
            str3 = "unitid = '" + str2 + "' AND request_id = '" + str + "' AND is_bid_campaign = 1";
        } else {
            str3 = "unitid = '" + str2 + "' AND is_bid_campaign = 1";
        }
        String str4 = str3 + " AND readyState = '0'";
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            return getWritableDatabase().update("campaign", contentValues, str4, null);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e8.getLocalizedMessage());
            }
            return 0;
        }
    }

    public final synchronized void a(String str, int i8, int i9, boolean z8) {
        String str2;
        try {
            str2 = ("unitid = " + str + " AND level = " + i8 + " AND adSource = " + i9) + " AND is_bid_campaign = " + (z8 ? 1 : 0);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e8.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", str2, null);
    }

    public final synchronized List<CampaignEx> b(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM campaign WHERE unitid = '" + str + "' AND readyState = 2", null);
            if (rawQuery == null || rawQuery.getCount() <= 0) {
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                arrayList.add(a(rawQuery));
            }
            rawQuery.close();
            return arrayList;
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e8.getLocalizedMessage());
            }
            return null;
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", th.getLocalizedMessage());
            }
            return null;
        }
    }

    public final synchronized void a(String str, List<CampaignEx> list) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("readyState", (Integer) 2);
                    String str2 = ("id = '" + campaignEx.getId() + "' AND unitid = " + str + " AND request_id = '" + campaignEx.getRequestId() + "'") + " AND is_bid_campaign = " + (campaignEx.isBidCampaign() ? 1 : 0);
                    try {
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update("campaign", contentValues, str2, null);
                        }
                    } catch (SQLException e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("CampaignDao", e8.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public final synchronized void e(String str, String str2) {
        try {
            try {
            } catch (Exception e8) {
                ad.b("CampaignDao", e8.getLocalizedMessage());
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String str3 = "";
            if (!TextUtils.isEmpty(str)) {
                str3 = "unitid = '" + str + "' AND ";
            }
            String str4 = str3 + "n_local_request_id = '" + str2 + "' AND bid_token IS NOT NULL AND n_local_request_id IS NOT NULL";
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            getWritableDatabase().update("campaign", contentValues, str4, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(String str, String str2) {
        try {
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e8.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        String str3 = "id = '" + str + "' AND request_id = '" + str2 + "'";
        ContentValues contentValues = new ContentValues();
        contentValues.put("readyState", (Integer) 2);
        getWritableDatabase().update("campaign", contentValues, str3, null);
    }

    public final synchronized void a(String str, CampaignEx campaignEx, boolean z8, String str2) {
        try {
            try {
                StringBuilder sb = new StringBuilder();
                if (campaignEx == null && !TextUtils.isEmpty(str2)) {
                    sb.append("unitid");
                    sb.append(" = '");
                    sb.append(str);
                    sb.append("' AND ");
                    sb.append("request_id");
                    sb.append(" = '");
                    sb.append(str2);
                    sb.append("'");
                } else if (campaignEx != null && campaignEx.getLoadTimeoutState() == 0) {
                    sb.append("unitid");
                    sb.append(" = '");
                    sb.append(str);
                    sb.append("' AND ");
                    sb.append("id");
                    sb.append(" = '");
                    sb.append(campaignEx.getId());
                    sb.append("' AND ");
                    sb.append("request_id");
                    sb.append(" = '");
                    sb.append(campaignEx.getRequestId());
                    sb.append("'");
                }
                if (!TextUtils.isEmpty(sb)) {
                    if (af.a().a("c_n_c_s", true)) {
                        sb.append(" AND readyState");
                        sb.append(" != 0");
                    }
                    if (z8) {
                        sb.append(" AND is_bid_campaign = 1");
                    } else {
                        sb.append(" AND is_bid_campaign = 0");
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("readyState", (Integer) 2);
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    if (writableDatabase != null) {
                        writableDatabase.update("campaign", contentValues, sb.toString(), null);
                    }
                }
            } catch (SQLException e8) {
                ad.b("CampaignDao", e8.getLocalizedMessage());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(long j8, String str) {
        try {
            String str2 = "ts<" + (System.currentTimeMillis() - j8) + " and unitid=?";
            String[] strArr = {str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("campaign", str2, strArr);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e8.getLocalizedMessage());
            }
        }
    }

    public final synchronized void d(String str, String str2) {
        try {
            try {
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignDao", e8.getLocalizedMessage());
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String str3 = "unitid = '" + str + "'";
            if (!TextUtils.isEmpty(str2)) {
                str3 = str3 + " AND bid_token != '" + str2 + "'";
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            getWritableDatabase().update("campaign", contentValues, (str3 + " AND is_bid_campaign = 1") + " AND bid_token IS NOT NULL", null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(String str, String str2) {
        try {
        } catch (Exception e8) {
            ad.b("CampaignDao", e8.getLocalizedMessage());
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            String str3 = "unitid = '" + str + "' AND bid_token = '" + str2 + "' AND bid_token IS NOT NULL";
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            getWritableDatabase().update("campaign", contentValues, str3, null);
        }
    }

    public final synchronized void b(final List<CampaignEx> list, final String str) {
        if (list != null) {
            if (list.size() != 0) {
                new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.db.f.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            f.this.a((CampaignEx) it.next(), str, 0);
                        }
                    }
                }).start();
            }
        }
    }

    public final synchronized void a(String str, List<CampaignEx> list, boolean z8) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    a(str, campaignEx, z8, campaignEx.getRequestId());
                }
            }
        }
    }

    public final synchronized List<CampaignEx> b(String str, int i8, int i9, int i10) {
        String str2;
        String str3;
        try {
            str2 = " WHERE unitid = '" + str + "' AND level = " + i9 + " AND adSource = " + i10;
            str3 = "";
            if (i8 > 0) {
                str3 = " LIMIT " + i8;
            }
        } catch (Throwable th) {
            throw th;
        }
        return g("SELECT * FROM campaign" + str2 + str3);
    }

    public final synchronized void a(String str, List<CampaignEx> list, String str2, int i8) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0 && !TextUtils.isEmpty(str2)) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            try {
                for (CampaignEx campaignEx : list) {
                    if (campaignEx != null) {
                        String str3 = "unitid = '" + str + "' AND id = '" + campaignEx.getId() + "' AND request_id = '" + campaignEx.getRequestId() + "'";
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(str2, Integer.valueOf(i8));
                        writableDatabase.update("campaign", contentValues, str3, null);
                    }
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignDao", e8.getLocalizedMessage());
                }
            }
        }
    }

    public final List<CampaignEx> b(String str, int i8, boolean z8) {
        ArrayList arrayList;
        String str2;
        Cursor cursor = null;
        r0 = null;
        ArrayList arrayList2 = null;
        cursor = null;
        try {
            try {
                if (z8) {
                    str2 = "placement_id = " + str + " AND ad_type = " + i8;
                } else {
                    str2 = "ad_type = " + i8;
                }
                Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM campaign WHERE " + str2, null);
                if (rawQuery != null) {
                    try {
                        try {
                            if (rawQuery.getCount() > 0) {
                                arrayList = new ArrayList();
                                while (rawQuery.moveToNext()) {
                                    try {
                                        arrayList.add(a(rawQuery));
                                    } catch (Exception e8) {
                                        cursor = rawQuery;
                                        e = e8;
                                        ad.b("CampaignDao", e.getLocalizedMessage());
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        return arrayList;
                                    }
                                }
                                arrayList2 = arrayList;
                            }
                        } catch (Throwable th) {
                            cursor = rawQuery;
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (Exception e9) {
                        cursor = rawQuery;
                        e = e9;
                        arrayList = null;
                    }
                }
                if (rawQuery == null) {
                    return arrayList2;
                }
                rawQuery.close();
                return arrayList2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
            arrayList = null;
        }
    }

    public final synchronized void a(String str, List<CampaignEx> list, List<CampaignEx> list2, boolean z8) {
        if (getWritableDatabase() == null) {
            return;
        }
        try {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        for (CampaignEx campaignEx : list) {
                            try {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("readyState", (Integer) 0);
                                String str2 = "unitid = '" + str + "' AND id = '" + campaignEx.getId() + "' AND request_id = '" + campaignEx.getRequestId() + "'";
                                getWritableDatabase().update("campaign", contentValues, z8 ? str2 + " AND is_bid_campaign = 1" : str2 + " AND is_bid_campaign = 0", null);
                            } catch (Exception e8) {
                                if (MBridgeConstans.DEBUG) {
                                    ad.b("CampaignDao", e8.getLocalizedMessage());
                                }
                            }
                        }
                    }
                } catch (Exception e9) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CampaignDao", e9.getLocalizedMessage());
                    }
                }
            }
            if (list2 != null && list2.size() > 0) {
                for (CampaignEx campaignEx2 : list2) {
                    try {
                        if (campaignEx2.getLoadTimeoutState() == 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("unitid");
                            sb.append(" = '");
                            sb.append(str);
                            sb.append("' AND ");
                            sb.append("id");
                            sb.append(" = '");
                            sb.append(campaignEx2.getId());
                            sb.append("' AND ");
                            sb.append("request_id");
                            sb.append(" = '");
                            sb.append(campaignEx2.getRequestId());
                            sb.append("'");
                            if (z8) {
                                sb.append(" AND is_bid_campaign = 1");
                            } else {
                                sb.append(" AND is_bid_campaign = 0");
                            }
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("readyState", (Integer) 2);
                            getWritableDatabase().update("campaign", contentValues2, sb.toString(), null);
                        }
                    } catch (SQLException e10) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("CampaignDao", e10.getLocalizedMessage());
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(String str, List<CampaignEx> list, String str2) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("local_request_id", str2);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update("campaign", contentValues, "unitid = '" + str + "' AND id = '" + campaignEx.getId() + "' AND request_id = '" + campaignEx.getRequestId() + "'", null);
                        }
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("CampaignDao", e8.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public final synchronized void a(String str, String str2) {
        String str3;
        try {
            str3 = "id = '" + str + "' AND unitid = " + str2;
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e8.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", str3, null);
    }

    public final synchronized void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("campaign", "unitid = '" + str + "' AND readyState = 2", null);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e8.getLocalizedMessage());
            }
        }
    }

    public final synchronized void a(List<CampaignEx> list, String str) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("readyState", (Integer) 2);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update("campaign", contentValues, "unitid = '" + str + "' AND id = '" + campaignEx.getId() + "' AND request_id = '" + campaignEx.getRequestId() + "'", null);
                        }
                    } catch (SQLException e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("CampaignDao", e8.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public final synchronized void a(String str, String str2, boolean z8, String str3) {
        String sb;
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("id = '");
                sb2.append(str);
                sb2.append("' AND ");
                sb2.append("unitid");
                sb2.append(" = ");
                sb2.append(str2);
                sb2.append(" AND ");
                sb2.append("is_bid_campaign");
                sb2.append(" = ");
                sb2.append(z8 ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
                sb2.append(" AND ");
                sb2.append("request_id");
                sb2.append(" = '");
                sb2.append(str3);
                sb2.append("'");
                sb = sb2.toString();
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignDao", e8.getLocalizedMessage());
                }
            }
            if (getWritableDatabase() == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            getWritableDatabase().update("campaign", contentValues, sb, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(String str, String str2, int i8, int i9, boolean z8) {
        String str3;
        try {
            try {
                String str4 = "id = '" + str + "' AND unitid = " + str2 + " AND level = " + i8 + " AND adSource = " + i9;
                if (z8) {
                    str3 = str4 + " AND is_bid_campaign = 1";
                } else {
                    str3 = str4 + " AND is_bid_campaign = 0";
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignDao", e8.getLocalizedMessage());
                }
            }
            if (getWritableDatabase() == null) {
                return;
            }
            getWritableDatabase().delete("campaign", str3, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(String str, int i8, boolean z8) {
        String str2;
        try {
            try {
                if (z8) {
                    str2 = "placement_id = " + str + " AND ad_type = " + i8;
                } else {
                    str2 = "ad_type = " + i8;
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignDao", e8.getLocalizedMessage());
                }
            }
            if (getWritableDatabase() == null) {
                return;
            }
            getWritableDatabase().delete("campaign", str2, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        try {
            String str = "ts<" + (System.currentTimeMillis() - 3600000) + " AND " + CampaignEx.JSON_KEY_ST_TS + ">0";
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("campaign", str, null);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e8.getLocalizedMessage());
            }
        }
    }

    public final synchronized void a(long j8, String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = "(plctb>0 and (plctb* 1000+ts)<" + currentTimeMillis + ") or (" + CampaignEx.JSON_KEY_PLCTB + "<=0 and " + CampaignEx.JSON_KEY_ST_TS + "<" + (currentTimeMillis - j8) + ") and unitid=?";
            String[] strArr = {str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("campaign", str2, strArr);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e8.getLocalizedMessage());
            }
        }
    }

    public final synchronized void a(List<CampaignEx> list, String str, String str2, int i8) {
        if (list != null) {
            if (list.size() != 0) {
                if (getWritableDatabase() == null) {
                    return;
                }
                Iterator<CampaignEx> it = list.iterator();
                while (it.hasNext()) {
                    a(it.next(), str, str2, i8);
                }
            }
        }
    }

    private synchronized long a(CampaignEx campaignEx, String str, String str2, int i8) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                if (campaignEx.getPv_urls() != null && campaignEx.getPv_urls().size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<String> it = campaignEx.getPv_urls().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                    contentValues.put("pv_urls", jSONArray.toString());
                }
                contentValues.put("id", campaignEx.getId());
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                contentValues.put("placement_id", str);
                contentValues.put("unitid", str2);
                contentValues.put("tab", Integer.valueOf(campaignEx.getTab()));
                contentValues.put(CampaignEx.JSON_KEY_PACKAGE_NAME, campaignEx.getPackageName());
                contentValues.put("app_name", campaignEx.getAppName());
                contentValues.put("app_desc", campaignEx.getAppDesc());
                contentValues.put(CampaignEx.JSON_KEY_APP_SIZE, campaignEx.getSize());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
                contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, campaignEx.getImageUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
                contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
                contentValues.put(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK, Integer.valueOf(campaignEx.getWtick()));
                contentValues.put("deeplink_url", campaignEx.getDeepLinkURL());
                contentValues.put(CampaignEx.JSON_KEY_USER_ACTIVATION, Boolean.toString(campaignEx.getUserActivation()));
                contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(campaignEx.getTimestamp()));
                contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
                contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
                contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
                contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
                contentValues.put("star", Double.valueOf(campaignEx.getRating()));
                contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
                contentValues.put("level", Integer.valueOf(campaignEx.getCacheLevel()));
                contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
                contentValues.put("ad_call", campaignEx.getAdCall());
                contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
                contentValues.put("fc_b", Integer.valueOf(campaignEx.getFcb()));
                contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_URL, campaignEx.getVideoUrlEncode());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Integer.valueOf(campaignEx.getVideoSize()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_LENGTHL, Integer.valueOf(campaignEx.getVideoLength()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, campaignEx.getVideoResolution());
                contentValues.put(CampaignEx.JSON_KEY_ENDCARD_CLICK, Integer.valueOf(campaignEx.getEndcard_click_result()));
                contentValues.put(CampaignEx.JSON_KEY_WATCH_MILE, Integer.valueOf(campaignEx.getWatchMile()));
                contentValues.put("advImp", campaignEx.getAdvImp());
                contentValues.put("bty", Integer.valueOf(campaignEx.getBty()));
                contentValues.put(CampaignEx.JSON_KEY_T_IMP, Integer.valueOf(campaignEx.getTImp()));
                contentValues.put(CampaignEx.JSON_KEY_GUIDELINES, campaignEx.getGuidelines());
                contentValues.put(CampaignEx.JSON_KEY_OFFER_TYPE, Integer.valueOf(campaignEx.getOfferType()));
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL, campaignEx.getHtmlUrl());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_END_SCREEN_URL, campaignEx.getEndScreenUrl());
                contentValues.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, Integer.valueOf(campaignEx.getRewardAmount()));
                contentValues.put(CampaignEx.JSON_KEY_REWARD_NAME, campaignEx.getRewardName());
                contentValues.put("reward_play_status", Integer.valueOf(campaignEx.getRewardPlayStatus()));
                contentValues.put("retarget", Integer.valueOf(campaignEx.getRetarget_offer()));
                contentValues.put("native_ad_tracking", campaignEx.getNativeVideoTrackingString());
                contentValues.put(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO, Integer.valueOf(campaignEx.getPlayable_ads_without_video()));
                contentValues.put(CampaignEx.ENDCARD_URL, campaignEx.getendcard_url());
                contentValues.put(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
                contentValues.put(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5, campaignEx.getVideoMD5Value());
                contentValues.put(CampaignEx.JSON_KEY_NV_T2, Integer.valueOf(campaignEx.getNvT2()));
                contentValues.put(CampaignEx.JSON_KEY_GIF_URL, campaignEx.getGifUrl());
                if (campaignEx.getRewardTemplateMode() != null) {
                    contentValues.put("reward_teamplate", campaignEx.getRewardTemplateMode().d());
                }
                contentValues.put("c_coi", Integer.valueOf(campaignEx.getClickTimeOutInterval()));
                contentValues.put(CampaignEx.JSON_KEY_C_UA, Integer.valueOf(campaignEx.getcUA()));
                contentValues.put(CampaignEx.JSON_KEY_IMP_UA, Integer.valueOf(campaignEx.getImpUA()));
                contentValues.put(CampaignEx.JSON_KEY_JM_PD, Integer.valueOf(campaignEx.getJmPd()));
                contentValues.put("is_deleted", Integer.valueOf(campaignEx.getIsDeleted()));
                contentValues.put("is_click", Integer.valueOf(campaignEx.getIsClick()));
                contentValues.put("is_add_sucesful", Integer.valueOf(campaignEx.getIsAddSuccesful()));
                contentValues.put("short_ctime", String.valueOf(System.currentTimeMillis()));
                contentValues.put("ia_icon", campaignEx.getKeyIaIcon());
                contentValues.put("ia_url", campaignEx.getKeyIaUrl());
                contentValues.put("ia_rst", Integer.valueOf(campaignEx.getKeyIaRst()));
                contentValues.put("ia_ori", Integer.valueOf(campaignEx.getKeyIaOri()));
                contentValues.put("ad_type", Integer.valueOf(campaignEx.getAdType()));
                contentValues.put(CampaignEx.KEY_IA_EXT1, campaignEx.getIa_ext1());
                contentValues.put(CampaignEx.KEY_IA_EXT2, campaignEx.getIa_ext2());
                contentValues.put(CampaignEx.KEY_IS_DOWNLOAD, Integer.valueOf(campaignEx.getIsDownLoadZip()));
                contentValues.put(CampaignEx.KEY_IA_CACHE, campaignEx.getInteractiveCache());
                contentValues.put(CampaignEx.KEY_OC_TIME, Integer.valueOf(campaignEx.getOc_time()));
                contentValues.put(CampaignEx.KEY_OC_TYPE, Integer.valueOf(campaignEx.getOc_type()));
                contentValues.put(CampaignEx.KEY_T_LIST, campaignEx.getT_list());
                CampaignEx.a adchoice = campaignEx.getAdchoice();
                if (adchoice != null) {
                    contentValues.put(CampaignEx.KEY_ADCHOICE, adchoice.a());
                    contentValues.put("adchoice_size_height", Integer.valueOf(adchoice.e()));
                    contentValues.put("adchoice_size_width", Integer.valueOf(adchoice.f()));
                }
                contentValues.put(CampaignEx.JSON_KEY_PLCT, Long.valueOf(campaignEx.getPlct()));
                contentValues.put(CampaignEx.JSON_KEY_PLCTB, Long.valueOf(campaignEx.getPlctb()));
                contentValues.put(CampaignEx.JSON_KEY_C_C_TIME, Long.valueOf(campaignEx.getCandidateCacheTime()));
                contentValues.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getAdHtml());
                contentValues.put("ad_zip", campaignEx.getAdZip());
                contentValues.put(CampaignEx.JSON_KEY_BANNER_URL, campaignEx.getBannerUrl());
                contentValues.put(CampaignEx.JSON_KEY_BANNER_HTML, campaignEx.getBannerHtml());
                contentValues.put(CampaignEx.JSON_KEY_CREATIVE_ID, Long.valueOf(campaignEx.getCreativeId()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID, Long.valueOf(campaignEx.getVidCrtvId()));
                contentValues.put(CampaignEx.JSON_KEY_EC_CREATIVE_ID, Long.valueOf(campaignEx.getEcCrtvId()));
                contentValues.put(CampaignEx.JSON_KEY_EC_TEMP_ID, Long.valueOf(campaignEx.getEcTemplateId()));
                contentValues.put("is_bid_campaign", Boolean.valueOf(campaignEx.isBidCampaign()));
                contentValues.put("bid_token", campaignEx.getBidToken());
                contentValues.put(CampaignEx.JSON_KEY_MRAID, campaignEx.getMraid());
                contentValues.put("is_mraid_campaign", Boolean.valueOf(campaignEx.isMraid()));
                contentValues.put(CampaignEx.KEY_OMID, campaignEx.getOmid());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TPLID, Integer.valueOf(campaignEx.getMof_tplid()));
                contentValues.put(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(campaignEx.getReady_rate()));
                contentValues.put(CampaignEx.JSON_KEY_EXT_DATA, campaignEx.getExt_data());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_NSCPT, Integer.valueOf(campaignEx.getNscpt()));
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TEMPLATE_URL, campaignEx.getMof_template_url());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_REQ_EXT_DATA, campaignEx.getReq_ext_data());
                contentValues.put("readyState", Integer.valueOf(campaignEx.getReadyState()));
                contentValues.put("request_id", campaignEx.getRequestId());
                contentValues.put("n_request_id", campaignEx.getNRid());
                contentValues.put("local_request_id", campaignEx.getLocalRequestId());
                contentValues.put("n_local_request_id", campaignEx.getNLRid());
                contentValues.put("err_type_default_ad", Integer.valueOf(campaignEx.getTyped()));
                contentValues.put("err_reason_default_ad", campaignEx.getReasond());
                contentValues.put("load_timeout", Integer.valueOf(campaignEx.getLoadTimeoutState()));
                contentValues.put(CampaignEx.JSON_KEY_MAITVE, Integer.valueOf(campaignEx.getMaitve()));
                contentValues.put(CampaignEx.JSON_KEY_MAITVESRC, campaignEx.getMaitve_src());
                contentValues.put(CampaignEx.JSON_KEY_FLB, Integer.valueOf(campaignEx.getFlb()));
                contentValues.put(CampaignEx.JSON_KEY_FLB_SKIP_TIME, Integer.valueOf(campaignEx.getFlbSkipTime()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD, Integer.valueOf(campaignEx.getCbd()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, Integer.valueOf(campaignEx.getVst()));
                contentValues.put(CampaignEx.JSON_KEY_USE_SKIP_TIME, Integer.valueOf(campaignEx.getUseSkipTime()));
                contentValues.put(CampaignEx.JSON_KEY_PROG_BAR, Integer.valueOf(campaignEx.getProgressBarShow()));
                contentValues.put("vcn", Integer.valueOf(campaignEx.getVcn()));
                contentValues.put("token_r", Integer.valueOf(campaignEx.getTokenRule()));
                contentValues.put("encrypt_p", campaignEx.getEncryptPrice());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE, Integer.valueOf(campaignEx.getVideoCheckType()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE, Integer.valueOf(campaignEx.getVideoCtnType()));
                contentValues.put(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE, campaignEx.getRsIgnoreCheckRuleString());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME, Integer.valueOf(campaignEx.getVideoCompleteTime()));
                contentValues.put(CampaignEx.JSON_KEY_TP_OFFER, Integer.valueOf(campaignEx.getTpOffer()));
                contentValues.put(CampaignEx.JSON_KEY_FAC, Integer.valueOf(campaignEx.getFac()));
                if (campaignEx.getAabEntity() != null) {
                    contentValues.put(CampaignEx.JSON_KEY_AAB, campaignEx.getAabEntity().toJson().toString());
                }
                contentValues.put(CampaignEx.JSON_KEY_PRIVACY_URL, campaignEx.getPrivacyUrl());
                contentValues.put("privacy_button_video", Integer.valueOf(campaignEx.getPrivacyButtonTemplateVisibility()));
                contentValues.put(CampaignEx.JSON_KEY_IMP_REPORT_TYPE, Integer.valueOf(campaignEx.getImpReportType()));
                contentValues.put("auto_minicard", Integer.valueOf(campaignEx.getAutoShowStoreMiniCard()));
                contentValues.put("mincard_trigger_time", Integer.valueOf(campaignEx.getShowStoreMiniCardDelayTime()));
                return getWritableDatabase().insert("campaign", null, contentValues);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignDao", e8.getLocalizedMessage());
                }
                return -1L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long a(CampaignEx campaignEx, String str, int i8) {
        String str2;
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", campaignEx.getId());
                if (campaignEx.getPv_urls() != null && campaignEx.getPv_urls().size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<String> it = campaignEx.getPv_urls().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                    contentValues.put("pv_urls", jSONArray.toString());
                }
                contentValues.put("unitid", str);
                contentValues.put("request_id", campaignEx.getRequestId());
                contentValues.put("n_request_id", campaignEx.getNRid());
                contentValues.put("local_request_id", campaignEx.getLocalRequestId());
                contentValues.put("n_local_request_id", campaignEx.getNLRid());
                contentValues.put("err_type_default_ad", Integer.valueOf(campaignEx.getTyped()));
                contentValues.put("err_reason_default_ad", campaignEx.getReasond());
                contentValues.put("tab", Integer.valueOf(campaignEx.getTab()));
                contentValues.put(CampaignEx.JSON_KEY_PACKAGE_NAME, campaignEx.getPackageName());
                contentValues.put("app_name", campaignEx.getAppName());
                contentValues.put("app_desc", campaignEx.getAppDesc());
                contentValues.put(CampaignEx.JSON_KEY_APP_SIZE, campaignEx.getSize());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
                contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, campaignEx.getImageUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
                contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
                contentValues.put(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK, Integer.valueOf(campaignEx.getWtick()));
                contentValues.put("deeplink_url", campaignEx.getDeepLinkURL());
                contentValues.put(CampaignEx.JSON_KEY_USER_ACTIVATION, Boolean.toString(campaignEx.getUserActivation()));
                contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(campaignEx.getTimestamp()));
                contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
                contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
                contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
                contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
                contentValues.put("star", Double.valueOf(campaignEx.getRating()));
                contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
                contentValues.put("level", Integer.valueOf(campaignEx.getCacheLevel()));
                contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
                contentValues.put("ad_call", campaignEx.getAdCall());
                contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
                contentValues.put("fc_b", Integer.valueOf(campaignEx.getFcb()));
                contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_URL, campaignEx.getVideoUrlEncode());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Integer.valueOf(campaignEx.getVideoSize()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_LENGTHL, Integer.valueOf(campaignEx.getVideoLength()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, campaignEx.getVideoResolution());
                contentValues.put(CampaignEx.JSON_KEY_ENDCARD_CLICK, Integer.valueOf(campaignEx.getEndcard_click_result()));
                contentValues.put(CampaignEx.JSON_KEY_WATCH_MILE, Integer.valueOf(campaignEx.getWatchMile()));
                contentValues.put("advImp", campaignEx.getAdvImp());
                contentValues.put("bty", Integer.valueOf(campaignEx.getBty()));
                contentValues.put(CampaignEx.JSON_KEY_T_IMP, Integer.valueOf(campaignEx.getTImp()));
                contentValues.put(CampaignEx.JSON_KEY_GUIDELINES, campaignEx.getGuidelines());
                contentValues.put(CampaignEx.JSON_KEY_OFFER_TYPE, Integer.valueOf(campaignEx.getOfferType()));
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL, campaignEx.getHtmlUrl());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_END_SCREEN_URL, campaignEx.getEndScreenUrl());
                contentValues.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, Integer.valueOf(campaignEx.getRewardAmount()));
                contentValues.put(CampaignEx.JSON_KEY_REWARD_NAME, campaignEx.getRewardName());
                contentValues.put("reward_play_status", Integer.valueOf(campaignEx.getRewardPlayStatus()));
                contentValues.put("retarget", Integer.valueOf(campaignEx.getRetarget_offer()));
                contentValues.put("native_ad_tracking", campaignEx.getNativeVideoTrackingString());
                contentValues.put(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO, Integer.valueOf(campaignEx.getPlayable_ads_without_video()));
                contentValues.put(CampaignEx.ENDCARD_URL, campaignEx.getendcard_url());
                contentValues.put(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
                contentValues.put(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5, campaignEx.getVideoMD5Value());
                contentValues.put(CampaignEx.JSON_KEY_NV_T2, Integer.valueOf(campaignEx.getNvT2()));
                contentValues.put(CampaignEx.JSON_KEY_GIF_URL, campaignEx.getGifUrl());
                if (campaignEx.getRewardTemplateMode() != null) {
                    contentValues.put("reward_teamplate", campaignEx.getRewardTemplateMode().d());
                }
                contentValues.put("c_coi", Integer.valueOf(campaignEx.getClickTimeOutInterval()));
                contentValues.put(CampaignEx.JSON_KEY_C_UA, Integer.valueOf(campaignEx.getcUA()));
                contentValues.put(CampaignEx.JSON_KEY_IMP_UA, Integer.valueOf(campaignEx.getImpUA()));
                contentValues.put(CampaignEx.JSON_KEY_JM_PD, Integer.valueOf(campaignEx.getJmPd()));
                contentValues.put("is_deleted", Integer.valueOf(campaignEx.getIsDeleted()));
                contentValues.put("is_click", Integer.valueOf(campaignEx.getIsClick()));
                contentValues.put("is_add_sucesful", Integer.valueOf(campaignEx.getIsAddSuccesful()));
                contentValues.put("short_ctime", String.valueOf(System.currentTimeMillis()));
                contentValues.put("ia_icon", campaignEx.getKeyIaIcon());
                contentValues.put("ia_url", campaignEx.getKeyIaUrl());
                contentValues.put("ia_rst", Integer.valueOf(campaignEx.getKeyIaRst()));
                contentValues.put("ia_ori", Integer.valueOf(campaignEx.getKeyIaOri()));
                contentValues.put("ad_type", Integer.valueOf(campaignEx.getAdType()));
                contentValues.put(CampaignEx.KEY_IA_EXT1, campaignEx.getIa_ext1());
                contentValues.put(CampaignEx.KEY_IA_EXT2, campaignEx.getIa_ext2());
                contentValues.put(CampaignEx.KEY_IS_DOWNLOAD, Integer.valueOf(campaignEx.getIsDownLoadZip()));
                contentValues.put(CampaignEx.KEY_IA_CACHE, campaignEx.getInteractiveCache());
                contentValues.put(CampaignEx.KEY_OC_TIME, Integer.valueOf(campaignEx.getOc_time()));
                contentValues.put(CampaignEx.KEY_OC_TYPE, Integer.valueOf(campaignEx.getOc_type()));
                contentValues.put(CampaignEx.KEY_T_LIST, campaignEx.getT_list());
                CampaignEx.a adchoice = campaignEx.getAdchoice();
                if (adchoice != null) {
                    contentValues.put(CampaignEx.KEY_ADCHOICE, adchoice.a());
                    contentValues.put("adchoice_size_height", Integer.valueOf(adchoice.e()));
                    contentValues.put("adchoice_size_width", Integer.valueOf(adchoice.f()));
                }
                contentValues.put(CampaignEx.JSON_KEY_PLCT, Long.valueOf(campaignEx.getPlct()));
                contentValues.put(CampaignEx.JSON_KEY_PLCTB, Long.valueOf(campaignEx.getPlctb()));
                contentValues.put(CampaignEx.JSON_KEY_C_C_TIME, Long.valueOf(campaignEx.getCandidateCacheTime()));
                contentValues.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getAdHtml());
                contentValues.put("ad_zip", campaignEx.getAdZip());
                contentValues.put(CampaignEx.JSON_KEY_BANNER_URL, campaignEx.getBannerUrl());
                contentValues.put(CampaignEx.JSON_KEY_BANNER_HTML, campaignEx.getBannerHtml());
                contentValues.put(CampaignEx.JSON_KEY_CREATIVE_ID, Long.valueOf(campaignEx.getCreativeId()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID, Long.valueOf(campaignEx.getVidCrtvId()));
                contentValues.put(CampaignEx.JSON_KEY_EC_CREATIVE_ID, Long.valueOf(campaignEx.getEcCrtvId()));
                contentValues.put(CampaignEx.JSON_KEY_EC_TEMP_ID, Long.valueOf(campaignEx.getEcTemplateId()));
                contentValues.put("is_bid_campaign", Boolean.valueOf(campaignEx.isBidCampaign()));
                contentValues.put("bid_token", campaignEx.getBidToken());
                contentValues.put(CampaignEx.JSON_KEY_MRAID, campaignEx.getMraid());
                contentValues.put("is_mraid_campaign", Boolean.valueOf(campaignEx.isMraid()));
                contentValues.put(CampaignEx.KEY_OMID, campaignEx.getOmid());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TPLID, Integer.valueOf(campaignEx.getMof_tplid()));
                contentValues.put(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(campaignEx.getReady_rate()));
                contentValues.put(CampaignEx.JSON_KEY_EXT_DATA, campaignEx.getExt_data());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_NSCPT, Integer.valueOf(campaignEx.getNscpt()));
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TEMPLATE_URL, campaignEx.getMof_template_url());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_REQ_EXT_DATA, campaignEx.getReq_ext_data());
                contentValues.put("readyState", Integer.valueOf(campaignEx.getReadyState()));
                contentValues.put("load_timeout", Integer.valueOf(campaignEx.getLoadTimeoutState()));
                contentValues.put("placement_id", campaignEx.getPlacementId());
                contentValues.put(CampaignEx.JSON_KEY_MAITVE, Integer.valueOf(campaignEx.getMaitve()));
                contentValues.put(CampaignEx.JSON_KEY_MAITVESRC, campaignEx.getMaitve_src());
                contentValues.put(CampaignEx.JSON_KEY_FLB, Integer.valueOf(campaignEx.getFlb()));
                contentValues.put(CampaignEx.JSON_KEY_FLB_SKIP_TIME, Integer.valueOf(campaignEx.getFlbSkipTime()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD, Integer.valueOf(campaignEx.getCbd()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, Integer.valueOf(campaignEx.getVst()));
                contentValues.put(CampaignEx.JSON_KEY_USE_SKIP_TIME, Integer.valueOf(campaignEx.getUseSkipTime()));
                contentValues.put(CampaignEx.JSON_KEY_PROG_BAR, Integer.valueOf(campaignEx.getProgressBarShow()));
                contentValues.put("vcn", Integer.valueOf(campaignEx.getVcn()));
                contentValues.put("token_r", Integer.valueOf(campaignEx.getTokenRule()));
                contentValues.put("encrypt_p", campaignEx.getEncryptPrice());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE, Integer.valueOf(campaignEx.getVideoCheckType()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE, Integer.valueOf(campaignEx.getVideoCtnType()));
                contentValues.put(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE, campaignEx.getRsIgnoreCheckRuleString());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME, Integer.valueOf(campaignEx.getVideoCompleteTime()));
                contentValues.put(CampaignEx.JSON_KEY_TP_OFFER, Integer.valueOf(campaignEx.getTpOffer()));
                contentValues.put(CampaignEx.JSON_KEY_FAC, Integer.valueOf(campaignEx.getFac()));
                contentValues.put(CampaignEx.JSON_KEY_PRIVACY_URL, campaignEx.getPrivacyUrl());
                contentValues.put("privacy_button_video", Integer.valueOf(campaignEx.getPrivacyButtonTemplateVisibility()));
                contentValues.put(CampaignEx.JSON_KEY_IMP_REPORT_TYPE, Integer.valueOf(campaignEx.getImpReportType()));
                if (campaignEx.getAabEntity() != null) {
                    contentValues.put(CampaignEx.JSON_KEY_AAB, campaignEx.getAabEntity().toJson().toString());
                }
                contentValues.put("auto_minicard", Integer.valueOf(campaignEx.getAutoShowStoreMiniCard()));
                contentValues.put("mincard_trigger_time", Integer.valueOf(campaignEx.getShowStoreMiniCardDelayTime()));
                if (a(campaignEx.getId(), campaignEx.getTab(), str, i8, campaignEx.getType(), campaignEx.isBidCampaign())) {
                    if (campaignEx.isBidCampaign()) {
                        str2 = "unitid = " + str + " AND is_bid_campaign = 1";
                    } else {
                        str2 = "id = " + campaignEx.getId() + " AND unitid = " + str + " AND is_bid_campaign = 0";
                    }
                    return getWritableDatabase().update("campaign", contentValues, str2, null);
                }
                return getWritableDatabase().insert("campaign", null, contentValues);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CampaignDao", e8.getLocalizedMessage());
                }
                return -1L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int a(String str, long j8) {
        try {
            com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b9 == null) {
                com.mbridge.msdk.c.h.a();
                b9 = com.mbridge.msdk.c.i.a();
            }
            long ac = b9.ac() * 1000;
            a(ac, str);
            List<CampaignEx> a9 = a(str, 0, 0, 1, false);
            if (a9 != null && !a9.isEmpty()) {
                Iterator<CampaignEx> it = a9.iterator();
                while (it.hasNext()) {
                    if (!it.next().isSpareOffer(j8, ac)) {
                        return 0;
                    }
                }
                return 1;
            }
            return -1;
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e8.getLocalizedMessage());
            }
            return 0;
        } finally {
        }
    }

    public final synchronized boolean a(String str, int i8, String str2, int i9, int i10, boolean z8) {
        String str3;
        try {
            if (z8) {
                str3 = "SELECT id FROM campaign WHERE unitid = " + str2 + " AND is_bid_campaign = 1";
            } else {
                str3 = "SELECT id FROM campaign WHERE id='" + str + "' AND tab=" + i8 + " AND unitid = '" + str2 + "' AND level = " + i9 + " AND adSource = " + i10 + " AND is_bid_campaign = 0";
            }
            Cursor rawQuery = getReadableDatabase().rawQuery(str3, null);
            if (rawQuery != null && rawQuery.getCount() > 0) {
                rawQuery.close();
                return true;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final List<CampaignEx> a(String str, int i8, int i9, int i10) {
        String str2;
        String str3 = " WHERE unitid = '" + str + "' AND level = " + i9 + " AND adSource = " + i10;
        if (i8 > 0) {
            str2 = " LIMIT " + i8;
        } else {
            str2 = "";
        }
        return g("SELECT * FROM campaign" + str3 + str2);
    }

    public final synchronized List<CampaignEx> a(String str, int i8, int i9, int i10, boolean z8) {
        String str2;
        String str3;
        try {
            String str4 = " WHERE unitid = '" + str + "' AND level = " + i9 + " AND adSource = " + i10;
            if (z8) {
                str2 = str4 + " AND is_bid_campaign = 1";
            } else {
                str2 = str4 + " AND is_bid_campaign = 0";
            }
            str3 = "";
            if (i8 > 0) {
                str3 = " LIMIT " + i8;
            }
        } catch (Throwable th) {
            throw th;
        }
        return g("SELECT * FROM campaign" + str2 + str3);
    }

    public final synchronized List<CampaignEx> a(String str, int i8, int i9, int i10, String str2) {
        String str3;
        String str4;
        try {
            str3 = ((" WHERE unitid = '" + str + "' AND level = " + i9 + " AND adSource = " + i10) + " AND is_bid_campaign = 1") + " AND readyState = '0'";
            if (!TextUtils.isEmpty(str2)) {
                str3 = str3 + " AND request_id = '" + str2 + "'";
            }
            str4 = "";
            if (i8 > 0) {
                str4 = " LIMIT " + i8;
            }
        } catch (Throwable th) {
            throw th;
        }
        return g("SELECT * FROM campaign" + (str3 + " order by ts ASC") + str4);
    }

    private CampaignEx a(Cursor cursor) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        CampaignEx campaignEx = new CampaignEx();
        try {
            String string = cursor.getString(cursor.getColumnIndex("pv_urls"));
            if (!TextUtils.isEmpty(string)) {
                JSONArray jSONArray = new JSONArray(string);
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    arrayList.add(jSONArray.getString(i8));
                }
                campaignEx.setPv_urls(arrayList);
            }
        } catch (JSONException e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignDao", e8.getLocalizedMessage());
            }
        }
        campaignEx.setId(cursor.getString(cursor.getColumnIndex("id")));
        campaignEx.setTab(cursor.getInt(cursor.getColumnIndex("tab")));
        campaignEx.setPackageName(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_PACKAGE_NAME)));
        campaignEx.setAppName(cursor.getString(cursor.getColumnIndex("app_name")));
        campaignEx.setAppDesc(cursor.getString(cursor.getColumnIndex("app_desc")));
        campaignEx.setSize(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_APP_SIZE)));
        campaignEx.setImageSize(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMAGE_SIZE)));
        campaignEx.setIconUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_ICON_URL)));
        campaignEx.setImageUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMAGE_URL)));
        campaignEx.setImpressionURL(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMPRESSION_URL)));
        campaignEx.setNoticeUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_NOTICE_URL)));
        campaignEx.setClickURL(cursor.getString(cursor.getColumnIndex(DownloadModel.DOWNLOAD_URL)));
        campaignEx.setWtick(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK)));
        campaignEx.setDeepLinkUrl(cursor.getString(cursor.getColumnIndex("deeplink_url")));
        campaignEx.setUserActivation(Boolean.parseBoolean(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_USER_ACTIVATION))));
        campaignEx.setOnlyImpressionURL(cursor.getString(cursor.getColumnIndex("only_impression")));
        campaignEx.setTemplate(cursor.getInt(cursor.getColumnIndex("template")));
        campaignEx.setLandingType(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_LANDING_TYPE)));
        campaignEx.setLinkType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_LINK_TYPE)));
        campaignEx.setClick_mode(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_CLICK_MODE)));
        campaignEx.setRating(Double.parseDouble(cursor.getString(cursor.getColumnIndex("star"))));
        campaignEx.setNumberRating(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NUMBER_RATING)));
        campaignEx.setClickInterval(cursor.getInt(cursor.getColumnIndex("cti")));
        campaignEx.setTimestamp(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_ST_TS)));
        campaignEx.setCacheLevel(cursor.getInt(cursor.getColumnIndex("level")));
        campaignEx.setAdCall(cursor.getString(cursor.getColumnIndex("ad_call")));
        campaignEx.setFcb(cursor.getInt(cursor.getColumnIndex("fc_b")));
        campaignEx.setAd_url_list(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AD_URL_LIST)));
        campaignEx.setVideoLength(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_LENGTHL)));
        campaignEx.setVideoSize(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_SIZE)));
        campaignEx.setVideoResolution(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_RESOLUTION)));
        campaignEx.setEndcard_click_result(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_ENDCARD_CLICK)));
        campaignEx.setVideoUrlEncode(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_URL)));
        campaignEx.setWatchMile(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_WATCH_MILE)));
        campaignEx.setTImp(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_T_IMP)));
        campaignEx.setBty(cursor.getInt(cursor.getColumnIndex("bty")));
        campaignEx.setAdvImp(cursor.getString(cursor.getColumnIndex("advImp")));
        campaignEx.setLocalRequestId(cursor.getString(cursor.getColumnIndex("local_request_id")));
        campaignEx.setNRid(cursor.getString(cursor.getColumnIndex("n_request_id")));
        campaignEx.setNLRid(cursor.getString(cursor.getColumnIndex("n_local_request_id")));
        campaignEx.setTyped(cursor.getInt(cursor.getColumnIndex("err_type_default_ad")));
        campaignEx.setReasond(cursor.getString(cursor.getColumnIndex("err_reason_default_ad")));
        campaignEx.setGuidelines(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GUIDELINES)));
        campaignEx.setOfferType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_OFFER_TYPE)));
        campaignEx.setHtmlUrl(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL)));
        campaignEx.setGuidelines(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GUIDELINES)));
        campaignEx.setHtmlUrl(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL)));
        campaignEx.setEndScreenUrl(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_END_SCREEN_URL)));
        campaignEx.setRewardName(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_NAME)));
        campaignEx.setRewardAmount(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_AMOUNT)));
        campaignEx.setRewardPlayStatus(cursor.getInt(cursor.getColumnIndex("reward_play_status")));
        campaignEx.setRetarget_offer(cursor.getInt(cursor.getColumnIndex("retarget")));
        campaignEx.setCampaignUnitId(cursor.getString(cursor.getColumnIndex("unitid")));
        campaignEx.setNativeVideoTracking(CampaignEx.TrackingStr2Object(cursor.getString(cursor.getColumnIndex("native_ad_tracking"))));
        campaignEx.setNativeVideoTrackingString(cursor.getString(cursor.getColumnIndex("native_ad_tracking")));
        campaignEx.setVideo_end_type(cursor.getInt(cursor.getColumnIndex(CampaignEx.VIDEO_END_TYPE)));
        campaignEx.setendcard_url(cursor.getString(cursor.getColumnIndex(CampaignEx.ENDCARD_URL)));
        campaignEx.setPlayable_ads_without_video(cursor.getInt(cursor.getColumnIndex(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO)));
        campaignEx.setMof_template_url(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TEMPLATE_URL)));
        campaignEx.setMof_tplid(cursor.getInt(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TPLID)));
        campaignEx.setRewardTemplateMode(CampaignEx.c.a(cursor.getString(cursor.getColumnIndex("reward_teamplate"))));
        campaignEx.setVideoMD5Value(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5)));
        campaignEx.setGifUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GIF_URL)));
        campaignEx.setNvT2(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NV_T2)));
        campaignEx.setClickTimeOutInterval(cursor.getInt(cursor.getColumnIndex("c_coi")));
        campaignEx.setcUA(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_C_UA)));
        campaignEx.setImpUA(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMP_UA)));
        campaignEx.setJmPd(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_JM_PD)));
        campaignEx.setIsDeleted(cursor.getInt(cursor.getColumnIndex("is_deleted")));
        campaignEx.setIsClick(cursor.getInt(cursor.getColumnIndex("is_click")));
        campaignEx.setIsAddSuccesful(cursor.getInt(cursor.getColumnIndex("is_add_sucesful")));
        campaignEx.setIsDownLoadZip(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_IS_DOWNLOAD)));
        campaignEx.setInteractiveCache(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_IA_CACHE)));
        campaignEx.setKeyIaOri(cursor.getInt(cursor.getColumnIndex("ia_ori")));
        campaignEx.setAdType(cursor.getInt(cursor.getColumnIndex("ad_type")));
        campaignEx.setFac(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FAC)));
        campaignEx.setTpOffer(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_TP_OFFER)));
        campaignEx.setIa_ext1(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_IA_EXT1)));
        campaignEx.setIa_ext2(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_IA_EXT2)));
        campaignEx.setKeyIaRst(cursor.getInt(cursor.getColumnIndex("ia_rst")));
        campaignEx.setKeyIaUrl(cursor.getString(cursor.getColumnIndex("ia_url")));
        campaignEx.setKeyIaIcon(cursor.getString(cursor.getColumnIndex("ia_icon")));
        campaignEx.setOc_time(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_OC_TIME)));
        campaignEx.setOc_type(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_OC_TYPE)));
        campaignEx.setT_list(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_T_LIST)));
        campaignEx.setGhId(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_GH_ID)));
        campaignEx.setGhPath(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_GH_PATH)));
        campaignEx.setBindId(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_BIND_ID)));
        String string2 = cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_ADCHOICE));
        if (!TextUtils.isEmpty(string2)) {
            campaignEx.setAdchoice(CampaignEx.a.a(string2));
        }
        campaignEx.setAdchoiceSizeHeight(cursor.getInt(cursor.getColumnIndex("adchoice_size_height")));
        campaignEx.setAdchoiceSizeWidth(cursor.getInt(cursor.getColumnIndex("adchoice_size_width")));
        campaignEx.setPlct(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_PLCT)));
        campaignEx.setPlctb(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_PLCTB)));
        campaignEx.setCandidateCacheTime(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_C_C_TIME)));
        campaignEx.setAdZip(cursor.getString(cursor.getColumnIndex("ad_zip")));
        campaignEx.setAdHtml(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AD_HTML)));
        campaignEx.setBannerUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_BANNER_URL)));
        campaignEx.setBannerHtml(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_BANNER_HTML)));
        campaignEx.setCreativeId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_CREATIVE_ID)));
        campaignEx.setVidCrtvId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID)));
        campaignEx.setEcCrtvId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_EC_CREATIVE_ID)));
        campaignEx.setEcTemplateId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_EC_TEMP_ID)));
        campaignEx.setIsBidCampaign(cursor.getInt(cursor.getColumnIndex("is_bid_campaign")) == 1);
        campaignEx.setBidToken(cursor.getString(cursor.getColumnIndex("bid_token")));
        campaignEx.setMraid(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_MRAID)));
        campaignEx.setIsMraid(cursor.getInt(cursor.getColumnIndex("is_mraid_campaign")) == 1);
        campaignEx.setOmid(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_OMID)));
        campaignEx.setReady_rate(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_READY_RATE)));
        campaignEx.setExt_data(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_EXT_DATA)));
        campaignEx.setNscpt(cursor.getInt(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_NSCPT)));
        campaignEx.setReq_ext_data(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_REQ_EXT_DATA)));
        campaignEx.setReadyState(cursor.getInt(cursor.getColumnIndex("readyState")));
        campaignEx.setLoadTimeoutState(cursor.getInt(cursor.getColumnIndex("load_timeout")));
        campaignEx.setPlacementId(cursor.getString(cursor.getColumnIndex("placement_id")));
        campaignEx.setMaitve(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_MAITVE)));
        campaignEx.setMaitve_src(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_MAITVESRC)));
        campaignEx.setFlb(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FLB)));
        campaignEx.setFlbSkipTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FLB_SKIP_TIME)));
        campaignEx.setCbd(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD)));
        campaignEx.setVst(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST)));
        campaignEx.setUseSkipTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_USE_SKIP_TIME)));
        campaignEx.setProgressBarShow(cursor.getColumnIndex(CampaignEx.JSON_KEY_PROG_BAR));
        campaignEx.setAdSpaceT(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T)));
        campaignEx.setVcn(cursor.getInt(cursor.getColumnIndex("vcn")));
        campaignEx.setTokenRule(cursor.getInt(cursor.getColumnIndex("token_r")));
        campaignEx.setEncryptPrice(cursor.getString(cursor.getColumnIndex("encrypt_p")));
        campaignEx.setVideoCheckType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE)));
        campaignEx.setVideoCtnType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE)));
        campaignEx.setRsIgnoreCheckRuleByString(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE)));
        campaignEx.setVideoCompleteTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME)));
        campaignEx.setAabEntity(AabEntity.parser(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AAB))));
        campaignEx.setPrivacyUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_PRIVACY_URL)));
        campaignEx.setPrivacyButtonTemplateVisibility(cursor.getInt(cursor.getColumnIndex("privacy_button_video")));
        campaignEx.setImpReportType(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMP_REPORT_TYPE));
        campaignEx.setAutoShowStoreMiniCard(cursor.getInt(cursor.getColumnIndex("auto_minicard")));
        campaignEx.setShowStoreMiniCardDelayTime(cursor.getInt(cursor.getColumnIndex("mincard_trigger_time")));
        return campaignEx;
    }
}
