package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.List;

/* loaded from: classes4.dex */
public class b extends a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f20414a;

    private b(g gVar) {
        super(gVar);
    }

    public static b a(Context context) {
        if (f20414a == null) {
            synchronized (b.class) {
                try {
                    if (f20414a == null) {
                        f20414a = new b(h.a(context));
                    }
                } finally {
                }
            }
        }
        return f20414a;
    }

    public final int b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || getWritableDatabase() == null) {
            return 0;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_replace", (Integer) 1);
            return getWritableDatabase().update("bid_replace_campaign", contentValues, "bid_unit_id = '" + str2 + "' AND expect_bid_token = '" + str + "'", null);
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0;
        }
    }

    public final void a(String str, List<CampaignEx> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return;
        }
        try {
            String requestId = list.get(0).getRequestId();
            String encryptPrice = list.get(0).getEncryptPrice();
            String campaignUnitId = list.get(0).getCampaignUnitId();
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("bid_unit_id", campaignUnitId);
            contentValues.put("expect_bid_token", str);
            contentValues.put("expect_encrypt_price", "");
            contentValues.put("real_request_id", requestId);
            contentValues.put("real_encrypt_price", encryptPrice);
            contentValues.put("real_token_rule", (Integer) 1);
            contentValues.put("is_replace", (Integer) 0);
            writableDatabase.insert("bid_replace_campaign", null, contentValues);
            ad.b("HBOPTIMIZE", "插入数据到对应关系表 期望 bidToken 值" + str + "+ 用于替换期望Offer 的RequestId " + requestId);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e0, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dd, code lost:            if (0 == 0) goto L32;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.mbridge.msdk.foundation.entity.d> a(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 == 0) goto Lc
            return r0
        Lc:
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 == 0) goto L13
            return r0
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT * FROM bid_replace_campaign WHERE "
            r1.append(r2)
            java.lang.String r2 = "bid_unit_id"
            r1.append(r2)
            java.lang.String r2 = " = '"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = "' AND "
            r1.append(r9)
            java.lang.String r9 = "real_request_id"
            r1.append(r9)
            java.lang.String r9 = " = '"
            r1.append(r9)
            r1.append(r10)
            java.lang.String r9 = "'"
            r1.append(r9)
            r9 = 0
            java.lang.Object r10 = new java.lang.Object     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            r10.<init>()     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            monitor-enter(r10)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            android.database.sqlite.SQLiteDatabase r2 = r8.getReadableDatabase()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld1
            android.database.Cursor r9 = r2.rawQuery(r1, r9)     // Catch: java.lang.Throwable -> Ld1
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Ld1
            if (r9 == 0) goto Lcb
            int r10 = r9.getCount()     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            if (r10 <= 0) goto Lcb
        L5d:
            boolean r10 = r9.moveToNext()     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            if (r10 == 0) goto Lcb
            com.mbridge.msdk.foundation.entity.d r10 = new com.mbridge.msdk.foundation.entity.d     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            r10.<init>()     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            java.lang.String r1 = "bid_unit_id"
            int r1 = r9.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            java.lang.String r1 = r9.getString(r1)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            java.lang.String r2 = "expect_bid_token"
            int r2 = r9.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            java.lang.String r2 = r9.getString(r2)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            java.lang.String r3 = "expect_encrypt_price"
            int r3 = r9.getColumnIndex(r3)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            java.lang.String r3 = r9.getString(r3)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            java.lang.String r4 = "real_request_id"
            int r4 = r9.getColumnIndex(r4)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            java.lang.String r4 = r9.getString(r4)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            java.lang.String r5 = "real_encrypt_price"
            int r5 = r9.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            java.lang.String r5 = r9.getString(r5)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            java.lang.String r6 = "real_token_rule"
            int r6 = r9.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            int r6 = r9.getInt(r6)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            java.lang.String r7 = "is_replace"
            int r7 = r9.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            int r7 = r9.getInt(r7)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            r10.a(r1)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            r10.b(r2)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            r10.c(r3)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            r10.e(r4)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            r10.d(r5)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            r10.b(r6)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            r10.a(r7)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            r0.add(r10)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
            goto L5d
        Lc7:
            r10 = move-exception
            goto Le1
        Lc9:
            r10 = move-exception
            goto Ld4
        Lcb:
            if (r9 == 0) goto Le0
        Lcd:
            r9.close()
            goto Le0
        Ld1:
            r1 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Ld1
            throw r1     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lc9
        Ld4:
            java.lang.String r1 = "BidReplaceCampaignDao"
            java.lang.String r10 = r10.getLocalizedMessage()     // Catch: java.lang.Throwable -> Lc7
            com.mbridge.msdk.foundation.tools.ad.b(r1, r10)     // Catch: java.lang.Throwable -> Lc7
            if (r9 == 0) goto Le0
            goto Lcd
        Le0:
            return r0
        Le1:
            if (r9 == 0) goto Le6
            r9.close()
        Le6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.b.a(java.lang.String, java.lang.String):java.util.List");
    }

    public final int a() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return 0;
            }
            return writableDatabase.delete("bid_replace_campaign", "is_replace = 0", null);
        } catch (Exception e8) {
            ad.b("BidReplaceCampaignDao", e8.getLocalizedMessage());
            return 0;
        }
    }

    public final int a(String str) {
        try {
            String str2 = "real_request_id = '" + str + "' AND is_replace = 1";
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return 0;
            }
            return writableDatabase.delete("bid_replace_campaign", str2, null);
        } catch (Exception e8) {
            ad.b("BidReplaceCampaignDao", e8.getLocalizedMessage());
            return 0;
        }
    }

    public final int a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || getWritableDatabase() == null) {
            return 0;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("expect_encrypt_price", str3);
            return getWritableDatabase().update("bid_replace_campaign", contentValues, "bid_unit_id = '" + str2 + "' AND expect_bid_token = '" + str + "'", null);
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0;
        }
    }
}
