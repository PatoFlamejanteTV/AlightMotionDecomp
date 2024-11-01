package Z4;

import I4.C1224c;
import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import R5.AbstractC1435t;
import Y4.C1500a;
import Y4.C1504c;
import Y4.C1507d0;
import Y4.C1509e0;
import Y4.C1516i;
import Y4.C1520k;
import Y4.C1523m;
import Y4.C1526p;
import Y4.C1527q;
import Y4.C1530u;
import Y4.C1531v;
import Y4.C1534y;
import Y4.C1535z;
import Z4.C1541b1;
import Z4.C1591j1;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.autofill.HintConstants;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.runtime.ComposerKt;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import b5.InterfaceC1974C;
import b5.InterfaceC1977a;
import b5.InterfaceC1980d;
import b5.InterfaceC1986j;
import c5.C2031A;
import c5.C2039d;
import c5.C2040e;
import c5.C2041f;
import c5.C2043h;
import c5.C2045j;
import c5.C2046k;
import c5.C2047l;
import c5.C2051p;
import c5.C2052q;
import c5.C2054t;
import c5.C2058x;
import c5.T;
import c6.InterfaceC2072n;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.snackbar.Snackbar;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2691a;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.AppInstalledDetailsActivity;
import com.uptodown.activities.FreeUpSpaceActivity;
import com.uptodown.activities.Gallery;
import com.uptodown.activities.InformationActivity;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MoreInfo;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.OrganizationActivity;
import com.uptodown.activities.RepliesActivity;
import com.uptodown.activities.ReviewsActivity;
import com.uptodown.activities.SearchActivity;
import com.uptodown.activities.UserCommentsActivity;
import com.uptodown.activities.VirusTotalReport;
import com.uptodown.activities.YouTubeActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.util.views.UsernameTextView;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadWorker;
import com.uptodown.workers.GenerateQueueWorker;
import com.uptodown.workers.GetUserDataWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3770C;
import q5.C3775H;
import q5.C3776a;
import q5.C3784i;
import q5.C3788m;
import q5.C3791p;
import q5.C3794s;
import q5.C3795t;
import q5.C3800y;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;
import s5.C3969c;
import s5.C3970d;

/* renamed from: Z4.b1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1541b1 extends Fragment {

    /* renamed from: n, reason: collision with root package name */
    public static final C1542a f13378n = new C1542a(null);

    /* renamed from: a, reason: collision with root package name */
    private C2043h f13379a;

    /* renamed from: b, reason: collision with root package name */
    private C1504c f13380b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f13381c;

    /* renamed from: d, reason: collision with root package name */
    private C3795t f13382d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f13383e;

    /* renamed from: f, reason: collision with root package name */
    private AlertDialog f13384f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f13385g;

    /* renamed from: h, reason: collision with root package name */
    private Menu f13386h;

    /* renamed from: i, reason: collision with root package name */
    private I4.L f13387i;

    /* renamed from: j, reason: collision with root package name */
    private I4.L f13388j;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f13389k;

    /* renamed from: l, reason: collision with root package name */
    private final ActivityResultLauncher f13390l;

    /* renamed from: m, reason: collision with root package name */
    private final ActivityResultLauncher f13391m;

    /* renamed from: Z4.b1$A */
    /* loaded from: classes5.dex */
    public static final class A implements m2.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f13393b;

        A(Context context) {
            this.f13393b = context;
        }

        @Override // m2.b
        public void a(Exception e8) {
            AbstractC3292y.i(e8, "e");
            e8.printStackTrace();
            C1541b1 c1541b1 = C1541b1.this;
            c1541b1.y5(c1541b1.v3().f12496K.f12598b, this.f13393b);
        }

        @Override // m2.b
        public void b() {
            C1541b1 c1541b1 = C1541b1.this;
            c1541b1.y5(c1541b1.v3().f12496K.f12598b, this.f13393b);
        }
    }

    /* renamed from: Z4.b1$B */
    /* loaded from: classes5.dex */
    public static final class B implements InterfaceC1980d {
        B() {
        }

        @Override // b5.InterfaceC1980d
        public void a(C2043h app) {
            AbstractC3292y.i(app, "app");
            if (UptodownApp.f29249C.a0() && C1541b1.this.getActivity() != null && !C1541b1.this.requireActivity().isFinishing()) {
                C1541b1.this.I4(app);
            }
        }
    }

    /* renamed from: Z4.b1$C */
    /* loaded from: classes5.dex */
    public static final class C implements InterfaceC1977a {
        C() {
        }

        @Override // b5.InterfaceC1977a
        public void a(C2043h appInfo, int i8) {
            AbstractC3292y.i(appInfo, "appInfo");
            C1541b1.this.f6(appInfo);
        }
    }

    /* renamed from: Z4.b1$D */
    /* loaded from: classes5.dex */
    public static final class D implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1507d0 f13396a;

        D(C1507d0 c1507d0) {
            this.f13396a = c1507d0;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f13396a.f12590n.getViewTreeObserver().removeOnPreDrawListener(this);
            TextView tvBodyReview = this.f13396a.f12590n;
            AbstractC3292y.h(tvBodyReview, "tvBodyReview");
            if (s5.u.a(tvBodyReview)) {
                this.f13396a.f12595s.setVisibility(0);
                this.f13396a.f12595s.setTypeface(J4.j.f4395g.u());
                return true;
            }
            return true;
        }
    }

    /* renamed from: Z4.b1$E */
    /* loaded from: classes5.dex */
    public static final class E implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1509e0 f13397a;

        E(C1509e0 c1509e0) {
            this.f13397a = c1509e0;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f13397a.f12636n.getViewTreeObserver().removeOnPreDrawListener(this);
            TextView tvBodyReview = this.f13397a.f12636n;
            AbstractC3292y.h(tvBodyReview, "tvBodyReview");
            if (s5.u.a(tvBodyReview)) {
                this.f13397a.f12641s.setVisibility(0);
                this.f13397a.f12641s.setTypeface(J4.j.f4395g.u());
                return true;
            }
            return true;
        }
    }

    /* renamed from: Z4.b1$F */
    /* loaded from: classes5.dex */
    public static final class F implements InterfaceC1974C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f13399b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.T f13400c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f13401d;

        F(ArrayList arrayList, kotlin.jvm.internal.T t8, ArrayList arrayList2) {
            this.f13399b = arrayList;
            this.f13400c = t8;
            this.f13401d = arrayList2;
        }

        @Override // b5.InterfaceC1974C
        public void a(c5.N screenshot) {
            AbstractC3292y.i(screenshot, "screenshot");
            this.f13399b.remove(screenshot);
            I4.E e8 = (I4.E) this.f13400c.f34573a;
            if (e8 != null) {
                e8.c(screenshot);
            }
        }

        @Override // b5.InterfaceC1974C
        public void b(c5.N screenshot) {
            AbstractC3292y.i(screenshot, "screenshot");
            UptodownApp.a aVar = UptodownApp.f29249C;
            if (aVar.a0() && C1541b1.this.getActivity() != null && !C1541b1.this.requireActivity().isFinishing()) {
                Intent intent = new Intent(C1541b1.this.requireActivity(), (Class<?>) Gallery.class);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("images", this.f13399b);
                bundle.putInt("index", this.f13399b.indexOf(screenshot));
                intent.putExtra("bundle", bundle);
                C1541b1 c1541b1 = C1541b1.this;
                FragmentActivity requireActivity = c1541b1.requireActivity();
                AbstractC3292y.h(requireActivity, "requireActivity(...)");
                c1541b1.startActivity(intent, aVar.a(requireActivity));
            }
        }

        @Override // b5.InterfaceC1974C
        public void c(c5.V video) {
            AbstractC3292y.i(video, "video");
            this.f13401d.remove(video);
            I4.E e8 = (I4.E) this.f13400c.f34573a;
            if (e8 != null) {
                e8.c(video);
            }
        }

        @Override // b5.InterfaceC1974C
        public void d(c5.V video) {
            AbstractC3292y.i(video, "video");
            if (UptodownApp.f29249C.a0() && C1541b1.this.getActivity() != null && !C1541b1.this.requireActivity().isFinishing()) {
                Intent intent = new Intent(C1541b1.this.getActivity(), (Class<?>) YouTubeActivity.class);
                intent.putExtra("id_youtube", video.getId());
                C1541b1.this.startActivity(intent);
            }
        }
    }

    /* renamed from: Z4.b1$G */
    /* loaded from: classes5.dex */
    public static final class G implements InterfaceC1980d {
        G() {
        }

        @Override // b5.InterfaceC1980d
        public void a(C2043h app) {
            AbstractC3292y.i(app, "app");
            if (UptodownApp.f29249C.a0() && C1541b1.this.getActivity() != null && !C1541b1.this.requireActivity().isFinishing()) {
                C1541b1.this.I4(app);
            }
        }
    }

    /* renamed from: Z4.b1$H */
    /* loaded from: classes5.dex */
    public static final class H implements InterfaceC1977a {
        H() {
        }

        @Override // b5.InterfaceC1977a
        public void a(C2043h appInfo, int i8) {
            AbstractC3292y.i(appInfo, "appInfo");
            C1541b1.this.f6(appInfo);
        }
    }

    /* renamed from: Z4.b1$I */
    /* loaded from: classes5.dex */
    public static final class I implements InterfaceC1980d {
        I() {
        }

        @Override // b5.InterfaceC1980d
        public void a(C2043h app) {
            AbstractC3292y.i(app, "app");
            if (UptodownApp.f29249C.a0() && C1541b1.this.getActivity() != null && !C1541b1.this.requireActivity().isFinishing()) {
                C1541b1.this.I4(app);
            }
        }
    }

    /* renamed from: Z4.b1$J */
    /* loaded from: classes5.dex */
    public static final class J implements InterfaceC1977a {
        J() {
        }

        @Override // b5.InterfaceC1977a
        public void a(C2043h appInfo, int i8) {
            AbstractC3292y.i(appInfo, "appInfo");
            C1541b1.this.f6(appInfo);
        }
    }

    /* renamed from: Z4.b1$K */
    /* loaded from: classes5.dex */
    public static final class K extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2051p f13406a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1541b1 f13407b;

        K(C2051p c2051p, C1541b1 c1541b1) {
            this.f13406a = c2051p;
            this.f13407b = c1541b1;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3292y.i(widget, "widget");
            if (UptodownApp.f29249C.a0() && this.f13406a.a() != null) {
                this.f13407b.H4(this.f13406a.a().longValue());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3292y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(this.f13407b.requireContext(), com.uptodown.R.color.main_blue));
            ds.setTypeface(J4.j.f4395g.u());
        }
    }

    /* renamed from: Z4.b1$L */
    /* loaded from: classes5.dex */
    public static final class L extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2051p f13408a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1541b1 f13409b;

        L(C2051p c2051p, C1541b1 c1541b1) {
            this.f13408a = c2051p;
            this.f13409b = c1541b1;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3292y.i(widget, "widget");
            if (UptodownApp.f29249C.a0() && this.f13408a.a() != null) {
                C2046k c2046k = new C2046k((int) this.f13408a.a().longValue(), this.f13408a.d(), null, 4, null);
                c2046k.I(true);
                this.f13409b.v4(c2046k);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3292y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(this.f13409b.requireContext(), com.uptodown.R.color.main_blue));
            ds.setTypeface(J4.j.f4395g.u());
        }
    }

    /* renamed from: Z4.b1$M */
    /* loaded from: classes5.dex */
    public static final class M implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f13410a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1541b1 f13411b;

        M(View view, C1541b1 c1541b1) {
            this.f13410a = view;
            this.f13411b = c1541b1;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f13410a.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f13411b.startPostponedEnterTransition();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$N */
    /* loaded from: classes5.dex */
    public static final class N extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13412a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Z4.b1$N$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1541b1 f13414a;

            a(C1541b1 c1541b1) {
                this.f13414a = c1541b1;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (!(abstractC3768A instanceof AbstractC3768A.a)) {
                    if (abstractC3768A instanceof AbstractC3768A.c) {
                        AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                        if (((C1591j1.g) cVar.a()).b()) {
                            Toast.makeText(this.f13414a.requireContext(), this.f13414a.requireContext().getString(com.uptodown.R.string.review_sended), 0).show();
                            Bundle bundle = new Bundle();
                            bundle.putString(CampaignEx.JSON_KEY_STAR, String.valueOf(((Number) this.f13414a.z3().X().getValue()).intValue()));
                            C2043h u32 = this.f13414a.u3();
                            AbstractC3292y.f(u32);
                            bundle.putString("packagename", u32.v0());
                            C3795t c3795t = this.f13414a.f13382d;
                            if (c3795t != null) {
                                c3795t.e("app_rated", bundle);
                            }
                        } else if (!((C1591j1.g) cVar.a()).b() && ((C1591j1.g) cVar.a()).a() == 0) {
                            Toast.makeText(this.f13414a.requireContext(), com.uptodown.R.string.error_review_already_submitted, 1).show();
                        } else if (((C1591j1.g) cVar.a()).a() == 401) {
                            this.f13414a.p4();
                        } else if (((C1591j1.g) cVar.a()).a() == 403) {
                            Toast.makeText(this.f13414a.requireContext(), com.uptodown.R.string.email_validation_msg, 1).show();
                        } else {
                            Toast.makeText(this.f13414a.requireContext(), this.f13414a.requireContext().getString(com.uptodown.R.string.error_generico), 0).show();
                        }
                    } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                        throw new Q5.p();
                    }
                }
                return Q5.I.f8786a;
            }
        }

        N(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new N(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13412a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L b02 = C1541b1.this.z3().b0();
                a aVar = new a(C1541b1.this);
                this.f13412a = 1;
                if (b02.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((N) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.b1$Q */
    /* loaded from: classes5.dex */
    public static final class Q implements m2.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1500a f13418b;

        Q(C1500a c1500a) {
            this.f13418b = c1500a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(C1500a c1500a, C1541b1 c1541b1) {
            if (new C3788m().p(c1500a.getRoot())) {
                C2058x.a aVar = C2058x.f15962n;
                Context requireContext = c1541b1.requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                C2058x d8 = aVar.d(requireContext);
                if (d8 != null) {
                    Context requireContext2 = c1541b1.requireContext();
                    AbstractC3292y.h(requireContext2, "requireContext(...)");
                    d8.j(requireContext2);
                    return;
                }
                return;
            }
            if (c1541b1.getActivity() != null && (c1541b1.getActivity() instanceof MainActivity)) {
                FragmentActivity activity = c1541b1.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).T2();
            }
        }

        @Override // m2.b
        public void a(Exception exc) {
            C1541b1.this.v3().f12524g.removeAllViews();
            C1541b1.this.v3().f12524g.setVisibility(8);
            C1541b1.this.n6();
        }

        @Override // m2.b
        public void b() {
            if (C1541b1.this.getActivity() != null && (C1541b1.this.getActivity() instanceof MainActivity)) {
                FragmentActivity activity = C1541b1.this.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).s2();
            }
            C1541b1.this.v3().f12524g.addView(this.f13418b.getRoot());
            C1541b1.this.v3().f12524g.setVisibility(0);
            Handler handler = new Handler(Looper.getMainLooper());
            final C1500a c1500a = this.f13418b;
            final C1541b1 c1541b1 = C1541b1.this;
            handler.postDelayed(new Runnable() { // from class: Z4.i1
                @Override // java.lang.Runnable
                public final void run() {
                    C1541b1.Q.d(C1500a.this, c1541b1);
                }
            }, 500L);
        }
    }

    /* renamed from: Z4.b1$R */
    /* loaded from: classes5.dex */
    public static final class R implements NewInterstitialListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBNewInterstitialHandler f13420b;

        R(MBNewInterstitialHandler mBNewInterstitialHandler) {
            this.f13420b = mBNewInterstitialHandler;
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdClicked(MBridgeIds ids) {
            AbstractC3292y.i(ids, "ids");
            Bundle bundle = new Bundle();
            bundle.putString("type", "clicked");
            new C3795t(C1541b1.this.getContext()).e("mintegral_interstitial", bundle);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdClose(MBridgeIds ids, RewardInfo info) {
            AbstractC3292y.i(ids, "ids");
            AbstractC3292y.i(info, "info");
            Bundle bundle = new Bundle();
            bundle.putString("type", "closed");
            new C3795t(C1541b1.this.getContext()).e("mintegral_interstitial", bundle);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdCloseWithNIReward(MBridgeIds ids, RewardInfo info) {
            AbstractC3292y.i(ids, "ids");
            AbstractC3292y.i(info, "info");
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdShow(MBridgeIds ids) {
            AbstractC3292y.i(ids, "ids");
            if (C1541b1.this.getContext() != null) {
                Bundle bundle = new Bundle();
                bundle.putString("type", "show");
                new C3795t(C1541b1.this.getContext()).e("mintegral_interstitial", bundle);
                SettingsPreferences.a aVar = SettingsPreferences.f30529b;
                Context requireContext = C1541b1.this.requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                aVar.N0(requireContext, System.currentTimeMillis());
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onEndcardShow(MBridgeIds ids) {
            AbstractC3292y.i(ids, "ids");
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onLoadCampaignSuccess(MBridgeIds ids) {
            AbstractC3292y.i(ids, "ids");
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onResourceLoadFail(MBridgeIds ids, String errorMsg) {
            String str;
            AbstractC3292y.i(ids, "ids");
            AbstractC3292y.i(errorMsg, "errorMsg");
            Bundle bundle = new Bundle();
            bundle.putString("type", "load_failed");
            if (errorMsg.length() > 10) {
                str = errorMsg.substring(0, 10);
                AbstractC3292y.h(str, "substring(...)");
            } else if (errorMsg.length() > 0) {
                str = errorMsg;
            } else {
                str = null;
            }
            if (str != null) {
                bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, errorMsg);
            }
            new C3795t(C1541b1.this.getContext()).e("mintegral_interstitial", bundle);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onResourceLoadSuccess(MBridgeIds ids) {
            AbstractC3292y.i(ids, "ids");
            Bundle bundle = new Bundle();
            bundle.putString("type", "loaded");
            new C3795t(C1541b1.this.getContext()).e("mintegral_interstitial", bundle);
            if (this.f13420b.isReady()) {
                this.f13420b.show();
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onShowFail(MBridgeIds ids, String errorMsg) {
            String str;
            AbstractC3292y.i(ids, "ids");
            AbstractC3292y.i(errorMsg, "errorMsg");
            Bundle bundle = new Bundle();
            bundle.putString("type", "show_failed");
            if (errorMsg.length() > 10) {
                str = errorMsg.substring(0, 10);
                AbstractC3292y.h(str, "substring(...)");
            } else if (errorMsg.length() > 0) {
                str = errorMsg;
            } else {
                str = null;
            }
            if (str != null) {
                bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, errorMsg);
            }
            new C3795t(C1541b1.this.getContext()).e("mintegral_interstitial", bundle);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onVideoComplete(MBridgeIds ids) {
            AbstractC3292y.i(ids, "ids");
            Bundle bundle = new Bundle();
            bundle.putString("type", "video_completed");
            new C3795t(C1541b1.this.getContext()).e("mintegral_interstitial", bundle);
        }
    }

    /* renamed from: Z4.b1$S */
    /* loaded from: classes5.dex */
    public static final class S extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f13421a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public S(Fragment fragment) {
            super(0);
            this.f13421a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return this.f13421a;
        }
    }

    /* renamed from: Z4.b1$T */
    /* loaded from: classes5.dex */
    public static final class T extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f13422a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T(Function0 function0) {
            super(0);
            this.f13422a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f13422a.invoke();
        }
    }

    /* renamed from: Z4.b1$U */
    /* loaded from: classes5.dex */
    public static final class U extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1416k f13423a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public U(InterfaceC1416k interfaceC1416k) {
            super(0);
            this.f13423a = interfaceC1416k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStoreOwner m5430viewModels$lambda1;
            m5430viewModels$lambda1 = FragmentViewModelLazyKt.m5430viewModels$lambda1(this.f13423a);
            return m5430viewModels$lambda1.getViewModelStore();
        }
    }

    /* renamed from: Z4.b1$V */
    /* loaded from: classes5.dex */
    public static final class V extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f13424a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1416k f13425b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public V(Function0 function0, InterfaceC1416k interfaceC1416k) {
            super(0);
            this.f13424a = function0;
            this.f13425b = interfaceC1416k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            ViewModelStoreOwner m5430viewModels$lambda1;
            CreationExtras creationExtras;
            Function0 function0 = this.f13424a;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            m5430viewModels$lambda1 = FragmentViewModelLazyKt.m5430viewModels$lambda1(this.f13425b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5430viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5430viewModels$lambda1 : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
    }

    /* renamed from: Z4.b1$W */
    /* loaded from: classes5.dex */
    public static final class W extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f13426a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1416k f13427b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public W(Fragment fragment, InterfaceC1416k interfaceC1416k) {
            super(0);
            this.f13426a = fragment;
            this.f13427b = interfaceC1416k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelStoreOwner m5430viewModels$lambda1;
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            m5430viewModels$lambda1 = FragmentViewModelLazyKt.m5430viewModels$lambda1(this.f13427b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5430viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5430viewModels$lambda1 : null;
            if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.f13426a.getDefaultViewModelProviderFactory();
            AbstractC3292y.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$X */
    /* loaded from: classes5.dex */
    public static final class X extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13428a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f13430c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        X(Context context, U5.d dVar) {
            super(2, dVar);
            this.f13430c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new X(this.f13430c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13428a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                C1541b1 c1541b1 = C1541b1.this;
                Context context = this.f13430c;
                this.f13428a = 1;
                if (c1541b1.H2(context, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((X) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$Y */
    /* loaded from: classes5.dex */
    public static final class Y extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13431a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13432b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1541b1 f13433c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Y(String str, C1541b1 c1541b1, U5.d dVar) {
            super(2, dVar);
            this.f13432b = str;
            this.f13433c = c1541b1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new Y(this.f13432b, this.f13433c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            Object obj4;
            V5.b.e();
            if (this.f13431a == 0) {
                Q5.t.b(obj);
                String str = this.f13432b;
                if (str != null && str.length() != 0) {
                    if (this.f13433c.f13387i != null) {
                        I4.L l8 = this.f13433c.f13387i;
                        AbstractC3292y.f(l8);
                        ArrayList c8 = l8.c();
                        String str2 = this.f13432b;
                        Iterator it = c8.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj4 = it.next();
                                if (AbstractC3292y.d(((C2043h) obj4).v0(), str2)) {
                                    break;
                                }
                            } else {
                                obj4 = null;
                                break;
                            }
                        }
                        I4.L l9 = this.f13433c.f13387i;
                        AbstractC3292y.f(l9);
                        int r02 = AbstractC1435t.r0(l9.c(), (C2043h) obj4);
                        I4.L l10 = this.f13433c.f13387i;
                        AbstractC3292y.f(l10);
                        l10.notifyItemChanged(r02);
                    }
                    if (this.f13433c.f13388j != null) {
                        I4.L l11 = this.f13433c.f13388j;
                        AbstractC3292y.f(l11);
                        ArrayList c9 = l11.c();
                        String str3 = this.f13432b;
                        Iterator it2 = c9.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = it2.next();
                                if (AbstractC3292y.d(((C2043h) obj3).v0(), str3)) {
                                    break;
                                }
                            } else {
                                obj3 = null;
                                break;
                            }
                        }
                        I4.L l12 = this.f13433c.f13388j;
                        AbstractC3292y.f(l12);
                        int r03 = AbstractC1435t.r0(l12.c(), (C2043h) obj3);
                        I4.L l13 = this.f13433c.f13388j;
                        AbstractC3292y.f(l13);
                        l13.notifyItemChanged(r03);
                    }
                    if (!this.f13433c.f13389k.isEmpty()) {
                        Iterator it3 = this.f13433c.f13389k.iterator();
                        AbstractC3292y.h(it3, "iterator(...)");
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            AbstractC3292y.h(next, "next(...)");
                            I4.L l14 = (I4.L) next;
                            ArrayList c10 = l14.c();
                            String str4 = this.f13432b;
                            Iterator it4 = c10.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    obj2 = it4.next();
                                    if (AbstractC3292y.d(((C2043h) obj2).v0(), str4)) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            l14.notifyItemChanged(AbstractC1435t.r0(l14.c(), (C2043h) obj2));
                        }
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((Y) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$Z */
    /* loaded from: classes5.dex */
    public static final class Z extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13434a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13436c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Z(String str, U5.d dVar) {
            super(2, dVar);
            this.f13436c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new Z(this.f13436c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FragmentActivity activity;
            V5.b.e();
            if (this.f13434a == 0) {
                Q5.t.b(obj);
                if (C1541b1.this.u3() != null) {
                    String str = this.f13436c;
                    C2043h u32 = C1541b1.this.u3();
                    AbstractC3292y.f(u32);
                    if (l6.n.s(str, u32.v0(), true) && (activity = C1541b1.this.getActivity()) != null) {
                        C1541b1.this.r6(activity);
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((Z) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.b1$a, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1542a {
        private C1542a() {
        }

        public final C1541b1 a(C2043h c2043h, long j8) {
            C1541b1 c1541b1 = new C1541b1();
            Bundle bundle = new Bundle();
            if (c2043h != null) {
                bundle.putParcelable("appInfo", c2043h);
            }
            bundle.putLong("appId", j8);
            c1541b1.setArguments(bundle);
            return c1541b1;
        }

        public /* synthetic */ C1542a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$a0 */
    /* loaded from: classes5.dex */
    public static final class a0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13437a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0 f13439c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(b0 b0Var, U5.d dVar) {
            super(2, dVar);
            this.f13439c = b0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a0(this.f13439c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13437a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                GetUserDataWorker.a aVar = GetUserDataWorker.f31222b;
                Context requireContext = C1541b1.this.requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                b0 b0Var = this.f13439c;
                this.f13437a = 1;
                if (aVar.b(requireContext, b0Var, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((a0) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.b1$b, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public final class RunnableC1543b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f13440a;

        /* renamed from: b, reason: collision with root package name */
        private final c5.Q f13441b;

        public RunnableC1543b(int i8, c5.Q q8) {
            this.f13440a = i8;
            this.f13441b = q8;
        }

        @Override // java.lang.Runnable
        public void run() {
            c5.Q q8;
            if (C1541b1.this.u3() != null && (q8 = this.f13441b) != null) {
                String s8 = q8.s();
                C2043h u32 = C1541b1.this.u3();
                AbstractC3292y.f(u32);
                if (l6.n.s(s8, u32.v0(), true)) {
                    int i8 = this.f13440a;
                    if (i8 == 101) {
                        C1541b1.this.Y5(this.f13441b);
                        return;
                    }
                    if (i8 != 108) {
                        if (i8 == 109) {
                            C1541b1.this.Y5(this.f13441b);
                            return;
                        }
                        FragmentActivity activity = C1541b1.this.getActivity();
                        if (activity != null) {
                            C1541b1.this.r6(activity);
                            return;
                        }
                        return;
                    }
                    if (C1541b1.this.getContext() != null) {
                        C3784i c3784i = new C3784i();
                        C2043h u33 = C1541b1.this.u3();
                        AbstractC3292y.f(u33);
                        if (c3784i.t(u33.v0(), C1541b1.this.getContext())) {
                            C1541b1 c1541b1 = C1541b1.this;
                            Context requireContext = c1541b1.requireContext();
                            AbstractC3292y.h(requireContext, "requireContext(...)");
                            c1541b1.a6(requireContext);
                        } else {
                            C1541b1 c1541b12 = C1541b1.this;
                            Context requireContext2 = c1541b12.requireContext();
                            AbstractC3292y.h(requireContext2, "requireContext(...)");
                            c1541b12.O5(requireContext2);
                        }
                        if (this.f13441b.l() != null) {
                            C3794s c3794s = new C3794s();
                            Context requireContext3 = C1541b1.this.requireContext();
                            AbstractC3292y.h(requireContext3, "requireContext(...)");
                            File g8 = c3794s.g(requireContext3);
                            String l8 = this.f13441b.l();
                            AbstractC3292y.f(l8);
                            File file = new File(g8, l8);
                            if (file.exists()) {
                                UptodownApp.a aVar = UptodownApp.f29249C;
                                Context requireContext4 = C1541b1.this.requireContext();
                                AbstractC3292y.h(requireContext4, "requireContext(...)");
                                C2043h u34 = C1541b1.this.u3();
                                AbstractC3292y.f(u34);
                                aVar.X(file, requireContext4, u34.r0());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    FragmentActivity activity2 = C1541b1.this.getActivity();
                    if (activity2 != null) {
                        C1541b1.this.r6(activity2);
                    }
                }
            }
        }
    }

    /* renamed from: Z4.b1$b0 */
    /* loaded from: classes5.dex */
    public static final class b0 implements b5.H {
        b0() {
        }

        @Override // b5.H
        public void a() {
            T.b bVar = c5.T.f15689k;
            Context requireContext = C1541b1.this.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            c5.T e8 = bVar.e(requireContext);
            if (e8 != null && e8.y()) {
                C1541b1.this.v3().f12524g.setVisibility(8);
                C1541b1.this.v3().f12560z.setVisibility(8);
            }
        }
    }

    /* renamed from: Z4.b1$c, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public final class RunnableC1544c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f13444a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13445b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1541b1 f13446c;

        public RunnableC1544c(C1541b1 c1541b1, String packagename, int i8) {
            AbstractC3292y.i(packagename, "packagename");
            this.f13446c = c1541b1;
            this.f13444a = packagename;
            this.f13445b = i8;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0031. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r4 = this;
                Z4.b1 r0 = r4.f13446c
                c5.h r0 = r0.u3()
                if (r0 == 0) goto Lc6
                Z4.b1 r0 = r4.f13446c
                c5.h r0 = r0.u3()
                kotlin.jvm.internal.AbstractC3292y.f(r0)
                java.lang.String r0 = r0.v0()
                if (r0 == 0) goto Lc6
                Z4.b1 r0 = r4.f13446c
                c5.h r0 = r0.u3()
                kotlin.jvm.internal.AbstractC3292y.f(r0)
                java.lang.String r0 = r0.v0()
                java.lang.String r1 = r4.f13444a
                r2 = 1
                boolean r0 = l6.n.s(r0, r1, r2)
                if (r0 == 0) goto Lc6
                int r0 = r4.f13445b
                java.lang.String r1 = "getString(...)"
                switch(r0) {
                    case 301: goto Lb7;
                    case 302: goto La9;
                    case 303: goto L8e;
                    case 304: goto L73;
                    case 305: goto L63;
                    case 306: goto L55;
                    case 307: goto L39;
                    default: goto L34;
                }
            L34:
                switch(r0) {
                    case 351: goto Lb7;
                    case 352: goto La9;
                    case 353: goto L8e;
                    default: goto L37;
                }
            L37:
                goto Lc6
            L39:
                Z4.b1 r0 = r4.f13446c
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto Lc6
                Z4.b1 r2 = r4.f13446c
                r3 = 2132017523(0x7f140173, float:1.9673327E38)
                java.lang.String r3 = r2.getString(r3)
                kotlin.jvm.internal.AbstractC3292y.h(r3, r1)
                Z4.C1541b1.f1(r2, r3)
                Z4.C1541b1.f2(r2, r0)
                goto Lc6
            L55:
                Z4.b1 r0 = r4.f13446c
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto Lc6
                Z4.b1 r1 = r4.f13446c
                Z4.C1541b1.N1(r1, r0)
                goto Lc6
            L63:
                Z4.b1 r0 = r4.f13446c
                r2 = 2132018551(0x7f140577, float:1.9675412E38)
                java.lang.String r2 = r0.getString(r2)
                kotlin.jvm.internal.AbstractC3292y.h(r2, r1)
                Z4.C1541b1.P1(r0, r2)
                goto Lc6
            L73:
                Z4.b1 r0 = r4.f13446c
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto Lc6
                Z4.b1 r2 = r4.f13446c
                r3 = 2132017811(0x7f140293, float:1.967391E38)
                java.lang.String r3 = r2.getString(r3)
                kotlin.jvm.internal.AbstractC3292y.h(r3, r1)
                Z4.C1541b1.f1(r2, r3)
                Z4.C1541b1.Q1(r2, r0)
                goto Lc6
            L8e:
                Z4.b1 r0 = r4.f13446c
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto Lc6
                Z4.b1 r2 = r4.f13446c
                r3 = 2132017802(0x7f14028a, float:1.9673893E38)
                java.lang.String r3 = r2.getString(r3)
                kotlin.jvm.internal.AbstractC3292y.h(r3, r1)
                Z4.C1541b1.f1(r2, r3)
                Z4.C1541b1.Q1(r2, r0)
                goto Lc6
            La9:
                Z4.b1 r0 = r4.f13446c
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto Lc6
                Z4.b1 r1 = r4.f13446c
                Z4.C1541b1.S1(r1, r0)
                goto Lc6
            Lb7:
                Z4.b1 r0 = r4.f13446c
                r2 = 2132017607(0x7f1401c7, float:1.9673497E38)
                java.lang.String r2 = r0.getString(r2)
                kotlin.jvm.internal.AbstractC3292y.h(r2, r1)
                Z4.C1541b1.P1(r0, r2)
            Lc6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Z4.C1541b1.RunnableC1544c.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$c0 */
    /* loaded from: classes5.dex */
    public static final class c0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13447a;

        c0(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c0(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13447a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                C1541b1 c1541b1 = C1541b1.this;
                this.f13447a = 1;
                if (c1541b1.G6(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c0) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.b1$d, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public final class RunnableC1545d implements Runnable {
        public RunnableC1545d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentActivity activity;
            if (C1541b1.this.u3() != null && (activity = C1541b1.this.getActivity()) != null) {
                C1541b1.this.r6(activity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$d0 */
    /* loaded from: classes5.dex */
    public static final class d0 extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f13450a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f13451b;

        /* renamed from: d, reason: collision with root package name */
        int f13453d;

        d0(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13451b = obj;
            this.f13453d |= Integer.MIN_VALUE;
            return C1541b1.this.G6(this);
        }
    }

    /* renamed from: Z4.b1$e, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public final class RunnableC1546e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f13454a;

        /* renamed from: b, reason: collision with root package name */
        private final c5.r f13455b;

        public RunnableC1546e(int i8, c5.r rVar) {
            this.f13454a = i8;
            this.f13455b = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            c5.r rVar;
            if (C1541b1.this.u3() != null && (rVar = this.f13455b) != null && rVar.Y() != null) {
                String Y8 = this.f13455b.Y();
                C2043h u32 = C1541b1.this.u3();
                AbstractC3292y.f(u32);
                if (l6.n.s(Y8, u32.v0(), true)) {
                    int i8 = this.f13454a;
                    if (i8 != 103) {
                        if (i8 == 211) {
                            C1541b1.this.T5(this.f13455b);
                            return;
                        }
                        switch (i8) {
                            case 200:
                                if (C1541b1.this.i4()) {
                                    C1541b1.this.K5(this.f13455b);
                                    return;
                                }
                                return;
                            case ComposerKt.providerKey /* 201 */:
                                if (C1541b1.this.i4()) {
                                    C1541b1.this.K5(this.f13455b);
                                    return;
                                }
                                return;
                            case ComposerKt.compositionLocalMapKey /* 202 */:
                                if (C1541b1.this.getContext() != null) {
                                    C3784i c3784i = new C3784i();
                                    C2043h u33 = C1541b1.this.u3();
                                    AbstractC3292y.f(u33);
                                    if (c3784i.t(u33.v0(), C1541b1.this.getContext())) {
                                        C1541b1 c1541b1 = C1541b1.this;
                                        Context requireContext = c1541b1.requireContext();
                                        AbstractC3292y.h(requireContext, "requireContext(...)");
                                        c1541b1.a6(requireContext);
                                    } else {
                                        C1541b1 c1541b12 = C1541b1.this;
                                        Context requireContext2 = c1541b12.requireContext();
                                        AbstractC3292y.h(requireContext2, "requireContext(...)");
                                        c1541b12.O5(requireContext2);
                                    }
                                    c5.r rVar2 = this.f13455b;
                                    Context requireContext3 = C1541b1.this.requireContext();
                                    AbstractC3292y.h(requireContext3, "requireContext(...)");
                                    File v8 = rVar2.v(requireContext3);
                                    if (v8 != null) {
                                        UptodownApp.a aVar = UptodownApp.f29249C;
                                        Context requireContext4 = C1541b1.this.requireContext();
                                        AbstractC3292y.h(requireContext4, "requireContext(...)");
                                        C2043h u34 = C1541b1.this.u3();
                                        AbstractC3292y.f(u34);
                                        aVar.X(v8, requireContext4, u34.r0());
                                        return;
                                    }
                                    return;
                                }
                                FragmentActivity activity = C1541b1.this.getActivity();
                                if (activity != null) {
                                    C1541b1.this.r6(activity);
                                    return;
                                }
                                return;
                            case ComposerKt.providerValuesKey /* 203 */:
                                FragmentActivity activity2 = C1541b1.this.getActivity();
                                if (activity2 != null) {
                                    C1541b1 c1541b13 = C1541b1.this;
                                    String string = c1541b13.getString(com.uptodown.R.string.download_error_message);
                                    AbstractC3292y.h(string, "getString(...)");
                                    c1541b13.W2(string);
                                    c1541b13.I5(activity2);
                                    return;
                                }
                                return;
                            default:
                                switch (i8) {
                                    case 205:
                                        C1541b1.this.H5(this.f13455b);
                                        return;
                                    case ComposerKt.referenceKey /* 206 */:
                                        FragmentActivity activity3 = C1541b1.this.getActivity();
                                        if (activity3 != null) {
                                            C1541b1.this.r6(activity3);
                                            return;
                                        }
                                        return;
                                    case ComposerKt.reuseKey /* 207 */:
                                        FragmentActivity activity4 = C1541b1.this.getActivity();
                                        if (activity4 != null) {
                                            C1541b1.this.I5(activity4);
                                            return;
                                        }
                                        return;
                                    default:
                                        FragmentActivity activity5 = C1541b1.this.getActivity();
                                        if (activity5 != null) {
                                            C1541b1.this.r6(activity5);
                                            return;
                                        }
                                        return;
                                }
                        }
                    }
                    c5.r rVar3 = this.f13455b;
                    Context requireContext5 = C1541b1.this.requireContext();
                    AbstractC3292y.h(requireContext5, "requireContext(...)");
                    File v9 = rVar3.v(requireContext5);
                    if (v9 != null) {
                        UptodownApp.a aVar2 = UptodownApp.f29249C;
                        Context requireContext6 = C1541b1.this.requireContext();
                        AbstractC3292y.h(requireContext6, "requireContext(...)");
                        C2043h u35 = C1541b1.this.u3();
                        AbstractC3292y.f(u35);
                        aVar2.X(v9, requireContext6, u35.r0());
                        return;
                    }
                    return;
                }
            }
            C1541b1 c1541b14 = C1541b1.this;
            c5.r rVar4 = this.f13455b;
            if (rVar4 != null) {
                str = rVar4.Y();
            } else {
                str = null;
            }
            c1541b14.y6(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$e0 */
    /* loaded from: classes5.dex */
    public static final class e0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13457a;

        e0(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e0(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13457a == 0) {
                Q5.t.b(obj);
                if (C1541b1.this.getContext() != null && C1541b1.this.u3() != null) {
                    C3791p.a aVar = C3791p.f37286s;
                    Context requireContext = C1541b1.this.requireContext();
                    AbstractC3292y.h(requireContext, "requireContext(...)");
                    C3791p a9 = aVar.a(requireContext);
                    a9.a();
                    q6.w h02 = C1541b1.this.z3().h0();
                    C2043h u32 = C1541b1.this.u3();
                    AbstractC3292y.f(u32);
                    h02.setValue(a9.v0(u32.h()));
                    a9.i();
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e0) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$f, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1547f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f13459a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f13460b;

        /* renamed from: d, reason: collision with root package name */
        int f13462d;

        C1547f(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13460b = obj;
            this.f13462d |= Integer.MIN_VALUE;
            return C1541b1.this.D2(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$f0 */
    /* loaded from: classes5.dex */
    public static final class f0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13463a;

        f0(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f0(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13463a == 0) {
                Q5.t.b(obj);
                if (C1541b1.this.z3().h0().getValue() != null) {
                    C1541b1 c1541b1 = C1541b1.this;
                    String string = c1541b1.getString(com.uptodown.R.string.app_detail_remove_wishlist_title);
                    AbstractC3292y.h(string, "getString(...)");
                    c1541b1.E5(com.uptodown.R.id.action_wishlist, string);
                    C1541b1.this.v3().f12493H.f12781c.setBackground(ContextCompat.getDrawable(C1541b1.this.requireContext(), com.uptodown.R.drawable.ripple_wishlist_added));
                    C1541b1.this.v3().f12493H.f12781c.setImageResource(com.uptodown.R.drawable.vector_heart_white);
                } else {
                    C1541b1 c1541b12 = C1541b1.this;
                    String string2 = c1541b12.getString(com.uptodown.R.string.app_detail_add_wishlist_title);
                    AbstractC3292y.h(string2, "getString(...)");
                    c1541b12.E5(com.uptodown.R.id.action_wishlist, string2);
                    C1541b1.this.v3().f12493H.f12781c.setBackground(ContextCompat.getDrawable(C1541b1.this.requireContext(), com.uptodown.R.drawable.ripple_wishlist));
                    C1541b1.this.v3().f12493H.f12781c.setImageResource(com.uptodown.R.drawable.vector_heart_blue);
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((f0) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$g, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1548g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13465a;

        C1548g(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C1548g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13465a == 0) {
                Q5.t.b(obj);
                if (C1541b1.this.getContext() != null && C1541b1.this.u3() != null) {
                    C2043h u32 = C1541b1.this.u3();
                    AbstractC3292y.f(u32);
                    if (u32.v0() != null) {
                        C3791p.a aVar = C3791p.f37286s;
                        Context requireContext = C1541b1.this.requireContext();
                        AbstractC3292y.h(requireContext, "requireContext(...)");
                        C3791p a9 = aVar.a(requireContext);
                        a9.a();
                        C2043h u33 = C1541b1.this.u3();
                        AbstractC3292y.f(u33);
                        String v02 = u33.v0();
                        AbstractC3292y.f(v02);
                        C2041f S8 = a9.S(v02);
                        if (S8 != null) {
                            C1541b1.this.z3().Q().setValue(S8);
                        }
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((C1548g) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$h, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1549h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13467a;

        C1549h(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C1549h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13467a == 0) {
                Q5.t.b(obj);
                if (C1541b1.this.z3().Q().getValue() != null) {
                    Object value = C1541b1.this.z3().Q().getValue();
                    AbstractC3292y.f(value);
                    if (((C2041f) value).i() == 0) {
                        C1541b1 c1541b1 = C1541b1.this;
                        String string = c1541b1.getString(com.uptodown.R.string.not_offer_updates);
                        AbstractC3292y.h(string, "getString(...)");
                        c1541b1.E5(com.uptodown.R.id.action_exclude, string);
                        return Q5.I.f8786a;
                    }
                }
                C1541b1 c1541b12 = C1541b1.this;
                String string2 = c1541b12.getString(com.uptodown.R.string.offer_updates_again);
                AbstractC3292y.h(string2, "getString(...)");
                c1541b12.E5(com.uptodown.R.id.action_exclude, string2);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((C1549h) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$i, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1550i extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13469a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f13471c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.T f13472d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O f13473e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O f13474f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O f13475g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1550i(Context context, kotlin.jvm.internal.T t8, kotlin.jvm.internal.O o8, kotlin.jvm.internal.O o9, kotlin.jvm.internal.O o10, U5.d dVar) {
            super(2, dVar);
            this.f13471c = context;
            this.f13472d = t8;
            this.f13473e = o8;
            this.f13474f = o9;
            this.f13475g = o10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C1550i(this.f13471c, this.f13472d, this.f13473e, this.f13474f, this.f13475g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C2041f c2041f;
            Object obj2;
            V5.b.e();
            if (this.f13469a == 0) {
                Q5.t.b(obj);
                C1541b1.this.v3().f12493H.f12782d.setVisibility(8);
                C1541b1.this.v3().f12489D.f13084h.setVisibility(8);
                if (C1541b1.this.u3() != null) {
                    C2043h u32 = C1541b1.this.u3();
                    AbstractC3292y.f(u32);
                    if (u32.b()) {
                        C1541b1.this.v3().f12531j0.setVisibility(0);
                    } else {
                        C1541b1.this.v3().f12531j0.setVisibility(8);
                    }
                    C2043h u33 = C1541b1.this.u3();
                    AbstractC3292y.f(u33);
                    if (u33.k1()) {
                        C1541b1.this.W5();
                    } else {
                        C2043h u34 = C1541b1.this.u3();
                        AbstractC3292y.f(u34);
                        if (u34.h1()) {
                            C1541b1.this.I5(this.f13471c);
                        } else {
                            String str = null;
                            if (C1541b1.this.z3().Q().getValue() != null) {
                                if (C1541b1.this.z3().f0().getValue() != null) {
                                    Object value = C1541b1.this.z3().f0().getValue();
                                    AbstractC3292y.f(value);
                                    if (((c5.Q) value).h() != 1) {
                                        Object value2 = C1541b1.this.z3().Q().getValue();
                                        AbstractC3292y.f(value2);
                                        if (((C2041f) value2).i() != 1) {
                                            if (this.f13472d.f34573a == null) {
                                                if (!((Boolean) C1541b1.this.z3().z().getValue()).booleanValue()) {
                                                    C1541b1.this.d6(this.f13471c);
                                                } else {
                                                    Object value3 = C1541b1.this.z3().f0().getValue();
                                                    AbstractC3292y.f(value3);
                                                    if (!((c5.Q) value3).a()) {
                                                        ArrayList G8 = UptodownApp.f29249C.G();
                                                        if (G8 != null) {
                                                            C1541b1 c1541b1 = C1541b1.this;
                                                            Iterator it = G8.iterator();
                                                            while (true) {
                                                                if (it.hasNext()) {
                                                                    obj2 = it.next();
                                                                    String Q8 = ((C2041f) obj2).Q();
                                                                    Object value4 = c1541b1.z3().f0().getValue();
                                                                    AbstractC3292y.f(value4);
                                                                    if (AbstractC3292y.d(Q8, ((c5.Q) value4).s())) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    obj2 = null;
                                                                    break;
                                                                }
                                                            }
                                                            c2041f = (C2041f) obj2;
                                                        } else {
                                                            c2041f = null;
                                                        }
                                                        if (c2041f == null) {
                                                            Object value5 = C1541b1.this.z3().f0().getValue();
                                                            AbstractC3292y.f(value5);
                                                            if (!((c5.Q) value5).a()) {
                                                                Object value6 = C1541b1.this.z3().f0().getValue();
                                                                AbstractC3292y.f(value6);
                                                                if (((c5.Q) value6).u() != 100) {
                                                                    C1541b1.this.c6(this.f13471c);
                                                                }
                                                            }
                                                            P4.a h8 = J4.j.f4395g.h();
                                                            if (h8 != null) {
                                                                str = h8.b();
                                                            }
                                                            Object value7 = C1541b1.this.z3().f0().getValue();
                                                            AbstractC3292y.f(value7);
                                                            if (!l6.n.s(str, ((c5.Q) value7).s(), true)) {
                                                                C1541b1.this.a6(this.f13471c);
                                                            } else {
                                                                C1541b1 c1541b12 = C1541b1.this;
                                                                String string = c1541b12.getString(com.uptodown.R.string.updating);
                                                                AbstractC3292y.h(string, "getString(...)");
                                                                c1541b12.N5(string);
                                                            }
                                                        }
                                                    }
                                                    C1541b1 c1541b13 = C1541b1.this;
                                                    c1541b13.Y5((c5.Q) c1541b13.z3().f0().getValue());
                                                }
                                            } else if (!((Boolean) C1541b1.this.z3().z().getValue()).booleanValue()) {
                                                C1541b1.this.d6(this.f13471c);
                                            } else if (!this.f13473e.f34569a) {
                                                C1541b1.this.I5(this.f13471c);
                                            } else if (this.f13474f.f34569a) {
                                                C1541b1.this.a6(this.f13471c);
                                            } else if (C1541b1.this.i4() || this.f13475g.f34569a) {
                                                C1541b1.this.K5((c5.r) this.f13472d.f34573a);
                                            } else {
                                                C1541b1.this.c6(this.f13471c);
                                            }
                                        }
                                    }
                                }
                                Object value8 = C1541b1.this.z3().Q().getValue();
                                AbstractC3292y.f(value8);
                                if (!((C2041f) value8).n0()) {
                                    C1541b1.this.S5(this.f13471c);
                                } else {
                                    C1541b1.this.v3().f12493H.getRoot().setVisibility(4);
                                    C1541b1.this.v3().f12489D.getRoot().setVisibility(8);
                                }
                            } else if (!C1541b1.this.B3()) {
                                C1541b1.this.Q5(this.f13471c, (c5.r) this.f13472d.f34573a);
                            } else {
                                if (!((Boolean) C1541b1.this.z3().N().getValue()).booleanValue()) {
                                    C2043h u35 = C1541b1.this.u3();
                                    AbstractC3292y.f(u35);
                                    if (!u35.f1()) {
                                        C2043h u36 = C1541b1.this.u3();
                                        AbstractC3292y.f(u36);
                                        if (u36.i1()) {
                                            C1541b1.this.V5();
                                        } else {
                                            C2043h u37 = C1541b1.this.u3();
                                            AbstractC3292y.f(u37);
                                            if (!u37.d1() && SettingsPreferences.f30529b.R(this.f13471c)) {
                                                C1541b1.this.m4();
                                                C1541b1 c1541b14 = C1541b1.this;
                                                String string2 = c1541b14.getString(com.uptodown.R.string.app_detail_not_compatible);
                                                AbstractC3292y.h(string2, "getString(...)");
                                                c1541b14.G5(string2);
                                            } else {
                                                C2043h u38 = C1541b1.this.u3();
                                                AbstractC3292y.f(u38);
                                                if (u38.v0() != null) {
                                                    P4.a h9 = J4.j.f4395g.h();
                                                    if (h9 != null) {
                                                        str = h9.b();
                                                    }
                                                    C2043h u39 = C1541b1.this.u3();
                                                    AbstractC3292y.f(u39);
                                                    if (l6.n.s(str, u39.v0(), true)) {
                                                        C1541b1 c1541b15 = C1541b1.this;
                                                        String string3 = c1541b15.getString(com.uptodown.R.string.installing);
                                                        AbstractC3292y.h(string3, "getString(...)");
                                                        c1541b15.N5(string3);
                                                    } else {
                                                        if (C1541b1.this.z3().f0().getValue() != null) {
                                                            C3791p a9 = C3791p.f37286s.a(this.f13471c);
                                                            a9.a();
                                                            Object value9 = C1541b1.this.z3().f0().getValue();
                                                            AbstractC3292y.f(value9);
                                                            a9.M(((c5.Q) value9).s());
                                                            a9.i();
                                                        }
                                                        if (this.f13472d.f34573a == null) {
                                                            C1541b1.this.I5(this.f13471c);
                                                        } else if (!((Boolean) C1541b1.this.z3().z().getValue()).booleanValue()) {
                                                            if ((C1541b1.this.i4() || this.f13475g.f34569a) && this.f13473e.f34569a) {
                                                                C1541b1.this.K5((c5.r) this.f13472d.f34573a);
                                                            } else {
                                                                C1541b1.this.I5(this.f13471c);
                                                            }
                                                        } else if (this.f13474f.f34569a) {
                                                            C1541b1.this.O5(this.f13471c);
                                                        } else if (C1541b1.this.i4() || this.f13475g.f34569a) {
                                                            C1541b1.this.K5((c5.r) this.f13472d.f34573a);
                                                        } else {
                                                            C1541b1.this.X5(this.f13471c);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C1541b1 c1541b16 = C1541b1.this;
                                String string4 = c1541b16.getString(com.uptodown.R.string.app_detail_not_available);
                                AbstractC3292y.h(string4, "getString(...)");
                                c1541b16.G5(string4);
                            }
                        }
                    }
                    C1541b1.this.z3().L().setValue(kotlin.coroutines.jvm.internal.b.a(true));
                    if (C1541b1.this.z3().Q().getValue() != null) {
                        C1541b1.this.o6(com.uptodown.R.id.action_app_details_settings);
                        C1541b1.this.o6(com.uptodown.R.id.action_exclude);
                    } else {
                        C1541b1.this.C3(com.uptodown.R.id.action_app_details_settings);
                        C1541b1.this.C3(com.uptodown.R.id.action_exclude);
                    }
                    C2043h u310 = C1541b1.this.u3();
                    AbstractC3292y.f(u310);
                    if (u310.h1()) {
                        C2043h u311 = C1541b1.this.u3();
                        AbstractC3292y.f(u311);
                        String X8 = u311.X();
                        if (X8 != null && X8.length() != 0) {
                            TextView textView = C1541b1.this.v3().f12538n.f12193c;
                            C1541b1 c1541b17 = C1541b1.this;
                            textView.setTypeface(J4.j.f4395g.v());
                            C2043h u312 = c1541b17.u3();
                            AbstractC3292y.f(u312);
                            textView.setText(u312.X());
                            C1541b1.this.v3().f12538n.getRoot().setVisibility(0);
                        }
                    }
                    C1541b1.this.v3().f12538n.getRoot().setVisibility(8);
                    C1541b1.this.v3().f12538n.f12193c.setVisibility(8);
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((C1550i) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$j, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1551j extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13476a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Z4.b1$j$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1541b1 f13478a;

            a(C1541b1 c1541b1) {
                this.f13478a = c1541b1;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (!(abstractC3768A instanceof AbstractC3768A.a)) {
                    if (abstractC3768A instanceof AbstractC3768A.c) {
                        AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                        String a9 = ((C1591j1.f) cVar.a()).a();
                        if (a9 != null && a9.length() != 0) {
                            this.f13478a.v3().f12493H.f12784f.setText(((C1591j1.f) cVar.a()).a());
                            this.f13478a.v3().f12489D.f13092p.setText(((C1591j1.f) cVar.a()).a());
                        }
                        if (((C1591j1.f) cVar.a()).b()) {
                            C1541b1 c1541b1 = this.f13478a;
                            TextView tvStatusDownload = c1541b1.v3().f12493H.f12784f;
                            AbstractC3292y.h(tvStatusDownload, "tvStatusDownload");
                            c1541b1.y2(tvStatusDownload);
                            C1541b1 c1541b12 = this.f13478a;
                            RelativeLayout rlStatusPreRegister = c1541b12.v3().f12489D.f13085i;
                            AbstractC3292y.h(rlStatusPreRegister, "rlStatusPreRegister");
                            c1541b12.y2(rlStatusPreRegister);
                            this.f13478a.v3().f12489D.f13080d.setVisibility(8);
                            if (this.f13478a.getContext() != null) {
                                this.f13478a.v3().f12493H.f12784f.setBackground(ContextCompat.getDrawable(this.f13478a.requireContext(), com.uptodown.R.drawable.ripple_open_button));
                                this.f13478a.v3().f12493H.f12784f.setTextColor(ContextCompat.getColorStateList(this.f13478a.requireContext(), com.uptodown.R.color.selector_wizard_accept_button_text));
                                this.f13478a.v3().f12489D.f13085i.setBackground(ContextCompat.getDrawable(this.f13478a.requireContext(), com.uptodown.R.drawable.ripple_open_button));
                                this.f13478a.v3().f12489D.f13092p.setTextColor(ContextCompat.getColorStateList(this.f13478a.requireContext(), com.uptodown.R.color.selector_wizard_accept_button_text));
                            }
                        } else {
                            C1541b1 c1541b13 = this.f13478a;
                            TextView tvStatusDownload2 = c1541b13.v3().f12493H.f12784f;
                            AbstractC3292y.h(tvStatusDownload2, "tvStatusDownload");
                            c1541b13.l2(tvStatusDownload2);
                            C1541b1 c1541b14 = this.f13478a;
                            RelativeLayout rlStatusPreRegister2 = c1541b14.v3().f12489D.f13085i;
                            AbstractC3292y.h(rlStatusPreRegister2, "rlStatusPreRegister");
                            c1541b14.l2(rlStatusPreRegister2);
                            this.f13478a.v3().f12489D.f13080d.setVisibility(0);
                            if (this.f13478a.getContext() != null) {
                                this.f13478a.v3().f12493H.f12784f.setBackground(ContextCompat.getDrawable(this.f13478a.requireContext(), com.uptodown.R.drawable.ripple_blue_primary_button));
                                this.f13478a.v3().f12493H.f12784f.setTextColor(ContextCompat.getColor(this.f13478a.requireContext(), com.uptodown.R.color.white));
                                this.f13478a.v3().f12489D.f13085i.setBackground(ContextCompat.getDrawable(this.f13478a.requireContext(), com.uptodown.R.drawable.ripple_blue_primary_button));
                                this.f13478a.v3().f12489D.f13092p.setTextColor(ContextCompat.getColor(this.f13478a.requireContext(), com.uptodown.R.color.white));
                            }
                        }
                    } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                        throw new Q5.p();
                    }
                }
                return Q5.I.f8786a;
            }
        }

        C1551j(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C1551j(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13476a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L T8 = C1541b1.this.z3().T();
                a aVar = new a(C1541b1.this);
                this.f13476a = 1;
                if (T8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((C1551j) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.b1$k, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1552k implements b5.J {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c5.r f13480b;

        C1552k(c5.r rVar) {
            this.f13480b = rVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q5.I e(C1541b1 c1541b1, c5.r rVar) {
            c1541b1.o3(rVar);
            return Q5.I.f8786a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q5.I f(C1541b1 c1541b1) {
            FragmentActivity requireActivity = c1541b1.requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            c1541b1.x2(requireActivity);
            return Q5.I.f8786a;
        }

        @Override // b5.J
        public void a() {
            C1541b1.this.o3(this.f13480b);
        }

        @Override // b5.J
        public void b(c5.J reportVT) {
            AbstractC3292y.i(reportVT, "reportVT");
            if (C1541b1.this.getActivity() != null && (C1541b1.this.getActivity() instanceof AbstractActivityC2691a) && !C1541b1.this.requireActivity().isFinishing() && C1541b1.this.u3() != null) {
                C2043h u32 = C1541b1.this.u3();
                AbstractC3292y.f(u32);
                u32.q1(reportVT);
                if (reportVT.h() <= 0) {
                    C1541b1.this.o3(this.f13480b);
                    return;
                }
                FragmentActivity activity = C1541b1.this.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                C2043h u33 = C1541b1.this.u3();
                AbstractC3292y.f(u33);
                final C1541b1 c1541b1 = C1541b1.this;
                final c5.r rVar = this.f13480b;
                Function0 function0 = new Function0() { // from class: Z4.c1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Q5.I e8;
                        e8 = C1541b1.C1552k.e(C1541b1.this, rVar);
                        return e8;
                    }
                };
                final C1541b1 c1541b12 = C1541b1.this;
                ((AbstractActivityC2691a) activity).g2(u33, function0, new Function0() { // from class: Z4.d1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Q5.I f8;
                        f8 = C1541b1.C1552k.f(C1541b1.this);
                        return f8;
                    }
                });
            }
        }
    }

    /* renamed from: Z4.b1$l, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1553l implements InterfaceC1986j {
        C1553l() {
        }

        @Override // b5.InterfaceC1986j
        public void a(int i8) {
            C1541b1.this.z3().a0().setValue(Integer.valueOf(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$m, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1554m extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13482a;

        C1554m(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C1554m(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13482a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                C1541b1 c1541b1 = C1541b1.this;
                this.f13482a = 1;
                if (c1541b1.D2(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((C1554m) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.b1$n, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1555n implements b5.r {
        C1555n() {
        }

        @Override // b5.r
        public void b(int i8) {
            if (i8 == 404) {
                C1541b1.this.z3().N().setValue(Boolean.TRUE);
            }
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            C1541b1.this.B5(appInfo);
            C1541b1.this.Z4();
            C1541b1.this.o2();
            C1541b1.this.n2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$o, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1556o extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13485a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Z4.b1$o$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1541b1 f13487a;

            a(C1541b1 c1541b1) {
                this.f13487a = c1541b1;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(ArrayList arrayList, U5.d dVar) {
                this.f13487a.b5(arrayList);
                return Q5.I.f8786a;
            }
        }

        C1556o(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C1556o(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13485a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L V8 = C1541b1.this.z3().V();
                a aVar = new a(C1541b1.this);
                this.f13485a = 1;
                if (V8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((C1556o) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.b1$p, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1557p extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13488a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c5.M f13490c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Z4.b1$p$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1541b1 f13491a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c5.M f13492b;

            a(C1541b1 c1541b1, c5.M m8) {
                this.f13491a = c1541b1;
                this.f13492b = m8;
            }

            public final Object b(int i8, U5.d dVar) {
                int i9 = -1;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Iterator it = ((Iterable) this.f13491a.z3().Y().getValue()).iterator();
                        int i10 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            int i11 = i10 + 1;
                            if (((c5.M) it.next()).l() == this.f13492b.l()) {
                                i9 = i10;
                                break;
                            }
                            i10 = i11;
                        }
                        if (i9 > 0 && i9 < ((ArrayList) this.f13491a.z3().Y().getValue()).size()) {
                            this.f13491a.z6(this.f13492b, i9);
                        }
                    }
                } else {
                    Snackbar.make(this.f13491a.v3().f12554v, com.uptodown.R.string.error_generico, -1).show();
                }
                return Q5.I.f8786a;
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1557p(c5.M m8, U5.d dVar) {
            super(2, dVar);
            this.f13490c = m8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C1557p(this.f13490c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13488a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L W8 = C1541b1.this.z3().W();
                a aVar = new a(C1541b1.this, this.f13490c);
                this.f13488a = 1;
                if (W8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((C1557p) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.b1$q, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1558q implements BannerAdListener {
        C1558q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(C1541b1 c1541b1, View view) {
            c1541b1.p6();
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void closeFullScreen(MBridgeIds ids) {
            AbstractC3292y.i(ids, "ids");
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onClick(MBridgeIds ids) {
            AbstractC3292y.i(ids, "ids");
            Bundle bundle = new Bundle();
            bundle.putString("type", "clicked");
            new C3795t(C1541b1.this.getContext()).e("mintegral_banner", bundle);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onCloseBanner(MBridgeIds ids) {
            AbstractC3292y.i(ids, "ids");
            Bundle bundle = new Bundle();
            bundle.putString("type", "closed");
            new C3795t(C1541b1.this.getContext()).e("mintegral_banner", bundle);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLeaveApp(MBridgeIds ids) {
            AbstractC3292y.i(ids, "ids");
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLoadFailed(MBridgeIds ids, String errorMsg) {
            AbstractC3292y.i(ids, "ids");
            AbstractC3292y.i(errorMsg, "errorMsg");
            C1541b1.this.v3().f12560z.setVisibility(8);
            C1541b1.this.v3().f12537m0.setVisibility(8);
            C1541b1.this.v3().f12560z.release();
            Bundle bundle = new Bundle();
            bundle.putString("type", "failed");
            new C3795t(C1541b1.this.getContext()).e("mintegral_banner", bundle);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLoadSuccessed(MBridgeIds ids) {
            AbstractC3292y.i(ids, "ids");
            C1541b1.this.v3().f12537m0.setTypeface(J4.j.f4395g.v());
            C1541b1.this.v3().f12537m0.setVisibility(0);
            TextView textView = C1541b1.this.v3().f12537m0;
            final C1541b1 c1541b1 = C1541b1.this;
            textView.setOnClickListener(new View.OnClickListener() { // from class: Z4.e1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.C1558q.b(C1541b1.this, view);
                }
            });
            Bundle bundle = new Bundle();
            bundle.putString("type", "loaded");
            new C3795t(C1541b1.this.getContext()).e("mintegral_banner", bundle);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLogImpression(MBridgeIds ids) {
            AbstractC3292y.i(ids, "ids");
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void showFullScreen(MBridgeIds ids) {
            AbstractC3292y.i(ids, "ids");
        }
    }

    /* renamed from: Z4.b1$r, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1559r implements m2.b {
        C1559r() {
        }

        @Override // m2.b
        public void a(Exception e8) {
            AbstractC3292y.i(e8, "e");
        }

        @Override // m2.b
        public void b() {
            ImageView imageView = C1541b1.this.f13383e;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (!((Boolean) C1541b1.this.z3().G().getValue()).booleanValue()) {
                CollapsingToolbarLayout collapsingToolbarLayout = C1541b1.this.v3().f12520e;
                C2043h u32 = C1541b1.this.u3();
                AbstractC3292y.f(u32);
                collapsingToolbarLayout.setTitle(u32.q0());
                C1541b1.this.v3().f12514b.setExpanded(false, false);
            }
            if (C1541b1.this.u3() != null) {
                C2043h u33 = C1541b1.this.u3();
                AbstractC3292y.f(u33);
                if (u33.c0() != null) {
                    C1541b1.this.t3();
                    FragmentActivity activity = C1541b1.this.getActivity();
                    if (activity != null) {
                        C1541b1.this.x6(activity);
                    }
                }
            }
        }
    }

    /* renamed from: Z4.b1$s, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    static final class C1560s extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13495a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Z4.b1$s$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1541b1 f13497a;

            a(C1541b1 c1541b1) {
                this.f13497a = c1541b1;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (!(abstractC3768A instanceof AbstractC3768A.a)) {
                    if (abstractC3768A instanceof AbstractC3768A.c) {
                        AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                        this.f13497a.V4(((C1591j1.a) cVar.a()).b());
                        this.f13497a.N4(((C1591j1.a) cVar.a()).a());
                    } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                        throw new Q5.p();
                    }
                }
                return Q5.I.f8786a;
            }
        }

        C1560s(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C1560s(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13495a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L M8 = C1541b1.this.z3().M();
                a aVar = new a(C1541b1.this);
                this.f13495a = 1;
                if (M8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((C1560s) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.b1$t, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    static final class C1561t extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13498a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Z4.b1$t$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1541b1 f13500a;

            a(C1541b1 c1541b1) {
                this.f13500a = c1541b1;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (!(abstractC3768A instanceof AbstractC3768A.a)) {
                    if (abstractC3768A instanceof AbstractC3768A.c) {
                        AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                        this.f13500a.r5(((C1591j1.b) cVar.a()).a(), ((C1591j1.b) cVar.a()).b());
                    } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                        throw new Q5.p();
                    }
                }
                return Q5.I.f8786a;
            }
        }

        C1561t(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C1561t(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13498a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L F8 = C1541b1.this.z3().F();
                a aVar = new a(C1541b1.this);
                this.f13498a = 1;
                if (F8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((C1561t) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.b1$u, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    static final class C1562u extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13501a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Z4.b1$u$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1541b1 f13503a;

            a(C1541b1 c1541b1) {
                this.f13503a = c1541b1;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(ArrayList arrayList, U5.d dVar) {
                this.f13503a.s5(arrayList, false);
                return Q5.I.f8786a;
            }
        }

        C1562u(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C1562u(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13501a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L d02 = C1541b1.this.z3().d0();
                a aVar = new a(C1541b1.this);
                this.f13501a = 1;
                if (d02.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((C1562u) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.b1$v, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    static final class C1563v extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13504a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Z4.b1$v$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1541b1 f13506a;

            a(C1541b1 c1541b1) {
                this.f13506a = c1541b1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void f(C1541b1 c1541b1, C2040e c2040e, View view) {
                c1541b1.r4(c2040e);
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object emit(final C2040e c2040e, U5.d dVar) {
                ArrayList a9 = c2040e.a();
                if (a9 != null && !a9.isEmpty()) {
                    this.f13506a.v3().f12532k.setVisibility(0);
                    this.f13506a.v3().f12545q0.setText(this.f13506a.getString(com.uptodown.R.string.best_alternatives));
                    LinearLayout linearLayout = this.f13506a.v3().f12558x;
                    final C1541b1 c1541b1 = this.f13506a;
                    linearLayout.setOnClickListener(new View.OnClickListener() { // from class: Z4.f1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C1541b1.C1563v.a.f(C1541b1.this, c2040e, view);
                        }
                    });
                    ArrayList a10 = c2040e.a();
                    AbstractC3292y.f(a10);
                    if (a10.size() <= 20) {
                        this.f13506a.s5(c2040e.a(), true);
                    } else {
                        ArrayList a11 = c2040e.a();
                        AbstractC3292y.f(a11);
                        this.f13506a.s5(new ArrayList(a11.subList(0, 20)), true);
                    }
                }
                return Q5.I.f8786a;
            }
        }

        C1563v(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C1563v(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13504a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L y8 = C1541b1.this.z3().y();
                a aVar = new a(C1541b1.this);
                this.f13504a = 1;
                if (y8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((C1563v) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.b1$w, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    static final class C1564w extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13507a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Z4.b1$w$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1541b1 f13509a;

            a(C1541b1 c1541b1) {
                this.f13509a = c1541b1;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (!(abstractC3768A instanceof AbstractC3768A.a)) {
                    if (abstractC3768A instanceof AbstractC3768A.c) {
                        AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                        ArrayList b9 = ((C1591j1.c) cVar.a()).b();
                        if (b9 != null && !b9.isEmpty()) {
                            this.f13509a.t5(((C1591j1.c) cVar.a()).b());
                        } else {
                            ArrayList a9 = ((C1591j1.c) cVar.a()).a();
                            if (a9 != null && !a9.isEmpty()) {
                                this.f13509a.W4(((C1591j1.c) cVar.a()).a());
                            }
                        }
                    } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                        throw new Q5.p();
                    }
                }
                return Q5.I.f8786a;
            }
        }

        C1564w(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C1564w(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13507a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L H8 = C1541b1.this.z3().H();
                a aVar = new a(C1541b1.this);
                this.f13507a = 1;
                if (H8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((C1564w) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.b1$x, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    static final class C1565x extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13510a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Z4.b1$x$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1541b1 f13512a;

            a(C1541b1 c1541b1) {
                this.f13512a = c1541b1;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (!(abstractC3768A instanceof AbstractC3768A.a)) {
                    if (abstractC3768A instanceof AbstractC3768A.c) {
                        AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                        this.f13512a.q5(((C1591j1.d) cVar.a()).b());
                        this.f13512a.a5(((C1591j1.d) cVar.a()).a());
                    } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                        throw new Q5.p();
                    }
                }
                return Q5.I.f8786a;
            }
        }

        C1565x(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C1565x(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13510a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L J8 = C1541b1.this.z3().J();
                a aVar = new a(C1541b1.this);
                this.f13510a = 1;
                if (J8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((C1565x) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.b1$y, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    static final class C1566y extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13513a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Z4.b1$y$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1541b1 f13515a;

            a(C1541b1 c1541b1) {
                this.f13515a = c1541b1;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (!(abstractC3768A instanceof AbstractC3768A.a)) {
                    if (abstractC3768A instanceof AbstractC3768A.c) {
                        AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                        if (((C1591j1.e) cVar.a()).a()) {
                            if (((C1591j1.e) cVar.a()).b()) {
                                this.f13515a.V5();
                                this.f13515a.a3();
                            } else {
                                this.f13515a.V5();
                            }
                        }
                    } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                        throw new Q5.p();
                    }
                }
                return Q5.I.f8786a;
            }
        }

        C1566y(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C1566y(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13513a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L S8 = C1541b1.this.z3().S();
                a aVar = new a(C1541b1.this);
                this.f13513a = 1;
                if (S8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((C1566y) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.b1$z, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1567z implements b5.J {
        C1567z() {
        }

        @Override // b5.J
        public void a() {
            if (C1541b1.this.getActivity() != null && !C1541b1.this.requireActivity().isFinishing() && C1541b1.this.u3() != null) {
                FragmentActivity activity = C1541b1.this.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                C2043h u32 = C1541b1.this.u3();
                AbstractC3292y.f(u32);
                ((AbstractActivityC2691a) activity).F2(u32.M0());
            }
        }

        @Override // b5.J
        public void b(c5.J reportVT) {
            AbstractC3292y.i(reportVT, "reportVT");
            if (C1541b1.this.getActivity() != null && !C1541b1.this.requireActivity().isFinishing() && C1541b1.this.u3() != null) {
                Intent intent = new Intent(C1541b1.this.requireActivity(), (Class<?>) VirusTotalReport.class);
                intent.putExtra("appInfo", C1541b1.this.u3());
                intent.putExtra("appReportVT", reportVT);
                C1541b1 c1541b1 = C1541b1.this;
                UptodownApp.a aVar = UptodownApp.f29249C;
                FragmentActivity requireActivity = c1541b1.requireActivity();
                AbstractC3292y.h(requireActivity, "requireActivity(...)");
                c1541b1.startActivity(intent, aVar.a(requireActivity));
            }
        }
    }

    public C1541b1() {
        InterfaceC1416k a9 = Q5.l.a(Q5.o.f8805c, new T(new S(this)));
        this.f13381c = FragmentViewModelLazyKt.createViewModelLazy(this, kotlin.jvm.internal.U.b(C1591j1.class), new U(a9), new V(null, a9), new W(this, a9));
        this.f13389k = new ArrayList();
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: Z4.m
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C1541b1.o4(C1541b1.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f13390l = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: Z4.n
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C1541b1.C6(C1541b1.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult2, "registerForActivityResult(...)");
        this.f13391m = registerForActivityResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A2(C1541b1 c1541b1, View view) {
        FragmentActivity activity = c1541b1.getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
    }

    private final View A3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        this.f13380b = C1504c.c(layoutInflater, viewGroup, false);
        CoordinatorLayout root = v3().getRoot();
        AbstractC3292y.h(root, "getRoot(...)");
        C2043h c2043h = this.f13379a;
        String str2 = null;
        if (c2043h != null) {
            str = c2043h.h0();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            C2043h c2043h2 = this.f13379a;
            if (c2043h2 != null) {
                str2 = c2043h2.Z();
            }
            if (str2 == null || str2.length() == 0) {
                v3().f12495J.f12576b.setVisibility(8);
                View inflate = layoutInflater.inflate(com.uptodown.R.layout.app_detail_feature_image, viewGroup, false);
                AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.ImageView");
                this.f13383e = (ImageView) inflate;
                v3().f12495J.f12576b.removeAllViews();
                v3().f12495J.f12576b.addView(this.f13383e);
                return root;
            }
        }
        v3().f12495J.f12576b.setVisibility(0);
        View inflate2 = layoutInflater.inflate(com.uptodown.R.layout.app_detail_feature_image, viewGroup, false);
        AbstractC3292y.g(inflate2, "null cannot be cast to non-null type android.widget.ImageView");
        this.f13383e = (ImageView) inflate2;
        v3().f12495J.f12576b.removeAllViews();
        v3().f12495J.f12576b.addView(this.f13383e);
        return root;
    }

    private final void A4(final View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: Z4.S0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1541b1.B4(C1541b1.this, view, view2);
            }
        });
    }

    private final void A5() {
        if (((CharSequence) z3().Z().getValue()).length() > 0) {
            z5((String) z3().Z().getValue());
            FragmentActivity activity = getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
            if (o22 != null) {
                o22.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B2(C1541b1 c1541b1, View view) {
        C1591j1 z32 = c1541b1.z3();
        Context requireContext = c1541b1.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        C2043h c2043h = c1541b1.f13379a;
        AbstractC3292y.f(c2043h);
        z32.t(requireContext, c2043h.h());
        FragmentActivity activity = c1541b1.getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B3() {
        FragmentActivity activity = getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        if (((AbstractActivityC2691a) activity).R() && getContext() != null) {
            C3794s c3794s = new C3794s();
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            File f8 = c3794s.f(requireContext);
            C3776a c3776a = new C3776a();
            C3794s c3794s2 = new C3794s();
            Context requireContext2 = requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            return c3776a.c(c3794s2.k(requireContext2, f8), y3());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B4(final C1541b1 c1541b1, View view, View view2) {
        if (UptodownApp.f29249C.a0()) {
            FragmentActivity activity = c1541b1.getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
            if (o22 != null) {
                o22.dismiss();
            }
            if (view.getContext() != null) {
                C1530u c8 = C1530u.c(c1541b1.getLayoutInflater());
                AbstractC3292y.h(c8, "inflate(...)");
                TextView textView = c8.f13008f;
                j.a aVar = J4.j.f4395g;
                textView.setTypeface(aVar.u());
                c8.f13006d.setTypeface(aVar.v());
                c8.f13007e.setTypeface(aVar.u());
                c8.f13007e.setOnClickListener(new View.OnClickListener() { // from class: Z4.A0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C1541b1.C4(C1541b1.this, view3);
                    }
                });
                c8.f13004b.setOnClickListener(new View.OnClickListener() { // from class: Z4.B0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C1541b1.D4(C1541b1.this, view3);
                    }
                });
                AlertDialog.Builder builder = new AlertDialog.Builder(c1541b1.requireContext());
                builder.setView(c8.getRoot());
                builder.setCancelable(true);
                c1541b1.j6(builder);
            }
        }
    }

    private final void B6(int i8, Context context) {
        String str;
        c5.T e8 = c5.T.f15689k.e(context);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str != null) {
            String id = e8.getId();
            AbstractC3292y.f(id);
            if (id.length() > 0) {
                z3().X().setValue(Integer.valueOf(i8));
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                if (i8 != 5) {
                                    v3().f12559y.f12109b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                                    v3().f12559y.f12110c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                                    v3().f12559y.f12111d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                                    v3().f12559y.f12112e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                                    v3().f12559y.f12113f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                                    return;
                                }
                                v3().f12559y.f12109b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                                v3().f12559y.f12110c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                                v3().f12559y.f12111d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                                v3().f12559y.f12112e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                                v3().f12559y.f12113f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                                return;
                            }
                            v3().f12559y.f12109b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                            v3().f12559y.f12110c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                            v3().f12559y.f12111d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                            v3().f12559y.f12112e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                            v3().f12559y.f12113f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                            return;
                        }
                        v3().f12559y.f12109b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                        v3().f12559y.f12110c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                        v3().f12559y.f12111d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                        v3().f12559y.f12112e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                        v3().f12559y.f12113f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                        return;
                    }
                    v3().f12559y.f12109b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                    v3().f12559y.f12110c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                    v3().f12559y.f12111d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                    v3().f12559y.f12112e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                    v3().f12559y.f12113f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                    return;
                }
                v3().f12559y.f12109b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                v3().f12559y.f12110c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                v3().f12559y.f12111d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                v3().f12559y.f12112e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                v3().f12559y.f12113f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C2(C1541b1 c1541b1, View view) {
        FragmentActivity activity = c1541b1.getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C3(int i8) {
        Menu menu = this.f13386h;
        if (menu != null) {
            AbstractC3292y.f(menu);
            menu.findItem(i8).setVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C4(C1541b1 c1541b1, View view) {
        c1541b1.z4();
        FragmentActivity activity = c1541b1.getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
    }

    private final void C5(TextView textView, int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setOutlineSpotShadowColor(ContextCompat.getColor(requireContext(), i8));
            textView.setOutlineAmbientShadowColor(ContextCompat.getColor(requireContext(), i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C6(C1541b1 c1541b1, ActivityResult activityResult) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(c1541b1), C3445b0.b(), null, new a0(new b0(), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D2(U5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof Z4.C1541b1.C1547f
            if (r0 == 0) goto L13
            r0 = r7
            Z4.b1$f r0 = (Z4.C1541b1.C1547f) r0
            int r1 = r0.f13462d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13462d = r1
            goto L18
        L13:
            Z4.b1$f r0 = new Z4.b1$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13460b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f13462d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r7)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f13459a
            Z4.b1 r2 = (Z4.C1541b1) r2
            Q5.t.b(r7)
            goto L55
        L3d:
            Q5.t.b(r7)
            n6.I r7 = n6.C3445b0.b()
            Z4.b1$g r2 = new Z4.b1$g
            r2.<init>(r5)
            r0.f13459a = r6
            r0.f13462d = r4
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            n6.J0 r7 = n6.C3445b0.c()
            Z4.b1$h r4 = new Z4.b1$h
            r4.<init>(r5)
            r0.f13459a = r5
            r0.f13462d = r3
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.C1541b1.D2(U5.d):java.lang.Object");
    }

    private final void D3() {
        t6();
        C3969c c3969c = C3969c.f39130a;
        ProgressBar pbProgressAppDetail = v3().f12496K.f12604h;
        AbstractC3292y.h(pbProgressAppDetail, "pbProgressAppDetail");
        ImageView ivLogoAppDetail = v3().f12496K.f12598b;
        AbstractC3292y.h(ivLogoAppDetail, "ivLogoAppDetail");
        c3969c.e(pbProgressAppDetail, ivLogoAppDetail);
        z3().P().setValue(-1);
        v3().f12493H.f12783e.setVisibility(8);
        v3().f12493H.f12784f.setVisibility(8);
        v3().f12493H.f12782d.setVisibility(0);
        v3().f12496K.f12604h.setIndeterminate(true);
        v3().f12496K.f12617u.setText(getString(com.uptodown.R.string.status_download_update_pending));
        v3().f12489D.f13087k.setVisibility(8);
        v3().f12489D.f13078b.setVisibility(4);
        v3().f12489D.f13090n.setText("");
        v3().f12489D.f13081e.setIndeterminate(true);
        v3().f12489D.f13088l.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D4(C1541b1 c1541b1, View view) {
        FragmentActivity activity = c1541b1.getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
    }

    private final void D5() {
        if (v3().f12522f.getChildCount() == 0) {
            C1520k c8 = C1520k.c(getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            c8.f12819b.setTypeface(J4.j.f4395g.v());
            v3().f12522f.addView(c8.getRoot());
        }
        E2();
    }

    private final void D6() {
        try {
            C2043h c2043h = this.f13379a;
            if (c2043h != null) {
                AbstractC3292y.f(c2043h);
                if (c2043h.C0() > 0 && ((Number) z3().g0().getValue()).intValue() > 0) {
                    int dimension = (int) getResources().getDimension(com.uptodown.R.dimen.margin_m);
                    int intValue = ((Number) z3().g0().getValue()).intValue();
                    C2043h c2043h2 = this.f13379a;
                    AbstractC3292y.f(c2043h2);
                    int H02 = intValue * c2043h2.H0();
                    C2043h c2043h3 = this.f13379a;
                    AbstractC3292y.f(c2043h3);
                    v3().f12556w.f12798h.setLayoutParams(new RelativeLayout.LayoutParams(H02 / c2043h3.C0(), dimension));
                    int intValue2 = ((Number) z3().g0().getValue()).intValue();
                    C2043h c2043h4 = this.f13379a;
                    AbstractC3292y.f(c2043h4);
                    int G02 = intValue2 * c2043h4.G0();
                    C2043h c2043h5 = this.f13379a;
                    AbstractC3292y.f(c2043h5);
                    v3().f12556w.f12797g.setLayoutParams(new RelativeLayout.LayoutParams(G02 / c2043h5.C0(), dimension));
                    int intValue3 = ((Number) z3().g0().getValue()).intValue();
                    C2043h c2043h6 = this.f13379a;
                    AbstractC3292y.f(c2043h6);
                    int F02 = intValue3 * c2043h6.F0();
                    C2043h c2043h7 = this.f13379a;
                    AbstractC3292y.f(c2043h7);
                    v3().f12556w.f12796f.setLayoutParams(new RelativeLayout.LayoutParams(F02 / c2043h7.C0(), dimension));
                    int intValue4 = ((Number) z3().g0().getValue()).intValue();
                    C2043h c2043h8 = this.f13379a;
                    AbstractC3292y.f(c2043h8);
                    int E02 = intValue4 * c2043h8.E0();
                    C2043h c2043h9 = this.f13379a;
                    AbstractC3292y.f(c2043h9);
                    v3().f12556w.f12795e.setLayoutParams(new RelativeLayout.LayoutParams(E02 / c2043h9.C0(), dimension));
                    int intValue5 = ((Number) z3().g0().getValue()).intValue();
                    C2043h c2043h10 = this.f13379a;
                    AbstractC3292y.f(c2043h10);
                    int D02 = intValue5 * c2043h10.D0();
                    C2043h c2043h11 = this.f13379a;
                    AbstractC3292y.f(c2043h11);
                    v3().f12556w.f12794d.setLayoutParams(new RelativeLayout.LayoutParams(D02 / c2043h11.C0(), dimension));
                }
            }
            v3().f12556w.getRoot().setVisibility(8);
            v3().f12556w.f12807q.setVisibility(8);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    private final void E2() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: Z4.U0
            @Override // java.lang.Runnable
            public final void run() {
                C1541b1.F2(C1541b1.this);
            }
        }, 5000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x062d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void E3(final android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 1744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.C1541b1.E3(android.content.Context):void");
    }

    private final void E4() {
        if (!requireActivity().isFinishing() && this.f13379a != null) {
            Intent intent = new Intent(requireActivity(), (Class<?>) MoreInfo.class);
            intent.putExtra("appInfo", this.f13379a);
            UptodownApp.a aVar = UptodownApp.f29249C;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            startActivity(intent, aVar.a(requireActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E5(int i8, String str) {
        Menu menu = this.f13386h;
        if (menu != null) {
            AbstractC3292y.f(menu);
            menu.findItem(i8).setTitle(str);
        }
    }

    private final void E6() {
        S4.v vVar = new S4.v();
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        ArrayList c8 = vVar.c(requireContext);
        this.f13385g = c8;
        AbstractC3292y.f(c8);
        if (c8.size() > 0) {
            C3794s c3794s = new C3794s();
            Context requireContext2 = requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            File f8 = c3794s.f(requireContext2);
            String absolutePath = f8.getAbsolutePath();
            AbstractC3292y.h(absolutePath, "getAbsolutePath(...)");
            P4.f fVar = new P4.f(absolutePath);
            fVar.f(false);
            fVar.e(f8.getFreeSpace());
            ArrayList arrayList = this.f13385g;
            AbstractC3292y.f(arrayList);
            arrayList.add(0, fVar);
            z3().a0().setValue(0);
            U2();
            return;
        }
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        Context requireContext3 = requireContext();
        AbstractC3292y.h(requireContext3, "requireContext(...)");
        aVar.T0(requireContext3, false);
        M5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F2(C1541b1 c1541b1) {
        if (c1541b1.getContext() != null) {
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            Context requireContext = c1541b1.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            if (!aVar.R(requireContext)) {
                c1541b1.D5();
            } else if (c1541b1.v3().f12522f.getChildCount() > 0) {
                c1541b1.v3().f12522f.removeAllViews();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(C1541b1 c1541b1, View view) {
        if (c1541b1.getActivity() != null) {
            if (c1541b1.getActivity() instanceof MainActivity) {
                FragmentActivity activity = c1541b1.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).Z6();
            } else if (c1541b1.getActivity() instanceof AppDetailActivity) {
                FragmentActivity activity2 = c1541b1.getActivity();
                AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
                ((AppDetailActivity) activity2).finish();
            }
        }
    }

    private final void F4() {
        C2043h c2043h;
        if (!requireActivity().isFinishing() && (c2043h = this.f13379a) != null) {
            AbstractC3292y.f(c2043h);
            if (c2043h.g1()) {
                Intent intent = new Intent(requireActivity(), (Class<?>) OldVersionsActivity.class);
                intent.putExtra("appInfo", this.f13379a);
                UptodownApp.a aVar = UptodownApp.f29249C;
                FragmentActivity requireActivity = requireActivity();
                AbstractC3292y.h(requireActivity, "requireActivity(...)");
                startActivity(intent, aVar.a(requireActivity));
            }
        }
    }

    private final void F5(int i8) {
        Menu menu = this.f13386h;
        AbstractC3292y.f(menu);
        Drawable icon = menu.findItem(com.uptodown.R.id.action_search).getIcon();
        if (icon != null) {
            DrawableCompat.setTint(icon, i8);
        }
    }

    private final void F6() {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c0(null), 3, null);
    }

    private final void G2(int i8, String str, long j8) {
        if (getContext() != null && i8 >= 0) {
            C2031A.a aVar = C2031A.f15554f;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            C2031A b9 = aVar.b(requireContext);
            if (b9 != null && b9.c() == -1 && AbstractC3292y.d(b9.d(), str) && b9.b() == j8) {
                Context requireContext2 = requireContext();
                AbstractC3292y.h(requireContext2, "requireContext(...)");
                b9.l(requireContext2, i8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(C1541b1 c1541b1, View view) {
        c1541b1.J4();
    }

    private final void G4() {
        if (!requireActivity().isFinishing() && this.f13379a != null) {
            Intent intent = new Intent(requireActivity(), (Class<?>) OrganizationActivity.class);
            C2043h c2043h = this.f13379a;
            AbstractC3292y.f(c2043h);
            intent.putExtra("organizationID", c2043h.u0());
            C2043h c2043h2 = this.f13379a;
            AbstractC3292y.f(c2043h2);
            intent.putExtra("organizationName", c2043h2.l());
            UptodownApp.a aVar = UptodownApp.f29249C;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            startActivity(intent, aVar.a(requireActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G5(String str) {
        s6();
        z3().P().setValue(-1);
        v3().f12496K.f12601e.setVisibility(0);
        v3().f12496K.f12599c.setVisibility(8);
        v3().f12493H.f12784f.setText(str);
        v3().f12493H.f12784f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.shape_bg_download_button_deactivated));
        v3().f12493H.f12784f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.main_light_grey));
        v3().f12493H.f12784f.setOnClickListener(null);
        v3().f12489D.f13091o.setText(str);
        v3().f12489D.f13082f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.shape_bg_download_button_deactivated));
        v3().f12489D.f13091o.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.main_light_grey));
        v3().f12489D.f13082f.setOnClickListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G6(U5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof Z4.C1541b1.d0
            if (r0 == 0) goto L13
            r0 = r7
            Z4.b1$d0 r0 = (Z4.C1541b1.d0) r0
            int r1 = r0.f13453d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13453d = r1
            goto L18
        L13:
            Z4.b1$d0 r0 = new Z4.b1$d0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13451b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f13453d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r7)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f13450a
            Z4.b1 r2 = (Z4.C1541b1) r2
            Q5.t.b(r7)
            goto L55
        L3d:
            Q5.t.b(r7)
            n6.I r7 = n6.C3445b0.b()
            Z4.b1$e0 r2 = new Z4.b1$e0
            r2.<init>(r5)
            r0.f13450a = r6
            r0.f13453d = r4
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            n6.J0 r7 = n6.C3445b0.c()
            Z4.b1$f0 r4 = new Z4.b1$f0
            r4.<init>(r5)
            r0.f13450a = r5
            r0.f13453d = r3
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.C1541b1.G6(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c5, code lost:            if (r9.exists() == false) goto L17;     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object H2(android.content.Context r17, U5.d r18) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.C1541b1.H2(android.content.Context, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(C1541b1 c1541b1, Context context, View view) {
        c1541b1.c3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H4(long j8) {
        if (getActivity() != null && (getActivity() instanceof MainActivity)) {
            FragmentActivity activity = getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).C2(j8);
        } else if (getActivity() != null && (getActivity() instanceof AppDetailActivity)) {
            FragmentActivity activity2 = getActivity();
            AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).C2(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H5(c5.r rVar) {
        t6();
        z3().P().setValue(-1);
        v3().f12496K.f12604h.setIndeterminate(true);
        v3().f12496K.f12601e.setVisibility(8);
        v3().f12496K.f12599c.setVisibility(0);
        v3().f12496K.f12617u.setText(getString(com.uptodown.R.string.status_download_update_pending));
        v3().f12489D.f13081e.setIndeterminate(true);
        v3().f12489D.f13089m.setText(new S4.g().c(rVar.u()));
        v3().f12489D.f13088l.setText(rVar.Z() + getString(com.uptodown.R.string.percent));
        TextView textView = v3().f12489D.f13090n;
        kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
        String format = String.format("/%s", Arrays.copyOf(new Object[]{new S4.g().c(rVar.a0())}, 1));
        AbstractC3292y.h(format, "format(...)");
        textView.setText(format);
    }

    private final void I2() {
        FragmentActivity activity = getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        if (((AbstractActivityC2691a) activity).R()) {
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            if (!aVar.d0(requireContext)) {
                E6();
                return;
            } else {
                M5();
                return;
            }
        }
        FragmentActivity activity2 = getActivity();
        AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        ((AbstractActivityC2691a) activity2).l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I3(C1541b1 c1541b1, Context context, View view) {
        c1541b1.c3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I4(C2043h c2043h) {
        if (getActivity() != null && (getActivity() instanceof MainActivity)) {
            FragmentActivity activity = getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).C2(c2043h.h());
        } else if (getActivity() != null && (getActivity() instanceof AppDetailActivity)) {
            FragmentActivity activity2 = getActivity();
            AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).C2(c2043h.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I5(Context context) {
        String str;
        String string;
        s6();
        C3969c c3969c = C3969c.f39130a;
        ProgressBar pbProgressAppDetail = v3().f12496K.f12604h;
        AbstractC3292y.h(pbProgressAppDetail, "pbProgressAppDetail");
        ImageView ivLogoAppDetail = v3().f12496K.f12598b;
        AbstractC3292y.h(ivLogoAppDetail, "ivLogoAppDetail");
        c3969c.c(pbProgressAppDetail, ivLogoAppDetail);
        z3().P().setValue(-1);
        if (new L4.a(context).m()) {
            string = context.getString(com.uptodown.R.string.option_button_install);
        } else {
            C2043h c2043h = this.f13379a;
            if (c2043h != null) {
                str = c2043h.y0();
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                C2043h c2043h2 = this.f13379a;
                AbstractC3292y.f(c2043h2);
                string = c2043h2.W0("try");
                if (this.f13379a == null || string == null || string.length() == 0) {
                    string = context.getString(com.uptodown.R.string.updates_button_download_app);
                }
            } else {
                string = context.getString(com.uptodown.R.string.updates_button_download_app);
            }
        }
        v3().f12493H.f12784f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.ripple_blue_primary_button));
        v3().f12493H.f12784f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.white));
        TextView tvStatusDownload = v3().f12493H.f12784f;
        AbstractC3292y.h(tvStatusDownload, "tvStatusDownload");
        C5(tvStatusDownload, com.uptodown.R.color.blue_primary);
        v3().f12493H.f12783e.setVisibility(8);
        v3().f12496K.f12601e.setVisibility(0);
        v3().f12496K.f12599c.setVisibility(8);
        v3().f12493H.f12784f.setOnClickListener(new View.OnClickListener() { // from class: Z4.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.J5(C1541b1.this, view);
            }
        });
        v3().f12493H.f12784f.setVisibility(0);
        v3().f12493H.f12784f.setText(string);
        v3().f12489D.f13078b.setVisibility(4);
        v3().f12489D.f13091o.setText(string);
        v3().f12489D.f13082f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        C3(com.uptodown.R.id.action_uninstall);
        C3(com.uptodown.R.id.action_app_installed_details);
    }

    private final void J2() {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new C1551j(null), 2, null);
        C1591j1 z32 = z3();
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        C2043h c2043h = this.f13379a;
        AbstractC3292y.f(c2043h);
        z32.u(requireContext, c2043h.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J3(C1541b1 c1541b1, Context context, View view) {
        c1541b1.c3(context);
    }

    private final void J4() {
        if (!requireActivity().isFinishing() && this.f13379a != null) {
            Intent intent = new Intent(requireActivity(), (Class<?>) ReviewsActivity.class);
            intent.putExtra("appInfo", this.f13379a);
            intent.putExtra("myReview", (Parcelable) z3().R().getValue());
            UptodownApp.a aVar = UptodownApp.f29249C;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            startActivity(intent, aVar.a(requireActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J5(C1541b1 c1541b1, View view) {
        Context requireContext = c1541b1.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        c1541b1.l3(requireContext);
    }

    private final void K2(final c5.r rVar) {
        if (getActivity() != null && !requireActivity().isFinishing() && this.f13379a != null) {
            T.b bVar = c5.T.f15689k;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            c5.T e8 = bVar.e(requireActivity);
            if (e8 != null && e8.y()) {
                C2043h c2043h = this.f13379a;
                AbstractC3292y.f(c2043h);
                if (c2043h.J0() == null) {
                    FragmentActivity requireActivity2 = requireActivity();
                    AbstractC3292y.h(requireActivity2, "requireActivity(...)");
                    C2043h c2043h2 = this.f13379a;
                    AbstractC3292y.f(c2043h2);
                    String valueOf = String.valueOf(c2043h2.d0());
                    C2043h c2043h3 = this.f13379a;
                    AbstractC3292y.f(c2043h3);
                    new X4.m(requireActivity2, valueOf, c2043h3.M0(), new C1552k(rVar), LifecycleOwnerKt.getLifecycleScope(this));
                    return;
                }
                C2043h c2043h4 = this.f13379a;
                AbstractC3292y.f(c2043h4);
                c5.J J02 = c2043h4.J0();
                AbstractC3292y.f(J02);
                if (J02.h() > 0) {
                    FragmentActivity activity = getActivity();
                    AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    C2043h c2043h5 = this.f13379a;
                    AbstractC3292y.f(c2043h5);
                    ((AbstractActivityC2691a) activity).g2(c2043h5, new Function0() { // from class: Z4.R0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Q5.I L22;
                            L22 = C1541b1.L2(C1541b1.this, rVar);
                            return L22;
                        }
                    }, new Function0() { // from class: Z4.T0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Q5.I M22;
                            M22 = C1541b1.M2(C1541b1.this);
                            return M22;
                        }
                    });
                } else {
                    o3(rVar);
                }
                Q5.I i8 = Q5.I.f8786a;
                return;
            }
            o3(rVar);
            Q5.I i9 = Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K3(C1541b1 c1541b1, View view) {
        c1541b1.E4();
    }

    private final void K4() {
        Intent intent = new Intent(getContext(), (Class<?>) SearchActivity.class);
        intent.setFlags(603979776);
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K5(c5.r rVar) {
        c5.r rVar2;
        Long l8;
        t6();
        C3969c c3969c = C3969c.f39130a;
        ProgressBar pbProgressAppDetail = v3().f12496K.f12604h;
        AbstractC3292y.h(pbProgressAppDetail, "pbProgressAppDetail");
        ImageView ivLogoAppDetail = v3().f12496K.f12598b;
        AbstractC3292y.h(ivLogoAppDetail, "ivLogoAppDetail");
        c3969c.e(pbProgressAppDetail, ivLogoAppDetail);
        v3().f12493H.f12784f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.ripple_open_button));
        v3().f12493H.f12784f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.blue_primary));
        TextView tvStatusDownload = v3().f12493H.f12784f;
        AbstractC3292y.h(tvStatusDownload, "tvStatusDownload");
        C5(tvStatusDownload, com.uptodown.R.color.blue_primary);
        v3().f12493H.f12784f.setText(getString(com.uptodown.R.string.option_button_cancel));
        v3().f12489D.f13079c.setVisibility(8);
        z3().P().setValue(5);
        if (rVar == null && getContext() != null && this.f13379a != null) {
            C3791p.a aVar = C3791p.f37286s;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            C3791p a9 = aVar.a(requireContext);
            a9.a();
            C2043h c2043h = this.f13379a;
            AbstractC3292y.f(c2043h);
            rVar2 = a9.Z(String.valueOf(c2043h.d0()));
            a9.i();
        } else {
            rVar2 = rVar;
        }
        if (rVar2 != null) {
            v3().f12493H.f12784f.setOnClickListener(new View.OnClickListener() { // from class: Z4.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.L5(C1541b1.this, view);
                }
            });
            v3().f12489D.f13078b.setVisibility(0);
            if (!i4()) {
                v3().f12496K.f12617u.setText(getString(com.uptodown.R.string.status_download_update_pending));
                v3().f12496K.f12604h.setIndeterminate(true);
                v3().f12489D.f13081e.setIndeterminate(true);
                v3().f12489D.f13086j.setVisibility(0);
                v3().f12489D.f13088l.setVisibility(8);
            } else {
                String valueOf = String.valueOf(rVar2.Z());
                if (isAdded() && getContext() != null) {
                    valueOf = valueOf + requireContext().getString(com.uptodown.R.string.percent);
                }
                C3784i c3784i = new C3784i();
                C2043h c2043h2 = this.f13379a;
                AbstractC3292y.f(c2043h2);
                if (c3784i.t(c2043h2.v0(), getContext())) {
                    v3().f12493H.f12783e.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.white));
                } else {
                    v3().f12493H.f12783e.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.main_light_grey));
                }
                v3().f12496K.f12604h.setIndeterminate(false);
                v3().f12496K.f12604h.setProgress(rVar2.Z());
                if (rVar != null) {
                    l8 = Long.valueOf(rVar.a0());
                } else {
                    l8 = null;
                }
                if (l8 != null) {
                    v3().f12496K.f12617u.setText(getString(com.uptodown.R.string.percent_of_total_size, Integer.valueOf(rVar2.Z()), new S4.g().c(rVar.a0())));
                }
                v3().f12489D.f13081e.setIndeterminate(false);
                v3().f12489D.f13088l.setVisibility(0);
                v3().f12489D.f13086j.setVisibility(8);
                v3().f12489D.f13088l.setText(valueOf);
                v3().f12489D.f13089m.setText(new S4.g().c(rVar2.u()));
                v3().f12489D.f13081e.setProgress(rVar2.Z());
            }
            TextView textView = v3().f12489D.f13090n;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
            String format = String.format("/%s", Arrays.copyOf(new Object[]{new S4.g().c(rVar2.a0())}, 1));
            AbstractC3292y.h(format, "format(...)");
            textView.setText(format);
            return;
        }
        v3().f12496K.f12604h.setIndeterminate(true);
        v3().f12489D.f13081e.setIndeterminate(true);
        x3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I L2(C1541b1 c1541b1, c5.r rVar) {
        c1541b1.o3(rVar);
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L3(C1541b1 c1541b1, View view) {
        c1541b1.F4();
    }

    private final void L4(String str) {
        Intent intent = new Intent(requireContext(), (Class<?>) UserCommentsActivity.class);
        intent.putExtra("userID", str);
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L5(C1541b1 c1541b1, View view) {
        c1541b1.N2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I M2(C1541b1 c1541b1) {
        FragmentActivity requireActivity = c1541b1.requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        c1541b1.x2(requireActivity);
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M3(C1541b1 c1541b1, View view) {
        c1541b1.w4();
    }

    private final void M4() {
        if (getActivity() != null && !requireActivity().isFinishing() && this.f13379a != null) {
            FragmentActivity requireActivity = requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            C2043h c2043h = this.f13379a;
            AbstractC3292y.f(c2043h);
            String valueOf = String.valueOf(c2043h.d0());
            C2043h c2043h2 = this.f13379a;
            AbstractC3292y.f(c2043h2);
            new X4.m(requireActivity, valueOf, c2043h2.M0(), new C1567z(), LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    private final void M5() {
        z3().P().setValue(5);
        long y32 = y3();
        C3794s c3794s = new C3794s();
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        File f8 = c3794s.f(requireContext);
        if (!f8.exists() && !f8.mkdirs()) {
            String string = getString(com.uptodown.R.string.error_cant_create_dir);
            AbstractC3292y.h(string, "getString(...)");
            W2(string);
            return;
        }
        if (!B3()) {
            Context requireContext2 = requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            Q5(requireContext2, null);
            Y2();
            return;
        }
        C3788m c3788m = new C3788m();
        AlertDialog alertDialog = this.f13384f;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        this.f13384f = c3788m.g(alertDialog, requireActivity);
        v3().f12496K.f12617u.setVisibility(0);
        v3().f12496K.f12617u.setText(getString(com.uptodown.R.string.status_download_update_pending));
        v3().f12496K.f12604h.setProgress(0);
        v3().f12489D.f13086j.setVisibility(0);
        v3().f12489D.f13088l.setVisibility(8);
        v3().f12489D.f13089m.setText(com.uptodown.R.string.zero_mb);
        TextView textView = v3().f12489D.f13090n;
        kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
        String format = String.format("/%s", Arrays.copyOf(new Object[]{new S4.g().c(y32)}, 1));
        AbstractC3292y.h(format, "format(...)");
        textView.setText(format);
        v3().f12489D.f13081e.setProgress(0);
        if (this.f13384f == null) {
            K5(null);
            v5();
        }
    }

    private final void N2() {
        FragmentActivity activity = getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
        if (i4()) {
            DownloadWorker.f31208c.f();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        C1527q c8 = C1527q.c(getLayoutInflater());
        AbstractC3292y.h(c8, "inflate(...)");
        if (getActivity() != null && !requireActivity().isFinishing()) {
            TextView textView = c8.f12902d;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.v());
            c8.f12902d.setText(requireContext().getString(com.uptodown.R.string.download_cancel_confimation_title));
            c8.f12901c.setTypeface(aVar.v());
            c8.f12901c.setText(requireContext().getString(com.uptodown.R.string.dialog_confirmation_verify_negative));
            c8.f12901c.setOnClickListener(new View.OnClickListener() { // from class: Z4.P0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.O2(C1541b1.this, view);
                }
            });
            c8.f12903e.setTypeface(aVar.v());
            c8.f12903e.setText(requireContext().getString(com.uptodown.R.string.dialog_confirmation_verify_afirmative));
            c8.f12903e.setOnClickListener(new View.OnClickListener() { // from class: Z4.Q0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.P2(C1541b1.this, view);
                }
            });
        }
        builder.setView(c8.getRoot());
        builder.setCancelable(false);
        j6(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N3(C1541b1 c1541b1) {
        c1541b1.z3().g0().setValue(Integer.valueOf(c1541b1.v3().f12556w.f12799i.getMeasuredWidth()));
        if (((Boolean) c1541b1.z3().x().getValue()).booleanValue()) {
            c1541b1.D6();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N4(final C2039d c2039d) {
        if (c2039d != null) {
            v3().f12486A.getRoot().setVisibility(0);
            float dimension = getResources().getDimension(com.uptodown.R.dimen.border_radius_m);
            int parseColor = Color.parseColor(c2039d.f());
            int parseColor2 = Color.parseColor(c2039d.g());
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{parseColor, parseColor2});
            gradientDrawable.setCornerRadius(dimension);
            v3().f12486A.f12480d.setBackground(gradientDrawable);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension}, null, null));
            shapeDrawable.getPaint().setColor(parseColor2);
            v3().f12486A.f12481e.setBackground(shapeDrawable);
            com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
            C2043h c2043h = this.f13379a;
            AbstractC3292y.f(c2043h);
            h8.l(c2043h.k0()).i(v3().f12486A.f12478b);
            TextView textView = v3().f12486A.f12483g;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.u());
            v3().f12486A.f12483g.setTextColor(parseColor);
            v3().f12486A.f12483g.setText(c2039d.i());
            v3().f12486A.f12482f.setTypeface(aVar.v());
            v3().f12486A.f12482f.setText(c2039d.e());
            v3().f12486A.f12481e.setTypeface(aVar.u());
            v3().f12486A.f12481e.setText(c2039d.d());
            v3().f12486A.getRoot().setOnClickListener(new View.OnClickListener() { // from class: Z4.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.O4(C1541b1.this, c2039d, view);
                }
            });
            ImageView imageView = v3().f12486A.f12478b;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: Z4.r
                @Override // java.lang.Runnable
                public final void run() {
                    C1541b1.P4(C1541b1.this, c2039d);
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N5(String str) {
        D3();
        v3().f12496K.f12617u.setText(str);
        v3().f12489D.f13089m.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O2(C1541b1 c1541b1, View view) {
        DownloadWorker.f31208c.h();
        FragmentActivity activity = c1541b1.getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O3(C1541b1 c1541b1, Context context, View view) {
        c1541b1.z3().X().setValue(1);
        c1541b1.c3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O4(C1541b1 c1541b1, C2039d c2039d, View view) {
        Long l8;
        if (c1541b1.getContext() != null && c2039d.c() != null) {
            Context requireContext = c1541b1.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            C2043h c2043h = c1541b1.f13379a;
            if (c2043h != null) {
                l8 = Long.valueOf(c2043h.h());
            } else {
                l8 = null;
            }
            c2039d.a(requireContext, l8);
            if (c1541b1.getActivity() != null) {
                String c8 = c2039d.c();
                AbstractC3292y.f(c8);
                C3788m c3788m = new C3788m();
                FragmentActivity requireActivity = c1541b1.requireActivity();
                AbstractC3292y.h(requireActivity, "requireActivity(...)");
                C3788m.r(c3788m, requireActivity, c8, null, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O5(Context context) {
        s6();
        C3969c c3969c = C3969c.f39130a;
        ProgressBar pbProgressAppDetail = v3().f12496K.f12604h;
        AbstractC3292y.h(pbProgressAppDetail, "pbProgressAppDetail");
        ImageView ivLogoAppDetail = v3().f12496K.f12598b;
        AbstractC3292y.h(ivLogoAppDetail, "ivLogoAppDetail");
        c3969c.c(pbProgressAppDetail, ivLogoAppDetail);
        v3().f12496K.f12601e.setVisibility(0);
        v3().f12496K.f12599c.setVisibility(8);
        v3().f12493H.f12784f.setOnClickListener(new View.OnClickListener() { // from class: Z4.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.P5(C1541b1.this, view);
            }
        });
        z3().P().setValue(3);
        v3().f12493H.f12784f.setText(getString(com.uptodown.R.string.option_button_install));
        v3().f12493H.f12784f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_install_button));
        v3().f12493H.f12784f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.white));
        TextView tvStatusDownload = v3().f12493H.f12784f;
        AbstractC3292y.h(tvStatusDownload, "tvStatusDownload");
        C5(tvStatusDownload, com.uptodown.R.color.accent_green);
        v3().f12489D.f13091o.setText(getString(com.uptodown.R.string.option_button_install));
        v3().f12489D.f13082f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_install_button));
        C3(com.uptodown.R.id.action_app_installed_details);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(C1541b1 c1541b1, View view) {
        Context requireContext = c1541b1.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        c1541b1.x2(requireContext);
        FragmentActivity activity = c1541b1.getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(C1541b1 c1541b1, Context context, View view) {
        c1541b1.z3().X().setValue(2);
        c1541b1.c3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P4(C1541b1 c1541b1, C2039d c2039d) {
        Long l8;
        if (new C3788m().p(c1541b1.v3().f12486A.getRoot())) {
            Context requireContext = c1541b1.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            C2043h c2043h = c1541b1.f13379a;
            if (c2043h != null) {
                l8 = Long.valueOf(c2043h.h());
            } else {
                l8 = null;
            }
            c2039d.b(requireContext, l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P5(C1541b1 c1541b1, View view) {
        Context requireContext = c1541b1.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        c1541b1.l3(requireContext);
    }

    private final void Q2(final c5.r rVar, String str) {
        FragmentActivity activity = getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
        if (getContext() != null) {
            final C1527q c8 = C1527q.c(getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            TextView textView = c8.f12902d;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.v());
            c8.f12902d.setText(str);
            c8.f12900b.setVisibility(0);
            c8.f12900b.setTypeface(aVar.v());
            c8.f12900b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Z4.t0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                    C1541b1.R2(C1541b1.this, compoundButton, z8);
                }
            });
            c8.f12903e.setTypeface(aVar.u());
            c8.f12903e.setOnClickListener(new View.OnClickListener() { // from class: Z4.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.S2(C1541b1.this, rVar, view);
                }
            });
            c8.f12901c.setTypeface(aVar.u());
            c8.f12901c.setOnClickListener(new View.OnClickListener() { // from class: Z4.v0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.T2(C1527q.this, this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
            builder.setView(c8.getRoot());
            builder.setCancelable(false);
            j6(builder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q3(C1541b1 c1541b1, MenuItem item) {
        FragmentActivity activity;
        AbstractC3292y.i(item, "item");
        if (UptodownApp.f29249C.a0()) {
            if (item.getItemId() == com.uptodown.R.id.action_search) {
                c1541b1.K4();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_share) {
                c1541b1.e6();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_antivirus_report) {
                c1541b1.M4();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_uninstall) {
                C2043h c2043h = c1541b1.f13379a;
                if (c2043h != null) {
                    AbstractC3292y.f(c2043h);
                    if (c2043h.v0() != null && (activity = c1541b1.getActivity()) != null) {
                        J4.i iVar = new J4.i(activity);
                        C2043h c2043h2 = c1541b1.f13379a;
                        AbstractC3292y.f(c2043h2);
                        String v02 = c2043h2.v0();
                        AbstractC3292y.f(v02);
                        iVar.h(v02);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_wishlist) {
                c1541b1.k2();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_exclude) {
                c1541b1.j2();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_app_details_settings) {
                c1541b1.t4();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_app_installed_details) {
                c1541b1.u4();
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0715  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void Q4(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 1888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.C1541b1.Q4(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q5(Context context, c5.r rVar) {
        long j8;
        C3794s c3794s = new C3794s();
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        File f8 = c3794s.f(requireContext);
        C3794s c3794s2 = new C3794s();
        Context requireContext2 = requireContext();
        AbstractC3292y.h(requireContext2, "requireContext(...)");
        long k8 = c3794s2.k(requireContext2, f8);
        try {
            j8 = f8.getTotalSpace();
        } catch (SecurityException unused) {
            j8 = 0;
        }
        if (j8 > 0) {
            String c8 = new S4.g().c(((long) (y3() * 2.25d)) - k8);
            long j9 = ((j8 - k8) * 100) / j8;
            TextView textView = v3().f12557w0.f12177g;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.v());
            v3().f12557w0.f12174d.setProgress((int) j9);
            v3().f12557w0.f12178h.setTypeface(aVar.v());
            v3().f12557w0.f12178h.setText(context.getString(com.uptodown.R.string.no_storage_text, c8));
            v3().f12557w0.f12176f.setTypeface(aVar.u());
            v3().f12557w0.f12176f.setOnClickListener(new View.OnClickListener() { // from class: Z4.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.R5(C1541b1.this, view);
                }
            });
            v3().f12557w0.getRoot().setVisibility(0);
        }
        if (rVar != null && rVar.Z() == 100) {
            O5(context);
        } else {
            I5(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(C1541b1 c1541b1, CompoundButton compoundButton, boolean z8) {
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        Context requireContext = c1541b1.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        aVar.X0(requireContext, !z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3(C1541b1 c1541b1, Context context, View view) {
        c1541b1.z3().X().setValue(3);
        c1541b1.c3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R4(C1541b1 c1541b1, View view) {
        c1541b1.J4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R5(C1541b1 c1541b1, View view) {
        Intent intent = new Intent(c1541b1.requireActivity(), (Class<?>) FreeUpSpaceActivity.class);
        intent.putExtra("appInfo", c1541b1.f13379a);
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = c1541b1.requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        c1541b1.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(C1541b1 c1541b1, c5.r rVar, View view) {
        c1541b1.o3(rVar);
        FragmentActivity activity = c1541b1.getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S3(C1541b1 c1541b1, Context context, View view) {
        c1541b1.z3().X().setValue(4);
        c1541b1.c3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S4(C1541b1 c1541b1) {
        TextView tvWhatsNewContent = c1541b1.v3().f12500O.f12197d;
        AbstractC3292y.h(tvWhatsNewContent, "tvWhatsNewContent");
        if (!s5.u.a(tvWhatsNewContent) && c1541b1.v3().f12500O.f12197d.getMaxLines() <= 6) {
            c1541b1.v3().f12500O.f12195b.setVisibility(8);
            c1541b1.v3().f12500O.f12198e.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S5(Context context) {
        u6();
        C3969c c3969c = C3969c.f39130a;
        ProgressBar pbProgressAppDetail = v3().f12496K.f12604h;
        AbstractC3292y.h(pbProgressAppDetail, "pbProgressAppDetail");
        ImageView ivLogoAppDetail = v3().f12496K.f12598b;
        AbstractC3292y.h(ivLogoAppDetail, "ivLogoAppDetail");
        c3969c.c(pbProgressAppDetail, ivLogoAppDetail);
        z3().P().setValue(0);
        v3().f12493H.f12783e.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        v3().f12493H.f12783e.setTextColor(ContextCompat.getColor(context, com.uptodown.R.color.white));
        v3().f12493H.f12783e.setEnabled(true);
        C2043h c2043h = this.f13379a;
        AbstractC3292y.f(c2043h);
        C2046k p8 = c2043h.p();
        AbstractC3292y.f(p8);
        if (p8.u() == 1) {
            v3().f12493H.f12783e.setText(context.getString(com.uptodown.R.string.app_detail_play_button));
            v3().f12489D.f13087k.setText(context.getString(com.uptodown.R.string.app_detail_play_button));
        }
        o6(com.uptodown.R.id.action_uninstall);
        o6(com.uptodown.R.id.action_app_installed_details);
        C2043h c2043h2 = this.f13379a;
        if (c2043h2 != null) {
            AbstractC3292y.f(c2043h2);
            if (c2043h2.v0() != null) {
                String packageName = requireActivity().getPackageName();
                C2043h c2043h3 = this.f13379a;
                AbstractC3292y.f(c2043h3);
                if (l6.n.s(packageName, c2043h3.v0(), true)) {
                    v3().f12493H.f12783e.setVisibility(8);
                    v3().f12493H.f12780b.setVisibility(8);
                    v3().f12493H.f12781c.setVisibility(8);
                    v3().f12489D.f13087k.setVisibility(8);
                    C2043h c2043h4 = this.f13379a;
                    AbstractC3292y.f(c2043h4);
                    if (633 < c2043h4.m0()) {
                        if (((Boolean) z3().z().getValue()).booleanValue()) {
                            a6(context);
                            return;
                        }
                        q6.w f02 = z3().f0();
                        String packageName2 = requireActivity().getPackageName();
                        AbstractC3292y.h(packageName2, "getPackageName(...)");
                        f02.setValue(new c5.Q(packageName2));
                        d6(context);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(C1527q c1527q, C1541b1 c1541b1, View view) {
        if (c1527q.f12900b.isChecked()) {
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            Context requireContext = c1541b1.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            aVar.X0(requireContext, true);
        }
        Context requireContext2 = c1541b1.requireContext();
        AbstractC3292y.h(requireContext2, "requireContext(...)");
        c1541b1.I5(requireContext2);
        FragmentActivity activity = c1541b1.getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(C1541b1 c1541b1, Context context, View view) {
        c1541b1.z3().X().setValue(5);
        c1541b1.c3(context);
    }

    private final View T4(C2054t c2054t, LinearLayout.LayoutParams layoutParams) {
        C1535z c8 = C1535z.c(getLayoutInflater());
        AbstractC3292y.h(c8, "inflate(...)");
        c8.getRoot().setLayoutParams(layoutParams);
        TextView textView = c8.f13107c;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        c8.f13106b.setTypeface(aVar.v());
        c8.f13107c.setText(c2054t.b());
        c8.f13106b.setText(c2054t.a());
        c8.getRoot().setOnClickListener(new View.OnClickListener() { // from class: Z4.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.U4(view);
            }
        });
        LinearLayout root = c8.getRoot();
        AbstractC3292y.h(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T5(c5.r rVar) {
        K5(rVar);
        v3().f12493H.f12784f.setOnClickListener(new View.OnClickListener() { // from class: Z4.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.U5(C1541b1.this, view);
            }
        });
        v3().f12493H.f12784f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.ripple_blue_primary_button));
        TextView tvStatusDownload = v3().f12493H.f12784f;
        AbstractC3292y.h(tvStatusDownload, "tvStatusDownload");
        C5(tvStatusDownload, com.uptodown.R.color.blue_primary);
        v3().f12493H.f12784f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.white));
        v3().f12493H.f12784f.setVisibility(0);
        v3().f12493H.f12784f.setText(getString(com.uptodown.R.string.updates_button_resume));
        v3().f12489D.f13078b.setVisibility(8);
        v3().f12489D.f13079c.setVisibility(0);
    }

    private final void U2() {
        FragmentActivity activity = getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
        if (getActivity() != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
            C1526p c8 = C1526p.c(getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            FragmentActivity requireActivity = requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            ArrayList arrayList = this.f13385g;
            AbstractC3292y.f(arrayList);
            c8.f12887b.setAdapter(new C1224c(requireActivity, arrayList, ((Number) z3().a0().getValue()).intValue(), new C1553l()));
            c8.f12887b.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            c8.f12888c.setTypeface(J4.j.f4395g.u());
            c8.f12888c.setOnClickListener(new View.OnClickListener() { // from class: Z4.C0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.V2(C1541b1.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            j6(builder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U3(C1541b1 c1541b1, View view) {
        c1541b1.J4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U5(C1541b1 c1541b1, View view) {
        Object obj;
        DownloadApkWorker.a aVar = DownloadApkWorker.f31190k;
        C2043h c2043h = c1541b1.f13379a;
        AbstractC3292y.f(c2043h);
        long h8 = c2043h.h();
        C2043h c2043h2 = c1541b1.f13379a;
        AbstractC3292y.f(c2043h2);
        if (aVar.d(h8, c2043h2.m0())) {
            DownloadWorker.a aVar2 = DownloadWorker.f31208c;
            if (aVar2.c()) {
                aVar2.h();
                return;
            }
        }
        Iterator it = UptodownApp.f29249C.F().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String s8 = ((c5.Q) obj).s();
                C2043h c2043h3 = c1541b1.f13379a;
                AbstractC3292y.f(c2043h3);
                if (AbstractC3292y.d(s8, c2043h3.v0())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            DownloadWorker.a aVar3 = DownloadWorker.f31208c;
            if (aVar3.d()) {
                aVar3.i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V2(C1541b1 c1541b1, View view) {
        boolean z8;
        if (((Number) c1541b1.z3().a0().getValue()).intValue() >= 0 && c1541b1.f13385g != null) {
            int intValue = ((Number) c1541b1.z3().a0().getValue()).intValue();
            ArrayList arrayList = c1541b1.f13385g;
            AbstractC3292y.f(arrayList);
            if (intValue < arrayList.size()) {
                SettingsPreferences.a aVar = SettingsPreferences.f30529b;
                Context requireContext = c1541b1.requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                if (((Number) c1541b1.z3().a0().getValue()).intValue() > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                aVar.T0(requireContext, z8);
                FragmentActivity activity = c1541b1.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
                if (o22 != null) {
                    o22.dismiss();
                }
                c1541b1.M5();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V3(C1541b1 c1541b1, View view) {
        c1541b1.y4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V4(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int dimension = (int) getResources().getDimension(com.uptodown.R.dimen.margin_m);
            int dimension2 = (int) getResources().getDimension(com.uptodown.R.dimen.margin_l);
            v3().f12515b0.setVisibility(0);
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                if (i8 == AbstractC1435t.o(arrayList)) {
                    layoutParams.setMargins(0, dimension, 0, dimension2);
                } else {
                    layoutParams.setMargins(0, dimension, 0, dimension);
                }
                LinearLayout linearLayout = v3().f12542p;
                Object obj = arrayList.get(i8);
                AbstractC3292y.h(obj, "get(...)");
                linearLayout.addView(T4((C2054t) obj, layoutParams));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V5() {
        v6();
        T.b bVar = c5.T.f15689k;
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        if (bVar.e(requireContext) == null) {
            v3().f12493H.f12784f.setText(getString(com.uptodown.R.string.pre_registration_title));
            v3().f12489D.f13092p.setText(getString(com.uptodown.R.string.pre_registration_title));
            v3().f12489D.f13080d.setVisibility(0);
            TextView tvStatusDownload = v3().f12493H.f12784f;
            AbstractC3292y.h(tvStatusDownload, "tvStatusDownload");
            A4(tvStatusDownload);
            RelativeLayout rlStatusPreRegister = v3().f12489D.f13085i;
            AbstractC3292y.h(rlStatusPreRegister, "rlStatusPreRegister");
            A4(rlStatusPreRegister);
        } else {
            J2();
        }
        v3().f12496K.f12601e.setVisibility(0);
        v3().f12496K.f12599c.setVisibility(8);
        v3().f12496K.f12611o.setVisibility(8);
        v3().f12493H.f12780b.setVisibility(8);
        C3(com.uptodown.R.id.action_antivirus_report);
        C3(com.uptodown.R.id.action_uninstall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W2(String str) {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            FragmentActivity activity = getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
            if (o22 != null) {
                o22.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            C1527q c8 = C1527q.c(getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            TextView textView = c8.f12902d;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.v());
            c8.f12902d.setText(str);
            c8.f12901c.setVisibility(8);
            c8.f12903e.setTypeface(aVar.v());
            c8.f12903e.setOnClickListener(new View.OnClickListener() { // from class: Z4.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.X2(C1541b1.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(false);
            j6(builder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(C1541b1 c1541b1, View view) {
        if (UptodownApp.f29249C.a0()) {
            c1541b1.k2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W4(ArrayList arrayList) {
        LinearLayout llFloatingCategoriesAppDetail = v3().f12544q;
        AbstractC3292y.h(llFloatingCategoriesAppDetail, "llFloatingCategoriesAppDetail");
        if (llFloatingCategoriesAppDetail.getChildCount() == 0) {
            v3().f12517c0.setTypeface(J4.j.f4395g.u());
            if (getActivity() != null) {
                HorizontalScrollView horizontalScrollView = new HorizontalScrollView(requireContext());
                horizontalScrollView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                horizontalScrollView.setHorizontalScrollBarEnabled(false);
                LinearLayout linearLayout = new LinearLayout(requireContext());
                linearLayout.setOrientation(0);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                horizontalScrollView.addView(linearLayout);
                v3().f12544q.addView(horizontalScrollView);
                Iterator it = arrayList.iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    C2046k c2046k = (C2046k) next;
                    int dimension = (int) getResources().getDimension(com.uptodown.R.dimen.margin_m);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    if (AbstractC3292y.d(c2046k, AbstractC1435t.y0(arrayList))) {
                        layoutParams.setMargins(dimension, 0, dimension, 0);
                    } else {
                        layoutParams.setMargins(dimension, 0, 0, 0);
                    }
                    linearLayout.addView(X4(c2046k, layoutParams));
                }
            }
            v3().f12546r.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W5() {
        v3().f12496K.f12621y.setVisibility(8);
        v3().f12496K.f12600d.setVisibility(8);
        C2043h c2043h = this.f13379a;
        AbstractC3292y.f(c2043h);
        String I02 = c2043h.I0();
        if (I02 != null && I02.length() != 0) {
            C2043h c2043h2 = this.f13379a;
            AbstractC3292y.f(c2043h2);
            String I03 = c2043h2.I0();
            AbstractC3292y.f(I03);
            G5(I03);
        } else {
            String string = getString(com.uptodown.R.string.app_detail_not_available);
            AbstractC3292y.h(string, "getString(...)");
            G5(string);
        }
        v3().f12493H.f12780b.setVisibility(8);
        C3(com.uptodown.R.id.action_antivirus_report);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(C1541b1 c1541b1, View view) {
        if (c1541b1.getActivity() != null && !c1541b1.requireActivity().isFinishing()) {
            FragmentActivity activity = c1541b1.getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
            if (o22 != null) {
                o22.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X3(C1541b1 c1541b1, View view) {
        if (UptodownApp.f29249C.a0()) {
            c1541b1.M4();
        }
    }

    private final View X4(final C2046k c2046k, LinearLayout.LayoutParams layoutParams) {
        Y4.F c8 = Y4.F.c(getLayoutInflater());
        AbstractC3292y.h(c8, "inflate(...)");
        c8.getRoot().setLayoutParams(layoutParams);
        c8.getRoot().setTypeface(J4.j.f4395g.u());
        c8.getRoot().setText(String.valueOf(c2046k.h()));
        c8.getRoot().setOnClickListener(new View.OnClickListener() { // from class: Z4.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.Y4(C1541b1.this, c2046k, view);
            }
        });
        TextView root = c8.getRoot();
        AbstractC3292y.h(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X5(Context context) {
        s6();
        z3().P().setValue(4);
        v3().f12493H.f12784f.setText(getString(com.uptodown.R.string.updates_button_resume));
        v3().f12493H.f12784f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        v3().f12489D.f13091o.setText(getString(com.uptodown.R.string.updates_button_resume));
        v3().f12489D.f13082f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
    }

    private final void Y2() {
        C3794s c3794s = new C3794s();
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        File f8 = c3794s.f(requireContext);
        C3794s c3794s2 = new C3794s();
        Context requireContext2 = requireContext();
        AbstractC3292y.h(requireContext2, "requireContext(...)");
        long k8 = c3794s2.k(requireContext2, f8);
        long totalSpace = f8.getTotalSpace();
        String c8 = new S4.g().c((long) (y3() * 2.25d));
        long j8 = ((totalSpace - k8) * 100) / totalSpace;
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        Y4.G0 c9 = Y4.G0.c(getLayoutInflater());
        AbstractC3292y.h(c9, "inflate(...)");
        TextView textView = c9.f12188e;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        c9.f12185b.setProgress((int) j8);
        c9.f12189f.setTypeface(aVar.v());
        c9.f12189f.setText(getString(com.uptodown.R.string.no_storage_text, c8));
        c9.f12187d.setTypeface(aVar.u());
        c9.f12187d.setOnClickListener(new View.OnClickListener() { // from class: Z4.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.Z2(C1541b1.this, view);
            }
        });
        builder.setView(c9.getRoot());
        j6(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y4(C1541b1 c1541b1, C2046k c2046k, View view) {
        if (UptodownApp.f29249C.a0()) {
            c1541b1.v4(c2046k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y5(c5.Q q8) {
        boolean z8;
        boolean z9;
        t6();
        C3969c c3969c = C3969c.f39130a;
        ProgressBar pbProgressAppDetail = v3().f12496K.f12604h;
        AbstractC3292y.h(pbProgressAppDetail, "pbProgressAppDetail");
        ImageView ivLogoAppDetail = v3().f12496K.f12598b;
        AbstractC3292y.h(ivLogoAppDetail, "ivLogoAppDetail");
        c3969c.e(pbProgressAppDetail, ivLogoAppDetail);
        z3().P().setValue(5);
        if (q8 != null) {
            v3().f12496K.f12601e.setVisibility(8);
            v3().f12496K.f12599c.setVisibility(0);
            v3().f12493H.f12783e.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.white));
            v3().f12493H.f12784f.setOnClickListener(new View.OnClickListener() { // from class: Z4.O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.Z5(C1541b1.this, view);
                }
            });
            v3().f12493H.f12784f.setVisibility(0);
            v3().f12493H.f12784f.setText(getString(com.uptodown.R.string.option_button_cancel));
            ProgressBar progressBar = v3().f12496K.f12604h;
            if (q8.u() == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            progressBar.setIndeterminate(z8);
            v3().f12496K.f12604h.setProgress(q8.u());
            v3().f12496K.f12617u.setText(getString(com.uptodown.R.string.percent_of_total_size, Integer.valueOf(q8.u()), new S4.g().c(q8.v())));
            v3().f12489D.f13078b.setVisibility(0);
            ProgressBar progressBar2 = v3().f12489D.f13081e;
            if (q8.u() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            progressBar2.setIndeterminate(z9);
            v3().f12489D.f13089m.setText(new S4.g().c((q8.v() * q8.u()) / 100));
            v3().f12489D.f13081e.setProgress(q8.u());
            v3().f12489D.f13086j.setVisibility(8);
            v3().f12489D.f13088l.setVisibility(0);
            v3().f12489D.f13088l.setText(q8.u() + getString(com.uptodown.R.string.percent));
            TextView textView = v3().f12489D.f13090n;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
            String format = String.format("/%s", Arrays.copyOf(new Object[]{new S4.g().c(q8.v())}, 1));
            AbstractC3292y.h(format, "format(...)");
            textView.setText(format);
            return;
        }
        v3().f12496K.f12604h.setIndeterminate(true);
        v3().f12489D.f13081e.setIndeterminate(true);
        x3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z2(C1541b1 c1541b1, View view) {
        Intent intent = new Intent(c1541b1.requireActivity(), (Class<?>) FreeUpSpaceActivity.class);
        intent.putExtra("appInfo", c1541b1.f13379a);
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = c1541b1.requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        c1541b1.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(C1541b1 c1541b1, Context context, AppBarLayout appBarLayout, int i8) {
        AbstractC3292y.i(appBarLayout, "appBarLayout");
        if (Math.abs(i8) == appBarLayout.getTotalScrollRange()) {
            c1541b1.z3().e0().setValue(Boolean.TRUE);
        } else if (i8 == 0) {
            c1541b1.z3().e0().setValue(Boolean.FALSE);
            c1541b1.x6(context);
        } else {
            c1541b1.z3().e0().setValue(Boolean.FALSE);
            c1541b1.w6(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z4() {
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        Q4(requireContext);
        Context requireContext2 = requireContext();
        AbstractC3292y.h(requireContext2, "requireContext(...)");
        r6(requireContext2);
        F6();
        z3().x().setValue(Boolean.TRUE);
        if (((Number) z3().g0().getValue()).intValue() > 0) {
            D6();
        }
        q3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z5(C1541b1 c1541b1, View view) {
        c1541b1.N2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a3() {
        FragmentActivity activity = getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
        if (getContext() != null) {
            C1523m c8 = C1523m.c(getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            TextView textView = c8.f12850d;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.u());
            c8.f12849c.setTypeface(aVar.v());
            TextView textView2 = c8.f12849c;
            C3788m c3788m = new C3788m();
            C2043h c2043h = this.f13379a;
            AbstractC3292y.f(c2043h);
            String string = getString(com.uptodown.R.string.pre_register_success, c2043h.q0());
            AbstractC3292y.h(string, "getString(...)");
            C2043h c2043h2 = this.f13379a;
            AbstractC3292y.f(c2043h2);
            String q02 = c2043h2.q0();
            AbstractC3292y.f(q02);
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            textView2.setText(c3788m.d(string, q02, requireContext));
            c8.f12848b.setTypeface(aVar.u());
            c8.f12848b.setOnClickListener(new View.OnClickListener() { // from class: Z4.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.b3(C1541b1.this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            j6(builder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(C1541b1 c1541b1, NestedScrollView nestedScrollView, int i8, int i9, int i10, int i11) {
        boolean z8;
        C2039d c2039d;
        C2039d c2039d2;
        Long l8;
        Rect rect = new Rect();
        c1541b1.v3().f12505T.getHitRect(rect);
        c1541b1.i6(rect);
        if (c1541b1.v3().f12496K.f12615s.getLocalVisibleRect(rect)) {
            c1541b1.v3().f12520e.setTitle("");
            c1541b1.v3().f12547r0.setVisibility(8);
            c1541b1.z3().G().setValue(Boolean.TRUE);
        } else {
            boolean booleanValue = ((Boolean) c1541b1.z3().G().getValue()).booleanValue();
            c1541b1.z3().G().setValue(Boolean.FALSE);
            C2043h c2043h = c1541b1.f13379a;
            if (c2043h != null) {
                AbstractC3292y.f(c2043h);
                if (c2043h.q0() != null) {
                    C2043h c2043h2 = c1541b1.f13379a;
                    AbstractC3292y.f(c2043h2);
                    ArrayList b12 = c2043h2.b1();
                    if (b12 != null && !b12.isEmpty()) {
                        z8 = ((Boolean) c1541b1.z3().e0().getValue()).booleanValue();
                    } else {
                        C2043h c2043h3 = c1541b1.f13379a;
                        AbstractC3292y.f(c2043h3);
                        if (c2043h3.c0() != null) {
                            z8 = ((Boolean) c1541b1.z3().e0().getValue()).booleanValue();
                        } else {
                            c1541b1.v3().f12547r0.setVisibility(0);
                            c1541b1.v3().f12520e.setTitleEnabled(false);
                            z8 = true;
                        }
                    }
                    if (booleanValue && z8) {
                        C2043h c2043h4 = c1541b1.f13379a;
                        AbstractC3292y.f(c2043h4);
                        String c02 = c2043h4.c0();
                        if (c02 == null || c02.length() == 0) {
                            TextView textView = c1541b1.v3().f12547r0;
                            C2043h c2043h5 = c1541b1.f13379a;
                            AbstractC3292y.f(c2043h5);
                            textView.setText(c2043h5.q0());
                        }
                        CollapsingToolbarLayout collapsingToolbarLayout = c1541b1.v3().f12520e;
                        C2043h c2043h6 = c1541b1.f13379a;
                        AbstractC3292y.f(c2043h6);
                        String q02 = c2043h6.q0();
                        AbstractC3292y.f(q02);
                        collapsingToolbarLayout.setTitle(q02);
                    }
                }
            }
        }
        Long l9 = null;
        if (c1541b1.z3().w().getValue() != null) {
            Object value = c1541b1.z3().w().getValue();
            AbstractC3292y.f(value);
            if (!((C2039d) value).h() && c1541b1.v3().f12486A.getRoot().getLocalVisibleRect(rect) && (c2039d2 = (C2039d) c1541b1.z3().w().getValue()) != null) {
                Context requireContext = c1541b1.requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                C2043h c2043h7 = c1541b1.f13379a;
                if (c2043h7 != null) {
                    l8 = Long.valueOf(c2043h7.h());
                } else {
                    l8 = null;
                }
                c2039d2.b(requireContext, l8);
            }
        }
        if (c1541b1.z3().w().getValue() != null) {
            Object value2 = c1541b1.z3().w().getValue();
            AbstractC3292y.f(value2);
            if (!((C2039d) value2).h() && c1541b1.v3().f12486A.getRoot().getLocalVisibleRect(rect) && (c2039d = (C2039d) c1541b1.z3().w().getValue()) != null) {
                Context requireContext2 = c1541b1.requireContext();
                AbstractC3292y.h(requireContext2, "requireContext(...)");
                C2043h c2043h8 = c1541b1.f13379a;
                if (c2043h8 != null) {
                    l9 = Long.valueOf(c2043h8.h());
                }
                c2039d.b(requireContext2, l9);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a5(c5.M m8) {
        if (getActivity() != null && !requireActivity().isFinishing() && m8 != null) {
            if (m8.s() >= 1) {
                v3().f12559y.f12109b.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            if (m8.s() >= 2) {
                v3().f12559y.f12110c.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            if (m8.s() >= 3) {
                v3().f12559y.f12111d.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            if (m8.s() >= 4) {
                v3().f12559y.f12112e.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            if (m8.s() == 5) {
                v3().f12559y.f12113f.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            v3().f12559y.f12116i.setText(getString(com.uptodown.R.string.edit_your_review));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a6(final Context context) {
        s6();
        C3969c c3969c = C3969c.f39130a;
        ProgressBar pbProgressAppDetail = v3().f12496K.f12604h;
        AbstractC3292y.h(pbProgressAppDetail, "pbProgressAppDetail");
        ImageView ivLogoAppDetail = v3().f12496K.f12598b;
        AbstractC3292y.h(ivLogoAppDetail, "ivLogoAppDetail");
        c3969c.c(pbProgressAppDetail, ivLogoAppDetail);
        z3().P().setValue(2);
        v3().f12493H.f12784f.setText(getString(com.uptodown.R.string.updates_button_update_app));
        v3().f12493H.f12784f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_install_button));
        v3().f12493H.f12784f.setTextColor(ContextCompat.getColor(context, com.uptodown.R.color.white));
        v3().f12493H.f12784f.setOnClickListener(new View.OnClickListener() { // from class: Z4.D
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.b6(C1541b1.this, context, view);
            }
        });
        v3().f12489D.f13091o.setText(getString(com.uptodown.R.string.updates_button_update_app));
        v3().f12489D.f13082f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_install_button));
        o6(com.uptodown.R.id.action_app_installed_details);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b3(C1541b1 c1541b1, View view) {
        FragmentActivity activity = c1541b1.getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b5(ArrayList arrayList) {
        if (this.f13379a != null && v3().f12540o.getVisibility() == 8 && (!arrayList.isEmpty())) {
            B b9 = new B();
            C c8 = new C();
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            I4.L l8 = new I4.L(b9, c8, requireContext, 8);
            this.f13388j = l8;
            AbstractC3292y.f(l8);
            l8.d(arrayList);
            v3().f12501P.setAdapter(this.f13388j);
            v3().f12501P.setNestedScrollingEnabled(false);
            v3().f12501P.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setSupportsChangeAnimations(false);
            v3().f12501P.setItemAnimator(defaultItemAnimator);
            v3().f12540o.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b6(C1541b1 c1541b1, Context context, View view) {
        c1541b1.l3(context);
    }

    private final void c3(final Context context) {
        String str;
        String str2;
        FragmentActivity activity = getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
        final Drawable drawable = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on);
        final Drawable drawable2 = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        final C1531v c8 = C1531v.c(getLayoutInflater());
        AbstractC3292y.h(c8, "inflate(...)");
        C2043h c2043h = this.f13379a;
        String str3 = null;
        if (c2043h != null) {
            str = c2043h.k0();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
            C2043h c2043h2 = this.f13379a;
            if (c2043h2 != null) {
                str2 = c2043h2.k0();
            } else {
                str2 = null;
            }
            h8.l(str2).n(UptodownApp.f29249C.f0(context)).i(c8.f13026c);
        } else {
            c8.f13026c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_app_icon_placeholder));
        }
        TextView textView = c8.f13032i;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        TextView textView2 = c8.f13032i;
        C2043h c2043h3 = this.f13379a;
        if (c2043h3 != null) {
            str3 = c2043h3.q0();
        }
        textView2.setText(str3);
        int intValue = ((Number) z3().X().getValue()).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    if (intValue != 4) {
                        if (intValue != 5) {
                            c8.f13027d.setImageDrawable(drawable2);
                            c8.f13028e.setImageDrawable(drawable2);
                            c8.f13029f.setImageDrawable(drawable2);
                            c8.f13030g.setImageDrawable(drawable2);
                            c8.f13031h.setImageDrawable(drawable2);
                        } else {
                            c8.f13027d.setImageDrawable(drawable);
                            c8.f13028e.setImageDrawable(drawable);
                            c8.f13029f.setImageDrawable(drawable);
                            c8.f13030g.setImageDrawable(drawable);
                            c8.f13031h.setImageDrawable(drawable);
                        }
                    } else {
                        c8.f13027d.setImageDrawable(drawable);
                        c8.f13028e.setImageDrawable(drawable);
                        c8.f13029f.setImageDrawable(drawable);
                        c8.f13030g.setImageDrawable(drawable);
                        c8.f13031h.setImageDrawable(drawable2);
                    }
                } else {
                    c8.f13027d.setImageDrawable(drawable);
                    c8.f13028e.setImageDrawable(drawable);
                    c8.f13029f.setImageDrawable(drawable);
                    c8.f13030g.setImageDrawable(drawable2);
                    c8.f13031h.setImageDrawable(drawable2);
                }
            } else {
                c8.f13027d.setImageDrawable(drawable);
                c8.f13028e.setImageDrawable(drawable);
                c8.f13029f.setImageDrawable(drawable2);
                c8.f13030g.setImageDrawable(drawable2);
                c8.f13031h.setImageDrawable(drawable2);
            }
        } else {
            c8.f13027d.setImageDrawable(drawable);
            c8.f13028e.setImageDrawable(drawable2);
            c8.f13029f.setImageDrawable(drawable2);
            c8.f13030g.setImageDrawable(drawable2);
            c8.f13031h.setImageDrawable(drawable2);
        }
        c8.f13027d.setOnClickListener(new View.OnClickListener() { // from class: Z4.D0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.d3(C1541b1.this, c8, drawable, drawable2, view);
            }
        });
        c8.f13028e.setOnClickListener(new View.OnClickListener() { // from class: Z4.E0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.e3(C1541b1.this, c8, drawable, drawable2, view);
            }
        });
        c8.f13029f.setOnClickListener(new View.OnClickListener() { // from class: Z4.F0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.f3(C1541b1.this, c8, drawable, drawable2, view);
            }
        });
        c8.f13030g.setOnClickListener(new View.OnClickListener() { // from class: Z4.G0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.g3(C1541b1.this, c8, drawable, drawable2, view);
            }
        });
        c8.f13031h.setOnClickListener(new View.OnClickListener() { // from class: Z4.I0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.h3(C1541b1.this, c8, drawable, view);
            }
        });
        c8.f13025b.setTypeface(aVar.v());
        if (z3().R().getValue() != null) {
            Object value = z3().R().getValue();
            AbstractC3292y.f(value);
            String u8 = ((c5.M) value).u();
            if (u8 != null && u8.length() != 0) {
                EditText editText = c8.f13025b;
                Object value2 = z3().R().getValue();
                AbstractC3292y.f(value2);
                editText.setText(String.valueOf(((c5.M) value2).u()));
            }
            Object value3 = z3().R().getValue();
            AbstractC3292y.f(value3);
            if (((c5.M) value3).s() >= 1) {
                c8.f13027d.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            Object value4 = z3().R().getValue();
            AbstractC3292y.f(value4);
            if (((c5.M) value4).s() >= 2) {
                c8.f13028e.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            Object value5 = z3().R().getValue();
            AbstractC3292y.f(value5);
            if (((c5.M) value5).s() >= 3) {
                c8.f13029f.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            Object value6 = z3().R().getValue();
            AbstractC3292y.f(value6);
            if (((c5.M) value6).s() >= 4) {
                c8.f13030g.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            Object value7 = z3().R().getValue();
            AbstractC3292y.f(value7);
            if (((c5.M) value7).s() == 5) {
                c8.f13031h.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
        }
        c8.f13034k.setTypeface(aVar.u());
        c8.f13034k.setOnClickListener(new View.OnClickListener() { // from class: Z4.J0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.i3(context, this, c8, view);
            }
        });
        c8.f13033j.setTypeface(aVar.u());
        c8.f13033j.setOnClickListener(new View.OnClickListener() { // from class: Z4.K0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.j3(C1541b1.this, view);
            }
        });
        builder.setView(c8.getRoot());
        FragmentActivity activity2 = getActivity();
        AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o23 = ((AbstractActivityC2691a) activity2).o2();
        if (o23 != null) {
            o23.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: Z4.L0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C1541b1.k3(C1541b1.this, context, dialogInterface);
                }
            });
        }
        j6(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(C1541b1 c1541b1, View view) {
        c1541b1.G4();
    }

    private final View c5(LinearLayout.LayoutParams layoutParams, final c5.M m8, Context context) {
        CharSequence charSequence;
        final C1507d0 c8 = C1507d0.c(getLayoutInflater());
        AbstractC3292y.h(c8, "inflate(...)");
        c8.getRoot().setLayoutParams(layoutParams);
        c8.f12581e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
        c8.f12582f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
        c8.f12583g.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
        c8.f12584h.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
        c8.f12585i.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
        if (m8.s() >= 2) {
            c8.f12582f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
        }
        if (m8.s() >= 3) {
            c8.f12583g.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
        }
        if (m8.s() >= 4) {
            c8.f12584h.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
        }
        if (m8.s() == 5) {
            c8.f12585i.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
        }
        UsernameTextView usernameTextView = c8.f12596t;
        j.a aVar = J4.j.f4395g;
        usernameTextView.setTypeface(aVar.u());
        c8.f12591o.setTypeface(aVar.v());
        c8.f12590n.setTypeface(aVar.v());
        c8.f12593q.setTypeface(aVar.v());
        c8.f12594r.setTypeface(aVar.v());
        T.b bVar = c5.T.f15689k;
        String c9 = bVar.c(m8.i());
        if (c9 != null && c9.length() != 0) {
            com.squareup.picasso.s.h().l(bVar.c(m8.i())).n(UptodownApp.f29249C.f0(context)).i(c8.f12579c);
        }
        String x8 = m8.x();
        if (x8 != null && x8.length() != 0) {
            c8.f12579c.setOnClickListener(new View.OnClickListener() { // from class: Z4.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.d5(C1541b1.this, m8, view);
                }
            });
            c8.f12596t.setOnClickListener(new View.OnClickListener() { // from class: Z4.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.e5(C1541b1.this, m8, view);
                }
            });
        }
        if (m8.y() != null) {
            c8.f12596t.setText(m8.y());
            UsernameTextView.a aVar2 = UsernameTextView.f31178k;
            UsernameTextView tvUsernameReview = c8.f12596t;
            AbstractC3292y.h(tvUsernameReview, "tvUsernameReview");
            aVar2.a(tvUsernameReview, m8.I(), m8.z());
        }
        if (m8.w() != null) {
            c8.f12591o.setText(m8.w());
        }
        if (m8.a() == 1) {
            TextView textView = c8.f12594r;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
            String string = getString(com.uptodown.R.string.replies_counter_single);
            AbstractC3292y.h(string, "getString(...)");
            String format = String.format(string, Arrays.copyOf(new Object[0], 0));
            AbstractC3292y.h(format, "format(...)");
            textView.setText(format);
        } else if (m8.a() > 1) {
            TextView textView2 = c8.f12594r;
            kotlin.jvm.internal.Y y9 = kotlin.jvm.internal.Y.f34578a;
            String string2 = getString(com.uptodown.R.string.replies_counter_multiple);
            AbstractC3292y.h(string2, "getString(...)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(m8.a())}, 1));
            AbstractC3292y.h(format2, "format(...)");
            textView2.setText(format2);
        }
        if (m8.u() != null) {
            c8.f12593q.setFocusable(true);
            TextView textView3 = c8.f12590n;
            Spanned v8 = m8.v();
            if (v8 != null) {
                charSequence = l6.n.M0(v8);
            } else {
                charSequence = null;
            }
            textView3.setText(charSequence);
            c8.f12590n.getViewTreeObserver().addOnPreDrawListener(new D(c8));
            c8.f12595s.setOnClickListener(new View.OnClickListener() { // from class: Z4.m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.f5(C1507d0.this, this, view);
                }
            });
            c8.f12588l.setOnClickListener(new View.OnClickListener() { // from class: Z4.n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.g5(C1541b1.this, m8, view);
                }
            });
            c8.f12588l.setFocusable(true);
            c8.f12592p.setText(String.valueOf(m8.p()));
            if (C3770C.f37260a.h(m8.l())) {
                c8.f12580d.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_heart_red));
            }
            c8.f12587k.setOnClickListener(new View.OnClickListener() { // from class: Z4.o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.h5(C1541b1.this, c8, m8, view);
                }
            });
        } else {
            c8.f12590n.setVisibility(8);
            c8.f12588l.setVisibility(8);
            c8.f12587k.setVisibility(8);
        }
        c8.f12593q.setFocusable(true);
        RelativeLayout root = c8.getRoot();
        AbstractC3292y.h(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c6(Context context) {
        s6();
        z3().P().setValue(4);
        v3().f12493H.f12784f.setText(getString(com.uptodown.R.string.updates_button_resume));
        v3().f12493H.f12784f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        v3().f12489D.f13091o.setText(getString(com.uptodown.R.string.updates_button_resume));
        v3().f12489D.f13082f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        o6(com.uptodown.R.id.action_app_installed_details);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(C1541b1 c1541b1, C1531v c1531v, Drawable drawable, Drawable drawable2, View view) {
        if (UptodownApp.f29249C.a0()) {
            c1541b1.z3().X().setValue(1);
            c1531v.f13027d.setImageDrawable(drawable);
            c1531v.f13028e.setImageDrawable(drawable2);
            c1531v.f13029f.setImageDrawable(drawable2);
            c1531v.f13030g.setImageDrawable(drawable2);
            c1531v.f13031h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(C1541b1 c1541b1, View view) {
        if (c1541b1.getActivity() != null) {
            String string = c1541b1.getString(com.uptodown.R.string.url_iap);
            AbstractC3292y.h(string, "getString(...)");
            C3788m c3788m = new C3788m();
            FragmentActivity requireActivity = c1541b1.requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            C3788m.r(c3788m, requireActivity, string, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d5(C1541b1 c1541b1, c5.M m8, View view) {
        String x8 = m8.x();
        AbstractC3292y.f(x8);
        c1541b1.L4(x8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d6(Context context) {
        s6();
        z3().P().setValue(1);
        v3().f12493H.f12784f.setText(getString(com.uptodown.R.string.updates_button_download_app));
        v3().f12493H.f12784f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        v3().f12489D.f13091o.setText(getString(com.uptodown.R.string.updates_button_download_app));
        v3().f12489D.f13082f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        o6(com.uptodown.R.id.action_app_installed_details);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(C1541b1 c1541b1, C1531v c1531v, Drawable drawable, Drawable drawable2, View view) {
        if (UptodownApp.f29249C.a0()) {
            c1541b1.z3().X().setValue(2);
            c1531v.f13027d.setImageDrawable(drawable);
            c1531v.f13028e.setImageDrawable(drawable);
            c1531v.f13029f.setImageDrawable(drawable2);
            c1531v.f13030g.setImageDrawable(drawable2);
            c1531v.f13031h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e4(C1541b1 c1541b1, View view) {
        c1541b1.r3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e5(C1541b1 c1541b1, c5.M m8, View view) {
        String x8 = m8.x();
        AbstractC3292y.f(x8);
        c1541b1.L4(x8);
    }

    private final void e6() {
        if (getContext() != null && this.f13379a != null) {
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            C2043h c2043h = this.f13379a;
            AbstractC3292y.f(c2043h);
            new X4.r(requireContext, c2043h, null, null, LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(C1541b1 c1541b1, C1531v c1531v, Drawable drawable, Drawable drawable2, View view) {
        if (UptodownApp.f29249C.a0()) {
            c1541b1.z3().X().setValue(3);
            c1531v.f13027d.setImageDrawable(drawable);
            c1531v.f13028e.setImageDrawable(drawable);
            c1531v.f13029f.setImageDrawable(drawable);
            c1531v.f13030g.setImageDrawable(drawable2);
            c1531v.f13031h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f4(C1541b1 c1541b1, View view) {
        c1541b1.s3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f5(C1507d0 c1507d0, C1541b1 c1541b1, View view) {
        if (c1507d0.f12590n.getMaxLines() == Integer.MAX_VALUE) {
            c1507d0.f12590n.setMaxLines(4);
            c1507d0.f12595s.setText(c1541b1.getString(com.uptodown.R.string.read_more_desc_app_detail));
        } else {
            c1507d0.f12590n.setMaxLines(Integer.MAX_VALUE);
            c1507d0.f12595s.setText(c1541b1.getString(com.uptodown.R.string.read_less_desc_app_detail));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f6(final C2043h c2043h) {
        if (getActivity() instanceof MainActivity) {
            FragmentActivity activity = getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).p7(c2043h, new Function0() { // from class: Z4.V0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Q5.I g62;
                    g62 = C1541b1.g6(C2043h.this, this);
                    return g62;
                }
            });
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            new X4.i(requireContext, c2043h.h(), new O(), LifecycleOwnerKt.getLifecycleScope(this));
            return;
        }
        if (getActivity() instanceof AppDetailActivity) {
            FragmentActivity activity2 = getActivity();
            AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).s3(v3().f12516c.getRoot());
            FragmentActivity activity3 = getActivity();
            AbstractC3292y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity3).t3(c2043h, new Function0() { // from class: Z4.W0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Q5.I h62;
                    h62 = C1541b1.h6(C2043h.this, this);
                    return h62;
                }
            });
            Context requireContext2 = requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            new X4.i(requireContext2, c2043h.h(), new P(), LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g3(C1541b1 c1541b1, C1531v c1531v, Drawable drawable, Drawable drawable2, View view) {
        if (UptodownApp.f29249C.a0()) {
            c1541b1.z3().X().setValue(4);
            c1531v.f13027d.setImageDrawable(drawable);
            c1531v.f13028e.setImageDrawable(drawable);
            c1531v.f13029f.setImageDrawable(drawable);
            c1531v.f13030g.setImageDrawable(drawable);
            c1531v.f13031h.setImageDrawable(drawable2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g4(java.io.File r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.C1541b1.g4(java.io.File, android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g5(C1541b1 c1541b1, c5.M m8, View view) {
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (aVar.a0()) {
            Intent intent = new Intent(c1541b1.requireActivity(), (Class<?>) RepliesActivity.class);
            intent.putExtra("review", m8);
            C2043h c2043h = c1541b1.f13379a;
            AbstractC3292y.f(c2043h);
            intent.putExtra("appName", c2043h.q0());
            FragmentActivity requireActivity = c1541b1.requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            c1541b1.startActivity(intent, aVar.a(requireActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I g6(C2043h c2043h, C1541b1 c1541b1) {
        if (c2043h.v0() != null) {
            String v02 = c2043h.v0();
            AbstractC3292y.f(v02);
            c1541b1.y6(v02);
        }
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(C1541b1 c1541b1, C1531v c1531v, Drawable drawable, View view) {
        if (UptodownApp.f29249C.a0()) {
            c1541b1.z3().X().setValue(5);
            c1531v.f13027d.setImageDrawable(drawable);
            c1531v.f13028e.setImageDrawable(drawable);
            c1531v.f13029f.setImageDrawable(drawable);
            c1531v.f13030g.setImageDrawable(drawable);
            c1531v.f13031h.setImageDrawable(drawable);
        }
    }

    private final boolean h4() {
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (aVar.p() != null) {
            C2047l p8 = aVar.p();
            AbstractC3292y.f(p8);
            String d8 = p8.d();
            C2043h c2043h = this.f13379a;
            AbstractC3292y.f(c2043h);
            if (l6.n.s(d8, c2043h.v0(), true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h5(C1541b1 c1541b1, C1507d0 c1507d0, c5.M m8, View view) {
        if (UptodownApp.f29249C.a0()) {
            Context requireContext = c1541b1.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            ImageView ivLikesCounterReview = c1507d0.f12580d;
            AbstractC3292y.h(ivLikesCounterReview, "ivLikesCounterReview");
            s5.k.a(requireContext, ivLikesCounterReview);
            if (!C3770C.f37260a.h(m8.l())) {
                c1541b1.j4(m8);
                c1507d0.f12592p.setText(String.valueOf(m8.p() + 1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I h6(C2043h c2043h, C1541b1 c1541b1) {
        if (c2043h.v0() != null) {
            String v02 = c2043h.v0();
            AbstractC3292y.f(v02);
            c1541b1.y6(v02);
        }
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(Context context, C1541b1 c1541b1, C1531v c1531v, View view) {
        String str;
        if (UptodownApp.f29249C.a0()) {
            c5.T e8 = c5.T.f15689k.e(context);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null) {
                String id = e8.getId();
                AbstractC3292y.f(id);
                if (id.length() > 0) {
                    Editable text = c1531v.f13025b.getText();
                    AbstractC3292y.h(text, "getText(...)");
                    c1541b1.z5(l6.n.M0(text).toString());
                    FragmentActivity activity = c1541b1.getActivity();
                    AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
                    if (o22 != null) {
                        o22.dismiss();
                        return;
                    }
                    return;
                }
            }
            q6.w Z8 = c1541b1.z3().Z();
            Editable text2 = c1531v.f13025b.getText();
            AbstractC3292y.h(text2, "getText(...)");
            Z8.setValue(l6.n.M0(text2).toString());
            c1541b1.z4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i4() {
        DownloadApkWorker.a aVar = DownloadApkWorker.f31190k;
        C2043h c2043h = this.f13379a;
        AbstractC3292y.f(c2043h);
        long h8 = c2043h.h();
        C2043h c2043h2 = this.f13379a;
        AbstractC3292y.f(c2043h2);
        return aVar.d(h8, c2043h2.m0());
    }

    private final View i5(LinearLayout.LayoutParams layoutParams) {
        C1507d0 c8 = C1507d0.c(getLayoutInflater());
        AbstractC3292y.h(c8, "inflate(...)");
        c8.getRoot().setLayoutParams(layoutParams);
        c8.getRoot().setVisibility(4);
        RelativeLayout root = c8.getRoot();
        AbstractC3292y.h(root, "getRoot(...)");
        return root;
    }

    private final void i6(Rect rect) {
        if (getContext() != null) {
            C2043h c2043h = this.f13379a;
            AbstractC3292y.f(c2043h);
            if (!AbstractC3292y.d(c2043h.v0(), requireContext().getPackageName())) {
                if (v3().f12493H.getRoot().getLocalVisibleRect(rect) && !((Boolean) z3().K().getValue()).booleanValue()) {
                    v3().f12488C.startAnimation(AnimationUtils.loadAnimation(requireContext(), com.uptodown.R.anim.slide_out_bottom));
                    v3().f12488C.setVisibility(8);
                    z3().K().setValue(Boolean.valueOf(!((Boolean) z3().K().getValue()).booleanValue()));
                    return;
                }
                if (!v3().f12493H.getRoot().getLocalVisibleRect(rect) && ((Boolean) z3().K().getValue()).booleanValue()) {
                    v3().f12488C.startAnimation(AnimationUtils.loadAnimation(requireContext(), com.uptodown.R.anim.slide_in_bottom));
                    v3().f12488C.setVisibility(0);
                    z3().K().setValue(Boolean.valueOf(!((Boolean) z3().K().getValue()).booleanValue()));
                }
            }
        }
    }

    private final void j2() {
        C2043h c2043h = this.f13379a;
        if (c2043h != null) {
            AbstractC3292y.f(c2043h);
            if (c2043h.v0() != null && getContext() != null) {
                C3791p.a aVar = C3791p.f37286s;
                Context requireContext = requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                C3791p a9 = aVar.a(requireContext);
                a9.a();
                C2043h c2043h2 = this.f13379a;
                AbstractC3292y.f(c2043h2);
                String v02 = c2043h2.v0();
                AbstractC3292y.f(v02);
                C2041f S8 = a9.S(v02);
                if (S8 != null) {
                    if (S8.i() == 0) {
                        S8.t0(1);
                        C2041f.c c02 = S8.c0();
                        C2041f.c cVar = C2041f.c.f15791b;
                        if (c02 != cVar) {
                            S8.J0(cVar);
                            String Q8 = S8.Q();
                            AbstractC3292y.f(Q8);
                            a9.M(Q8);
                            C3794s c3794s = new C3794s();
                            Context requireContext2 = requireContext();
                            AbstractC3292y.h(requireContext2, "requireContext(...)");
                            c3794s.c(requireContext2);
                        }
                    } else {
                        S8.t0(0);
                    }
                    a9.k1(S8);
                    z3().Q().setValue(S8);
                    C3784i c3784i = new C3784i();
                    Context requireContext3 = requireContext();
                    AbstractC3292y.h(requireContext3, "requireContext(...)");
                    c3784i.C(requireContext3);
                }
                a9.i();
                q3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(C1541b1 c1541b1, View view) {
        if (UptodownApp.f29249C.a0()) {
            c1541b1.z3().X().setValue(-1);
            FragmentActivity activity = c1541b1.getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
            if (o22 != null) {
                o22.dismiss();
            }
        }
    }

    private final void j4(c5.M m8) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new C1557p(m8, null), 2, null);
        C1591j1 z32 = z3();
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        z32.k0(requireContext, m8);
    }

    private final View j5(LinearLayout.LayoutParams layoutParams, final c5.M m8, Context context) {
        CharSequence charSequence;
        final C1509e0 c8 = C1509e0.c(getLayoutInflater());
        AbstractC3292y.h(c8, "inflate(...)");
        c8.getRoot().setLayoutParams(layoutParams);
        c8.f12627e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on_turbo));
        c8.f12628f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off_turbo));
        c8.f12629g.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off_turbo));
        c8.f12630h.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off_turbo));
        c8.f12631i.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off_turbo));
        if (m8.s() >= 2) {
            c8.f12628f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on_turbo));
        }
        if (m8.s() >= 3) {
            c8.f12629g.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on_turbo));
        }
        if (m8.s() >= 4) {
            c8.f12630h.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on_turbo));
        }
        if (m8.s() == 5) {
            c8.f12631i.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on_turbo));
        }
        UsernameTextView usernameTextView = c8.f12642t;
        j.a aVar = J4.j.f4395g;
        usernameTextView.setTypeface(aVar.u());
        c8.f12637o.setTypeface(aVar.v());
        c8.f12636n.setTypeface(aVar.v());
        c8.f12639q.setTypeface(aVar.v());
        c8.f12640r.setTypeface(aVar.v());
        T.b bVar = c5.T.f15689k;
        if (bVar.c(m8.i()) != null) {
            com.squareup.picasso.s.h().l(bVar.c(m8.i())).n(UptodownApp.f29249C.f0(context)).i(c8.f12625c);
        }
        String x8 = m8.x();
        if (x8 != null && x8.length() != 0) {
            c8.f12625c.setOnClickListener(new View.OnClickListener() { // from class: Z4.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.k5(C1541b1.this, m8, view);
                }
            });
            c8.f12642t.setOnClickListener(new View.OnClickListener() { // from class: Z4.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.l5(C1541b1.this, m8, view);
                }
            });
        }
        if (m8.y() != null) {
            c8.f12642t.setText(m8.y());
            UsernameTextView.a aVar2 = UsernameTextView.f31178k;
            UsernameTextView tvUsernameReview = c8.f12642t;
            AbstractC3292y.h(tvUsernameReview, "tvUsernameReview");
            aVar2.a(tvUsernameReview, m8.I(), m8.z());
        }
        if (m8.w() != null) {
            c8.f12637o.setText(m8.w());
        }
        if (m8.a() == 1) {
            TextView textView = c8.f12640r;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
            String string = getString(com.uptodown.R.string.replies_counter_single);
            AbstractC3292y.h(string, "getString(...)");
            String format = String.format(string, Arrays.copyOf(new Object[0], 0));
            AbstractC3292y.h(format, "format(...)");
            textView.setText(format);
        } else if (m8.a() > 1) {
            TextView textView2 = c8.f12640r;
            kotlin.jvm.internal.Y y9 = kotlin.jvm.internal.Y.f34578a;
            String string2 = getString(com.uptodown.R.string.replies_counter_multiple);
            AbstractC3292y.h(string2, "getString(...)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(m8.a())}, 1));
            AbstractC3292y.h(format2, "format(...)");
            textView2.setText(format2);
        }
        if (m8.u() != null) {
            c8.f12639q.setFocusable(true);
            TextView textView3 = c8.f12636n;
            Spanned v8 = m8.v();
            if (v8 != null) {
                charSequence = l6.n.M0(v8);
            } else {
                charSequence = null;
            }
            textView3.setText(charSequence);
            c8.f12636n.getViewTreeObserver().addOnPreDrawListener(new E(c8));
            c8.f12641s.setOnClickListener(new View.OnClickListener() { // from class: Z4.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.m5(C1509e0.this, this, view);
                }
            });
            c8.f12634l.setOnClickListener(new View.OnClickListener() { // from class: Z4.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.n5(C1541b1.this, m8, view);
                }
            });
            c8.f12634l.setFocusable(true);
            c8.f12638p.setText(String.valueOf(m8.p()));
            if (C3770C.f37260a.h(m8.l())) {
                c8.f12626d.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_heart_red));
            }
            c8.f12633k.setOnClickListener(new View.OnClickListener() { // from class: Z4.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1541b1.o5(C1541b1.this, c8, m8, view);
                }
            });
        } else {
            c8.f12636n.setVisibility(8);
            c8.f12634l.setVisibility(8);
            c8.f12633k.setVisibility(8);
        }
        c8.f12632j.setOnClickListener(new View.OnClickListener() { // from class: Z4.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.p5(C1541b1.this, view);
            }
        });
        c8.f12632j.setVisibility(0);
        C3788m.a aVar3 = C3788m.f37279a;
        ImageView ivAvatarReview = c8.f12625c;
        AbstractC3292y.h(ivAvatarReview, "ivAvatarReview");
        aVar3.a(ivAvatarReview);
        c8.f12639q.setFocusable(true);
        RelativeLayout root = c8.getRoot();
        AbstractC3292y.h(root, "getRoot(...)");
        return root;
    }

    private final void j6(AlertDialog.Builder builder) {
        if (!UptodownApp.f29249C.N()) {
            FragmentActivity activity = getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            ((AbstractActivityC2691a) activity).K2(builder.create());
            if (getActivity() != null && !requireActivity().isFinishing()) {
                FragmentActivity activity2 = getActivity();
                AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                if (((AbstractActivityC2691a) activity2).o2() != null) {
                    FragmentActivity activity3 = getActivity();
                    AbstractC3292y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    AlertDialog o22 = ((AbstractActivityC2691a) activity3).o2();
                    AbstractC3292y.f(o22);
                    Window window = o22.getWindow();
                    if (window != null) {
                        window.setBackgroundDrawable(new ColorDrawable(0));
                    }
                    FragmentActivity activity4 = getActivity();
                    AbstractC3292y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    AlertDialog o23 = ((AbstractActivityC2691a) activity4).o2();
                    AbstractC3292y.f(o23);
                    o23.show();
                }
            }
        }
    }

    private final void k2() {
        if (getContext() != null && this.f13379a != null) {
            if (z3().h0().getValue() != null) {
                Object value = z3().h0().getValue();
                AbstractC3292y.f(value);
                Context requireContext = requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                ((c5.W) value).i(requireContext);
                Context requireContext2 = requireContext();
                Context requireContext3 = requireContext();
                C2043h c2043h = this.f13379a;
                AbstractC3292y.f(c2043h);
                Toast.makeText(requireContext2, requireContext3.getString(com.uptodown.R.string.action_removed_from_wishlist, c2043h.q0()), 0).show();
            } else {
                q6.w h02 = z3().h0();
                C2043h c2043h2 = this.f13379a;
                AbstractC3292y.f(c2043h2);
                long h8 = c2043h2.h();
                C2043h c2043h3 = this.f13379a;
                AbstractC3292y.f(c2043h3);
                String q02 = c2043h3.q0();
                AbstractC3292y.f(q02);
                C2043h c2043h4 = this.f13379a;
                AbstractC3292y.f(c2043h4);
                String k02 = c2043h4.k0();
                C2043h c2043h5 = this.f13379a;
                AbstractC3292y.f(c2043h5);
                String v02 = c2043h5.v0();
                C2043h c2043h6 = this.f13379a;
                AbstractC3292y.f(c2043h6);
                h02.setValue(new c5.W(h8, q02, k02, v02, c2043h6.g1()));
                Object value2 = z3().h0().getValue();
                AbstractC3292y.f(value2);
                Context requireContext4 = requireContext();
                AbstractC3292y.h(requireContext4, "requireContext(...)");
                ((c5.W) value2).h(requireContext4);
                Context requireContext5 = requireContext();
                Context requireContext6 = requireContext();
                C2043h c2043h7 = this.f13379a;
                AbstractC3292y.f(c2043h7);
                Toast.makeText(requireContext5, requireContext6.getString(com.uptodown.R.string.action_added_to_wishlist, c2043h7.q0()), 0).show();
            }
            F6();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(C1541b1 c1541b1, Context context, DialogInterface dialogInterface) {
        c1541b1.B6(((Number) c1541b1.z3().X().getValue()).intValue(), context);
    }

    private final void k4() {
        boolean z8;
        T.b bVar = c5.T.f15689k;
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        c5.T e8 = bVar.e(requireContext);
        if (e8 != null && e8.y()) {
            z8 = true;
        } else {
            z8 = false;
        }
        C2043h c2043h = this.f13379a;
        if (c2043h != null && c2043h.f() == 1 && !z8) {
            try {
                v3().f12560z.init(new BannerSize(5, getResources().getDisplayMetrics().widthPixels, (int) getResources().getDimension(com.uptodown.R.dimen.mintegral_banner_height)), "1517644", "3351941");
                v3().f12560z.setAllowShowCloseBtn(true);
                v3().f12560z.setRefreshTime(15);
                v3().f12560z.setBannerAdListener(new C1558q());
                v3().f12560z.load();
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                Bundle bundle = new Bundle();
                bundle.putString("type", "exception");
                new C3795t(getContext()).e("mintegral_banner", bundle);
                v3().f12560z.setVisibility(8);
                v3().f12560z.release();
                return;
            }
        }
        v3().f12560z.setVisibility(8);
        v3().f12560z.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k5(C1541b1 c1541b1, c5.M m8, View view) {
        String x8 = m8.x();
        AbstractC3292y.f(x8);
        c1541b1.L4(x8);
    }

    private final void k6() {
        T.b bVar = c5.T.f15689k;
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        c5.T e8 = bVar.e(requireContext);
        if (e8 == null || !e8.y()) {
            C2058x.a aVar = C2058x.f15962n;
            Context requireContext2 = requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            final C2058x d8 = aVar.d(requireContext2);
            if (d8 != null) {
                Context requireContext3 = requireContext();
                AbstractC3292y.h(requireContext3, "requireContext(...)");
                if (d8.a(requireContext3)) {
                    String r8 = d8.r();
                    C2043h c2043h = this.f13379a;
                    AbstractC3292y.f(c2043h);
                    if (!l6.n.s(r8, c2043h.v0(), true)) {
                        C1500a c8 = C1500a.c(getLayoutInflater());
                        AbstractC3292y.h(c8, "inflate(...)");
                        c8.f12469d.setTypeface(J4.j.f4395g.u());
                        com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
                        Resources resources = getResources();
                        AbstractC3292y.h(resources, "getResources(...)");
                        h8.l(d8.A(resources)).j(c8.f12467b, new Q(c8));
                        c8.f12468c.setOnClickListener(new View.OnClickListener() { // from class: Z4.Y0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C1541b1.l6(C1541b1.this, d8, view);
                            }
                        });
                        c8.f12467b.setOnClickListener(new View.OnClickListener() { // from class: Z4.Z0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C1541b1.m6(C1541b1.this, d8, view);
                            }
                        });
                        return;
                    }
                }
            }
            n6();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l2(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: Z4.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1541b1.m2(C1541b1.this, view2);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:            if (r4.exists() == false) goto L35;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l3(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.C1541b1.l3(android.content.Context):void");
    }

    private final void l4() {
        C2043h c2043h = this.f13379a;
        if (c2043h != null) {
            AbstractC3292y.f(c2043h);
            if (c2043h.c0() != null) {
                com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
                C2043h c2043h2 = this.f13379a;
                AbstractC3292y.f(c2043h2);
                com.squareup.picasso.w l8 = h8.l(c2043h2.c0());
                Context requireContext = requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                com.squareup.picasso.w n8 = l8.n(new C3970d(requireContext));
                ImageView imageView = this.f13383e;
                AbstractC3292y.g(imageView, "null cannot be cast to non-null type android.widget.ImageView");
                n8.j(imageView, new C1559r());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l5(C1541b1 c1541b1, c5.M m8, View view) {
        String x8 = m8.x();
        AbstractC3292y.f(x8);
        c1541b1.L4(x8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l6(C1541b1 c1541b1, C2058x c2058x, View view) {
        c1541b1.v3().f12524g.removeAllViews();
        c1541b1.v3().f12524g.setVisibility(8);
        Context requireContext = c1541b1.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        c2058x.f(requireContext);
        if (c1541b1.getActivity() != null && (c1541b1.getActivity() instanceof MainActivity)) {
            FragmentActivity activity = c1541b1.getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).T2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m2(C1541b1 c1541b1, View view) {
        if (UptodownApp.f29249C.a0()) {
            C1591j1 z32 = c1541b1.z3();
            Context requireContext = c1541b1.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            C2043h c2043h = c1541b1.f13379a;
            AbstractC3292y.f(c2043h);
            long h8 = c2043h.h();
            C2043h c2043h2 = c1541b1.f13379a;
            AbstractC3292y.f(c2043h2);
            String q02 = c2043h2.q0();
            AbstractC3292y.f(q02);
            C2043h c2043h3 = c1541b1.f13379a;
            AbstractC3292y.f(c2043h3);
            String k02 = c2043h3.k0();
            C2043h c2043h4 = c1541b1.f13379a;
            AbstractC3292y.f(c2043h4);
            z32.s(requireContext, h8, q02, k02, c2043h4.z0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I m3(C1541b1 c1541b1) {
        C2043h c2043h = c1541b1.f13379a;
        AbstractC3292y.f(c2043h);
        c1541b1.x4(c2043h.Y());
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m4() {
        Long l8;
        C2043h c2043h = this.f13379a;
        if (c2043h != null) {
            AbstractC3292y.f(c2043h);
            if (!c2043h.s0()) {
                C2043h c2043h2 = this.f13379a;
                AbstractC3292y.f(c2043h2);
                c2043h2.o1(true);
                Bundle bundle = new Bundle();
                C2043h c2043h3 = this.f13379a;
                if (c2043h3 != null) {
                    l8 = Long.valueOf(c2043h3.h());
                } else {
                    l8 = null;
                }
                if (l8 != null) {
                    C2043h c2043h4 = this.f13379a;
                    AbstractC3292y.f(c2043h4);
                    bundle.putString("appId", String.valueOf(c2043h4.h()));
                }
                bundle.putString("type", "noCompatibleFile");
                C3795t c3795t = this.f13382d;
                if (c3795t != null) {
                    c3795t.e("app_details", bundle);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m5(C1509e0 c1509e0, C1541b1 c1541b1, View view) {
        if (c1509e0.f12636n.getMaxLines() == Integer.MAX_VALUE) {
            c1509e0.f12636n.setMaxLines(4);
            c1509e0.f12641s.setText(c1541b1.getString(com.uptodown.R.string.read_more_desc_app_detail));
        } else {
            c1509e0.f12636n.setMaxLines(Integer.MAX_VALUE);
            c1509e0.f12641s.setText(c1541b1.getString(com.uptodown.R.string.read_less_desc_app_detail));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m6(C1541b1 c1541b1, C2058x c2058x, View view) {
        if (UptodownApp.f29249C.a0() && c1541b1.getActivity() != null && (c1541b1.getActivity() instanceof MainActivity)) {
            FragmentActivity activity = c1541b1.getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).T2();
            Context requireContext = c1541b1.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            c2058x.e(requireContext);
            c1541b1.v3().f12524g.removeAllViews();
            c1541b1.v3().f12524g.setVisibility(8);
            FragmentActivity activity2 = c1541b1.getActivity();
            AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity2).C2(c2058x.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n2() {
        if (getContext() != null) {
            C1591j1 z32 = z3();
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            if (z32.i0(requireContext)) {
                z3().L().setValue(Boolean.TRUE);
                Context requireContext2 = requireContext();
                AbstractC3292y.h(requireContext2, "requireContext(...)");
                l3(requireContext2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I n3() {
        return Q5.I.f8786a;
    }

    private final void n4(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        if (h4()) {
            bundle.putInt("deeplink", 1);
        } else {
            bundle.putInt("deeplink", 0);
        }
        C3795t c3795t = this.f13382d;
        if (c3795t != null) {
            c3795t.e("warning", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n5(C1541b1 c1541b1, c5.M m8, View view) {
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (aVar.a0()) {
            Intent intent = new Intent(c1541b1.requireActivity(), (Class<?>) RepliesActivity.class);
            intent.putExtra("review", m8);
            C2043h c2043h = c1541b1.f13379a;
            AbstractC3292y.f(c2043h);
            intent.putExtra("appName", c2043h.q0());
            FragmentActivity requireActivity = c1541b1.requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            c1541b1.startActivity(intent, aVar.a(requireActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n6() {
        boolean z8;
        C2043h c2043h;
        T.b bVar = c5.T.f15689k;
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        c5.T e8 = bVar.e(requireContext);
        if (e8 != null && e8.y()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (getContext() != null && (c2043h = this.f13379a) != null && c2043h.f() == 1 && !z8) {
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            Context requireContext2 = requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            long v8 = aVar.v(requireContext2);
            if (v8 == 0 || System.currentTimeMillis() - v8 >= 86400000) {
                try {
                    MBNewInterstitialHandler mBNewInterstitialHandler = new MBNewInterstitialHandler(requireContext(), "1525209", "3361225");
                    mBNewInterstitialHandler.setInterstitialVideoListener(new R(mBNewInterstitialHandler));
                    mBNewInterstitialHandler.playVideoMute(1);
                    mBNewInterstitialHandler.load();
                } catch (Exception e9) {
                    e9.printStackTrace();
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "exception");
                    new C3795t(getContext()).e("mintegral_interstitial", bundle);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o2() {
        if (h4()) {
            C2047l p8 = UptodownApp.f29249C.p();
            AbstractC3292y.f(p8);
            if (p8.b() == -1 && getContext() != null) {
                SettingsPreferences.a aVar = SettingsPreferences.f30529b;
                Context requireContext = requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                if (aVar.R(requireContext)) {
                    Context requireContext2 = requireContext();
                    AbstractC3292y.h(requireContext2, "requireContext(...)");
                    if (!aVar.d0(requireContext2)) {
                        Context requireContext3 = requireContext();
                        AbstractC3292y.h(requireContext3, "requireContext(...)");
                        aVar.T0(requireContext3, false);
                    }
                    Context requireContext4 = requireContext();
                    AbstractC3292y.h(requireContext4, "requireContext(...)");
                    l3(requireContext4);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o3(c5.r rVar) {
        if (getContext() != null) {
            if (z3().f0().getValue() != null) {
                Object value = z3().f0().getValue();
                AbstractC3292y.f(value);
                q6(((c5.Q) value).s());
                return;
            }
            C2043h c2043h = this.f13379a;
            AbstractC3292y.f(c2043h);
            rVar.a(c2043h);
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            int l02 = rVar.l0(requireContext);
            if (l02 >= 0) {
                C1591j1 z32 = z3();
                Context requireContext2 = requireContext();
                AbstractC3292y.h(requireContext2, "requireContext(...)");
                if (z32.i0(requireContext2)) {
                    C2045j.a aVar = C2045j.f15879n;
                    Context requireContext3 = requireContext();
                    AbstractC3292y.h(requireContext3, "requireContext(...)");
                    C2045j d8 = aVar.d(requireContext3);
                    if (d8 != null && d8.k() == ((Number) z3().D().getValue()).longValue()) {
                        Context requireContext4 = requireContext();
                        AbstractC3292y.h(requireContext4, "requireContext(...)");
                        d8.w(requireContext4, l02);
                    }
                } else {
                    C1591j1 z33 = z3();
                    Context requireContext5 = requireContext();
                    AbstractC3292y.h(requireContext5, "requireContext(...)");
                    if (z33.j0(requireContext5)) {
                        C2058x.a aVar2 = C2058x.f15962n;
                        Context requireContext6 = requireContext();
                        AbstractC3292y.h(requireContext6, "requireContext(...)");
                        C2058x d9 = aVar2.d(requireContext6);
                        if (d9 != null && d9.k() == ((Number) z3().D().getValue()).longValue()) {
                            Context requireContext7 = requireContext();
                            AbstractC3292y.h(requireContext7, "requireContext(...)");
                            d9.w(requireContext7, l02);
                        }
                    }
                }
                k6();
                if (h4()) {
                    C2047l p8 = UptodownApp.f29249C.p();
                    AbstractC3292y.f(p8);
                    p8.g(l02);
                }
                C2043h c2043h2 = this.f13379a;
                AbstractC3292y.f(c2043h2);
                String v02 = c2043h2.v0();
                AbstractC3292y.f(v02);
                C2043h c2043h3 = this.f13379a;
                AbstractC3292y.f(c2043h3);
                G2(l02, v02, c2043h3.h());
                DownloadApkWorker.a aVar3 = DownloadApkWorker.f31190k;
                Context requireContext8 = requireContext();
                AbstractC3292y.h(requireContext8, "requireContext(...)");
                if (!aVar3.f(requireContext8, l02)) {
                    v3().f12493H.f12784f.setVisibility(0);
                    v3().f12493H.f12784f.setText(getString(com.uptodown.R.string.option_button_cancel));
                    v3().f12493H.f12784f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.ripple_open_button));
                    v3().f12493H.f12784f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.blue_primary));
                    v3().f12493H.f12784f.setOnClickListener(new View.OnClickListener() { // from class: Z4.X0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C1541b1.p3(C1541b1.this, view);
                        }
                    });
                    v3().f12489D.f13078b.setVisibility(0);
                    SettingsPreferences.a aVar4 = SettingsPreferences.f30529b;
                    Context requireContext9 = requireContext();
                    AbstractC3292y.h(requireContext9, "requireContext(...)");
                    if (!aVar4.T(requireContext9)) {
                        Context requireContext10 = requireContext();
                        kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
                        String string = getString(com.uptodown.R.string.msg_added_to_downlads_queue);
                        AbstractC3292y.h(string, "getString(...)");
                        C2043h c2043h4 = this.f13379a;
                        AbstractC3292y.f(c2043h4);
                        String format = String.format(string, Arrays.copyOf(new Object[]{c2043h4.q0()}, 1));
                        AbstractC3292y.h(format, "format(...)");
                        Toast.makeText(requireContext10, format, 1).show();
                    }
                }
                if (getActivity() != null && (getActivity() instanceof MainActivity)) {
                    FragmentActivity activity = getActivity();
                    AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).P1(rVar);
                    return;
                }
                return;
            }
            W2(getString(com.uptodown.R.string.error_cant_enqueue_download) + " (108)");
            Context requireContext11 = requireContext();
            AbstractC3292y.h(requireContext11, "requireContext(...)");
            I5(requireContext11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o4(C1541b1 c1541b1, ActivityResult activityResult) {
        String str;
        if (activityResult.getResultCode() == 1) {
            T.b bVar = c5.T.f15689k;
            Context requireContext = c1541b1.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            c5.T e8 = bVar.e(requireContext);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null) {
                Context requireContext2 = c1541b1.requireContext();
                AbstractC3292y.h(requireContext2, "requireContext(...)");
                if (e8.x(requireContext2)) {
                    c1541b1.J2();
                    UptodownApp.a aVar = UptodownApp.f29249C;
                    Context requireContext3 = c1541b1.requireContext();
                    AbstractC3292y.h(requireContext3, "requireContext(...)");
                    aVar.j0(requireContext3);
                    Context requireContext4 = c1541b1.requireContext();
                    AbstractC3292y.h(requireContext4, "requireContext(...)");
                    aVar.i0(requireContext4);
                    c1541b1.A5();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o5(C1541b1 c1541b1, C1509e0 c1509e0, c5.M m8, View view) {
        if (UptodownApp.f29249C.a0()) {
            Context requireContext = c1541b1.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            ImageView ivLikesCounterReview = c1509e0.f12626d;
            AbstractC3292y.h(ivLikesCounterReview, "ivLikesCounterReview");
            s5.k.a(requireContext, ivLikesCounterReview);
            if (!C3770C.f37260a.h(m8.l())) {
                c1541b1.j4(m8);
                c1509e0.f12638p.setText(String.valueOf(m8.p() + 1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o6(int i8) {
        Menu menu = this.f13386h;
        AbstractC3292y.f(menu);
        menu.findItem(i8).setVisible(true);
    }

    private final void p2(C1516i c1516i) {
        c1516i.f12784f.setTypeface(J4.j.f4395g.u());
        c1516i.f12783e.setOnClickListener(new View.OnClickListener() { // from class: Z4.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.q2(C1541b1.this, view);
            }
        });
        c1516i.f12784f.setOnClickListener(new View.OnClickListener() { // from class: Z4.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.r2(C1541b1.this, view);
            }
        });
        c1516i.f12783e.setFocusable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(C1541b1 c1541b1, View view) {
        c1541b1.N2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p4() {
        T.b bVar = c5.T.f15689k;
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        bVar.a(requireContext);
        z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p5(C1541b1 c1541b1, View view) {
        c1541b1.p6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p6() {
        if (getContext() != null) {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            AbstractC3292y.h(build, "build(...)");
            C3775H.a aVar = C3775H.f37269c;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            build.intent.setData(Uri.parse(new C3788m().c(aVar.c(requireContext))));
            ActivityResultLauncher activityResultLauncher = this.f13391m;
            Intent intent = build.intent;
            UptodownApp.a aVar2 = UptodownApp.f29249C;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            activityResultLauncher.launch(intent, aVar2.b(requireActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q2(C1541b1 c1541b1, View view) {
        c1541b1.s4();
    }

    private final void q3() {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1554m(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0029, B:8:0x003f, B:10:0x004a, B:13:0x0051, B:14:0x0069, B:16:0x006d, B:19:0x0076, B:21:0x007c, B:22:0x0099, B:24:0x00a8, B:26:0x00bd, B:28:0x00c3, B:29:0x00e9, B:31:0x00ed, B:32:0x00f0, B:34:0x00f4, B:35:0x00f7, B:36:0x00fd, B:38:0x0103, B:43:0x008a, B:45:0x005c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0029, B:8:0x003f, B:10:0x004a, B:13:0x0051, B:14:0x0069, B:16:0x006d, B:19:0x0076, B:21:0x007c, B:22:0x0099, B:24:0x00a8, B:26:0x00bd, B:28:0x00c3, B:29:0x00e9, B:31:0x00ed, B:32:0x00f0, B:34:0x00f4, B:35:0x00f7, B:36:0x00fd, B:38:0x0103, B:43:0x008a, B:45:0x005c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0029, B:8:0x003f, B:10:0x004a, B:13:0x0051, B:14:0x0069, B:16:0x006d, B:19:0x0076, B:21:0x007c, B:22:0x0099, B:24:0x00a8, B:26:0x00bd, B:28:0x00c3, B:29:0x00e9, B:31:0x00ed, B:32:0x00f0, B:34:0x00f4, B:35:0x00f7, B:36:0x00fd, B:38:0x0103, B:43:0x008a, B:45:0x005c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0029, B:8:0x003f, B:10:0x004a, B:13:0x0051, B:14:0x0069, B:16:0x006d, B:19:0x0076, B:21:0x007c, B:22:0x0099, B:24:0x00a8, B:26:0x00bd, B:28:0x00c3, B:29:0x00e9, B:31:0x00ed, B:32:0x00f0, B:34:0x00f4, B:35:0x00f7, B:36:0x00fd, B:38:0x0103, B:43:0x008a, B:45:0x005c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103 A[Catch: Exception -> 0x0026, LOOP:0: B:36:0x00fd->B:38:0x0103, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x0026, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0029, B:8:0x003f, B:10:0x004a, B:13:0x0051, B:14:0x0069, B:16:0x006d, B:19:0x0076, B:21:0x007c, B:22:0x0099, B:24:0x00a8, B:26:0x00bd, B:28:0x00c3, B:29:0x00e9, B:31:0x00ed, B:32:0x00f0, B:34:0x00f4, B:35:0x00f7, B:36:0x00fd, B:38:0x0103, B:43:0x008a, B:45:0x005c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void q4() {
        /*
            r4 = this;
            Z4.j1 r0 = r4.z3()     // Catch: java.lang.Exception -> L26
            q6.w r0 = r0.O()     // Catch: java.lang.Exception -> L26
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L26
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L26
            if (r0 != 0) goto L29
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Exception -> L26
            r0.<init>()     // Catch: java.lang.Exception -> L26
            Y4.c r1 = r4.v3()     // Catch: java.lang.Exception -> L26
            androidx.core.widget.NestedScrollView r1 = r1.f12505T     // Catch: java.lang.Exception -> L26
            r1.getHitRect(r0)     // Catch: java.lang.Exception -> L26
            r4.i6(r0)     // Catch: java.lang.Exception -> L26
            goto L29
        L26:
            r0 = move-exception
            goto L10d
        L29:
            Z4.j1 r0 = r4.z3()     // Catch: java.lang.Exception -> L26
            q6.w r0 = r0.O()     // Catch: java.lang.Exception -> L26
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L26
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L26
            java.lang.String r1 = "requireContext(...)"
            if (r0 != 0) goto L5c
            c5.h r0 = r4.f13379a     // Catch: java.lang.Exception -> L26
            kotlin.jvm.internal.AbstractC3292y.f(r0)     // Catch: java.lang.Exception -> L26
            java.lang.String r0 = r0.y()     // Catch: java.lang.Exception -> L26
            if (r0 == 0) goto L5c
            int r0 = r0.length()     // Catch: java.lang.Exception -> L26
            if (r0 != 0) goto L51
            goto L5c
        L51:
            android.content.Context r0 = r4.requireContext()     // Catch: java.lang.Exception -> L26
            kotlin.jvm.internal.AbstractC3292y.h(r0, r1)     // Catch: java.lang.Exception -> L26
            r4.r6(r0)     // Catch: java.lang.Exception -> L26
            goto L69
        L5c:
            Z4.j1 r0 = r4.z3()     // Catch: java.lang.Exception -> L26
            q6.w r0 = r0.O()     // Catch: java.lang.Exception -> L26
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L26
            r0.setValue(r2)     // Catch: java.lang.Exception -> L26
        L69:
            c5.h r0 = r4.f13379a     // Catch: java.lang.Exception -> L26
            if (r0 == 0) goto L72
            java.lang.String r0 = r0.P0()     // Catch: java.lang.Exception -> L26
            goto L73
        L72:
            r0 = 0
        L73:
            r2 = 0
            if (r0 == 0) goto L8a
            boolean r0 = r4.B3()     // Catch: java.lang.Exception -> L26
            if (r0 != 0) goto L8a
            Y4.c r0 = r4.v3()     // Catch: java.lang.Exception -> L26
            Y4.F0 r0 = r0.f12557w0     // Catch: java.lang.Exception -> L26
            android.widget.RelativeLayout r0 = r0.getRoot()     // Catch: java.lang.Exception -> L26
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> L26
            goto L99
        L8a:
            Y4.c r0 = r4.v3()     // Catch: java.lang.Exception -> L26
            Y4.F0 r0 = r0.f12557w0     // Catch: java.lang.Exception -> L26
            android.widget.RelativeLayout r0 = r0.getRoot()     // Catch: java.lang.Exception -> L26
            r3 = 8
            r0.setVisibility(r3)     // Catch: java.lang.Exception -> L26
        L99:
            r4.q3()     // Catch: java.lang.Exception -> L26
            Y4.c r0 = r4.v3()     // Catch: java.lang.Exception -> L26
            androidx.core.widget.NestedScrollView r0 = r0.f12505T     // Catch: java.lang.Exception -> L26
            int r0 = r0.getScrollY()     // Catch: java.lang.Exception -> L26
            if (r0 <= 0) goto Le9
            android.content.Context r0 = r4.requireContext()     // Catch: java.lang.Exception -> L26
            kotlin.jvm.internal.AbstractC3292y.h(r0, r1)     // Catch: java.lang.Exception -> L26
            r4.w6(r0)     // Catch: java.lang.Exception -> L26
            c5.h r0 = r4.f13379a     // Catch: java.lang.Exception -> L26
            kotlin.jvm.internal.AbstractC3292y.f(r0)     // Catch: java.lang.Exception -> L26
            java.lang.String r0 = r0.c0()     // Catch: java.lang.Exception -> L26
            if (r0 == 0) goto Lc3
            int r0 = r0.length()     // Catch: java.lang.Exception -> L26
            if (r0 != 0) goto Le9
        Lc3:
            Y4.c r0 = r4.v3()     // Catch: java.lang.Exception -> L26
            com.google.android.material.appbar.CollapsingToolbarLayout r0 = r0.f12520e     // Catch: java.lang.Exception -> L26
            java.lang.String r1 = ""
            r0.setTitle(r1)     // Catch: java.lang.Exception -> L26
            Y4.c r0 = r4.v3()     // Catch: java.lang.Exception -> L26
            android.widget.TextView r0 = r0.f12547r0     // Catch: java.lang.Exception -> L26
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> L26
            Y4.c r0 = r4.v3()     // Catch: java.lang.Exception -> L26
            android.widget.TextView r0 = r0.f12547r0     // Catch: java.lang.Exception -> L26
            c5.h r1 = r4.f13379a     // Catch: java.lang.Exception -> L26
            kotlin.jvm.internal.AbstractC3292y.f(r1)     // Catch: java.lang.Exception -> L26
            java.lang.String r1 = r1.q0()     // Catch: java.lang.Exception -> L26
            r0.setText(r1)     // Catch: java.lang.Exception -> L26
        Le9:
            I4.L r0 = r4.f13387i     // Catch: java.lang.Exception -> L26
            if (r0 == 0) goto Lf0
            r0.notifyDataSetChanged()     // Catch: java.lang.Exception -> L26
        Lf0:
            I4.L r0 = r4.f13388j     // Catch: java.lang.Exception -> L26
            if (r0 == 0) goto Lf7
            r0.notifyDataSetChanged()     // Catch: java.lang.Exception -> L26
        Lf7:
            java.util.ArrayList r0 = r4.f13389k     // Catch: java.lang.Exception -> L26
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L26
        Lfd:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L26
            if (r1 == 0) goto L110
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L26
            I4.L r1 = (I4.L) r1     // Catch: java.lang.Exception -> L26
            r1.notifyDataSetChanged()     // Catch: java.lang.Exception -> L26
            goto Lfd
        L10d:
            r0.printStackTrace()
        L110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.C1541b1.q4():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q5(ArrayList arrayList) {
        LinearLayout llReviewListContainer = v3().f12554v;
        AbstractC3292y.h(llReviewListContainer, "llReviewListContainer");
        if (llReviewListContainer.getChildCount() == 0 && getContext() != null) {
            if (arrayList != null && !arrayList.isEmpty()) {
                int dimension = (int) getResources().getDimension(com.uptodown.R.dimen.margin_m);
                if (l6.n.s(getString(com.uptodown.R.string.screen_type), HintConstants.AUTOFILL_HINT_PHONE, true)) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(dimension, dimension, dimension, dimension);
                    Iterator it = arrayList.iterator();
                    AbstractC3292y.h(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC3292y.h(next, "next(...)");
                        c5.M m8 = (c5.M) next;
                        if (m8.I()) {
                            LinearLayout linearLayout = v3().f12554v;
                            Context requireContext = requireContext();
                            AbstractC3292y.h(requireContext, "requireContext(...)");
                            linearLayout.addView(j5(layoutParams, m8, requireContext));
                        } else {
                            LinearLayout linearLayout2 = v3().f12554v;
                            Context requireContext2 = requireContext();
                            AbstractC3292y.h(requireContext2, "requireContext(...)");
                            linearLayout2.addView(c5(layoutParams, m8, requireContext2));
                        }
                    }
                    return;
                }
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(dimension, dimension, dimension, dimension);
                for (int i8 = 0; i8 < arrayList.size(); i8 += 2) {
                    LinearLayout linearLayout3 = new LinearLayout(getContext());
                    linearLayout3.setOrientation(0);
                    linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams3.setMargins(0, dimension, dimension, dimension);
                    layoutParams3.weight = 1.0f;
                    if (((c5.M) arrayList.get(i8)).I()) {
                        Object obj = arrayList.get(i8);
                        AbstractC3292y.h(obj, "get(...)");
                        Context requireContext3 = requireContext();
                        AbstractC3292y.h(requireContext3, "requireContext(...)");
                        linearLayout3.addView(j5(layoutParams2, (c5.M) obj, requireContext3));
                    } else {
                        Object obj2 = arrayList.get(i8);
                        AbstractC3292y.h(obj2, "get(...)");
                        Context requireContext4 = requireContext();
                        AbstractC3292y.h(requireContext4, "requireContext(...)");
                        linearLayout3.addView(c5(layoutParams3, (c5.M) obj2, requireContext4));
                    }
                    int i9 = i8 + 1;
                    if (i9 < arrayList.size()) {
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams4.setMargins(dimension, dimension, 0, dimension);
                        layoutParams4.weight = 1.0f;
                        if (((c5.M) arrayList.get(i9)).I()) {
                            Object obj3 = arrayList.get(i9);
                            AbstractC3292y.h(obj3, "get(...)");
                            Context requireContext5 = requireContext();
                            AbstractC3292y.h(requireContext5, "requireContext(...)");
                            linearLayout3.addView(j5(layoutParams2, (c5.M) obj3, requireContext5));
                        } else {
                            Object obj4 = arrayList.get(i9);
                            AbstractC3292y.h(obj4, "get(...)");
                            Context requireContext6 = requireContext();
                            AbstractC3292y.h(requireContext6, "requireContext(...)");
                            linearLayout3.addView(c5(layoutParams4, (c5.M) obj4, requireContext6));
                        }
                    } else {
                        linearLayout3.addView(i5(layoutParams3));
                    }
                    v3().f12554v.addView(linearLayout3);
                }
                return;
            }
            v3().f12554v.setVisibility(8);
            v3().f12492G.setVisibility(8);
        }
    }

    private final void q6(String str) {
        if (getContext() != null && !UptodownApp.f29249C.W("GenerateQueueWorker", getContext())) {
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 0).putBoolean("downloadAnyway", false).putString("packagename", str).build();
            AbstractC3292y.h(build, "build(...)");
            WorkManager.getInstance(requireContext()).enqueue(new OneTimeWorkRequest.Builder(GenerateQueueWorker.class).addTag("GenerateQueueWorker").setInputData(build).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r2(C1541b1 c1541b1, View view) {
        Context requireContext = c1541b1.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        c1541b1.l3(requireContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:            if (r0.length() != 0) goto L22;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void r3() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.C1541b1.r3():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r4(C2040e c2040e) {
        if (getActivity() != null && (getActivity() instanceof MainActivity)) {
            FragmentActivity activity = getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).n8(c2040e);
        } else if (getActivity() != null && (getActivity() instanceof AppDetailActivity)) {
            FragmentActivity activity2 = getActivity();
            AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).z3(c2040e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r5(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    c5.V v8 = (c5.V) it.next();
                    String a9 = v8.a();
                    if (a9 != null && a9.length() != 0) {
                        arrayList3.add(v8);
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = arrayList.get(i8);
                AbstractC3292y.h(obj, "get(...)");
                c5.N n8 = (c5.N) obj;
                if (n8.a() == 0) {
                    arrayList4.add(n8);
                }
            }
            kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
            F f8 = new F(arrayList4, t8, arrayList3);
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList3);
            arrayList5.addAll(arrayList4);
            t8.f34573a = new I4.E(arrayList5, f8);
            v3().f12502Q.setAdapter((RecyclerView.Adapter) t8.f34573a);
            v3().f12502Q.setVisibility(0);
            return;
        }
        v3().f12502Q.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r6(Context context) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new X(context, null), 3, null);
    }

    private final void s2(final C1534y c1534y) {
        TextView textView = c1534y.f13091o;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        c1534y.f13089m.setTypeface(aVar.v());
        c1534y.f13090n.setTypeface(aVar.v());
        c1534y.f13088l.setTypeface(aVar.v());
        c1534y.f13086j.setTypeface(aVar.v());
        c1534y.f13087k.setTypeface(aVar.u());
        c1534y.f13092p.setTypeface(aVar.u());
        c1534y.f13082f.setOnClickListener(new View.OnClickListener() { // from class: Z4.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.t2(C1541b1.this, view);
            }
        });
        c1534y.f13082f.setFocusable(true);
        c1534y.f13078b.setOnClickListener(new View.OnClickListener() { // from class: Z4.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.u2(C1534y.this, this, view);
            }
        });
        c1534y.f13079c.setOnClickListener(new View.OnClickListener() { // from class: Z4.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.v2(C1534y.this, this, view);
            }
        });
        c1534y.f13087k.setOnClickListener(new View.OnClickListener() { // from class: Z4.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1541b1.w2(C1541b1.this, view);
            }
        });
        c1534y.f13087k.setFocusable(true);
    }

    private final void s3() {
        C2043h c2043h = this.f13379a;
        if (c2043h != null) {
            AbstractC3292y.f(c2043h);
            if (c2043h.r0() != null) {
                C2043h c2043h2 = this.f13379a;
                AbstractC3292y.f(c2043h2);
                String r02 = c2043h2.r0();
                AbstractC3292y.f(r02);
                if (r02.length() > 0) {
                    if (v3().f12500O.f12198e.getVisibility() == 0) {
                        v3().f12500O.f12195b.setText(com.uptodown.R.string.read_less_desc_app_detail);
                        v3().f12500O.f12198e.setVisibility(8);
                        v3().f12500O.f12197d.setMaxLines(Integer.MAX_VALUE);
                        v3().f12500O.f12197d.setEllipsize(null);
                        return;
                    }
                    v3().f12500O.f12195b.setText(com.uptodown.R.string.read_more_desc_app_detail);
                    v3().f12500O.f12198e.setVisibility(0);
                    v3().f12500O.f12197d.setMaxLines(6);
                    v3().f12500O.f12197d.setEllipsize(TextUtils.TruncateAt.END);
                    v3().f12505T.smoothScrollTo(0, v3().f12500O.f12196c.getTop(), 1000);
                }
            }
        }
    }

    private final void s4() {
        C2043h c2043h;
        if (getActivity() != null && !requireActivity().isFinishing() && (c2043h = this.f13379a) != null) {
            AbstractC3292y.f(c2043h);
            if (c2043h.v0() != null) {
                C2043h c2043h2 = this.f13379a;
                AbstractC3292y.f(c2043h2);
                if (!l6.n.s(c2043h2.v0(), requireActivity().getPackageName(), true)) {
                    PackageManager packageManager = requireActivity().getPackageManager();
                    C2043h c2043h3 = this.f13379a;
                    AbstractC3292y.f(c2043h3);
                    String v02 = c2043h3.v0();
                    AbstractC3292y.f(v02);
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(v02);
                    if (launchIntentForPackage != null) {
                        startActivity(launchIntentForPackage);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s5(ArrayList arrayList, boolean z8) {
        int i8;
        if (getContext() != null && this.f13379a != null && arrayList != null && !arrayList.isEmpty()) {
            G g8 = new G();
            H h8 = new H();
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            if (z8) {
                i8 = 25;
            } else {
                i8 = 20;
            }
            I4.L l8 = new I4.L(g8, h8, requireContext, i8);
            this.f13387i = l8;
            AbstractC3292y.f(l8);
            l8.d(arrayList);
            v3().f12503R.setAdapter(this.f13387i);
            v3().f12503R.setNestedScrollingEnabled(false);
            v3().f12503R.setItemAnimator(null);
            v3().f12503R.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            v3().f12498M.setVisibility(0);
            return;
        }
        v3().f12498M.setVisibility(8);
    }

    private final void s6() {
        v3().f12496K.f12601e.setVisibility(0);
        v3().f12496K.f12599c.setVisibility(8);
        v3().f12493H.f12784f.setVisibility(0);
        v3().f12493H.f12783e.setVisibility(8);
        v3().f12489D.f13082f.setVisibility(0);
        v3().f12489D.f13083g.setVisibility(8);
        v3().f12489D.f13087k.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t2(C1541b1 c1541b1, View view) {
        Context requireContext = c1541b1.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        c1541b1.l3(requireContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t3() {
        if (getContext() != null) {
            UptodownApp.a aVar = UptodownApp.f29249C;
            if (aVar.y() > 0) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, aVar.y());
                ImageView imageView = this.f13383e;
                if (imageView != null) {
                    imageView.setLayoutParams(layoutParams);
                }
                v3().f12520e.setScrimVisibleHeightTrigger((int) (aVar.y() * 0.4d));
            }
        }
    }

    private final void t4() {
        if (getActivity() != null && !requireActivity().isFinishing() && this.f13379a != null) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            C2043h c2043h = this.f13379a;
            AbstractC3292y.f(c2043h);
            intent.setData(Uri.fromParts("package", c2043h.v0(), null));
            intent.addFlags(268435456);
            intent.addFlags(8388608);
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e8) {
                e8.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t5(ArrayList arrayList) {
        LinearLayout llFloatingCategoriesAppDetail = v3().f12544q;
        AbstractC3292y.h(llFloatingCategoriesAppDetail, "llFloatingCategoriesAppDetail");
        if (llFloatingCategoriesAppDetail.getChildCount() == 0) {
            v3().f12517c0.setVisibility(8);
            if (getActivity() != null) {
                Iterator it = arrayList.iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    final c5.P p8 = (c5.P) next;
                    Y4.G c8 = Y4.G.c(getLayoutInflater());
                    AbstractC3292y.h(c8, "inflate(...)");
                    I i8 = new I();
                    J j8 = new J();
                    Context requireContext = requireContext();
                    AbstractC3292y.h(requireContext, "requireContext(...)");
                    I4.L l8 = new I4.L(i8, j8, requireContext, 20);
                    l8.d(p8.a());
                    c8.f12183e.setTypeface(J4.j.f4395g.u());
                    c8.f12183e.setText(p8.b().h());
                    c8.f12181c.setOnClickListener(new View.OnClickListener() { // from class: Z4.e0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C1541b1.u5(C1541b1.this, p8, view);
                        }
                    });
                    c8.f12182d.setAdapter(l8);
                    c8.f12182d.setNestedScrollingEnabled(false);
                    c8.f12182d.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
                    DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
                    defaultItemAnimator.setSupportsChangeAnimations(false);
                    c8.f12182d.setItemAnimator(defaultItemAnimator);
                    v3().f12544q.addView(c8.getRoot());
                    this.f13389k.add(l8);
                }
            }
            v3().f12546r.setVisibility(0);
        }
    }

    private final void t6() {
        v3().f12496K.f12601e.setVisibility(8);
        v3().f12496K.f12599c.setVisibility(0);
        v3().f12493H.f12784f.setVisibility(0);
        v3().f12493H.f12783e.setVisibility(0);
        v3().f12489D.f13084h.setVisibility(8);
        v3().f12489D.f13082f.setVisibility(8);
        v3().f12489D.f13083g.setVisibility(0);
        v3().f12489D.f13087k.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u2(C1534y c1534y, C1541b1 c1541b1, View view) {
        if (c1534y.f13078b.getVisibility() == 0) {
            c1541b1.N2();
        }
    }

    private final void u4() {
        if (getContext() != null) {
            C3791p.a aVar = C3791p.f37286s;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            C3791p a9 = aVar.a(requireActivity);
            a9.a();
            C2043h c2043h = this.f13379a;
            AbstractC3292y.f(c2043h);
            String v02 = c2043h.v0();
            AbstractC3292y.f(v02);
            C2041f S8 = a9.S(v02);
            a9.i();
            Intent intent = new Intent(requireActivity(), (Class<?>) AppInstalledDetailsActivity.class);
            intent.putExtra("appInstalled", S8);
            intent.putExtra("appInfo", this.f13379a);
            UptodownApp.a aVar2 = UptodownApp.f29249C;
            FragmentActivity requireActivity2 = requireActivity();
            AbstractC3292y.h(requireActivity2, "requireActivity(...)");
            startActivity(intent, aVar2.a(requireActivity2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u5(C1541b1 c1541b1, c5.P p8, View view) {
        if (UptodownApp.f29249C.a0()) {
            c1541b1.v4(p8.b());
        }
    }

    private final void u6() {
        v3().f12496K.f12601e.setVisibility(0);
        v3().f12496K.f12599c.setVisibility(8);
        v3().f12493H.f12784f.setVisibility(8);
        v3().f12493H.f12783e.setVisibility(0);
        v3().f12489D.f13082f.setVisibility(8);
        v3().f12489D.f13083g.setVisibility(8);
        v3().f12489D.f13087k.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v2(C1534y c1534y, C1541b1 c1541b1, View view) {
        Object obj;
        if (c1534y.f13079c.getVisibility() == 0) {
            DownloadApkWorker.a aVar = DownloadApkWorker.f31190k;
            C2043h c2043h = c1541b1.f13379a;
            AbstractC3292y.f(c2043h);
            long h8 = c2043h.h();
            C2043h c2043h2 = c1541b1.f13379a;
            AbstractC3292y.f(c2043h2);
            if (aVar.d(h8, c2043h2.m0())) {
                DownloadWorker.a aVar2 = DownloadWorker.f31208c;
                if (aVar2.c()) {
                    aVar2.h();
                    return;
                }
            }
            Iterator it = UptodownApp.f29249C.F().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    String s8 = ((c5.Q) obj).s();
                    C2043h c2043h3 = c1541b1.f13379a;
                    AbstractC3292y.f(c2043h3);
                    if (AbstractC3292y.d(s8, c2043h3.v0())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                DownloadWorker.a aVar3 = DownloadWorker.f31208c;
                if (aVar3.d()) {
                    aVar3.i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1504c v3() {
        C1504c c1504c = this.f13380b;
        AbstractC3292y.f(c1504c);
        return c1504c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v4(C2046k c2046k) {
        if (getActivity() != null && (getActivity() instanceof MainActivity)) {
            FragmentActivity activity = getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).p8(c2046k);
        } else if (getActivity() != null && (getActivity() instanceof AppDetailActivity)) {
            FragmentActivity activity2 = getActivity();
            AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).A3(c2046k);
        }
    }

    private final void v5() {
        boolean z8;
        boolean z9;
        boolean z10;
        c5.r rVar = new c5.r();
        C2043h c2043h = this.f13379a;
        AbstractC3292y.f(c2043h);
        rVar.k0(c2043h);
        C2052q c2052q = new C2052q();
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        c2052q.i(requireContext);
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        Context requireContext2 = requireContext();
        AbstractC3292y.h(requireContext2, "requireContext(...)");
        if (aVar.k1(requireContext2)) {
            z8 = c2052q.g(rVar);
            z10 = c2052q.e(rVar);
            z9 = c2052q.f(rVar);
        } else {
            z8 = true;
            z9 = true;
            z10 = true;
        }
        if (z8 && z10 && z9) {
            K2(rVar);
            return;
        }
        if (!z8) {
            n4("sdk");
            String string = getString(com.uptodown.R.string.msg_warning_incompatible_sdk);
            AbstractC3292y.h(string, "getString(...)");
            Q2(rVar, string);
            return;
        }
        if (!z10) {
            n4("abi");
            String string2 = getString(com.uptodown.R.string.msg_warning_incompatible_abi);
            AbstractC3292y.h(string2, "getString(...)");
            Q2(rVar, string2);
            return;
        }
        n4("density");
        String string3 = getString(com.uptodown.R.string.msg_warning_incompatible_density);
        AbstractC3292y.h(string3, "getString(...)");
        Q2(rVar, string3);
    }

    private final void v6() {
        v3().f12496K.f12601e.setVisibility(0);
        v3().f12496K.f12599c.setVisibility(8);
        v3().f12493H.f12784f.setVisibility(0);
        v3().f12493H.f12783e.setVisibility(8);
        v3().f12489D.f13085i.setVisibility(0);
        v3().f12489D.f13082f.setVisibility(8);
        v3().f12489D.f13083g.setVisibility(8);
        v3().f12489D.f13087k.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w2(C1541b1 c1541b1, View view) {
        c1541b1.s4();
    }

    private final void w3() {
        C2043h c2043h = this.f13379a;
        if (c2043h != null) {
            AbstractC3292y.f(c2043h);
            if (c2043h.h() > 0) {
                Z4();
                o2();
                n2();
                Q5.I i8 = Q5.I.f8786a;
                return;
            }
        }
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        new X4.i(requireContext, ((Number) z3().D().getValue()).longValue(), new C1555n(), LifecycleOwnerKt.getLifecycleScope(this));
    }

    private final void w4() {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            String string = getString(com.uptodown.R.string.dmca_title);
            AbstractC3292y.h(string, "getString(...)");
            String string2 = getString(com.uptodown.R.string.url_dmca);
            AbstractC3292y.h(string2, "getString(...)");
            C3788m c3788m = new C3788m();
            FragmentActivity requireActivity = requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            c3788m.q(requireActivity, string2, string);
        }
    }

    private final SpannableStringBuilder w5(String str) {
        String z8 = l6.n.z(l6.n.z(str, "<br />", "\n", false, 4, null), "<br/>", "\n", false, 4, null);
        List<C2051p> f8 = C2051p.f15893f.f(z8);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z8);
        int i8 = 0;
        for (C2051p c2051p : f8) {
            int b9 = c2051p.b() - i8;
            int length = c2051p.d().length() + b9;
            String e8 = c2051p.e();
            AbstractC3292y.f(e8);
            spannableStringBuilder = spannableStringBuilder.replace(b9, e8.length() + b9, (CharSequence) c2051p.d());
            String c8 = c2051p.c();
            int hashCode = c8.hashCode();
            if (hashCode != 98) {
                if (hashCode != 105) {
                    if (hashCode != 117) {
                        if (hashCode != 93028092) {
                            if (hashCode != 1524339519) {
                                if (hashCode != 3274) {
                                    if (hashCode == 3275 && c8.equals("h3")) {
                                        float dimension = getResources().getDimension(com.uptodown.R.dimen.text_size_m);
                                        Typeface u8 = J4.j.f4395g.u();
                                        AbstractC3292y.f(u8);
                                        spannableStringBuilder.setSpan(new defpackage.b(dimension, u8, ContextCompat.getColor(requireContext(), com.uptodown.R.color.text_primary)), b9, length, 33);
                                    }
                                } else if (c8.equals("h2")) {
                                    float dimension2 = getResources().getDimension(com.uptodown.R.dimen.text_size_l);
                                    Typeface u9 = J4.j.f4395g.u();
                                    AbstractC3292y.f(u9);
                                    spannableStringBuilder.setSpan(new defpackage.b(dimension2, u9, ContextCompat.getColor(requireContext(), com.uptodown.R.color.text_primary)), b9, length, 33);
                                }
                            } else if (c8.equals("floatingCategoryID")) {
                                spannableStringBuilder.setSpan(new L(c2051p, this), b9, length, 33);
                            }
                        } else if (c8.equals("appID")) {
                            spannableStringBuilder.setSpan(new K(c2051p, this), b9, length, 33);
                        }
                    } else if (c8.equals("u")) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), b9, length, 33);
                    }
                } else if (c8.equals(com.mbridge.msdk.foundation.same.report.i.f21140a)) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), b9, length, 33);
                }
            } else if (c8.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                spannableStringBuilder.setSpan(new StyleSpan(1), b9, length, 33);
            }
            String e9 = c2051p.e();
            AbstractC3292y.f(e9);
            i8 = (i8 + e9.length()) - c2051p.d().length();
        }
        return spannableStringBuilder;
    }

    private final void w6(Context context) {
        v3().f12555v0.setVisibility(8);
        v3().f12506U.setBackgroundColor(ContextCompat.getColor(context, com.uptodown.R.color.transparent));
        if (new C3788m().o(context)) {
            F5(ContextCompat.getColor(context, com.uptodown.R.color.main_blue));
            Drawable drawable = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_arrow_left);
            if (drawable != null) {
                v3().f12506U.setNavigationIcon(drawable);
            }
            Drawable drawable2 = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_menu_dots_blue);
            if (drawable2 != null) {
                v3().f12506U.setOverflowIcon(drawable2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x2(Context context) {
        if (z3().f0().getValue() != null) {
            UptodownApp.a aVar = UptodownApp.f29249C;
            Object value = z3().f0().getValue();
            AbstractC3292y.f(value);
            aVar.c0(((c5.Q) value).s(), context);
            Object value2 = z3().f0().getValue();
            AbstractC3292y.f(value2);
            String l8 = ((c5.Q) value2).l();
            if (l8 != null && l8.length() != 0) {
                C3776a c3776a = new C3776a();
                Object value3 = z3().f0().getValue();
                AbstractC3292y.f(value3);
                if (c3776a.b(context, ((c5.Q) value3).l())) {
                    C3791p a9 = C3791p.f37286s.a(context);
                    a9.a();
                    Object value4 = z3().f0().getValue();
                    AbstractC3292y.f(value4);
                    ((c5.Q) value4).X(0);
                    Object value5 = z3().f0().getValue();
                    AbstractC3292y.f(value5);
                    a9.p1((c5.Q) value5);
                    a9.i();
                }
            }
            d6(context);
            return;
        }
        C2043h c2043h = this.f13379a;
        c5.r rVar = null;
        String str = null;
        if (c2043h != null) {
            DownloadApkWorker.a aVar2 = DownloadApkWorker.f31190k;
            AbstractC3292y.f(c2043h);
            aVar2.a(c2043h.h());
            C3800y.f37330a.g(context);
            C3791p a10 = C3791p.f37286s.a(context);
            a10.a();
            C2043h c2043h2 = this.f13379a;
            AbstractC3292y.f(c2043h2);
            c5.r Z8 = a10.Z(String.valueOf(c2043h2.d0()));
            a10.z(Z8);
            if (Z8 != null) {
                str = Z8.X();
            }
            if (str != null) {
                File f8 = new C3794s().f(context);
                String X8 = Z8.X();
                AbstractC3292y.f(X8);
                File file = new File(f8, X8);
                if (file.exists()) {
                    file.delete();
                }
            }
            a10.i();
            rVar = Z8;
        }
        I5(context);
        if (getActivity() != null && (getActivity() instanceof MainActivity)) {
            if (rVar != null) {
                FragmentActivity activity = getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).G2(rVar);
            } else {
                FragmentActivity activity2 = getActivity();
                AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity2).y2();
            }
        }
    }

    private final void x3() {
        if (getContext() != null && this.f13379a != null) {
            AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new C1556o(null), 2, null);
            C1591j1 z32 = z3();
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            C2043h c2043h = this.f13379a;
            AbstractC3292y.f(c2043h);
            z32.U(requireContext, c2043h.h());
        }
    }

    private final void x4(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e8) {
            W2(String.valueOf(e8.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x6(Context context) {
        v3().f12555v0.setVisibility(0);
        v3().f12506U.setBackgroundColor(ContextCompat.getColor(context, com.uptodown.R.color.transparent));
        F5(ContextCompat.getColor(context, com.uptodown.R.color.white));
        Drawable drawable = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_arrow_left_white);
        if (drawable != null) {
            v3().f12506U.setNavigationIcon(drawable);
        }
        Drawable drawable2 = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_menu_dots);
        if (drawable2 != null) {
            v3().f12506U.setOverflowIcon(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y2(final View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: Z4.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1541b1.z2(C1541b1.this, view, view2);
            }
        });
    }

    private final long y3() {
        String str;
        try {
            C2043h c2043h = this.f13379a;
            if (c2043h != null) {
                str = c2043h.P0();
            } else {
                str = null;
            }
            if (str != null) {
                C2043h c2043h2 = this.f13379a;
                AbstractC3292y.f(c2043h2);
                String P02 = c2043h2.P0();
                AbstractC3292y.f(P02);
                return Long.parseLong(P02);
            }
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
        return 0L;
    }

    private final void y4() {
        if (!requireActivity().isFinishing()) {
            Intent intent = new Intent(requireActivity(), (Class<?>) InformationActivity.class);
            UptodownApp.a aVar = UptodownApp.f29249C;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            startActivity(intent, aVar.a(requireActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y5(View view, Context context) {
        ViewTreeObserver viewTreeObserver;
        if (SettingsPreferences.f30529b.M(context) && view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new M(view, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z2(final C1541b1 c1541b1, View view, View view2) {
        if (UptodownApp.f29249C.a0()) {
            FragmentActivity activity = c1541b1.getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
            if (o22 != null) {
                o22.dismiss();
            }
            if (view.getContext() != null) {
                C1530u c8 = C1530u.c(c1541b1.getLayoutInflater());
                AbstractC3292y.h(c8, "inflate(...)");
                TextView textView = c8.f13008f;
                j.a aVar = J4.j.f4395g;
                textView.setTypeface(aVar.u());
                c8.f13008f.setText(c1541b1.getString(com.uptodown.R.string.cancel_registration));
                c8.f13006d.setTypeface(aVar.v());
                TextView textView2 = c8.f13006d;
                C3788m c3788m = new C3788m();
                C2043h c2043h = c1541b1.f13379a;
                AbstractC3292y.f(c2043h);
                String string = c1541b1.getString(com.uptodown.R.string.confirm_cancel_preregister, c2043h.q0());
                AbstractC3292y.h(string, "getString(...)");
                C2043h c2043h2 = c1541b1.f13379a;
                AbstractC3292y.f(c2043h2);
                String q02 = c2043h2.q0();
                AbstractC3292y.f(q02);
                Context context = view.getContext();
                AbstractC3292y.h(context, "getContext(...)");
                textView2.setText(c3788m.d(string, q02, context));
                c8.f13005c.setTypeface(aVar.u());
                c8.f13007e.setTypeface(aVar.u());
                c8.f13007e.setText(c1541b1.getString(com.uptodown.R.string.dialog_confirmation_verify_afirmative));
                c8.f13005c.setVisibility(0);
                c8.f13005c.setOnClickListener(new View.OnClickListener() { // from class: Z4.M0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C1541b1.A2(C1541b1.this, view3);
                    }
                });
                c8.f13007e.setOnClickListener(new View.OnClickListener() { // from class: Z4.N0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C1541b1.B2(C1541b1.this, view3);
                    }
                });
                c8.f13004b.setOnClickListener(new View.OnClickListener() { // from class: Z4.O0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C1541b1.C2(C1541b1.this, view3);
                    }
                });
                AlertDialog.Builder builder = new AlertDialog.Builder(c1541b1.requireContext());
                builder.setView(c8.getRoot());
                builder.setCancelable(true);
                c1541b1.j6(builder);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1591j1 z3() {
        return (C1591j1) this.f13381c.getValue();
    }

    private final void z4() {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            Intent intent = new Intent(requireActivity(), (Class<?>) LoginActivity.class);
            ActivityResultLauncher activityResultLauncher = this.f13390l;
            UptodownApp.a aVar = UptodownApp.f29249C;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            activityResultLauncher.launch(intent, aVar.b(requireActivity));
        }
    }

    private final void z5(String str) {
        int intValue = ((Number) z3().X().getValue()).intValue();
        if (1 <= intValue && intValue < 6) {
            AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new N(null), 2, null);
            C1591j1 z32 = z3();
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            int intValue2 = ((Number) z3().X().getValue()).intValue();
            C2043h c2043h = this.f13379a;
            AbstractC3292y.f(c2043h);
            z32.l0(requireContext, str, intValue2, c2043h.h());
            return;
        }
        Toast.makeText(requireContext(), getString(com.uptodown.R.string.error_review_no_valoration), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z6(c5.M m8, int i8) {
        int dimension = (int) getResources().getDimension(com.uptodown.R.dimen.margin_m);
        LinearLayout llReviewListContainer = v3().f12554v;
        AbstractC3292y.h(llReviewListContainer, "llReviewListContainer");
        if (llReviewListContainer.getChildCount() > i8) {
            v3().f12554v.removeViewAt(i8);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(dimension, dimension, dimension, dimension);
        if (m8.I()) {
            LinearLayout linearLayout = v3().f12554v;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            linearLayout.addView(j5(layoutParams, m8, requireContext), i8);
            return;
        }
        LinearLayout linearLayout2 = v3().f12554v;
        Context requireContext2 = requireContext();
        AbstractC3292y.h(requireContext2, "requireContext(...)");
        linearLayout2.addView(c5(layoutParams, m8, requireContext2), i8);
    }

    public final void A6(String packagename) {
        AbstractC3292y.i(packagename, "packagename");
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new Z(packagename, null), 2, null);
    }

    public final void B5(C2043h c2043h) {
        this.f13379a = c2043h;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        z3().x().setValue(Boolean.FALSE);
        this.f13382d = new C3795t(requireActivity());
        UptodownApp.a aVar = UptodownApp.f29249C;
        h2.e n8 = aVar.n();
        if (n8 != null) {
            n8.pause();
        }
        h2.e o8 = aVar.o();
        if (o8 != null) {
            o8.pause();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            z3().D().setValue(Long.valueOf(arguments.getLong("appId")));
            if (arguments.containsKey("appInfo")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = arguments.getParcelable("appInfo", C2043h.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = arguments.getParcelable("appInfo");
                }
                this.f13379a = (C2043h) parcelable;
            }
        }
        C1591j1 z32 = z3();
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        C2043h c2043h = this.f13379a;
        AbstractC3292y.f(c2043h);
        long h8 = c2043h.h();
        C2043h c2043h2 = this.f13379a;
        AbstractC3292y.f(c2043h2);
        boolean z8 = true;
        if (c2043h2.f0() != 1) {
            z8 = false;
        }
        z32.v(requireContext, h8, z8);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        if (getActivity() != null) {
            View A32 = A3(inflater, viewGroup);
            FragmentActivity requireActivity = requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            E3(requireActivity);
            return A32;
        }
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        try {
            MBBannerView mbBannerView = v3().f12560z;
            AbstractC3292y.h(mbBannerView, "mbBannerView");
            mbBannerView.release();
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        z3().K().setValue(Boolean.valueOf(!((Boolean) z3().K().getValue()).booleanValue()));
        MBBannerView mbBannerView = v3().f12560z;
        AbstractC3292y.h(mbBannerView, "mbBannerView");
        mbBannerView.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C3795t c3795t = this.f13382d;
        if (c3795t != null) {
            c3795t.g("AppDetailsFragment");
        }
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new C1560s(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new C1561t(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new C1562u(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new C1563v(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new C1564w(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new C1565x(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new C1566y(null), 2, null);
        q4();
        MBBannerView mbBannerView = v3().f12560z;
        AbstractC3292y.h(mbBannerView, "mbBannerView");
        mbBannerView.onResume();
    }

    public final C2043h u3() {
        return this.f13379a;
    }

    public final void x5() {
        w3();
    }

    public final void y6(String str) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new Y(str, this, null), 2, null);
    }

    /* renamed from: Z4.b1$O */
    /* loaded from: classes5.dex */
    public static final class O implements b5.r {
        O() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q5.I d(C1541b1 c1541b1, C2043h c2043h) {
            c1541b1.y6(c2043h.v0());
            return Q5.I.f8786a;
        }

        @Override // b5.r
        public void c(final C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            FragmentActivity activity = C1541b1.this.getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            final C1541b1 c1541b1 = C1541b1.this;
            ((MainActivity) activity).p7(appInfo, new Function0() { // from class: Z4.g1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Q5.I d8;
                    d8 = C1541b1.O.d(C1541b1.this, appInfo);
                    return d8;
                }
            });
        }

        @Override // b5.r
        public void b(int i8) {
        }
    }

    /* renamed from: Z4.b1$P */
    /* loaded from: classes5.dex */
    public static final class P implements b5.r {
        P() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q5.I d(C1541b1 c1541b1, C2043h c2043h) {
            c1541b1.y6(c2043h.v0());
            return Q5.I.f8786a;
        }

        @Override // b5.r
        public void c(final C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            FragmentActivity activity = C1541b1.this.getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            final C1541b1 c1541b1 = C1541b1.this;
            ((AppDetailActivity) activity).t3(appInfo, new Function0() { // from class: Z4.h1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Q5.I d8;
                    d8 = C1541b1.P.d(C1541b1.this, appInfo);
                    return d8;
                }
            });
        }

        @Override // b5.r
        public void b(int i8) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b4(View view) {
    }
}
