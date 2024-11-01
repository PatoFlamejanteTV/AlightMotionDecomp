package I4;

import Y4.J0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import t5.k1;

/* loaded from: classes5.dex */
public final class W extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3581a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3582b;

    /* renamed from: c, reason: collision with root package name */
    private final b5.L f3583c;

    public W(ArrayList wishlist, Context context, b5.L listener) {
        AbstractC3292y.i(wishlist, "wishlist");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        this.f3581a = wishlist;
        this.f3582b = context;
        this.f3583c = listener;
    }

    public final ArrayList a() {
        return this.f3581a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(k1 viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        Object obj = this.f3581a.get(i8);
        AbstractC3292y.h(obj, "get(...)");
        viewHolder.n((c5.W) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public k1 onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        J0 c8 = J0.c(LayoutInflater.from(this.f3582b), viewGroup, false);
        AbstractC3292y.h(c8, "inflate(...)");
        return new k1(c8, this.f3582b, this.f3583c);
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f3581a = new ArrayList(arrayList);
        } else {
            this.f3581a = new ArrayList();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3581a.size();
    }
}
