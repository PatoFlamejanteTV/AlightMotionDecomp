package B5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class e extends a8.a {

    /* renamed from: o, reason: collision with root package name */
    public static final a f613o = new a();

    /* renamed from: p, reason: collision with root package name */
    public static final String f614p = e.class.getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    public b f615m;

    /* renamed from: n, reason: collision with root package name */
    public B5.a f616n;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    public static final void k(e this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.dismiss();
    }

    @Override // a8.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        B5.a aVar;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            aVar = null;
        } else {
            aVar = (B5.a) arguments.getParcelable("partner_disclosure_args");
        }
        if (aVar == null) {
            aVar = new B5.a(new ArrayList());
        }
        this.f616n = aVar;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3292y.h(viewModelStore, "viewModelStore");
            this.f615m = (b) new ViewModelProvider(viewModelStore, new c()).get(b.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        View inflate = inflater.inflate(M1.c.f6052j, viewGroup, false);
        AbstractC3292y.h(inflate, "inflater.inflate(R.layou…osures, container, false)");
        return inflate;
    }

    @Override // a8.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Integer num;
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(M1.b.f5953Q);
        b bVar = null;
        if (recyclerView != null) {
            B5.a aVar = this.f616n;
            if (aVar == null) {
                AbstractC3292y.y("args");
                aVar = null;
            }
            recyclerView.setAdapter(new a8.d(aVar.f610a));
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        }
        TextView textView = this.f14148b;
        if (textView != null) {
            b bVar2 = this.f615m;
            if (bVar2 == null) {
                AbstractC3292y.y("viewModel");
                bVar2 = null;
            }
            textView.setText(bVar2.f611a.f9930a);
        }
        ImageView imageView = this.f14149c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: B5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    e.k(e.this, view2);
                }
            });
            b bVar3 = this.f615m;
            if (bVar3 == null) {
                AbstractC3292y.y("viewModel");
            } else {
                bVar = bVar3;
            }
            imageView.setContentDescription(bVar.f611a.f9931b);
        }
        S7.c cVar = this.f14156j;
        if (cVar != null && (num = cVar.f9792g) != null) {
            view.setBackgroundColor(num.intValue());
        }
    }
}
