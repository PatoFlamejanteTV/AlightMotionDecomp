package F5;

import Q5.x;
import R5.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2694a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2695b = Q.k(x.a(D5.c.CMPID, 12), x.a(D5.c.CMPVERSION, 12), x.a(D5.c.CONSENTLANGUAGE, 12), x.a(D5.c.CONSENTSCREEN, 6), x.a(D5.c.CREATED, 36), x.a(D5.c.ISSERVICESPECIFIC, 1), x.a(D5.c.LASTUPDATED, 36), x.a(D5.c.POLICYVERSION, 6), x.a(D5.c.PUBLISHERCOUNTRYCODE, 12), x.a(D5.c.PUBLISHERLEGITIMATEINTERESTS, 24), x.a(D5.c.PUBLISHERCONSENTS, 24), x.a(D5.c.PUBLISHERRESTRICTIONS, 36), x.a(D5.c.PURPOSECONSENTS, 24), x.a(D5.c.PURPOSELEGITIMATEINTERESTS, 24), x.a(D5.c.PURPOSEONETREATMENT, 1), x.a(D5.c.SPECIALFEATUREOPTIONS, 12), x.a(D5.c.USENONSTANDARDSTACKS, 1), x.a(D5.c.VENDORCONSENTS, 24), x.a(D5.c.VENDORLEGITIMATEINTERESTS, 24), x.a(D5.c.VENDORLISTVERSION, 12), x.a(D5.c.VERSION, 6));

    /* renamed from: c, reason: collision with root package name */
    public static final Map f2696c = Q.k(x.a(d.ANY_BOOLEAN, 1), x.a(d.ENCODING_TYPE, 1), x.a(d.MAX_ID, 16), x.a(d.NUM_CUSTOM_PURPOSES, 6), x.a(d.NUM_ENTRIES, 12), x.a(d.NUM_RESTRICTIONS, 12), x.a(d.PURPOSE_ID, 6), x.a(d.RESTRICTION_TYPE, 2), x.a(d.SEGMENT_TYPE, 3), x.a(d.SINGLE_OR_RANGE, 1), x.a(d.VENDOR_ID, 16));

    /* renamed from: d, reason: collision with root package name */
    public static final Map f2697d = Q.k(x.a("cmpId", 12), x.a("cmpVersion", 12), x.a("consentLanguage", 12), x.a("consentScreen", 6), x.a("created", 36), x.a("isServiceSpecific", 1), x.a("lastUpdated", 36), x.a("policyVersion", 6), x.a("publisherCountryCode", 12), x.a("publisherLegitimateInterests", 24), x.a("publisherConsents", 24), x.a("publisherRestrictions", 36), x.a("purposeConsents", 24), x.a("purposeLegitimateInterests", 24), x.a("purposeOneTreatment", 1), x.a("specialFeatureOptions", 12), x.a("useNonStandardStacks", 1), x.a("vendorListVersion", 12), x.a("vendorConsents", 24), x.a("vendorLegitimateInterests", 24), x.a("version", 6), x.a("anyBoolean", 1), x.a("encodingType", 1), x.a("maxId", 16), x.a("numCustomPurposes", 6), x.a("numEntries", 12), x.a("numRestrictions", 12), x.a("purposeId", 6), x.a("restrictionType", 2), x.a("segmentType", 3), x.a("singleOrRange", 1), x.a("vendorId", 16));

    public final Integer a(d key) {
        AbstractC3292y.i(key, "key");
        return (Integer) f2696c.get(key);
    }

    public final Integer b(String key) {
        AbstractC3292y.i(key, "key");
        return (Integer) f2697d.get(key);
    }
}
