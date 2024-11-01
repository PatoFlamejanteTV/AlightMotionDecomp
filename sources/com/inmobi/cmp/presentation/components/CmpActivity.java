package com.inmobi.cmp.presentation.components;

import Q5.I;
import Q5.t;
import Q7.f;
import Q7.m;
import S7.g;
import U5.d;
import a8.c;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import c.C1995c;
import c.C2001i;
import c6.InterfaceC2072n;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.cmpapi.status.DisplayStatus;
import com.inmobi.cmp.data.model.ChoiceColor;
import com.inmobi.cmp.data.model.ThemeMode;
import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import q.C3599f;

/* loaded from: classes4.dex */
public final class CmpActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f19087b = 0;

    /* renamed from: a, reason: collision with root package name */
    public c f19088a;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19089a;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            iArr[ThemeMode.LIGHT.ordinal()] = 1;
            iArr[ThemeMode.DARK.ordinal()] = 2;
            f19089a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public int f19090a;

        public b(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new b(dVar);
        }

        @Override // c6.InterfaceC2072n
        public Object invoke(Object obj, Object obj2) {
            return new b((d) obj2).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String string;
            boolean z8;
            Object e8 = V5.b.e();
            int i8 = this.f19090a;
            c cVar = null;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                c cVar2 = CmpActivity.this.f19088a;
                if (cVar2 != null) {
                    this.f19090a = 1;
                    obj = AbstractC3458i.g(C3445b0.b(), new a8.b(cVar2, null), this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }
            Y7.d dVar = Y7.d.f13152a;
            Y7.d.f13157f = (S7.c) obj;
            CmpActivity cmpActivity = CmpActivity.this;
            int i9 = CmpActivity.f19087b;
            Bundle extras = cmpActivity.getIntent().getExtras();
            if (extras == null) {
                string = null;
            } else {
                string = extras.getString("EXTRA_ACTION");
            }
            if (string != null) {
                int hashCode = string.hashCode();
                boolean z9 = false;
                if (hashCode != -2113348999) {
                    if (hashCode != -1969243076) {
                        if (hashCode != 1166950650) {
                            if (hashCode == 1517267649 && string.equals("ACTION_SHOW_CCPA_SCREEN")) {
                                if (!cmpActivity.isFinishing()) {
                                    FragmentManager supportFragmentManager = cmpActivity.getSupportFragmentManager();
                                    AbstractC3292y.h(supportFragmentManager, "supportFragmentManager");
                                    if (!supportFragmentManager.isDestroyed() && !supportFragmentManager.isStateSaved()) {
                                        if (ChoiceCmp.INSTANCE.isViewModelAvailable$app_release()) {
                                            m mVar = m.f9074a;
                                            mVar.e(f.CCPA, false);
                                            if (C2001i.f15173b) {
                                                mVar.e(f.USPWITHGBC, false);
                                            }
                                            supportFragmentManager.beginTransaction().add(new Z7.d(), Z7.d.f14014y).commit();
                                        } else {
                                            A5.b.a(A5.b.f238a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
                                            cmpActivity.finish();
                                        }
                                    }
                                }
                            }
                        } else if (string.equals("ACTION_SHOW_CMP_DIALOG")) {
                            Bundle extras2 = cmpActivity.getIntent().getExtras();
                            if (extras2 != null) {
                                z9 = extras2.getBoolean("EXTRA_FORCE", false);
                            }
                            g c8 = dVar.p().c();
                            if (c8.f9858a.length() > 0 && c8.f9859b.length() > 0 && c8.f9860c.length() > 0 && c8.f9861d.length() > 0) {
                                m mVar2 = m.f9074a;
                                boolean z10 = !z9;
                                mVar2.e(f.GDPR, z10);
                                if (C2001i.f15173b) {
                                    mVar2.e(f.GDPRWITHGBC, z10);
                                }
                                I5.f fVar = new I5.f();
                                String simpleName = I5.f.class.getSimpleName();
                                AbstractC3292y.h(simpleName, "PrivacyBottomSheet::class.java.simpleName");
                                if (!cmpActivity.isFinishing()) {
                                    FragmentManager supportFragmentManager2 = cmpActivity.getSupportFragmentManager();
                                    AbstractC3292y.h(supportFragmentManager2, "supportFragmentManager");
                                    if (!supportFragmentManager2.isDestroyed() && !supportFragmentManager2.isStateSaved()) {
                                        fVar.show(supportFragmentManager2, simpleName);
                                    }
                                }
                                ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
                                ChoiceCmpCallback callback = choiceCmp.getCallback();
                                if (callback != null) {
                                    callback.onCmpUIShown(choiceCmp.ping$app_release(true, CmpStatus.LOADED, DisplayStatus.VISIBLE));
                                }
                            } else {
                                A5.b.a(A5.b.f238a, ChoiceError.MISSING_INIT_SCREEN_TEXTS, null, null, null, null, 30);
                                cmpActivity.finish();
                            }
                        }
                    } else if (string.equals("ACTION_SHOW_GBC_SCREEN")) {
                        if (!cmpActivity.isFinishing()) {
                            FragmentManager supportFragmentManager3 = cmpActivity.getSupportFragmentManager();
                            AbstractC3292y.h(supportFragmentManager3, "supportFragmentManager");
                            if (!supportFragmentManager3.isDestroyed() && !supportFragmentManager3.isStateSaved()) {
                                if (ChoiceCmp.INSTANCE.isViewModelAvailable$app_release()) {
                                    m.f9074a.e(f.GBC, false);
                                    supportFragmentManager3.beginTransaction().add(new C1995c(), C1995c.f15153r).commit();
                                } else {
                                    A5.b.a(A5.b.f238a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
                                    cmpActivity.finish();
                                }
                            }
                        }
                    }
                } else if (string.equals("ACTION_SHOW_US_REGULATION_SCREEN")) {
                    Bundle extras3 = cmpActivity.getIntent().getExtras();
                    if (extras3 == null) {
                        z8 = false;
                    } else {
                        z8 = extras3.getBoolean("EXTRA_FORCE", false);
                    }
                    if (!cmpActivity.isFinishing()) {
                        FragmentManager supportFragmentManager4 = cmpActivity.getSupportFragmentManager();
                        AbstractC3292y.h(supportFragmentManager4, "supportFragmentManager");
                        if (!supportFragmentManager4.isDestroyed() && !supportFragmentManager4.isStateSaved()) {
                            if (ChoiceCmp.INSTANCE.isViewModelAvailable$app_release()) {
                                if (C2001i.f15173b) {
                                    m.f9074a.e(f.USPWITHGBC, false);
                                }
                                c cVar3 = cmpActivity.f19088a;
                                if (cVar3 != null) {
                                    cVar = cVar3;
                                } else {
                                    AbstractC3292y.y("viewModel");
                                }
                                if (cVar.f14162b.f4497b.f4448M) {
                                    String str = Y7.d.f13165n;
                                    H6.g state = H6.g.CALIFORNIA;
                                    AbstractC3292y.i(state, "state");
                                    if (AbstractC3292y.d(str, DownloadCommon.DOWNLOAD_REPORT_CANCEL)) {
                                        m.f9074a.e(f.CCPA, false);
                                        supportFragmentManager4.beginTransaction().add(new Z7.d(), Z7.d.f14014y).commit();
                                    }
                                }
                                m.f9074a.e(f.MSPA, !z8);
                                supportFragmentManager4.beginTransaction().add(new C3599f(), C3599f.f36557y).commit();
                            } else {
                                A5.b.a(A5.b.f238a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
                                cmpActivity.finish();
                            }
                        }
                    }
                }
                return I.f8786a;
            }
            cmpActivity.finish();
            return I.f8786a;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i8;
        ChoiceColor darkModeColors;
        super.onCreate(bundle);
        Y7.d dVar = Y7.d.f13152a;
        ThemeMode themeMode = Y7.d.f13155d.getThemeMode();
        if (themeMode == null) {
            i8 = -1;
        } else {
            i8 = a.f19089a[themeMode.ordinal()];
        }
        if (i8 != 1) {
            if (i8 == 2) {
                getDelegate().setLocalNightMode(2);
            }
        } else {
            getDelegate().setLocalNightMode(1);
        }
        AbstractC3292y.i(this, "context");
        AbstractC3292y.i(this, "context");
        if (Y7.d.f13177z == null) {
            if (Y7.d.f13155d.getThemeMode() == ThemeMode.LIGHT) {
                darkModeColors = Y7.d.f13155d.getLightModeColors();
            } else if (Y7.d.f13155d.getThemeMode() == ThemeMode.DARK) {
                darkModeColors = Y7.d.f13155d.getDarkModeColors();
            } else if (Y7.d.f13155d.getLightModeColors() != null && Y7.d.f13155d.getDarkModeColors() != null) {
                int i9 = getResources().getConfiguration().uiMode & 48;
                if (i9 != 16) {
                    if (i9 == 32) {
                        darkModeColors = Y7.d.f13155d.getDarkModeColors();
                    }
                    darkModeColors = Y7.d.f13155d.getLightModeColors();
                } else {
                    darkModeColors = Y7.d.f13155d.getLightModeColors();
                }
            } else {
                if (Y7.d.f13155d.getLightModeColors() == null) {
                    darkModeColors = Y7.d.f13155d.getDarkModeColors();
                }
                darkModeColors = Y7.d.f13155d.getLightModeColors();
            }
            Y7.d.f13177z = new U7.b(darkModeColors, new W7.a());
        }
        U7.a aVar = Y7.d.f13177z;
        if (aVar == null) {
            AbstractC3292y.y("choiceStyleSheetRepository");
            aVar = null;
        }
        c cVar = new c(aVar, dVar.j());
        AbstractC3292y.i(cVar, "<set-?>");
        this.f19088a = cVar;
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(null), 3, null);
    }
}
