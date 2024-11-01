package I4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c5.C2032B;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: I4.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1240t extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3716a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3717b;

    /* renamed from: c, reason: collision with root package name */
    private final b5.v f3718c;

    public C1240t(ArrayList data, Context context, b5.v listener) {
        AbstractC3292y.i(data, "data");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        this.f3716a = data;
        this.f3717b = context;
        this.f3718c = listener;
    }

    public final ArrayList a() {
        return this.f3716a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(t5.W viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        Object obj = this.f3716a.get(i8);
        AbstractC3292y.h(obj, "get(...)");
        viewHolder.h((C2032B) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public t5.W onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(this.f3717b).inflate(R.layout.notification_registry_item, viewGroup, false);
        AbstractC3292y.f(inflate);
        return new t5.W(inflate, this.f3718c);
    }

    public final void d(ArrayList arrayList) {
        AbstractC3292y.i(arrayList, "<set-?>");
        this.f3716a = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3716a.size();
    }
}
