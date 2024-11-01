package a8;

import S7.o;
import a8.l;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class l extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final List f14201a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f14202b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f14203c;

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f14204d;

    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f14205a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f14206b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View rootView, Typeface typeface) {
            super(rootView);
            AbstractC3292y.i(rootView, "rootView");
            this.f14205a = typeface;
            View findViewById = rootView.findViewById(M1.b.f5975a1);
            AbstractC3292y.h(findViewById, "rootView.findViewById(R.id.tv_publisher_link_name)");
            this.f14206b = (TextView) findViewById;
        }

        public static final void a(Context context, o item, View view) {
            AbstractC3292y.i(context, "$context");
            AbstractC3292y.i(item, "$item");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(item.f9943b));
            context.startActivity(intent);
        }

        public final void b(final Context context, final o item, Integer num) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(item, "item");
            SpannableString spannableString = new SpannableString(item.f9942a);
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            TextView textView = this.f14206b;
            textView.setText(spannableString);
            if (num != null) {
                textView.setTextColor(num.intValue());
            }
            Typeface typeface = this.f14205a;
            if (typeface != null) {
                textView.setTypeface(typeface);
            }
            if (item.f9943b.length() > 0) {
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: a8.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        l.a.a(context, item, view);
                    }
                });
            }
        }
    }

    public l(List items, Context context, Integer num, Typeface typeface) {
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(context, "context");
        this.f14201a = items;
        this.f14202b = context;
        this.f14203c = num;
        this.f14204d = typeface;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f14201a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        a holder = (a) viewHolder;
        AbstractC3292y.i(holder, "holder");
        holder.b(this.f14202b, (o) this.f14201a.get(i8), this.f14203c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3292y.i(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(M1.c.f6065w, parent, false);
        AbstractC3292y.h(view, "view");
        return new a(view, this.f14204d);
    }
}
