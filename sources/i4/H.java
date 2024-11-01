package I4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1977a;
import b5.InterfaceC1980d;
import b5.InterfaceC1981e;
import c5.C2043h;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import t5.C0;
import t5.E0;
import t5.G0;

/* loaded from: classes5.dex */
public final class H extends RecyclerView.Adapter {

    /* renamed from: l, reason: collision with root package name */
    public static final a f3443l = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1980d f3444a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1981e f3445b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1977a f3446c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3447d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3448e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3449f;

    /* renamed from: g, reason: collision with root package name */
    private final String f3450g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f3451h;

    /* renamed from: i, reason: collision with root package name */
    private int f3452i;

    /* renamed from: j, reason: collision with root package name */
    private int f3453j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3454k;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private C2043h f3455a;

        /* renamed from: b, reason: collision with root package name */
        private int f3456b = 1;

        /* renamed from: c, reason: collision with root package name */
        private int f3457c = 1;

        public final int a() {
            return this.f3457c;
        }

        public final C2043h b() {
            return this.f3455a;
        }

        public final int c() {
            return this.f3456b;
        }

        public final void d(int i8) {
            this.f3457c = i8;
        }

        public final void e(C2043h c2043h) {
            this.f3455a = c2043h;
        }

        public final void f(int i8) {
            this.f3456b = i8;
        }
    }

    public H(InterfaceC1980d listener, InterfaceC1981e topItemsListener, InterfaceC1977a actionsClickListener, String str, String str2, String readMore, String readLess) {
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(topItemsListener, "topItemsListener");
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(readMore, "readMore");
        AbstractC3292y.i(readLess, "readLess");
        this.f3444a = listener;
        this.f3445b = topItemsListener;
        this.f3446c = actionsClickListener;
        this.f3447d = str;
        this.f3448e = str2;
        this.f3449f = readMore;
        this.f3450g = readLess;
        this.f3451h = new ArrayList();
        this.f3454k = true;
    }

    private final boolean d(c5.P p8) {
        if (p8.b().b() != -2 && p8.b().b() != -3) {
            return true;
        }
        return false;
    }

    public final void a(ArrayList apps, boolean z8) {
        AbstractC3292y.i(apps, "apps");
        int size = this.f3451h.size();
        Iterator it = apps.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            b bVar = new b();
            bVar.e((C2043h) next);
            bVar.f(0);
            if (z8) {
                int i8 = this.f3453j + 1;
                this.f3453j = i8;
                bVar.d(i8);
            } else {
                bVar.d(0);
            }
            this.f3451h.add(bVar);
        }
        notifyItemRangeInserted(size, this.f3451h.size());
    }

    public final void b(c5.P topByCategory, int i8) {
        AbstractC3292y.i(topByCategory, "topByCategory");
        this.f3451h = new ArrayList();
        this.f3452i = i8;
        boolean d8 = d(topByCategory);
        this.f3454k = d8;
        if (!d8) {
            Iterator it = topByCategory.a().iterator();
            AbstractC3292y.h(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                b bVar = new b();
                bVar.e((C2043h) next);
                bVar.f(0);
                bVar.d(0);
                this.f3451h.add(bVar);
            }
            return;
        }
        String a9 = topByCategory.b().a();
        if (a9 != null && a9.length() != 0) {
            b bVar2 = new b();
            bVar2.f(2);
            this.f3451h.add(bVar2);
        }
        int i9 = 0;
        for (C2043h c2043h : topByCategory.a()) {
            int i10 = i9 + 1;
            b bVar3 = new b();
            bVar3.e(c2043h);
            if (i9 == 0 && c2043h.j1()) {
                bVar3.f(3);
            } else if (i9 < 10) {
                bVar3.f(1);
            } else {
                bVar3.f(0);
            }
            this.f3453j = i10;
            bVar3.d(i10);
            this.f3451h.add(bVar3);
            i9 = i10;
        }
    }

    public final ArrayList c() {
        return this.f3451h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3451h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        return ((b) this.f3451h.get(i8)).c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C0) {
            C2043h b9 = ((b) this.f3451h.get(i8)).b();
            AbstractC3292y.f(b9);
            ((C0) viewHolder).r(b9, ((b) this.f3451h.get(i8)).a(), i8);
        } else if (viewHolder instanceof E0) {
            C2043h b10 = ((b) this.f3451h.get(i8)).b();
            AbstractC3292y.f(b10);
            ((E0) viewHolder).m(b10, ((b) this.f3451h.get(i8)).a());
        } else if (viewHolder instanceof G0) {
        } else {
            throw new IllegalArgumentException("ViewHolder unknown!!");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_info_promoted_top_by_cat_item, viewGroup, false);
                        InterfaceC1980d interfaceC1980d = this.f3444a;
                        InterfaceC1981e interfaceC1981e = this.f3445b;
                        InterfaceC1977a interfaceC1977a = this.f3446c;
                        Context context = viewGroup.getContext();
                        AbstractC3292y.h(context, "getContext(...)");
                        return new C0(inflate, interfaceC1980d, interfaceC1981e, interfaceC1977a, context);
                    }
                    throw new IllegalArgumentException("viewType unknown");
                }
                return new G0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.top_by_category_title_view, viewGroup, false), this.f3447d, this.f3448e, this.f3449f, this.f3450g);
            }
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_info_top_by_cat_item, viewGroup, false);
            InterfaceC1980d interfaceC1980d2 = this.f3444a;
            InterfaceC1981e interfaceC1981e2 = this.f3445b;
            InterfaceC1977a interfaceC1977a2 = this.f3446c;
            Context context2 = viewGroup.getContext();
            AbstractC3292y.h(context2, "getContext(...)");
            return new C0(inflate2, interfaceC1980d2, interfaceC1981e2, interfaceC1977a2, context2);
        }
        View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_info_top_by_cat_item_small, viewGroup, false);
        InterfaceC1980d interfaceC1980d3 = this.f3444a;
        InterfaceC1977a interfaceC1977a3 = this.f3446c;
        Context context3 = viewGroup.getContext();
        AbstractC3292y.h(context3, "getContext(...)");
        return new E0(inflate3, interfaceC1980d3, interfaceC1977a3, context3);
    }
}
