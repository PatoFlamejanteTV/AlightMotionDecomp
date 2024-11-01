package com.inmobi.cmp.model;

/* loaded from: classes4.dex */
public enum ChoiceError {
    NO_CONNECTION("No connection found to load CMP"),
    ACTIVITY_ERROR("Your launcher activity should extends from AppCompatActivity"),
    INVALID_PCODE("Given pCode is invalid"),
    UNKNOWN_CONFIG("Could not find configuration for this packageId. Have you set it up in Inmobi Choice web portal?"),
    MISSING_INITIALIZATION("SDK must be initialized first by calling startChoice method"),
    NETWORK_CALL_FAILED("An error has occurred when CMP tried to execute a network call"),
    INVALID_JSON_FORMAT("An invalid json format has been found when CMP tried to read the data"),
    FAILED_LOGO_DOWNLOAD("Couldn't load publisher logo, url is empty or it doesn't return an image"),
    TC_MODEL_PROPERTY_ERROR("An error has occurred when a TCModel property was tried to be set"),
    INVALID_STYLE_SHEET("Couldn't load style json file"),
    GEO_IP_UNEXPECTED_ERROR("An unexpected value was received from GeoIp service"),
    NETWORK_UNEXPECTED_ERROR("An unexpected error has occurred when CMP tried to do a network call"),
    NETWORK_FILE_NOT_FOUND_ERROR("FileNotFoundException has been captured when CMP tried to do a network call"),
    ENCODE_NUM_BIT_ERROR("The value is too large to be encode into the number of bits passed"),
    ENCODE_INVALID_BIT_LENGTH("Invalid bit length"),
    INVALID_URL("An invalid URL has been passed"),
    INVALID_LOCATION("This consent is not available for the given country"),
    MISSING_INIT_SCREEN_TEXTS("Init screen texts are missing"),
    GDPR_NA("GDPR is not applicable for this scenario"),
    GBC_NOT_APPLICABLE("Either GBC is not applicable or disabled for the current location"),
    CCPA_NOT_APPLICABLE("CCPA is not enabled"),
    US_PRIVACY_NOT_APPLICABLE("Either US Privacy is not applicable or disabled for the current location"),
    UNEXPECTED_ERROR_OCCURRED("Some unknown error occurred"),
    ERROR_WHILE_SAVING_CONSENT("Some error occurred while saving consent");


    /* renamed from: a, reason: collision with root package name */
    public final String f19086a;

    ChoiceError(String str) {
        this.f19086a = str;
    }

    public final String getMessage() {
        return this.f19086a;
    }
}
