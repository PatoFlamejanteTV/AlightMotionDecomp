package M7;

import com.mbridge.msdk.c.h;

/* loaded from: classes5.dex */
public enum c {
    SITE_ID("idsite"),
    RECORD("rec"),
    URL_PATH("url"),
    ACTION_NAME("action_name"),
    VISITOR_ID("_id"),
    RANDOM_NUMBER("rand"),
    API_VERSION("apiv"),
    REFERRER("urlref"),
    VISIT_SCOPE_CUSTOM_VARIABLES("_cvar"),
    TOTAL_NUMBER_OF_VISITS("_idvc"),
    PREVIOUS_VISIT_TIMESTAMP("_viewts"),
    FIRST_VISIT_TIMESTAMP("_idts"),
    CAMPAIGN_NAME("_rcn"),
    CAMPAIGN_KEYWORD("_rck"),
    SCREEN_RESOLUTION("res"),
    HOURS(h.f19256a),
    MINUTES("m"),
    SECONDS("s"),
    USER_AGENT("ua"),
    LANGUAGE("lang"),
    USER_ID("uid"),
    SESSION_START("new_visit"),
    SCREEN_SCOPE_CUSTOM_VARIABLES("cvar"),
    LINK("link"),
    DOWNLOAD("download"),
    SEARCH_KEYWORD("search"),
    SEARCH_CATEGORY("search_cat"),
    SEARCH_NUMBER_OF_HITS("search_count"),
    GOAL_ID("idgoal"),
    REVENUE("revenue"),
    DATETIME_OF_REQUEST("cdt"),
    CONTENT_NAME("c_n"),
    CONTENT_PIECE("c_p"),
    CONTENT_TARGET("c_t"),
    CONTENT_INTERACTION("c_i"),
    EVENT_CATEGORY("e_c"),
    EVENT_ACTION("e_a"),
    EVENT_NAME("e_n"),
    EVENT_VALUE("e_v"),
    ECOMMERCE_ITEMS("ec_items"),
    TAX("ec_tx"),
    ORDER_ID("ec_id"),
    SHIPPING("ec_sh"),
    DISCOUNT("ec_dt"),
    SUBTOTAL("ec_st"),
    SEND_IMAGE("send_image");


    /* renamed from: a, reason: collision with root package name */
    private final String f6292a;

    c(String str) {
        this.f6292a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f6292a;
    }
}
