package I4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import t5.C4053v;

/* loaded from: classes5.dex */
public final class A extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3413a;

    /* renamed from: b, reason: collision with root package name */
    private final b5.y f3414b;

    /* renamed from: c, reason: collision with root package name */
    private int f3415c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f3416d;

    /* renamed from: e, reason: collision with root package name */
    private final Animation f3417e;

    public A(Context context, b5.y listener) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        this.f3413a = context;
        this.f3414b = listener;
        this.f3416d = new ArrayList();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_in_bottom);
        AbstractC3292y.h(loadAnimation, "loadAnimation(...)");
        this.f3417e = loadAnimation;
        loadAnimation.setDuration(300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(A a9, c5.G g8, View view) {
        a9.f3414b.b(g8);
    }

    public final void b(c5.G preRegister) {
        AbstractC3292y.i(preRegister, "preRegister");
        this.f3416d.add(preRegister);
        notifyItemInserted(this.f3416d.size());
    }

    public final void d(c5.G preRegister) {
        AbstractC3292y.i(preRegister, "preRegister");
        Iterator it = this.f3416d.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                int i9 = i8 + 1;
                if (((c5.G) it.next()).b() == preRegister.b()) {
                    break;
                } else {
                    i8 = i9;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        e(i8);
    }

    public final void e(int i8) {
        if (i8 > -1 && i8 < this.f3416d.size()) {
            this.f3416d.remove(i8);
            this.f3415c--;
            notifyDataSetChanged();
            this.f3414b.a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3416d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        Object obj = this.f3416d.get(absoluteAdapterPosition);
        AbstractC3292y.h(obj, "get(...)");
        final c5.G g8 = (c5.G) obj;
        if (viewHolder instanceof C4053v) {
            C4053v c4053v = (C4053v) viewHolder;
            c4053v.d().setText(g8.d());
            com.squareup.picasso.s.h().l(g8.c()).l(R.drawable.shape_bg_placeholder).n(UptodownApp.f29249C.f0(this.f3413a)).i(c4053v.a());
            c4053v.b().setText(this.f3413a.getString(R.string.preregister_available_to_download));
            c4053v.c().setText(this.f3413a.getString(R.string.updates_button_download_app));
        }
        if (absoluteAdapterPosition > this.f3415c) {
            viewHolder.itemView.startAnimation(this.f3417e);
            this.f3415c = absoluteAdapterPosition;
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: I4.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                A.c(A.this, g8, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(this.f3413a).inflate(R.layout.floating_notification, viewGroup, false);
        AbstractC3292y.f(inflate);
        return new C4053v(inflate);
    }
}
