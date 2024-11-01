package c5;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3791p;

/* renamed from: c5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2037b {

    /* renamed from: j, reason: collision with root package name */
    public static final a f15728j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f15729a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f15730b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f15731c;

    /* renamed from: d, reason: collision with root package name */
    private String f15732d;

    /* renamed from: e, reason: collision with root package name */
    private String f15733e;

    /* renamed from: f, reason: collision with root package name */
    private String f15734f;

    /* renamed from: g, reason: collision with root package name */
    private String f15735g;

    /* renamed from: h, reason: collision with root package name */
    private String f15736h;

    /* renamed from: i, reason: collision with root package name */
    private String f15737i;

    /* renamed from: c5.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private final String e() {
        int i8 = this.f15730b;
        if (i8 != 1) {
            if (i8 != 3) {
                if (i8 != 4) {
                    return "Unknown";
                }
                return "INSTALLED_UPDATE";
            }
            return "DOWNLOADED_UPDATE";
        }
        return "NEW_UPDATE";
    }

    public final String a() {
        return this.f15731c;
    }

    public final String b() {
        return this.f15736h;
    }

    public final String c() {
        return this.f15737i;
    }

    public final int d() {
        return this.f15730b;
    }

    public final String f() {
        return this.f15735g;
    }

    public final String g() {
        return this.f15734f;
    }

    public final String h() {
        return this.f15733e;
    }

    public final String i() {
        return this.f15732d;
    }

    public final void j(C2041f appStored, Q update, C3791p dbManager) {
        AbstractC3292y.i(appStored, "appStored");
        AbstractC3292y.i(update, "update");
        AbstractC3292y.i(dbManager, "dbManager");
        C2037b c2037b = new C2037b();
        c2037b.f15731c = appStored.Q();
        c2037b.f15730b = 3;
        c2037b.f15734f = String.valueOf(appStored.f0());
        c2037b.f15735g = String.valueOf(update.w());
        c2037b.f15732d = appStored.h0();
        c2037b.f15733e = update.x();
        c2037b.f15736h = String.valueOf(update.v());
        c2037b.f15737i = String.valueOf(System.currentTimeMillis() / 1000);
        dbManager.z0(c2037b);
    }

    public final void k(C2041f appUpdated, C3791p dbManager) {
        AbstractC3292y.i(appUpdated, "appUpdated");
        AbstractC3292y.i(dbManager, "dbManager");
        C2037b c2037b = new C2037b();
        c2037b.f15731c = appUpdated.Q();
        c2037b.f15730b = 4;
        c2037b.f15735g = String.valueOf(appUpdated.f0());
        c2037b.f15733e = appUpdated.h0();
        c2037b.f15737i = String.valueOf(System.currentTimeMillis() / 1000);
        dbManager.z0(c2037b);
    }

    public final void l(C2041f appStored, Q update, C3791p dbManager) {
        AbstractC3292y.i(appStored, "appStored");
        AbstractC3292y.i(update, "update");
        AbstractC3292y.i(dbManager, "dbManager");
        C2037b c2037b = new C2037b();
        c2037b.f15731c = appStored.Q();
        c2037b.f15730b = 1;
        c2037b.f15734f = String.valueOf(appStored.f0());
        c2037b.f15735g = String.valueOf(update.w());
        c2037b.f15732d = appStored.h0();
        c2037b.f15733e = update.x();
        c2037b.f15736h = String.valueOf(update.v());
        c2037b.f15737i = String.valueOf(System.currentTimeMillis() / 1000);
        dbManager.z0(c2037b);
    }

    public String toString() {
        return "{id=" + this.f15729a + ", type=" + this.f15730b + ", typeReadable=" + e() + ", packageName=" + this.f15731c + ", versionNameOld=" + this.f15732d + ", versionNameNew=" + this.f15733e + ", versionCodeOld=" + this.f15734f + ", versionCodeNew=" + this.f15735g + ", size=" + this.f15736h + ", timestamp=" + this.f15737i + '}';
    }
}
