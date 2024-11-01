package I4;

import R5.AbstractC1435t;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1977a;
import c5.C2043h;
import c5.C2046k;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import t5.C4010C;
import t5.C4036m;
import t5.C4047s;
import t5.C4051u;
import t5.I0;
import t5.d1;

/* renamed from: I4.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1231j extends RecyclerView.Adapter {

    /* renamed from: p, reason: collision with root package name */
    public static final a f3628p = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final b5.s f3629a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1977a f3630b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3631c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3632d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f3633e;

    /* renamed from: f, reason: collision with root package name */
    private int f3634f;

    /* renamed from: g, reason: collision with root package name */
    private int f3635g;

    /* renamed from: h, reason: collision with root package name */
    private int f3636h;

    /* renamed from: i, reason: collision with root package name */
    private int f3637i;

    /* renamed from: j, reason: collision with root package name */
    private int f3638j;

    /* renamed from: k, reason: collision with root package name */
    private int f3639k;

    /* renamed from: l, reason: collision with root package name */
    private int f3640l;

    /* renamed from: m, reason: collision with root package name */
    private int f3641m;

    /* renamed from: n, reason: collision with root package name */
    private int f3642n;

    /* renamed from: o, reason: collision with root package name */
    private int f3643o;

    /* renamed from: I4.j$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: I4.j$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f3644a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f3645b;

        public final ArrayList a() {
            ArrayList arrayList = this.f3645b;
            if (arrayList != null) {
                return arrayList;
            }
            AbstractC3292y.y("categories");
            return null;
        }

        public final ArrayList b() {
            ArrayList arrayList = this.f3644a;
            if (arrayList != null) {
                return arrayList;
            }
            AbstractC3292y.y("homeFeatures");
            return null;
        }

        public final void c(ArrayList arrayList) {
            AbstractC3292y.i(arrayList, "<set-?>");
            this.f3645b = arrayList;
        }

        public final void d(ArrayList arrayList) {
            AbstractC3292y.i(arrayList, "<set-?>");
            this.f3644a = arrayList;
        }
    }

    /* renamed from: I4.j$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public Object f3646a;

        /* renamed from: b, reason: collision with root package name */
        private int f3647b = -1;

        public final Object a() {
            Object obj = this.f3646a;
            if (obj != null) {
                return obj;
            }
            AbstractC3292y.y("item");
            return Q5.I.f8786a;
        }

        public final int b() {
            return this.f3647b;
        }

        public final void c(Object obj) {
            AbstractC3292y.i(obj, "<set-?>");
            this.f3646a = obj;
        }

        public final void d(int i8) {
            this.f3647b = i8;
        }
    }

    public C1231j(b5.s listener, InterfaceC1977a actionsClickListener, Context context, String fragmentName) {
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(fragmentName, "fragmentName");
        this.f3629a = listener;
        this.f3630b = actionsClickListener;
        this.f3631c = context;
        this.f3632d = fragmentName;
        this.f3633e = new ArrayList();
        this.f3634f = -1;
        this.f3635g = -1;
        this.f3636h = -1;
        this.f3637i = -1;
        this.f3638j = -1;
        this.f3639k = -1;
        this.f3640l = -1;
        this.f3641m = -1;
        this.f3642n = -1;
        this.f3643o = -1;
    }

    private final void c(ArrayList arrayList, int i8) {
        Iterator it = arrayList.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            c5.P p8 = (c5.P) next;
            if (p8.b().b() == i8) {
                h(p8);
                arrayList.remove(p8);
                return;
            }
        }
    }

    private final void d(C2043h c2043h) {
        c cVar = new c();
        cVar.c(c2043h);
        cVar.d(2);
        this.f3633e.add(cVar);
    }

    private final void e(ArrayList arrayList) {
        c cVar = new c();
        cVar.c(arrayList);
        cVar.d(7);
        this.f3633e.add(cVar);
        notifyItemInserted(this.f3633e.size() - 1);
    }

    private final void f(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            c(arrayList, 558);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 566);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 562);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 564);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 559);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 645);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 560);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 561);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 565);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 593);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 568);
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            AbstractC3292y.h(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                h((c5.P) next);
            }
        }
    }

    private final void g(ArrayList arrayList, ArrayList arrayList2) {
        b bVar = new b();
        bVar.d(arrayList);
        bVar.c(arrayList2);
        c cVar = new c();
        cVar.c(bVar);
        cVar.d(0);
        this.f3633e.add(cVar);
    }

    private final void h(c5.P p8) {
        if (p8 != null) {
            c cVar = new c();
            cVar.c(p8);
            cVar.d(p8.c());
            this.f3633e.add(cVar);
            notifyItemInserted(this.f3633e.size() - 1);
        }
    }

    private final void n(ArrayList arrayList, ArrayList arrayList2) {
        b bVar = new b();
        bVar.d(arrayList);
        bVar.c(arrayList2);
        c cVar = new c();
        cVar.c(bVar);
        cVar.d(0);
        this.f3633e.add(cVar);
    }

    private final void v(c5.P p8, int i8) {
        if (i8 >= 0 && i8 < this.f3633e.size()) {
            c cVar = new c();
            cVar.c(p8);
            cVar.d(p8.c());
            this.f3633e.set(i8, cVar);
            notifyItemChanged(i8);
        }
    }

    public final void a(c5.P floatingCategory) {
        AbstractC3292y.i(floatingCategory, "floatingCategory");
        h(floatingCategory);
    }

    public final void b(C2043h appReplacement) {
        AbstractC3292y.i(appReplacement, "appReplacement");
        int i8 = 0;
        for (c cVar : this.f3633e) {
            int i9 = i8 + 1;
            if (cVar != null && cVar.b() == 0) {
                Object a9 = cVar.a();
                AbstractC3292y.g(a9, "null cannot be cast to non-null type com.uptodown.adapters.HomeAdapter.HomeHeader");
                ((b) a9).b().add(appReplacement);
                notifyItemChanged(i8);
                return;
            }
            i8 = i9;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3633e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        c cVar = (c) this.f3633e.get(i8);
        if (cVar != null) {
            return cVar.b();
        }
        return -1;
    }

    public final void i(ArrayList floatingCategories) {
        AbstractC3292y.i(floatingCategories, "floatingCategories");
        if (!floatingCategories.isEmpty()) {
            e(floatingCategories);
        }
    }

    public final void j(C2043h mainApp) {
        AbstractC3292y.i(mainApp, "mainApp");
        c cVar = new c();
        cVar.c(mainApp);
        cVar.d(3);
        this.f3633e.set(this.f3637i, cVar);
        notifyItemChanged(this.f3637i);
    }

    public final void k(c5.P miniTop) {
        AbstractC3292y.i(miniTop, "miniTop");
        h(miniTop);
    }

    public final void l(ArrayList miniTops) {
        AbstractC3292y.i(miniTops, "miniTops");
        Iterator it = miniTops.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            c5.P p8 = (c5.P) next;
            int b9 = p8.b().b();
            if (b9 != 521) {
                if (b9 != 523) {
                    if (b9 != 524) {
                        h(p8);
                    } else {
                        v(p8, this.f3640l);
                    }
                } else {
                    v(p8, this.f3639k);
                }
            } else {
                v(p8, this.f3638j);
            }
        }
    }

    public final void m(ArrayList miniTops, C2046k parentCategory) {
        AbstractC3292y.i(miniTops, "miniTops");
        AbstractC3292y.i(parentCategory, "parentCategory");
        if (parentCategory.b() == 523) {
            f(miniTops);
            return;
        }
        Iterator it = miniTops.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            h((c5.P) next);
        }
    }

    public final void o(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            Object obj = arrayList.get(0);
            AbstractC3292y.h(obj, "get(...)");
            v((c5.P) obj, this.f3641m);
            if (arrayList.size() > 1) {
                Object obj2 = arrayList.get(1);
                AbstractC3292y.h(obj2, "get(...)");
                v((c5.P) obj2, this.f3642n);
            }
            if (arrayList.size() > 2) {
                Object obj3 = arrayList.get(2);
                AbstractC3292y.h(obj3, "get(...)");
                v((c5.P) obj3, this.f3643o);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        Object obj;
        Object obj2;
        AbstractC3292y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C4047s) {
            ((C4047s) viewHolder).a();
            return;
        }
        Object obj3 = null;
        if (viewHolder instanceof C4010C) {
            C4010C c4010c = (C4010C) viewHolder;
            c cVar = (c) this.f3633e.get(i8);
            if (cVar != null) {
                obj3 = cVar.a();
            }
            AbstractC3292y.g(obj3, "null cannot be cast to non-null type com.uptodown.adapters.HomeAdapter.HomeHeader");
            c4010c.d((b) obj3);
            return;
        }
        if (viewHolder instanceof t5.G) {
            c cVar2 = (c) this.f3633e.get(i8);
            if (cVar2 != null) {
                obj2 = cVar2.a();
            } else {
                obj2 = null;
            }
            if (obj2 instanceof c5.P) {
                t5.G g8 = (t5.G) viewHolder;
                c cVar3 = (c) this.f3633e.get(i8);
                if (cVar3 != null) {
                    obj3 = cVar3.a();
                }
                AbstractC3292y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.TopByCategory");
                g8.b((c5.P) obj3);
                return;
            }
            return;
        }
        if (viewHolder instanceof t5.E) {
            c cVar4 = (c) this.f3633e.get(i8);
            if (cVar4 != null) {
                obj = cVar4.a();
            } else {
                obj = null;
            }
            if (obj instanceof c5.P) {
                t5.E e8 = (t5.E) viewHolder;
                c cVar5 = (c) this.f3633e.get(i8);
                if (cVar5 != null) {
                    obj3 = cVar5.a();
                }
                AbstractC3292y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.TopByCategory");
                e8.b((c5.P) obj3);
                return;
            }
            return;
        }
        if (viewHolder instanceof C4036m) {
            C4036m c4036m = (C4036m) viewHolder;
            c cVar6 = (c) this.f3633e.get(i8);
            if (cVar6 != null) {
                obj3 = cVar6.a();
            }
            AbstractC3292y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.AppInfo");
            c4036m.m((C2043h) obj3);
            return;
        }
        if (viewHolder instanceof t5.P) {
            t5.P p8 = (t5.P) viewHolder;
            c cVar7 = (c) this.f3633e.get(i8);
            if (cVar7 != null) {
                obj3 = cVar7.a();
            }
            AbstractC3292y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.AppInfo");
            p8.p((C2043h) obj3);
            return;
        }
        if (viewHolder instanceof d1) {
            d1 d1Var = (d1) viewHolder;
            c cVar8 = (c) this.f3633e.get(i8);
            if (cVar8 != null) {
                obj3 = cVar8.a();
            }
            AbstractC3292y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.TopByCategory");
            d1Var.c((c5.P) obj3);
            return;
        }
        if (viewHolder instanceof I0) {
            I0 i02 = (I0) viewHolder;
            c cVar9 = (c) this.f3633e.get(i8);
            if (cVar9 != null) {
                obj3 = cVar9.a();
            }
            AbstractC3292y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.TopByCategory");
            i02.b((c5.P) obj3);
            return;
        }
        if (viewHolder instanceof t5.I) {
            t5.I i9 = (t5.I) viewHolder;
            c cVar10 = (c) this.f3633e.get(i8);
            if (cVar10 != null) {
                obj3 = cVar10.a();
            }
            AbstractC3292y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.TopByCategory");
            i9.b((c5.P) obj3);
            return;
        }
        if (viewHolder instanceof C4051u) {
            C4051u c4051u = (C4051u) viewHolder;
            c cVar11 = (c) this.f3633e.get(i8);
            if (cVar11 != null) {
                obj3 = cVar11.a();
            }
            AbstractC3292y.g(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.uptodown.models.Category>");
            c4051u.b((ArrayList) obj3);
            return;
        }
        throw new IllegalArgumentException("ViewHolder unknown!!");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        switch (i8) {
            case -1:
                return new C4047s(LayoutInflater.from(this.f3631c).inflate(R.layout.empty_view, viewGroup, false));
            case 0:
                return new C4010C(LayoutInflater.from(this.f3631c).inflate(R.layout.home_fragment_header, viewGroup, false), this.f3629a, this.f3630b, this.f3631c);
            case 1:
                return new t5.G(LayoutInflater.from(this.f3631c).inflate(R.layout.home_recycler_view_top, viewGroup, false), this.f3629a, this.f3630b, this.f3631c);
            case 2:
                return new C4036m(LayoutInflater.from(this.f3631c).inflate(R.layout.card_featured, viewGroup, false), this.f3629a, this.f3630b, this.f3631c);
            case 3:
                return new t5.P(LayoutInflater.from(this.f3631c).inflate(R.layout.home_gallery_featured, viewGroup, false), this.f3629a, this.f3630b, this.f3631c);
            case 4:
                return new d1(LayoutInflater.from(this.f3631c).inflate(R.layout.home_recycler_view_top, viewGroup, false), this.f3629a, this.f3630b, this.f3631c, this.f3632d);
            case 5:
                return new I0(LayoutInflater.from(this.f3631c).inflate(R.layout.home_recycler_view_top, viewGroup, false), this.f3629a, this.f3630b, this.f3631c);
            case 6:
                return new t5.I(LayoutInflater.from(this.f3631c).inflate(R.layout.home_recycler_view_top, viewGroup, false), this.f3629a, this.f3630b, this.f3631c);
            case 7:
                return new C4051u(LayoutInflater.from(this.f3631c).inflate(R.layout.floating_categories, viewGroup, false), this.f3629a, this.f3631c);
            case 8:
                return new t5.E(LayoutInflater.from(this.f3631c).inflate(R.layout.home_recycler_view_top, viewGroup, false), this.f3629a, this.f3630b, this.f3631c);
            default:
                throw new IllegalArgumentException("viewType unknown");
        }
    }

    public final void p(ArrayList appsFeatured, ArrayList leafCategories, c5.P p8, C2043h c2043h, c5.P p9) {
        ArrayList a9;
        ArrayList a10;
        ArrayList a11;
        AbstractC3292y.i(appsFeatured, "appsFeatured");
        AbstractC3292y.i(leafCategories, "leafCategories");
        this.f3633e = new ArrayList();
        if (!appsFeatured.isEmpty()) {
            n(appsFeatured, leafCategories);
        }
        if (p8 != null && (a11 = p8.a()) != null && (!a11.isEmpty())) {
            h(p8);
        }
        if ((!leafCategories.isEmpty()) && ((C2046k) leafCategories.get(0)).i() == 523) {
            if (p9 != null && (a10 = p9.a()) != null && (!a10.isEmpty())) {
                h(p9);
            }
            if (c2043h != null) {
                d(c2043h);
                return;
            }
            return;
        }
        if (c2043h != null) {
            d(c2043h);
        }
        if (p9 != null && (a9 = p9.a()) != null && (!a9.isEmpty())) {
            h(p9);
        }
    }

    public final void q(ArrayList homeFeatures, c5.P p8, c5.P p9) {
        AbstractC3292y.i(homeFeatures, "homeFeatures");
        this.f3633e = new ArrayList();
        g(homeFeatures, new ArrayList());
        h(p8);
        this.f3633e.add(null);
        this.f3634f = this.f3633e.size() - 1;
        h(p9);
        this.f3633e.add(null);
        this.f3635g = this.f3633e.size() - 1;
        this.f3633e.add(null);
        this.f3642n = this.f3633e.size() - 1;
        this.f3633e.add(null);
        this.f3636h = this.f3633e.size() - 1;
        this.f3633e.add(null);
        this.f3643o = this.f3633e.size() - 1;
        this.f3633e.add(null);
        this.f3637i = this.f3633e.size() - 1;
        this.f3633e.add(null);
        this.f3638j = this.f3633e.size() - 1;
        this.f3633e.add(null);
        this.f3639k = this.f3633e.size() - 1;
        this.f3633e.add(null);
        this.f3640l = this.f3633e.size() - 1;
    }

    public final ArrayList r() {
        return this.f3633e;
    }

    public final void s(C2043h featuredApp) {
        AbstractC3292y.i(featuredApp, "featuredApp");
        if (this.f3635g > 0) {
            c cVar = new c();
            cVar.c(featuredApp);
            cVar.d(2);
            this.f3633e.set(this.f3635g, cVar);
            notifyItemChanged(this.f3635g);
        }
    }

    public final void t(c5.P top) {
        AbstractC3292y.i(top, "top");
        v(top, this.f3634f);
    }

    public final void u(c5.P top) {
        AbstractC3292y.i(top, "top");
        v(top, this.f3636h);
    }

    public final void w(String packageName, RecyclerView recyclerView) {
        AbstractC3292y.i(packageName, "packageName");
        AbstractC3292y.i(recyclerView, "recyclerView");
        int itemCount = getItemCount();
        for (int i8 = 0; i8 < itemCount; i8++) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i8);
            Object obj = null;
            if (findViewHolderForAdapterPosition instanceof t5.G) {
                t5.G g8 = (t5.G) findViewHolderForAdapterPosition;
                Iterator it = g8.d().c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (AbstractC3292y.d(((C2043h) next).v0(), packageName)) {
                        obj = next;
                        break;
                    }
                }
                g8.d().notifyItemChanged(AbstractC1435t.r0(g8.d().c(), (C2043h) obj));
            } else if (findViewHolderForAdapterPosition instanceof t5.E) {
                t5.E e8 = (t5.E) findViewHolderForAdapterPosition;
                Iterator it2 = e8.d().b().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (AbstractC3292y.d(((C2043h) next2).v0(), packageName)) {
                        obj = next2;
                        break;
                    }
                }
                e8.d().notifyItemChanged(AbstractC1435t.r0(e8.d().b(), (C2043h) obj));
            } else if (findViewHolderForAdapterPosition instanceof C4036m) {
                if (AbstractC3292y.d(((C4036m) findViewHolderForAdapterPosition).o(), packageName)) {
                    notifyItemChanged(this.f3635g);
                }
            } else if (findViewHolderForAdapterPosition instanceof t5.P) {
                if (AbstractC3292y.d(((t5.P) findViewHolderForAdapterPosition).s(), packageName)) {
                    notifyItemChanged(this.f3637i);
                }
            } else if (findViewHolderForAdapterPosition instanceof d1) {
                d1 d1Var = (d1) findViewHolderForAdapterPosition;
                Iterator it3 = d1Var.e().l().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next3 = it3.next();
                    if (AbstractC3292y.d(((C2043h) next3).v0(), packageName)) {
                        obj = next3;
                        break;
                    }
                }
                d1Var.e().notifyItemChanged(AbstractC1435t.r0(d1Var.e().l(), (C2043h) obj));
            } else if (findViewHolderForAdapterPosition instanceof I0) {
                I0 i02 = (I0) findViewHolderForAdapterPosition;
                Iterator it4 = i02.d().a().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next4 = it4.next();
                    if (AbstractC3292y.d(((C2043h) next4).v0(), packageName)) {
                        obj = next4;
                        break;
                    }
                }
                i02.d().notifyItemChanged(AbstractC1435t.r0(i02.d().a(), (C2043h) obj));
            } else if (findViewHolderForAdapterPosition instanceof t5.I) {
                t5.I i9 = (t5.I) findViewHolderForAdapterPosition;
                Iterator it5 = i9.d().a().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next5 = it5.next();
                    if (AbstractC3292y.d(((C2043h) next5).v0(), packageName)) {
                        obj = next5;
                        break;
                    }
                }
                i9.d().notifyItemChanged(AbstractC1435t.r0(i9.d().a(), (C2043h) obj));
            }
        }
    }
}
