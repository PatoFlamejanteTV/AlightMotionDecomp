package I4;

import J4.j;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1986j;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: I4.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1224c extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private Context f3588a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f3589b;

    /* renamed from: c, reason: collision with root package name */
    private int f3590c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1986j f3591d;

    /* renamed from: I4.c$a */
    /* loaded from: classes5.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private final ImageView f3592a;

        /* renamed from: b, reason: collision with root package name */
        private final TextView f3593b;

        /* renamed from: c, reason: collision with root package name */
        private final TextView f3594c;

        /* renamed from: d, reason: collision with root package name */
        private final RadioButton f3595d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1224c f3596e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1224c c1224c, View itemView) {
            super(itemView);
            AbstractC3292y.i(itemView, "itemView");
            this.f3596e = c1224c;
            View findViewById = itemView.findViewById(R.id.iv_path);
            AbstractC3292y.h(findViewById, "findViewById(...)");
            this.f3592a = (ImageView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.tv_path_name);
            AbstractC3292y.h(findViewById2, "findViewById(...)");
            TextView textView = (TextView) findViewById2;
            this.f3593b = textView;
            View findViewById3 = itemView.findViewById(R.id.tv_path_detail);
            AbstractC3292y.h(findViewById3, "findViewById(...)");
            TextView textView2 = (TextView) findViewById3;
            this.f3594c = textView2;
            View findViewById4 = itemView.findViewById(R.id.rb_path);
            AbstractC3292y.h(findViewById4, "findViewById(...)");
            this.f3595d = (RadioButton) findViewById4;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.v());
            textView2.setTypeface(aVar.v());
        }

        public final ImageView a() {
            return this.f3592a;
        }

        public final RadioButton b() {
            return this.f3595d;
        }

        public final TextView c() {
            return this.f3594c;
        }

        public final TextView d() {
            return this.f3593b;
        }
    }

    public C1224c(Context context, ArrayList arrayList, int i8, InterfaceC1986j listener) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        this.f3588a = context;
        this.f3589b = arrayList;
        this.f3590c = i8;
        this.f3591d = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C1224c c1224c, int i8, View view) {
        c1224c.f3590c = i8;
        c1224c.f3591d.a(i8);
        c1224c.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, final int i8) {
        boolean z8 = false;
        AbstractC3292y.i(holder, "holder");
        ArrayList arrayList = this.f3589b;
        AbstractC3292y.f(arrayList);
        if (((P4.f) arrayList.get(i8)).d()) {
            holder.a().setImageResource(R.drawable.vector_more_info_size);
            TextView d8 = holder.d();
            Resources resources = this.f3588a.getResources();
            S4.g gVar = new S4.g();
            ArrayList arrayList2 = this.f3589b;
            AbstractC3292y.f(arrayList2);
            d8.setText(resources.getString(R.string.sd_card_free, gVar.c(((P4.f) arrayList2.get(i8)).a())));
        } else {
            holder.a().setImageResource(R.drawable.vector_more_info_requirements);
            TextView d9 = holder.d();
            Resources resources2 = this.f3588a.getResources();
            S4.g gVar2 = new S4.g();
            ArrayList arrayList3 = this.f3589b;
            AbstractC3292y.f(arrayList3);
            d9.setText(resources2.getString(R.string.internal_memory_free, gVar2.c(((P4.f) arrayList3.get(i8)).a())));
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: I4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1224c.c(C1224c.this, i8, view);
            }
        });
        TextView c8 = holder.c();
        ArrayList arrayList4 = this.f3589b;
        AbstractC3292y.f(arrayList4);
        c8.setText(((P4.f) arrayList4.get(i8)).b());
        RadioButton b9 = holder.b();
        if (this.f3590c == i8) {
            z8 = true;
        }
        b9.setChecked(z8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3292y.i(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.download_path, parent, false);
        AbstractC3292y.f(inflate);
        return new a(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f3589b;
        if (arrayList == null) {
            return 0;
        }
        AbstractC3292y.f(arrayList);
        return arrayList.size();
    }
}
