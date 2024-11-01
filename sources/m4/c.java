package M4;

import J4.f;
import O4.l;
import P4.e;
import W4.g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class c extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final l f6173a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f6174b;

    public c(ArrayList arrayList, l listener) {
        AbstractC3292y.i(listener, "listener");
        this.f6173a = listener;
        this.f6174b = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(g viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        CheckBox checkBox = viewHolder.f10783a;
        ArrayList arrayList = this.f6174b;
        AbstractC3292y.f(arrayList);
        checkBox.setText(((e) arrayList.get(i8)).c());
        CheckBox checkBox2 = viewHolder.f10783a;
        ArrayList arrayList2 = this.f6174b;
        AbstractC3292y.f(arrayList2);
        checkBox2.setChecked(((e) arrayList2.get(i8)).a());
        CheckBox checkBox3 = viewHolder.f10783a;
        ArrayList arrayList3 = this.f6174b;
        AbstractC3292y.f(arrayList3);
        checkBox3.setEnabled(((e) arrayList3.get(i8)).b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(f.f4321v, viewGroup, false);
        AbstractC3292y.h(itemView, "itemView");
        return new g(itemView, this.f6173a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f6174b;
        AbstractC3292y.f(arrayList);
        return arrayList.size();
    }
}
