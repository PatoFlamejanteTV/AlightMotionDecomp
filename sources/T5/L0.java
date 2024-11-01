package t5;

import J4.j;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class L0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Y4.o0 f39730a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f39731b;

    /* renamed from: c, reason: collision with root package name */
    private final b5.I f39732c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f39733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(Y4.o0 binding, Context context, b5.I i8, boolean z8) {
        super(binding.getRoot());
        AbstractC3292y.i(binding, "binding");
        AbstractC3292y.i(context, "context");
        this.f39730a = binding;
        this.f39731b = context;
        this.f39732c = i8;
        this.f39733d = z8;
        binding.f12882d.setOnClickListener(new View.OnClickListener() { // from class: t5.J0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.c(L0.this, view);
            }
        });
        binding.f12883e.setOnClickListener(new View.OnClickListener() { // from class: t5.K0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.d(L0.this, view);
            }
        });
        TextView textView = binding.f12884f;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        binding.f12883e.setTypeface(aVar.u());
        binding.f12885g.setTypeface(aVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(L0 l02, View view) {
        int bindingAdapterPosition;
        if (l02.f39732c != null && (bindingAdapterPosition = l02.getBindingAdapterPosition()) != -1) {
            l02.f39732c.a(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(L0 l02, View view) {
        int bindingAdapterPosition;
        if (l02.f39732c != null && (bindingAdapterPosition = l02.getBindingAdapterPosition()) != -1) {
            l02.f39732c.e(bindingAdapterPosition);
        }
    }

    public final void e(c5.G item) {
        AbstractC3292y.i(item, "item");
        com.squareup.picasso.s.h().l(item.c()).l(R.drawable.shape_bg_placeholder).n(UptodownApp.f29249C.f0(this.f39731b)).i(this.f39730a.f12880b);
        this.f39730a.f12884f.setText(item.d());
        if (!l6.n.t(item.e(), MBridgeConstans.ENDCARD_URL_TYPE_PL, false, 2, null)) {
            this.f39730a.f12885g.setText(item.e());
        }
        if (this.f39733d) {
            this.f39730a.f12883e.setText(this.f39731b.getString(R.string.cancel_registration));
            this.f39730a.f12883e.setBackground(ContextCompat.getDrawable(this.f39731b, R.drawable.ripple_cancel_button));
        } else {
            this.f39730a.f12883e.setText(this.f39731b.getString(R.string.pre_registration_title));
            this.f39730a.f12883e.setBackground(ContextCompat.getDrawable(this.f39731b, R.drawable.ripple_blue_primary_button));
        }
    }
}
