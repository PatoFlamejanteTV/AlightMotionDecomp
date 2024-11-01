package I5;

import D5.s;
import U7.u;
import androidx.lifecycle.ViewModel;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class l extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final s f3791a;

    /* renamed from: b, reason: collision with root package name */
    public final J6.f f3792b;

    /* renamed from: c, reason: collision with root package name */
    public final D5.e f3793c;

    /* renamed from: d, reason: collision with root package name */
    public final G6.l f3794d;

    /* renamed from: e, reason: collision with root package name */
    public final u f3795e;

    /* renamed from: f, reason: collision with root package name */
    public final U7.e f3796f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3797g;

    /* renamed from: h, reason: collision with root package name */
    public final S7.g f3798h;

    /* renamed from: i, reason: collision with root package name */
    public final L5.c f3799i;

    /* renamed from: j, reason: collision with root package name */
    public final U7.i f3800j;

    public l(s tcModel, J6.f portalConfig, D5.e googleVendorList, G6.l lVar, u portalConfigRepository, U7.e consentRepository, boolean z8, S7.g initScreen, L5.c gbcPurposeResponse, U7.i gbcConsentRepository) {
        AbstractC3292y.i(tcModel, "tcModel");
        AbstractC3292y.i(portalConfig, "portalConfig");
        AbstractC3292y.i(googleVendorList, "googleVendorList");
        AbstractC3292y.i(portalConfigRepository, "portalConfigRepository");
        AbstractC3292y.i(consentRepository, "consentRepository");
        AbstractC3292y.i(initScreen, "initScreen");
        AbstractC3292y.i(gbcPurposeResponse, "gbcPurposeResponse");
        AbstractC3292y.i(gbcConsentRepository, "gbcConsentRepository");
        this.f3791a = tcModel;
        this.f3792b = portalConfig;
        this.f3793c = googleVendorList;
        this.f3794d = lVar;
        this.f3795e = portalConfigRepository;
        this.f3796f = consentRepository;
        this.f3797g = z8;
        this.f3798h = initScreen;
        this.f3799i = gbcPurposeResponse;
        this.f3800j = gbcConsentRepository;
    }

    public final void a() {
        String str = this.f3792b.f4497b.f4444I;
        if (str != null) {
            PrivacyEncodingMode privacyEncodingMode = PrivacyEncodingMode.GPP;
            if (str.equals(privacyEncodingMode.getValue())) {
                this.f3796f.a(privacyEncodingMode, true);
                return;
            }
        }
        String str2 = this.f3792b.f4497b.f4444I;
        if (str2 != null) {
            PrivacyEncodingMode privacyEncodingMode2 = PrivacyEncodingMode.TCF;
            if (str2.equals(privacyEncodingMode2.getValue())) {
                this.f3796f.a(privacyEncodingMode2, true);
                return;
            }
        }
        this.f3796f.a(PrivacyEncodingMode.TCF_AND_GPP, true);
    }
}
