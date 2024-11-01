package E5;

import G6.i;
import Q7.m;
import R5.AbstractC1435t;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;

/* loaded from: classes5.dex */
public final class f extends a8.a {

    /* renamed from: H, reason: collision with root package name */
    public static final a f1961H = new a();

    /* renamed from: I, reason: collision with root package name */
    public static final String f1962I;

    /* renamed from: A, reason: collision with root package name */
    public TextView f1963A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f1964B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f1965C;

    /* renamed from: D, reason: collision with root package name */
    public TextView f1966D;

    /* renamed from: E, reason: collision with root package name */
    public ImageView f1967E;

    /* renamed from: F, reason: collision with root package name */
    public E5.a f1968F;

    /* renamed from: G, reason: collision with root package name */
    public g f1969G;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1970m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f1971n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1972o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1973p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f1974q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f1975r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f1976s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f1977t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f1978u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f1979v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f1980w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f1981x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f1982y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f1983z;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    static {
        String simpleName = f.class.getSimpleName();
        AbstractC3292y.h(simpleName, "PartnersDetailFragment::class.java.simpleName");
        f1962I = simpleName;
    }

    public static final void k(f this$0, S7.d cookieDisclosure) {
        g gVar;
        Iterator it;
        Map map;
        i iVar;
        AbstractC3292y.i(this$0, "this$0");
        g gVar2 = this$0.f1969G;
        if (gVar2 == null) {
            AbstractC3292y.y("viewModel");
            gVar2 = null;
        }
        AbstractC3292y.h(cookieDisclosure, "it");
        gVar2.getClass();
        AbstractC3292y.i(cookieDisclosure, "cookieDisclosure");
        gVar2.f1987d.clear();
        Iterator it2 = cookieDisclosure.f9802a.iterator();
        while (it2.hasNext()) {
            S7.f fVar = (S7.f) it2.next();
            List list = gVar2.f1987d;
            String str = fVar.f9853a;
            String str2 = fVar.f9854b;
            String valueOf = String.valueOf(fVar.f9855c);
            String str3 = fVar.f9856d;
            List list2 = fVar.f9857e;
            String str4 = "";
            int i8 = 0;
            for (Object obj : list2) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    AbstractC1435t.w();
                }
                int intValue = ((Number) obj).intValue();
                G6.e eVar = gVar2.f1984a.f1414a;
                if (eVar == null || (map = eVar.f3114d) == null || (iVar = (i) map.get(String.valueOf(intValue))) == null) {
                    it = it2;
                } else {
                    Y y8 = Y.f34578a;
                    it = it2;
                    String format = String.format("• %s.", Arrays.copyOf(new Object[]{iVar.f3124b}, 1));
                    AbstractC3292y.h(format, "format(format, *args)");
                    str4 = AbstractC3292y.q(str4, format);
                    if (i8 != list2.size() - 1) {
                        str4 = AbstractC3292y.q(str4, "\n");
                    }
                }
                it2 = it;
                i8 = i9;
            }
            list.add(new a8.e(str, str2, valueOf, str3, str4));
        }
        g gVar3 = this$0.f1969G;
        if (gVar3 == null) {
            AbstractC3292y.y("viewModel");
            gVar3 = null;
        }
        if (!gVar3.f1987d.isEmpty()) {
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                String str5 = B5.e.f614p;
                if (supportFragmentManager.findFragmentByTag(str5) == null) {
                    FragmentTransaction beginTransaction = activity.getSupportFragmentManager().beginTransaction();
                    g gVar4 = this$0.f1969G;
                    if (gVar4 == null) {
                        AbstractC3292y.y("viewModel");
                        gVar = null;
                    } else {
                        gVar = gVar4;
                    }
                    B5.a args = new B5.a(gVar.f1987d);
                    AbstractC3292y.i(args, "args");
                    B5.e eVar2 = new B5.e();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("partner_disclosure_args", args);
                    eVar2.setArguments(bundle);
                    beginTransaction.add(eVar2, str5).commit();
                    return;
                }
                return;
            }
            return;
        }
        this$0.r();
    }

    public static final void l(f this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        m mVar = m.f9074a;
        StringBuilder sb = new StringBuilder();
        g gVar = this$0.f1969G;
        E5.a aVar = null;
        if (gVar == null) {
            AbstractC3292y.y("viewModel");
            gVar = null;
        }
        E5.a aVar2 = this$0.f1968F;
        if (aVar2 == null) {
            AbstractC3292y.y("args");
            aVar2 = null;
        }
        sb.append(Q7.b.a(gVar.a(aVar2.f1953n)));
        sb.append("-id:");
        E5.a aVar3 = this$0.f1968F;
        if (aVar3 == null) {
            AbstractC3292y.y("args");
        } else {
            aVar = aVar3;
        }
        sb.append(aVar.f1952m);
        mVar.f("collapseElement", sb.toString());
        this$0.dismiss();
    }

    public static final void m(f this$0, String link, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(link, "$link");
        Context context = this$0.getContext();
        if (context != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(link));
            context.startActivity(intent);
        }
    }

    public static final void q(final f this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        E5.a aVar = this$0.f1968F;
        E5.a aVar2 = null;
        if (aVar == null) {
            AbstractC3292y.y("args");
            aVar = null;
        }
        if (aVar.f1954o.length() > 0) {
            g gVar = this$0.f1969G;
            if (gVar == null) {
                AbstractC3292y.y("viewModel");
                gVar = null;
            }
            E5.a aVar3 = this$0.f1968F;
            if (aVar3 == null) {
                AbstractC3292y.y("args");
            } else {
                aVar2 = aVar3;
            }
            String url = aVar2.f1954o;
            gVar.getClass();
            AbstractC3292y.i(url, "url");
            gVar.f1985b.a(url).observe(this$0, new Observer() { // from class: E5.e
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    f.k(f.this, (S7.d) obj);
                }
            });
            return;
        }
        this$0.r();
    }

    public final void n(View view) {
        this.f1967E = (ImageView) view.findViewById(M1.b.f6007l0);
        this.f1966D = (TextView) view.findViewById(M1.b.f5938I0);
        this.f1965C = (TextView) view.findViewById(M1.b.f6038x0);
        this.f1964B = (TextView) view.findViewById(M1.b.f5978b1);
        this.f1963A = (TextView) view.findViewById(M1.b.f5950O0);
        this.f1983z = (TextView) view.findViewById(M1.b.f5999i1);
        this.f1982y = (TextView) view.findViewById(M1.b.f5940J0);
        this.f1981x = (TextView) view.findViewById(M1.b.f5993g1);
        this.f1980w = (TextView) view.findViewById(M1.b.f5981c1);
        this.f1979v = (TextView) view.findViewById(M1.b.f5952P0);
        this.f1978u = (TextView) view.findViewById(M1.b.f6005k1);
        this.f1977t = (TextView) view.findViewById(M1.b.f5942K0);
        this.f1976s = (TextView) view.findViewById(M1.b.f5996h1);
        this.f1975r = (TextView) view.findViewById(M1.b.f6028s0);
        this.f1973p = (TextView) view.findViewById(M1.b.f6026r1);
        this.f1974q = (TextView) view.findViewById(M1.b.f6034v0);
        this.f1972o = (TextView) view.findViewById(M1.b.f6030t0);
        this.f1971n = (TextView) view.findViewById(M1.b.f6032u0);
        this.f1970m = (TextView) view.findViewById(M1.b.f5972Z0);
        ImageView imageView = this.f1967E;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: E5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    f.l(f.this, view2);
                }
            });
            g gVar = this.f1969G;
            if (gVar == null) {
                AbstractC3292y.y("viewModel");
                gVar = null;
            }
            imageView.setContentDescription(gVar.f1986c.g().f9922o);
        }
        TextView textView = this.f1966D;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: E5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    f.q(f.this, view2);
                }
            });
        }
        S7.c cVar = this.f14156j;
        if (cVar != null) {
            Integer num = cVar.f9792g;
            if (num != null) {
                view.setBackgroundColor(num.intValue());
            }
            Integer num2 = cVar.f9794i;
            if (num2 != null) {
                int intValue = num2.intValue();
                TextView textView2 = this.f1965C;
                if (textView2 != null) {
                    textView2.setTextColor(intValue);
                }
                TextView textView3 = this.f1964B;
                if (textView3 != null) {
                    textView3.setTextColor(intValue);
                }
                TextView textView4 = this.f1963A;
                if (textView4 != null) {
                    textView4.setTextColor(intValue);
                }
                TextView textView5 = this.f1983z;
                if (textView5 != null) {
                    textView5.setTextColor(intValue);
                }
                TextView textView6 = this.f1982y;
                if (textView6 != null) {
                    textView6.setTextColor(intValue);
                }
                TextView textView7 = this.f1981x;
                if (textView7 != null) {
                    textView7.setTextColor(intValue);
                }
                TextView textView8 = this.f1980w;
                if (textView8 != null) {
                    textView8.setTextColor(intValue);
                }
                TextView textView9 = this.f1979v;
                if (textView9 != null) {
                    textView9.setTextColor(intValue);
                }
                TextView textView10 = this.f1978u;
                if (textView10 != null) {
                    textView10.setTextColor(intValue);
                }
                TextView textView11 = this.f1977t;
                if (textView11 != null) {
                    textView11.setTextColor(intValue);
                }
                TextView textView12 = this.f1976s;
                if (textView12 != null) {
                    textView12.setTextColor(intValue);
                }
                TextView textView13 = this.f1975r;
                if (textView13 != null) {
                    textView13.setTextColor(intValue);
                }
                TextView textView14 = this.f1973p;
                if (textView14 != null) {
                    textView14.setTextColor(intValue);
                }
                TextView textView15 = this.f1974q;
                if (textView15 != null) {
                    textView15.setTextColor(intValue);
                }
                TextView textView16 = this.f1972o;
                if (textView16 != null) {
                    textView16.setTextColor(intValue);
                }
                TextView textView17 = this.f1971n;
                if (textView17 != null) {
                    textView17.setTextColor(intValue);
                }
            }
            Integer num3 = cVar.f9797l;
            if (num3 != null) {
                int intValue2 = num3.intValue();
                TextView textView18 = this.f1966D;
                if (textView18 != null) {
                    textView18.setTextColor(intValue2);
                }
                TextView textView19 = this.f1970m;
                if (textView19 != null) {
                    textView19.setTextColor(intValue2);
                }
            }
        }
        Typeface typeface = this.f14157k;
        if (typeface != null) {
            TextView textView20 = this.f1980w;
            if (textView20 != null) {
                textView20.setTypeface(typeface);
            }
            TextView textView21 = this.f1979v;
            if (textView21 != null) {
                textView21.setTypeface(typeface);
            }
            TextView textView22 = this.f1978u;
            if (textView22 != null) {
                textView22.setTypeface(typeface);
            }
            TextView textView23 = this.f1977t;
            if (textView23 != null) {
                textView23.setTypeface(typeface);
            }
            TextView textView24 = this.f1976s;
            if (textView24 != null) {
                textView24.setTypeface(typeface);
            }
            TextView textView25 = this.f1971n;
            if (textView25 != null) {
                textView25.setTypeface(typeface);
            }
        }
        Typeface typeface2 = this.f14158l;
        if (typeface2 != null) {
            TextView textView26 = this.f1965C;
            if (textView26 != null) {
                textView26.setTypeface(typeface2);
            }
            TextView textView27 = this.f1964B;
            if (textView27 != null) {
                textView27.setTypeface(typeface2);
            }
            TextView textView28 = this.f1963A;
            if (textView28 != null) {
                textView28.setTypeface(typeface2);
            }
            TextView textView29 = this.f1983z;
            if (textView29 != null) {
                textView29.setTypeface(typeface2);
            }
            TextView textView30 = this.f1982y;
            if (textView30 != null) {
                textView30.setTypeface(typeface2);
            }
            TextView textView31 = this.f1981x;
            if (textView31 != null) {
                textView31.setTypeface(typeface2);
            }
            TextView textView32 = this.f1966D;
            if (textView32 != null) {
                textView32.setTypeface(typeface2);
            }
            TextView textView33 = this.f1970m;
            if (textView33 != null) {
                textView33.setTypeface(typeface2);
            }
            TextView textView34 = this.f1975r;
            if (textView34 != null) {
                textView34.setTypeface(typeface2);
            }
            TextView textView35 = this.f1973p;
            if (textView35 != null) {
                textView35.setTypeface(typeface2);
            }
            TextView textView36 = this.f1974q;
            if (textView36 != null) {
                textView36.setTypeface(typeface2);
            }
            TextView textView37 = this.f1972o;
            if (textView37 != null) {
                textView37.setTypeface(typeface2);
            }
        }
    }

    public final void o(TextView textView, TextView textView2, String str, String str2) {
        if (str.length() > 0 && textView != null) {
            textView.setText(str);
        }
        if (str2.length() > 0) {
            if (textView2 != null) {
                textView2.setText(str2);
            }
        } else {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
    }

    @Override // a8.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        E5.a aVar;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            aVar = null;
        } else {
            aVar = (E5.a) arguments.getParcelable("partner_detail_args");
        }
        if (aVar == null) {
            aVar = new E5.a(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, 65535);
        }
        this.f1968F = aVar;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3292y.h(viewModelStore, "viewModelStore");
            this.f1969G = (g) new ViewModelProvider(viewModelStore, new h()).get(g.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        View inflate = inflater.inflate(M1.c.f6051i, viewGroup, false);
        AbstractC3292y.h(inflate, "inflater.inflate(R.layou…detail, container, false)");
        return inflate;
    }

    @Override // a8.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        int i8 = 0;
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        m mVar = m.f9074a;
        StringBuilder sb = new StringBuilder();
        g gVar = this.f1969G;
        g gVar2 = null;
        if (gVar == null) {
            AbstractC3292y.y("viewModel");
            gVar = null;
        }
        E5.a aVar = this.f1968F;
        if (aVar == null) {
            AbstractC3292y.y("args");
            aVar = null;
        }
        sb.append(Q7.b.a(gVar.a(aVar.f1953n)));
        sb.append("-id:");
        E5.a aVar2 = this.f1968F;
        if (aVar2 == null) {
            AbstractC3292y.y("args");
            aVar2 = null;
        }
        sb.append(aVar2.f1952m);
        mVar.f("expandElement", sb.toString());
        n(view);
        E5.a aVar3 = this.f1968F;
        if (aVar3 == null) {
            AbstractC3292y.y("args");
            aVar3 = null;
        }
        TextView textView = this.f14148b;
        if (textView != null) {
            textView.setText(aVar3.f1940a);
        }
        String str = aVar3.f1941b;
        if (str != null && !AbstractC3292y.d(str, "null")) {
            TextView textView2 = this.f1965C;
            if (textView2 != null) {
                textView2.setText(str);
            }
            TextView textView3 = this.f1965C;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        }
        if (aVar3.f1949j.length() == 0) {
            TextView textView4 = this.f1975r;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        } else {
            TextView textView5 = this.f1975r;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            TextView textView6 = this.f1975r;
            if (textView6 != null) {
                Context context = getContext();
                if (context == null) {
                    string = null;
                } else {
                    int i9 = M1.e.f6083o;
                    g gVar3 = this.f1969G;
                    if (gVar3 == null) {
                        AbstractC3292y.y("viewModel");
                        gVar3 = null;
                    }
                    string = context.getString(i9, gVar3.f1986c.g().f9915h, aVar3.f1949j);
                }
                textView6.setText(string);
            }
        }
        if (aVar3.f1950k.length() == 0) {
            TextView textView7 = this.f1973p;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
        } else {
            TextView textView8 = this.f1973p;
            if (textView8 != null) {
                textView8.setVisibility(0);
            }
            TextView textView9 = this.f1973p;
            if (textView9 != null) {
                Context context2 = getContext();
                if (context2 == null) {
                    string2 = null;
                } else {
                    int i10 = M1.e.f6083o;
                    g gVar4 = this.f1969G;
                    if (gVar4 == null) {
                        AbstractC3292y.y("viewModel");
                        gVar4 = null;
                    }
                    string2 = context2.getString(i10, gVar4.f1986c.g().f9919l, aVar3.f1950k);
                }
                textView9.setText(string2);
            }
        }
        if (aVar3.f1951l.length() == 0) {
            TextView textView10 = this.f1974q;
            if (textView10 != null) {
                textView10.setVisibility(8);
            }
        } else {
            TextView textView11 = this.f1974q;
            if (textView11 != null) {
                textView11.setVisibility(0);
            }
            TextView textView12 = this.f1974q;
            if (textView12 != null) {
                Context context3 = getContext();
                if (context3 == null) {
                    string3 = null;
                } else {
                    string3 = context3.getString(M1.e.f6072d, aVar3.f1951l);
                }
                textView12.setText(string3);
            }
        }
        TextView textView13 = this.f1966D;
        if (textView13 != null) {
            g gVar5 = this.f1969G;
            if (gVar5 == null) {
                AbstractC3292y.y("viewModel");
                gVar5 = null;
            }
            textView13.setText(gVar5.f1986c.g().f9918k);
        }
        TextView textView14 = this.f1966D;
        if (textView14 != null) {
            if (aVar3.f1954o.length() <= 0) {
                i8 = 8;
            }
            textView14.setVisibility(i8);
        }
        TextView textView15 = this.f1980w;
        TextView textView16 = this.f1964B;
        g gVar6 = this.f1969G;
        if (gVar6 == null) {
            AbstractC3292y.y("viewModel");
            gVar6 = null;
        }
        o(textView15, textView16, gVar6.f1986c.g().f9908a, aVar3.f1942c);
        TextView textView17 = this.f1979v;
        TextView textView18 = this.f1963A;
        g gVar7 = this.f1969G;
        if (gVar7 == null) {
            AbstractC3292y.y("viewModel");
            gVar7 = null;
        }
        o(textView17, textView18, gVar7.f1986c.g().f9909b, aVar3.f1943d);
        TextView textView19 = this.f1978u;
        TextView textView20 = this.f1983z;
        g gVar8 = this.f1969G;
        if (gVar8 == null) {
            AbstractC3292y.y("viewModel");
            gVar8 = null;
        }
        o(textView19, textView20, gVar8.f1986c.g().f9910c, aVar3.f1944e);
        TextView textView21 = this.f1977t;
        TextView textView22 = this.f1982y;
        g gVar9 = this.f1969G;
        if (gVar9 == null) {
            AbstractC3292y.y("viewModel");
            gVar9 = null;
        }
        o(textView21, textView22, gVar9.f1986c.g().f9911d, aVar3.f1945f);
        TextView textView23 = this.f1976s;
        TextView textView24 = this.f1981x;
        g gVar10 = this.f1969G;
        if (gVar10 == null) {
            AbstractC3292y.y("viewModel");
            gVar10 = null;
        }
        o(textView23, textView24, gVar10.f1986c.g().f9912e, aVar3.f1946g);
        TextView textView25 = this.f1971n;
        TextView textView26 = this.f1972o;
        g gVar11 = this.f1969G;
        if (gVar11 == null) {
            AbstractC3292y.y("viewModel");
            gVar11 = null;
        }
        o(textView25, textView26, gVar11.f1986c.g().f9913f, aVar3.f1947h);
        g gVar12 = this.f1969G;
        if (gVar12 == null) {
            AbstractC3292y.y("viewModel");
        } else {
            gVar2 = gVar12;
        }
        p(gVar2.f1986c.g().f9914g, aVar3.f1948i);
    }

    public final void p(String str, final String str2) {
        TextView textView;
        if (str.length() > 0 && (textView = this.f1970m) != null) {
            textView.setText(str);
        }
        if (URLUtil.isValidUrl(str2)) {
            TextView textView2 = this.f1970m;
            if (textView2 != null) {
                textView2.setOnClickListener(new View.OnClickListener() { // from class: E5.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        f.m(f.this, str2, view);
                    }
                });
                return;
            }
            return;
        }
        TextView textView3 = this.f1970m;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
    }

    public final void r() {
        TextView textView;
        TextView textView2 = this.f1966D;
        if (textView2 != null) {
            E5.a aVar = this.f1968F;
            if (aVar == null) {
                AbstractC3292y.y("args");
                aVar = null;
            }
            textView2.setText(aVar.f1955p);
        }
        Context context = getContext();
        if (context != null && (textView = this.f1966D) != null) {
            textView.setTextColor(ContextCompat.getColor(context, M1.a.f5917c));
        }
    }
}
