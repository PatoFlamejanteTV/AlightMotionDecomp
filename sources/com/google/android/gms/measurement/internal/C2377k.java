package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.AbstractC2240r4;
import com.google.android.gms.internal.measurement.C2171j2;
import com.google.android.gms.internal.measurement.C2189l2;
import com.google.android.gms.internal.measurement.C2207n2;
import com.google.android.gms.internal.measurement.C2215o2;
import com.google.android.gms.internal.measurement.C2231q2;
import com.google.android.gms.internal.measurement.C2246s2;
import com.google.android.gms.internal.measurement.H1;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.J1;
import com.google.android.gms.internal.measurement.L1;
import com.google.android.gms.internal.measurement.q7;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l0.EnumC3297C;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2377k extends E5 {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f17892f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f17893g = {TtmlNode.ATTR_TTS_ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f17894h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;"};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f17895i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f17896j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f17897k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f17898l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f17899m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f17900n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: o, reason: collision with root package name */
    private static final String[] f17901o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d, reason: collision with root package name */
    private final r f17902d;

    /* renamed from: e, reason: collision with root package name */
    private final C2480y5 f17903e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2377k(H5 h52) {
        super(h52);
        this.f17903e = new C2480y5(x());
        this.f17902d = new r(this, w(), "google_app_measurement.db");
    }

    private final long C0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = B().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j8 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j8;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e8) {
                a().G().c("Database error", str, e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long G(String str, String[] strArr, long j8) {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j9 = cursor.getLong(0);
                    cursor.close();
                    return j9;
                }
                cursor.close();
                return j8;
            } catch (SQLiteException e8) {
                a().G().c("Database error", str, e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean G0(String str, List list) {
        AbstractC1396p.f(str);
        r();
        k();
        SQLiteDatabase B8 = B();
        try {
            long C02 = C0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, b().t(str, G.f17246I)));
            if (C02 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < list.size(); i8++) {
                Integer num = (Integer) list.get(i8);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            if (B8.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + TextUtils.join(",", arrayList) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{str, Integer.toString(max)}) <= 0) {
                return false;
            }
            return true;
        } catch (SQLiteException e8) {
            a().G().c("Database error querying filters. appId", C2401n2.s(str), e8);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.measurement.internal.A J0(java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2377k.J0(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.A");
    }

    private final Object M(Cursor cursor, int i8) {
        int type = cursor.getType(i8);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            a().G().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                            return null;
                        }
                        a().G().a("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i8);
                }
                return Double.valueOf(cursor.getDouble(i8));
            }
            return Long.valueOf(cursor.getLong(i8));
        }
        a().G().a("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object N(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.InterfaceC2432s r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.B()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            if (r4 != 0) goto L25
            com.google.android.gms.measurement.internal.n2 r4 = r2.a()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            com.google.android.gms.measurement.internal.p2 r4 = r4.K()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            java.lang.String r5 = "No data found"
            r4.a(r5)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r0
        L20:
            r4 = move-exception
            r0 = r3
            goto L44
        L23:
            r4 = move-exception
            goto L31
        L25:
            java.lang.Object r4 = r5.a(r3)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r4
        L2d:
            r4 = move-exception
            goto L44
        L2f:
            r4 = move-exception
            r3 = r0
        L31:
            com.google.android.gms.measurement.internal.n2 r5 = r2.a()     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.measurement.internal.p2 r5 = r5.G()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "Error querying database."
            r5.b(r1, r4)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L43
            r3.close()
        L43:
            return r0
        L44:
            if (r0 == 0) goto L49
            r0.close()
        L49:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2377k.N(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.s):java.lang.Object");
    }

    private final String P(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                }
                cursor.close();
                return str2;
            } catch (SQLiteException e8) {
                a().G().c("Database error", str, e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private static void T(ContentValues contentValues, String str, Object obj) {
        AbstractC1396p.f(str);
        AbstractC1396p.l(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put(str, (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final void V0(String str, String str2) {
        AbstractC1396p.f(str2);
        k();
        r();
        try {
            B().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e8) {
            a().G().c("Error deleting snapshot. appId", C2401n2.s(str2), e8);
        }
    }

    private final void Z(String str, A a9) {
        Long l8;
        AbstractC1396p.l(a9);
        k();
        r();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, a9.f17109a);
        contentValues.put("name", a9.f17110b);
        contentValues.put("lifetime_count", Long.valueOf(a9.f17111c));
        contentValues.put("current_bundle_count", Long.valueOf(a9.f17112d));
        contentValues.put("last_fire_timestamp", Long.valueOf(a9.f17114f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(a9.f17115g));
        contentValues.put("last_bundled_day", a9.f17116h);
        contentValues.put("last_sampled_complex_event_id", a9.f17117i);
        contentValues.put("last_sampling_rate", a9.f17118j);
        contentValues.put("current_session_count", Long.valueOf(a9.f17113e));
        Boolean bool = a9.f17119k;
        if (bool != null && bool.booleanValue()) {
            l8 = 1L;
        } else {
            l8 = null;
        }
        contentValues.put("last_exempt_from_sampling", l8);
        try {
            if (B().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                a().G().b("Failed to insert/update event aggregates (got -1). appId", C2401n2.s(a9.f17109a));
            }
        } catch (SQLiteException e8) {
            a().G().c("Error storing event aggregates. appId", C2401n2.s(a9.f17109a), e8);
        }
    }

    private final void b0(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase B8 = B();
            if (contentValues.getAsString(str2) == null) {
                a().H().b("Value of the primary key is not set.", C2401n2.s(str2));
                return;
            }
            if (B8.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && B8.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                a().G().c("Failed to insert/update table (got -1). key", C2401n2.s(str), C2401n2.s(str2));
            }
        } catch (SQLiteException e8) {
            a().G().d("Error storing into table. key", C2401n2.s(str), C2401n2.s(str2), e8);
        }
    }

    private final boolean e0(long j8, B b9, long j9, boolean z8) {
        k();
        r();
        AbstractC1396p.l(b9);
        AbstractC1396p.f(b9.f17142a);
        byte[] i8 = l().E(b9).i();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, b9.f17142a);
        contentValues.put("name", b9.f17143b);
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(b9.f17145d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j9));
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, i8);
        contentValues.put("realtime", Integer.valueOf(z8 ? 1 : 0));
        try {
            long update = B().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j8)});
            if (update != 1) {
                a().G().c("Failed to update raw event. appId, updatedRows", C2401n2.s(b9.f17142a), Long.valueOf(update));
                return false;
            }
            return true;
        } catch (SQLiteException e8) {
            a().G().c("Error updating raw event. appId", C2401n2.s(b9.f17142a), e8);
            return false;
        }
    }

    private final boolean j0(String str, int i8, com.google.android.gms.internal.measurement.I1 i12) {
        Integer num;
        Boolean bool;
        r();
        k();
        AbstractC1396p.f(str);
        AbstractC1396p.l(i12);
        Integer num2 = null;
        if (i12.N().isEmpty()) {
            C2415p2 L8 = a().L();
            Object s8 = C2401n2.s(str);
            Integer valueOf = Integer.valueOf(i8);
            if (i12.T()) {
                num2 = Integer.valueOf(i12.J());
            }
            L8.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", s8, valueOf, String.valueOf(num2));
            return false;
        }
        byte[] i9 = i12.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("audience_id", Integer.valueOf(i8));
        if (i12.T()) {
            num = Integer.valueOf(i12.J());
        } else {
            num = null;
        }
        contentValues.put("filter_id", num);
        contentValues.put("event_name", i12.N());
        if (i12.U()) {
            bool = Boolean.valueOf(i12.R());
        } else {
            bool = null;
        }
        contentValues.put("session_scoped", bool);
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, i9);
        try {
            if (B().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                a().G().b("Failed to insert event filter (got -1). appId", C2401n2.s(str));
                return true;
            }
            return true;
        } catch (SQLiteException e8) {
            a().G().c("Error storing event filter. appId", C2401n2.s(str), e8);
            return false;
        }
    }

    private final boolean k0(String str, int i8, com.google.android.gms.internal.measurement.L1 l12) {
        Integer num;
        Boolean bool;
        r();
        k();
        AbstractC1396p.f(str);
        AbstractC1396p.l(l12);
        Integer num2 = null;
        if (l12.K().isEmpty()) {
            C2415p2 L8 = a().L();
            Object s8 = C2401n2.s(str);
            Integer valueOf = Integer.valueOf(i8);
            if (l12.O()) {
                num2 = Integer.valueOf(l12.j());
            }
            L8.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", s8, valueOf, String.valueOf(num2));
            return false;
        }
        byte[] i9 = l12.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("audience_id", Integer.valueOf(i8));
        if (l12.O()) {
            num = Integer.valueOf(l12.j());
        } else {
            num = null;
        }
        contentValues.put("filter_id", num);
        contentValues.put("property_name", l12.K());
        if (l12.P()) {
            bool = Boolean.valueOf(l12.N());
        } else {
            bool = null;
        }
        contentValues.put("session_scoped", bool);
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, i9);
        try {
            if (B().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                a().G().b("Failed to insert property filter (got -1). appId", C2401n2.s(str));
                return false;
            }
            return true;
        } catch (SQLiteException e8) {
            a().G().c("Error storing property filter. appId", C2401n2.s(str), e8);
            return false;
        }
    }

    private final String z0() {
        long currentTimeMillis = x().currentTimeMillis();
        EnumC3297C enumC3297C = EnumC3297C.GOOGLE_SIGNAL;
        return "(" + ("(upload_type = " + enumC3297C.w() + " AND (ABS(creation_timestamp - " + currentTimeMillis + ") > CAST(" + ((Long) G.f17242G.a(null)).longValue() + " AS INTEGER)))") + " OR " + ("(upload_type != " + enumC3297C.w() + " AND (ABS(creation_timestamp - " + currentTimeMillis + ") > CAST(" + C2349g.P() + " AS INTEGER)))") + ")";
    }

    public final long A() {
        return G("select max(timestamp) from raw_events", null, 0L);
    }

    public final long A0(String str) {
        AbstractC1396p.f(str);
        k();
        r();
        return G("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SQLiteDatabase B() {
        k();
        try {
            return this.f17902d.getWritableDatabase();
        } catch (SQLiteException e8) {
            a().L().b("Error opening database", e8);
            throw e8;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long B0(String str, String str2) {
        long G8;
        AbstractC1396p.f(str);
        AbstractC1396p.f(str2);
        k();
        r();
        SQLiteDatabase B8 = B();
        B8.beginTransaction();
        long j8 = 0;
        try {
        } catch (SQLiteException e8) {
            e = e8;
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                G8 = G("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (G8 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(MBridgeConstans.APP_ID, str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (B8.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        a().G().c("Failed to insert column (got -1). appId", C2401n2.s(str), str2);
                        B8.endTransaction();
                        return -1L;
                    }
                    G8 = 0;
                }
            } catch (SQLiteException e9) {
                e = e9;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(MBridgeConstans.APP_ID, str);
                contentValues2.put(str2, Long.valueOf(1 + G8));
                if (B8.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    a().G().c("Failed to update column (got 0). appId", C2401n2.s(str), str2);
                    B8.endTransaction();
                    return -1L;
                }
                B8.setTransactionSuccessful();
                B8.endTransaction();
                return G8;
            } catch (SQLiteException e10) {
                e = e10;
                j8 = G8;
                a().G().d("Error inserting column. appId", C2401n2.s(str), str2, e);
                B8.endTransaction();
                return j8;
            }
        } catch (Throwable th2) {
            th = th2;
            B8.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String C() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.B()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3c
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3c
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            com.google.android.gms.measurement.internal.n2 r3 = r6.a()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.p2 r3 = r3.G()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            if (r0 == 0) goto L41
            r0.close()
        L41:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2377k.C():java.lang.String");
    }

    public final int D(String str, String str2) {
        AbstractC1396p.f(str);
        AbstractC1396p.f(str2);
        k();
        r();
        try {
            return B().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e8) {
            a().G().d("Error deleting conditional property", C2401n2.s(str), d().g(str2), e8);
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a1, code lost:            a().G().b("Read more than the max allowed user properties, ignoring excess", 1000);     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List D0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2377k.D0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final long E(C2215o2 c2215o2) {
        k();
        r();
        AbstractC1396p.l(c2215o2);
        AbstractC1396p.f(c2215o2.x2());
        byte[] i8 = c2215o2.i();
        long A8 = l().A(i8);
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, c2215o2.x2());
        contentValues.put("metadata_fingerprint", Long.valueOf(A8));
        contentValues.put(TtmlNode.TAG_METADATA, i8);
        try {
            B().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return A8;
        } catch (SQLiteException e8) {
            a().G().c("Error storing raw event metadata. appId", C2401n2.s(c2215o2.x2()), e8);
            throw e8;
        }
    }

    public final void E0(String str, A3 a32) {
        AbstractC1396p.l(str);
        AbstractC1396p.l(a32);
        k();
        r();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("consent_state", a32.x());
        contentValues.put("consent_source", Integer.valueOf(a32.b()));
        b0("consent_settings", MBridgeConstans.APP_ID, contentValues);
    }

    public final long F(String str) {
        AbstractC1396p.f(str);
        k();
        r();
        try {
            return B().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, b().t(str, G.f17327q))))});
        } catch (SQLiteException e8) {
            a().G().c("Error deleting over the limit events. appId", C2401n2.s(str), e8);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F0(String str, Bundle bundle) {
        k();
        r();
        byte[] i8 = l().E(new B(this.f18099a, "", str, "dep", 0L, 0L, bundle)).i();
        a().K().c("Saving default event parameters, appId, data size", d().c(str), Integer.valueOf(i8.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("parameters", i8);
        try {
            if (B().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                a().G().b("Failed to insert default event parameters (got -1). appId", C2401n2.s(str));
                return false;
            }
            return true;
        } catch (SQLiteException e8) {
            a().G().c("Error storing default event parameters. appId", C2401n2.s(str), e8);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0031: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:50), block:B:30:0x0031 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair H(java.lang.String r6, java.lang.Long r7) {
        /*
            r5 = this;
            r5.k()
            r5.r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.B()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String[] r3 = new java.lang.String[]{r6, r3}     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            if (r2 != 0) goto L35
            com.google.android.gms.measurement.internal.n2 r6 = r5.a()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.p2 r6 = r6.K()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r7 = "Main event not found"
            r6.a(r7)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r0
        L30:
            r6 = move-exception
            r0 = r1
            goto L8a
        L33:
            r6 = move-exception
            goto L77
        L35:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r3 = 1
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.internal.measurement.j2$a r4 = com.google.android.gms.internal.measurement.C2171j2.S()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.X4 r2 = com.google.android.gms.measurement.internal.Z5.G(r4, r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.j2$a r2 = (com.google.android.gms.internal.measurement.C2171j2.a) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.Y4 r2 = r2.m()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.r4 r2 = (com.google.android.gms.internal.measurement.AbstractC2240r4) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.j2 r2 = (com.google.android.gms.internal.measurement.C2171j2) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            android.util.Pair r6 = android.util.Pair.create(r2, r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r6
        L5d:
            r2 = move-exception
            com.google.android.gms.measurement.internal.n2 r3 = r5.a()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.p2 r3 = r3.G()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2401n2.s(r6)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r3.d(r4, r6, r7, r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r0
        L73:
            r6 = move-exception
            goto L8a
        L75:
            r6 = move-exception
            r1 = r0
        L77:
            com.google.android.gms.measurement.internal.n2 r7 = r5.a()     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.measurement.internal.p2 r7 = r7.G()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Error selecting main event"
            r7.b(r2, r6)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L89
            r1.close()
        L89:
            return r0
        L8a:
            if (r0 == 0) goto L8f
            r0.close()
        L8f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2377k.H(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final long H0(String str) {
        AbstractC1396p.f(str);
        return G("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final C2405o I(long j8, String str, long j9, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        AbstractC1396p.f(str);
        k();
        r();
        String[] strArr = {str};
        C2405o c2405o = new C2405o();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase B8 = B();
                Cursor query = B8.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    a().L().b("Not updating daily counts, app is not known. appId", C2401n2.s(str));
                    query.close();
                    return c2405o;
                }
                if (query.getLong(0) == j8) {
                    c2405o.f17980b = query.getLong(1);
                    c2405o.f17979a = query.getLong(2);
                    c2405o.f17981c = query.getLong(3);
                    c2405o.f17982d = query.getLong(4);
                    c2405o.f17983e = query.getLong(5);
                    c2405o.f17984f = query.getLong(6);
                    c2405o.f17985g = query.getLong(7);
                }
                if (z8) {
                    c2405o.f17980b += j9;
                }
                if (z9) {
                    c2405o.f17979a += j9;
                }
                if (z10) {
                    c2405o.f17981c += j9;
                }
                if (z11) {
                    c2405o.f17982d += j9;
                }
                if (z12) {
                    c2405o.f17983e += j9;
                }
                if (z13) {
                    c2405o.f17984f += j9;
                }
                if (z14) {
                    c2405o.f17985g += j9;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j8));
                contentValues.put("daily_public_events_count", Long.valueOf(c2405o.f17979a));
                contentValues.put("daily_events_count", Long.valueOf(c2405o.f17980b));
                contentValues.put("daily_conversions_count", Long.valueOf(c2405o.f17981c));
                contentValues.put("daily_error_events_count", Long.valueOf(c2405o.f17982d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c2405o.f17983e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(c2405o.f17984f));
                contentValues.put("daily_registered_triggers_count", Long.valueOf(c2405o.f17985g));
                B8.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return c2405o;
            } catch (SQLiteException e8) {
                a().G().c("Error updating daily counts. appId", C2401n2.s(str), e8);
                if (0 != 0) {
                    cursor.close();
                }
                return c2405o;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0053: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:84), block:B:33:0x0053 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C2335e I0(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2377k.I0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.e");
    }

    public final C2405o J(long j8, String str, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return I(j8, str, 1L, false, false, z10, false, z12, z13, z14);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:46), block:B:30:0x002d */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle K0(java.lang.String r6) {
        /*
            r5 = this;
            r5.k()
            r5.r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.B()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            if (r2 != 0) goto L31
            com.google.android.gms.measurement.internal.n2 r6 = r5.a()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.measurement.internal.p2 r6 = r6.K()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.lang.String r2 = "Default event parameters not found"
            r6.a(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r0
        L2c:
            r6 = move-exception
            r0 = r1
            goto L84
        L2f:
            r6 = move-exception
            goto L71
        L31:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.internal.measurement.j2$a r3 = com.google.android.gms.internal.measurement.C2171j2.S()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.X4 r2 = com.google.android.gms.measurement.internal.Z5.G(r3, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.j2$a r2 = (com.google.android.gms.internal.measurement.C2171j2.a) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.Y4 r2 = r2.m()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.r4 r2 = (com.google.android.gms.internal.measurement.AbstractC2240r4) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.j2 r2 = (com.google.android.gms.internal.measurement.C2171j2) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            r5.l()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.util.List r6 = r2.V()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.Z5.B(r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r6
        L57:
            r2 = move-exception
            com.google.android.gms.measurement.internal.n2 r3 = r5.a()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.measurement.internal.p2 r3 = r3.G()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2401n2.s(r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r3.c(r4, r6, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r0
        L6d:
            r6 = move-exception
            goto L84
        L6f:
            r6 = move-exception
            r1 = r0
        L71:
            com.google.android.gms.measurement.internal.n2 r2 = r5.a()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.p2 r2 = r2.G()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r6)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L83
            r1.close()
        L83:
            return r0
        L84:
            if (r0 == 0) goto L89
            r0.close()
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2377k.K0(java.lang.String):android.os.Bundle");
    }

    public final A L0(String str, String str2) {
        return J0("events", str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ee A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ad, B:75:0x02b6, B:78:0x02ce, B:81:0x02f8, B:83:0x0307, B:85:0x030f, B:86:0x031a, B:88:0x0322, B:89:0x032d, B:91:0x0333, B:93:0x033f, B:94:0x0348, B:96:0x0351, B:100:0x02ee, B:101:0x02c3, B:104:0x02ca, B:106:0x0219, B:107:0x01d8, B:109:0x0183, B:111:0x00ea, B:112:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c3 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ad, B:75:0x02b6, B:78:0x02ce, B:81:0x02f8, B:83:0x0307, B:85:0x030f, B:86:0x031a, B:88:0x0322, B:89:0x032d, B:91:0x0333, B:93:0x033f, B:94:0x0348, B:96:0x0351, B:100:0x02ee, B:101:0x02c3, B:104:0x02ca, B:106:0x0219, B:107:0x01d8, B:109:0x0183, B:111:0x00ea, B:112:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d8 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ad, B:75:0x02b6, B:78:0x02ce, B:81:0x02f8, B:83:0x0307, B:85:0x030f, B:86:0x031a, B:88:0x0322, B:89:0x032d, B:91:0x0333, B:93:0x033f, B:94:0x0348, B:96:0x0351, B:100:0x02ee, B:101:0x02c3, B:104:0x02ca, B:106:0x0219, B:107:0x01d8, B:109:0x0183, B:111:0x00ea, B:112:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0183 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ad, B:75:0x02b6, B:78:0x02ce, B:81:0x02f8, B:83:0x0307, B:85:0x030f, B:86:0x031a, B:88:0x0322, B:89:0x032d, B:91:0x0333, B:93:0x033f, B:94:0x0348, B:96:0x0351, B:100:0x02ee, B:101:0x02c3, B:104:0x02ca, B:106:0x0219, B:107:0x01d8, B:109:0x0183, B:111:0x00ea, B:112:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b7 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ad, B:75:0x02b6, B:78:0x02ce, B:81:0x02f8, B:83:0x0307, B:85:0x030f, B:86:0x031a, B:88:0x0322, B:89:0x032d, B:91:0x0333, B:93:0x033f, B:94:0x0348, B:96:0x0351, B:100:0x02ee, B:101:0x02c3, B:104:0x02ca, B:106:0x0219, B:107:0x01d8, B:109:0x0183, B:111:0x00ea, B:112:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e7 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ad, B:75:0x02b6, B:78:0x02ce, B:81:0x02f8, B:83:0x0307, B:85:0x030f, B:86:0x031a, B:88:0x0322, B:89:0x032d, B:91:0x0333, B:93:0x033f, B:94:0x0348, B:96:0x0351, B:100:0x02ee, B:101:0x02c3, B:104:0x02ca, B:106:0x0219, B:107:0x01d8, B:109:0x0183, B:111:0x00ea, B:112:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ff A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ad, B:75:0x02b6, B:78:0x02ce, B:81:0x02f8, B:83:0x0307, B:85:0x030f, B:86:0x031a, B:88:0x0322, B:89:0x032d, B:91:0x0333, B:93:0x033f, B:94:0x0348, B:96:0x0351, B:100:0x02ee, B:101:0x02c3, B:104:0x02ca, B:106:0x0219, B:107:0x01d8, B:109:0x0183, B:111:0x00ea, B:112:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0228 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ad, B:75:0x02b6, B:78:0x02ce, B:81:0x02f8, B:83:0x0307, B:85:0x030f, B:86:0x031a, B:88:0x0322, B:89:0x032d, B:91:0x0333, B:93:0x033f, B:94:0x0348, B:96:0x0351, B:100:0x02ee, B:101:0x02c3, B:104:0x02ca, B:106:0x0219, B:107:0x01d8, B:109:0x0183, B:111:0x00ea, B:112:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x023d A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ad, B:75:0x02b6, B:78:0x02ce, B:81:0x02f8, B:83:0x0307, B:85:0x030f, B:86:0x031a, B:88:0x0322, B:89:0x032d, B:91:0x0333, B:93:0x033f, B:94:0x0348, B:96:0x0351, B:100:0x02ee, B:101:0x02c3, B:104:0x02ca, B:106:0x0219, B:107:0x01d8, B:109:0x0183, B:111:0x00ea, B:112:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0287 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ad, B:75:0x02b6, B:78:0x02ce, B:81:0x02f8, B:83:0x0307, B:85:0x030f, B:86:0x031a, B:88:0x0322, B:89:0x032d, B:91:0x0333, B:93:0x033f, B:94:0x0348, B:96:0x0351, B:100:0x02ee, B:101:0x02c3, B:104:0x02ca, B:106:0x0219, B:107:0x01d8, B:109:0x0183, B:111:0x00ea, B:112:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ad A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ad, B:75:0x02b6, B:78:0x02ce, B:81:0x02f8, B:83:0x0307, B:85:0x030f, B:86:0x031a, B:88:0x0322, B:89:0x032d, B:91:0x0333, B:93:0x033f, B:94:0x0348, B:96:0x0351, B:100:0x02ee, B:101:0x02c3, B:104:0x02ca, B:106:0x0219, B:107:0x01d8, B:109:0x0183, B:111:0x00ea, B:112:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0307 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ad, B:75:0x02b6, B:78:0x02ce, B:81:0x02f8, B:83:0x0307, B:85:0x030f, B:86:0x031a, B:88:0x0322, B:89:0x032d, B:91:0x0333, B:93:0x033f, B:94:0x0348, B:96:0x0351, B:100:0x02ee, B:101:0x02c3, B:104:0x02ca, B:106:0x0219, B:107:0x01d8, B:109:0x0183, B:111:0x00ea, B:112:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0333 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ad, B:75:0x02b6, B:78:0x02ce, B:81:0x02f8, B:83:0x0307, B:85:0x030f, B:86:0x031a, B:88:0x0322, B:89:0x032d, B:91:0x0333, B:93:0x033f, B:94:0x0348, B:96:0x0351, B:100:0x02ee, B:101:0x02c3, B:104:0x02ca, B:106:0x0219, B:107:0x01d8, B:109:0x0183, B:111:0x00ea, B:112:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0351 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ad, B:75:0x02b6, B:78:0x02ce, B:81:0x02f8, B:83:0x0307, B:85:0x030f, B:86:0x031a, B:88:0x0322, B:89:0x032d, B:91:0x0333, B:93:0x033f, B:94:0x0348, B:96:0x0351, B:100:0x02ee, B:101:0x02c3, B:104:0x02ca, B:106:0x0219, B:107:0x01d8, B:109:0x0183, B:111:0x00ea, B:112:0x00bb), top: B:4:0x007d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C2324c2 M0(java.lang.String r51) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2377k.M0(java.lang.String):com.google.android.gms.measurement.internal.c2");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:107), block:B:29:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.a6 N0(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            Q.AbstractC1396p.f(r11)
            Q.AbstractC1396p.f(r12)
            r10.k()
            r10.r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.B()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            if (r2 != 0) goto L34
            r1.close()
            return r0
        L34:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            r2 = 1
            java.lang.Object r9 = r10.M(r1, r2)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            if (r9 != 0) goto L44
            r1.close()
            return r0
        L44:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            com.google.android.gms.measurement.internal.a6 r2 = new com.google.android.gms.measurement.internal.a6     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            if (r3 == 0) goto L6e
            com.google.android.gms.measurement.internal.n2 r3 = r10.a()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            com.google.android.gms.measurement.internal.p2 r3 = r3.G()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2401n2.s(r11)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            r3.b(r4, r5)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            goto L6e
        L69:
            r11 = move-exception
            r0 = r1
            goto L95
        L6c:
            r2 = move-exception
            goto L76
        L6e:
            r1.close()
            return r2
        L72:
            r11 = move-exception
            goto L95
        L74:
            r2 = move-exception
            r1 = r0
        L76:
            com.google.android.gms.measurement.internal.n2 r3 = r10.a()     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.p2 r3 = r3.G()     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C2401n2.s(r11)     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.h2 r5 = r10.d()     // Catch: java.lang.Throwable -> L69
            java.lang.String r12 = r5.g(r12)     // Catch: java.lang.Throwable -> L69
            r3.d(r4, r11, r12, r2)     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L94
            r1.close()
        L94:
            return r0
        L95:
            if (r0 == 0) goto L9a
            r0.close()
        L9a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2377k.N0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.a6");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String O(long r4) {
        /*
            r3 = this;
            r3.k()
            r3.r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.B()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            if (r5 != 0) goto L35
            com.google.android.gms.measurement.internal.n2 r5 = r3.a()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.p2 r5 = r5.K()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.a(r1)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r4.close()
            return r0
        L30:
            r5 = move-exception
            r0 = r4
            goto L55
        L33:
            r5 = move-exception
            goto L42
        L35:
            r5 = 0
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r4.close()
            return r5
        L3e:
            r5 = move-exception
            goto L55
        L40:
            r5 = move-exception
            r4 = r0
        L42:
            com.google.android.gms.measurement.internal.n2 r1 = r3.a()     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.measurement.internal.p2 r1 = r1.G()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r5)     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L54
            r4.close()
        L54:
            return r0
        L55:
            if (r0 == 0) goto L5a
            r0.close()
        L5a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2377k.O(long):java.lang.String");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0059: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:90), block:B:28:0x0059 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C2384l O0(java.lang.String r10) {
        /*
            r9 = this;
            Q.AbstractC1396p.f(r10)
            r9.k()
            r9.r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.B()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            if (r2 != 0) goto L31
            r1.close()
            return r0
        L31:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r3 = 1
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            boolean r5 = r1.moveToNext()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            if (r5 == 0) goto L5d
            com.google.android.gms.measurement.internal.n2 r5 = r9.a()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            com.google.android.gms.measurement.internal.p2 r5 = r5.G()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2401n2.s(r10)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r5.b(r6, r7)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            goto L5d
        L58:
            r10 = move-exception
            r0 = r1
            goto L87
        L5b:
            r2 = move-exception
            goto L70
        L5d:
            if (r2 != 0) goto L63
            r1.close()
            return r0
        L63:
            com.google.android.gms.measurement.internal.l r5 = new com.google.android.gms.measurement.internal.l     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r1.close()
            return r5
        L6c:
            r10 = move-exception
            goto L87
        L6e:
            r2 = move-exception
            r1 = r0
        L70:
            com.google.android.gms.measurement.internal.n2 r3 = r9.a()     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.measurement.internal.p2 r3 = r3.G()     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C2401n2.s(r10)     // Catch: java.lang.Throwable -> L58
            r3.c(r4, r10, r2)     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L86
            r1.close()
        L86:
            return r0
        L87:
            if (r0 == 0) goto L8c
            r0.close()
        L8c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2377k.O0(java.lang.String):com.google.android.gms.measurement.internal.l");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map P0(String str, String str2) {
        r();
        k();
        AbstractC1396p.f(str);
        AbstractC1396p.f(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("event_filters", new String[]{"audience_id", DataSchemeDataSource.SCHEME_DATA}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.I1 i12 = (com.google.android.gms.internal.measurement.I1) ((AbstractC2240r4) ((I1.a) Z5.G(com.google.android.gms.internal.measurement.I1.K(), query.getBlob(1))).m());
                        int i8 = query.getInt(0);
                        List list = (List) arrayMap.get(Integer.valueOf(i8));
                        if (list == null) {
                            list = new ArrayList();
                            arrayMap.put(Integer.valueOf(i8), list);
                        }
                        list.add(i12);
                    } catch (IOException e8) {
                        a().G().c("Failed to merge filter. appId", C2401n2.s(str), e8);
                    }
                } while (query.moveToNext());
                query.close();
                return arrayMap;
            } catch (SQLiteException e9) {
                a().G().c("Database error querying filters. appId", C2401n2.s(str), e9);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List Q(String str, int i8, int i9) {
        boolean z8;
        boolean z9;
        byte[] j02;
        long j8;
        long j9;
        k();
        r();
        int i10 = 1;
        if (i8 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1396p.a(z8);
        if (i9 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1396p.a(z9);
        AbstractC1396p.f(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("queue", new String[]{"rowid", DataSchemeDataSource.SCHEME_DATA, "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i8));
                if (!query.moveToFirst()) {
                    List emptyList = Collections.emptyList();
                    query.close();
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    long j10 = query.getLong(0);
                    try {
                        j02 = l().j0(query.getBlob(i10));
                    } catch (IOException e8) {
                        a().G().c("Failed to unzip queued bundle. appId", C2401n2.s(str), e8);
                    }
                    if (!arrayList.isEmpty() && j02.length + i11 > i9) {
                        break;
                    }
                    try {
                        C2215o2.a aVar = (C2215o2.a) Z5.G(C2215o2.u2(), j02);
                        if (!arrayList.isEmpty()) {
                            C2215o2 c2215o2 = (C2215o2) ((Pair) arrayList.get(0)).first;
                            C2215o2 c2215o22 = (C2215o2) ((AbstractC2240r4) aVar.m());
                            if (!c2215o2.Y().equals(c2215o22.Y()) || !c2215o2.X().equals(c2215o22.X()) || c2215o2.o0() != c2215o22.o0() || !c2215o2.Z().equals(c2215o22.Z())) {
                                break;
                            }
                            Iterator it = c2215o2.m0().iterator();
                            while (true) {
                                j8 = -1;
                                if (it.hasNext()) {
                                    C2246s2 c2246s2 = (C2246s2) it.next();
                                    if ("_npa".equals(c2246s2.U())) {
                                        j9 = c2246s2.P();
                                        break;
                                    }
                                } else {
                                    j9 = -1;
                                    break;
                                }
                            }
                            Iterator it2 = c2215o22.m0().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C2246s2 c2246s22 = (C2246s2) it2.next();
                                if ("_npa".equals(c2246s22.U())) {
                                    j8 = c2246s22.P();
                                    break;
                                }
                            }
                            if (j9 != j8) {
                                break;
                            }
                        }
                        if (!query.isNull(2)) {
                            aVar.x0(query.getInt(2));
                        }
                        i11 += j02.length;
                        arrayList.add(Pair.create((C2215o2) ((AbstractC2240r4) aVar.m()), Long.valueOf(j10)));
                    } catch (IOException e9) {
                        a().G().c("Failed to merge queued bundle. appId", C2401n2.s(str), e9);
                    }
                    if (!query.moveToNext() || i11 > i9) {
                        break;
                    }
                    i10 = 1;
                }
                query.close();
                return arrayList;
            } catch (SQLiteException e10) {
                a().G().c("Error querying bundles. appId", C2401n2.s(str), e10);
                List emptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final C2453v Q0(String str) {
        AbstractC1396p.l(str);
        k();
        r();
        return C2453v.c(P("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final List R(String str, String str2, String str3) {
        AbstractC1396p.f(str);
        k();
        r();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return S(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map R0(String str, String str2) {
        r();
        k();
        AbstractC1396p.f(str);
        AbstractC1396p.f(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("property_filters", new String[]{"audience_id", DataSchemeDataSource.SCHEME_DATA}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.L1 l12 = (com.google.android.gms.internal.measurement.L1) ((AbstractC2240r4) ((L1.a) Z5.G(com.google.android.gms.internal.measurement.L1.I(), query.getBlob(1))).m());
                        int i8 = query.getInt(0);
                        List list = (List) arrayMap.get(Integer.valueOf(i8));
                        if (list == null) {
                            list = new ArrayList();
                            arrayMap.put(Integer.valueOf(i8), list);
                        }
                        list.add(l12);
                    } catch (IOException e8) {
                        a().G().c("Failed to merge filter", C2401n2.s(str), e8);
                    }
                } while (query.moveToNext());
                query.close();
                return arrayMap;
            } catch (SQLiteException e9) {
                a().G().c("Database error querying filters. appId", C2401n2.s(str), e9);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:            a().G().b("Read more than the max allowed conditional properties, ignoring extra", 1000);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List S(java.lang.String r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2377k.S(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final A3 S0(String str) {
        AbstractC1396p.l(str);
        k();
        r();
        return A3.q(P("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void T0(String str, String str2) {
        AbstractC1396p.f(str);
        AbstractC1396p.f(str2);
        k();
        r();
        try {
            B().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e8) {
            a().G().d("Error deleting user property. appId", C2401n2.s(str), d().g(str2), e8);
        }
    }

    public final void U(A a9) {
        Z("events", a9);
    }

    public final A3 U0(String str) {
        AbstractC1396p.l(str);
        k();
        r();
        A3 a32 = (A3) N("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new InterfaceC2432s() { // from class: com.google.android.gms.measurement.internal.m
            @Override // com.google.android.gms.measurement.internal.InterfaceC2432s
            public final Object a(Cursor cursor) {
                A3 e8;
                e8 = A3.e(cursor.getString(0), cursor.getInt(1));
                return e8;
            }
        });
        if (a32 == null) {
            return A3.f17125c;
        }
        return a32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0043, code lost:            if (r7.f17229b.U(r0).m(com.google.android.gms.measurement.internal.A3.a.ANALYTICS_STORAGE) != false) goto L10;     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(com.google.android.gms.measurement.internal.C2324c2 r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2377k.V(com.google.android.gms.measurement.internal.c2, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void W(Long l8) {
        k();
        r();
        AbstractC1396p.l(l8);
        if ((q7.a() && !b().q(G.f17235C0)) || !o0()) {
            return;
        }
        if (C0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l8 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
            a().L().a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            B().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l8 + " AND retry_count < 2147483647");
        } catch (SQLiteException e8) {
            a().G().b("Error incrementing retry count. error", e8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4 A[Catch: all -> 0x007b, SQLiteException -> 0x007f, IOException -> 0x00a5, TryCatch #1 {IOException -> 0x00a5, blocks: (B:21:0x0082, B:23:0x00a0, B:26:0x00e7, B:28:0x00f4, B:30:0x00fe, B:32:0x0106, B:36:0x010f, B:34:0x011d, B:39:0x0128, B:43:0x00a8, B:45:0x00af, B:46:0x00bc, B:48:0x00c2, B:50:0x00e1), top: B:20:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.V5 W0(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2377k.W0(java.lang.String):com.google.android.gms.measurement.internal.V5");
    }

    public final void X(String str, Bundle bundle) {
        AbstractC1396p.l(bundle);
        k();
        r();
        C2412p c2412p = new C2412p(this, str);
        for (List<C2398n> a9 = c2412p.a(); !a9.isEmpty(); a9 = c2412p.a()) {
            for (C2398n c2398n : a9) {
                Z5 l8 = l();
                C2171j2 c2171j2 = c2398n.f17959d;
                Bundle bundle2 = new Bundle();
                for (C2189l2 c2189l2 : c2171j2.V()) {
                    if (c2189l2.Z()) {
                        bundle2.putDouble(c2189l2.W(), c2189l2.G());
                    } else if (c2189l2.a0()) {
                        bundle2.putFloat(c2189l2.W(), c2189l2.N());
                    } else if (c2189l2.b0()) {
                        bundle2.putLong(c2189l2.W(), c2189l2.S());
                    } else if (c2189l2.d0()) {
                        bundle2.putString(c2189l2.W(), c2189l2.X());
                    } else if (!c2189l2.Y().isEmpty()) {
                        bundle2.putParcelableArray(c2189l2.W(), Z5.i0(c2189l2.Y()));
                    } else {
                        l8.a().G().b("Unexpected parameter type for parameter", c2189l2);
                    }
                }
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                String U8 = c2171j2.U();
                if (string == null) {
                    string = "";
                }
                C2428r2 c2428r2 = new C2428r2(U8, string, bundle2, c2171j2.R());
                g().N(c2428r2.f18030d, bundle);
                e0(c2398n.f17956a, new B(this.f18099a, c2428r2.f18028b, str, c2398n.f17959d.U(), c2398n.f17959d.R(), c2398n.f17959d.Q(), c2428r2.f18030d), c2398n.f17957b, c2398n.f17958c);
            }
        }
    }

    public final List X0(String str) {
        AbstractC1396p.f(str);
        k();
        r();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = B().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new B5(string, cursor.getLong(1), cursor.getInt(2)));
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e8) {
                a().G().c("Error querying trigger uris. appId", C2401n2.s(str), e8);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void Y(String str, C2453v c2453v) {
        AbstractC1396p.l(str);
        AbstractC1396p.l(c2453v);
        k();
        r();
        if (b().q(G.f17267S0)) {
            A3 U02 = U0(str);
            A3 a32 = A3.f17125c;
            if (U02 == a32) {
                E0(str, a32);
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("dma_consent_settings", c2453v.j());
        b0("consent_settings", MBridgeConstans.APP_ID, contentValues);
    }

    public final List Y0(String str) {
        AbstractC1396p.f(str);
        k();
        r();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = B().query("user_attributes", new String[]{"name", TtmlNode.ATTR_TTS_ORIGIN, "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j8 = cursor.getLong(2);
                    Object M8 = M(cursor, 3);
                    if (M8 == null) {
                        a().G().b("Read invalid user property value, ignoring it. appId", C2401n2.s(str));
                    } else {
                        arrayList.add(new a6(str, str2, string, j8, M8));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e8) {
                a().G().c("Error querying user properties. appId", C2401n2.s(str), e8);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map Z0(String str) {
        r();
        k();
        AbstractC1396p.f(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                ArrayMap arrayMap = new ArrayMap();
                do {
                    int i8 = query.getInt(0);
                    try {
                        arrayMap.put(Integer.valueOf(i8), (C2231q2) ((AbstractC2240r4) ((C2231q2.a) Z5.G(C2231q2.R(), query.getBlob(1))).m()));
                    } catch (IOException e8) {
                        a().G().d("Failed to merge filter results. appId, audienceId, error", C2401n2.s(str), Integer.valueOf(i8), e8);
                    }
                } while (query.moveToNext());
                query.close();
                return arrayMap;
            } catch (SQLiteException e9) {
                a().G().c("Database error querying filter results. appId", C2401n2.s(str), e9);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void a0(String str, A3 a32) {
        AbstractC1396p.l(str);
        AbstractC1396p.l(a32);
        k();
        r();
        E0(str, U0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("storage_consent_at_bundling", a32.x());
        b0("consent_settings", MBridgeConstans.APP_ID, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map a1(String str) {
        AbstractC1396p.f(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("event_filters", new String[]{"audience_id", DataSchemeDataSource.SCHEME_DATA}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.I1 i12 = (com.google.android.gms.internal.measurement.I1) ((AbstractC2240r4) ((I1.a) Z5.G(com.google.android.gms.internal.measurement.I1.K(), query.getBlob(1))).m());
                        if (i12.S()) {
                            int i8 = query.getInt(0);
                            List list = (List) arrayMap.get(Integer.valueOf(i8));
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(Integer.valueOf(i8), list);
                            }
                            list.add(i12);
                        }
                    } catch (IOException e8) {
                        a().G().c("Failed to merge filter. appId", C2401n2.s(str), e8);
                    }
                } while (query.moveToNext());
                query.close();
                return arrayMap;
            } catch (SQLiteException e9) {
                a().G().c("Database error querying filters. appId", C2401n2.s(str), e9);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map b1(String str) {
        r();
        k();
        AbstractC1396p.f(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = B().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!rawQuery.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    rawQuery.close();
                    return emptyMap;
                }
                do {
                    int i8 = rawQuery.getInt(0);
                    List list = (List) arrayMap.get(Integer.valueOf(i8));
                    if (list == null) {
                        list = new ArrayList();
                        arrayMap.put(Integer.valueOf(i8), list);
                    }
                    list.add(Integer.valueOf(rawQuery.getInt(1)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return arrayMap;
            } catch (SQLiteException e8) {
                a().G().c("Database error querying scoped filters. appId", C2401n2.s(str), e8);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c0(String str, List list) {
        Integer num;
        boolean z8;
        boolean z9;
        AbstractC1396p.l(list);
        for (int i8 = 0; i8 < list.size(); i8++) {
            H1.a aVar = (H1.a) ((com.google.android.gms.internal.measurement.H1) list.get(i8)).x();
            if (aVar.q() != 0) {
                for (int i9 = 0; i9 < aVar.q(); i9++) {
                    I1.a aVar2 = (I1.a) aVar.t(i9).x();
                    I1.a aVar3 = (I1.a) ((AbstractC2240r4.b) aVar2.clone());
                    String b9 = l0.q.b(aVar2.w());
                    if (b9 != null) {
                        aVar3.s(b9);
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    for (int i10 = 0; i10 < aVar2.q(); i10++) {
                        com.google.android.gms.internal.measurement.J1 t8 = aVar2.t(i10);
                        String a9 = l0.s.a(t8.L());
                        if (a9 != null) {
                            aVar3.r(i10, (com.google.android.gms.internal.measurement.J1) ((AbstractC2240r4) ((J1.a) t8.x()).q(a9).m()));
                            z9 = true;
                        }
                    }
                    if (z9) {
                        H1.a r8 = aVar.r(i9, aVar3);
                        list.set(i8, (com.google.android.gms.internal.measurement.H1) ((AbstractC2240r4) r8.m()));
                        aVar = r8;
                    }
                }
            }
            if (aVar.w() != 0) {
                for (int i11 = 0; i11 < aVar.w(); i11++) {
                    com.google.android.gms.internal.measurement.L1 x8 = aVar.x(i11);
                    String a10 = l0.r.a(x8.K());
                    if (a10 != null) {
                        aVar = aVar.s(i11, ((L1.a) x8.x()).q(a10));
                        list.set(i8, (com.google.android.gms.internal.measurement.H1) ((AbstractC2240r4) aVar.m()));
                    }
                }
            }
        }
        r();
        k();
        AbstractC1396p.f(str);
        AbstractC1396p.l(list);
        SQLiteDatabase B8 = B();
        B8.beginTransaction();
        try {
            r();
            k();
            AbstractC1396p.f(str);
            SQLiteDatabase B9 = B();
            B9.delete("property_filters", "app_id=?", new String[]{str});
            B9.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.H1 h12 = (com.google.android.gms.internal.measurement.H1) it.next();
                r();
                k();
                AbstractC1396p.f(str);
                AbstractC1396p.l(h12);
                if (!h12.P()) {
                    a().L().b("Audience with no ID. appId", C2401n2.s(str));
                } else {
                    int j8 = h12.j();
                    Iterator it2 = h12.N().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.I1) it2.next()).T()) {
                                a().L().c("Event filter with no ID. Audience definition ignored. appId, audienceId", C2401n2.s(str), Integer.valueOf(j8));
                                break;
                            }
                        } else {
                            Iterator it3 = h12.O().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (!((com.google.android.gms.internal.measurement.L1) it3.next()).O()) {
                                        a().L().c("Property filter with no ID. Audience definition ignored. appId, audienceId", C2401n2.s(str), Integer.valueOf(j8));
                                        break;
                                    }
                                } else {
                                    Iterator it4 = h12.N().iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            if (!j0(str, j8, (com.google.android.gms.internal.measurement.I1) it4.next())) {
                                                z8 = false;
                                                break;
                                            }
                                        } else {
                                            z8 = true;
                                            break;
                                        }
                                    }
                                    if (z8) {
                                        Iterator it5 = h12.O().iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                if (!k0(str, j8, (com.google.android.gms.internal.measurement.L1) it5.next())) {
                                                    z8 = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z8) {
                                        r();
                                        k();
                                        AbstractC1396p.f(str);
                                        SQLiteDatabase B10 = B();
                                        B10.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(j8)});
                                        B10.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(j8)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                com.google.android.gms.internal.measurement.H1 h13 = (com.google.android.gms.internal.measurement.H1) it6.next();
                if (h13.P()) {
                    num = Integer.valueOf(h13.j());
                } else {
                    num = null;
                }
                arrayList.add(num);
            }
            G0(str, arrayList);
            B8.setTransactionSuccessful();
            B8.endTransaction();
        } catch (Throwable th) {
            B8.endTransaction();
            throw th;
        }
    }

    public final void c1() {
        r();
        B().beginTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d0(List list) {
        k();
        r();
        AbstractC1396p.l(list);
        AbstractC1396p.n(list.size());
        if (!o0()) {
            return;
        }
        String str = "(" + TextUtils.join(",", list) + ")";
        if (C0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
            a().L().a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            B().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        } catch (SQLiteException e8) {
            a().G().b("Error incrementing retry count. error", e8);
        }
    }

    public final void d1(String str) {
        k();
        r();
        try {
            B().execSQL("delete from default_event_params where app_id=?", new String[]{str});
        } catch (SQLiteException e8) {
            a().G().b("Error clearing default event params", e8);
        }
    }

    public final void e1(String str) {
        A L02;
        V0("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = B().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return;
                }
                do {
                    String string = cursor.getString(0);
                    if (string != null && (L02 = L0(str, string)) != null) {
                        Z("events_snapshot", L02);
                    }
                } while (cursor.moveToNext());
                cursor.close();
            } catch (SQLiteException e8) {
                a().G().c("Error creating snapshot. appId", C2401n2.s(str), e8);
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final boolean f0(C2215o2 c2215o2, boolean z8) {
        k();
        r();
        AbstractC1396p.l(c2215o2);
        AbstractC1396p.f(c2215o2.x2());
        AbstractC1396p.o(c2215o2.L0());
        j1();
        long currentTimeMillis = x().currentTimeMillis();
        if (c2215o2.c2() < currentTimeMillis - C2349g.P() || c2215o2.c2() > C2349g.P() + currentTimeMillis) {
            a().L().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C2401n2.s(c2215o2.x2()), Long.valueOf(currentTimeMillis), Long.valueOf(c2215o2.c2()));
        }
        try {
            byte[] h02 = l().h0(c2215o2.i());
            a().K().b("Saving bundle, size", Integer.valueOf(h02.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put(MBridgeConstans.APP_ID, c2215o2.x2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c2215o2.c2()));
            contentValues.put(DataSchemeDataSource.SCHEME_DATA, h02);
            contentValues.put("has_realtime", Integer.valueOf(z8 ? 1 : 0));
            if (c2215o2.S0()) {
                contentValues.put("retry_count", Integer.valueOf(c2215o2.B1()));
            }
            try {
                if (B().insert("queue", null, contentValues) == -1) {
                    a().G().b("Failed to insert bundle (got -1). appId", C2401n2.s(c2215o2.x2()));
                    return false;
                }
                return true;
            } catch (SQLiteException e8) {
                a().G().c("Error storing bundle. appId", C2401n2.s(c2215o2.x2()), e8);
                return false;
            }
        } catch (IOException e9) {
            a().G().c("Data loss. Failed to serialize bundle. appId", C2401n2.s(c2215o2.x2()), e9);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:            if ("_v".equals(r0) != false) goto L32;     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f1(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2377k.f1(java.lang.String):void");
    }

    public final boolean g0(C2335e c2335e) {
        AbstractC1396p.l(c2335e);
        k();
        r();
        String str = c2335e.f17779a;
        AbstractC1396p.l(str);
        if (N0(str, c2335e.f17781c.f17650b) == null && C0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put(TtmlNode.ATTR_TTS_ORIGIN, c2335e.f17780b);
        contentValues.put("name", c2335e.f17781c.f17650b);
        T(contentValues, "value", AbstractC1396p.l(c2335e.f17781c.s()));
        contentValues.put("active", Boolean.valueOf(c2335e.f17783e));
        contentValues.put("trigger_event_name", c2335e.f17784f);
        contentValues.put("trigger_timeout", Long.valueOf(c2335e.f17786h));
        g();
        contentValues.put("timed_out_event", d6.q0(c2335e.f17785g));
        contentValues.put("creation_timestamp", Long.valueOf(c2335e.f17782d));
        g();
        contentValues.put("triggered_event", d6.q0(c2335e.f17787i));
        contentValues.put("triggered_timestamp", Long.valueOf(c2335e.f17781c.f17651c));
        contentValues.put("time_to_live", Long.valueOf(c2335e.f17788j));
        g();
        contentValues.put("expired_event", d6.q0(c2335e.f17789k));
        try {
            if (B().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                a().G().b("Failed to insert/update conditional user property (got -1)", C2401n2.s(str));
                return true;
            }
            return true;
        } catch (SQLiteException e8) {
            a().G().c("Error storing conditional user property", C2401n2.s(str), e8);
            return true;
        }
    }

    public final boolean g1(String str) {
        if (q7.a() && !b().q(G.f17235C0)) {
            return false;
        }
        if (C0("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT " + z0(), new String[]{str}) == 0) {
            return false;
        }
        return true;
    }

    public final boolean h0(B b9, long j8, boolean z8) {
        k();
        r();
        AbstractC1396p.l(b9);
        AbstractC1396p.f(b9.f17142a);
        byte[] i8 = l().E(b9).i();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, b9.f17142a);
        contentValues.put("name", b9.f17143b);
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(b9.f17145d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j8));
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, i8);
        contentValues.put("realtime", Integer.valueOf(z8 ? 1 : 0));
        try {
            if (B().insert("raw_events", null, contentValues) == -1) {
                a().G().b("Failed to insert raw event (got -1). appId", C2401n2.s(b9.f17142a));
                return false;
            }
            return true;
        } catch (SQLiteException e8) {
            a().G().c("Error storing raw event. appId", C2401n2.s(b9.f17142a), e8);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h1(String str) {
        boolean z8;
        boolean z9;
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery("select timestamp from raw_events where app_id=? and name = '_f' limit 1;", new String[]{str});
            } catch (SQLiteException e8) {
                e = e8;
                z8 = false;
            }
            if (!cursor.moveToFirst()) {
                cursor.close();
                return false;
            }
            if (x().currentTimeMillis() < cursor.getLong(0) + 15000) {
                z8 = true;
            } else {
                z8 = false;
            }
            try {
                if (G("select count(*) from raw_events where app_id=? and name not like '!_%' escape '!' limit 1;", new String[]{str}, 0L) > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                cursor.close();
            } catch (SQLiteException e9) {
                e = e9;
                a().G().b("Error checking backfill conditions", e);
                z9 = false;
                if (!z8) {
                }
                return false;
            }
            if (!z8 && !z9) {
                return true;
            }
            return false;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final boolean i0(a6 a6Var) {
        AbstractC1396p.l(a6Var);
        k();
        r();
        if (N0(a6Var.f17680a, a6Var.f17682c) == null) {
            if (d6.K0(a6Var.f17682c)) {
                if (C0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{a6Var.f17680a}) >= b().n(a6Var.f17680a, G.f17248J, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(a6Var.f17682c) && C0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{a6Var.f17680a, a6Var.f17681b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, a6Var.f17680a);
        contentValues.put(TtmlNode.ATTR_TTS_ORIGIN, a6Var.f17681b);
        contentValues.put("name", a6Var.f17682c);
        contentValues.put("set_timestamp", Long.valueOf(a6Var.f17683d));
        T(contentValues, "value", a6Var.f17684e);
        try {
            if (B().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                a().G().b("Failed to insert/update user property (got -1). appId", C2401n2.s(a6Var.f17680a));
                return true;
            }
            return true;
        } catch (SQLiteException e8) {
            a().G().c("Error storing user property. appId", C2401n2.s(a6Var.f17680a), e8);
            return true;
        }
    }

    public final void i1() {
        r();
        B().endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j1() {
        int delete;
        k();
        r();
        if (!o0()) {
            return;
        }
        long a9 = p().f17878e.a();
        long elapsedRealtime = x().elapsedRealtime();
        if (Math.abs(elapsedRealtime - a9) > C2349g.Q()) {
            p().f17878e.b(elapsedRealtime);
            k();
            r();
            if (o0() && (delete = B().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(x().currentTimeMillis()), String.valueOf(C2349g.P())})) > 0) {
                a().K().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    public final void k1() {
        r();
        B().setTransactionSuccessful();
    }

    public final boolean l0(String str, C2207n2 c2207n2, String str2, Map map, EnumC3297C enumC3297C) {
        int delete;
        k();
        r();
        AbstractC1396p.l(c2207n2);
        AbstractC1396p.f(str);
        if (q7.a() && !b().q(G.f17235C0)) {
            return false;
        }
        k();
        r();
        if (o0()) {
            long a9 = p().f17879f.a();
            long elapsedRealtime = x().elapsedRealtime();
            if (Math.abs(elapsedRealtime - a9) > C2349g.Q()) {
                p().f17879f.b(elapsedRealtime);
                k();
                r();
                if (o0() && (delete = B().delete("upload_queue", z0(), new String[0])) > 0) {
                    a().K().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
        }
        byte[] i8 = c2207n2.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("measurement_batch", i8);
        contentValues.put("upload_uri", str2);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb.append((CharSequence) arrayList.get(0));
            int i9 = 1;
            while (i9 < size) {
                sb.append((CharSequence) "\r\n");
                Object obj = arrayList.get(i9);
                i9++;
                sb.append((CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb.toString());
        contentValues.put("upload_type", Integer.valueOf(enumC3297C.w()));
        contentValues.put("creation_timestamp", Long.valueOf(x().currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        try {
            if (B().insert("upload_queue", null, contentValues) != -1) {
                return true;
            }
            a().G().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return false;
        } catch (SQLiteException e8) {
            a().G().c("Error storing MeasurementBatch to upload_queue. appId", str, e8);
            return false;
        }
    }

    public final boolean l1() {
        if (C0("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m0(String str, B5 b52) {
        k();
        r();
        AbstractC1396p.l(b52);
        AbstractC1396p.f(str);
        long currentTimeMillis = x().currentTimeMillis();
        long j8 = b52.f17159b;
        C2317b2 c2317b2 = G.f17307i0;
        if (j8 < currentTimeMillis - ((Long) c2317b2.a(null)).longValue() || b52.f17159b > ((Long) c2317b2.a(null)).longValue() + currentTimeMillis) {
            a().L().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C2401n2.s(str), Long.valueOf(currentTimeMillis), Long.valueOf(b52.f17159b));
        }
        a().K().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("trigger_uri", b52.f17158a);
        contentValues.put("source", Integer.valueOf(b52.f17160c));
        contentValues.put("timestamp_millis", Long.valueOf(b52.f17159b));
        try {
            if (B().insert("trigger_uris", null, contentValues) == -1) {
                a().G().b("Failed to insert trigger URI (got -1). appId", C2401n2.s(str));
                return false;
            }
            return true;
        } catch (SQLiteException e8) {
            a().G().c("Error storing trigger URI. appId", C2401n2.s(str), e8);
            return false;
        }
    }

    public final boolean m1() {
        if (C0("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean n0(String str, Long l8, long j8, C2171j2 c2171j2) {
        k();
        r();
        AbstractC1396p.l(c2171j2);
        AbstractC1396p.f(str);
        AbstractC1396p.l(l8);
        byte[] i8 = c2171j2.i();
        a().K().c("Saving complex main event, appId, data size", d().c(str), Integer.valueOf(i8.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("event_id", l8);
        contentValues.put("children_to_process", Long.valueOf(j8));
        contentValues.put("main_event", i8);
        try {
            if (B().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                a().G().b("Failed to insert complex main event (got -1). appId", C2401n2.s(str));
                return false;
            }
            return true;
        } catch (SQLiteException e8) {
            a().G().c("Error storing complex main event. appId", C2401n2.s(str), e8);
            return false;
        }
    }

    public final boolean n1() {
        if (C0("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean o0() {
        return w().getDatabasePath("google_app_measurement.db").exists();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean u() {
        return false;
    }

    public final long v() {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                long j8 = cursor.getLong(0);
                cursor.close();
                return j8;
            } catch (SQLiteException e8) {
                a().G().b("Error querying raw events", e8);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long z() {
        return G("select max(bundle_end_timestamp) from queue", null, 0L);
    }
}
