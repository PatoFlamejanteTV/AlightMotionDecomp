package com.uptodown.activities;

import J4.j;
import Q5.InterfaceC1416k;
import Y4.K0;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import com.inmobi.cmp.ChoiceCmp;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.GdprPrivacySettings;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3774G;
import q5.C3788m;
import q5.C3795t;

/* loaded from: classes4.dex */
public final class GdprPrivacySettings extends AbstractActivityC2691a {

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f29541O = Q5.l.b(new Function0() { // from class: F4.Q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.K0 i32;
            i32 = GdprPrivacySettings.i3(GdprPrivacySettings.this);
            return i32;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final K0 i3(GdprPrivacySettings gdprPrivacySettings) {
        return K0.c(gdprPrivacySettings.getLayoutInflater());
    }

    private final K0 j3() {
        return (K0) this.f29541O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(GdprPrivacySettings gdprPrivacySettings, View view) {
        gdprPrivacySettings.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(GdprPrivacySettings gdprPrivacySettings, CompoundButton compoundButton, boolean z8) {
        SwitchCompat sAnalyticsWizardPrivacy = gdprPrivacySettings.j3().f12250k;
        AbstractC3292y.h(sAnalyticsWizardPrivacy, "sAnalyticsWizardPrivacy");
        TextView tvDescriptionAnalyticsWizardPrivacy = gdprPrivacySettings.j3().f12257r;
        AbstractC3292y.h(tvDescriptionAnalyticsWizardPrivacy, "tvDescriptionAnalyticsWizardPrivacy");
        gdprPrivacySettings.w3(sAnalyticsWizardPrivacy, tvDescriptionAnalyticsWizardPrivacy, z8);
        gdprPrivacySettings.u3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m3(GdprPrivacySettings gdprPrivacySettings, CompoundButton compoundButton, boolean z8) {
        SwitchCompat sErrorLogWizardPrivacy = gdprPrivacySettings.j3().f12252m;
        AbstractC3292y.h(sErrorLogWizardPrivacy, "sErrorLogWizardPrivacy");
        TextView tvDescriptionErrorLogWizardPrivacy = gdprPrivacySettings.j3().f12259t;
        AbstractC3292y.h(tvDescriptionErrorLogWizardPrivacy, "tvDescriptionErrorLogWizardPrivacy");
        gdprPrivacySettings.w3(sErrorLogWizardPrivacy, tvDescriptionErrorLogWizardPrivacy, z8);
        gdprPrivacySettings.u3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n3(GdprPrivacySettings gdprPrivacySettings, View view) {
        gdprPrivacySettings.s3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(GdprPrivacySettings gdprPrivacySettings, CompoundButton compoundButton, boolean z8) {
        SwitchCompat sDeviceAnalysisWizardPrivacy = gdprPrivacySettings.j3().f12251l;
        AbstractC3292y.h(sDeviceAnalysisWizardPrivacy, "sDeviceAnalysisWizardPrivacy");
        TextView tvDescriptionDeviceAnalysisWizardPrivacy = gdprPrivacySettings.j3().f12258s;
        AbstractC3292y.h(tvDescriptionDeviceAnalysisWizardPrivacy, "tvDescriptionDeviceAnalysisWizardPrivacy");
        gdprPrivacySettings.w3(sDeviceAnalysisWizardPrivacy, tvDescriptionDeviceAnalysisWizardPrivacy, z8);
        gdprPrivacySettings.u3();
        if (!gdprPrivacySettings.j3().f12251l.isChecked()) {
            gdprPrivacySettings.j3().f12239C.setVisibility(0);
        } else {
            gdprPrivacySettings.j3().f12239C.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(GdprPrivacySettings gdprPrivacySettings, View view) {
        if (!gdprPrivacySettings.isFinishing()) {
            C3788m c3788m = new C3788m();
            String string = gdprPrivacySettings.getString(R.string.url_contact);
            AbstractC3292y.h(string, "getString(...)");
            C3788m.r(c3788m, gdprPrivacySettings, string, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(GdprPrivacySettings gdprPrivacySettings, View view) {
        new C3774G().a(gdprPrivacySettings, true);
        new C3774G().b(false);
        gdprPrivacySettings.j3().f12251l.setChecked(true);
        gdprPrivacySettings.j3().f12250k.setChecked(true);
        gdprPrivacySettings.j3().f12252m.setChecked(true);
        gdprPrivacySettings.t3();
        gdprPrivacySettings.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(GdprPrivacySettings gdprPrivacySettings, View view) {
        gdprPrivacySettings.u3();
        gdprPrivacySettings.j3().f12251l.setChecked(false);
        gdprPrivacySettings.j3().f12250k.setChecked(false);
        gdprPrivacySettings.j3().f12252m.setChecked(false);
    }

    private final void s3() {
        ChoiceCmp.forceDisplayUI(this);
        ChoiceCmp.showUSRegulationScreen(this);
    }

    private final void t3() {
        boolean isChecked = j3().f12252m.isChecked();
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        if (aVar.P(this) != isChecked) {
            aVar.y0(this, isChecked);
        }
        boolean isChecked2 = j3().f12250k.isChecked();
        if (aVar.L(this) != isChecked2) {
            aVar.s0(this, isChecked2);
        }
        boolean isChecked3 = j3().f12251l.isChecked();
        if (aVar.j0(this) != isChecked3) {
            aVar.b1(this, isChecked3);
        }
        C3795t c3795t = new C3795t(this);
        if (aVar.j0(this)) {
            UptodownApp.a aVar2 = UptodownApp.f29249C;
            UptodownApp.a.M0(aVar2, this, false, 2, null);
            aVar2.K(this);
            c3795t.b();
            setResult(-1);
            return;
        }
        setResult(0);
    }

    private final void u3() {
        if (j3().f12255p.getVisibility() == 0) {
            j3().f12253n.setText(R.string.save_gdpr);
            j3().f12253n.setOnClickListener(new View.OnClickListener() { // from class: F4.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GdprPrivacySettings.v3(GdprPrivacySettings.this, view);
                }
            });
            j3().f12255p.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(GdprPrivacySettings gdprPrivacySettings, View view) {
        gdprPrivacySettings.t3();
        gdprPrivacySettings.finish();
    }

    private final void w3(SwitchCompat switchCompat, TextView textView, boolean z8) {
        if (z8) {
            switchCompat.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
            textView.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
        } else {
            switchCompat.setTextColor(ContextCompat.getColor(this, R.color.main_light_grey));
            textView.setTextColor(ContextCompat.getColor(this, R.color.main_light_grey));
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(j3().getRoot());
        j3().f12241b.setOnClickListener(new View.OnClickListener() { // from class: F4.S
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdprPrivacySettings.k3(GdprPrivacySettings.this, view);
            }
        });
        TextView textView = j3().f12261v;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        j3().f12238B.setTypeface(aVar.u());
        j3().f12254o.setTypeface(aVar.v());
        j3().f12264y.setTypeface(aVar.u());
        j3().f12258s.setTypeface(aVar.v());
        j3().f12263x.setTypeface(aVar.u());
        j3().f12257r.setTypeface(aVar.v());
        j3().f12265z.setTypeface(aVar.u());
        j3().f12259t.setTypeface(aVar.v());
        j3().f12262w.setTypeface(aVar.u());
        j3().f12256q.setTypeface(aVar.v());
        j3().f12237A.setTypeface(aVar.u());
        j3().f12260u.setTypeface(aVar.v());
        j3().f12253n.setTypeface(aVar.u());
        j3().f12255p.setTypeface(aVar.u());
        j3().f12239C.setText("⚠ " + getString(R.string.tracking_disabled_warning_gdpr) + " ⚠");
        j3().f12239C.setTypeface(aVar.v());
        SwitchCompat switchCompat = j3().f12250k;
        SettingsPreferences.a aVar2 = SettingsPreferences.f30529b;
        switchCompat.setChecked(aVar2.L(this));
        j3().f12252m.setChecked(aVar2.P(this));
        j3().f12251l.setChecked(aVar2.j0(this));
        if (aVar2.U(this)) {
            SwitchCompat sAnalyticsWizardPrivacy = j3().f12250k;
            AbstractC3292y.h(sAnalyticsWizardPrivacy, "sAnalyticsWizardPrivacy");
            TextView tvDescriptionAnalyticsWizardPrivacy = j3().f12257r;
            AbstractC3292y.h(tvDescriptionAnalyticsWizardPrivacy, "tvDescriptionAnalyticsWizardPrivacy");
            w3(sAnalyticsWizardPrivacy, tvDescriptionAnalyticsWizardPrivacy, j3().f12250k.isChecked());
            SwitchCompat sErrorLogWizardPrivacy = j3().f12252m;
            AbstractC3292y.h(sErrorLogWizardPrivacy, "sErrorLogWizardPrivacy");
            TextView tvDescriptionErrorLogWizardPrivacy = j3().f12259t;
            AbstractC3292y.h(tvDescriptionErrorLogWizardPrivacy, "tvDescriptionErrorLogWizardPrivacy");
            w3(sErrorLogWizardPrivacy, tvDescriptionErrorLogWizardPrivacy, j3().f12252m.isChecked());
            SwitchCompat sDeviceAnalysisWizardPrivacy = j3().f12251l;
            AbstractC3292y.h(sDeviceAnalysisWizardPrivacy, "sDeviceAnalysisWizardPrivacy");
            TextView tvDescriptionDeviceAnalysisWizardPrivacy = j3().f12258s;
            AbstractC3292y.h(tvDescriptionDeviceAnalysisWizardPrivacy, "tvDescriptionDeviceAnalysisWizardPrivacy");
            w3(sDeviceAnalysisWizardPrivacy, tvDescriptionDeviceAnalysisWizardPrivacy, j3().f12251l.isChecked());
        } else {
            SwitchCompat sAnalyticsWizardPrivacy2 = j3().f12250k;
            AbstractC3292y.h(sAnalyticsWizardPrivacy2, "sAnalyticsWizardPrivacy");
            TextView tvDescriptionAnalyticsWizardPrivacy2 = j3().f12257r;
            AbstractC3292y.h(tvDescriptionAnalyticsWizardPrivacy2, "tvDescriptionAnalyticsWizardPrivacy");
            w3(sAnalyticsWizardPrivacy2, tvDescriptionAnalyticsWizardPrivacy2, true);
            SwitchCompat sErrorLogWizardPrivacy2 = j3().f12252m;
            AbstractC3292y.h(sErrorLogWizardPrivacy2, "sErrorLogWizardPrivacy");
            TextView tvDescriptionErrorLogWizardPrivacy2 = j3().f12259t;
            AbstractC3292y.h(tvDescriptionErrorLogWizardPrivacy2, "tvDescriptionErrorLogWizardPrivacy");
            w3(sErrorLogWizardPrivacy2, tvDescriptionErrorLogWizardPrivacy2, true);
            SwitchCompat sDeviceAnalysisWizardPrivacy2 = j3().f12251l;
            AbstractC3292y.h(sDeviceAnalysisWizardPrivacy2, "sDeviceAnalysisWizardPrivacy");
            TextView tvDescriptionDeviceAnalysisWizardPrivacy2 = j3().f12258s;
            AbstractC3292y.h(tvDescriptionDeviceAnalysisWizardPrivacy2, "tvDescriptionDeviceAnalysisWizardPrivacy");
            w3(sDeviceAnalysisWizardPrivacy2, tvDescriptionDeviceAnalysisWizardPrivacy2, true);
            j3().f12250k.setChecked(true);
            j3().f12252m.setChecked(true);
            j3().f12251l.setChecked(true);
        }
        if (!j3().f12251l.isChecked()) {
            j3().f12239C.setVisibility(0);
        } else {
            j3().f12239C.setVisibility(8);
        }
        j3().f12250k.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: F4.T
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                GdprPrivacySettings.l3(GdprPrivacySettings.this, compoundButton, z8);
            }
        });
        j3().f12252m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: F4.U
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                GdprPrivacySettings.m3(GdprPrivacySettings.this, compoundButton, z8);
            }
        });
        j3().f12243d.setOnClickListener(new View.OnClickListener() { // from class: F4.V
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdprPrivacySettings.n3(GdprPrivacySettings.this, view);
            }
        });
        j3().f12251l.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: F4.W
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                GdprPrivacySettings.o3(GdprPrivacySettings.this, compoundButton, z8);
            }
        });
        j3().f12248i.setOnClickListener(new View.OnClickListener() { // from class: F4.X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdprPrivacySettings.p3(GdprPrivacySettings.this, view);
            }
        });
        j3().f12253n.setOnClickListener(new View.OnClickListener() { // from class: F4.Y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdprPrivacySettings.q3(GdprPrivacySettings.this, view);
            }
        });
        j3().f12255p.setOnClickListener(new View.OnClickListener() { // from class: F4.Z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdprPrivacySettings.r3(GdprPrivacySettings.this, view);
            }
        });
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        if (!aVar.U(this)) {
            aVar.D0(this, true);
            aVar.s0(this, true);
            aVar.y0(this, true);
            aVar.b1(this, true);
        }
    }
}
