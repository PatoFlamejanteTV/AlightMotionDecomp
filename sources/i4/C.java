package I4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1972A;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import t5.C4041o0;

/* loaded from: classes5.dex */
public final class C extends RecyclerView.Adapter {

    /* renamed from: e, reason: collision with root package name */
    public static final a f3421e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3422a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3423b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1972A f3424c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3425d;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C(ArrayList datos, Context context, InterfaceC1972A listener) {
        AbstractC3292y.i(datos, "datos");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        this.f3422a = datos;
        this.f3423b = context;
        this.f3424c = listener;
    }

    public final void a(c5.M review) {
        AbstractC3292y.i(review, "review");
        this.f3422a.add(review);
        notifyItemInserted(getItemCount());
    }

    public final ArrayList b() {
        return this.f3422a;
    }

    public final void c(boolean z8) {
        this.f3425d = z8;
        if (z8) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    public final void d(c5.M review) {
        AbstractC3292y.i(review, "review");
        Iterator it = this.f3422a.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                int i9 = i8 + 1;
                if (((c5.M) it.next()).l() == review.l()) {
                    break;
                } else {
                    i8 = i9;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        this.f3422a.set(i8, review);
        notifyItemChanged(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3422a.size() + (this.f3425d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == this.f3422a.size()) {
            return 2;
        }
        if (((c5.M) this.f3422a.get(i8)).I()) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C4041o0) {
            Object obj = this.f3422a.get(i8);
            AbstractC3292y.h(obj, "get(...)");
            c5.M m8 = (c5.M) obj;
            if (m8.I()) {
                ((C4041o0) viewHolder).g(m8, i8);
            } else {
                ((C4041o0) viewHolder).f(m8, i8);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        if (i8 != 1) {
            if (i8 != 2) {
                return new C4041o0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.review, viewGroup, false), this.f3423b, this.f3424c);
            }
            return new t5.M(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pb_loading_more_content, viewGroup, false));
        }
        return new C4041o0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.review_turbo, viewGroup, false), this.f3423b, this.f3424c);
    }
}
