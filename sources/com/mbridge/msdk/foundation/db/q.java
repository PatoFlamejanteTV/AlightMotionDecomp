package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.an;
import java.net.URLEncoder;

/* loaded from: classes4.dex */
public class q extends a<com.mbridge.msdk.foundation.entity.n> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20455a = "com.mbridge.msdk.foundation.db.q";

    /* renamed from: b, reason: collision with root package name */
    private static q f20456b;

    private q(g gVar) {
        super(gVar);
    }

    public static q a(g gVar) {
        if (f20456b == null) {
            synchronized (q.class) {
                try {
                    if (f20456b == null) {
                        f20456b = new q(gVar);
                    }
                } finally {
                }
            }
        }
        return f20456b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:            if (r1 != null) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:            r1.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0029, code lost:            if (r1 == null) goto L22;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int a() {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "select count(*) from reward_report"
            android.database.sqlite.SQLiteDatabase r3 = r4.getReadableDatabase()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            android.database.Cursor r1 = r3.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            if (r1 == 0) goto L1e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            if (r2 == 0) goto L1e
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            goto L1e
        L1a:
            r0 = move-exception
            goto L2e
        L1c:
            r2 = move-exception
            goto L26
        L1e:
            if (r1 == 0) goto L2c
        L20:
            r1.close()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L2c
            goto L2c
        L24:
            r0 = move-exception
            goto L34
        L26:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2c
            goto L20
        L2c:
            monitor-exit(r4)
            return r0
        L2e:
            if (r1 == 0) goto L33
            r1.close()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L33
        L33:
            throw r0     // Catch: java.lang.Throwable -> L24
        L34:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.q.a():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x035f A[Catch: all -> 0x0341, Exception -> 0x0369, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:51:0x0365, B:49:0x0368, B:44:0x035f, B:137:0x033d, B:15:0x0348), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0365 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<com.mbridge.msdk.foundation.entity.n> a(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.q.a(java.lang.String):java.util.List");
    }

    public final synchronized long a(com.mbridge.msdk.foundation.entity.n nVar) {
        try {
            if (nVar != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(LeanbackPreferenceDialogFragment.ARG_KEY, nVar.a());
                    contentValues.put("networkType", Integer.valueOf(nVar.k()));
                    contentValues.put("network_str", nVar.l());
                    contentValues.put("isCompleteView", Integer.valueOf(nVar.w()));
                    contentValues.put("watchedMillis", Integer.valueOf(nVar.x()));
                    contentValues.put("videoLength", Integer.valueOf(nVar.p()));
                    if (!TextUtils.isEmpty(nVar.r())) {
                        contentValues.put("offerUrl", nVar.r());
                    }
                    if (!TextUtils.isEmpty(nVar.h())) {
                        contentValues.put("reason", URLEncoder.encode(nVar.h(), "utf-8"));
                    }
                    contentValues.put("result", Integer.valueOf(nVar.m()));
                    contentValues.put(TypedValues.TransitionType.S_DURATION, nVar.n());
                    contentValues.put("videoSize", Long.valueOf(nVar.o()));
                    contentValues.put("type", nVar.t());
                    String s8 = nVar.s();
                    if (!TextUtils.isEmpty(s8)) {
                        contentValues.put(CampaignEx.ENDCARD_URL, s8);
                    }
                    String q8 = nVar.q();
                    if (!TextUtils.isEmpty(q8)) {
                        contentValues.put(CampaignEx.JSON_KEY_VIDEO_URL, q8);
                    }
                    String f8 = nVar.f();
                    if (!TextUtils.isEmpty(f8)) {
                        contentValues.put("rid", f8);
                    }
                    String g8 = nVar.g();
                    if (!TextUtils.isEmpty(g8)) {
                        contentValues.put("rid_n", g8);
                    }
                    String z8 = nVar.z();
                    if (!TextUtils.isEmpty(z8)) {
                        contentValues.put("template_url", z8);
                    }
                    String v8 = nVar.v();
                    if (!TextUtils.isEmpty(v8)) {
                        contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, v8);
                    }
                    String d8 = nVar.d();
                    if (!TextUtils.isEmpty(d8)) {
                        contentValues.put("ad_type", URLEncoder.encode(d8, "utf-8"));
                    }
                    contentValues.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, nVar.c());
                    contentValues.put("campaignId", nVar.e());
                    if ("2000039".equals(nVar.a())) {
                        String a9 = com.mbridge.msdk.foundation.entity.n.a(nVar);
                        if (an.b(a9)) {
                            contentValues.put("h5_click_data", a9);
                        }
                    }
                    String b9 = nVar.b();
                    if (!TextUtils.isEmpty(b9)) {
                        contentValues.put("resource_type", URLEncoder.encode(b9, "utf-8"));
                    }
                    String j8 = nVar.j();
                    if (!TextUtils.isEmpty(j8)) {
                        contentValues.put("device_id", URLEncoder.encode(j8, "utf-8"));
                    }
                    String i8 = nVar.i();
                    if (!TextUtils.isEmpty(i8)) {
                        contentValues.put("creative", URLEncoder.encode(i8, "utf-8"));
                    }
                    contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(nVar.u()));
                    return getWritableDatabase().insert("reward_report", null, contentValues);
                } catch (Exception e8) {
                    e8.printStackTrace();
                    ad.b(f20455a, e8.getMessage());
                }
            }
            return -1L;
        } catch (Throwable th) {
            throw th;
        }
    }
}
