package I4;

import I4.C1234m;
import J4.j;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1977a;
import c5.C2043h;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: I4.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1234m extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final b5.s f3653a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1977a f3654b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3655c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f3656d;

    /* renamed from: I4.m$a */
    /* loaded from: classes5.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private b5.s f3657a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1977a f3658b;

        /* renamed from: c, reason: collision with root package name */
        private Context f3659c;

        /* renamed from: d, reason: collision with root package name */
        private final ImageView f3660d;

        /* renamed from: e, reason: collision with root package name */
        private final TextView f3661e;

        /* renamed from: f, reason: collision with root package name */
        private final TextView f3662f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C1234m f3663g;

        /* renamed from: I4.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public /* synthetic */ class C0069a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3664a;

            static {
                int[] iArr = new int[C2043h.c.values().length];
                try {
                    iArr[C2043h.c.f15869e.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C2043h.c.f15867c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C2043h.c.f15865a.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[C2043h.c.f15866b.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[C2043h.c.f15868d.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f3664a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1234m c1234m, View view, b5.s sVar, InterfaceC1977a actionsClickListener, Context context) {
            super(view);
            AbstractC3292y.i(view, "view");
            AbstractC3292y.i(actionsClickListener, "actionsClickListener");
            AbstractC3292y.i(context, "context");
            this.f3663g = c1234m;
            this.f3657a = sVar;
            this.f3658b = actionsClickListener;
            this.f3659c = context;
            this.f3660d = (ImageView) view.findViewById(R.id.iv_feature_home);
            TextView textView = (TextView) view.findViewById(R.id.tv_tag_feature_home);
            this.f3661e = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.tv_name_feature_home);
            this.f3662f = textView2;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.u());
            textView2.setTypeface(aVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(a aVar, C2043h c2043h, View view) {
            if (aVar.f3657a != null && aVar.getBindingAdapterPosition() != -1) {
                b5.s sVar = aVar.f3657a;
                AbstractC3292y.f(sVar);
                sVar.a(c2043h);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(a aVar, C2043h c2043h, int i8, View view) {
            aVar.f3658b.a(c2043h, i8);
            return true;
        }

        private final void f() {
            this.f3661e.setBackground(ContextCompat.getDrawable(this.f3659c, R.drawable.bg_dev_on_board));
            this.f3661e.setTextColor(ContextCompat.getColor(this.f3659c, R.color.main_dark_grey));
        }

        private final void g() {
            this.f3661e.setBackground(ContextCompat.getDrawable(this.f3659c, R.drawable.shape_bg_tag_latest));
        }

        private final void h() {
            this.f3661e.setBackground(ContextCompat.getDrawable(this.f3659c, R.drawable.shape_bg_tag_promoted));
        }

        private final void i() {
            this.f3661e.setBackground(ContextCompat.getDrawable(this.f3659c, R.drawable.shape_bg_tag_trending));
        }

        private final void j() {
            this.f3661e.setBackground(ContextCompat.getDrawable(this.f3659c, R.drawable.shape_bg_accent_green));
        }

        public final void c(final C2043h appInfo, final int i8) {
            AbstractC3292y.i(appInfo, "appInfo");
            UptodownApp.a aVar = UptodownApp.f29249C;
            int H8 = aVar.H();
            int dimension = (int) this.f3659c.getResources().getDimension(R.dimen.margin_s);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(H8, -2);
            layoutParams.setMargins(dimension, 0, dimension, 0);
            this.itemView.setLayoutParams(layoutParams);
            if (appInfo.T0() != C2043h.c.f15870f) {
                this.f3661e.setText(appInfo.S0());
                this.f3661e.setVisibility(0);
                this.f3661e.setTextColor(ContextCompat.getColor(this.f3659c, R.color.white));
                int i9 = C0069a.f3664a[appInfo.T0().ordinal()];
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 4) {
                                if (i9 == 5) {
                                    f();
                                }
                            } else {
                                h();
                            }
                        } else {
                            j();
                        }
                    } else {
                        g();
                    }
                } else {
                    i();
                }
            }
            this.f3662f.setText(appInfo.q0());
            this.f3660d.setLayoutParams(new RelativeLayout.LayoutParams(-1, aVar.z()));
            com.squareup.picasso.s.h().l(appInfo.b0()).f().n(aVar.e0(this.f3659c)).i(this.f3660d);
            this.f3660d.setOnClickListener(new View.OnClickListener() { // from class: I4.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1234m.a.d(C1234m.a.this, appInfo, view);
                }
            });
            this.f3660d.setOnLongClickListener(new View.OnLongClickListener() { // from class: I4.l
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean e8;
                    e8 = C1234m.a.e(C1234m.a.this, appInfo, i8, view);
                    return e8;
                }
            });
        }
    }

    public C1234m(b5.s sVar, InterfaceC1977a actionsClickListener, Context context) {
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(context, "context");
        this.f3653a = sVar;
        this.f3654b = actionsClickListener;
        this.f3655c = context;
        this.f3656d = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i8) {
        AbstractC3292y.i(holder, "holder");
        int size = i8 % this.f3656d.size();
        Object obj = this.f3656d.get(size);
        AbstractC3292y.h(obj, "get(...)");
        holder.c((C2043h) obj, size);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3292y.i(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_fragment_header_image, parent, false);
        AbstractC3292y.f(inflate);
        return new a(this, inflate, this.f3653a, this.f3654b, this.f3655c);
    }

    public final void c(ArrayList headerPrograms) {
        AbstractC3292y.i(headerPrograms, "headerPrograms");
        ArrayList arrayList = this.f3656d;
        arrayList.clear();
        arrayList.addAll(headerPrograms);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3656d.size() * 100;
    }
}
