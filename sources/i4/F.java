package I4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1980d;
import c5.C2043h;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import t5.C4018d;

/* loaded from: classes5.dex */
public final class F extends RecyclerView.Adapter {

    /* renamed from: e, reason: collision with root package name */
    public static final a f3432e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3433a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1980d f3434b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3435c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3436d;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public F(ArrayList searchResults, InterfaceC1980d listener, Context context) {
        AbstractC3292y.i(searchResults, "searchResults");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(context, "context");
        this.f3433a = searchResults;
        this.f3434b = listener;
        this.f3435c = context;
    }

    public final void a(ArrayList data) {
        AbstractC3292y.i(data, "data");
        Iterator it = data.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            C2043h c2043h = (C2043h) next;
            if (!this.f3433a.contains(c2043h)) {
                this.f3433a.add(c2043h);
            }
        }
        notifyDataSetChanged();
    }

    public final ArrayList b() {
        return this.f3433a;
    }

    public final void c(ArrayList data) {
        AbstractC3292y.i(data, "data");
        this.f3433a = data;
        notifyDataSetChanged();
    }

    public final void d(boolean z8) {
        this.f3436d = z8;
        if (z8) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3433a.size() + (this.f3436d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == this.f3433a.size()) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C4018d) {
            Object obj = this.f3433a.get(i8);
            AbstractC3292y.h(obj, "get(...)");
            ((C4018d) viewHolder).m((C2043h) obj, i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 == 1) {
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pb_loading_more_content, viewGroup, false);
                AbstractC3292y.f(inflate);
                return new t5.M(inflate);
            }
            throw new IllegalArgumentException("viewType unknown");
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_info_item, viewGroup, false);
        AbstractC3292y.f(inflate2);
        return new C4018d(inflate2, this.f3434b, null, this.f3435c);
    }
}
