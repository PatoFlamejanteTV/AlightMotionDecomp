package C1;

import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final l f707a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f708b;

    /* renamed from: c, reason: collision with root package name */
    private final List f709c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f710d;

    /* renamed from: e, reason: collision with root package name */
    private final String f711e;

    /* renamed from: f, reason: collision with root package name */
    private final String f712f;

    /* renamed from: g, reason: collision with root package name */
    private final String f713g;

    /* renamed from: h, reason: collision with root package name */
    private final e f714h;

    private d(l lVar, WebView webView, String str, List list, String str2, String str3, e eVar) {
        ArrayList arrayList = new ArrayList();
        this.f709c = arrayList;
        this.f710d = new HashMap();
        this.f707a = lVar;
        this.f708b = webView;
        this.f711e = str;
        this.f714h = eVar;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                this.f710d.put(UUID.randomUUID().toString(), mVar);
            }
        }
        this.f713g = str2;
        this.f712f = str3;
    }

    public static d a(l lVar, WebView webView, String str, String str2) {
        I1.g.d(lVar, "Partner is null");
        I1.g.d(webView, "WebView is null");
        if (str2 != null) {
            I1.g.e(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new d(lVar, webView, null, null, str, str2, e.HTML);
    }

    public static d b(l lVar, String str, List list, String str2, String str3) {
        I1.g.d(lVar, "Partner is null");
        I1.g.d(str, "OM SDK JS script content is null");
        I1.g.d(list, "VerificationScriptResources is null");
        if (str3 != null) {
            I1.g.e(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new d(lVar, null, str, list, str2, str3, e.NATIVE);
    }

    public e c() {
        return this.f714h;
    }

    public String d() {
        return this.f713g;
    }

    public String e() {
        return this.f712f;
    }

    public Map f() {
        return DesugarCollections.unmodifiableMap(this.f710d);
    }

    public String g() {
        return this.f711e;
    }

    public l h() {
        return this.f707a;
    }

    public List i() {
        return DesugarCollections.unmodifiableList(this.f709c);
    }

    public WebView j() {
        return this.f708b;
    }
}
