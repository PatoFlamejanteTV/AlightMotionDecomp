package q5;

import Q5.I;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import c5.C2032B;
import c5.C2036a;
import c5.C2037b;
import c5.C2041f;
import c5.C2047l;
import c5.C2053s;
import c5.C2055u;
import c5.C2057w;
import c5.G;
import c5.L;
import c5.Q;
import c5.W;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: q5.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3791p extends SQLiteOpenHelper {

    /* renamed from: s, reason: collision with root package name */
    public static final a f37286s = new a(null);

    /* renamed from: t, reason: collision with root package name */
    private static C3791p f37287t;

    /* renamed from: a, reason: collision with root package name */
    private SQLiteDatabase f37288a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f37289b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f37290c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f37291d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f37292e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f37293f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f37294g;

    /* renamed from: h, reason: collision with root package name */
    private final String[] f37295h;

    /* renamed from: i, reason: collision with root package name */
    private final String[] f37296i;

    /* renamed from: j, reason: collision with root package name */
    private final String[] f37297j;

    /* renamed from: k, reason: collision with root package name */
    private final String[] f37298k;

    /* renamed from: l, reason: collision with root package name */
    private final String[] f37299l;

    /* renamed from: m, reason: collision with root package name */
    private final String[] f37300m;

    /* renamed from: n, reason: collision with root package name */
    private final String[] f37301n;

    /* renamed from: o, reason: collision with root package name */
    private final String[] f37302o;

    /* renamed from: p, reason: collision with root package name */
    private final String[] f37303p;

    /* renamed from: q, reason: collision with root package name */
    private final String[] f37304q;

    /* renamed from: r, reason: collision with root package name */
    private final AtomicInteger f37305r;

    /* renamed from: q5.p$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final synchronized C3791p a(Context context) {
            C3791p c3791p;
            try {
                AbstractC3292y.i(context, "context");
                if (C3791p.f37287t == null) {
                    C3791p.f37287t = new C3791p(context.getApplicationContext());
                }
                c3791p = C3791p.f37287t;
                AbstractC3292y.f(c3791p);
            } catch (Throwable th) {
                throw th;
            }
            return c3791p;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C3791p(Context context) {
        super(context, "Uptodown.db", (SQLiteDatabase.CursorFactory) null, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID);
        this.f37289b = new String[]{"id", "name", "packagename", "versionCode", "issystemapp", "isSystemService", "urlFicha", "md5", "md5signature", "exclude", "size", "excludeFromTracking", "defaultName", "sha256", "positiveNotified", "appID", "hasOldVersions", "trackInfoRegistered"};
        this.f37290c = new String[]{"id", MBridgeConstans.APP_ID, "md5", "sha256", "size", MBridgeConstans.DYNAMIC_VIEW_WX_PATH};
        this.f37291d = new String[]{"packagename", "versionCode", "versionName", "size", "notified", "nameApkFile", "progress", "ignoreVersion", "filehash", "fileId"};
        this.f37292e = new String[]{"id", "packagename", "apk_name", "progress", "checked", "incomplete", "size", "downloadedSize", "md5", "versioncode", "attempts", "idPrograma", "downloadAnyway", "filehash", "fileId", "md5signature", "supportedAbis", "minsdk", "urlIcon", "appName"};
        this.f37293f = new String[]{"search", CampaignEx.JSON_KEY_TIMESTAMP};
        this.f37294g = new String[]{"id", MBridgeConstans.DYNAMIC_VIEW_WX_PATH};
        this.f37295h = new String[]{"id", CampaignEx.JSON_KEY_TIMESTAMP, CampaignEx.JSON_KEY_TITLE, NotificationCompat.CATEGORY_MESSAGE, "actions", "extra_info"};
        this.f37296i = new String[]{"appId"};
        this.f37297j = new String[]{"appId"};
        this.f37298k = new String[]{"id", "id_program", "name", RewardPlus.ICON, "packagename", "can_download"};
        this.f37299l = new String[]{MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "date"};
        this.f37300m = new String[]{"id", "notificationId", "packagename", "versioncode", "type"};
        this.f37301n = new String[]{"id", "type", "packagename", "versionname_old", "versionname_new", "versioncode_old", "versioncode_new", "size", CampaignEx.JSON_KEY_TIMESTAMP};
        this.f37302o = new String[]{"id", "type", "json", CampaignEx.JSON_KEY_TIMESTAMP};
        this.f37303p = new String[]{"id", CampaignEx.JSON_KEY_TIMESTAMP, "filePath", "attempts"};
        this.f37304q = new String[]{"id", "json", CampaignEx.JSON_KEY_TIMESTAMP};
        this.f37305r = new AtomicInteger();
    }

    private final C2036a O0(Cursor cursor) {
        int i8 = cursor.getInt(0);
        int i9 = cursor.getInt(1);
        String string = cursor.getString(2);
        String string2 = cursor.getString(3);
        AbstractC3292y.f(string);
        AbstractC3292y.f(string2);
        C2036a c2036a = new C2036a(string, Long.parseLong(string2));
        c2036a.i(i8);
        c2036a.h(i9);
        c2036a.j(C2036a.f15718f.a(cursor.getInt(4)));
        return c2036a;
    }

    private final C2041f P0(Cursor cursor) {
        C2041f c2041f = new C2041f();
        c2041f.y0(cursor.getLong(0));
        c2041f.C0(cursor.getString(1));
        c2041f.D0(cursor.getString(2));
        String string = cursor.getString(3);
        AbstractC3292y.h(string, "getString(...)");
        c2041f.N0(Long.parseLong(string));
        c2041f.K0(cursor.getInt(4));
        c2041f.L0(cursor.getInt(5));
        c2041f.M0(cursor.getString(6));
        c2041f.A0(cursor.getString(7));
        c2041f.B0(cursor.getString(8));
        c2041f.t0(cursor.getInt(9));
        String string2 = cursor.getString(10);
        AbstractC3292y.h(string2, "getString(...)");
        c2041f.I0(Long.parseLong(string2));
        c2041f.u0(cursor.getInt(11));
        c2041f.r0(cursor.getString(12));
        c2041f.G0(cursor.getString(13));
        c2041f.F0(cursor.getInt(14));
        c2041f.q0(cursor.getLong(15));
        c2041f.x0(cursor.getInt(16));
        return c2041f;
    }

    private final C2055u Q0(Cursor cursor) {
        cursor.getInt(0);
        cursor.getInt(1);
        C2055u c2055u = new C2055u();
        c2055u.g(cursor.getString(2));
        c2055u.h(cursor.getString(3));
        String string = cursor.getString(4);
        AbstractC3292y.h(string, "getString(...)");
        c2055u.i(Long.parseLong(string));
        c2055u.f(cursor.getString(5));
        return c2055u;
    }

    private final C2041f R0(Cursor cursor) {
        C2041f c2041f = new C2041f();
        c2041f.C0(cursor.getString(0));
        c2041f.D0(cursor.getString(1));
        String string = cursor.getString(2);
        AbstractC3292y.h(string, "getString(...)");
        c2041f.N0(Long.parseLong(string));
        c2041f.K0(cursor.getInt(3));
        c2041f.M0(cursor.getString(4));
        c2041f.A0(cursor.getString(5));
        c2041f.B0(cursor.getString(6));
        c2041f.t0(cursor.getInt(7));
        String string2 = cursor.getString(8);
        AbstractC3292y.h(string2, "getString(...)");
        c2041f.I0(Long.parseLong(string2));
        c2041f.u0(cursor.getInt(9));
        c2041f.r0(cursor.getString(10));
        c2041f.G0(cursor.getString(11));
        c2041f.F0(cursor.getInt(12));
        return c2041f;
    }

    private final c5.r S0(Cursor cursor) {
        c5.r rVar = new c5.r();
        rVar.y0(cursor.getInt(0));
        rVar.E0(cursor.getString(1));
        rVar.D0(cursor.getString(2));
        rVar.F0(cursor.getInt(3));
        rVar.s0(cursor.getInt(4));
        rVar.z0(cursor.getInt(5));
        rVar.G0(cursor.getLong(6));
        if (rVar.a0() < 0) {
            rVar.G0(0L);
        }
        rVar.v0(cursor.getLong(7));
        rVar.A0(cursor.getString(8));
        String string = cursor.getString(9);
        AbstractC3292y.h(string, "getString(...)");
        rVar.J0(Long.parseLong(string));
        rVar.r0(cursor.getInt(10));
        rVar.p0(cursor.getLong(11));
        rVar.t0(cursor.getInt(12));
        rVar.x0(cursor.getString(13));
        rVar.w0(cursor.getString(14));
        rVar.B0(cursor.getString(15));
        rVar.H0(cursor.getString(16));
        rVar.C0(cursor.getInt(17));
        rVar.I0(cursor.getString(18));
        rVar.q0(cursor.getString(19));
        return rVar;
    }

    private final C2053s T0(Cursor cursor) {
        C2053s c2053s = new C2053s();
        c2053s.d(cursor.getLong(0));
        c2053s.e(cursor.getString(1));
        c2053s.f(cursor.getLong(2));
        return c2053s;
    }

    private final C2057w U0(Cursor cursor) {
        C2057w c2057w = new C2057w();
        c2057w.g(cursor.getInt(0));
        c2057w.h(cursor.getString(1));
        c2057w.f(cursor.getString(2));
        c2057w.e(cursor.getInt(3));
        return c2057w;
    }

    private final c5.H V0(Cursor cursor) {
        c5.H h8 = new c5.H();
        h8.c(cursor.getString(0));
        h8.d(cursor.getString(1));
        return h8;
    }

    private final ArrayList W(SQLiteDatabase sQLiteDatabase) {
        this.f37288a = sQLiteDatabase;
        return h(new String[]{"name", "packagename", "versionCode", "issystemapp", "urlFicha", "md5", "md5signature", "exclude", "size", "excludeFromTracking", "defaultName", "sha256", "positiveNotified"});
    }

    private final L W0(Cursor cursor) {
        int i8 = cursor.getInt(0);
        String string = cursor.getString(1);
        String string2 = cursor.getString(2);
        String string3 = cursor.getString(3);
        AbstractC3292y.f(string);
        AbstractC3292y.f(string2);
        L l8 = new L(string, string2);
        l8.g(i8);
        AbstractC3292y.f(string3);
        l8.h(Long.parseLong(string3));
        return l8;
    }

    private final Q X0(Cursor cursor) {
        String string = cursor.getString(0);
        AbstractC3292y.f(string);
        Q q8 = new Q(string);
        String string2 = cursor.getString(1);
        AbstractC3292y.h(string2, "getString(...)");
        q8.Z(Long.parseLong(string2));
        q8.a0(cursor.getString(2));
        String string3 = cursor.getString(3);
        AbstractC3292y.h(string3, "getString(...)");
        q8.Y(Long.parseLong(string3));
        q8.W(cursor.getInt(4));
        q8.U(cursor.getString(5));
        q8.X(cursor.getInt(6));
        q8.I(cursor.getInt(7));
        q8.z(cursor.getString(8));
        q8.y(cursor.getString(9));
        return q8;
    }

    private final void c1(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            A0((C2041f) next);
        }
    }

    private final void d1(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            N0((W) next);
        }
    }

    private final ArrayList h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("apps", strArr, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                arrayList.add(R0(cursor));
                while (cursor.moveToNext()) {
                    AbstractC3292y.f(cursor);
                    arrayList.add(R0(cursor));
                }
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    private final ArrayList v1() {
        String[] strArr = {"id", "id_program", "name", RewardPlus.ICON, "packagename"};
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("wishlist", strArr, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                W.a aVar = W.f15707h;
                AbstractC3292y.f(cursor);
                arrayList.add(aVar.b(cursor));
                while (cursor.moveToNext()) {
                    W.a aVar2 = W.f15707h;
                    AbstractC3292y.f(cursor);
                    arrayList.add(aVar2.b(cursor));
                }
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    private final ArrayList w0(SQLiteDatabase sQLiteDatabase) {
        this.f37288a = sQLiteDatabase;
        return v1();
    }

    private final I x0() {
        this.f37288a = getWritableDatabase();
        return I.f8786a;
    }

    public final C2041f A0(C2041f app) {
        AbstractC3292y.i(app, "app");
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", app.z());
        contentValues.put("packagename", app.Q());
        contentValues.put("versionCode", Long.valueOf(app.f0()));
        contentValues.put("issystemapp", Integer.valueOf(app.k0()));
        contentValues.put("isSystemService", Integer.valueOf(app.m0()));
        contentValues.put("urlFicha", app.e0());
        contentValues.put("md5", app.w());
        contentValues.put("md5signature", app.x());
        contentValues.put("exclude", Integer.valueOf(app.i()));
        contentValues.put("size", String.valueOf(app.Z()));
        contentValues.put("excludeFromTracking", Integer.valueOf(app.l()));
        contentValues.put("defaultName", app.f());
        contentValues.put("sha256", app.X());
        contentValues.put("positiveNotified", Integer.valueOf(app.W()));
        contentValues.put("appID", Long.valueOf(app.b()));
        contentValues.put("hasOldVersions", Integer.valueOf(app.s()));
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        app.y0(sQLiteDatabase.insert("apps", null, contentValues));
        return app;
    }

    public final int B(String name) {
        AbstractC3292y.i(name, "name");
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("downloads", "apk_name=?", new String[]{name});
    }

    public final long B0(long j8, C2055u appFile) {
        AbstractC3292y.i(appFile, "appFile");
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, String.valueOf(j8));
        contentValues.put("md5", appFile.b());
        contentValues.put("sha256", appFile.d());
        contentValues.put("size", String.valueOf(appFile.e()));
        contentValues.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, appFile.a());
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.insert("app_files", null, contentValues);
    }

    public final void C0(C2047l deepLink) {
        AbstractC3292y.i(deepLink, "deepLink");
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, deepLink.e());
        contentValues.put("date", deepLink.a());
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.insert("deep_link_files", null, contentValues);
    }

    public final c5.r D0(c5.r download) {
        AbstractC3292y.i(download, "download");
        ContentValues contentValues = new ContentValues();
        contentValues.put("packagename", download.Y());
        contentValues.put("apk_name", download.X());
        contentValues.put("progress", Integer.valueOf(download.Z()));
        contentValues.put("checked", Integer.valueOf(download.p()));
        contentValues.put("incomplete", Integer.valueOf(download.z()));
        contentValues.put("size", Long.valueOf(download.a0()));
        contentValues.put("downloadedSize", Long.valueOf(download.u()));
        contentValues.put("md5", download.Q());
        contentValues.put("versioncode", Long.valueOf(download.e0()));
        contentValues.put("attempts", Integer.valueOf(download.l()));
        contentValues.put("idPrograma", Long.valueOf(download.h()));
        contentValues.put("downloadAnyway", Integer.valueOf(download.s()));
        contentValues.put("filehash", download.x());
        contentValues.put("fileId", download.w());
        contentValues.put("md5signature", download.U());
        contentValues.put("supportedAbis", download.b0());
        contentValues.put("minsdk", Integer.valueOf(download.W()));
        contentValues.put("urlIcon", download.d0());
        contentValues.put("appName", download.i());
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        download.y0((int) sQLiteDatabase.insert("downloads", null, contentValues));
        return download;
    }

    public final int E(long j8) {
        String[] strArr = {String.valueOf(j8)};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("events", "id=?", strArr);
    }

    public final void E0(C2053s event) {
        AbstractC3292y.i(event, "event");
        ContentValues contentValues = new ContentValues();
        contentValues.put("json", event.b());
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(event.c()));
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.insert("events", null, contentValues);
    }

    public final int F(String path) {
        AbstractC3292y.i(path, "path");
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("installable_files", "path=?", new String[]{path});
    }

    public final void F0(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str);
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.insert("installable_files", null, contentValues);
    }

    public final int G(int i8) {
        String[] strArr = {String.valueOf(i8)};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("installationAttempts", "id=?", strArr);
    }

    public final void G0(C2057w installationAttempt) {
        AbstractC3292y.i(installationAttempt, "installationAttempt");
        ContentValues contentValues = new ContentValues();
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, installationAttempt.d());
        contentValues.put("filePath", installationAttempt.b());
        contentValues.put("attempts", String.valueOf(installationAttempt.a()));
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.insert("installationAttempts", null, contentValues);
    }

    public final int H(int i8) {
        String[] strArr = {String.valueOf(i8)};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("notifications", "id=?", strArr);
    }

    public final void H0(C2032B notificationRegistry) {
        AbstractC3292y.i(notificationRegistry, "notificationRegistry");
        ContentValues contentValues = new ContentValues();
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, notificationRegistry.e());
        contentValues.put(CampaignEx.JSON_KEY_TITLE, notificationRegistry.f());
        contentValues.put(NotificationCompat.CATEGORY_MESSAGE, notificationRegistry.d());
        contentValues.put("actions", notificationRegistry.a());
        contentValues.put("extra_info", notificationRegistry.b());
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.insert("notifications", null, contentValues);
    }

    public final int I() {
        String[] strArr = {String.valueOf(System.currentTimeMillis() - 2592000000L)};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("events", "timestamp < ?", strArr);
    }

    public final void I0(Q update) {
        AbstractC3292y.i(update, "update");
        if (s0(update.s()) == null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("packagename", update.s());
            contentValues.put("versionCode", Long.valueOf(update.w()));
            contentValues.put("versionName", update.x());
            contentValues.put("size", String.valueOf(update.v()));
            contentValues.put("notified", Integer.valueOf(update.p()));
            contentValues.put("nameApkFile", update.l());
            contentValues.put("progress", Integer.valueOf(update.u()));
            contentValues.put("ignoreVersion", Integer.valueOf(update.h()));
            contentValues.put("filehash", update.f());
            contentValues.put("fileId", update.b());
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            sQLiteDatabase.insert("updates", null, contentValues);
            return;
        }
        p1(update);
    }

    public final int J(int i8) {
        int k02 = k0(i8);
        if (k02 > 0) {
            String[] strArr = {String.valueOf(k02)};
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            return sQLiteDatabase.delete("notifications", "id<=?", strArr);
        }
        return 0;
    }

    public final void J0(c5.G preRegister) {
        AbstractC3292y.i(preRegister, "preRegister");
        ContentValues contentValues = new ContentValues();
        contentValues.put("appId", Long.valueOf(preRegister.b()));
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.insert("preregistrations", null, contentValues);
    }

    public final int K(String query) {
        AbstractC3292y.i(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("recent_searches", "search=?", new String[]{query});
    }

    public final void K0(c5.G preRegister) {
        AbstractC3292y.i(preRegister, "preRegister");
        ContentValues contentValues = new ContentValues();
        contentValues.put("appId", Long.valueOf(preRegister.b()));
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.insert("preregistrations_to_notify", null, contentValues);
    }

    public final int L(String type) {
        AbstractC3292y.i(type, "type");
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("responses", "type=?", new String[]{type});
    }

    public final void L0(c5.H recentSearch) {
        AbstractC3292y.i(recentSearch, "recentSearch");
        ContentValues contentValues = new ContentValues();
        contentValues.put("search", recentSearch.a());
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, recentSearch.b());
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.insert("recent_searches", null, contentValues);
    }

    public final int M(String packagename) {
        AbstractC3292y.i(packagename, "packagename");
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("updates", "packagename=?", new String[]{packagename});
    }

    public final void M0(L response) {
        AbstractC3292y.i(response, "response");
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", response.e());
        contentValues.put("json", response.b());
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, String.valueOf(response.d()));
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.insert("responses", null, contentValues);
    }

    public final void N() {
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.delete("updates", null, null);
    }

    public final void N0(W wishlist) {
        AbstractC3292y.i(wishlist, "wishlist");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id_program", Long.valueOf(wishlist.a()));
        contentValues.put("name", wishlist.e());
        contentValues.put(RewardPlus.ICON, wishlist.d());
        contentValues.put("packagename", wishlist.f());
        contentValues.put("can_download", Integer.valueOf(wishlist.b()));
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.insert("wishlist", null, contentValues);
    }

    public final C2036a O(int i8) {
        Cursor cursor;
        C2036a c2036a;
        try {
            String[] strArr = {String.valueOf(i8)};
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("active_notifications", this.f37300m, "notificationId=?", strArr, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                c2036a = O0(cursor);
            } else {
                c2036a = null;
            }
            cursor.close();
            return c2036a;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final C2036a P(String packageName, long j8) {
        Cursor cursor;
        C2036a c2036a;
        AbstractC3292y.i(packageName, "packageName");
        try {
            String[] strArr = {packageName, String.valueOf(j8)};
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("active_notifications", this.f37300m, "packagename=? AND versioncode=?", strArr, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                c2036a = O0(cursor);
            } else {
                c2036a = null;
            }
            cursor.close();
            return c2036a;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final C2036a Q(int i8) {
        Cursor cursor;
        C2036a c2036a;
        try {
            String[] strArr = {String.valueOf(i8)};
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("active_notifications", this.f37300m, "id=?", strArr, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                c2036a = O0(cursor);
            } else {
                c2036a = null;
            }
            cursor.close();
            return c2036a;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final ArrayList R() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("active_notifications", this.f37300m, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                arrayList.add(O0(cursor));
                while (cursor.moveToNext()) {
                    AbstractC3292y.f(cursor);
                    arrayList.add(O0(cursor));
                }
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final C2041f S(String packagename) {
        Cursor cursor;
        C2041f c2041f;
        AbstractC3292y.i(packagename, "packagename");
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("apps", this.f37289b, "packagename=?", new String[]{packagename}, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                c2041f = P0(cursor);
            } else {
                c2041f = null;
            }
            cursor.close();
            return c2041f;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final ArrayList T(long j8) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            String[] strArr = {String.valueOf(j8)};
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("app_files", this.f37290c, "app_id=?", strArr, null, null, null);
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                arrayList.add(Q0(cursor));
                while (cursor.moveToNext()) {
                    AbstractC3292y.f(cursor);
                    arrayList.add(Q0(cursor));
                }
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final ArrayList U(C2041f app) {
        AbstractC3292y.i(app, "app");
        if (app.u() >= 0) {
            return T(app.u());
        }
        if (app.Q() != null) {
            String Q8 = app.Q();
            AbstractC3292y.f(Q8);
            C2041f S8 = S(Q8);
            if (S8 != null) {
                return T(S8.u());
            }
            return null;
        }
        return null;
    }

    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("apps", this.f37289b, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                arrayList.add(P0(cursor));
                while (cursor.moveToNext()) {
                    AbstractC3292y.f(cursor);
                    arrayList.add(P0(cursor));
                }
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final ArrayList X() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("deep_link_files", this.f37299l, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                C2047l c2047l = new C2047l();
                c2047l.h(cursor.getString(0));
                c2047l.f(cursor.getString(1));
                arrayList.add(c2047l);
            }
            while (cursor.moveToNext()) {
                C2047l c2047l2 = new C2047l();
                c2047l2.h(cursor.getString(0));
                c2047l2.f(cursor.getString(1));
                arrayList.add(c2047l2);
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final c5.r Y(String filename) {
        Cursor cursor;
        c5.r rVar;
        AbstractC3292y.i(filename, "filename");
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("downloads", this.f37292e, "apk_name=?", new String[]{filename}, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                rVar = S0(cursor);
            } else {
                rVar = null;
            }
            cursor.close();
            return rVar;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final int Y0() {
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("preregistrations", null, null);
    }

    public final c5.r Z(String fileId) {
        Cursor cursor;
        c5.r rVar;
        AbstractC3292y.i(fileId, "fileId");
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("downloads", this.f37292e, "fileId=?", new String[]{fileId}, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                rVar = S0(cursor);
            } else {
                rVar = null;
            }
            cursor.close();
            return rVar;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final int Z0(long j8) {
        String[] strArr = {String.valueOf(j8)};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("preregistrations", "appId=?", strArr);
    }

    public final synchronized void a() {
        if (this.f37305r.incrementAndGet() == 1) {
            C3791p c3791p = f37287t;
            AbstractC3292y.f(c3791p);
            c3791p.x0();
        }
    }

    public final c5.r a0(String packagename) {
        Cursor cursor;
        c5.r rVar;
        AbstractC3292y.i(packagename, "packagename");
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("downloads", this.f37292e, "packagename=?", new String[]{packagename}, null, null, "versioncode DESC");
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                rVar = S0(cursor);
            } else {
                rVar = null;
            }
            cursor.close();
            return rVar;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final int a1(long j8) {
        String[] strArr = {String.valueOf(j8)};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("preregistrations_to_notify", "appId=?", strArr);
    }

    public final c5.r b0(String packagename, long j8) {
        Cursor cursor;
        c5.r rVar;
        AbstractC3292y.i(packagename, "packagename");
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("downloads", this.f37292e, "packagename=? AND versioncode=?", new String[]{packagename, String.valueOf(j8)}, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                rVar = S0(cursor);
            } else {
                rVar = null;
            }
            cursor.close();
            return rVar;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final int b1(long j8) {
        String[] strArr = {String.valueOf(j8)};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("wishlist", "id_program=?", strArr);
    }

    public final ArrayList c0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("downloads", this.f37292e, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                arrayList.add(S0(cursor));
            }
            while (cursor.moveToNext()) {
                AbstractC3292y.f(cursor);
                arrayList.add(S0(cursor));
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final ArrayList d0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("events", this.f37304q, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                arrayList.add(T0(cursor));
                while (cursor.moveToNext()) {
                    AbstractC3292y.f(cursor);
                    arrayList.add(T0(cursor));
                }
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final ArrayList e0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("installable_files", this.f37294g, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                arrayList.add(cursor.getString(1));
            }
            while (cursor.moveToNext()) {
                arrayList.add(cursor.getString(1));
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final c5.r e1(int i8) {
        Cursor cursor;
        c5.r rVar;
        try {
            String[] strArr = {String.valueOf(i8)};
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("downloads", this.f37292e, "id=?", strArr, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                rVar = S0(cursor);
            } else {
                rVar = null;
            }
            cursor.close();
            return rVar;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final C2057w f0(String filePath) {
        C2057w c2057w;
        Cursor query;
        AbstractC3292y.i(filePath, "filePath");
        Cursor cursor = null;
        r0 = null;
        C2057w c2057w2 = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            query = sQLiteDatabase.query("installationAttempts", this.f37303p, "filePath=?", new String[]{filePath}, null, null, null);
        } catch (Exception e8) {
            e = e8;
            c2057w = null;
        }
        try {
            if (query.moveToFirst()) {
                AbstractC3292y.f(query);
                c2057w2 = U0(query);
            }
            query.close();
            return c2057w2;
        } catch (Exception e9) {
            e = e9;
            C2057w c2057w3 = c2057w2;
            cursor = query;
            c2057w = c2057w3;
            e.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            return c2057w;
        }
    }

    public final void f1() {
        ContentValues contentValues = new ContentValues();
        contentValues.putNull("urlFicha");
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.update("apps", contentValues, null, null);
    }

    public final ArrayList g0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("installationAttempts", this.f37303p, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                arrayList.add(U0(cursor));
                while (cursor.moveToNext()) {
                    AbstractC3292y.f(cursor);
                    arrayList.add(U0(cursor));
                }
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final void g1() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("checked", (Integer) 1);
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.update("downloads", contentValues, null, null);
    }

    public final C2032B h0() {
        C2032B c2032b;
        Cursor query;
        Cursor cursor = null;
        r0 = null;
        C2032B c2032b2 = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            query = sQLiteDatabase.query("notifications", this.f37295h, "actions=?", new String[]{"update_uptodown"}, null, null, "id DESC");
        } catch (Exception e8) {
            e = e8;
            c2032b = null;
        }
        try {
            if (query.moveToFirst()) {
                C2032B c2032b3 = new C2032B();
                AbstractC3292y.f(query);
                c2032b3.g(query);
                c2032b2 = c2032b3;
            }
            query.close();
            return c2032b2;
        } catch (Exception e9) {
            e = e9;
            c2032b = c2032b2;
            cursor = query;
            e.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            return c2032b;
        }
    }

    public final void h1(C2041f app) {
        AbstractC3292y.i(app, "app");
        ContentValues contentValues = new ContentValues();
        contentValues.put("exclude", Integer.valueOf(app.i()));
        String[] strArr = {app.Q()};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.update("apps", contentValues, "packagename=?", strArr);
    }

    public final synchronized void i() {
        try {
            if (this.f37305r.decrementAndGet() == 0) {
                C3791p c3791p = f37287t;
                AbstractC3292y.f(c3791p);
                c3791p.close();
            } else if (this.f37305r.get() < 0) {
                this.f37305r.set(0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int i0() {
        Exception e8;
        int i8;
        int i9 = 0;
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("active_notifications", new String[]{"notificationId"}, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                i8 = cursor.getInt(0);
                while (cursor.moveToNext()) {
                    try {
                        int i10 = cursor.getInt(0);
                        if (i10 > i8) {
                            i8 = i10;
                        }
                    } catch (Exception e9) {
                        e8 = e9;
                        e8.printStackTrace();
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        return i8;
                    }
                }
                i9 = i8;
            }
        } catch (Exception e10) {
            e8 = e10;
            i8 = 0;
        }
        try {
            cursor.close();
            return i9;
        } catch (Exception e11) {
            i8 = i9;
            e8 = e11;
            e8.printStackTrace();
            if (cursor != null) {
                cursor.close();
            }
            return i8;
        }
    }

    public final void i1() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("trackInfoRegistered", (Integer) 1);
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.update("apps", contentValues, null, null);
    }

    public final int j() {
        int i8 = 0;
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.rawQuery("SELECT COUNT(id) AS count FROM notifications", null);
            if (cursor.moveToFirst()) {
                i8 = cursor.getInt(0);
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return i8;
    }

    public final int j0() {
        String[] strArr = {"id"};
        int i8 = 0;
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("apps", strArr, "trackInfoRegistered=0", null, null, null, null);
            i8 = cursor.getCount();
            cursor.close();
            return i8;
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
                return i8;
            }
            return i8;
        }
    }

    public final void j1(C2036a activeNotification) {
        AbstractC3292y.i(activeNotification, "activeNotification");
        String[] strArr = {String.valueOf(activeNotification.b())};
        ContentValues contentValues = new ContentValues();
        contentValues.put("notificationId", Integer.valueOf(activeNotification.a()));
        contentValues.put("packagename", activeNotification.c());
        contentValues.put("versioncode", Long.valueOf(activeNotification.e()));
        contentValues.put("type", Integer.valueOf(activeNotification.d().ordinal()));
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.update("active_notifications", contentValues, "id=?", strArr);
    }

    public final int k(C2036a activeNotification) {
        AbstractC3292y.i(activeNotification, "activeNotification");
        if (activeNotification.b() > -1) {
            String[] strArr = {String.valueOf(activeNotification.b())};
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            return sQLiteDatabase.delete("active_notifications", "id=?", strArr);
        }
        if (activeNotification.a() > -1) {
            String[] strArr2 = {String.valueOf(activeNotification.a())};
            SQLiteDatabase sQLiteDatabase2 = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase2);
            return sQLiteDatabase2.delete("active_notifications", "notificationId=?", strArr2);
        }
        if (activeNotification.c().length() > 0) {
            String[] strArr3 = {activeNotification.c()};
            SQLiteDatabase sQLiteDatabase3 = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase3);
            return sQLiteDatabase3.delete("active_notifications", "packagename=?", strArr3);
        }
        return 0;
    }

    public final int k0(int i8) {
        int i9 = 0;
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.rawQuery("SELECT id FROM notifications ORDER BY id DESC LIMIT " + i8 + ",1", null);
            if (cursor.moveToFirst()) {
                i9 = cursor.getInt(0);
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return i9;
    }

    public final void k1(C2041f app) {
        AbstractC3292y.i(app, "app");
        ContentValues contentValues = new ContentValues();
        if (app.z() != null) {
            contentValues.put("name", app.z());
        }
        if (app.f0() > 0) {
            contentValues.put("versionCode", Long.valueOf(app.f0()));
        }
        contentValues.put("issystemapp", Integer.valueOf(app.k0()));
        contentValues.put("isSystemService", Integer.valueOf(app.m0()));
        if (app.e0() != null) {
            contentValues.put("urlFicha", app.e0());
        }
        if (app.w() != null) {
            contentValues.put("md5", app.w());
        }
        if (app.x() != null) {
            contentValues.put("md5signature", app.x());
        }
        contentValues.put("exclude", Integer.valueOf(app.i()));
        contentValues.put("size", String.valueOf(app.Z()));
        contentValues.put("excludeFromTracking", Integer.valueOf(app.l()));
        if (app.f() != null) {
            contentValues.put("defaultName", app.f());
        }
        if (app.X() != null) {
            contentValues.put("sha256", app.X());
        }
        contentValues.put("positiveNotified", Integer.valueOf(app.W()));
        contentValues.put("appID", Long.valueOf(app.b()));
        contentValues.put("hasOldVersions", Integer.valueOf(app.s()));
        String[] strArr = {app.Q()};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.update("apps", contentValues, "packagename=?", strArr);
    }

    public final ArrayList l0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("notifications", this.f37295h, null, null, null, null, "id DESC");
            if (cursor.moveToFirst()) {
                C2032B c2032b = new C2032B();
                AbstractC3292y.f(cursor);
                c2032b.g(cursor);
                arrayList.add(c2032b);
            }
            while (cursor.moveToNext()) {
                C2032B c2032b2 = new C2032B();
                AbstractC3292y.f(cursor);
                c2032b2.g(cursor);
                arrayList.add(c2032b2);
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final void l1(C2041f app) {
        AbstractC3292y.i(app, "app");
        ContentValues contentValues = new ContentValues();
        contentValues.put("excludeFromTracking", Integer.valueOf(app.l()));
        String[] strArr = {app.Q()};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.update("apps", contentValues, "packagename=?", strArr);
    }

    public final c5.G m0(long j8) {
        Cursor cursor;
        c5.G g8;
        try {
            String[] strArr = {String.valueOf(j8)};
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("preregistrations", this.f37296i, "appId=?", strArr, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                G.a aVar = c5.G.f15593e;
                AbstractC3292y.f(cursor);
                g8 = aVar.c(cursor);
            } else {
                g8 = null;
            }
            cursor.close();
            return g8;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final int m1(C2055u appFile) {
        AbstractC3292y.i(appFile, "appFile");
        ContentValues contentValues = new ContentValues();
        contentValues.put("md5", appFile.b());
        contentValues.put("sha256", appFile.d());
        String[] strArr = {appFile.a()};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.update("app_files", contentValues, "path=?", strArr);
    }

    public final c5.G n0(long j8) {
        Cursor cursor;
        c5.G g8;
        try {
            String[] strArr = {String.valueOf(j8)};
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("preregistrations_to_notify", this.f37297j, "appId=?", strArr, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                G.a aVar = c5.G.f15593e;
                AbstractC3292y.f(cursor);
                g8 = aVar.c(cursor);
            } else {
                g8 = null;
            }
            cursor.close();
            return g8;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final void n1(C2041f app) {
        AbstractC3292y.i(app, "app");
        ContentValues contentValues = new ContentValues();
        if (app.w() != null) {
            contentValues.put("md5", app.w());
        }
        contentValues.put("size", String.valueOf(app.Z()));
        String[] strArr = {app.Q()};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.update("apps", contentValues, "packagename=?", strArr);
    }

    public final ArrayList o0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("preregistrations", this.f37296i, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                c5.G g8 = new c5.G();
                AbstractC3292y.f(cursor);
                g8.f(cursor);
                arrayList.add(g8);
            }
            while (cursor.moveToNext()) {
                c5.G g9 = new c5.G();
                AbstractC3292y.f(cursor);
                g9.f(cursor);
                arrayList.add(g9);
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final void o1(C2041f app) {
        AbstractC3292y.i(app, "app");
        ContentValues contentValues = new ContentValues();
        if (app.X() != null) {
            contentValues.put("sha256", app.X());
        }
        String[] strArr = {app.Q()};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.update("apps", contentValues, "packagename=?", strArr);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase mSQLiteDatabase) {
        AbstractC3292y.i(mSQLiteDatabase, "mSQLiteDatabase");
        this.f37288a = mSQLiteDatabase;
        AbstractC3292y.f(mSQLiteDatabase);
        mSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS updates(id integer primary key autoincrement, packagename text, versionCode text, versionName text, size text, notified integer default 0, nameApkFile text, progress integer default 0, ignoreVersion integer default 0, filehash text, fileId text);");
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS apps( id integer primary key autoincrement, name text, packagename text, versionCode text, issystemapp integer default 0, isSystemService integer default 0, urlFicha text, md5 text, md5signature text, exclude integer default 0, size text, excludeFromTracking integer default 0, defaultName text, sha256 text, positiveNotified integer default 0, appID integer default 0, hasOldVersions integer default 0, trackInfoRegistered integer default 0);");
        SQLiteDatabase sQLiteDatabase2 = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase2);
        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS app_files( id integer primary key autoincrement, app_id integer, md5 text, sha256 text, size text, path text);");
        SQLiteDatabase sQLiteDatabase3 = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase3);
        sQLiteDatabase3.execSQL("CREATE TABLE IF NOT EXISTS downloads(id integer primary key autoincrement, packagename text, apk_name text, progress integer default 0, checked integer default 0, incomplete integer default 0, size integer default 0, downloadedSize integer default 0, md5 text, versioncode integer default 0, attempts integer default 0, idPrograma integer default 0, downloadAnyway integer default 0, filehash text, fileId integer default 0, md5signature text, supportedAbis text, minsdk integer default 0, urlIcon text, appName text);");
        SQLiteDatabase sQLiteDatabase4 = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase4);
        sQLiteDatabase4.execSQL("CREATE TABLE IF NOT EXISTS recent_searches(id integer primary key autoincrement, search text unique, timestamp text);");
        SQLiteDatabase sQLiteDatabase5 = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase5);
        sQLiteDatabase5.execSQL("CREATE TABLE IF NOT EXISTS installable_files(id integer primary key autoincrement, path text);");
        SQLiteDatabase sQLiteDatabase6 = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase6);
        sQLiteDatabase6.execSQL("CREATE TABLE IF NOT EXISTS notifications(id integer primary key autoincrement, timestamp text, title text, msg text, actions text, extra_info text);");
        SQLiteDatabase sQLiteDatabase7 = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase7);
        sQLiteDatabase7.execSQL("CREATE TABLE IF NOT EXISTS wishlist(id integer primary key autoincrement, id_program integer, name text, icon text, packagename text, can_download integer);");
        SQLiteDatabase sQLiteDatabase8 = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase8);
        sQLiteDatabase8.execSQL("CREATE TABLE IF NOT EXISTS deep_link_files(id integer primary key autoincrement, path text, date text);");
        SQLiteDatabase sQLiteDatabase9 = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase9);
        sQLiteDatabase9.execSQL("CREATE TABLE IF NOT EXISTS active_notifications(id integer primary key autoincrement, notificationId integer, packagename text, versioncode integer, type integer);");
        SQLiteDatabase sQLiteDatabase10 = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase10);
        sQLiteDatabase10.execSQL("CREATE TABLE IF NOT EXISTS activity_log(id integer primary key autoincrement, type integer, packagename text, versionname_old text, versionname_new text, versioncode_old text, versioncode_new text, size text, timestamp text);");
        SQLiteDatabase sQLiteDatabase11 = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase11);
        sQLiteDatabase11.execSQL("CREATE TABLE IF NOT EXISTS responses(id integer primary key autoincrement, type integer, json text, timestamp text);");
        SQLiteDatabase sQLiteDatabase12 = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase12);
        sQLiteDatabase12.execSQL("CREATE TABLE IF NOT EXISTS installationAttempts(id integer primary key autoincrement, timestamp text, filePath text, attempts integer);");
        SQLiteDatabase sQLiteDatabase13 = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase13);
        sQLiteDatabase13.execSQL("CREATE TABLE IF NOT EXISTS events(id integer primary key autoincrement, json text, timestamp integer);");
        SQLiteDatabase sQLiteDatabase14 = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase14);
        sQLiteDatabase14.execSQL("CREATE TABLE IF NOT EXISTS preregistrations(id integer primary key autoincrement, appId integer);");
        SQLiteDatabase sQLiteDatabase15 = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase15);
        sQLiteDatabase15.execSQL("CREATE TABLE IF NOT EXISTS preregistrations_to_notify(id integer primary key autoincrement, appId integer);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i8, int i9) {
        AbstractC3292y.i(sqLiteDatabase, "sqLiteDatabase");
        if (i8 < 387) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS downloads");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloads(id integer primary key autoincrement, packagename text, apk_name text, progress integer default 0, checked integer default 0, incomplete integer default 0, size integer default 0, downloadedSize integer default 0, md5 text, versioncode integer default 0, attempts integer default 0, idPrograma integer default 0, downloadAnyway integer default 0, filehash text, fileId integer default 0, md5signature text, supportedAbis text, minsdk integer default 0, urlIcon text, appName text);");
        }
        if (i8 < 318) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS recent_searches(id integer primary key autoincrement, search text unique, timestamp text);");
        }
        if (i8 < 393) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS installable_files(id integer primary key autoincrement, path text);");
        }
        if (i8 < 442) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS notifications(id integer primary key autoincrement, timestamp text, title text, msg text, actions text, extra_info text);");
        }
        if (i8 < 451) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS wishlist(id integer primary key autoincrement, id_program integer, name text, icon text, packagename text, can_download integer);");
        } else if (i8 < 455) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS wishlist");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS wishlist(id integer primary key autoincrement, id_program integer, name text, icon text, packagename text, can_download integer);");
        }
        if (i8 < 471) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS app_files( id integer primary key autoincrement, app_id integer, md5 text, sha256 text, size text, path text);");
        }
        if (i8 < 484) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS deep_link_files(id integer primary key autoincrement, path text, date text);");
        }
        if (i8 < 487) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS deep_link_files");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS deep_link_files(id integer primary key autoincrement, path text, date text);");
        }
        if (i8 < 508) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS active_notifications(id integer primary key autoincrement, notificationId integer, packagename text, versioncode integer, type integer);");
        }
        if (i8 < 512) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS activity_log(id integer primary key autoincrement, type integer, packagename text, versionname_old text, versionname_new text, versioncode_old text, versioncode_new text, size text, timestamp text);");
        }
        if (i8 < 544) {
            ArrayList W8 = W(sqLiteDatabase);
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS apps");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS apps( id integer primary key autoincrement, name text, packagename text, versionCode text, issystemapp integer default 0, isSystemService integer default 0, urlFicha text, md5 text, md5signature text, exclude integer default 0, size text, excludeFromTracking integer default 0, defaultName text, sha256 text, positiveNotified integer default 0, appID integer default 0, hasOldVersions integer default 0, trackInfoRegistered integer default 0);");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS app_files");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS app_files( id integer primary key autoincrement, app_id integer, md5 text, sha256 text, size text, path text);");
            c1(W8);
        }
        if (i8 < 550) {
            ArrayList w02 = w0(sqLiteDatabase);
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS wishlist");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS wishlist(id integer primary key autoincrement, id_program integer, name text, icon text, packagename text, can_download integer);");
            d1(w02);
        }
        if (i8 < 553) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS responses(id integer primary key autoincrement, type integer, json text, timestamp text);");
        }
        if (i8 < 556) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS installationAttempts(id integer primary key autoincrement, timestamp text, filePath text, attempts integer);");
        }
        if (i8 < 574) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS downloads");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloads(id integer primary key autoincrement, packagename text, apk_name text, progress integer default 0, checked integer default 0, incomplete integer default 0, size integer default 0, downloadedSize integer default 0, md5 text, versioncode integer default 0, attempts integer default 0, idPrograma integer default 0, downloadAnyway integer default 0, filehash text, fileId integer default 0, md5signature text, supportedAbis text, minsdk integer default 0, urlIcon text, appName text);");
        }
        if (i8 < 576) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events(id integer primary key autoincrement, json text, timestamp integer);");
        }
        if (i8 < 580) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preregistrations(id integer primary key autoincrement, appId integer);");
        }
        if (i8 < 589) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preregistrations_to_notify(id integer primary key autoincrement, appId integer);");
        }
        if (i8 < 612) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS app_files");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS app_files( id integer primary key autoincrement, app_id integer, md5 text, sha256 text, size text, path text);");
        }
    }

    public final int p() {
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("notifications", null, null);
    }

    public final ArrayList p0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("preregistrations_to_notify", this.f37297j, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                c5.G g8 = new c5.G();
                AbstractC3292y.f(cursor);
                g8.f(cursor);
                arrayList.add(g8);
            }
            while (cursor.moveToNext()) {
                c5.G g9 = new c5.G();
                AbstractC3292y.f(cursor);
                g9.f(cursor);
                arrayList.add(g9);
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final void p1(Q update) {
        AbstractC3292y.i(update, "update");
        ContentValues contentValues = new ContentValues();
        contentValues.put("versionCode", Long.valueOf(update.w()));
        contentValues.put("versionName", update.x());
        contentValues.put("size", String.valueOf(update.v()));
        contentValues.put("notified", Integer.valueOf(update.p()));
        contentValues.put("nameApkFile", update.l());
        contentValues.put("progress", Integer.valueOf(update.u()));
        contentValues.put("ignoreVersion", Integer.valueOf(update.h()));
        contentValues.put("filehash", update.f());
        contentValues.put("fileId", update.b());
        String[] strArr = {update.s()};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.update("updates", contentValues, "packagename=?", strArr);
    }

    public final int q() {
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("responses", null, null);
    }

    public final ArrayList q0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("recent_searches", this.f37293f, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                arrayList.add(V0(cursor));
            }
            while (cursor.moveToNext()) {
                AbstractC3292y.f(cursor);
                arrayList.add(V0(cursor));
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final int q1(c5.r download) {
        AbstractC3292y.i(download, "download");
        ContentValues contentValues = new ContentValues();
        contentValues.put("packagename", download.Y());
        contentValues.put("apk_name", download.X());
        contentValues.put("progress", Integer.valueOf(download.Z()));
        contentValues.put("checked", Integer.valueOf(download.p()));
        contentValues.put("incomplete", Integer.valueOf(download.z()));
        contentValues.put("size", Long.valueOf(download.a0()));
        contentValues.put("downloadedSize", Long.valueOf(download.u()));
        contentValues.put("md5", download.Q());
        contentValues.put("versioncode", Long.valueOf(download.e0()));
        contentValues.put("attempts", Integer.valueOf(download.l()));
        contentValues.put("idPrograma", Long.valueOf(download.h()));
        contentValues.put("downloadAnyway", Integer.valueOf(download.s()));
        contentValues.put("filehash", download.x());
        contentValues.put("fileId", download.w());
        contentValues.put("md5signature", download.U());
        contentValues.put("supportedAbis", download.b0());
        contentValues.put("minsdk", Integer.valueOf(download.W()));
        contentValues.put("urlIcon", download.d0());
        contentValues.put("appName", download.i());
        if (download.y() >= 0) {
            String[] strArr = {String.valueOf(download.y())};
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            return sQLiteDatabase.update("downloads", contentValues, "id=?", strArr);
        }
        if (download.w() != null) {
            String w8 = download.w();
            AbstractC3292y.f(w8);
            if (w8.length() > 0) {
                String[] strArr2 = {String.valueOf(download.w())};
                SQLiteDatabase sQLiteDatabase2 = this.f37288a;
                AbstractC3292y.f(sQLiteDatabase2);
                return sQLiteDatabase2.update("downloads", contentValues, "fileId=?", strArr2);
            }
        }
        if (download.Y() != null && download.e0() > 0) {
            String[] strArr3 = {download.Y(), String.valueOf(download.e0())};
            SQLiteDatabase sQLiteDatabase3 = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase3);
            return sQLiteDatabase3.update("downloads", contentValues, "packagename=? AND versioncode=?", strArr3);
        }
        if (download.X() != null) {
            String[] strArr4 = {download.X()};
            SQLiteDatabase sQLiteDatabase4 = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase4);
            return sQLiteDatabase4.update("downloads", contentValues, "apk_name=?", strArr4);
        }
        return 0;
    }

    public final void r(C2041f appToDelete) {
        AbstractC3292y.i(appToDelete, "appToDelete");
        if (appToDelete.u() < 0) {
            String Q8 = appToDelete.Q();
            AbstractC3292y.f(Q8);
            C2041f S8 = S(Q8);
            if (S8 != null) {
                appToDelete.y0(S8.u());
            }
        }
        String[] strArr = {appToDelete.Q()};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.delete("apps", "packagename=?", strArr);
        String[] strArr2 = {String.valueOf(appToDelete.u())};
        SQLiteDatabase sQLiteDatabase2 = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase2);
        sQLiteDatabase2.delete("app_files", "app_id=?", strArr2);
    }

    public final L r0(String type) {
        L l8;
        Cursor query;
        AbstractC3292y.i(type, "type");
        Cursor cursor = null;
        r0 = null;
        L l9 = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            query = sQLiteDatabase.query("responses", this.f37302o, "type=?", new String[]{type}, null, null, null);
        } catch (Exception e8) {
            e = e8;
            l8 = null;
        }
        try {
            if (query.moveToFirst()) {
                AbstractC3292y.f(query);
                l9 = W0(query);
            }
            query.close();
            return l9;
        } catch (Exception e9) {
            e = e9;
            L l10 = l9;
            cursor = query;
            l8 = l10;
            e.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            return l8;
        }
    }

    public final int r1(C2057w installationAttempt) {
        AbstractC3292y.i(installationAttempt, "installationAttempt");
        String[] strArr = {String.valueOf(installationAttempt.c())};
        ContentValues contentValues = new ContentValues();
        contentValues.put("attempts", String.valueOf(installationAttempt.a()));
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, installationAttempt.d());
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.update("installationAttempts", contentValues, "id=?", strArr);
    }

    public final Q s0(String packagename) {
        Cursor cursor;
        Q q8;
        AbstractC3292y.i(packagename, "packagename");
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("updates", this.f37291d, "packagename=?", new String[]{packagename}, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                q8 = X0(cursor);
            } else {
                q8 = null;
            }
            cursor.close();
            return q8;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final void s1(C2032B notification, String notificationActions, String notificationMsg) {
        AbstractC3292y.i(notification, "notification");
        AbstractC3292y.i(notificationActions, "notificationActions");
        AbstractC3292y.i(notificationMsg, "notificationMsg");
        ContentValues contentValues = new ContentValues();
        contentValues.put("actions", notificationActions);
        contentValues.put(NotificationCompat.CATEGORY_MESSAGE, notificationMsg);
        String[] strArr = {String.valueOf(notification.c())};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.update("notifications", contentValues, "id=?", strArr);
    }

    public final void t(String packagename) {
        AbstractC3292y.i(packagename, "packagename");
        C2041f S8 = S(packagename);
        if (S8 != null) {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            sQLiteDatabase.delete("apps", "packagename=?", new String[]{packagename});
            String[] strArr = {String.valueOf(S8.u())};
            SQLiteDatabase sQLiteDatabase2 = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase2);
            sQLiteDatabase2.delete("app_files", "app_id=?", strArr);
        }
    }

    public final ArrayList t0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("updates", this.f37291d, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                AbstractC3292y.f(cursor);
                arrayList.add(X0(cursor));
            }
            while (cursor.moveToNext()) {
                AbstractC3292y.f(cursor);
                arrayList.add(X0(cursor));
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final void t1(String packagename, long j8, int i8) {
        AbstractC3292y.i(packagename, "packagename");
        ContentValues contentValues = new ContentValues();
        contentValues.put("appID", Long.valueOf(j8));
        contentValues.put("hasOldVersions", Integer.valueOf(i8));
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.update("apps", contentValues, "packagename=?", new String[]{packagename});
    }

    public final void u(C2055u appFile) {
        AbstractC3292y.i(appFile, "appFile");
        if (appFile.b() != null) {
            String[] strArr = {appFile.b()};
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            sQLiteDatabase.delete("app_files", "md5=?", strArr);
            return;
        }
        if (appFile.d() != null) {
            String[] strArr2 = {appFile.d()};
            SQLiteDatabase sQLiteDatabase2 = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase2);
            sQLiteDatabase2.delete("app_files", "sha256=?", strArr2);
            return;
        }
        if (appFile.a() != null) {
            String[] strArr3 = {appFile.a()};
            SQLiteDatabase sQLiteDatabase3 = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase3);
            sQLiteDatabase3.delete("app_files", "path=?", strArr3);
        }
    }

    public final ArrayList u0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("wishlist", this.f37298k, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                W w8 = new W();
                AbstractC3292y.f(cursor);
                w8.g(cursor);
                arrayList.add(w8);
            }
            while (cursor.moveToNext()) {
                W w9 = new W();
                AbstractC3292y.f(cursor);
                w9.g(cursor);
                arrayList.add(w9);
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final void u1(long j8, int i8) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("can_download", Integer.valueOf(i8));
        String[] strArr = {String.valueOf(j8)};
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.update("wishlist", contentValues, "id_program=?", strArr);
    }

    public final int v(String path) {
        AbstractC3292y.i(path, "path");
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("deep_link_files", "path=?", new String[]{path});
    }

    public final W v0(long j8) {
        Cursor cursor;
        W w8;
        try {
            String[] strArr = {String.valueOf(j8)};
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("wishlist", this.f37298k, "id_program=?", strArr, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                W.a aVar = W.f15707h;
                AbstractC3292y.f(cursor);
                w8 = aVar.a(cursor);
            } else {
                w8 = null;
            }
            cursor.close();
            return w8;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final void y0(C2036a activeNotification) {
        AbstractC3292y.i(activeNotification, "activeNotification");
        ContentValues contentValues = new ContentValues();
        contentValues.put("notificationId", Integer.valueOf(activeNotification.a()));
        contentValues.put("packagename", activeNotification.c());
        contentValues.put("versioncode", Long.valueOf(activeNotification.e()));
        contentValues.put("type", Integer.valueOf(activeNotification.d().ordinal()));
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.insert("active_notifications", null, contentValues);
    }

    public final int z(c5.r rVar) {
        if (rVar != null) {
            String[] strArr = {String.valueOf(rVar.y())};
            SQLiteDatabase sQLiteDatabase = this.f37288a;
            AbstractC3292y.f(sQLiteDatabase);
            return sQLiteDatabase.delete("downloads", "id=?", strArr);
        }
        return 0;
    }

    public final void z0(C2037b activityLog) {
        AbstractC3292y.i(activityLog, "activityLog");
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(activityLog.d()));
        contentValues.put("packagename", activityLog.a());
        contentValues.put("versioncode_old", activityLog.g());
        contentValues.put("versioncode_new", activityLog.f());
        contentValues.put("versionname_old", activityLog.i());
        contentValues.put("versionname_new", activityLog.h());
        contentValues.put("size", activityLog.b());
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, activityLog.c());
        SQLiteDatabase sQLiteDatabase = this.f37288a;
        AbstractC3292y.f(sQLiteDatabase);
        sQLiteDatabase.insert("activity_log", null, contentValues);
    }
}
