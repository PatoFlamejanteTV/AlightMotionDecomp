package G5;

import R5.AbstractC1435t;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b8.a;
import e6.AbstractC2829a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import o.AbstractC3495a;
import o.AbstractC3496b;

/* loaded from: classes5.dex */
public final class h extends a8.a implements a.b {

    /* renamed from: q, reason: collision with root package name */
    public static final a f3082q = new a();

    /* renamed from: r, reason: collision with root package name */
    public static final String f3083r = h.class.getName();

    /* renamed from: m, reason: collision with root package name */
    public ConstraintLayout f3084m;

    /* renamed from: n, reason: collision with root package name */
    public RecyclerView f3085n;

    /* renamed from: o, reason: collision with root package name */
    public l f3086o;

    /* renamed from: p, reason: collision with root package name */
    public b8.a f3087p;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    public static final void k(h this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void l(h this$0, PopupWindow mypopupWindow, ImageView imageView, CardView cardView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view) {
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
            if (textView4 != null) {
                textView4.setTextColor(ColorStateList.valueOf(intValue));
            }
        }
        mypopupWindow.showAsDropDown(imageView);
    }

    public static final void m(PopupWindow mypopupWindow, h this$0, View view) {
        AbstractC3292y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3292y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f14148b;
        if (textView != null) {
            textView.setText(this$0.getString(M1.e.f6069a));
        }
        l lVar = this$0.f3086o;
        if (lVar == null) {
            AbstractC3292y.y("viewModel");
            lVar = null;
        }
        lVar.d(j.ALL_VENDORS);
        this$0.p();
    }

    public static final void n(PopupWindow mypopupWindow, h this$0, View view) {
        AbstractC3292y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3292y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f14148b;
        if (textView != null) {
            textView.setText(this$0.getString(M1.e.f6077i));
        }
        l lVar = this$0.f3086o;
        if (lVar == null) {
            AbstractC3292y.y("viewModel");
            lVar = null;
        }
        lVar.d(j.IAB_VENDORS);
        this$0.p();
    }

    public static final void o(PopupWindow mypopupWindow, h this$0, View view) {
        AbstractC3292y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3292y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f14148b;
        if (textView != null) {
            textView.setText(this$0.getString(M1.e.f6081m));
        }
        l lVar = this$0.f3086o;
        if (lVar == null) {
            AbstractC3292y.y("viewModel");
            lVar = null;
        }
        lVar.d(j.NON_IAB_VENDORS);
        this$0.p();
    }

    public static final void q(PopupWindow mypopupWindow, h this$0, View view) {
        AbstractC3292y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3292y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f14148b;
        if (textView != null) {
            textView.setText(this$0.getString(M1.e.f6076h));
        }
        l lVar = this$0.f3086o;
        if (lVar == null) {
            AbstractC3292y.y("viewModel");
            lVar = null;
        }
        lVar.d(j.GOOGLE_VENDORS);
        this$0.p();
    }

    @Override // b8.a.b
    public void b(b8.d item) {
        AbstractC3292y.i(item, "item");
        l lVar = this.f3086o;
        if (lVar == null) {
            AbstractC3292y.y("viewModel");
            lVar = null;
        }
        lVar.getClass();
        AbstractC3292y.i(item, "item");
        b8.e eVar = item.f15125d;
        b8.e eVar2 = b8.e.NON_IAB_VENDOR;
        if (eVar == eVar2) {
            Boolean bool = item.f15123b;
            Boolean bool2 = Boolean.TRUE;
            if (AbstractC3292y.d(bool, bool2)) {
                lVar.f3097b.f1407A.set(item.f15122a.f3123a);
                Q7.m mVar = Q7.m.f9074a;
                StringBuilder a9 = AbstractC3495a.a("Non IAB", '_');
                a9.append(item.f15122a.f3123a);
                AbstractC3496b.a(item.f15123b, bool2, mVar, a9.toString());
                return;
            }
        }
        if (item.f15125d == eVar2 && AbstractC3292y.d(item.f15123b, Boolean.FALSE)) {
            lVar.f3097b.f1407A.unset(item.f15122a.f3123a);
            Q7.m mVar2 = Q7.m.f9074a;
            StringBuilder a10 = AbstractC3495a.a("Non IAB", '_');
            a10.append(item.f15122a.f3123a);
            AbstractC3496b.a(item.f15123b, Boolean.TRUE, mVar2, a10.toString());
            return;
        }
        b8.e eVar3 = item.f15125d;
        b8.e eVar4 = b8.e.IAB_VENDOR;
        if (eVar3 == eVar4) {
            Boolean bool3 = item.f15123b;
            Boolean bool4 = Boolean.TRUE;
            if (AbstractC3292y.d(bool3, bool4)) {
                lVar.f3097b.f1439z.set(item.f15122a.f3123a);
                Q7.m mVar3 = Q7.m.f9074a;
                StringBuilder a11 = AbstractC3495a.a("Vendors", '_');
                a11.append(item.f15122a.f3123a);
                AbstractC3496b.a(item.f15123b, bool4, mVar3, a11.toString());
                return;
            }
        }
        if (item.f15125d == eVar4 && AbstractC3292y.d(item.f15123b, Boolean.FALSE)) {
            lVar.f3097b.f1439z.unset(item.f15122a.f3123a);
            Q7.m mVar4 = Q7.m.f9074a;
            StringBuilder a12 = AbstractC3495a.a("Vendors", '_');
            a12.append(item.f15122a.f3123a);
            AbstractC3496b.a(item.f15123b, Boolean.TRUE, mVar4, a12.toString());
            return;
        }
        b8.e eVar5 = item.f15125d;
        b8.e eVar6 = b8.e.GOOGLE_VENDOR;
        if (eVar5 == eVar6) {
            Boolean bool5 = item.f15123b;
            Boolean bool6 = Boolean.TRUE;
            if (AbstractC3292y.d(bool5, bool6)) {
                lVar.f3097b.f1408B.set(item.f15122a.f3123a);
                Q7.m mVar5 = Q7.m.f9074a;
                StringBuilder a13 = AbstractC3495a.a("Google", '_');
                a13.append(item.f15122a.f3123a);
                AbstractC3496b.a(item.f15123b, bool6, mVar5, a13.toString());
                return;
            }
        }
        if (item.f15125d == eVar6 && AbstractC3292y.d(item.f15123b, Boolean.FALSE)) {
            lVar.f3097b.f1408B.unset(item.f15122a.f3123a);
            Q7.m mVar6 = Q7.m.f9074a;
            StringBuilder a14 = AbstractC3495a.a("Google", '_');
            a14.append(item.f15122a.f3123a);
            AbstractC3496b.a(item.f15123b, Boolean.TRUE, mVar6, a14.toString());
            return;
        }
        b8.e eVar7 = item.f15125d;
        b8.e eVar8 = b8.e.PUBLISHER_VENDOR;
        if (eVar7 == eVar8) {
            Boolean bool7 = item.f15123b;
            Boolean bool8 = Boolean.TRUE;
            if (AbstractC3292y.d(bool7, bool8)) {
                lVar.f3097b.f1433t.set(item.f15122a.f3123a);
                lVar.f3097b.f1435v.setItems(AbstractC1435t.b1(((G6.l) item.f15122a).f3130d));
                Q7.m mVar7 = Q7.m.f9074a;
                StringBuilder a15 = AbstractC3495a.a("Vendors", '_');
                a15.append(item.f15122a.f3123a);
                AbstractC3496b.a(item.f15123b, bool8, mVar7, a15.toString());
                return;
            }
        }
        if (item.f15125d == eVar8 && AbstractC3292y.d(item.f15123b, Boolean.FALSE)) {
            lVar.f3097b.f1433t.unset(item.f15122a.f3123a);
            lVar.f3097b.f1435v.unset(AbstractC1435t.b1(((G6.l) item.f15122a).f3130d));
            Q7.m mVar8 = Q7.m.f9074a;
            StringBuilder a16 = AbstractC3495a.a("Vendors", '_');
            a16.append(item.f15122a.f3123a);
            AbstractC3496b.a(item.f15123b, Boolean.TRUE, mVar8, a16.toString());
        }
    }

    @Override // b8.a.b
    public void e(b8.d item) {
        FragmentActivity fragmentActivity;
        String str;
        E5.f fVar;
        String str2;
        l lVar;
        String str3;
        String str4;
        G6.c cVar;
        String str5;
        String num;
        AbstractC3292y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null && (item.f15122a instanceof G6.l)) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            String str6 = E5.f.f1962I;
            if (supportFragmentManager.findFragmentByTag(str6) == null) {
                G6.f fVar2 = item.f15122a;
                if (fVar2 instanceof G6.l) {
                    String str7 = fVar2.f3124b;
                    String str8 = ((G6.l) fVar2).f3129c;
                    l lVar2 = this.f3086o;
                    if (lVar2 == null) {
                        AbstractC3292y.y("viewModel");
                        lVar2 = null;
                    }
                    String a9 = lVar2.a(((G6.l) item.f15122a).f3130d, G5.a.PURPOSE);
                    l lVar3 = this.f3086o;
                    if (lVar3 == null) {
                        AbstractC3292y.y("viewModel");
                        lVar3 = null;
                    }
                    String a10 = lVar3.a(((G6.l) item.f15122a).f3133g, G5.a.SPECIAL_PURPOSE);
                    l lVar4 = this.f3086o;
                    if (lVar4 == null) {
                        AbstractC3292y.y("viewModel");
                        lVar4 = null;
                    }
                    String a11 = lVar4.a(((G6.l) item.f15122a).f3134h, G5.a.FEATURE);
                    l lVar5 = this.f3086o;
                    if (lVar5 == null) {
                        AbstractC3292y.y("viewModel");
                        lVar5 = null;
                    }
                    String a12 = lVar5.a(((G6.l) item.f15122a).f3135i, G5.a.SPECIAL_FEATURE);
                    l lVar6 = this.f3086o;
                    if (lVar6 == null) {
                        AbstractC3292y.y("viewModel");
                        lVar6 = null;
                    }
                    String a13 = lVar6.a(((G6.l) item.f15122a).f3140n, G5.a.DATA_DECLARATION);
                    String str9 = ((G6.l) item.f15122a).f3136j;
                    l lVar7 = this.f3086o;
                    if (lVar7 == null) {
                        AbstractC3292y.y("viewModel");
                        lVar7 = null;
                    }
                    int i8 = ((G6.l) item.f15122a).f3138l;
                    lVar7.getClass();
                    if (i8 < 0) {
                        fragmentActivity = activity;
                        str = str6;
                        str2 = "";
                    } else {
                        str = str6;
                        float f8 = i8 / 86400.0f;
                        fragmentActivity = activity;
                        if (f8 >= 1.0f) {
                            str2 = AbstractC2829a.d(f8) + ' ' + lVar7.f3096a.g().f9916i;
                        } else {
                            str2 = i8 + ' ' + lVar7.f3096a.g().f9917j;
                        }
                    }
                    l lVar8 = this.f3086o;
                    if (lVar8 == null) {
                        AbstractC3292y.y("viewModel");
                        lVar = null;
                    } else {
                        lVar = lVar8;
                    }
                    Boolean bool = ((G6.l) item.f15122a).f3139m;
                    lVar.getClass();
                    if (AbstractC3292y.d(bool, Boolean.TRUE)) {
                        str4 = lVar.f3096a.g().f9920m;
                    } else if (!AbstractC3292y.d(bool, Boolean.FALSE)) {
                        str3 = "";
                        cVar = ((G6.l) item.f15122a).f3141o;
                        if (cVar == null || (num = Integer.valueOf(cVar.f3108a).toString()) == null) {
                            str5 = "";
                        } else {
                            str5 = num;
                        }
                        G6.f fVar3 = item.f15122a;
                        E5.a args = new E5.a(str7, str8, a9, null, a10, a11, a12, a13, str9, str2, str3, str5, fVar3.f3123a, item.f15125d, ((G6.l) fVar3).f3142p, "Error: cannot load vendor file", 8);
                        AbstractC3292y.i(args, "args");
                        fVar = new E5.f();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("partner_detail_args", args);
                        fVar.setArguments(bundle);
                    } else {
                        str4 = lVar.f3096a.g().f9921n;
                    }
                    str3 = str4;
                    cVar = ((G6.l) item.f15122a).f3141o;
                    if (cVar == null) {
                        str5 = num;
                        G6.f fVar32 = item.f15122a;
                        E5.a args2 = new E5.a(str7, str8, a9, null, a10, a11, a12, a13, str9, str2, str3, str5, fVar32.f3123a, item.f15125d, ((G6.l) fVar32).f3142p, "Error: cannot load vendor file", 8);
                        AbstractC3292y.i(args2, "args");
                        fVar = new E5.f();
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("partner_detail_args", args2);
                        fVar.setArguments(bundle2);
                    }
                    str5 = "";
                    G6.f fVar322 = item.f15122a;
                    E5.a args22 = new E5.a(str7, str8, a9, null, a10, a11, a12, a13, str9, str2, str3, str5, fVar322.f3123a, item.f15125d, ((G6.l) fVar322).f3142p, "Error: cannot load vendor file", 8);
                    AbstractC3292y.i(args22, "args");
                    fVar = new E5.f();
                    Bundle bundle22 = new Bundle();
                    bundle22.putParcelable("partner_detail_args", args22);
                    fVar.setArguments(bundle22);
                } else {
                    fragmentActivity = activity;
                    str = str6;
                    fVar = null;
                }
                if (fVar != null) {
                    fragmentActivity.getSupportFragmentManager().beginTransaction().add(fVar, str).commit();
                }
            }
        }
    }

    @Override // a8.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3292y.h(viewModelStore, "viewModelStore");
            this.f3086o = (l) new ViewModelProvider(viewModelStore, new m()).get(l.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        View inflate = inflater.inflate(M1.c.f6050h, viewGroup, false);
        AbstractC3292y.h(inflate, "inflater.inflate(R.layou…rtners, container, false)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        boolean hasFocus;
        super.onPause();
        l lVar = this.f3086o;
        if (lVar == null) {
            AbstractC3292y.y("viewModel");
            lVar = null;
        }
        SearchView searchView = this.f14151e;
        if (searchView == null) {
            hasFocus = false;
        } else {
            hasFocus = searchView.hasFocus();
        }
        lVar.f3106k = hasFocus;
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
        this.f3084m = (ConstraintLayout) view.findViewById(M1.b.f5943L);
        this.f3085n = (RecyclerView) view.findViewById(M1.b.f5957S);
        l lVar = this.f3086o;
        l lVar2 = null;
        if (lVar == null) {
            AbstractC3292y.y("viewModel");
            lVar = null;
        }
        lVar.getClass();
        AbstractC3462k.d(ViewModelKt.getViewModelScope(lVar), C3445b0.b(), null, new k(lVar, null), 2, null);
        TextView textView = this.f14148b;
        if (textView != null) {
            l lVar3 = this.f3086o;
            if (lVar3 == null) {
                AbstractC3292y.y("viewModel");
                lVar3 = null;
            }
            textView.setText(R7.b.a(lVar3.f3096a.a().f9923a));
        }
        ImageView imageView = this.f14149c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: G5.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    h.k(h.this, view2);
                }
            });
            l lVar4 = this.f3086o;
            if (lVar4 == null) {
                AbstractC3292y.y("viewModel");
                lVar4 = null;
            }
            imageView.setContentDescription(lVar4.f3096a.a().f9929g);
        }
        r();
        SearchView searchView2 = this.f14151e;
        if (searchView2 != null) {
            searchView2.setVisibility(0);
        }
        SearchView searchView3 = this.f14151e;
        if (searchView3 != null) {
            l lVar5 = this.f3086o;
            if (lVar5 == null) {
                AbstractC3292y.y("viewModel");
                lVar5 = null;
            }
            searchView3.setQueryHint(lVar5.f3096a.a().f9925c);
        }
        SearchView searchView4 = this.f14151e;
        if (searchView4 != null) {
            searchView4.setOnQueryTextListener(new i(this));
        }
        l lVar6 = this.f3086o;
        if (lVar6 == null) {
            AbstractC3292y.y("viewModel");
            lVar6 = null;
        }
        List c8 = lVar6.c("");
        l lVar7 = this.f3086o;
        if (lVar7 == null) {
            AbstractC3292y.y("viewModel");
            lVar7 = null;
        }
        String str = lVar7.f3096a.a().f9924b;
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
        this.f3087p = new b8.a(c8, this, str, null, num, num2, num3, num4, this.f14157k, this.f14158l, 8);
        RecyclerView recyclerView = this.f3085n;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            b8.a aVar = this.f3087p;
            if (aVar == null) {
                AbstractC3292y.y("switchAdapter");
                aVar = null;
            }
            recyclerView.setAdapter(aVar);
        }
        S7.c cVar2 = this.f14156j;
        if (cVar2 != null && (num5 = cVar2.f9792g) != null) {
            int intValue = num5.intValue();
            ConstraintLayout constraintLayout = this.f3084m;
            if (constraintLayout != null) {
                constraintLayout.setBackgroundColor(intValue);
            }
        }
        l lVar8 = this.f3086o;
        if (lVar8 == null) {
            AbstractC3292y.y("viewModel");
        } else {
            lVar2 = lVar8;
        }
        if (lVar2.f3106k && (searchView = this.f14151e) != null) {
            searchView.requestFocus();
        }
    }

    public final void p() {
        CharSequence query;
        boolean z8;
        SearchView searchView = this.f14151e;
        if (searchView != null && (query = searchView.getQuery()) != null) {
            b8.a aVar = this.f3087p;
            l lVar = null;
            if (aVar == null) {
                AbstractC3292y.y("switchAdapter");
                aVar = null;
            }
            l lVar2 = this.f3086o;
            if (lVar2 == null) {
                AbstractC3292y.y("viewModel");
            } else {
                lVar = lVar2;
            }
            List c8 = lVar.c(query.toString());
            if (query.length() > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            aVar.b(c8, z8);
        }
    }

    public final void r() {
        ImageView imageView;
        l lVar = this.f3086o;
        l lVar2 = null;
        if (lVar == null) {
            AbstractC3292y.y("viewModel");
            lVar = null;
        }
        if (!((ArrayList) lVar.f()).isEmpty() || !((ArrayList) lVar.b()).isEmpty()) {
            Toolbar toolbar = this.f14147a;
            if (toolbar == null) {
                imageView = null;
            } else {
                imageView = (ImageView) toolbar.findViewById(M1.b.f6010m0);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            View inflate = LayoutInflater.from(getContext()).inflate(M1.c.f6064v, (ViewGroup) null);
            final CardView cardView = (CardView) inflate.findViewById(M1.b.f6029t);
            final TextView textView = (TextView) inflate.findViewById(M1.b.f5954Q0);
            final TextView textView2 = (TextView) inflate.findViewById(M1.b.f5958S0);
            final TextView textView3 = (TextView) inflate.findViewById(M1.b.f5960T0);
            final TextView textView4 = (TextView) inflate.findViewById(M1.b.f5956R0);
            l lVar3 = this.f3086o;
            if (lVar3 == null) {
                AbstractC3292y.y("viewModel");
                lVar3 = null;
            }
            if (((ArrayList) lVar3.f()).isEmpty()) {
                textView3.setVisibility(8);
            }
            l lVar4 = this.f3086o;
            if (lVar4 == null) {
                AbstractC3292y.y("viewModel");
            } else {
                lVar2 = lVar4;
            }
            if (((ArrayList) lVar2.b()).isEmpty()) {
                textView4.setVisibility(8);
            }
            final PopupWindow popupWindow = new PopupWindow(inflate, 600, -2, true);
            popupWindow.setElevation(10.0f);
            textView.setOnClickListener(new View.OnClickListener() { // from class: G5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.m(popupWindow, this, view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: G5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.n(popupWindow, this, view);
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() { // from class: G5.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.o(popupWindow, this, view);
                }
            });
            textView4.setOnClickListener(new View.OnClickListener() { // from class: G5.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.q(popupWindow, this, view);
                }
            });
            if (imageView != null) {
                final ImageView imageView2 = imageView;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: G5.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        h.l(h.this, popupWindow, imageView2, cardView, textView, textView2, textView3, textView4, view);
                    }
                });
            }
        }
    }
}
