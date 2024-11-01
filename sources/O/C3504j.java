package o;

import a8.i;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b8.a;
import e6.AbstractC2829a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;

/* renamed from: o.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3504j extends a8.a implements a.b {

    /* renamed from: t, reason: collision with root package name */
    public static final a f35799t = new a();

    /* renamed from: u, reason: collision with root package name */
    public static final String f35800u = C3504j.class.getName();

    /* renamed from: m, reason: collision with root package name */
    public ConstraintLayout f35801m;

    /* renamed from: n, reason: collision with root package name */
    public Button f35802n;

    /* renamed from: o, reason: collision with root package name */
    public Button f35803o;

    /* renamed from: p, reason: collision with root package name */
    public RecyclerView f35804p;

    /* renamed from: q, reason: collision with root package name */
    public C3507m f35805q;

    /* renamed from: r, reason: collision with root package name */
    public x5.k f35806r;

    /* renamed from: s, reason: collision with root package name */
    public b8.a f35807s;

    /* renamed from: o.j$a */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    public static final void k(PopupWindow mypopupWindow, C3504j this$0, View view) {
        AbstractC3292y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3292y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f14148b;
        if (textView != null) {
            textView.setText(this$0.getString(M1.e.f6078j));
        }
        C3507m c3507m = this$0.f35805q;
        if (c3507m == null) {
            AbstractC3292y.y("viewModel");
            c3507m = null;
        }
        c3507m.e(G5.j.ALL_VENDORS);
        this$0.v();
    }

    public static final void m(C3504j this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void n(C3504j this$0, PopupWindow mypopupWindow, ImageView imageView, CardView cardView, TextView textView, TextView textView2, TextView textView3, View view) {
        Integer num;
        Integer num2;
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(mypopupWindow, "$mypopupWindow");
        S7.c cVar = this$0.f14156j;
        if (cVar != null && (num2 = cVar.f9792g) != null) {
            cardView.setBackgroundTintList(ColorStateList.valueOf(num2.intValue()));
        }
        S7.c cVar2 = this$0.f14156j;
        if (cVar2 != null && (num = cVar2.f9796k) != null) {
            int intValue = num.intValue();
            if (textView != null) {
                textView.setTextColor(ColorStateList.valueOf(intValue));
            }
            if (textView2 != null) {
                textView2.setTextColor(ColorStateList.valueOf(intValue));
            }
            if (textView3 != null) {
                textView3.setTextColor(ColorStateList.valueOf(intValue));
            }
        }
        mypopupWindow.showAsDropDown(imageView);
    }

    public static final void o(PopupWindow mypopupWindow, C3504j this$0, View view) {
        AbstractC3292y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3292y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f14148b;
        if (textView != null) {
            textView.setText(this$0.getString(M1.e.f6079k));
        }
        C3507m c3507m = this$0.f35805q;
        if (c3507m == null) {
            AbstractC3292y.y("viewModel");
            c3507m = null;
        }
        c3507m.e(G5.j.IAB_VENDORS);
        this$0.v();
    }

    public static final void p(C3504j this$0, View view) {
        G6.f fVar;
        Map map;
        AbstractC3292y.i(this$0, "this$0");
        C3507m c3507m = this$0.f35805q;
        if (c3507m == null) {
            AbstractC3292y.y("viewModel");
            c3507m = null;
        }
        G6.e eVar = c3507m.f35811a.f1414a;
        if (eVar != null && (map = eVar.f3119i) != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (!((G6.l) entry.getValue()).f3131e.isEmpty()) {
                    c3507m.f35811a.f1409C.unset(((G6.l) entry.getValue()).f3123a);
                }
            }
        }
        for (J6.d dVar : c3507m.f35813c.f4493a) {
            if (!dVar.f4492g.isEmpty()) {
                c3507m.f35811a.f1410D.unset(dVar.f4486a);
            }
        }
        Map i8 = c3507m.i();
        if (i8 != null) {
            Iterator it = i8.entrySet().iterator();
            while (it.hasNext()) {
                c3507m.f35811a.f1432s.unset(Integer.parseInt((String) ((Map.Entry) it.next()).getKey()));
            }
        }
        b8.d h8 = c3507m.h();
        if (h8 != null && (fVar = h8.f15122a) != null) {
            c3507m.f35811a.f1434u.unset(fVar.f3123a);
        }
        Q7.m mVar = Q7.m.f9074a;
        Q7.n navigationTag = Q7.n.OBJECT_ALL_LEGITIMATE;
        AbstractC3292y.i(navigationTag, "navigationTag");
        Y7.d.f13152a.n().getClass();
        Q7.m.f9076c.e(String.valueOf(navigationTag), "_legitimatePurposesConsents");
        this$0.u();
    }

    public static final void q(PopupWindow mypopupWindow, C3504j this$0, View view) {
        AbstractC3292y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3292y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f14148b;
        if (textView != null) {
            textView.setText(this$0.getString(M1.e.f6080l));
        }
        C3507m c3507m = this$0.f35805q;
        if (c3507m == null) {
            AbstractC3292y.y("viewModel");
            c3507m = null;
        }
        c3507m.e(G5.j.NON_IAB_VENDORS);
        this$0.v();
    }

    public static final void r(C3504j this$0, View view) {
        G6.f fVar;
        Map map;
        AbstractC3292y.i(this$0, "this$0");
        C3507m c3507m = this$0.f35805q;
        if (c3507m == null) {
            AbstractC3292y.y("viewModel");
            c3507m = null;
        }
        G6.e eVar = c3507m.f35811a.f1414a;
        if (eVar != null && (map = eVar.f3119i) != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (!((G6.l) entry.getValue()).f3131e.isEmpty()) {
                    c3507m.f35811a.f1409C.set(((G6.l) entry.getValue()).f3123a);
                }
            }
        }
        for (J6.d dVar : c3507m.f35813c.f4493a) {
            if (!dVar.f4492g.isEmpty()) {
                c3507m.f35811a.f1410D.set(dVar.f4486a);
            }
        }
        Map i8 = c3507m.i();
        if (i8 != null) {
            Iterator it = i8.entrySet().iterator();
            while (it.hasNext()) {
                c3507m.f35811a.f1432s.set(Integer.parseInt((String) ((Map.Entry) it.next()).getKey()));
            }
        }
        b8.d h8 = c3507m.h();
        if (h8 != null && (fVar = h8.f15122a) != null) {
            c3507m.f35811a.f1434u.set(fVar.f3123a);
        }
        Q7.m mVar = Q7.m.f9074a;
        Q7.n navigationTag = Q7.n.ACCEPT_ALL_LEGITIMATE;
        AbstractC3292y.i(navigationTag, "navigationTag");
        Y7.d.f13152a.n().getClass();
        Q7.m.f9076c.e(String.valueOf(navigationTag), "_legitimatePurposesConsents");
        this$0.u();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01de  */
    @Override // b8.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(b8.d r9) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3504j.b(b8.d):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b8.a.b
    public void e(b8.d item) {
        String str;
        E5.f fVar;
        String str2;
        String str3;
        String str4;
        G6.c cVar;
        String str5;
        String num;
        AbstractC3292y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            G6.f fVar2 = item.f15122a;
            if (fVar2 instanceof G6.l) {
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                String str6 = E5.f.f1962I;
                if (supportFragmentManager.findFragmentByTag(str6) == null) {
                    G6.f fVar3 = item.f15122a;
                    if (fVar3 instanceof G6.l) {
                        String str7 = fVar3.f3124b;
                        String str8 = ((G6.l) fVar3).f3129c;
                        C3507m c3507m = this.f35805q;
                        if (c3507m == null) {
                            AbstractC3292y.y("viewModel");
                            c3507m = null;
                        }
                        String a9 = c3507m.a(((G6.l) item.f15122a).f3131e, G5.a.PURPOSE);
                        C3507m c3507m2 = this.f35805q;
                        if (c3507m2 == null) {
                            AbstractC3292y.y("viewModel");
                            c3507m2 = null;
                        }
                        String a10 = c3507m2.a(((G6.l) item.f15122a).f3133g, G5.a.SPECIAL_PURPOSE);
                        C3507m c3507m3 = this.f35805q;
                        if (c3507m3 == null) {
                            AbstractC3292y.y("viewModel");
                            c3507m3 = null;
                        }
                        String a11 = c3507m3.a(((G6.l) item.f15122a).f3134h, G5.a.FEATURE);
                        C3507m c3507m4 = this.f35805q;
                        if (c3507m4 == null) {
                            AbstractC3292y.y("viewModel");
                            c3507m4 = null;
                        }
                        String a12 = c3507m4.a(((G6.l) item.f15122a).f3135i, G5.a.SPECIAL_FEATURE);
                        C3507m c3507m5 = this.f35805q;
                        if (c3507m5 == null) {
                            AbstractC3292y.y("viewModel");
                            c3507m5 = null;
                        }
                        String a13 = c3507m5.a(((G6.l) item.f15122a).f3140n, G5.a.DATA_DECLARATION);
                        String str9 = ((G6.l) item.f15122a).f3136j;
                        C3507m c3507m6 = this.f35805q;
                        if (c3507m6 == null) {
                            AbstractC3292y.y("viewModel");
                            c3507m6 = null;
                        }
                        int i8 = ((G6.l) item.f15122a).f3138l;
                        c3507m6.getClass();
                        if (i8 < 0) {
                            str = str6;
                            str2 = "";
                        } else {
                            float f8 = i8 / 86400.0f;
                            str = str6;
                            if (f8 >= 1.0f) {
                                str2 = AbstractC2829a.d(f8) + ' ' + c3507m6.f35814d.g().f9916i;
                            } else {
                                str2 = i8 + ' ' + c3507m6.f35814d.g().f9917j;
                            }
                        }
                        C3507m c3507m7 = this.f35805q;
                        if (c3507m7 == null) {
                            AbstractC3292y.y("viewModel");
                            c3507m7 = null;
                        }
                        Boolean bool = ((G6.l) item.f15122a).f3139m;
                        c3507m7.getClass();
                        if (AbstractC3292y.d(bool, Boolean.TRUE)) {
                            str4 = c3507m7.f35814d.g().f9920m;
                        } else if (!AbstractC3292y.d(bool, Boolean.FALSE)) {
                            str3 = "";
                            cVar = ((G6.l) item.f15122a).f3141o;
                            if (cVar == null || (num = Integer.valueOf(cVar.f3108a).toString()) == null) {
                                str5 = "";
                            } else {
                                str5 = num;
                            }
                            G6.f fVar4 = item.f15122a;
                            E5.a args = new E5.a(str7, str8, null, a9, a10, a11, a12, a13, str9, str2, str3, str5, fVar4.f3123a, item.f15125d, ((G6.l) fVar4).f3142p, "Error: cannot load vendor file", 4);
                            AbstractC3292y.i(args, "args");
                            fVar = new E5.f();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("partner_detail_args", args);
                            fVar.setArguments(bundle);
                        } else {
                            str4 = c3507m7.f35814d.g().f9921n;
                        }
                        str3 = str4;
                        cVar = ((G6.l) item.f15122a).f3141o;
                        if (cVar == null) {
                            str5 = num;
                            G6.f fVar42 = item.f15122a;
                            E5.a args2 = new E5.a(str7, str8, null, a9, a10, a11, a12, a13, str9, str2, str3, str5, fVar42.f3123a, item.f15125d, ((G6.l) fVar42).f3142p, "Error: cannot load vendor file", 4);
                            AbstractC3292y.i(args2, "args");
                            fVar = new E5.f();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("partner_detail_args", args2);
                            fVar.setArguments(bundle2);
                        }
                        str5 = "";
                        G6.f fVar422 = item.f15122a;
                        E5.a args22 = new E5.a(str7, str8, null, a9, a10, a11, a12, a13, str9, str2, str3, str5, fVar422.f3123a, item.f15125d, ((G6.l) fVar422).f3142p, "Error: cannot load vendor file", 4);
                        AbstractC3292y.i(args22, "args");
                        fVar = new E5.f();
                        Bundle bundle22 = new Bundle();
                        bundle22.putParcelable("partner_detail_args", args22);
                        fVar.setArguments(bundle22);
                    } else {
                        str = str6;
                        fVar = null;
                    }
                    if (fVar != null) {
                        activity.getSupportFragmentManager().beginTransaction().add(fVar, str).commit();
                        return;
                    }
                    return;
                }
                return;
            }
            if (fVar2 instanceof G6.g) {
                FragmentManager supportFragmentManager2 = activity.getSupportFragmentManager();
                i.a aVar = a8.i.f14184y;
                String str10 = a8.i.f14185z;
                if (supportFragmentManager2.findFragmentByTag(str10) == null) {
                    FragmentTransaction beginTransaction = activity.getSupportFragmentManager().beginTransaction();
                    G6.f fVar5 = item.f15122a;
                    String str11 = fVar5.f3124b;
                    String a14 = ((G6.g) fVar5).a();
                    String b9 = ((G6.g) item.f15122a).b();
                    x5.k kVar = this.f35806r;
                    if (kVar == null) {
                        AbstractC3292y.y("optionsViewModel");
                        kVar = null;
                    }
                    String str12 = kVar.f41127f.f().f9900i;
                    x5.k kVar2 = this.f35806r;
                    if (kVar2 == null) {
                        AbstractC3292y.y("optionsViewModel");
                        kVar2 = null;
                    }
                    String str13 = kVar2.f41127f.f().f9905n;
                    int i9 = item.f15122a.f3123a;
                    b8.e eVar = item.f15125d;
                    C3507m c3507m8 = this.f35805q;
                    if (c3507m8 == null) {
                        AbstractC3292y.y("viewModel");
                        c3507m8 = null;
                    }
                    beginTransaction.add(aVar.b(str11, a14, b9, str12, str13, i9, eVar, true, c3507m8.f35820j), str10).commit();
                }
            }
        }
    }

    public final void l(Set set) {
        boolean z8;
        Button button = this.f35803o;
        boolean z9 = false;
        if (button != null) {
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue()) {
                        z8 = true;
                        break;
                    }
                }
            }
            z8 = false;
            button.setEnabled(z8);
        }
        Button button2 = this.f35802n;
        if (button2 != null) {
            if (!set.isEmpty()) {
                Iterator it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!((Boolean) it2.next()).booleanValue()) {
                        z9 = true;
                        break;
                    }
                }
            }
            button2.setEnabled(z9);
        }
    }

    @Override // a8.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3292y.h(viewModelStore, "viewModelStore");
            this.f35805q = (C3507m) new ViewModelProvider(viewModelStore, new n()).get(C3507m.class);
            ViewModelStore viewModelStore2 = activity.getViewModelStore();
            AbstractC3292y.h(viewModelStore2, "it.viewModelStore");
            this.f35806r = (x5.k) new ViewModelProvider(viewModelStore2, new x5.l()).get(x5.k.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        View inflate = inflater.inflate(M1.c.f6045c, viewGroup, false);
        AbstractC3292y.h(inflate, "inflater.inflate(R.layou…terest, container, false)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        boolean hasFocus;
        super.onPause();
        C3507m c3507m = this.f35805q;
        if (c3507m == null) {
            AbstractC3292y.y("viewModel");
            c3507m = null;
        }
        SearchView searchView = this.f14151e;
        if (searchView == null) {
            hasFocus = false;
        } else {
            hasFocus = searchView.hasFocus();
        }
        c3507m.f35821k = hasFocus;
    }

    @Override // a8.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        SearchView searchView;
        Integer num5;
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f35801m = (ConstraintLayout) view.findViewById(M1.b.f5931F);
        this.f35802n = (Button) view.findViewById(M1.b.f6003k);
        this.f35803o = (Button) view.findViewById(M1.b.f5997i);
        this.f35804p = (RecyclerView) view.findViewById(M1.b.f5974a0);
        C3507m c3507m = this.f35805q;
        C3507m c3507m2 = null;
        if (c3507m == null) {
            AbstractC3292y.y("viewModel");
            c3507m = null;
        }
        c3507m.getClass();
        AbstractC3462k.d(ViewModelKt.getViewModelScope(c3507m), C3445b0.b(), null, new C3506l(c3507m, null), 2, null);
        TextView textView = this.f14148b;
        if (textView != null) {
            C3507m c3507m3 = this.f35805q;
            if (c3507m3 == null) {
                AbstractC3292y.y("viewModel");
                c3507m3 = null;
            }
            textView.setText(c3507m3.f35814d.e().f9866a);
        }
        ImageView imageView = this.f14149c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3504j.m(C3504j.this, view2);
                }
            });
            C3507m c3507m4 = this.f35805q;
            if (c3507m4 == null) {
                AbstractC3292y.y("viewModel");
                c3507m4 = null;
            }
            imageView.setContentDescription(c3507m4.f35814d.e().f9876k);
        }
        x();
        SearchView searchView2 = this.f14151e;
        if (searchView2 != null) {
            searchView2.setVisibility(0);
        }
        SearchView searchView3 = this.f14151e;
        if (searchView3 != null) {
            C3507m c3507m5 = this.f35805q;
            if (c3507m5 == null) {
                AbstractC3292y.y("viewModel");
                c3507m5 = null;
            }
            searchView3.setQueryHint(c3507m5.f35814d.e().f9871f);
        }
        SearchView searchView4 = this.f14151e;
        if (searchView4 != null) {
            searchView4.setOnQueryTextListener(new C3505k(this));
        }
        C3507m c3507m6 = this.f35805q;
        if (c3507m6 == null) {
            AbstractC3292y.y("viewModel");
            c3507m6 = null;
        }
        List c8 = C3507m.c(c3507m6, null, 1);
        C3507m c3507m7 = this.f35805q;
        if (c3507m7 == null) {
            AbstractC3292y.y("viewModel");
            c3507m7 = null;
        }
        String str = c3507m7.f35814d.e().f9867b;
        C3507m c3507m8 = this.f35805q;
        if (c3507m8 == null) {
            AbstractC3292y.y("viewModel");
            c3507m8 = null;
        }
        String str2 = c3507m8.f35814d.e().f9868c;
        S7.c cVar = this.f14156j;
        if (cVar == null) {
            num = null;
        } else {
            num = cVar.f9794i;
        }
        if (cVar == null) {
            num2 = null;
        } else {
            num2 = cVar.f9790e;
        }
        if (cVar == null) {
            num3 = null;
        } else {
            num3 = cVar.f9791f;
        }
        if (cVar == null) {
            num4 = null;
        } else {
            num4 = cVar.f9786a;
        }
        this.f35807s = new b8.a(c8, this, str, str2, num, num2, num3, num4, this.f14157k, this.f14158l);
        RecyclerView recyclerView = this.f35804p;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            b8.a aVar = this.f35807s;
            if (aVar == null) {
                AbstractC3292y.y("switchAdapter");
                aVar = null;
            }
            recyclerView.setAdapter(aVar);
        }
        w();
        S7.c cVar2 = this.f14156j;
        if (cVar2 != null && (num5 = cVar2.f9792g) != null) {
            int intValue = num5.intValue();
            ConstraintLayout constraintLayout = this.f35801m;
            if (constraintLayout != null) {
                constraintLayout.setBackgroundColor(intValue);
            }
        }
        Button button = this.f35803o;
        if (button != null) {
            ColorStateList t8 = t();
            if (t8 != null) {
                button.setTextColor(t8);
            }
            ColorStateList s8 = s();
            if (s8 != null) {
                button.setBackgroundTintList(s8);
            }
        }
        Button button2 = this.f35802n;
        if (button2 != null) {
            ColorStateList t9 = t();
            if (t9 != null) {
                button2.setTextColor(t9);
            }
            ColorStateList s9 = s();
            if (s9 != null) {
                button2.setBackgroundTintList(s9);
            }
        }
        Typeface typeface = this.f14158l;
        if (typeface != null) {
            Button button3 = this.f35803o;
            if (button3 != null) {
                button3.setTypeface(typeface);
            }
            Button button4 = this.f35802n;
            if (button4 != null) {
                button4.setTypeface(typeface);
            }
        }
        C3507m c3507m9 = this.f35805q;
        if (c3507m9 == null) {
            AbstractC3292y.y("viewModel");
        } else {
            c3507m2 = c3507m9;
        }
        if (c3507m2.f35821k && (searchView = this.f14151e) != null) {
            searchView.requestFocus();
        }
    }

    public final ColorStateList s() {
        Integer num;
        S7.c cVar = this.f14156j;
        if (cVar == null || (num = cVar.f9800o) == null || cVar.f9801p == null) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{num.intValue(), cVar.f9801p.intValue()});
    }

    public final ColorStateList t() {
        Integer num;
        S7.c cVar = this.f14156j;
        if (cVar == null || (num = cVar.f9798m) == null || cVar.f9799n == null) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{num.intValue(), cVar.f9799n.intValue()});
    }

    public final void u() {
        b8.a aVar = this.f35807s;
        C3507m c3507m = null;
        if (aVar == null) {
            AbstractC3292y.y("switchAdapter");
            aVar = null;
        }
        C3507m c3507m2 = this.f35805q;
        if (c3507m2 == null) {
            AbstractC3292y.y("viewModel");
            c3507m2 = null;
        }
        aVar.b(C3507m.c(c3507m2, null, 1), false);
        SearchView searchView = this.f14151e;
        if (searchView != null) {
            searchView.setQuery("", false);
        }
        C3507m c3507m3 = this.f35805q;
        if (c3507m3 == null) {
            AbstractC3292y.y("viewModel");
        } else {
            c3507m = c3507m3;
        }
        l(c3507m.d());
    }

    public final void v() {
        CharSequence query;
        boolean z8;
        SearchView searchView = this.f14151e;
        if (searchView != null && (query = searchView.getQuery()) != null) {
            b8.a aVar = this.f35807s;
            C3507m c3507m = null;
            if (aVar == null) {
                AbstractC3292y.y("switchAdapter");
                aVar = null;
            }
            C3507m c3507m2 = this.f35805q;
            if (c3507m2 == null) {
                AbstractC3292y.y("viewModel");
            } else {
                c3507m = c3507m2;
            }
            List b9 = c3507m.b(query.toString());
            if (query.length() > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            aVar.b(b9, z8);
        }
    }

    public final void w() {
        Button button = this.f35803o;
        C3507m c3507m = null;
        if (button != null) {
            C3507m c3507m2 = this.f35805q;
            if (c3507m2 == null) {
                AbstractC3292y.y("viewModel");
                c3507m2 = null;
            }
            button.setText(c3507m2.f35814d.e().f9870e);
        }
        C3507m c3507m3 = this.f35805q;
        if (c3507m3 == null) {
            AbstractC3292y.y("viewModel");
            c3507m3 = null;
        }
        l(c3507m3.d());
        Button button2 = this.f35803o;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: o.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3504j.p(C3504j.this, view);
                }
            });
        }
        Button button3 = this.f35802n;
        if (button3 != null) {
            C3507m c3507m4 = this.f35805q;
            if (c3507m4 == null) {
                AbstractC3292y.y("viewModel");
            } else {
                c3507m = c3507m4;
            }
            button3.setText(c3507m.f35814d.e().f9869d);
        }
        Button button4 = this.f35802n;
        if (button4 != null) {
            button4.setOnClickListener(new View.OnClickListener() { // from class: o.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3504j.r(C3504j.this, view);
                }
            });
        }
    }

    public final void x() {
        ImageView imageView;
        C3507m c3507m = this.f35805q;
        if (c3507m == null) {
            AbstractC3292y.y("viewModel");
            c3507m = null;
        }
        if (!c3507m.f35813c.f4493a.isEmpty()) {
            Toolbar toolbar = this.f14147a;
            if (toolbar == null) {
                imageView = null;
            } else {
                imageView = (ImageView) toolbar.findViewById(M1.b.f6010m0);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            View inflate = LayoutInflater.from(getContext()).inflate(M1.c.f6063u, (ViewGroup) null);
            final CardView cardView = (CardView) inflate.findViewById(M1.b.f6029t);
            final TextView textView = (TextView) inflate.findViewById(M1.b.f5954Q0);
            final TextView textView2 = (TextView) inflate.findViewById(M1.b.f5958S0);
            final TextView textView3 = (TextView) inflate.findViewById(M1.b.f5960T0);
            final PopupWindow popupWindow = new PopupWindow(inflate, 600, -2, true);
            popupWindow.setElevation(10.0f);
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3504j.k(popupWindow, this, view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3504j.o(popupWindow, this, view);
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() { // from class: o.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3504j.q(popupWindow, this, view);
                }
            });
            if (imageView != null) {
                final ImageView imageView2 = imageView;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: o.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C3504j.n(C3504j.this, popupWindow, imageView2, cardView, textView, textView2, textView3, view);
                    }
                });
            }
        }
    }
}
