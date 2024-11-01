package c;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.RecyclerView;
import b8.a;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.gbc.GoogleBasicConsents;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.C3475q0;

/* renamed from: c.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1999g extends Fragment implements a.b {

    /* renamed from: g, reason: collision with root package name */
    public static final a f15163g = new a();

    /* renamed from: h, reason: collision with root package name */
    public static final String f15164h;

    /* renamed from: a, reason: collision with root package name */
    public TextView f15165a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f15166b;

    /* renamed from: c, reason: collision with root package name */
    public C1997e f15167c;

    /* renamed from: d, reason: collision with root package name */
    public S7.c f15168d;

    /* renamed from: e, reason: collision with root package name */
    public Typeface f15169e;

    /* renamed from: f, reason: collision with root package name */
    public Typeface f15170f;

    /* renamed from: c.g$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    static {
        String simpleName = C1999g.class.getSimpleName();
        AbstractC3292y.h(simpleName, "GBCPurposesFragment::class.java.simpleName");
        f15164h = simpleName;
    }

    @Override // b8.a.b
    public void b(b8.d item) {
        AbstractC3292y.i(item, "item");
    }

    @Override // b8.a.b
    public void e(b8.d item) {
        AbstractC3292y.i(item, "item");
    }

    public final void h() {
        RecyclerView.Adapter adapter;
        C1997e c1997e = this.f15167c;
        if (c1997e == null) {
            AbstractC3292y.y("viewModel");
            c1997e = null;
        }
        RecyclerView recyclerView = this.f15166b;
        if (recyclerView == null) {
            adapter = null;
        } else {
            adapter = recyclerView.getAdapter();
        }
        if (adapter != null) {
            List<b8.d> gbcList = ((b8.a) adapter).f15084a;
            c1997e.getClass();
            AbstractC3292y.i(gbcList, "gbcList");
            for (b8.d dVar : gbcList) {
                if (AbstractC3292y.d(dVar.f15123b, Boolean.TRUE)) {
                    C2001i.f15172a.d(dVar.f15122a.f3123a, GBCConsentValue.GRANTED);
                } else {
                    C2001i.f15172a.d(dVar.f15122a.f3123a, GBCConsentValue.DENIED);
                }
            }
            SharedStorage sharedStorage = c1997e.f15159a;
            X7.a aVar = X7.a.GBC_CONSENT_STRING;
            sharedStorage.d(aVar, C2001i.f15172a.a(sharedStorage.k(aVar), C2001i.f15174c));
            ChoiceCmpCallback choiceCmpCallback = c1997e.f15160b;
            if (choiceCmpCallback != null) {
                choiceCmpCallback.onGoogleBasicConsentChange(new GoogleBasicConsents(c1997e.a(gbcList, "adStorage"), c1997e.a(gbcList, "adUserData"), c1997e.a(gbcList, "adPersonalization"), c1997e.a(gbcList, "analyticsStorage")));
            }
            AbstractC3462k.d(C3475q0.f35747a, C3445b0.b(), null, new C1996d(null), 2, null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.inmobi.cmp.presentation.components.switchlist.SwitchAdapter");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3292y.h(viewModelStore, "viewModelStore");
            this.f15167c = (C1997e) new ViewModelProvider(viewModelStore, new C1998f()).get(C1997e.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        View inflate = inflater.inflate(M1.c.f6055m, viewGroup, false);
        AbstractC3292y.h(inflate, "inflater.inflate(R.layou…tainer, container, false)");
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:            if (r8.f4482b == com.inmobi.cmp.core.model.portalconfig.GBCConsentValue.GRANTED) goto L61;     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.C1999g.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
