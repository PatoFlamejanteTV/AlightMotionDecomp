package a8;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class d extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final List f14163a;

    public d(List disclosures) {
        AbstractC3292y.i(disclosures, "disclosures");
        this.f14163a = disclosures;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f14163a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        f holder = (f) viewHolder;
        AbstractC3292y.i(holder, "holder");
        e disclosure = (e) this.f14163a.get(i8);
        holder.getClass();
        AbstractC3292y.i(disclosure, "disclosure");
        holder.f14179k.setText(disclosure.f14164a);
        holder.f14178j.setText(disclosure.f14165b);
        holder.f14177i.setText(disclosure.f14166c);
        holder.f14176h.setText(disclosure.f14167d);
        holder.f14175g.setText(disclosure.f14168e);
        S7.c cVar = Y7.d.f13157f;
        if (cVar != null) {
            Integer num = cVar.f9794i;
            if (num != null) {
                int intValue = num.intValue();
                holder.f14179k.setTextColor(intValue);
                holder.f14174f.setTextColor(intValue);
                holder.f14178j.setTextColor(intValue);
                holder.f14173e.setTextColor(intValue);
                holder.f14177i.setTextColor(intValue);
                holder.f14172d.setTextColor(intValue);
                holder.f14176h.setTextColor(intValue);
                holder.f14171c.setTextColor(intValue);
                holder.f14175g.setTextColor(intValue);
                holder.f14170b.setTextColor(intValue);
            }
            Integer num2 = cVar.f9786a;
            if (num2 != null) {
                holder.f14169a.setBackgroundColor(num2.intValue());
            }
        }
        S7.b bVar = Y7.d.f13156e;
        if (bVar != null) {
            Typeface typeface = bVar.f9785b;
            if (typeface != null) {
                holder.f14179k.setTypeface(typeface);
                holder.f14174f.setTypeface(typeface);
                holder.f14178j.setTypeface(typeface);
                holder.f14173e.setTypeface(typeface);
                holder.f14177i.setTypeface(typeface);
                holder.f14172d.setTypeface(typeface);
                holder.f14176h.setTypeface(typeface);
                holder.f14171c.setTypeface(typeface);
                holder.f14175g.setTypeface(typeface);
            }
            Typeface typeface2 = bVar.f9784a;
            if (typeface2 != null) {
                holder.f14170b.setTypeface(typeface2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3292y.i(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(M1.c.f6057o, parent, false);
        AbstractC3292y.h(view, "view");
        return new f(view);
    }
}
