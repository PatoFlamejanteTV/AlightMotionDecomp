package I4;

import S4.x;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1987k;
import com.uptodown.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3770C;
import t5.C4053v;

/* renamed from: I4.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1227f extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3604a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1987k f3605b;

    /* renamed from: c, reason: collision with root package name */
    private int f3606c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f3607d;

    /* renamed from: e, reason: collision with root package name */
    private final Animation f3608e;

    /* renamed from: I4.f$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private File f3609a;

        /* renamed from: b, reason: collision with root package name */
        private c5.r f3610b;

        public a(File file, c5.r download) {
            AbstractC3292y.i(file, "file");
            AbstractC3292y.i(download, "download");
            this.f3609a = file;
            this.f3610b = download;
        }

        public final c5.r a() {
            return this.f3610b;
        }

        public final File b() {
            return this.f3609a;
        }
    }

    public C1227f(Context context, InterfaceC1987k listener) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        this.f3604a = context;
        this.f3605b = listener;
        this.f3607d = new ArrayList();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_in_bottom);
        AbstractC3292y.h(loadAnimation, "loadAnimation(...)");
        this.f3608e = loadAnimation;
        loadAnimation.setDuration(300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1227f c1227f, a aVar, View view) {
        c1227f.f3605b.a(aVar.b());
        c1227f.e(aVar.b());
    }

    public final void b(File file, c5.r download) {
        AbstractC3292y.i(file, "file");
        AbstractC3292y.i(download, "download");
        this.f3607d.add(new a(file, download));
        notifyItemInserted(this.f3607d.size());
    }

    public final int c(File file) {
        AbstractC3292y.i(file, "file");
        Iterator it = this.f3607d.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            if (!AbstractC3292y.d(((a) it.next()).b().getAbsolutePath(), file.getAbsolutePath())) {
                i8 = i9;
            } else {
                return i8;
            }
        }
        return -1;
    }

    public final void e(File file) {
        AbstractC3292y.i(file, "file");
        Iterator it = this.f3607d.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                int i9 = i8 + 1;
                if (AbstractC3292y.d(((a) it.next()).b().getAbsolutePath(), file.getAbsolutePath())) {
                    break;
                } else {
                    i8 = i9;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        if (i8 > -1) {
            this.f3607d.remove(i8);
            this.f3606c--;
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3607d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        Object obj = this.f3607d.get(absoluteAdapterPosition);
        AbstractC3292y.h(obj, "get(...)");
        final a aVar = (a) obj;
        if (viewHolder instanceof C4053v) {
            C4053v c4053v = (C4053v) viewHolder;
            c4053v.d().setText(aVar.a().X());
            String X8 = aVar.a().X();
            AbstractC3292y.f(X8);
            if (l6.n.r(X8, ".apk", false, 2, null)) {
                C3770C c3770c = C3770C.f37260a;
                Context context = this.f3604a;
                String path = aVar.b().getPath();
                AbstractC3292y.h(path, "getPath(...)");
                c4053v.a().setImageDrawable(c3770c.k(context, path, R.drawable.core_vector_apk));
            } else {
                x.a aVar2 = S4.x.f9510b;
                String X9 = aVar.a().X();
                AbstractC3292y.f(X9);
                if (aVar2.a(X9)) {
                    c4053v.a().setImageResource(R.drawable.core_vector_xapk);
                }
            }
        }
        if (absoluteAdapterPosition > this.f3606c) {
            viewHolder.itemView.startAnimation(this.f3608e);
            this.f3606c = absoluteAdapterPosition;
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: I4.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1227f.d(C1227f.this, aVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(this.f3604a).inflate(R.layout.floating_notification, viewGroup, false);
        AbstractC3292y.f(inflate);
        return new C4053v(inflate);
    }
}
