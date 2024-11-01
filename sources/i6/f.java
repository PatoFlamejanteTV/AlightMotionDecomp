package I6;

import A1.m;
import R5.AbstractC1435t;
import kotlin.jvm.internal.AbstractC3292y;
import z1.i;

/* loaded from: classes5.dex */
public final class f extends e {
    @Override // I6.e
    public String b(H6.b field) {
        AbstractC3292y.i(field, "field");
        switch (field) {
            case SharingNotice:
                String SHARING_NOTICE = i.f41448b;
                AbstractC3292y.h(SHARING_NOTICE, "SHARING_NOTICE");
                return SHARING_NOTICE;
            case SaleOptOutNotice:
                String SALE_OPT_OUT_NOTICE = i.f41449c;
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
                String TARGETED_ADVERTISING_OPT_OUT_NOTICE = i.f41450d;
                AbstractC3292y.h(TARGETED_ADVERTISING_OPT_OUT_NOTICE, "TARGETED_ADVERTISING_OPT_OUT_NOTICE");
                return TARGETED_ADVERTISING_OPT_OUT_NOTICE;
            case SaleOptOut:
                String SALE_OPT_OUT = i.f41451e;
                AbstractC3292y.h(SALE_OPT_OUT, "SALE_OPT_OUT");
                return SALE_OPT_OUT;
            case TargetedAdvertisingOptOut:
                String TARGETED_ADVERTISING_OPT_OUT = i.f41452f;
                AbstractC3292y.h(TARGETED_ADVERTISING_OPT_OUT, "TARGETED_ADVERTISING_OPT_OUT");
                return TARGETED_ADVERTISING_OPT_OUT;
            case SensitiveDataProcessing:
                String SENSITIVE_DATA_PROCESSING = i.f41453g;
                AbstractC3292y.h(SENSITIVE_DATA_PROCESSING, "SENSITIVE_DATA_PROCESSING");
                return SENSITIVE_DATA_PROCESSING;
            case KnownChildSensitiveDataConsents:
                String KNOWN_CHILD_SENSITIVE_DATA_CONSENTS = i.f41454h;
                AbstractC3292y.h(KNOWN_CHILD_SENSITIVE_DATA_CONSENTS, "KNOWN_CHILD_SENSITIVE_DATA_CONSENTS");
                return KNOWN_CHILD_SENSITIVE_DATA_CONSENTS;
            case MspaCoveredTransaction:
                String MSPA_COVERED_TRANSACTION = i.f41455i;
                AbstractC3292y.h(MSPA_COVERED_TRANSACTION, "MSPA_COVERED_TRANSACTION");
                return MSPA_COVERED_TRANSACTION;
            case MspaOptOutOptionMode:
                String MSPA_OPT_OUT_OPTION_MODE = i.f41456j;
                AbstractC3292y.h(MSPA_OPT_OUT_OPTION_MODE, "MSPA_OPT_OUT_OPTION_MODE");
                return MSPA_OPT_OUT_OPTION_MODE;
            case MspaServiceProviderMode:
                String MSPA_SERVICE_PROVIDER_MODE = i.f41457k;
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
        String NAME = m.f138f;
        AbstractC3292y.h(NAME, "NAME");
        return NAME;
    }

    @Override // I6.e
    public int i() {
        return m.f136d;
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
