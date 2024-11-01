package I6;

import A1.j;
import R5.AbstractC1435t;
import kotlin.jvm.internal.AbstractC3292y;
import z1.AbstractC4265e;

/* loaded from: classes5.dex */
public final class b extends e {
    @Override // I6.e
    public String b(H6.b field) {
        AbstractC3292y.i(field, "field");
        switch (field) {
            case SharingNotice:
                String SHARING_NOTICE = AbstractC4265e.f41389b;
                AbstractC3292y.h(SHARING_NOTICE, "SHARING_NOTICE");
                return SHARING_NOTICE;
            case SaleOptOutNotice:
                String SALE_OPT_OUT_NOTICE = AbstractC4265e.f41390c;
                AbstractC3292y.h(SALE_OPT_OUT_NOTICE, "SALE_OPT_OUT_NOTICE");
                return SALE_OPT_OUT_NOTICE;
            case SharingOptOutNotice:
            case SensitiveDataProcessingOptOutNotice:
            case SensitiveDataLimitUseNotice:
            case SharingOptOut:
            case PersonalDataConsents:
            default:
                return "";
            case TargetedAdvertisingOptOutNotice:
                String TARGETED_ADVERTISING_OPT_OUT_NOTICE = AbstractC4265e.f41391d;
                AbstractC3292y.h(TARGETED_ADVERTISING_OPT_OUT_NOTICE, "TARGETED_ADVERTISING_OPT_OUT_NOTICE");
                return TARGETED_ADVERTISING_OPT_OUT_NOTICE;
            case SaleOptOut:
                String SALE_OPT_OUT = AbstractC4265e.f41392e;
                AbstractC3292y.h(SALE_OPT_OUT, "SALE_OPT_OUT");
                return SALE_OPT_OUT;
            case TargetedAdvertisingOptOut:
                String TARGETED_ADVERTISING_OPT_OUT = AbstractC4265e.f41393f;
                AbstractC3292y.h(TARGETED_ADVERTISING_OPT_OUT, "TARGETED_ADVERTISING_OPT_OUT");
                return TARGETED_ADVERTISING_OPT_OUT;
            case SensitiveDataProcessing:
                String SENSITIVE_DATA_PROCESSING = AbstractC4265e.f41394g;
                AbstractC3292y.h(SENSITIVE_DATA_PROCESSING, "SENSITIVE_DATA_PROCESSING");
                return SENSITIVE_DATA_PROCESSING;
            case KnownChildSensitiveDataConsents:
                String KNOWN_CHILD_SENSITIVE_DATA_CONSENTS = AbstractC4265e.f41395h;
                AbstractC3292y.h(KNOWN_CHILD_SENSITIVE_DATA_CONSENTS, "KNOWN_CHILD_SENSITIVE_DATA_CONSENTS");
                return KNOWN_CHILD_SENSITIVE_DATA_CONSENTS;
            case MspaCoveredTransaction:
                String MSPA_COVERED_TRANSACTION = AbstractC4265e.f41396i;
                AbstractC3292y.h(MSPA_COVERED_TRANSACTION, "MSPA_COVERED_TRANSACTION");
                return MSPA_COVERED_TRANSACTION;
            case MspaOptOutOptionMode:
                String MSPA_OPT_OUT_OPTION_MODE = AbstractC4265e.f41397j;
                AbstractC3292y.h(MSPA_OPT_OUT_OPTION_MODE, "MSPA_OPT_OUT_OPTION_MODE");
                return MSPA_OPT_OUT_OPTION_MODE;
            case MspaServiceProviderMode:
                String MSPA_SERVICE_PROVIDER_MODE = AbstractC4265e.f41398k;
                AbstractC3292y.h(MSPA_SERVICE_PROVIDER_MODE, "MSPA_SERVICE_PROVIDER_MODE");
                return MSPA_SERVICE_PROVIDER_MODE;
        }
    }

    @Override // I6.e
    public void d(H6.b field, boolean z8) {
        int i8;
        AbstractC3292y.i(field, "field");
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(field, Integer.valueOf(i8));
        this.f3805d.setKnownChildSensitiveDataConsents(AbstractC1435t.e(Integer.valueOf(i8)));
    }

    @Override // I6.e
    public String g() {
        String NAME = j.f126f;
        AbstractC3292y.h(NAME, "NAME");
        return NAME;
    }

    @Override // I6.e
    public int i() {
        return j.f124d;
    }

    @Override // I6.e
    public void f(boolean z8) {
    }

    @Override // I6.e
    public void h(boolean z8) {
    }

    @Override // I6.e
    public void k(boolean z8) {
    }
}
