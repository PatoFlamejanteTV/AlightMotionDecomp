package I4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1979c;
import c5.C2055u;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import t5.C4014b;

/* renamed from: I4.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1222a extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3584a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1979c f3585b;

    public C1222a(ArrayList arrayList, InterfaceC1979c listener) {
        AbstractC3292y.i(listener, "listener");
        this.f3584a = arrayList;
        this.f3585b = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C4014b viewHolder, int i8) {
        C2055u c2055u;
        AbstractC3292y.i(viewHolder, "viewHolder");
        ArrayList arrayList = this.f3584a;
        if (arrayList != null) {
            c2055u = (C2055u) arrayList.get(i8);
        } else {
            c2055u = null;
        }
        AbstractC3292y.f(c2055u);
        viewHolder.b(c2055u);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4014b onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_file_item, viewGroup, false);
        AbstractC3292y.f(inflate);
        return new C4014b(inflate, this.f3585b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f3584a;
        if (arrayList != null) {
            AbstractC3292y.f(arrayList);
            return arrayList.size();
        }
        return 0;
    }
}
