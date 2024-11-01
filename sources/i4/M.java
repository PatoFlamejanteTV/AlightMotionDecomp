package I4;

import R5.AbstractC1435t;
import Y4.o0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import t5.C4054v0;
import t5.L0;

/* loaded from: classes5.dex */
public final class M extends RecyclerView.Adapter {

    /* renamed from: i, reason: collision with root package name */
    public static final a f3497i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3498a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f3499b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3500c;

    /* renamed from: d, reason: collision with root package name */
    private final b5.I f3501d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3502e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f3503f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f3504g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3505h;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return T5.a.a(((c5.G) obj).e(), ((c5.G) obj2).e());
        }
    }

    public M(ArrayList userData, ArrayList data, Context context, b5.I listener) {
        AbstractC3292y.i(userData, "userData");
        AbstractC3292y.i(data, "data");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        this.f3498a = userData;
        this.f3499b = data;
        this.f3500c = context;
        this.f3501d = listener;
        this.f3503f = new ArrayList();
        this.f3504g = new ArrayList();
        a();
    }

    private final void a() {
        Object obj;
        c(new ArrayList());
        this.f3503f = new ArrayList();
        this.f3504g = new ArrayList();
        if (!this.f3498a.isEmpty()) {
            Iterator it = this.f3498a.iterator();
            AbstractC3292y.h(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                this.f3503f.add((c5.G) next);
            }
        }
        if (!this.f3499b.isEmpty()) {
            Iterator it2 = this.f3499b.iterator();
            AbstractC3292y.h(it2, "iterator(...)");
            while (it2.hasNext()) {
                Object next2 = it2.next();
                AbstractC3292y.h(next2, "next(...)");
                c5.G g8 = (c5.G) next2;
                Iterator it3 = this.f3503f.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = it3.next();
                        if (((c5.G) obj).b() == g8.b()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj == null) {
                    if (!this.f3504g.contains(g8)) {
                        this.f3504g.add(g8);
                    }
                } else {
                    this.f3504g.remove(g8);
                }
            }
        }
        if (!this.f3503f.isEmpty()) {
            b().add("title_user_upcoming_releases");
            b().addAll(AbstractC1435t.P0(this.f3503f, new b()));
        }
        if (!this.f3504g.isEmpty()) {
            b().add("title_upcoming_releases");
            b().addAll(this.f3504g);
        }
        notifyDataSetChanged();
    }

    public final ArrayList b() {
        ArrayList arrayList = this.f3502e;
        if (arrayList != null) {
            return arrayList;
        }
        AbstractC3292y.y("adapterData");
        return null;
    }

    public final void c(ArrayList arrayList) {
        AbstractC3292y.i(arrayList, "<set-?>");
        this.f3502e = arrayList;
    }

    public final void d(ArrayList userData, ArrayList data) {
        AbstractC3292y.i(userData, "userData");
        AbstractC3292y.i(data, "data");
        this.f3498a = new ArrayList(userData);
        this.f3499b = new ArrayList(data);
        a();
    }

    public final void e(boolean z8) {
        this.f3505h = z8;
        if (z8) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return b().size() + (this.f3505h ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == b().size()) {
            return 4;
        }
        Object obj = b().get(i8);
        AbstractC3292y.h(obj, "get(...)");
        if (obj instanceof c5.G) {
            if (this.f3503f.contains(obj)) {
                return 0;
            }
            return 1;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (AbstractC3292y.d(str, "title_user_upcoming_releases")) {
                return 2;
            }
            if (AbstractC3292y.d(str, "title_upcoming_releases")) {
                return 3;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof L0) {
            Object obj = b().get(i8);
            AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.PreRegister");
            ((L0) viewHolder).e((c5.G) obj);
        } else if (viewHolder instanceof C4054v0) {
            ((C4054v0) viewHolder).b(true);
        } else if (viewHolder instanceof t5.M) {
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
                    if (i8 != 3) {
                        if (i8 == 4) {
                            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pb_loading_more_content, viewGroup, false);
                            AbstractC3292y.f(inflate);
                            return new t5.M(inflate);
                        }
                        throw new IllegalArgumentException("viewType unknown");
                    }
                    View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                    AbstractC3292y.f(inflate2);
                    String string = this.f3500c.getString(R.string.upcoming_releases_title);
                    AbstractC3292y.h(string, "getString(...)");
                    return new C4054v0(inflate2, string, null);
                }
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                AbstractC3292y.f(inflate3);
                String string2 = this.f3500c.getString(R.string.user_upcoming_releases_title);
                AbstractC3292y.h(string2, "getString(...)");
                return new C4054v0(inflate3, string2, null);
            }
            o0 c8 = o0.c(LayoutInflater.from(this.f3500c), viewGroup, false);
            AbstractC3292y.h(c8, "inflate(...)");
            return new L0(c8, this.f3500c, this.f3501d, false);
        }
        o0 c9 = o0.c(LayoutInflater.from(this.f3500c), viewGroup, false);
        AbstractC3292y.h(c9, "inflate(...)");
        return new L0(c9, this.f3500c, this.f3501d, true);
    }
}
