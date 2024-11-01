package d5;

import J4.j;
import Q5.I;
import Q5.t;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import c5.C2041f;
import c6.InterfaceC2072n;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2691a;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.AppInstalledDetailsActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.Updates;
import com.uptodown.activities.WishlistActivity;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import n6.N;

/* renamed from: d5.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ResultReceiverC2763f extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31507a = new a(null);

    /* renamed from: d5.f$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: d5.f$b */
    /* loaded from: classes5.dex */
    static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31508a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f31509b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f31510c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f31511d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, int i8, String str, U5.d dVar) {
            super(2, dVar);
            this.f31509b = activity;
            this.f31510c = i8;
            this.f31511d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f31509b, this.f31510c, this.f31511d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31508a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                AppInstalledDetailsActivity appInstalledDetailsActivity = (AppInstalledDetailsActivity) this.f31509b;
                int i9 = this.f31510c;
                String str = this.f31511d;
                this.f31508a = 1;
                if (appInstalledDetailsActivity.o5(i9, str, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* renamed from: d5.f$c */
    /* loaded from: classes5.dex */
    static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31512a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f31513b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f31514c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Activity activity, T t8, U5.d dVar) {
            super(2, dVar);
            this.f31513b = activity;
            this.f31514c = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f31513b, this.f31514c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31512a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                AppDetailActivity appDetailActivity = (AppDetailActivity) this.f31513b;
                Object obj2 = this.f31514c.f34573a;
                AbstractC3292y.f(obj2);
                this.f31512a = 1;
                if (appDetailActivity.x3((String) obj2, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public ResultReceiverC2763f(Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i8, Bundle bundle) {
        String str;
        ArrayList parcelableArrayList;
        ArrayList parcelableArrayList2;
        if (UptodownApp.f29249C.Q()) {
            j.a aVar = j.f4395g;
            if (aVar.f() != null) {
                Activity f8 = aVar.f();
                String str2 = null;
                String str3 = null;
                ArrayList arrayList = null;
                String str4 = null;
                ArrayList arrayList2 = null;
                String str5 = null;
                if (f8 instanceof Updates) {
                    if (i8 != 104) {
                        if (i8 != 105) {
                            if (i8 != 110) {
                                if (bundle != null) {
                                    str3 = bundle.getString("packagename");
                                }
                                Updates updates = (Updates) f8;
                                updates.s5(i8, str3);
                                if (updates.i4()) {
                                    updates.v4(i8);
                                    return;
                                }
                                return;
                            }
                            ((Updates) f8).runOnUiThread(new AbstractActivityC2691a.b());
                            return;
                        }
                        if (bundle != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelableArrayList2 = bundle.getParcelableArrayList("apps_parcelable", C2041f.class);
                            } else {
                                parcelableArrayList2 = bundle.getParcelableArrayList("apps_parcelable");
                            }
                            arrayList = parcelableArrayList2;
                        }
                        if (arrayList != null) {
                            ((Updates) f8).p5(arrayList);
                            return;
                        }
                        return;
                    }
                    ((Updates) f8).s5(104, null);
                    return;
                }
                if (f8 instanceof MyApps) {
                    if (i8 != 105) {
                        if (i8 != 110) {
                            MyApps myApps = (MyApps) f8;
                            if (myApps.i4()) {
                                myApps.v4(i8);
                                return;
                            }
                            if (bundle != null) {
                                str4 = bundle.getString("packagename");
                            }
                            myApps.c5(i8, str4);
                            return;
                        }
                        ((MyApps) f8).runOnUiThread(new AbstractActivityC2691a.b());
                        return;
                    }
                    if (bundle != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelableArrayList = bundle.getParcelableArrayList("apps_parcelable", C2041f.class);
                        } else {
                            parcelableArrayList = bundle.getParcelableArrayList("apps_parcelable");
                        }
                        arrayList2 = parcelableArrayList;
                    }
                    if (arrayList2 != null) {
                        ((MyApps) f8).W4(arrayList2);
                        return;
                    }
                    return;
                }
                if (f8 instanceof AppInstalledDetailsActivity) {
                    if (i8 != 105 && i8 != 110) {
                        if (bundle != null) {
                            str = bundle.getString("packagename");
                        } else {
                            str = null;
                        }
                        AbstractC3462k.d(N.a(C3445b0.c()), null, null, new b(f8, i8, str, null), 3, null);
                        return;
                    }
                    ((AppInstalledDetailsActivity) f8).runOnUiThread(new AbstractActivityC2691a.b());
                    return;
                }
                if (f8 instanceof MainActivity) {
                    if (i8 == 103) {
                        ((MainActivity) f8).g8();
                    }
                    if (bundle != null) {
                        str5 = bundle.getString("packagename");
                    }
                    MainActivity mainActivity = (MainActivity) f8;
                    mainActivity.runOnUiThread(new MainActivity.RunnableC2686e(i8, str5));
                    mainActivity.j8(str5);
                    return;
                }
                if (f8 instanceof AppDetailActivity) {
                    T t8 = new T();
                    if (bundle != null) {
                        t8.f34573a = bundle.getString("packagename");
                    }
                    AppDetailActivity appDetailActivity = (AppDetailActivity) f8;
                    appDetailActivity.runOnUiThread(new AppDetailActivity.b(i8, (String) t8.f34573a));
                    if (t8.f34573a != null) {
                        AbstractC3462k.d(N.a(C3445b0.c()), null, null, new c(f8, t8, null), 3, null);
                        return;
                    }
                    return;
                }
                if (f8 instanceof WishlistActivity) {
                    if (bundle != null) {
                        str2 = bundle.getString("packagename");
                    }
                    ((WishlistActivity) f8).a5(str2);
                }
            }
        }
    }
}
