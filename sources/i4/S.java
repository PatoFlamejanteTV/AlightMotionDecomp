package I4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import t5.b1;

/* loaded from: classes5.dex */
public final class S extends RecyclerView.Adapter {

    /* renamed from: d, reason: collision with root package name */
    public static final a f3539d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3540a;

    /* renamed from: b, reason: collision with root package name */
    private final b5.G f3541b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3542c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public S(ArrayList reviews, b5.G listener) {
        AbstractC3292y.i(reviews, "reviews");
        AbstractC3292y.i(listener, "listener");
        this.f3540a = reviews;
        this.f3541b = listener;
    }

    public final void a(ArrayList data) {
        AbstractC3292y.i(data, "data");
        this.f3540a.addAll(data);
        notifyDataSetChanged();
    }

    public final ArrayList b() {
        return this.f3540a;
    }

    public final void c(boolean z8) {
        this.f3542c = z8;
        if (z8) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    public final void d(c5.M review) {
        AbstractC3292y.i(review, "review");
        Iterator it = this.f3540a.iterator();
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
        this.f3540a.set(i8, review);
        notifyItemChanged(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3540a.size() + (this.f3542c ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == this.f3540a.size()) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof b1) {
            Object obj = this.f3540a.get(i8);
            AbstractC3292y.h(obj, "get(...)");
            ((b1) viewHolder).h((c5.M) obj, i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 == 1) {
                return new t5.M(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pb_loading_more_content, viewGroup, false));
            }
            throw new IllegalArgumentException("viewType unknown");
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.review, viewGroup, false);
        b5.G g8 = this.f3541b;
        Context context = viewGroup.getContext();
        AbstractC3292y.h(context, "getContext(...)");
        return new b1(inflate, g8, context);
    }
}
