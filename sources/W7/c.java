package W7;

import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class c implements j {
    @Override // W7.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public S7.e a(String jsonString) {
        AbstractC3292y.i(jsonString, "jsonString");
        try {
            JSONObject coreUiLabels = new JSONObject(jsonString).getJSONObject("coreUiLabels");
            String optString = coreUiLabels.optString("initScreenTitle");
            AbstractC3292y.h(optString, "coreUiLabels.optString(\"initScreenTitle\")");
            String optString2 = coreUiLabels.optString("agreeButton");
            AbstractC3292y.h(optString2, "coreUiLabels.optString(\"agreeButton\")");
            String optString3 = coreUiLabels.optString("agreeAllButton");
            AbstractC3292y.h(optString3, "coreUiLabels.optString(\"agreeAllButton\")");
            String optString4 = coreUiLabels.optString("initScreenRejectButton");
            AbstractC3292y.h(optString4, "coreUiLabels.optString(\"initScreenRejectButton\")");
            String optString5 = coreUiLabels.optString("initScreenSettingsButton");
            AbstractC3292y.h(optString5, "coreUiLabels.optString(\"initScreenSettingsButton\")");
            AbstractC3292y.h(coreUiLabels, "coreUiLabels");
            List b9 = i.b(coreUiLabels, "summaryScreenBodyNoRejectService");
            List b10 = i.b(coreUiLabels, "summaryScreenBodyNoRejectGlobal");
            List b11 = i.b(coreUiLabels, "summaryScreenBodyNoRejectGroup");
            List b12 = i.b(coreUiLabels, "summaryScreenBodyRejectService");
            List b13 = i.b(coreUiLabels, "summaryScreenBodyRejectGlobal");
            List b14 = i.b(coreUiLabels, "summaryScreenBodyRejectGroup");
            String optString6 = coreUiLabels.optString("initScreenBodyGlobal");
            AbstractC3292y.h(optString6, "coreUiLabels.optString(\"initScreenBodyGlobal\")");
            String optString7 = coreUiLabels.optString("initScreenBodyService");
            AbstractC3292y.h(optString7, "coreUiLabels.optString(\"initScreenBodyService\")");
            String optString8 = coreUiLabels.optString("initScreenBodyGroup");
            AbstractC3292y.h(optString8, "coreUiLabels.optString(\"initScreenBodyGroup\")");
            String optString9 = coreUiLabels.optString("specialPurposesAndFeatures");
            AbstractC3292y.h(optString9, "coreUiLabels.optString(\"…cialPurposesAndFeatures\")");
            String optString10 = coreUiLabels.optString("saveAndExitButton");
            AbstractC3292y.h(optString10, "coreUiLabels.optString(\"saveAndExitButton\")");
            String optString11 = coreUiLabels.optString("purposeScreenVendorLink");
            AbstractC3292y.h(optString11, "coreUiLabels.optString(\"purposeScreenVendorLink\")");
            String optString12 = coreUiLabels.optString("legitimateInterestLink");
            AbstractC3292y.h(optString12, "coreUiLabels.optString(\"legitimateInterestLink\")");
            String optString13 = coreUiLabels.optString("specialPurposesLabel");
            AbstractC3292y.h(optString13, "coreUiLabels.optString(\"specialPurposesLabel\")");
            String optString14 = coreUiLabels.optString("specialFeaturesLabel");
            AbstractC3292y.h(optString14, "coreUiLabels.optString(\"specialFeaturesLabel\")");
            String optString15 = coreUiLabels.optString("featuresLabel");
            AbstractC3292y.h(optString15, "coreUiLabels.optString(\"featuresLabel\")");
            String optString16 = coreUiLabels.optString("dataDeclarationLabel");
            AbstractC3292y.h(optString16, "coreUiLabels.optString(\"dataDeclarationLabel\")");
            String optString17 = coreUiLabels.optString("back");
            AbstractC3292y.h(optString17, "coreUiLabels.optString(\"back\")");
            String optString18 = coreUiLabels.optString("onLabel");
            AbstractC3292y.h(optString18, "coreUiLabels.optString(\"onLabel\")");
            String optString19 = coreUiLabels.optString("offLabel");
            AbstractC3292y.h(optString19, "coreUiLabels.optString(\"offLabel\")");
            String optString20 = coreUiLabels.optString("multiLabel");
            AbstractC3292y.h(optString20, "coreUiLabels.optString(\"multiLabel\")");
            String optString21 = coreUiLabels.optString("legalDescription");
            AbstractC3292y.h(optString21, "coreUiLabels.optString(\"legalDescription\")");
            String optString22 = coreUiLabels.optString("showPartners");
            AbstractC3292y.h(optString22, "coreUiLabels.optString(\"showPartners\")");
            String optString23 = coreUiLabels.optString("hidePartners");
            AbstractC3292y.h(optString23, "coreUiLabels.optString(\"hidePartners\")");
            String optString24 = coreUiLabels.optString("vendorScreenBody");
            AbstractC3292y.h(optString24, "coreUiLabels.optString(\"vendorScreenBody\")");
            String optString25 = coreUiLabels.optString("privacyPolicyLabel");
            AbstractC3292y.h(optString25, "coreUiLabels.optString(\"privacyPolicyLabel\")");
            String optString26 = coreUiLabels.optString("descriptionLabel");
            AbstractC3292y.h(optString26, "coreUiLabels.optString(\"descriptionLabel\")");
            String optString27 = coreUiLabels.optString("legitimateScreenBody");
            AbstractC3292y.h(optString27, "coreUiLabels.optString(\"legitimateScreenBody\")");
            String optString28 = coreUiLabels.optString("legitimateInterestPurposesLabel");
            AbstractC3292y.h(optString28, "coreUiLabels.optString(\"…teInterestPurposesLabel\")");
            String optString29 = coreUiLabels.optString("legitimateInterestVendorLabel");
            AbstractC3292y.h(optString29, "coreUiLabels.optString(\"…mateInterestVendorLabel\")");
            String optString30 = coreUiLabels.optString("legitimateScreenObject");
            AbstractC3292y.h(optString30, "coreUiLabels.optString(\"legitimateScreenObject\")");
            String optString31 = coreUiLabels.optString("legitimateScreenObjected");
            AbstractC3292y.h(optString31, "coreUiLabels.optString(\"legitimateScreenObjected\")");
            String optString32 = coreUiLabels.optString("legitimateScreenAccept");
            AbstractC3292y.h(optString32, "coreUiLabels.optString(\"legitimateScreenAccept\")");
            String optString33 = coreUiLabels.optString("objectAllButton");
            AbstractC3292y.h(optString33, "coreUiLabels.optString(\"objectAllButton\")");
            String optString34 = coreUiLabels.optString("persistentConsentLinkLabel");
            AbstractC3292y.h(optString34, "coreUiLabels.optString(\"…sistentConsentLinkLabel\")");
            String optString35 = coreUiLabels.optString("nonIabVendorsNotice");
            AbstractC3292y.h(optString35, "coreUiLabels.optString(\"nonIabVendorsNotice\")");
            String optString36 = coreUiLabels.optString("googlePartners");
            AbstractC3292y.h(optString36, "coreUiLabels.optString(\"googlePartners\")");
            String optString37 = coreUiLabels.optString("purposesLabel");
            AbstractC3292y.h(optString37, "coreUiLabels.optString(\"purposesLabel\")");
            String optString38 = coreUiLabels.optString("cookieMaxAgeLabel");
            AbstractC3292y.h(optString38, "coreUiLabels.optString(\"cookieMaxAgeLabel\")");
            String optString39 = coreUiLabels.optString("daysLabel");
            AbstractC3292y.h(optString39, "coreUiLabels.optString(\"daysLabel\")");
            String optString40 = coreUiLabels.optString("secondsLabel");
            AbstractC3292y.h(optString40, "coreUiLabels.optString(\"secondsLabel\")");
            String optString41 = coreUiLabels.optString("cookieAccessLabel");
            AbstractC3292y.h(optString41, "coreUiLabels.optString(\"cookieAccessLabel\")");
            String optString42 = coreUiLabels.optString("yesLabel");
            AbstractC3292y.h(optString42, "coreUiLabels.optString(\"yesLabel\")");
            String optString43 = coreUiLabels.optString("noLabel");
            AbstractC3292y.h(optString43, "coreUiLabels.optString(\"noLabel\")");
            String optString44 = coreUiLabels.optString("storageDisclosureLabel");
            AbstractC3292y.h(optString44, "coreUiLabels.optString(\"storageDisclosureLabel\")");
            return new S7.e(optString, optString2, optString3, optString4, optString5, b9, b10, b11, b12, b13, b14, optString6, optString7, optString8, optString9, optString10, optString11, optString12, optString13, optString14, optString15, optString16, optString17, optString18, optString19, optString20, optString21, optString22, optString23, optString24, optString25, optString26, optString27, optString28, optString29, optString30, optString31, optString32, optString33, optString34, optString35, optString36, optString37, optString38, optString39, optString40, optString41, optString42, optString43, optString44);
        } catch (JSONException unused) {
            return new S7.e(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 262143);
        }
    }
}
