package H6;

import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f3302a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3303b = {1, 2, 3, 4};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3304c = {5};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3305d = {6};

    /* renamed from: e, reason: collision with root package name */
    public static boolean f3306e;

    public final g a(String region) {
        AbstractC3292y.i(region, "region");
        String lowerCase = region.toLowerCase(Locale.ROOT);
        AbstractC3292y.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != 3166) {
            if (hashCode != 3180) {
                if (hashCode != 3185) {
                    if (hashCode != 3743) {
                        if (hashCode == 3755 && lowerCase.equals("va")) {
                            return g.VIRGINIA;
                        }
                    } else if (lowerCase.equals("ut")) {
                        return g.UTAH;
                    }
                } else if (lowerCase.equals("ct")) {
                    return g.CONNECTICUT;
                }
            } else if (lowerCase.equals("co")) {
                return g.COLORADO;
            }
        } else if (lowerCase.equals(DownloadCommon.DOWNLOAD_REPORT_CANCEL)) {
            return g.CALIFORNIA;
        }
        return g.NOT_APPLICABLE;
    }

    public final void b(a mspaConfig) {
        g gVar;
        ChoiceCmpCallback callback;
        AbstractC3292y.i(mspaConfig, "mspaConfig");
        if (!f3306e) {
            c(mspaConfig);
            List list = mspaConfig.f3253d;
            if (list != null) {
                d.f3272a.b(list, f3306e, h.f3301a);
                return;
            }
            return;
        }
        d dVar = d.f3272a;
        String str = d.f3273b.f4497b.f4445J;
        g c8 = dVar.c();
        String region = dVar.a();
        AbstractC3292y.i(region, "region");
        String lowerCase = region.toLowerCase(Locale.ROOT);
        AbstractC3292y.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != 3166) {
            if (hashCode != 3180) {
                if (hashCode != 3185) {
                    if (hashCode != 3743) {
                        if (hashCode == 3755 && lowerCase.equals("va")) {
                            gVar = g.VIRGINIA;
                        }
                        gVar = g.NOT_APPLICABLE;
                    } else {
                        if (lowerCase.equals("ut")) {
                            gVar = g.UTAH;
                        }
                        gVar = g.NOT_APPLICABLE;
                    }
                } else {
                    if (lowerCase.equals("ct")) {
                        gVar = g.CONNECTICUT;
                    }
                    gVar = g.NOT_APPLICABLE;
                }
            } else {
                if (lowerCase.equals("co")) {
                    gVar = g.COLORADO;
                }
                gVar = g.NOT_APPLICABLE;
            }
        } else {
            if (lowerCase.equals(DownloadCommon.DOWNLOAD_REPORT_CANCEL)) {
                gVar = g.CALIFORNIA;
            }
            gVar = g.NOT_APPLICABLE;
        }
        if (!dVar.d() || !AbstractC3292y.d(str, "NATIONAL")) {
            if (!dVar.d() || !AbstractC3292y.d(str, "STATE_AND_NATIONAL") || c8 != g.NOT_APPLICABLE) {
                if (!dVar.e() || !AbstractC3292y.d(str, "NATIONAL") || gVar != g.NOT_APPLICABLE) {
                    if ((!dVar.e() || !AbstractC3292y.d(str, "STATE_AND_NATIONAL") || gVar != c8) && (callback = ChoiceCmp.INSTANCE.getCallback()) != null) {
                        callback.onUserMovedToOtherState();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0096, code lost:            if (r1 != r0.c()) goto L91;     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(H6.a r6) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.i.c(H6.a):void");
    }
}
