package p;

import D5.s;
import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.cmpapi.status.DisplayStatus;
import java.util.LinkedHashMap;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3550a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3550a f36072a = new C3550a();

    /* renamed from: b, reason: collision with root package name */
    public static CmpStatus f36073b;

    /* renamed from: c, reason: collision with root package name */
    public static s f36074c;

    /* renamed from: d, reason: collision with root package name */
    public static String f36075d;

    /* renamed from: e, reason: collision with root package name */
    public static String f36076e;

    static {
        new LinkedHashMap();
        f36073b = CmpStatus.LOADING;
        DisplayStatus displayStatus = DisplayStatus.VISIBLE;
    }

    public final CmpStatus a() {
        return f36073b;
    }

    public final void b(s sVar) {
        f36074c = sVar;
    }

    public final void c(String str) {
        f36076e = str;
    }

    public final String d() {
        return f36076e;
    }

    public final void e(String str) {
        f36075d = str;
    }

    public final s f() {
        return f36074c;
    }

    public final String g() {
        return f36075d;
    }
}
