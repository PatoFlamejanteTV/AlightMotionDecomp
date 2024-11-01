package com.inmobi.cmp;

import com.inmobi.cmp.core.model.ACData;
import com.inmobi.cmp.core.model.GDPRData;
import com.inmobi.cmp.core.model.gbc.GoogleBasicConsents;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.model.ChoiceError;
import com.inmobi.cmp.model.NonIABData;
import com.inmobi.cmp.model.PingReturn;

/* loaded from: classes4.dex */
public interface ChoiceCmpCallback {
    void onCCPAConsentGiven(String str);

    void onCmpError(ChoiceError choiceError);

    void onCmpLoaded(PingReturn pingReturn);

    void onCmpUIShown(PingReturn pingReturn);

    void onGoogleBasicConsentChange(GoogleBasicConsents googleBasicConsents);

    void onGoogleVendorConsentGiven(ACData aCData);

    void onIABVendorConsentGiven(GDPRData gDPRData);

    void onNonIABVendorConsentGiven(NonIABData nonIABData);

    void onReceiveUSRegulationsConsent(USRegulationData uSRegulationData);

    void onUserMovedToOtherState();
}
