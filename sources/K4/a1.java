package K4;

import J4.j;
import Q4.h;
import android.R;
import android.app.AlertDialog;
import android.app.Application;
import android.graphics.drawable.ColorDrawable;
import android.net.nsd.NsdServiceInfo;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class a1 extends r {

    /* renamed from: o, reason: collision with root package name */
    private TextView f4703o;

    /* renamed from: p, reason: collision with root package name */
    private ProgressBar f4704p;

    /* renamed from: q, reason: collision with root package name */
    private AlertDialog f4705q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f4706r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f4707s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f4708t;

    /* renamed from: u, reason: collision with root package name */
    private LinearLayout f4709u;

    /* renamed from: v, reason: collision with root package name */
    private LinearLayout.LayoutParams f4710v;

    /* loaded from: classes5.dex */
    public static final class a implements O4.j {
        a() {
        }

        @Override // O4.j
        public void a(View view, int i8) {
            a1.this.U0();
            j.a aVar = J4.j.f4395g;
            Q4.h m8 = aVar.m();
            AbstractC3292y.f(m8);
            int size = m8.g().size();
            if (size > 0 && size > i8) {
                Q4.h m9 = aVar.m();
                AbstractC3292y.f(m9);
                Object obj = m9.g().get(i8);
                AbstractC3292y.h(obj, "UptodownCoreApplication.…esInfoAvailable[position]");
                Q4.h m10 = aVar.m();
                AbstractC3292y.f(m10);
                m10.l((NsdServiceInfo) obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(a1 this$0, P4.c fileTransferInfo) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(fileTransferInfo, "$fileTransferInfo");
        this$0.f1(fileTransferInfo);
    }

    private final void M0() {
        View view = View.inflate(this, J4.f.f4314o, null);
        TextView textView = (TextView) view.findViewById(J4.e.f4167H1);
        this.f4703o = textView;
        if (textView != null) {
            textView.setTypeface(J4.j.f4395g.u());
        }
        ProgressBar progressBar = (ProgressBar) view.findViewById(J4.e.f4165H);
        this.f4704p = progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView2 = (TextView) view.findViewById(J4.e.f4289w0);
        this.f4708t = textView2;
        AbstractC3292y.f(textView2);
        j.a aVar = J4.j.f4395g;
        textView2.setTypeface(aVar.u());
        TextView textView3 = this.f4708t;
        if (textView3 != null) {
            textView3.setOnClickListener(new View.OnClickListener() { // from class: K4.O0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a1.N0(a1.this, view2);
                }
            });
        }
        TextView textView4 = (TextView) view.findViewById(J4.e.f4191P1);
        this.f4706r = textView4;
        if (textView4 != null) {
            textView4.setTypeface(aVar.v());
        }
        TextView textView5 = (TextView) view.findViewById(J4.e.f4190P0);
        this.f4707s = textView5;
        if (textView5 != null) {
            textView5.setTypeface(aVar.u());
        }
        AbstractC3292y.h(view, "view");
        e1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(a1 this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.U0();
        Q4.c p8 = J4.j.f4395g.p();
        AbstractC3292y.f(p8);
        p8.r();
        this$0.Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(a1 this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.U0();
        this$0.Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R0(a1 this$0, String filename, String str) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(filename, "$filename");
        this$0.U0();
        if (new S4.f().o(filename)) {
            this$0.i1(filename);
            return;
        }
        this$0.F(this$0.getString(J4.h.f4347Y) + filename + ' ' + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(a1 this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.U0();
        this$0.l1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0() {
        LinearLayout linearLayout = this.f4709u;
        if (linearLayout == null) {
            AlertDialog alertDialog = this.f4705q;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            this.f4705q = null;
            return;
        }
        AbstractC3292y.f(linearLayout);
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = this.f4709u;
        AbstractC3292y.f(linearLayout2);
        linearLayout2.setVisibility(8);
    }

    private final boolean V0() {
        AlertDialog alertDialog = this.f4705q;
        if (alertDialog != null && alertDialog.isShowing()) {
            return true;
        }
        LinearLayout linearLayout = this.f4709u;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y0(a1 this$0, String msg) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(msg, "$msg");
        this$0.U0();
        this$0.F(msg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b1(a1 this$0, NsdServiceInfo nsdServiceInfo) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(nsdServiceInfo, "$nsdServiceInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(this$0.getString(J4.h.f4345W));
        h.a aVar = Q4.h.f8759h;
        String serviceName = nsdServiceInfo.getServiceName();
        AbstractC3292y.h(serviceName, "nsdServiceInfo.serviceName");
        sb.append(aVar.c(serviceName));
        Toast.makeText(this$0, sb.toString(), 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d1(a1 this$0, String str) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.U0();
        this$0.F(str);
        this$0.Z0();
    }

    private final void e1(View view) {
        Window window;
        AlertDialog alertDialog;
        LinearLayout linearLayout = this.f4709u;
        if (linearLayout == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(view);
            builder.setCancelable(false);
            AlertDialog create = builder.create();
            this.f4705q = create;
            if (create != null) {
                window = create.getWindow();
            } else {
                window = null;
            }
            AbstractC3292y.f(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (!isFinishing() && (alertDialog = this.f4705q) != null) {
                alertDialog.show();
                return;
            }
            return;
        }
        AbstractC3292y.f(linearLayout);
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = this.f4709u;
        AbstractC3292y.f(linearLayout2);
        linearLayout2.addView(view, this.f4710v);
        LinearLayout linearLayout3 = this.f4709u;
        AbstractC3292y.f(linearLayout3);
        linearLayout3.setVisibility(0);
    }

    private final void f1(final P4.c cVar) {
        U0();
        View view = View.inflate(this, J4.f.f4307h, null);
        View findViewById = view.findViewById(J4.e.f4293x1);
        AbstractC3292y.h(findViewById, "view.findViewById(R.id.tv_msg_confirm)");
        TextView textView = (TextView) findViewById;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
        String string = getString(J4.h.f4344V);
        AbstractC3292y.h(string, "getString(R.string.msg_confirm_receive_file)");
        String format = String.format(string, Arrays.copyOf(new Object[]{cVar.f(), cVar.e()}, 2));
        AbstractC3292y.h(format, "format(format, *args)");
        textView.setText(format);
        View findViewById2 = view.findViewById(J4.e.f4157E0);
        AbstractC3292y.h(findViewById2, "view.findViewById(R.id.tv_confirm_receive)");
        TextView textView2 = (TextView) findViewById2;
        textView2.setTypeface(aVar.v());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: K4.M0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a1.g1(a1.this, cVar, view2);
            }
        });
        View findViewById3 = view.findViewById(J4.e.f4283u0);
        AbstractC3292y.h(findViewById3, "view.findViewById(R.id.tv_cancel)");
        TextView textView3 = (TextView) findViewById3;
        textView3.setTypeface(aVar.u());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: K4.N0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a1.h1(a1.this, view2);
            }
        });
        AbstractC3292y.h(view, "view");
        e1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g1(a1 this$0, P4.c fileTransferInfo, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(fileTransferInfo, "$fileTransferInfo");
        this$0.U0();
        this$0.n1(fileTransferInfo.e());
        Q4.c p8 = J4.j.f4395g.p();
        AbstractC3292y.f(p8);
        p8.o(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h1(a1 this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.U0();
        Q4.c p8 = J4.j.f4395g.p();
        AbstractC3292y.f(p8);
        p8.o(false);
        this$0.Z0();
    }

    private final void i1(final String str) {
        U0();
        View view = View.inflate(this, J4.f.f4313n, null);
        View findViewById = view.findViewById(J4.e.f4176K1);
        AbstractC3292y.h(findViewById, "view.findViewById(R.id.tv_receiving_finished)");
        TextView textView = (TextView) findViewById;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        textView.setText(str);
        View findViewById2 = view.findViewById(J4.e.f4251j1);
        AbstractC3292y.h(findViewById2, "view.findViewById(R.id.tv_install)");
        TextView textView2 = (TextView) findViewById2;
        textView2.setTypeface(aVar.u());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: K4.Z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a1.j1(a1.this, str, view2);
            }
        });
        View findViewById3 = view.findViewById(J4.e.f4283u0);
        AbstractC3292y.h(findViewById3, "view.findViewById(R.id.tv_cancel)");
        TextView textView3 = (TextView) findViewById3;
        textView3.setTypeface(aVar.u());
        textView3.setText(getString(R.string.ok));
        textView3.setOnClickListener(new View.OnClickListener() { // from class: K4.L0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a1.k1(a1.this, view2);
            }
        });
        AbstractC3292y.h(view, "view");
        e1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(a1 this$0, String filename, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(filename, "$filename");
        J4.i.f(new J4.i(this$0), new File(new S4.f().f(this$0), filename), null, false, 6, null);
        this$0.U0();
        this$0.Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(a1 this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.U0();
        this$0.Z0();
    }

    private final void l1() {
        U0();
        View view = View.inflate(this, J4.f.f4313n, null);
        View findViewById = view.findViewById(J4.e.f4176K1);
        AbstractC3292y.h(findViewById, "view.findViewById(R.id.tv_receiving_finished)");
        TextView textView = (TextView) findViewById;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        textView.setText(getString(J4.h.f4358e0));
        View findViewById2 = view.findViewById(J4.e.f4251j1);
        AbstractC3292y.h(findViewById2, "view.findViewById(R.id.tv_install)");
        ((TextView) findViewById2).setVisibility(8);
        View findViewById3 = view.findViewById(J4.e.f4283u0);
        AbstractC3292y.h(findViewById3, "view.findViewById(R.id.tv_cancel)");
        TextView textView2 = (TextView) findViewById3;
        textView2.setTypeface(aVar.u());
        textView2.setText(getString(R.string.ok));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: K4.Y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a1.m1(a1.this, view2);
            }
        });
        AbstractC3292y.h(view, "view");
        e1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m1(a1 this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.U0();
        this$0.Z0();
    }

    private final void n1(String str) {
        TextView textView;
        M0();
        TextView textView2 = this.f4706r;
        if (textView2 != null) {
            textView2.setText(getString(J4.h.f4352b0));
        }
        if (str != null && (textView = this.f4707s) != null) {
            textView.setText(str);
        }
    }

    private final void o1() {
        String str;
        TextView textView;
        NsdServiceInfo e8;
        M0();
        TextView textView2 = this.f4706r;
        if (textView2 != null) {
            textView2.setText(getString(J4.h.f4372l0));
        }
        Q4.h m8 = J4.j.f4395g.m();
        if (m8 != null && (e8 = m8.e()) != null) {
            str = e8.getServiceName();
        } else {
            str = null;
        }
        if (str != null && (textView = this.f4707s) != null) {
            textView.setText(Q4.h.f8759h.c(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q1(a1 this$0, boolean z8) {
        AbstractC3292y.i(this$0, "this$0");
        TextView textView = this$0.f4703o;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        ProgressBar progressBar = this$0.f4704p;
        if (progressBar != null) {
            progressBar.setIndeterminate(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s1(a1 this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.o1();
        ProgressBar progressBar = this$0.f4704p;
        if (progressBar != null) {
            progressBar.setIndeterminate(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u1(a1 this$0, int i8) {
        AbstractC3292y.i(this$0, "this$0");
        ProgressBar progressBar = this$0.f4704p;
        if (progressBar != null) {
            progressBar.setProgress(i8);
        }
        TextView textView = this$0.f4703o;
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(i8);
            sb.append('%');
            textView.setText(sb.toString());
        }
    }

    public final void K0(final P4.c fileTransferInfo) {
        AbstractC3292y.i(fileTransferInfo, "fileTransferInfo");
        runOnUiThread(new Runnable() { // from class: K4.X0
            @Override // java.lang.Runnable
            public final void run() {
                a1.L0(a1.this, fileTransferInfo);
            }
        });
    }

    public final void O0() {
        Integer num;
        ArrayList g8;
        j.a aVar = J4.j.f4395g;
        Q4.h m8 = aVar.m();
        if (m8 != null && (g8 = m8.g()) != null) {
            num = Integer.valueOf(g8.size());
        } else {
            num = null;
        }
        AbstractC3292y.f(num);
        if (num.intValue() > 0) {
            a aVar2 = new a();
            View view = View.inflate(this, J4.f.f4303d, null);
            Q4.h m9 = aVar.m();
            AbstractC3292y.f(m9);
            M4.a aVar3 = new M4.a(m9.g(), aVar2);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(J4.e.f4219Z);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), 1, false));
            }
            recyclerView.setAdapter(aVar3);
            View findViewById = view.findViewById(J4.e.f4283u0);
            AbstractC3292y.h(findViewById, "view.findViewById(R.id.tv_cancel)");
            TextView textView = (TextView) findViewById;
            textView.setTypeface(aVar.u());
            textView.setOnClickListener(new View.OnClickListener() { // from class: K4.P0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a1.P0(a1.this, view2);
                }
            });
            AbstractC3292y.h(view, "view");
            e1(view);
            return;
        }
        F(getString(J4.h.f4360f0));
    }

    public final void Q0(final String filename, final String str) {
        AbstractC3292y.i(filename, "filename");
        runOnUiThread(new Runnable() { // from class: K4.V0
            @Override // java.lang.Runnable
            public final void run() {
                a1.R0(a1.this, filename, str);
            }
        });
    }

    public final void S0() {
        runOnUiThread(new Runnable() { // from class: K4.S0
            @Override // java.lang.Runnable
            public final void run() {
                a1.T0(a1.this);
            }
        });
        J4.j.f4395g.b();
    }

    public final void X0(final String msg) {
        AbstractC3292y.i(msg, "msg");
        runOnUiThread(new Runnable() { // from class: K4.R0
            @Override // java.lang.Runnable
            public final void run() {
                a1.Y0(a1.this, msg);
            }
        });
    }

    public abstract void Z0();

    public void a1(final NsdServiceInfo nsdServiceInfo) {
        AbstractC3292y.i(nsdServiceInfo, "nsdServiceInfo");
        runOnUiThread(new Runnable() { // from class: K4.Q0
            @Override // java.lang.Runnable
            public final void run() {
                a1.b1(a1.this, nsdServiceInfo);
            }
        });
    }

    public final void c1(final String str) {
        runOnUiThread(new Runnable() { // from class: K4.U0
            @Override // java.lang.Runnable
            public final void run() {
                a1.d1(a1.this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Q4.h m8;
        super.onResume();
        j.a aVar = J4.j.f4395g;
        Q4.c p8 = aVar.p();
        if (p8 != null && !p8.j()) {
            Application application = getApplication();
            AbstractC3292y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
            if (!((J4.j) application).K().get() && (m8 = aVar.m()) != null) {
                m8.d();
            }
        }
        if (V0()) {
            if (aVar.q()) {
                aVar.H(false);
                S0();
                return;
            }
            if (aVar.i() != null) {
                String i8 = aVar.i();
                AbstractC3292y.f(i8);
                Q0(i8, aVar.j());
                aVar.z(null);
                aVar.A(null);
                return;
            }
            if (aVar.s() != null) {
                c1(aVar.s());
                aVar.J(null);
            } else if (aVar.r() != null) {
                String r8 = aVar.r();
                AbstractC3292y.f(r8);
                X0(r8);
                aVar.I(null);
            }
        }
    }

    public final void p1(final boolean z8) {
        runOnUiThread(new Runnable() { // from class: K4.W0
            @Override // java.lang.Runnable
            public final void run() {
                a1.q1(a1.this, z8);
            }
        });
    }

    public final void r1() {
        runOnUiThread(new Runnable() { // from class: K4.K0
            @Override // java.lang.Runnable
            public final void run() {
                a1.s1(a1.this);
            }
        });
    }

    public final void t1(final int i8) {
        runOnUiThread(new Runnable() { // from class: K4.T0
            @Override // java.lang.Runnable
            public final void run() {
                a1.u1(a1.this, i8);
            }
        });
    }

    public void W0() {
    }
}
