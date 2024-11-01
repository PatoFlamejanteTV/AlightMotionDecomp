package J1;

import C1.n;
import F1.e;
import I1.h;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f4022a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f4023b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f4024c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f4025d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet f4026e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f4027f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f4028g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Map f4029h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f4030i;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final e f4031a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f4032b = new ArrayList();

        public a(e eVar, String str) {
            this.f4031a = eVar;
            b(str);
        }

        public e a() {
            return this.f4031a;
        }

        public void b(String str) {
            this.f4032b.add(str);
        }

        public ArrayList c() {
            return this.f4032b;
        }
    }

    private String b(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String a9 = h.a(view);
            if (a9 != null) {
                return a9;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        this.f4025d.addAll(hashSet);
        return null;
    }

    private void d(n nVar) {
        Iterator it = nVar.q().iterator();
        while (it.hasNext()) {
            e((e) it.next(), nVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(e eVar, n nVar) {
        View view = (View) eVar.c().get();
        if (view == null) {
            return;
        }
        a aVar = (a) this.f4023b.get(view);
        if (aVar != null) {
            aVar.b(nVar.v());
        } else {
            this.f4023b.put(view, new a(eVar, nVar.v()));
        }
    }

    private Boolean f(View view) {
        if (view.hasWindowFocus()) {
            this.f4029h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f4029h.containsKey(view)) {
            return (Boolean) this.f4029h.get(view);
        }
        Map map = this.f4029h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return (View) this.f4024c.get(str);
    }

    public void c() {
        this.f4022a.clear();
        this.f4023b.clear();
        this.f4024c.clear();
        this.f4025d.clear();
        this.f4026e.clear();
        this.f4027f.clear();
        this.f4028g.clear();
        this.f4030i = false;
    }

    public String g(String str) {
        return (String) this.f4028g.get(str);
    }

    public HashSet h() {
        return this.f4027f;
    }

    public a i(View view) {
        a aVar = (a) this.f4023b.get(view);
        if (aVar != null) {
            this.f4023b.remove(view);
        }
        return aVar;
    }

    public HashSet j() {
        return this.f4026e;
    }

    public String k(View view) {
        if (this.f4022a.size() == 0) {
            return null;
        }
        String str = (String) this.f4022a.get(view);
        if (str != null) {
            this.f4022a.remove(view);
        }
        return str;
    }

    public void l() {
        this.f4030i = true;
    }

    public d m(View view) {
        if (this.f4025d.contains(view)) {
            return d.PARENT_VIEW;
        }
        if (this.f4030i) {
            return d.OBSTRUCTION_VIEW;
        }
        return d.UNDERLYING_VIEW;
    }

    public void n() {
        F1.c e8 = F1.c.e();
        if (e8 != null) {
            for (n nVar : e8.a()) {
                View o8 = nVar.o();
                if (nVar.t()) {
                    String v8 = nVar.v();
                    if (o8 != null) {
                        String b9 = b(o8);
                        if (b9 == null) {
                            this.f4026e.add(v8);
                            this.f4022a.put(o8, v8);
                            d(nVar);
                        } else if (b9 != "noWindowFocus") {
                            this.f4027f.add(v8);
                            this.f4024c.put(v8, o8);
                            this.f4028g.put(v8, b9);
                        }
                    } else {
                        this.f4027f.add(v8);
                        this.f4028g.put(v8, "noAdView");
                    }
                }
            }
        }
    }

    public boolean o(View view) {
        if (this.f4029h.containsKey(view)) {
            this.f4029h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }
}
